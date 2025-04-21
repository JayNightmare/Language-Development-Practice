# Generated from basic.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .basicParser import basicParser
else:
    from basicParser import basicParser

# This class defines a complete listener for a parse tree produced by basicParser.
class basicListener(ParseTreeListener):

    # Enter a parse tree produced by basicParser#basic.
    def enterBasic(self, ctx:basicParser.BasicContext):
        pass

    # Exit a parse tree produced by basicParser#basic.
    def exitBasic(self, ctx:basicParser.BasicContext):
        pass



del basicParser