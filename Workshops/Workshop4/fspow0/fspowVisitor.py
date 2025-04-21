# Generated from fspow.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .fspowParser import fspowParser
else:
    from fspowParser import fspowParser

# This class defines a complete generic visitor for a parse tree produced by fspowParser.

class fspowVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by fspowParser#prog.
    def visitProg(self, ctx:fspowParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#statAssignment.
    def visitStatAssignment(self, ctx:fspowParser.StatAssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#statFcList.
    def visitStatFcList(self, ctx:fspowParser.StatFcListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#statFcApplySelector.
    def visitStatFcApplySelector(self, ctx:fspowParser.StatFcApplySelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#statMessage.
    def visitStatMessage(self, ctx:fspowParser.StatMessageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#assignment.
    def visitAssignment(self, ctx:fspowParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#exprID.
    def visitExprID(self, ctx:fspowParser.ExprIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#exprSelCreation.
    def visitExprSelCreation(self, ctx:fspowParser.ExprSelCreationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#exprFcCreation.
    def visitExprFcCreation(self, ctx:fspowParser.ExprFcCreationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#fcCreation.
    def visitFcCreation(self, ctx:fspowParser.FcCreationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#fcCreationName.
    def visitFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#rootSpecifier.
    def visitRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#selCreation.
    def visitSelCreation(self, ctx:fspowParser.SelCreationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#selCreationName.
    def visitSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#filterSpecifier.
    def visitFilterSpecifier(self, ctx:fspowParser.FilterSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#selfilter.
    def visitSelfilter(self, ctx:fspowParser.SelfilterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#fcApplySelector.
    def visitFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#applyName.
    def visitApplyName(self, ctx:fspowParser.ApplyNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#fcList.
    def visitFcList(self, ctx:fspowParser.FcListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#printName.
    def visitPrintName(self, ctx:fspowParser.PrintNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#message.
    def visitMessage(self, ctx:fspowParser.MessageContext):
        return self.visitChildren(ctx)



del fspowParser