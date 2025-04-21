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
	 * Enter a parse tree produced by the {@code statAssignment}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(fspowParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAssignment}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(fspowParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFcList}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFcList(fspowParser.StatFcListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFcList}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFcList(fspowParser.StatFcListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFcApplySelector}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFcApplySelector(fspowParser.StatFcApplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFcApplySelector}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFcApplySelector(fspowParser.StatFcApplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statMessage}
	 * labeled alternative in {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatMessage(fspowParser.StatMessageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statMessage}
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
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprID(fspowParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprID(fspowParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSelCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprSelCreation(fspowParser.ExprSelCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSelCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprSelCreation(fspowParser.ExprSelCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFcCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFcCreation(fspowParser.ExprFcCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFcCreation}
	 * labeled alternative in {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFcCreation(fspowParser.ExprFcCreationContext ctx);
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
	 * Enter a parse tree produced by {@link fspowParser#fcCreationName}.
	 * @param ctx the parse tree
	 */
	void enterFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcCreationName}.
	 * @param ctx the parse tree
	 */
	void exitFcCreationName(fspowParser.FcCreationNameContext ctx);
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
	 * Enter a parse tree produced by {@link fspowParser#selCreationName}.
	 * @param ctx the parse tree
	 */
	void enterSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selCreationName}.
	 * @param ctx the parse tree
	 */
	void exitSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#filterSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFilterSpecifier(fspowParser.FilterSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#filterSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFilterSpecifier(fspowParser.FilterSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link fspowParser#applyName}.
	 * @param ctx the parse tree
	 */
	void enterApplyName(fspowParser.ApplyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#applyName}.
	 * @param ctx the parse tree
	 */
	void exitApplyName(fspowParser.ApplyNameContext ctx);
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
	 * Enter a parse tree produced by {@link fspowParser#printName}.
	 * @param ctx the parse tree
	 */
	void enterPrintName(fspowParser.PrintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#printName}.
	 * @param ctx the parse tree
	 */
	void exitPrintName(fspowParser.PrintNameContext ctx);
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
}