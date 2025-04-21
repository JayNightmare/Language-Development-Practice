import os
from FSObject import FSObject

class FileCollection:
    def __init__(self, root_path):
        self.root_path = root_path.strip('"')
        self.files = []
        self._scan_directory(self.root_path)

    def _scan_directory(self, path):
        try:
            for entry in os.scandir(path):
                fs_object = FSObject(entry)
                self.files.append(fs_object)
                if fs_object.is_dir:
                    self._scan_directory(entry.path)
        except PermissionError:
            print(f"Permission denied: {path}")
        except Exception as e:
            print(f"Error scanning {path}: {e}")

    def apply(self, selector):
        result = FileCollection(self.root_path)
        # First apply the filter
        result.files = [f for f in self.files if selector(f)]
        
        # Then apply sorting if specified
        if selector.sort_key is not None:
            result.files.sort(key=selector.sort_key, reverse=selector.reverse)
            
        # Finally apply limit if specified
        if selector.limit is not None:
            result.files = result.files[:selector.limit]
            
        return result

    def list(self):
        for file in self.files:
            print(f"{file.name} ({file.size} bytes, modified: {file.mtime_str})")
