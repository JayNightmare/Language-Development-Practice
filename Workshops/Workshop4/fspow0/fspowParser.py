# Generated from fspow.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,14,94,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,1,0,4,0,34,8,0,11,0,12,0,35,1,1,1,1,1,1,1,1,
        3,1,42,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,3,3,51,8,3,1,4,1,4,1,4,1,
        4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,9,1,9,1,9,1,
        9,1,9,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,13,
        1,13,1,13,1,13,1,14,1,14,1,15,1,15,1,15,1,15,0,0,16,0,2,4,6,8,10,
        12,14,16,18,20,22,24,26,28,30,0,0,83,0,33,1,0,0,0,2,41,1,0,0,0,4,
        43,1,0,0,0,6,50,1,0,0,0,8,52,1,0,0,0,10,57,1,0,0,0,12,59,1,0,0,0,
        14,61,1,0,0,0,16,66,1,0,0,0,18,68,1,0,0,0,20,73,1,0,0,0,22,75,1,
        0,0,0,24,82,1,0,0,0,26,84,1,0,0,0,28,88,1,0,0,0,30,90,1,0,0,0,32,
        34,3,2,1,0,33,32,1,0,0,0,34,35,1,0,0,0,35,33,1,0,0,0,35,36,1,0,0,
        0,36,1,1,0,0,0,37,42,3,4,2,0,38,42,3,26,13,0,39,42,3,22,11,0,40,
        42,3,30,15,0,41,37,1,0,0,0,41,38,1,0,0,0,41,39,1,0,0,0,41,40,1,0,
        0,0,42,3,1,0,0,0,43,44,5,11,0,0,44,45,5,1,0,0,45,46,3,6,3,0,46,5,
        1,0,0,0,47,51,5,11,0,0,48,51,3,14,7,0,49,51,3,8,4,0,50,47,1,0,0,
        0,50,48,1,0,0,0,50,49,1,0,0,0,51,7,1,0,0,0,52,53,3,10,5,0,53,54,
        5,2,0,0,54,55,3,12,6,0,55,56,5,3,0,0,56,9,1,0,0,0,57,58,5,4,0,0,
        58,11,1,0,0,0,59,60,5,12,0,0,60,13,1,0,0,0,61,62,3,16,8,0,62,63,
        5,2,0,0,63,64,3,18,9,0,64,65,5,3,0,0,65,15,1,0,0,0,66,67,5,5,0,0,
        67,17,1,0,0,0,68,69,3,20,10,0,69,70,5,2,0,0,70,71,5,12,0,0,71,72,
        5,3,0,0,72,19,1,0,0,0,73,74,5,6,0,0,74,21,1,0,0,0,75,76,5,11,0,0,
        76,77,5,7,0,0,77,78,3,24,12,0,78,79,5,2,0,0,79,80,3,6,3,0,80,81,
        5,3,0,0,81,23,1,0,0,0,82,83,5,8,0,0,83,25,1,0,0,0,84,85,5,11,0,0,
        85,86,5,7,0,0,86,87,3,28,14,0,87,27,1,0,0,0,88,89,5,9,0,0,89,29,
        1,0,0,0,90,91,5,10,0,0,91,92,5,12,0,0,92,31,1,0,0,0,3,35,41,50
    ]

