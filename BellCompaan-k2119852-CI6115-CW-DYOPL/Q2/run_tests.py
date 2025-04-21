import os
import sys
import subprocess

def main():
    print("=== Running Test Cases ===")
    subprocess.run([sys.executable, "test_cases.py"], check=True)
    
    print("\n=== Running Example Script ===")
    # Create test files again since test_cases.py cleaned them up
    from test_cases import create_test_files
    create_test_files()
    
    # * Run the example script
    subprocess.run([sys.executable, "main.py", "example.fspow"], check=True)
    
    # * Clean up directory
    import shutil
    if os.path.exists("test_files"):
        shutil.rmtree("test_files")

if __name__ == "__main__":
    main()
