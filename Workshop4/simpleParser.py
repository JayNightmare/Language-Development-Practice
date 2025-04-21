# Generated from simple.g4 by ANTLR 4.13.2
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

class simpleParser ( Parser ):

    grammarFileName = "simple.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'simple'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "WS" ]

    RULE_simple = 0

    ruleNames =  [ "simple" ]

    EOF = Token.EOF
    T__0=1
    WS=2

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class SimpleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return simpleParser.RULE_simple

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimple" ):
                listener.enterSimple(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimple" ):
                listener.exitSimple(self)




    def simple(self):

        localctx = simpleParser.SimpleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_simple)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(simpleParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





