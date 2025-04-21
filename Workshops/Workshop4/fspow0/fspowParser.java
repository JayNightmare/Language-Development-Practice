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
		T__9=10, ID=11, STRING=12, WS=13, COMMENT=14;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expression = 3, 
		RULE_fcCreation = 4, RULE_fcCreationName = 5, RULE_rootSpecifier = 6, 
		RULE_selCreation = 7, RULE_selCreationName = 8, RULE_filterSpecifier = 9, 
		RULE_selfilter = 10, RULE_fcApplySelector = 11, RULE_applyName = 12, RULE_fcList = 13, 
		RULE_printName = 14, RULE_message = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "assignment", "expression", "fcCreation", "fcCreationName", 
			"rootSpecifier", "selCreation", "selCreationName", "filterSpecifier", 
			"selfilter", "fcApplySelector", "applyName", "fcList", "printName", "message"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'FileCollection'", "'Selector'", "'name'", 
			"'.'", "'apply'", "'print()'", "'message'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"STRING", "WS", "COMMENT"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 || _la==ID );
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				assignment();
				}
				break;
			case 2:
				_localctx = new StatFcListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				fcList();
				}
				break;
			case 3:
				_localctx = new StatFcApplySelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				fcApplySelector();
				}
				break;
			case 4:
				_localctx = new StatMessageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
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
			setState(43);
			match(ID);
			setState(44);
			match(T__0);
			setState(45);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ExprIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ID);
				}
				break;
			case T__4:
				_localctx = new ExprSelCreationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				selCreation();
				}
				break;
			case T__3:
				_localctx = new ExprFcCreationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				fcCreation();
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
		public FcCreationNameContext fcCreationName() {
			return getRuleContext(FcCreationNameContext.class,0);
		}
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
			setState(52);
			fcCreationName();
			setState(53);
			match(T__1);
			setState(54);
			rootSpecifier();
			setState(55);
			match(T__2);
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
	public static class FcCreationNameContext extends ParserRuleContext {
		public FcCreationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcCreationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcCreationName(this);
		}
	}

	public final FcCreationNameContext fcCreationName() throws RecognitionException {
		FcCreationNameContext _localctx = new FcCreationNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fcCreationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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
		enterRule(_localctx, 12, RULE_rootSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelCreationContext extends ParserRuleContext {
		public SelCreationNameContext selCreationName() {
			return getRuleContext(SelCreationNameContext.class,0);
		}
		public FilterSpecifierContext filterSpecifier() {
			return getRuleContext(FilterSpecifierContext.class,0);
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
		enterRule(_localctx, 14, RULE_selCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			selCreationName();
			setState(62);
			match(T__1);
			setState(63);
			filterSpecifier();
			setState(64);
			match(T__2);
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
	public static class SelCreationNameContext extends ParserRuleContext {
		public SelCreationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selCreationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelCreationName(this);
		}
	}

	public final SelCreationNameContext selCreationName() throws RecognitionException {
		SelCreationNameContext _localctx = new SelCreationNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selCreationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
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
	public static class FilterSpecifierContext extends ParserRuleContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public FilterSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterSpecifier(this);
		}
	}

	public final FilterSpecifierContext filterSpecifier() throws RecognitionException {
		FilterSpecifierContext _localctx = new FilterSpecifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filterSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			selfilter();
			setState(69);
			match(T__1);
			setState(70);
			match(STRING);
			setState(71);
			match(T__2);
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
		SelfilterContext _localctx = new SelfilterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selfilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
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
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public ApplyNameContext applyName() {
			return getRuleContext(ApplyNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 22, RULE_fcApplySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(T__6);
			setState(77);
			applyName();
			setState(78);
			match(T__1);
			setState(79);
			expression();
			setState(80);
			match(T__2);
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
	public static class ApplyNameContext extends ParserRuleContext {
		public ApplyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterApplyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitApplyName(this);
		}
	}

	public final ApplyNameContext applyName() throws RecognitionException {
		ApplyNameContext _localctx = new ApplyNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_applyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
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
		public PrintNameContext printName() {
			return getRuleContext(PrintNameContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_fcList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(T__6);
			setState(86);
			printName();
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
	public static class PrintNameContext extends ParserRuleContext {
		public PrintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterPrintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitPrintName(this);
		}
	}

	public final PrintNameContext printName() throws RecognitionException {
		PrintNameContext _localctx = new PrintNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__8);
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
		enterRule(_localctx, 30, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__9);
			setState(91);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e^\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00033\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000"+
		"S\u0000!\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004"+
		"+\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b4\u0001\u0000"+
		"\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e"+
		"=\u0001\u0000\u0000\u0000\u0010B\u0001\u0000\u0000\u0000\u0012D\u0001"+
		"\u0000\u0000\u0000\u0014I\u0001\u0000\u0000\u0000\u0016K\u0001\u0000\u0000"+
		"\u0000\u0018R\u0001\u0000\u0000\u0000\u001aT\u0001\u0000\u0000\u0000\u001c"+
		"X\u0001\u0000\u0000\u0000\u001eZ\u0001\u0000\u0000\u0000 \"\u0003\u0002"+
		"\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000"+
		"\u0000%*\u0003\u0004\u0002\u0000&*\u0003\u001a\r\u0000\'*\u0003\u0016"+
		"\u000b\u0000(*\u0003\u001e\u000f\u0000)%\u0001\u0000\u0000\u0000)&\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*\u0003\u0001\u0000\u0000\u0000+,\u0005\u000b\u0000\u0000,-\u0005\u0001"+
		"\u0000\u0000-.\u0003\u0006\u0003\u0000.\u0005\u0001\u0000\u0000\u0000"+
		"/3\u0005\u000b\u0000\u000003\u0003\u000e\u0007\u000013\u0003\b\u0004\u0000"+
		"2/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\u0007\u0001\u0000\u0000\u000045\u0003\n\u0005\u000056\u0005\u0002"+
		"\u0000\u000067\u0003\f\u0006\u000078\u0005\u0003\u0000\u00008\t\u0001"+
		"\u0000\u0000\u00009:\u0005\u0004\u0000\u0000:\u000b\u0001\u0000\u0000"+
		"\u0000;<\u0005\f\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0003\u0010"+
		"\b\u0000>?\u0005\u0002\u0000\u0000?@\u0003\u0012\t\u0000@A\u0005\u0003"+
		"\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BC\u0005\u0005\u0000\u0000"+
		"C\u0011\u0001\u0000\u0000\u0000DE\u0003\u0014\n\u0000EF\u0005\u0002\u0000"+
		"\u0000FG\u0005\f\u0000\u0000GH\u0005\u0003\u0000\u0000H\u0013\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0006\u0000\u0000J\u0015\u0001\u0000\u0000\u0000"+
		"KL\u0005\u000b\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0003\u0018\f\u0000"+
		"NO\u0005\u0002\u0000\u0000OP\u0003\u0006\u0003\u0000PQ\u0005\u0003\u0000"+
		"\u0000Q\u0017\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000S\u0019\u0001"+
		"\u0000\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0005\u0007\u0000\u0000"+
		"VW\u0003\u001c\u000e\u0000W\u001b\u0001\u0000\u0000\u0000XY\u0005\t\u0000"+
		"\u0000Y\u001d\u0001\u0000\u0000\u0000Z[\u0005\n\u0000\u0000[\\\u0005\f"+
		"\u0000\u0000\\\u001f\u0001\u0000\u0000\u0000\u0003#)2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}