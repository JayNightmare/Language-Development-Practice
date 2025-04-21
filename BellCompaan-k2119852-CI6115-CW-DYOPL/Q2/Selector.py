import os
import re
from datetime import datetime, timedelta

class Selector:
    def __init__(self, filter_func=None):
        self.filter_func = filter_func if filter_func else lambda x: True

    @staticmethod
    def name(pattern):
        def name_filter(fs_object):
            try:
                # Convert glob pattern to regex pattern
                pattern_str = pattern.strip('"')
                pattern_str = pattern_str.replace(".", "\\.")
                pattern_str = pattern_str.replace("*", ".*")
                return re.match(pattern_str, fs_object.name) is not None
            except re.error:
                print(f"Warning: Invalid regex pattern '{pattern}'")
                return False
        return Selector(name_filter)

    @staticmethod
    def size(condition):
        def parse_size(size_str):
            units = {'B': 1, 'K': 1024, 'M': 1024*1024, 'G': 1024*1024*1024}
            size_str = size_str.strip('"')
            match = re.match(r'([<>])\s*(\d+)\s*([BKMG])', size_str)
            if not match:
                raise ValueError(f"Invalid size condition: {size_str}")
            op, value, unit = match.groups()
            return op, int(value) * units[unit]

        def size_filter(fs_object):
            try:
                op, threshold = parse_size(condition)
                if op == '>':
                    return fs_object.size > threshold
                else:
                    return fs_object.size < threshold
            except ValueError as e:
                print(f"Warning: {e}")
                return False
        return Selector(size_filter)

    @staticmethod
    def date(condition):
        def parse_date(date_str):
            date_str = date_str.strip('"')
            match = re.match(r'([<>])\s*(\d+)\s*(year|month|day)s?', date_str)
            if not match:
                raise ValueError(f"Invalid date condition: {date_str}")
            op, value, unit = match.groups()
            value = int(value)
            now = datetime.now()
            if unit == 'year':
                threshold = now - timedelta(days=365.25 * value)
            elif unit == 'month':
                threshold = now - timedelta(days=30.44 * value)
            else:  # day
                threshold = now - timedelta(days=value)
            return op, threshold

        def date_filter(fs_object):
            try:
                op, threshold = parse_date(condition)
                file_time = datetime.fromtimestamp(fs_object.mtime)
                if op == '>':
                    return file_time < threshold  # older than threshold
                else:
                    return file_time > threshold  # newer than threshold
            except ValueError as e:
                print(f"Warning: {e}")
                return False
        return Selector(date_filter)

    def intersect(self, other):
        def combined_filter(fs_object):
            return self.filter_func(fs_object) and other.filter_func(fs_object)
        return Selector(combined_filter)

    def __call__(self, fs_object):
        try:
            return self.filter_func(fs_object)
        except Exception as e:
            print(f"Warning: Error applying filter: {e}")
            return False

    @staticmethod
    def not_(selector):
        def negated_filter(fs_object):
            return not selector.filter_func(fs_object)
        return Selector(negated_filter)
