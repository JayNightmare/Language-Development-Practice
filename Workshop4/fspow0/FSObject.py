#   FSObject.py
#   version 1

"""
Represents a file or directory.  
"""

from pathlib import Path

"""
Change history
--------------
Note: this doesn't include additions - just changes to existing code

18/03/21
    Removed all attributes except for path; type, name and parent can be
    inferred from path
"""

class FSObject:

    def __init__(self, path:Path=None):
        if path == None:
            self.path = Path()
        else:
            self.path = path

#         print("FSObject intantiated:", self)
    
    
    @property
    def mtime(self):
        """
        The time last modified of object
        """
        return self.path.stat().st_mtime
    
    @property
    def size(self):
        """
        The size in bytes of object
        """
        return self.path.stat().st_size
    

    def rename(self, newName:str=""):
        """
        Not yet implemented
        """
#         strip newName of illegal file or dir name characters
#         trim it
#         if we have anything left
#             if an object in the file system with this name already exists
#                 do something or other to make the new name unique
#             else {no name clash}
#                 ok to proceed = true
#             if ok to proceed, do the renaming
#         else {nothing left}
#             warning >stderr
#             noop
        pass

    def __str__(self):
        return str(self.path)