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


    # Enter a parse tree produced by fspowParser#StatAssignment.
    def enterStatAssignment(self, ctx:fspowParser.StatAssignmentContext):
        pass

    # Exit a parse tree produced by fspowParser#StatAssignment.
    def exitStatAssignment(self, ctx:fspowParser.StatAssignmentContext):
        pass


    # Enter a parse tree produced by fspowParser#StatFcApplySelector.
    def enterStatFcApplySelector(self, ctx:fspowParser.StatFcApplySelectorContext):
        pass

    # Exit a parse tree produced by fspowParser#StatFcApplySelector.
    def exitStatFcApplySelector(self, ctx:fspowParser.StatFcApplySelectorContext):
        pass


    # Enter a parse tree produced by fspowParser#StatFcList.
    def enterStatFcList(self, ctx:fspowParser.StatFcListContext):
        pass

    # Exit a parse tree produced by fspowParser#StatFcList.
    def exitStatFcList(self, ctx:fspowParser.StatFcListContext):
        pass


    # Enter a parse tree produced by fspowParser#StatMessage.
    def enterStatMessage(self, ctx:fspowParser.StatMessageContext):
        pass

    # Exit a parse tree produced by fspowParser#StatMessage.
    def exitStatMessage(self, ctx:fspowParser.StatMessageContext):
        pass


    # Enter a parse tree produced by fspowParser#assignment.
    def enterAssignment(self, ctx:fspowParser.AssignmentContext):
        pass

    # Exit a parse tree produced by fspowParser#assignment.
    def exitAssignment(self, ctx:fspowParser.AssignmentContext):
        pass


    # Enter a parse tree produced by fspowParser#ExprFcCreation.
    def enterExprFcCreation(self, ctx:fspowParser.ExprFcCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#ExprFcCreation.
    def exitExprFcCreation(self, ctx:fspowParser.ExprFcCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#ExprSelCreation.
    def enterExprSelCreation(self, ctx:fspowParser.ExprSelCreationContext):
        pass

    # Exit a parse tree produced by fspowParser#ExprSelCreation.
    def exitExprSelCreation(self, ctx:fspowParser.ExprSelCreationContext):
        pass


    # Enter a parse tree produced by fspowParser#ExprID.
    def enterExprID(self, ctx:fspowParser.ExprIDContext):
        pass

    # Exit a parse tree produced by fspowParser#ExprID.
    def exitExprID(self, ctx:fspowParser.ExprIDContext):
        pass


    # Enter a parse tree produced by fspowParser#FcCreationName.
    def enterFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        pass

    # Exit a parse tree produced by fspowParser#FcCreationName.
    def exitFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        pass


    # Enter a parse tree produced by fspowParser#SelCreationName.
    def enterSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        pass

    # Exit a parse tree produced by fspowParser#SelCreationName.
    def exitSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterNot.
    def enterFilterNot(self, ctx:fspowParser.FilterNotContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterNot.
    def exitFilterNot(self, ctx:fspowParser.FilterNotContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterTop.
    def enterFilterTop(self, ctx:fspowParser.FilterTopContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterTop.
    def exitFilterTop(self, ctx:fspowParser.FilterTopContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterSize.
    def enterFilterSize(self, ctx:fspowParser.FilterSizeContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterSize.
    def exitFilterSize(self, ctx:fspowParser.FilterSizeContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterParens.
    def enterFilterParens(self, ctx:fspowParser.FilterParensContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterParens.
    def exitFilterParens(self, ctx:fspowParser.FilterParensContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterName.
    def enterFilterName(self, ctx:fspowParser.FilterNameContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterName.
    def exitFilterName(self, ctx:fspowParser.FilterNameContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterDate.
    def enterFilterDate(self, ctx:fspowParser.FilterDateContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterDate.
    def exitFilterDate(self, ctx:fspowParser.FilterDateContext):
        pass


    # Enter a parse tree produced by fspowParser#FilterIntersect.
    def enterFilterIntersect(self, ctx:fspowParser.FilterIntersectContext):
        pass

    # Exit a parse tree produced by fspowParser#FilterIntersect.
    def exitFilterIntersect(self, ctx:fspowParser.FilterIntersectContext):
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


    # Enter a parse tree produced by fspowParser#AttrBiggest.
    def enterAttrBiggest(self, ctx:fspowParser.AttrBiggestContext):
        pass

    # Exit a parse tree produced by fspowParser#AttrBiggest.
    def exitAttrBiggest(self, ctx:fspowParser.AttrBiggestContext):
        pass


    # Enter a parse tree produced by fspowParser#AttrSmallest.
    def enterAttrSmallest(self, ctx:fspowParser.AttrSmallestContext):
        pass

    # Exit a parse tree produced by fspowParser#AttrSmallest.
    def exitAttrSmallest(self, ctx:fspowParser.AttrSmallestContext):
        pass


    # Enter a parse tree produced by fspowParser#AttrOldest.
    def enterAttrOldest(self, ctx:fspowParser.AttrOldestContext):
        pass

    # Exit a parse tree produced by fspowParser#AttrOldest.
    def exitAttrOldest(self, ctx:fspowParser.AttrOldestContext):
        pass


    # Enter a parse tree produced by fspowParser#AttrNewest.
    def enterAttrNewest(self, ctx:fspowParser.AttrNewestContext):
        pass

    # Exit a parse tree produced by fspowParser#AttrNewest.
    def exitAttrNewest(self, ctx:fspowParser.AttrNewestContext):
        pass



del fspowParser