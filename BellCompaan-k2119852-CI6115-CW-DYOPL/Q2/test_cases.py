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
        ("image.jpg", 1024 * 1024 * 5),  # 5MB
        ("large_doc.pdf", 1024 * 1024 * 400),  # 400MB non-MP4
    ]
    
    for name, size in files:
        path = os.path.join(test_dir, name)
        with open(path, 'wb') as f:
            f.truncate(size)
    
    # Create some files with specific dates
    old_files = [
        ("old_video.mp4", 1024 * 1024 * 400),  # 400MB
        ("old_doc.txt", 1024),
        ("old_large.dat", 1024 * 1024 * 600),  # 600MB non-MP4
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
    mp4_selector = Selector.name('".*\\.mp4"')  # Fixed escape sequence
    fc.apply(mp4_selector).list()
    
    print("\nFiles larger than 300MB:")
    size_selector = Selector.size('"> 300M"')
    fc.apply(size_selector).list()
    
    print("\nFiles older than 1 year:")
    date_selector = Selector.date('">1year"')
    fc.apply(date_selector).list()

def test_complex_filters():
    """Test complex filter combinations"""
    print("\n=== Testing Complex Filter Combinations ===")
    
    fc = FileCollection('"test_files"')
    
    # Test intersection
    print("\nLarge MP4 files (>300MB):")
    large_mp4 = Selector.name('".*\\.mp4"').intersect(Selector.size('"> 300M"'))
    fc.apply(large_mp4).list()
    
    # Test negation
    print("\nNon-MP4 files:")
    non_mp4 = Selector.not_(Selector.name('".*\\.mp4"'))
    fc.apply(non_mp4).list()
    
    # Test complex combination (from question)
    print("\nMP4 files NOT (larger than 300MB AND older than 1 year):")
    size_filter = Selector.size('"> 300M"')
    date_filter = Selector.date('">1year"')
    name_filter = Selector.name('".*\\.mp4"')
    complex_selector = name_filter.intersect(
        Selector.not_(size_filter.intersect(date_filter))
    )
    fc.apply(complex_selector).list()
    
    # Test another complex combination
    print("\nRecent large files (>300MB, not old):")
    recent_large = size_filter.intersect(Selector.not_(date_filter))
    fc.apply(recent_large).list()

def test_edge_cases():
    """Test edge cases and special conditions"""
    print("\n=== Testing Edge Cases ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nEmpty filter (should match all):")
    empty_selector = Selector()
    fc.apply(empty_selector).list()
    
    print("\nNon-existent file type:")
    nonexistent = Selector.name('"\\.xyz$"')  # Fixed regex pattern
    print("Files matching '.xyz' extension: (should be empty)")
    fc.apply(nonexistent).list()
    
    print("\nComplex filter with no matches:")
    impossible = (
        Selector.size('"> 1G"')
        .intersect(Selector.size('"< 500M"'))
    )
    print("Files matching impossible condition: (should be empty)")
    fc.apply(impossible).list()

def main():
    try:
        # Setup test environment
        print("Creating test files...")
        create_test_files()
        
        # Run tests
        test_basic_filters()
        test_complex_filters()
        test_edge_cases()
        
    except Exception as e:
        print(f"Error during testing: {e}")
    
    finally:
        # Cleanup
        print("\nCleaning up test files...")
        if os.path.exists("test_files"):
            shutil.rmtree("test_files")

if __name__ == "__main__":
    main()