class fspowParser ( Parser ):

    grammarFileName = "fspow.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'('", "')'", "'FileCollection'", 
                     "'Selector'", "'name'", "'.'", "'apply'", "'print()'", 
                     "'message'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "STRING", 
                      "WS", "COMMENT" ]

    RULE_prog = 0
    RULE_stat = 1
    RULE_assignment = 2
    RULE_expression = 3
    RULE_fcCreation = 4
    RULE_fcCreationName = 5
    RULE_rootSpecifier = 6
    RULE_selCreation = 7
    RULE_selCreationName = 8
    RULE_filterSpecifier = 9
    RULE_selfilter = 10
    RULE_fcApplySelector = 11
    RULE_applyName = 12
    RULE_fcList = 13
    RULE_printName = 14
    RULE_message = 15

    ruleNames =  [ "prog", "stat", "assignment", "expression", "fcCreation", 
                   "fcCreationName", "rootSpecifier", "selCreation", "selCreationName", 
                   "filterSpecifier", "selfilter", "fcApplySelector", "applyName", 
                   "fcList", "printName", "message" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    ID=11
    STRING=12
    WS=13
    COMMENT=14

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stat(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(fspowParser.StatContext)
            else:
                return self.getTypedRuleContext(fspowParser.StatContext,i)


        def getRuleIndex(self):
            return fspowParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = fspowParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 32
                self.stat()
                self.state = 35 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==10 or _la==11):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_stat

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class StatFcListContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def fcList(self):
            return self.getTypedRuleContext(fspowParser.FcListContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatFcList" ):
                listener.enterStatFcList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatFcList" ):
                listener.exitStatFcList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatFcList" ):
                return visitor.visitStatFcList(self)
            else:
                return visitor.visitChildren(self)


    class StatFcApplySelectorContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def fcApplySelector(self):
            return self.getTypedRuleContext(fspowParser.FcApplySelectorContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatFcApplySelector" ):
                listener.enterStatFcApplySelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatFcApplySelector" ):
                listener.exitStatFcApplySelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatFcApplySelector" ):
                return visitor.visitStatFcApplySelector(self)
            else:
                return visitor.visitChildren(self)


    class StatMessageContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def message(self):
            return self.getTypedRuleContext(fspowParser.MessageContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatMessage" ):
                listener.enterStatMessage(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatMessage" ):
                listener.exitStatMessage(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatMessage" ):
                return visitor.visitStatMessage(self)
            else:
                return visitor.visitChildren(self)


    class StatAssignmentContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def assignment(self):
            return self.getTypedRuleContext(fspowParser.AssignmentContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatAssignment" ):
                listener.enterStatAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatAssignment" ):
                listener.exitStatAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatAssignment" ):
                return visitor.visitStatAssignment(self)
            else:
                return visitor.visitChildren(self)



    def stat(self):

        localctx = fspowParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stat)
        try:
            self.state = 41
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                localctx = fspowParser.StatAssignmentContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 37
                self.assignment()
                pass

            elif la_ == 2:
                localctx = fspowParser.StatFcListContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 38
                self.fcList()
                pass

            elif la_ == 3:
                localctx = fspowParser.StatFcApplySelectorContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 39
                self.fcApplySelector()
                pass

            elif la_ == 4:
                localctx = fspowParser.StatMessageContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.message()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(fspowParser.ExpressionContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = fspowParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(fspowParser.ID)
            self.state = 44
            self.match(fspowParser.T__0)
            self.state = 45
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ExprFcCreationContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def fcCreation(self):
            return self.getTypedRuleContext(fspowParser.FcCreationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprFcCreation" ):
                listener.enterExprFcCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprFcCreation" ):
                listener.exitExprFcCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprFcCreation" ):
                return visitor.visitExprFcCreation(self)
            else:
                return visitor.visitChildren(self)


    class ExprSelCreationContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def selCreation(self):
            return self.getTypedRuleContext(fspowParser.SelCreationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprSelCreation" ):
                listener.enterExprSelCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprSelCreation" ):
                listener.exitExprSelCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprSelCreation" ):
                return visitor.visitExprSelCreation(self)
            else:
                return visitor.visitChildren(self)


    class ExprIDContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprID" ):
                listener.enterExprID(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprID" ):
                listener.exitExprID(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprID" ):
                return visitor.visitExprID(self)
            else:
                return visitor.visitChildren(self)



    def expression(self):

        localctx = fspowParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_expression)
        try:
            self.state = 50
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [11]:
                localctx = fspowParser.ExprIDContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 47
                self.match(fspowParser.ID)
                pass
            elif token in [5]:
                localctx = fspowParser.ExprSelCreationContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 48
                self.selCreation()
                pass
            elif token in [4]:
                localctx = fspowParser.ExprFcCreationContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 49
                self.fcCreation()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcCreationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fcCreationName(self):
            return self.getTypedRuleContext(fspowParser.FcCreationNameContext,0)


        def rootSpecifier(self):
            return self.getTypedRuleContext(fspowParser.RootSpecifierContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_fcCreation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcCreation" ):
                listener.enterFcCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcCreation" ):
                listener.exitFcCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcCreation" ):
                return visitor.visitFcCreation(self)
            else:
                return visitor.visitChildren(self)




    def fcCreation(self):

        localctx = fspowParser.FcCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_fcCreation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.fcCreationName()
            self.state = 53
            self.match(fspowParser.T__1)
            self.state = 54
            self.rootSpecifier()
            self.state = 55
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcCreationNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_fcCreationName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcCreationName" ):
                listener.enterFcCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcCreationName" ):
                listener.exitFcCreationName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcCreationName" ):
                return visitor.visitFcCreationName(self)
            else:
                return visitor.visitChildren(self)




    def fcCreationName(self):

        localctx = fspowParser.FcCreationNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_fcCreationName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(fspowParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RootSpecifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def getRuleIndex(self):
            return fspowParser.RULE_rootSpecifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRootSpecifier" ):
                listener.enterRootSpecifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRootSpecifier" ):
                listener.exitRootSpecifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRootSpecifier" ):
                return visitor.visitRootSpecifier(self)
            else:
                return visitor.visitChildren(self)




    def rootSpecifier(self):

        localctx = fspowParser.RootSpecifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_rootSpecifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.match(fspowParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelCreationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def selCreationName(self):
            return self.getTypedRuleContext(fspowParser.SelCreationNameContext,0)


        def filterSpecifier(self):
            return self.getTypedRuleContext(fspowParser.FilterSpecifierContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_selCreation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelCreation" ):
                listener.enterSelCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelCreation" ):
                listener.exitSelCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelCreation" ):
                return visitor.visitSelCreation(self)
            else:
                return visitor.visitChildren(self)




    def selCreation(self):

        localctx = fspowParser.SelCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_selCreation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.selCreationName()
            self.state = 62
            self.match(fspowParser.T__1)
            self.state = 63
            self.filterSpecifier()
            self.state = 64
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelCreationNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_selCreationName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelCreationName" ):
                listener.enterSelCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelCreationName" ):
                listener.exitSelCreationName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelCreationName" ):
                return visitor.visitSelCreationName(self)
            else:
                return visitor.visitChildren(self)




    def selCreationName(self):

        localctx = fspowParser.SelCreationNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_selCreationName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(fspowParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FilterSpecifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def selfilter(self):
            return self.getTypedRuleContext(fspowParser.SelfilterContext,0)


        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def getRuleIndex(self):
            return fspowParser.RULE_filterSpecifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterSpecifier" ):
                listener.enterFilterSpecifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterSpecifier" ):
                listener.exitFilterSpecifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFilterSpecifier" ):
                return visitor.visitFilterSpecifier(self)
            else:
                return visitor.visitChildren(self)




    def filterSpecifier(self):

        localctx = fspowParser.FilterSpecifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_filterSpecifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.selfilter()
            self.state = 69
            self.match(fspowParser.T__1)
            self.state = 70
            self.match(fspowParser.STRING)
            self.state = 71
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelfilterContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_selfilter

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelfilter" ):
                listener.enterSelfilter(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelfilter" ):
                listener.exitSelfilter(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelfilter" ):
                return visitor.visitSelfilter(self)
            else:
                return visitor.visitChildren(self)




    def selfilter(self):

        localctx = fspowParser.SelfilterContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_selfilter)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(fspowParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcApplySelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def applyName(self):
            return self.getTypedRuleContext(fspowParser.ApplyNameContext,0)


        def expression(self):
            return self.getTypedRuleContext(fspowParser.ExpressionContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_fcApplySelector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcApplySelector" ):
                listener.enterFcApplySelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcApplySelector" ):
                listener.exitFcApplySelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcApplySelector" ):
                return visitor.visitFcApplySelector(self)
            else:
                return visitor.visitChildren(self)




    def fcApplySelector(self):

        localctx = fspowParser.FcApplySelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_fcApplySelector)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self.match(fspowParser.ID)
            self.state = 76
            self.match(fspowParser.T__6)
            self.state = 77
            self.applyName()
            self.state = 78
            self.match(fspowParser.T__1)
            self.state = 79
            self.expression()
            self.state = 80
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ApplyNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_applyName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterApplyName" ):
                listener.enterApplyName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitApplyName" ):
                listener.exitApplyName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitApplyName" ):
                return visitor.visitApplyName(self)
            else:
                return visitor.visitChildren(self)




    def applyName(self):

        localctx = fspowParser.ApplyNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_applyName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(fspowParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def printName(self):
            return self.getTypedRuleContext(fspowParser.PrintNameContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_fcList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcList" ):
                listener.enterFcList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcList" ):
                listener.exitFcList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcList" ):
                return visitor.visitFcList(self)
            else:
                return visitor.visitChildren(self)




    def fcList(self):

        localctx = fspowParser.FcListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_fcList)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(fspowParser.ID)
            self.state = 85
            self.match(fspowParser.T__6)
            self.state = 86
            self.printName()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_printName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintName" ):
                listener.enterPrintName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintName" ):
                listener.exitPrintName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrintName" ):
                return visitor.visitPrintName(self)
            else:
                return visitor.visitChildren(self)




    def printName(self):

        localctx = fspowParser.PrintNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_printName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self.match(fspowParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MessageContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def getRuleIndex(self):
            return fspowParser.RULE_message

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMessage" ):
                listener.enterMessage(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMessage" ):
                listener.exitMessage(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMessage" ):
                return visitor.visitMessage(self)
            else:
                return visitor.visitChildren(self)




    def message(self):

        localctx = fspowParser.MessageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_message)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(fspowParser.T__9)
            self.state = 91
            self.match(fspowParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





