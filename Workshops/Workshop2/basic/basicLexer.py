# Generated from basic.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,2,18,6,-1,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,4,1,13,
        8,1,11,1,12,1,14,1,1,1,1,0,0,2,1,1,3,2,1,0,1,3,0,9,10,13,13,32,32,
        18,0,1,1,0,0,0,0,3,1,0,0,0,1,5,1,0,0,0,3,12,1,0,0,0,5,6,5,98,0,0,
        6,7,5,97,0,0,7,8,5,115,0,0,8,9,5,105,0,0,9,10,5,99,0,0,10,2,1,0,
        0,0,11,13,7,0,0,0,12,11,1,0,0,0,13,14,1,0,0,0,14,12,1,0,0,0,14,15,
        1,0,0,0,15,16,1,0,0,0,16,17,6,1,0,0,17,4,1,0,0,0,2,0,14,1,6,0,0
    ]

class basicLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    WS = 2

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'basic'" ]

    symbolicNames = [ "<INVALID>",
            "WS" ]

    ruleNames = [ "T__0", "WS" ]

    grammarFileName = "basic.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


