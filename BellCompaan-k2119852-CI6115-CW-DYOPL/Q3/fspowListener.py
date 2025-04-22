# Generated from fspow.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .fspowParser import fspowParser
else:
    from fspowParser import fspowParser

# This class defines a complete listener for a parse tree produced by fspowParser.
class fspowListener(ParseTreeListener):

    # Enter a parse tree produced by fspowParser#prog.
    def enterProg(self, ctx:fspowParser.ProgContext):
        pass

    # Exit a parse tree produced by fspowParser#prog.
    def exitProg(self, ctx:fspowParser.ProgContext):
        pass


    # Enter a parse tree produced by fspowParser#stat.
    def enterStat(self, ctx:fspowParser.StatContext):
        pass

    # Exit a parse tree produced by fspowParser#stat.
    def exitStat(self, ctx:fspowParser.StatContext):
        pass


    # Enter a parse tree produced by fspowParser#assignment.
    def enterAssignment(self, ctx:fspowParser.AssignmentContext):
        pass

    # Exit a parse tree produced by fspowParser#assignment.
    def exitAssignment(self, ctx:fspowParser.AssignmentContext):
        pass


    # Enter a parse tree produced by fspowParser#expression.
    def enterExpression(self, ctx:fspowParser.ExpressionContext):
        pass

    # Exit a parse tree produced by fspowParser#expression.
    def exitExpression(self, ctx:fspowParser.ExpressionContext):
        pass


    # Enter a parse tree produced by fspowParser#fcCreation.
    def enterFcCreation(self, ctx:fspowParser.FcCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#fcCreation.
    def exitFcCreation(self, ctx:fspowParser.FcCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#selCreation.
    def enterSelCreation(self, ctx:fspowParser.SelCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#selCreation.
    def exitSelCreation(self, ctx:fspowParser.SelCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#selfilter.
    def enterSelfilter(self, ctx:fspowParser.SelfilterContext):
        pass

    # Exit a parse tree produced by fspowParser#selfilter.
    def exitSelfilter(self, ctx:fspowParser.SelfilterContext):
        pass


    # Enter a parse tree produced by fspowParser#topAttr.
    def enterTopAttr(self, ctx:fspowParser.TopAttrContext):
        pass

    # Exit a parse tree produced by fspowParser#topAttr.
    def exitTopAttr(self, ctx:fspowParser.TopAttrContext):
        pass


    # Enter a parse tree produced by fspowParser#fcApplySelector.
    def enterFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        pass

    # Exit a parse tree produced by fspowParser#fcApplySelector.
    def exitFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        pass


    # Enter a parse tree produced by fspowParser#fcList.
    def enterFcList(self, ctx:fspowParser.FcListContext):
        pass

    # Exit a parse tree produced by fspowParser#fcList.
    def exitFcList(self, ctx:fspowParser.FcListContext):
        pass


    # Enter a parse tree produced by fspowParser#message.
    def enterMessage(self, ctx:fspowParser.MessageContext):
        pass

    # Exit a parse tree produced by fspowParser#message.
    def exitMessage(self, ctx:fspowParser.MessageContext):
        pass


    # Enter a parse tree produced by fspowParser#rootSpecifier.
    def enterRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        pass

    # Exit a parse tree produced by fspowParser#rootSpecifier.
    def exitRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        pass



del fspowParser