import os
import shutil
from datetime import datetime, timedelta
from FileCollection import FileCollection
from Selector import Selector, TopAttribute

def create_test_files():
    """Create a test directory structure with various files"""
    test_dir = "test_files"
    
    # Clean up any existing test directory
    if os.path.exists(test_dir):
        shutil.rmtree(test_dir)
    
    os.makedirs(test_dir)
    
    # Create test files with different sizes and dates
    files = [
        ("small.txt", 1024),  # 1KB
        ("medium.doc", 1024 * 1024 * 10),  # 10MB
        ("large.pdf", 1024 * 1024 * 50),  # 50MB
        ("huge.mp4", 1024 * 1024 * 500),  # 500MB
        ("tiny.jpg", 512),  # 0.5KB
        ("big_image.png", 1024 * 1024 * 20),  # 20MB
        ("archive.zip", 1024 * 1024 * 100),  # 100MB
    ]
    
    for name, size in files:
        path = os.path.join(test_dir, name)
        with open(path, 'wb') as f:
            f.truncate(size)
    
    # Create files with specific dates for testing
    dated_files = [
        ("old_doc.txt", 1024, 365),  # 1 year old
        ("older_image.jpg", 1024 * 1024, 730),  # 2 years old
        ("recent_file.pdf", 1024 * 1024 * 5, 7),  # 1 week old
        ("very_old.dat", 1024 * 1024 * 10, 1095),  # 3 years old
        ("month_old.txt", 1024, 30),  # 1 month old
        ("two_months.doc", 1024 * 1024, 60),  # 2 months old
    ]
    
    for name, size, days_old in dated_files:
        path = os.path.join(test_dir, name)
        with open(path, 'wb') as f:
            f.truncate(size)
        file_date = datetime.now() - timedelta(days=days_old)
        os.utime(path, (file_date.timestamp(), file_date.timestamp()))

def test_basic_selectors():
    """Test basic selector operations"""
    print("\n=== Testing Basic Selectors ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nFiles with .txt extension:")
    txt_selector = Selector.name('"\\.txt$"')  # Fixed regex pattern
    fc.apply(txt_selector).list()
    
    print("\nFiles larger than 50MB:")
    size_selector = Selector.size('"> 50M"')
    fc.apply(size_selector).list()
    
    print("\nFiles smaller than 1MB:")
    small_selector = Selector.size('"< 1M"')
    fc.apply(small_selector).list()

def test_date_selectors():
    """Test date selectors with different time units"""
    print("\n=== Testing Date Selectors ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nFiles older than 1 year:")
    year_selector = Selector.date('">1year"')
    fc.apply(year_selector).list()
    
    print("\nFiles newer than 6 months:")
    month_selector = Selector.date('"<6months"')
    fc.apply(month_selector).list()
    
    print("\nFiles older than 30 days:")
    day_selector = Selector.date('">30days"')
    fc.apply(day_selector).list()

def test_top_selectors():
    """Test top selectors with different attributes"""
    print("\n=== Testing Top Selectors ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nTop 3 biggest files:")
    biggest_selector = Selector.top(3, TopAttribute.BIGGEST.value)
    fc.apply(biggest_selector).list()
    
    print("\nTop 2 smallest files:")
    smallest_selector = Selector.top(2, TopAttribute.SMALLEST.value)
    fc.apply(smallest_selector).list()
    
    print("\nTop 2 oldest files:")
    oldest_selector = Selector.top(2, TopAttribute.OLDEST.value)
    fc.apply(oldest_selector).list()
    
    print("\nTop 3 newest files:")
    newest_selector = Selector.top(3, TopAttribute.NEWEST.value)
    fc.apply(newest_selector).list()

def test_complex_selectors():
    """Test complex selector combinations"""
    print("\n=== Testing Complex Selector Combinations ===")
    
    fc = FileCollection('"test_files"')
    
    # Test intersection of size and date
    print("\nLarge files (>50MB) that are also old (>1year):")
    large_old = Selector.size('"> 50M"').intersect(Selector.date('">1year"'))
    fc.apply(large_old).list()
    
    # Test intersection with top selector
    print("\nTop 3 biggest files that are newer than 1 year:")
    big_selector = Selector.top(3, TopAttribute.BIGGEST.value)
    date_selector = Selector.not_(Selector.date('">1year"'))
    big_new = big_selector.intersect(date_selector)
    fc.apply(big_new).list()
    
    # Test complex combination with multiple conditions
    print("\nFiles that are either small (<1MB) or very old (>2years):")
    small = Selector.size('"< 1M"')
    very_old = Selector.date('">2years"')
    small_or_old = Selector.not_(
        Selector.not_(small).intersect(Selector.not_(very_old))
    )
    fc.apply(small_or_old).list()

def test_edge_cases():
    """Test edge cases and special conditions"""
    print("\n=== Testing Edge Cases ===")
    
    fc = FileCollection('"test_files"')
    
    print("\nTop 0 files (should be empty):")
    zero_top = Selector.top(0, TopAttribute.BIGGEST.value)
    fc.apply(zero_top).list()
    
    print("\nIntersection of mutually exclusive conditions:")
    biggest = Selector.top(1, TopAttribute.BIGGEST.value)
    smallest = Selector.top(1, TopAttribute.SMALLEST.value)
    impossible = biggest.intersect(smallest)
    fc.apply(impossible).list()
    
    print("\nComplex nested not operations (files <= 100MB):")
    nested_not = Selector.not_(
        Selector.size('"> 100M"')
    )
    fc.apply(nested_not).list()

def main():
    try:
        # Setup test environment
        print("Creating test files...")
        create_test_files()
        
        # Run tests
        test_basic_selectors()
        test_date_selectors()
        test_top_selectors()
        test_complex_selectors()
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
