import os
from datetime import datetime

class FSObject:
    def __init__(self, entry):
        self.name = entry.name
        self.path = entry.path
        stat = entry.stat()
        self.size = stat.st_size
        self.mtime = stat.st_mtime
        self.is_dir = entry.is_dir()
        self.mtime_str = datetime.fromtimestamp(self.mtime).strftime('%Y-%m-%d %H:%M:%S')

    def __str__(self):
        return f"{self.name} ({self.size} bytes, modified: {self.mtime_str})"

    def __repr__(self):
        return self.__str__()
