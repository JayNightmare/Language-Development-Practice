# Generated from Hello.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .HelloParser import HelloParser
else:
    from HelloParser import HelloParser
    from HelloListener import HelloListener

# This class defines a complete listener for a parse tree produced by HelloParser.
class HelloListenerUser(HelloListener):

    # Enter a parse tree produced by HelloParser#start.
    def enterStart(self, ctx:HelloParser.StartContext):
        super().enterStart(ctx)

    # Exit a parse tree produced by HelloParser#start.
    def exitStart(self, ctx:HelloParser.StartContext):
        super().exitStart(ctx)



del HelloParser