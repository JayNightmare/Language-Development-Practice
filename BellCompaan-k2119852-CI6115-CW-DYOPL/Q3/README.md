# FSPOW Language Implementation

This project implements the FSPOW language, a domain-specific language for managing and filtering file collections. The implementation includes a lexer, parser, and interpreter for executing FSPOW scripts.

## Objective
The main objective of this project is to provide a functional interpreter for the FSPOW language, allowing users to:

1. Create file collections from directories.
2. Apply various filters to file collections, such as filtering by name, size, date, or selecting top files based on specific attributes.
3. Combine filters using logical operations like `intersect` and `not`.
4. Display filtered results and messages to the user.

## Key Features

### Language Capabilities
- **File Collection Creation**: Create a collection of files from a specified directory.
  ```fspow
  fc = FileCollection(".")
  ```

- **Filters**:
  - **Name Filter**: Filter files by name pattern.
    ```fspow
    sel = Selector(name("*.mp4"))
    ```
  - **Size Filter**: Filter files by size.
    ```fspow
    sel = Selector(size("> 300M"))
    ```
  - **Date Filter**: Filter files by modification date.
    ```fspow
    sel = Selector(date("<6months"))
    ```
  - **Top Filter**: Select top files based on attributes like size or date.
    ```fspow
    sel = Selector(top(10, Biggest))
    ```

- **Logical Operations**:
  - Combine filters using `intersect`.
    ```fspow
    sel = Selector(name("*.mp4") intersect size("> 300M"))
    ```
  - Negate filters using `not`.
    ```fspow
    sel = Selector(not(size("< 1G")))
    ```

- **Display Results**:
  - List files in a collection.
    ```fspow
    fc.list()
    ```
  - Display messages.
    ```fspow
    message("Top 10 biggest files:")
    ```

### Implementation Details
- **ANTLR Grammar**: The `fspow.g4` file defines the syntax and semantics of the FSPOW language.
- **Python Interpreter**: The `main.py` file implements the interpreter using the generated lexer and parser.
- **File Management**:
  - `FileCollection.py`: Manages file collections and applies filters.
  - `FSObject.py`: Represents individual file system objects.
- **Filters**:
  - `Selector.py`: Implements filtering logic and operations.

## Usage

### Running a Script
To execute an FSPOW script, use the following command:
```bash
python main.py example.fspow
```

### Example Script
The `example.fspow` script demonstrates the language's capabilities:
```fspow
// Create a file collection from the current directory
fc = FileCollection(".")

// Get top 10 biggest files
sel = Selector(top(10, Biggest))
topBiggest = fc.apply(sel)
message("Top 10 biggest files:")
topBiggest.list()

// Get top 20 oldest files
sel = Selector(top(20, Oldest))
topOldest = fc.apply(sel)
message("Top 20 oldest files:")
topOldest.list()
```

### Testing
Run the test suite to verify the implementation:
```bash
python -m unittest test_cases.py
```

## Files
- `fspow.g4`: ANTLR grammar file.
- `fspowLexer.py`, `fspowParser.py`: Generated lexer and parser.
- `main.py`: Interpreter for FSPOW scripts.
- `FileCollection.py`: File collection management.
- `FSObject.py`: File system object representation.
- `Selector.py`: Filtering logic.
- `test_cases.py`: Unit tests for the implementation.
- `example.fspow`: Example FSPOW script.

## Notes
This implementation satisfies the requirements for Question 3 of the coursework, providing a functional interpreter for the FSPOW language with support for advanced filtering and logical operations.
