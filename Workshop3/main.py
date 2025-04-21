import sys
from antlr4 import *

"""
Six replacements need to be made.
    Replace "Week3" with your grammar name.
7th change on line 27: 
    tree = parser.prog() --> change "prog" to name of your top rule.
"""

from Week3Lexer import Week3Lexer # Note the Week3 before Lexer x2
from Week3Parser import Week3Parser # Note the Week3 before Parser x2

from antlr4.tree.Trees import Trees

def main(argv):
    if len(argv) == 1:
        inpstream = StdinStream()
    else:
        inpname = argv[1]
        inpstream = FileStream(inpname)

    lexer = Week3Lexer(inpstream) # Note the Week3 before Lexer
    tokstream = CommonTokenStream(lexer)
    parser = Week3Parser(tokstream) # Note the Week3 before Parser

    tree = parser.prog() # Note the prog matches a rule name
    # print the parse tree
    print(Trees.toStringTree(tree, None, parser))

if __name__ == '__main__':
    main(sys.argv)
