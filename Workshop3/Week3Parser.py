# Generated from Week3.g4 by ANTLR 4.13.2
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
        4,1,2,5,2,0,7,0,1,0,1,0,1,0,0,0,1,0,0,0,3,0,2,1,0,0,0,2,3,5,1,0,
        0,3,1,1,0,0,0,0
    ]

class Week3Parser ( Parser ):

    grammarFileName = "Week3.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'weak'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "WS" ]

    RULE_week3 = 0

    ruleNames =  [ "week3" ]

    EOF = Token.EOF
    T__0=1
    WS=2

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Week3Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return Week3Parser.RULE_week3

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWeek3" ):
                listener.enterWeek3(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWeek3" ):
                listener.exitWeek3(self)




    def week3(self):

        localctx = Week3Parser.Week3Context(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_week3)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(Week3Parser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





