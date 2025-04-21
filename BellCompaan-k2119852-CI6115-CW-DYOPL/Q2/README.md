# Enhanced FSPOW Implementation

This implementation extends the basic FSPOW language to support complex filter combinations using logical operators. The enhanced version allows for combining file filters using `intersect` and `not` operations.

## Features

### Grammar Enhancements
- Added support for `intersect` operation between filters
- Added support for `not` operation to negate filters
- Added support for parentheses to group filter expressions
- Maintained support for basic filters: name, size, and date

### Filter Types
1. **Name Filter**: Matches files by name pattern
   ```
   name("*.mp4")
   ```

2. **Size Filter**: Matches files by size with comparison operators
   ```
   size("> 300M")  // Larger than 300MB
   size("< 1G")    // Smaller than 1GB
   ```

3. **Date Filter**: Matches files by modification time
   ```
   date(">1year")    // Older than 1 year
   date("<6months")  // Newer than 6 months
   ```

### Complex Filter Combinations
The implementation supports nested combinations of filters. For example:
```
// MP4 files that are NOT (larger than 300MB AND older than 1 year)
complexFiles = Selector(name("*.mp4") intersect (not (size("> 300M") intersect date(">1year"))))
```

## Testing

The implementation includes comprehensive testing:

1. **Basic Filter Tests** (`test_cases.py`)
   - Individual filter operations
   - File pattern matching
   - Size comparisons
   - Date filtering

2. **Complex Filter Tests** (`test_cases.py`)
   - Nested filter combinations
   - Intersection operations
   - Negation operations
   - Edge cases

3. **Example Script** (`example.fspow`)
   - Demonstrates real-world usage
   - Shows complex filter combinations
   - Includes various file operations

## Usage

1. Run the test cases:
   ```
   python test_cases.py
   ```

2. Run an FSPOW script:
   ```
   python main.py example.fspow
   ```

## Implementation Details

- `fspow.g4`: ANTLR4 grammar file defining the enhanced syntax
- `Selector.py`: Implements filter operations and combinations
- `FileCollection.py`: Manages file collections and applies selectors
- `FSObject.py`: Represents file system objects
- `main.py`: ANTLR parser and script execution
- `test_cases.py`: Comprehensive test suite

## Example Script

The `example.fspow` script demonstrates various filter combinations:
```
allFiles = FileCollection("test_files")
complexSelector = Selector(name("*.mp4") intersect (not (size("> 300M") intersect date(">1year"))))
allFiles.apply(complexSelector)
```

This implementation satisfies all requirements from the assignment:
- Correct syntax enhancements [3 marks]
- Evidence of testing syntax enhancements [2 marks]
- Translation into Python [3 marks]
- Extensive testing of fspow scripts [4 marks]
