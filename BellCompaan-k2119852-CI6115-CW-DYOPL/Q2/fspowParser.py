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
        4,1,17,105,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,4,0,24,8,0,11,0,12,0,25,
        1,0,1,0,1,1,1,1,1,1,1,1,3,1,34,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,3,
        3,43,8,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,
        1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,
        1,6,1,6,3,6,77,8,6,1,6,1,6,1,6,5,6,82,8,6,10,6,12,6,85,9,6,1,7,1,
        7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,10,1,
        10,1,10,0,1,12,11,0,2,4,6,8,10,12,14,16,18,20,0,0,104,0,23,1,0,0,
        0,2,33,1,0,0,0,4,35,1,0,0,0,6,42,1,0,0,0,8,44,1,0,0,0,10,49,1,0,
        0,0,12,76,1,0,0,0,14,86,1,0,0,0,16,92,1,0,0,0,18,97,1,0,0,0,20,102,
        1,0,0,0,22,24,3,2,1,0,23,22,1,0,0,0,24,25,1,0,0,0,25,23,1,0,0,0,
        25,26,1,0,0,0,26,27,1,0,0,0,27,28,5,0,0,1,28,1,1,0,0,0,29,34,3,4,
        2,0,30,34,3,14,7,0,31,34,3,16,8,0,32,34,3,18,9,0,33,29,1,0,0,0,33,
        30,1,0,0,0,33,31,1,0,0,0,33,32,1,0,0,0,34,3,1,0,0,0,35,36,5,14,0,
        0,36,37,5,1,0,0,37,38,3,6,3,0,38,5,1,0,0,0,39,43,3,8,4,0,40,43,3,
        10,5,0,41,43,5,14,0,0,42,39,1,0,0,0,42,40,1,0,0,0,42,41,1,0,0,0,
        43,7,1,0,0,0,44,45,5,2,0,0,45,46,5,3,0,0,46,47,3,20,10,0,47,48,5,
        4,0,0,48,9,1,0,0,0,49,50,5,5,0,0,50,51,5,3,0,0,51,52,3,12,6,0,52,
        53,5,4,0,0,53,11,1,0,0,0,54,55,6,6,-1,0,55,56,5,6,0,0,56,57,5,3,
        0,0,57,58,5,15,0,0,58,77,5,4,0,0,59,60,5,7,0,0,60,61,5,3,0,0,61,
        62,5,15,0,0,62,77,5,4,0,0,63,64,5,8,0,0,64,65,5,3,0,0,65,66,5,15,
        0,0,66,77,5,4,0,0,67,68,5,10,0,0,68,69,5,3,0,0,69,70,3,12,6,0,70,
        71,5,4,0,0,71,77,1,0,0,0,72,73,5,3,0,0,73,74,3,12,6,0,74,75,5,4,
        0,0,75,77,1,0,0,0,76,54,1,0,0,0,76,59,1,0,0,0,76,63,1,0,0,0,76,67,
        1,0,0,0,76,72,1,0,0,0,77,83,1,0,0,0,78,79,10,3,0,0,79,80,5,9,0,0,
        80,82,3,12,6,4,81,78,1,0,0,0,82,85,1,0,0,0,83,81,1,0,0,0,83,84,1,
        0,0,0,84,13,1,0,0,0,85,83,1,0,0,0,86,87,5,14,0,0,87,88,5,11,0,0,
        88,89,5,3,0,0,89,90,5,14,0,0,90,91,5,4,0,0,91,15,1,0,0,0,92,93,5,
        14,0,0,93,94,5,12,0,0,94,95,5,3,0,0,95,96,5,4,0,0,96,17,1,0,0,0,
        97,98,5,13,0,0,98,99,5,3,0,0,99,100,5,15,0,0,100,101,5,4,0,0,101,
        19,1,0,0,0,102,103,5,15,0,0,103,21,1,0,0,0,5,25,33,42,76,83
    ]

