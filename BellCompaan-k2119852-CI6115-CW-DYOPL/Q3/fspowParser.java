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
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, STRING=15, WS=16, COMMENT=17;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expression = 3, 
		RULE_fcCreation = 4, RULE_selCreation = 5, RULE_selfilter = 6, RULE_fcApplySelector = 7, 
		RULE_fcList = 8, RULE_message = 9, RULE_rootSpecifier = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "assignment", "expression", "fcCreation", "selCreation", 
			"selfilter", "fcApplySelector", "fcList", "message", "rootSpecifier"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==ID );
			setState(27);
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatAssignmentContext extends StatContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatAssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStatAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStatAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatMessageContext extends StatContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public StatMessageContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStatMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStatMessage(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatFcApplySelectorContext extends StatContext {
		public FcApplySelectorContext fcApplySelector() {
			return getRuleContext(FcApplySelectorContext.class,0);
		}
		public StatFcApplySelectorContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStatFcApplySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStatFcApplySelector(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatFcListContext extends StatContext {
		public FcListContext fcList() {
			return getRuleContext(FcListContext.class,0);
		}
		public StatFcListContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStatFcList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStatFcList(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assignment();
				}
				break;
			case 2:
				_localctx = new StatFcApplySelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				fcApplySelector();
				}
				break;
			case 3:
				_localctx = new StatFcListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				fcList();
				}
				break;
			case 4:
				_localctx = new StatMessageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
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
			setState(35);
			match(ID);
			setState(36);
			match(T__0);
			setState(37);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSelCreationContext extends ExpressionContext {
		public SelCreationContext selCreation() {
			return getRuleContext(SelCreationContext.class,0);
		}
		public ExprSelCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterExprSelCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitExprSelCreation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFcCreationContext extends ExpressionContext {
		public FcCreationContext fcCreation() {
			return getRuleContext(FcCreationContext.class,0);
		}
		public ExprFcCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterExprFcCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitExprFcCreation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public ExprIDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitExprID(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ExprFcCreationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				fcCreation();
				}
				break;
			case T__4:
				_localctx = new ExprSelCreationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				selCreation();
				}
				break;
			case ID:
				_localctx = new ExprIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
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
		public FcCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcCreation; }
	 
		public FcCreationContext() { }
		public void copyFrom(FcCreationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FcCreationNameContext extends FcCreationContext {
		public RootSpecifierContext rootSpecifier() {
			return getRuleContext(RootSpecifierContext.class,0);
		}
		public FcCreationNameContext(FcCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcCreationName(this);
		}
	}

	public final FcCreationContext fcCreation() throws RecognitionException {
		FcCreationContext _localctx = new FcCreationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fcCreation);
		try {
			_localctx = new FcCreationNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			rootSpecifier();
			setState(47);
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
		public SelCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selCreation; }
	 
		public SelCreationContext() { }
		public void copyFrom(SelCreationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelCreationNameContext extends SelCreationContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public SelCreationNameContext(SelCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelCreationName(this);
		}
	}

	public final SelCreationContext selCreation() throws RecognitionException {
		SelCreationContext _localctx = new SelCreationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selCreation);
		try {
			_localctx = new SelCreationNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__4);
			setState(50);
			match(T__2);
			setState(51);
			selfilter(0);
			setState(52);
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
		public SelfilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfilter; }
	 
		public SelfilterContext() { }
		public void copyFrom(SelfilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterNotContext extends SelfilterContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public FilterNotContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterSizeContext extends SelfilterContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public FilterSizeContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterSize(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterParensContext extends SelfilterContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public FilterParensContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterNameContext extends SelfilterContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public FilterNameContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterName(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterDateContext extends SelfilterContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public FilterDateContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterDate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterIntersectContext extends SelfilterContext {
		public List<SelfilterContext> selfilter() {
			return getRuleContexts(SelfilterContext.class);
		}
		public SelfilterContext selfilter(int i) {
			return getRuleContext(SelfilterContext.class,i);
		}
		public FilterIntersectContext(SelfilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterIntersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterIntersect(this);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new FilterNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(T__5);
				setState(56);
				match(T__2);
				setState(57);
				match(STRING);
				setState(58);
				match(T__3);
				}
				break;
			case T__6:
				{
				_localctx = new FilterSizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__6);
				setState(60);
				match(T__2);
				setState(61);
				match(STRING);
				setState(62);
				match(T__3);
				}
				break;
			case T__7:
				{
				_localctx = new FilterDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__7);
				setState(64);
				match(T__2);
				setState(65);
				match(STRING);
				setState(66);
				match(T__3);
				}
				break;
			case T__9:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__9);
				setState(68);
				match(T__2);
				setState(69);
				selfilter(0);
				setState(70);
				match(T__3);
				}
				break;
			case T__2:
				{
				_localctx = new FilterParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__2);
				setState(73);
				selfilter(0);
				setState(74);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterIntersectContext(new SelfilterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_selfilter);
					setState(78);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(79);
					match(T__8);
					setState(80);
					selfilter(4);
					}
					} 
				}
				setState(85);
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
		enterRule(_localctx, 14, RULE_fcApplySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(T__10);
			setState(88);
			match(T__2);
			setState(89);
			match(ID);
			setState(90);
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
		enterRule(_localctx, 16, RULE_fcList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(T__11);
			setState(94);
			match(T__2);
			setState(95);
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
		enterRule(_localctx, 18, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__12);
			setState(98);
			match(T__2);
			setState(99);
			match(STRING);
			setState(100);
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
		enterRule(_localctx, 20, RULE_rootSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		"\u0004\u0001\u0011i\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006M\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006R\b\u0006\n\u0006\f\u0006"+
		"U\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0001\f\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000h\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000"+
		"\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n1\u0001"+
		"\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000"+
		"\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000"+
		"\u0014f\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\"\u0003\u0004\u0002\u0000\u001e\""+
		"\u0003\u000e\u0007\u0000\u001f\"\u0003\u0010\b\u0000 \"\u0003\u0012\t"+
		"\u0000!\u001d\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#$\u0005\u000e\u0000\u0000$%\u0005\u0001\u0000\u0000"+
		"%&\u0003\u0006\u0003\u0000&\u0005\u0001\u0000\u0000\u0000\'+\u0003\b\u0004"+
		"\u0000(+\u0003\n\u0005\u0000)+\u0005\u000e\u0000\u0000*\'\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0007"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005\u0003\u0000"+
		"\u0000./\u0003\u0014\n\u0000/0\u0005\u0004\u0000\u00000\t\u0001\u0000"+
		"\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u0003\u0000\u000034\u0003"+
		"\f\u0006\u000045\u0005\u0004\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"67\u0006\u0006\uffff\uffff\u000078\u0005\u0006\u0000\u000089\u0005\u0003"+
		"\u0000\u00009:\u0005\u000f\u0000\u0000:M\u0005\u0004\u0000\u0000;<\u0005"+
		"\u0007\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\u000f\u0000\u0000"+
		">M\u0005\u0004\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\u0003\u0000\u0000"+
		"AB\u0005\u000f\u0000\u0000BM\u0005\u0004\u0000\u0000CD\u0005\n\u0000\u0000"+
		"DE\u0005\u0003\u0000\u0000EF\u0003\f\u0006\u0000FG\u0005\u0004\u0000\u0000"+
		"GM\u0001\u0000\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0003\f\u0006\u0000"+
		"JK\u0005\u0004\u0000\u0000KM\u0001\u0000\u0000\u0000L6\u0001\u0000\u0000"+
		"\u0000L;\u0001\u0000\u0000\u0000L?\u0001\u0000\u0000\u0000LC\u0001\u0000"+
		"\u0000\u0000LH\u0001\u0000\u0000\u0000MS\u0001\u0000\u0000\u0000NO\n\u0003"+
		"\u0000\u0000OP\u0005\t\u0000\u0000PR\u0003\f\u0006\u0004QN\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0005\u000e\u0000\u0000WX\u0005\u000b\u0000\u0000XY\u0005\u0003\u0000"+
		"\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\u0004\u0000\u0000[\u000f\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u000e\u0000\u0000]^\u0005\f\u0000\u0000^_"+
		"\u0005\u0003\u0000\u0000_`\u0005\u0004\u0000\u0000`\u0011\u0001\u0000"+
		"\u0000\u0000ab\u0005\r\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0005\u000f"+
		"\u0000\u0000de\u0005\u0004\u0000\u0000e\u0013\u0001\u0000\u0000\u0000"+
		"fg\u0005\u000f\u0000\u0000g\u0015\u0001\u0000\u0000\u0000\u0005\u0019"+
		"!*LS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}