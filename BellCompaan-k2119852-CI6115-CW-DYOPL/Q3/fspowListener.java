// Generated from fspow.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fspowParser}.
 */
public interface fspowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fspowParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fspowParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fspowParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(fspowParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(fspowParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFcApplySelector}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFcApplySelector(fspowParser.StatFcApplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFcApplySelector}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFcApplySelector(fspowParser.StatFcApplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFcList}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFcList(fspowParser.StatFcListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFcList}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFcList(fspowParser.StatFcListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatMessage}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatMessage(fspowParser.StatMessageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatMessage}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatMessage(fspowParser.StatMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(fspowParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(fspowParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFcCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFcCreation(fspowParser.ExprFcCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFcCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFcCreation(fspowParser.ExprFcCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSelCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprSelCreation(fspowParser.ExprSelCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSelCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprSelCreation(fspowParser.ExprSelCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprID(fspowParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprID(fspowParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FcCreationName}
	 * labeled alternative in {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void enterFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FcCreationName}
	 * labeled alternative in {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void exitFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelCreationName}
	 * labeled alternative in {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void enterSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelCreationName}
	 * labeled alternative in {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void exitSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(fspowParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(fspowParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterSize}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterSize(fspowParser.FilterSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterSize}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterSize(fspowParser.FilterSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterParens}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterParens(fspowParser.FilterParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterParens}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterParens(fspowParser.FilterParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterName}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterName(fspowParser.FilterNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterName}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterName(fspowParser.FilterNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterDate}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterDate(fspowParser.FilterDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterDate}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterDate(fspowParser.FilterDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterIntersect}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterIntersect(fspowParser.FilterIntersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterIntersect}
	 * labeled alternative in {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterIntersect(fspowParser.FilterIntersectContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcApplySelector}.
	 * @param ctx the parse tree
	 */
	void enterFcApplySelector(fspowParser.FcApplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcApplySelector}.
	 * @param ctx the parse tree
	 */
	void exitFcApplySelector(fspowParser.FcApplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcList}.
	 * @param ctx the parse tree
	 */
	void enterFcList(fspowParser.FcListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcList}.
	 * @param ctx the parse tree
	 */
	void exitFcList(fspowParser.FcListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(fspowParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(fspowParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterRootSpecifier(fspowParser.RootSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitRootSpecifier(fspowParser.RootSpecifierContext ctx);
}