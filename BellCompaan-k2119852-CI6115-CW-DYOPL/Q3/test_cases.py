import unittest
from FileCollection import FileCollection
from Selector import Selector, TopAttribute
import os
import tempfile
from datetime import datetime, timedelta
import time

class TestFileCollection(unittest.TestCase):
    def setUp(self):
        # Create a temporary directory
        self.test_dir = tempfile.mkdtemp()
        
        # Create test files with different sizes and dates
        self.create_test_files()

    def create_test_files(self):
        # Create files with different sizes
        files = [
            ("small.txt", "small"),
            ("medium.txt", "medium" * 100),
            ("large.txt", "large" * 1000),
            ("huge.txt", "huge" * 10000)
        ]
        
        for name, content in files:
            path = os.path.join(self.test_dir, name)
            with open(path, 'w') as f:
                f.write(content)
            
            # Set different modification times
            mtime = time.time() - (files.index((name, content)) * 86400)  # Each file 1 day apart
            os.utime(path, (mtime, mtime))

    def test_top_by_size(self):
        fc = FileCollection(self.test_dir)
        
        # Test top 2 biggest files
        sel = Selector.top(2, TopAttribute.BIGGEST.value)
        result = fc.apply(sel)
        self.assertEqual(len(result.files), 2)
        self.assertEqual(result.files[0].name, "huge.txt")
        self.assertEqual(result.files[1].name, "large.txt")
        
        # Test top 2 smallest files
        sel = Selector.top(2, TopAttribute.SMALLEST.value)
        result = fc.apply(sel)
        self.assertEqual(len(result.files), 2)
        self.assertEqual(result.files[0].name, "small.txt")
        self.assertEqual(result.files[1].name, "medium.txt")

    def test_top_by_date(self):
        fc = FileCollection(self.test_dir)
        
        # Test top 2 newest files
        sel = Selector.top(2, TopAttribute.NEWEST.value)
        result = fc.apply(sel)
        self.assertEqual(len(result.files), 2)
        self.assertEqual(result.files[0].name, "small.txt")
        self.assertEqual(result.files[1].name, "medium.txt")
        
        # Test top 2 oldest files
        sel = Selector.top(2, TopAttribute.OLDEST.value)
        result = fc.apply(sel)
        self.assertEqual(len(result.files), 2)
        self.assertEqual(result.files[0].name, "huge.txt")
        self.assertEqual(result.files[1].name, "large.txt")

    def test_invalid_attribute(self):
        fc = FileCollection(self.test_dir)
        with self.assertRaises(ValueError):
            sel = Selector.top(2, "InvalidAttribute")
            fc.apply(sel)

    def test_limit_exceeds_files(self):
        fc = FileCollection(self.test_dir)
        sel = Selector.top(10, TopAttribute.BIGGEST.value)  # More than available files
        result = fc.apply(sel)
        self.assertEqual(len(result.files), 4)  # Should return all files

    def tearDown(self):
        # Clean up the temporary directory
        for root, dirs, files in os.walk(self.test_dir, topdown=False):
            for name in files:
                os.remove(os.path.join(root, name))
            for name in dirs:
                os.rmdir(os.path.join(root, name))
        os.rmdir(self.test_dir)

if __name__ == '__main__':
    unittest.main()
