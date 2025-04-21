import sys
from antlr4 import *
from fspowLexer import fspowLexer
from fspowParser import fspowParser
from antlr4.tree.Trees import Trees
from TreesUser import TreesUser

def main(argv):
    if len(argv) == 1:
        inpstream = StdinStream()
    else:
        inpname = argv[1]
        inpstream = FileStream(inpname)
        
    lexer = fspowLexer(inpstream)
    tokstream = CommonTokenStream(lexer)
    parser = fspowParser(tokstream)
    
    tree = parser.prog()
    
    print(TreesUser.toStringTree(tree, None, parser))
    print(TreesUser.PrettyPrint(tree, None, parser))
    
if __name__ == '__main__':
    main(sys.argv)