class fspowParser ( Parser ):

    grammarFileName = "fspow.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'FileCollection'", "'('", "')'", 
                     "'Selector'", "'name'", "'size'", "'date'", "'intersect'", 
                     "'not'", "'.apply'", "'.list'", "'message'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "ID", "STRING", "WS", "COMMENT" ]

    RULE_prog = 0
    RULE_stat = 1
    RULE_assignment = 2
    RULE_expression = 3
    RULE_fcCreation = 4
    RULE_selCreation = 5
    RULE_selfilter = 6
    RULE_fcApplySelector = 7
    RULE_fcList = 8
    RULE_message = 9
    RULE_rootSpecifier = 10

    ruleNames =  [ "prog", "stat", "assignment", "expression", "fcCreation", 
                   "selCreation", "selfilter", "fcApplySelector", "fcList", 
                   "message", "rootSpecifier" ]

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
    T__10=11
    T__11=12
    T__12=13
    ID=14
    STRING=15
    WS=16
    COMMENT=17

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

        def EOF(self):
            return self.getToken(fspowParser.EOF, 0)

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




    def prog(self):

        localctx = fspowParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 22
                self.stat()
                self.state = 25 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==13 or _la==14):
                    break

            self.state = 27
            self.match(fspowParser.EOF)
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



    def stat(self):

        localctx = fspowParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stat)
        try:
            self.state = 33
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                localctx = fspowParser.StatAssignmentContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 29
                self.assignment()
                pass

            elif la_ == 2:
                localctx = fspowParser.StatFcApplySelectorContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 30
                self.fcApplySelector()
                pass

            elif la_ == 3:
                localctx = fspowParser.StatFcListContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 31
                self.fcList()
                pass

            elif la_ == 4:
                localctx = fspowParser.StatMessageContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 32
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




    def assignment(self):

        localctx = fspowParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(fspowParser.ID)
            self.state = 36
            self.match(fspowParser.T__0)
            self.state = 37
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



    def expression(self):

        localctx = fspowParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_expression)
        try:
            self.state = 42
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                localctx = fspowParser.ExprFcCreationContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 39
                self.fcCreation()
                pass
            elif token in [5]:
                localctx = fspowParser.ExprSelCreationContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 40
                self.selCreation()
                pass
            elif token in [14]:
                localctx = fspowParser.ExprIDContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 41
                self.match(fspowParser.ID)
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


        def getRuleIndex(self):
            return fspowParser.RULE_fcCreation

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class FcCreationNameContext(FcCreationContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.FcCreationContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def rootSpecifier(self):
            return self.getTypedRuleContext(fspowParser.RootSpecifierContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcCreationName" ):
                listener.enterFcCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcCreationName" ):
                listener.exitFcCreationName(self)



    def fcCreation(self):

        localctx = fspowParser.FcCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_fcCreation)
        try:
            localctx = fspowParser.FcCreationNameContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(fspowParser.T__1)
            self.state = 45
            self.match(fspowParser.T__2)
            self.state = 46
            self.rootSpecifier()
            self.state = 47
            self.match(fspowParser.T__3)
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


        def getRuleIndex(self):
            return fspowParser.RULE_selCreation

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class SelCreationNameContext(SelCreationContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelCreationContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def selfilter(self):
            return self.getTypedRuleContext(fspowParser.SelfilterContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelCreationName" ):
                listener.enterSelCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelCreationName" ):
                listener.exitSelCreationName(self)



    def selCreation(self):

        localctx = fspowParser.SelCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_selCreation)
        try:
            localctx = fspowParser.SelCreationNameContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(fspowParser.T__4)
            self.state = 50
            self.match(fspowParser.T__2)
            self.state = 51
            self.selfilter(0)
            self.state = 52
            self.match(fspowParser.T__3)
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

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class FilterNotContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def selfilter(self):
            return self.getTypedRuleContext(fspowParser.SelfilterContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterNot" ):
                listener.enterFilterNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterNot" ):
                listener.exitFilterNot(self)


    class FilterSizeContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterSize" ):
                listener.enterFilterSize(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterSize" ):
                listener.exitFilterSize(self)


    class FilterParensContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def selfilter(self):
            return self.getTypedRuleContext(fspowParser.SelfilterContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterParens" ):
                listener.enterFilterParens(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterParens" ):
                listener.exitFilterParens(self)


    class FilterNameContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterName" ):
                listener.enterFilterName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterName" ):
                listener.exitFilterName(self)


    class FilterDateContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterDate" ):
                listener.enterFilterDate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterDate" ):
                listener.exitFilterDate(self)


    class FilterIntersectContext(SelfilterContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a fspowParser.SelfilterContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def selfilter(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(fspowParser.SelfilterContext)
            else:
                return self.getTypedRuleContext(fspowParser.SelfilterContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterIntersect" ):
                listener.enterFilterIntersect(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterIntersect" ):
                listener.exitFilterIntersect(self)



    def selfilter(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = fspowParser.SelfilterContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 12
        self.enterRecursionRule(localctx, 12, self.RULE_selfilter, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                localctx = fspowParser.FilterNameContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 55
                self.match(fspowParser.T__5)
                self.state = 56
                self.match(fspowParser.T__2)
                self.state = 57
                self.match(fspowParser.STRING)
                self.state = 58
                self.match(fspowParser.T__3)
                pass
            elif token in [7]:
                localctx = fspowParser.FilterSizeContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 59
                self.match(fspowParser.T__6)
                self.state = 60
                self.match(fspowParser.T__2)
                self.state = 61
                self.match(fspowParser.STRING)
                self.state = 62
                self.match(fspowParser.T__3)
                pass
            elif token in [8]:
                localctx = fspowParser.FilterDateContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 63
                self.match(fspowParser.T__7)
                self.state = 64
                self.match(fspowParser.T__2)
                self.state = 65
                self.match(fspowParser.STRING)
                self.state = 66
                self.match(fspowParser.T__3)
                pass
            elif token in [10]:
                localctx = fspowParser.FilterNotContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 67
                self.match(fspowParser.T__9)
                self.state = 68
                self.match(fspowParser.T__2)
                self.state = 69
                self.selfilter(0)
                self.state = 70
                self.match(fspowParser.T__3)
                pass
            elif token in [3]:
                localctx = fspowParser.FilterParensContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 72
                self.match(fspowParser.T__2)
                self.state = 73
                self.selfilter(0)
                self.state = 74
                self.match(fspowParser.T__3)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 83
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = fspowParser.FilterIntersectContext(self, fspowParser.SelfilterContext(self, _parentctx, _parentState))
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_selfilter)
                    self.state = 78
                    if not self.precpred(self._ctx, 3):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                    self.state = 79
                    self.match(fspowParser.T__8)
                    self.state = 80
                    self.selfilter(4) 
                self.state = 85
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class FcApplySelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(fspowParser.ID)
            else:
                return self.getToken(fspowParser.ID, i)

        def getRuleIndex(self):
            return fspowParser.RULE_fcApplySelector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcApplySelector" ):
                listener.enterFcApplySelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcApplySelector" ):
                listener.exitFcApplySelector(self)




    def fcApplySelector(self):

        localctx = fspowParser.FcApplySelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_fcApplySelector)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(fspowParser.ID)
            self.state = 87
            self.match(fspowParser.T__10)
            self.state = 88
            self.match(fspowParser.T__2)
            self.state = 89
            self.match(fspowParser.ID)
            self.state = 90
            self.match(fspowParser.T__3)
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

        def getRuleIndex(self):
            return fspowParser.RULE_fcList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcList" ):
                listener.enterFcList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcList" ):
                listener.exitFcList(self)




    def fcList(self):

        localctx = fspowParser.FcListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_fcList)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(fspowParser.ID)
            self.state = 93
            self.match(fspowParser.T__11)
            self.state = 94
            self.match(fspowParser.T__2)
            self.state = 95
            self.match(fspowParser.T__3)
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




    def message(self):

        localctx = fspowParser.MessageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_message)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self.match(fspowParser.T__12)
            self.state = 98
            self.match(fspowParser.T__2)
            self.state = 99
            self.match(fspowParser.STRING)
            self.state = 100
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




    def rootSpecifier(self):

        localctx = fspowParser.RootSpecifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_rootSpecifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 102
            self.match(fspowParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[6] = self.selfilter_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def selfilter_sempred(self, localctx:SelfilterContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 3)
         




