import os
import shutil
from datetime import datetime, timedelta
from FileCollection import FileCollection
from Selector import Selector

def create_test_files():
    """Create a test directory structure with various files"""
    test_dir = "test_files"
    
    # Clean up any existing test directory
    if os.path.exists(test_dir):
        shutil.rmtree(test_dir)
    
    os.makedirs(test_dir)
    
    # Create test files with different sizes and dates
    files = [
        ("small.mp4", 1024),  # 1KB
        ("medium.mp4", 1024 * 1024 * 200),  # 200MB
        ("large.mp4", 1024 * 1024 * 500),  # 500MB
        ("huge.mp4", 1024 * 1024 * 1024),  # 1GB
        ("doc.txt", 512),  # Small text file
        ("image.jpg", 1024 * 1024 * 5),  # 5MB image
    ]
    
    for name, size in files:
        path = os.path.join(test_dir, name)
        with open(path, 'wb') as f:
            f.truncate(size)
    
    # Create some files with specific dates
    old_files = [
        ("old_video.mp4", 1024 * 1024 * 400),  # 400MB
        ("old_doc.txt", 1024),
    ]
    
    old_date = datetime.now() - timedelta(days=400)  # More than 1 year old
    for name, size in old_files:
        path = os.path.join(test_dir, name)
        with open(path, 'wb') as f:
            f.truncate(size)
        os.utime(path, (old_date.timestamp(), old_date.timestamp()))

def test_basic_filters():
    """Test basic filter operations"""
    print("\n=== Testing Basic Filters ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nMP4 files:")
    mp4_selector = Selector.name(r'".*\.mp4"')  # Fixed escape sequence
    fc.apply(mp4_selector).list()
    
    print("\nFiles larger than 300MB:")
    size_selector = Selector.size('"> 300M"')
    fc.apply(size_selector).list()
    
    print("\nFiles older than 1 year:")
    date_selector = Selector.date('">1year"')
    fc.apply(date_selector).list()

def test_complex_filters():
    """Test complex filter combinations"""
    print("\n=== Testing Complex Filters ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nMP4 files NOT (larger than 300MB AND older than 1 year):")
    name_filter = Selector.name(r'".*\.mp4"')  # Fixed escape sequence
    size_filter = Selector.size('"> 300M"')
    date_filter = Selector.date('">1year"')
    
    # Recreate the example from the question:
    # name("*.mp4") intersect (not (size("> 300M") intersect date(">1year")))
    complex_selector = name_filter.intersect(
        Selector.not_(size_filter.intersect(date_filter))
    )
    fc.apply(complex_selector).list()
    
    print("\nFiles larger than 300MB but not MP4:")
    not_mp4_and_large = size_filter.intersect(
        Selector.not_(name_filter)
    )
    fc.apply(not_mp4_and_large).list()

def main():
    # Setup test environment
    create_test_files()
    
    # Run tests
    test_basic_filters()
    test_complex_filters()
    
    # Cleanup
    shutil.rmtree("test_files")

if __name__ == "__main__":
    main()
