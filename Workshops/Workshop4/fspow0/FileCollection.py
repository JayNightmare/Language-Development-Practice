#   FileCollection.py
#   version 1

"""
A FileCollection as used in fspow
"""
from builtins import int

"""
Change history
--------------
Note: this doesn't include additions - just changes to existing code

18/03/21
    Content to contain FSObject objects rather than Path objects.
    Note: up till now, they were a mixture of Path objects and strings
"""


from pathlib import Path
import sys
from .Selector import *
from .FileCollectionIterator import *
from .FSObject import *

class FileCollection:

    # root directory of file collection defaults to current directory
    root = "."
    content = []

    def __init__(self, rootPath:str="."):
        # print("FileCollection instantiated with rootPath =", rootPath)
        """
        A FileCollection object
        """
        """
        if directory specified by rootPath exists
            set root to rootPath
        else
            warning and set to current or parent of rootPath
        """
        potentialRoot = Path(rootPath)
        if potentialRoot.exists():
            if  potentialRoot.is_dir():
                # happy
                self.root = potentialRoot
            else:
                # not a directory
                # set to parent if it's a path, else set to current
                if potentialRoot.parent.is_dir():
                    # parent is a dir so warn and set to that
                    self.root = potentialRoot.parent
                    sys.stderr.write("Warning: " + rootPath + " not a directory - setting file collection root to its parent " + str(self.root) + "\n")
                else: 
                    # can't establish
                    sys.stderr.write("Warning: " + rootPath + " not a directory and cannot establish parent - setting file collection root to current directory\n")
                    # but it's already done, so pass
        else:
            # potential root doesn't exist
            sys.stderr.write("Warning: " + rootPath + " not found - setting file collection root to current directory\n")          
            # and pass  
        # populate content
        self.content = []
        for path in self.root.rglob("*"):
            if path.is_file():
                self.content.append(FSObject(path))
#         self.content = [p for p in Path(self.root).rglob("*")]
        
    def length(self):
        """
        Returns the number of objects in the file collection
        """
        return len(self.content)
    
    def __getitem__(self, index) -> FSObject:
        """
        handle square brackets as if FileCollection object is a list
        """
        if index < len(self.content):
            return self.content[index]
        else:
            return None
        
    def __iter__(self) -> FSObject:
        """
        permit iteration over file collection
        """
        return FileCollectionIterator(self)
        
    def list(self, options=None) -> str:
        """
        Returns a list of the entries in the file collection
        """
        retval = ""
        if options == None:
            # list everything
#             for oneEntry in Path(self.root).rglob("*"):
            for oneEntry in self.content:
                fname = str(oneEntry)
                retval += fname + "\n"                                       
        else:
            #TODO
            pass
        return retval
        

    def getRoot(self) -> str:
        """
        Returns the root of the file collection
        """
        return self.root    

    def apply(self, filter:Selector=None):
#         print("FileCollection.apply() called with filter =", filter)
        """
        Modify the content of the file collection by applying the filter
        """
        numberOfItems = len(self.content)
        i = 0;
        while i < numberOfItems:
            if filter.testFSObject(self.content[i]):
                i += 1
            else:
                self.content.pop(i)
                numberOfItems -= 1

    def copy(self, target:str=""):
        """
        Not yet implemented
        """
        #TODO
        pass

    # v2
    # move, remove, exec
