// Generated from simple.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(simpleParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(simpleParser.SimpleContext ctx);
}