import sys

from antlr4 import *
from HelloLexer import HelloLexer
from HelloParser import HelloParser
from HelloListenerUser import HelloListenerUser
from antlr4.tree.Trees import Trees

def main(argv):
    if len(argv) == 1:
        inpstream = StdinStream()
    else:
        inpname = argv[1]
        inpstream = FileStream(inpname)
    lexer = HelloLexer(inpstream)
    tokstream = CommonTokenStream(lexer)
    parser = HelloParser(tokstream)
    tree = parser.start()
    print(Trees.toStringTree(tree, None, parser))
    
    listener = HelloListenerUser()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    
if __name__ == '__main__':
    main(sys.argv)