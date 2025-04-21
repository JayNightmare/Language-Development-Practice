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


    # Enter a parse tree produced by fspowParser#statAssignment.
    def enterStatAssignment(self, ctx:fspowParser.StatAssignmentContext):
        pass

    # Exit a parse tree produced by fspowParser#statAssignment.
    def exitStatAssignment(self, ctx:fspowParser.StatAssignmentContext):
        pass


    # Enter a parse tree produced by fspowParser#statFcList.
    def enterStatFcList(self, ctx:fspowParser.StatFcListContext):
        pass

    # Exit a parse tree produced by fspowParser#statFcList.
    def exitStatFcList(self, ctx:fspowParser.StatFcListContext):
        pass


    # Enter a parse tree produced by fspowParser#statFcApplySelector.
    def enterStatFcApplySelector(self, ctx:fspowParser.StatFcApplySelectorContext):
        pass

    # Exit a parse tree produced by fspowParser#statFcApplySelector.
    def exitStatFcApplySelector(self, ctx:fspowParser.StatFcApplySelectorContext):
        pass


    # Enter a parse tree produced by fspowParser#statMessage.
    def enterStatMessage(self, ctx:fspowParser.StatMessageContext):
        pass

    # Exit a parse tree produced by fspowParser#statMessage.
    def exitStatMessage(self, ctx:fspowParser.StatMessageContext):
        pass


    # Enter a parse tree produced by fspowParser#assignment.
    def enterAssignment(self, ctx:fspowParser.AssignmentContext):
        pass

    # Exit a parse tree produced by fspowParser#assignment.
    def exitAssignment(self, ctx:fspowParser.AssignmentContext):
        pass


    # Enter a parse tree produced by fspowParser#exprID.
    def enterExprID(self, ctx:fspowParser.ExprIDContext):
        pass

    # Exit a parse tree produced by fspowParser#exprID.
    def exitExprID(self, ctx:fspowParser.ExprIDContext):
        pass


    # Enter a parse tree produced by fspowParser#exprSelCreation.
    def enterExprSelCreation(self, ctx:fspowParser.ExprSelCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#exprSelCreation.
    def exitExprSelCreation(self, ctx:fspowParser.ExprSelCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#exprFcCreation.
    def enterExprFcCreation(self, ctx:fspowParser.ExprFcCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#exprFcCreation.
    def exitExprFcCreation(self, ctx:fspowParser.ExprFcCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#fcCreation.
    def enterFcCreation(self, ctx:fspowParser.FcCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#fcCreation.
    def exitFcCreation(self, ctx:fspowParser.FcCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#fcCreationName.
    def enterFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        pass

    # Exit a parse tree produced by fspowParser#fcCreationName.
    def exitFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        pass


    # Enter a parse tree produced by fspowParser#rootSpecifier.
    def enterRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        pass

    # Exit a parse tree produced by fspowParser#rootSpecifier.
    def exitRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        pass


    # Enter a parse tree produced by fspowParser#selCreation.
    def enterSelCreation(self, ctx:fspowParser.SelCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#selCreation.
    def exitSelCreation(self, ctx:fspowParser.SelCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#selCreationName.
    def enterSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        pass

    # Exit a parse tree produced by fspowParser#selCreationName.
    def exitSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        pass


    # Enter a parse tree produced by fspowParser#filterSpecifier.
    def enterFilterSpecifier(self, ctx:fspowParser.FilterSpecifierContext):
        pass

    # Exit a parse tree produced by fspowParser#filterSpecifier.
    def exitFilterSpecifier(self, ctx:fspowParser.FilterSpecifierContext):
        pass


    # Enter a parse tree produced by fspowParser#selfilter.
    def enterSelfilter(self, ctx:fspowParser.SelfilterContext):
        pass

    # Exit a parse tree produced by fspowParser#selfilter.
    def exitSelfilter(self, ctx:fspowParser.SelfilterContext):
        pass


    # Enter a parse tree produced by fspowParser#fcApplySelector.
    def enterFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        pass

    # Exit a parse tree produced by fspowParser#fcApplySelector.
    def exitFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        pass


    # Enter a parse tree produced by fspowParser#applyName.
    def enterApplyName(self, ctx:fspowParser.ApplyNameContext):
        pass

    # Exit a parse tree produced by fspowParser#applyName.
    def exitApplyName(self, ctx:fspowParser.ApplyNameContext):
        pass


    # Enter a parse tree produced by fspowParser#fcList.
    def enterFcList(self, ctx:fspowParser.FcListContext):
        pass

    # Exit a parse tree produced by fspowParser#fcList.
    def exitFcList(self, ctx:fspowParser.FcListContext):
        pass


    # Enter a parse tree produced by fspowParser#printName.
    def enterPrintName(self, ctx:fspowParser.PrintNameContext):
        pass

    # Exit a parse tree produced by fspowParser#printName.
    def exitPrintName(self, ctx:fspowParser.PrintNameContext):
        pass


    # Enter a parse tree produced by fspowParser#message.
    def enterMessage(self, ctx:fspowParser.MessageContext):
        pass

    # Exit a parse tree produced by fspowParser#message.
    def exitMessage(self, ctx:fspowParser.MessageContext):
        pass



del fspowParser