import sys
from antlr4 import *
from simpleLexer import simpleLexer
from simpleParser import simpleParser
from antlr4.tree.Trees import Trees
from TreesUser import TreesUser

def main(argv):
    if len(argv) == 1:
        inpstream = StdinStream()
    else:
        inpname = argv[1]
        inpstream = FileStream(inpname)
        
    lexer = simpleLexer(inpstream)
    tokstream = CommonTokenStream(lexer)
    parser = simpleParser(tokstream)
    
    tree = parser.simple()
    
    print(TreesUser.toStringTree(tree, None, parser))
    print(TreesUser.PrettyPrint(tree, None, parser))
    
if __name__ == '__main__':
    main(sys.argv)