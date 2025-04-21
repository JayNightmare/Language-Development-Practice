import sys
from antlr4 import *
from basicLexer import basicLexer
from basicParser import basicParser
from basicListener import basicListener
from TreesUser import TreesUser

# main.py
def main(argv):
    if len(argv) == 1:
        inpstream = StdinStream()
    else:
        inpname = argv[1]
        inpstream = FileStream(inpname)
    
    lexer = basicLexer(inpstream)
    tokstream = CommonTokenStream(lexer)
    parser = basicParser(tokstream)
    
    tree = parser.basic()
    
    print(TreesUser.toStringTree(tree, None, parser))
    print(TreesUser.PrettyPrint(tree, None, parser))

if __name__ == '__main__':
    main(sys.argv)