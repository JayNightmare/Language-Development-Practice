# Generated from simple.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .simpleParser import simpleParser
else:
    from simpleParser import simpleParser

# This class defines a complete listener for a parse tree produced by simpleParser.
class simpleListener(ParseTreeListener):

    # Enter a parse tree produced by simpleParser#simple.
    def enterSimple(self, ctx:simpleParser.SimpleContext):
        pass

    # Exit a parse tree produced by simpleParser#simple.
    def exitSimple(self, ctx:simpleParser.SimpleContext):
        pass



del simpleParser