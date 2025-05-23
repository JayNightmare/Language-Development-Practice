# Generated from Hello.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,3,31,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,0,1,0,1,0,1,
        1,4,1,15,8,1,11,1,12,1,16,1,1,5,1,20,8,1,10,1,12,1,23,9,1,1,2,4,
        2,26,8,2,11,2,12,2,27,1,2,1,2,0,0,3,1,1,3,2,5,3,1,0,3,3,0,65,90,
        95,95,97,122,4,0,48,57,65,90,95,95,97,122,3,0,9,10,13,13,32,32,33,
        0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,1,7,1,0,0,0,3,14,1,0,0,0,5,25,
        1,0,0,0,7,8,5,104,0,0,8,9,5,101,0,0,9,10,5,108,0,0,10,11,5,108,0,
        0,11,12,5,111,0,0,12,2,1,0,0,0,13,15,7,0,0,0,14,13,1,0,0,0,15,16,
        1,0,0,0,16,14,1,0,0,0,16,17,1,0,0,0,17,21,1,0,0,0,18,20,7,1,0,0,
        19,18,1,0,0,0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,4,1,0,
        0,0,23,21,1,0,0,0,24,26,7,2,0,0,25,24,1,0,0,0,26,27,1,0,0,0,27,25,
        1,0,0,0,27,28,1,0,0,0,28,29,1,0,0,0,29,30,6,2,0,0,30,6,1,0,0,0,4,
        0,16,21,27,1,6,0,0
    ]

class HelloLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    ID = 2
    WS = 3

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'hello'" ]

    symbolicNames = [ "<INVALID>",
            "ID", "WS" ]

    ruleNames = [ "T__0", "ID", "WS" ]

    grammarFileName = "Hello.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


