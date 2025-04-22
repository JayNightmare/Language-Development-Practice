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
	 * Enter a parse tree produced by {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(fspowParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(fspowParser.StatContext ctx);
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
	 * Enter a parse tree produced by {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(fspowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(fspowParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void enterFcCreation(fspowParser.FcCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void exitFcCreation(fspowParser.FcCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void enterSelCreation(fspowParser.SelCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void exitSelCreation(fspowParser.SelCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterSelfilter(fspowParser.SelfilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitSelfilter(fspowParser.SelfilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#topAttr}.
	 * @param ctx the parse tree
	 */
	void enterTopAttr(fspowParser.TopAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#topAttr}.
	 * @param ctx the parse tree
	 */
	void exitTopAttr(fspowParser.TopAttrContext ctx);
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