#   Selector.py
#   version 1

"""
 A filter that can be applied to a FileCollection.
 
 ### Usage
 * Create using the named parameters.  Note, fspow is not currently required to
 handle multiple criteria in a selector.
 * Apply to a FileCollection object by using FileCollection.apply()
 
"""
"""
### Attributes

### Operations
* 'Operators' that act on Selector objects to produce new Selector objects.
#### union
* binary
* Produce the set union of the criteria (apply ||).
* left associative
* This may best be left to v2, thus deferring the need to bother with operator precedence.
#### intersect
* binary
* Produce the set intersection of the criteria (apply &&).
* left associative

### Methods
#### Instantiator — Selector(<criteria>) : Selector
* <criteria> is some sort of expression that would evaluate to Boolean
* Examples:
	* `size("+20M") && name(".txt")`
	* `date(“1-2Y”)`
	* `date("-2Y")`
	* `date(temp)` where temp is an identifier
	* `type("mp3")`
* From examples:
	* Boolean operators
		* &&
		* ||
		* Combinations with ‘not’?  Leave for v2.
	* size(“+20M”) evaluates to true if the file or directory size is greater than 20 MB
		* “+20M” an expression that has itself to be parsed
	* name(“.txt”) evaluates to true if the file name contains string ‘.txt’
		* “.txt” is not a regex
		* Examples of matching names will include “.txtrc”, “a.txt”, “a.txta”
	* date(“1-2Y”) evaluates to true if the file’s or directory’s last modified date (lmd) is between 1 and 2 years ago
		* To be precise about this string:
			* Let today’s date be `<d>/<m>/<y>`
			* Any file with lmd >= `<d>/<m>/<y-2>` will be included if its lmd <= `<d>/<m>/<y-1>`
	* date(“-2Y”) evaluates to true if the file’s or directory’s lmd is no more than 2 years ago (i.e. lmd <= `<d>/<m>/<y-2>`)
	* type(“mp3”) evaluates to true if the FSObject is a file and the last four characters of its name are “.mp3” 


"""

import time
from pathlib import Path, PosixPath
from .FSObject import *

class Selector:
	
	nameContains = None	
	""" for file name """
	olderThan = None	
	""" in days """
	biggerThan = None	
	""" in K """


	def __init__(self, nameContains:str=None, olderThan = None, biggerThan = None):
		self.nameContains = nameContains
		self.olderThan = olderThan
		self.biggerThan = biggerThan
		
		

			
	def testFSObject(self, fsObject:FSObject=None) -> bool:
		"""
		Determine whether the object specified by FSObject meets all the
		criteria in this selector,
		returning True if it does, else false.
		Note: selectors currently only support one criterion
		"""
		if fsObject == None:
			return False
		else:
			# do the tests
			
			# test 1: file name contains nameContains
			if self.nameContains == None:
				pass	# not set
			else:
				if not self.testNameContains(fsObject):
					return False
					
			# test 2: older than olderThan days
			if self.olderThan == None:
				pass	# not set
			else:
				if not self.testOlderThan(fsObject):
					return False
				
			# test 3: larger than biggerThan k
			if self.biggerThan == None:
				pass	# not set
			else:
				if not self.testBiggerThan(fsObject):
					return False
		
		return True


	def testNameContains(self, fso:FSObject) -> bool:
		"""
		test for FSObject fso passing nameContains
		"""
		return fso.path.match("*" + self.nameContains + "*")


	def testOlderThan(self, fso:FSObject) -> bool:
		"""
		test for FSObject fso passing olderThan olderThan days
		"""
		seconds = 86400 * self.olderThan
		return fso.mtime < time.time() - seconds	
	
	def testBiggerThan(self, fso:FSObject) -> bool:
		"""
		test for FSObject fso passing biggerThan for biggerThan K
		"""
		bytes = self.biggerThan * 1024
		return fso.size > bytes		

	def __str__(self):
		retval = "Selector with criteria:\n"
		if self.nameContains != None:
			retval += "nameContains: " + self.nameContains
		if self.olderThan != None:
			retval += "olderThan: " + self.olderThan
		if self.biggerThan != None:
			retval += "biggerThan: " + self.biggerThan
		return retval
       
        
if __name__ == '__main__':
    pass