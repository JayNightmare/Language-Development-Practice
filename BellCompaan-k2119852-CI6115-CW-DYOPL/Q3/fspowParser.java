// Generated from fspow.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class fspowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, STRING=21, COMMA=22, NUMBER=23, WS=24, COMMENT=25;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expression = 3, 
		RULE_fcCreation = 4, RULE_selCreation = 5, RULE_selfilter = 6, RULE_topAttr = 7, 
		RULE_fcApplySelector = 8, RULE_fcList = 9, RULE_message = 10, RULE_rootSpecifier = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "assignment", "expression", "fcCreation", "selCreation", 
			"selfilter", "topAttr", "fcApplySelector", "fcList", "message", "rootSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'FileCollection'", "'('", "')'", "'Selector'", "'name'", 
			"'size'", "'date'", "'top'", "'intersect'", "'not'", "'Biggest'", "'Smallest'", 
			"'Oldest'", "'Newest'", "'.'", "'apply'", "'.list'", "'message'", null, 
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "STRING", "COMMA", 
			"NUMBER", "WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "fspow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fspowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(fspowParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 || _la==ID );
			setState(29);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FcApplySelectorContext fcApplySelector() {
			return getRuleContext(FcApplySelectorContext.class,0);
		}
		public FcListContext fcList() {
			return getRuleContext(FcListContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				fcApplySelector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				fcList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				message();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
			setState(38);
			match(T__0);
			setState(39);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public FcCreationContext fcCreation() {
			return getRuleContext(FcCreationContext.class,0);
		}
		public SelCreationContext selCreation() {
			return getRuleContext(SelCreationContext.class,0);
		}
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				fcCreation();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				selCreation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FcCreationContext extends ParserRuleContext {
		public RootSpecifierContext rootSpecifier() {
			return getRuleContext(RootSpecifierContext.class,0);
		}
		public FcCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcCreation(this);
		}
	}

	public final FcCreationContext fcCreation() throws RecognitionException {
		FcCreationContext _localctx = new FcCreationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fcCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			rootSpecifier();
			setState(49);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelCreationContext extends ParserRuleContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public SelCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelCreation(this);
		}
	}

	public final SelCreationContext selCreation() throws RecognitionException {
		SelCreationContext _localctx = new SelCreationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(T__2);
			setState(53);
			selfilter(0);
			setState(54);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfilterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(fspowParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(fspowParser.COMMA, 0); }
		public TopAttrContext topAttr() {
			return getRuleContext(TopAttrContext.class,0);
		}
		public List<SelfilterContext> selfilter() {
			return getRuleContexts(SelfilterContext.class);
		}
		public SelfilterContext selfilter(int i) {
			return getRuleContext(SelfilterContext.class,i);
		}
		public SelfilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelfilter(this);
		}
	}

	public final SelfilterContext selfilter() throws RecognitionException {
		return selfilter(0);
	}

	private SelfilterContext selfilter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelfilterContext _localctx = new SelfilterContext(_ctx, _parentState);
		SelfilterContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_selfilter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(57);
				match(T__5);
				setState(58);
				match(T__2);
				setState(59);
				match(STRING);
				setState(60);
				match(T__3);
				}
				break;
			case T__6:
				{
				setState(61);
				match(T__6);
				setState(62);
				match(T__2);
				setState(63);
				match(STRING);
				setState(64);
				match(T__3);
				}
				break;
			case T__7:
				{
				setState(65);
				match(T__7);
				setState(66);
				match(T__2);
				setState(67);
				match(STRING);
				setState(68);
				match(T__3);
				}
				break;
			case T__8:
				{
				setState(69);
				match(T__8);
				setState(70);
				match(T__2);
				setState(71);
				match(NUMBER);
				setState(72);
				match(COMMA);
				setState(73);
				topAttr();
				setState(74);
				match(T__3);
				}
				break;
			case T__10:
				{
				setState(76);
				match(T__10);
				setState(77);
				match(T__2);
				setState(78);
				selfilter(0);
				setState(79);
				match(T__3);
				}
				break;
			case T__2:
				{
				setState(81);
				match(T__2);
				setState(82);
				selfilter(0);
				setState(83);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelfilterContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selfilter);
					setState(87);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(88);
					match(T__9);
					setState(89);
					selfilter(4);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopAttrContext extends ParserRuleContext {
		public TopAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterTopAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitTopAttr(this);
		}
	}

	public final TopAttrContext topAttr() throws RecognitionException {
		TopAttrContext _localctx = new TopAttrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FcApplySelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(fspowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fspowParser.ID, i);
		}
		public FcApplySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcApplySelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcApplySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcApplySelector(this);
		}
	}

	public final FcApplySelectorContext fcApplySelector() throws RecognitionException {
		FcApplySelectorContext _localctx = new FcApplySelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fcApplySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(T__0);
			setState(99);
			match(ID);
			setState(100);
			match(T__15);
			setState(101);
			match(T__16);
			setState(102);
			match(T__2);
			setState(103);
			match(ID);
			setState(104);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FcListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public FcListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcList(this);
		}
	}

	public final FcListContext fcList() throws RecognitionException {
		FcListContext _localctx = new FcListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fcList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(T__17);
			setState(108);
			match(T__2);
			setState(109);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__18);
			setState(112);
			match(T__2);
			setState(113);
			match(STRING);
			setState(114);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootSpecifierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public RootSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterRootSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitRootSpecifier(this);
		}
	}

	public final RootSpecifierContext rootSpecifier() throws RecognitionException {
		RootSpecifierContext _localctx = new RootSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rootSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return selfilter_sempred((SelfilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selfilter_sempred(SelfilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019w\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0001\f\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000"+
		"\f\u000fv\u0000\u0019\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		".\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000"+
		"\u0000\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012"+
		"j\u0001\u0000\u0000\u0000\u0014o\u0001\u0000\u0000\u0000\u0016t\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001"+
		"\u0000\u0000\u0000\u001f$\u0003\u0004\u0002\u0000 $\u0003\u0010\b\u0000"+
		"!$\u0003\u0012\t\u0000\"$\u0003\u0014\n\u0000#\u001f\u0001\u0000\u0000"+
		"\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0014\u0000\u0000"+
		"&\'\u0005\u0001\u0000\u0000\'(\u0003\u0006\u0003\u0000(\u0005\u0001\u0000"+
		"\u0000\u0000)-\u0003\b\u0004\u0000*-\u0003\n\u0005\u0000+-\u0005\u0014"+
		"\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\u0002\u0000"+
		"\u0000/0\u0005\u0003\u0000\u000001\u0003\u0016\u000b\u000012\u0005\u0004"+
		"\u0000\u00002\t\u0001\u0000\u0000\u000034\u0005\u0005\u0000\u000045\u0005"+
		"\u0003\u0000\u000056\u0003\f\u0006\u000067\u0005\u0004\u0000\u00007\u000b"+
		"\u0001\u0000\u0000\u000089\u0006\u0006\uffff\uffff\u00009:\u0005\u0006"+
		"\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005\u0015\u0000\u0000<V\u0005"+
		"\u0004\u0000\u0000=>\u0005\u0007\u0000\u0000>?\u0005\u0003\u0000\u0000"+
		"?@\u0005\u0015\u0000\u0000@V\u0005\u0004\u0000\u0000AB\u0005\b\u0000\u0000"+
		"BC\u0005\u0003\u0000\u0000CD\u0005\u0015\u0000\u0000DV\u0005\u0004\u0000"+
		"\u0000EF\u0005\t\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0005\u0017\u0000"+
		"\u0000HI\u0005\u0016\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\u0004"+
		"\u0000\u0000KV\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000\u0000MN\u0005"+
		"\u0003\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005\u0004\u0000\u0000PV\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005"+
		"\u0004\u0000\u0000TV\u0001\u0000\u0000\u0000U8\u0001\u0000\u0000\u0000"+
		"U=\u0001\u0000\u0000\u0000UA\u0001\u0000\u0000\u0000UE\u0001\u0000\u0000"+
		"\u0000UL\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000V\\\u0001\u0000"+
		"\u0000\u0000WX\n\u0003\u0000\u0000XY\u0005\n\u0000\u0000Y[\u0003\f\u0006"+
		"\u0004ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000^\\"+
		"\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000\u0000`\u000f\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0014\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0005"+
		"\u0014\u0000\u0000de\u0005\u0010\u0000\u0000ef\u0005\u0011\u0000\u0000"+
		"fg\u0005\u0003\u0000\u0000gh\u0005\u0014\u0000\u0000hi\u0005\u0004\u0000"+
		"\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0005\u0014\u0000\u0000kl\u0005"+
		"\u0012\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005\u0004\u0000\u0000"+
		"n\u0013\u0001\u0000\u0000\u0000op\u0005\u0013\u0000\u0000pq\u0005\u0003"+
		"\u0000\u0000qr\u0005\u0015\u0000\u0000rs\u0005\u0004\u0000\u0000s\u0015"+
		"\u0001\u0000\u0000\u0000tu\u0005\u0015\u0000\u0000u\u0017\u0001\u0000"+
		"\u0000\u0000\u0005\u001b#,U\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}