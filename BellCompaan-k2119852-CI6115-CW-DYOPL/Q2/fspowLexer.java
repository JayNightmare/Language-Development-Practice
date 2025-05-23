// Generated from fspow.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class fspowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, STRING=15, WS=16, COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "STRING", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'FileCollection'", "'('", "')'", "'Selector'", "'name'", 
			"'size'", "'date'", "'intersect'", "'not'", "'.apply'", "'.list'", "'message'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public fspowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fspow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rv\b\r\n\r\f\ry\t\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u0085\b\u000f\u000b\u000f"+
		"\f\u000f\u0086\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u008f\b\u0010\n\u0010\f\u0010\u0092\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001"+
		"\u0000\u0005\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u0000\"\"\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0098\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001"+
		"\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000"+
		"\u0000\u00076\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		"A\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fK\u0001\u0000"+
		"\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000"+
		"\u0015^\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019k"+
		"\u0001\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000\u001dz\u0001\u0000"+
		"\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000!\u008a\u0001\u0000\u0000"+
		"\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005F\u0000"+
		"\u0000&\'\u0005i\u0000\u0000\'(\u0005l\u0000\u0000()\u0005e\u0000\u0000"+
		")*\u0005C\u0000\u0000*+\u0005o\u0000\u0000+,\u0005l\u0000\u0000,-\u0005"+
		"l\u0000\u0000-.\u0005e\u0000\u0000./\u0005c\u0000\u0000/0\u0005t\u0000"+
		"\u000001\u0005i\u0000\u000012\u0005o\u0000\u000023\u0005n\u0000\u0000"+
		"3\u0004\u0001\u0000\u0000\u000045\u0005(\u0000\u00005\u0006\u0001\u0000"+
		"\u0000\u000067\u0005)\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005S"+
		"\u0000\u00009:\u0005e\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000"+
		"\u0000<=\u0005c\u0000\u0000=>\u0005t\u0000\u0000>?\u0005o\u0000\u0000"+
		"?@\u0005r\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005n\u0000\u0000"+
		"BC\u0005a\u0000\u0000CD\u0005m\u0000\u0000DE\u0005e\u0000\u0000E\f\u0001"+
		"\u0000\u0000\u0000FG\u0005s\u0000\u0000GH\u0005i\u0000\u0000HI\u0005z"+
		"\u0000\u0000IJ\u0005e\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005"+
		"d\u0000\u0000LM\u0005a\u0000\u0000MN\u0005t\u0000\u0000NO\u0005e\u0000"+
		"\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000"+
		"\u0000RS\u0005t\u0000\u0000ST\u0005e\u0000\u0000TU\u0005r\u0000\u0000"+
		"UV\u0005s\u0000\u0000VW\u0005e\u0000\u0000WX\u0005c\u0000\u0000XY\u0005"+
		"t\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005"+
		"o\u0000\u0000\\]\u0005t\u0000\u0000]\u0014\u0001\u0000\u0000\u0000^_\u0005"+
		".\u0000\u0000_`\u0005a\u0000\u0000`a\u0005p\u0000\u0000ab\u0005p\u0000"+
		"\u0000bc\u0005l\u0000\u0000cd\u0005y\u0000\u0000d\u0016\u0001\u0000\u0000"+
		"\u0000ef\u0005.\u0000\u0000fg\u0005l\u0000\u0000gh\u0005i\u0000\u0000"+
		"hi\u0005s\u0000\u0000ij\u0005t\u0000\u0000j\u0018\u0001\u0000\u0000\u0000"+
		"kl\u0005m\u0000\u0000lm\u0005e\u0000\u0000mn\u0005s\u0000\u0000no\u0005"+
		"s\u0000\u0000op\u0005a\u0000\u0000pq\u0005g\u0000\u0000qr\u0005e\u0000"+
		"\u0000r\u001a\u0001\u0000\u0000\u0000sw\u0007\u0000\u0000\u0000tv\u0007"+
		"\u0001\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u001c\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z~\u0005\"\u0000\u0000{}\b\u0002"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\"\u0000\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u0003"+
		"\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u000f"+
		"\u0000\u0000\u0089 \u0001\u0000\u0000\u0000\u008a\u008b\u0005/\u0000\u0000"+
		"\u008b\u008c\u0005/\u0000\u0000\u008c\u0090\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\b\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0010\u0000\u0000\u0094\"\u0001"+
		"\u0000\u0000\u0000\u0005\u0000w~\u0086\u0090\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}