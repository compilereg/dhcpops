// Generated from /home/compiler/git/dhcpparser/src/main/antlr4/iscdhcp.g4 by ANTLR 4.13.1

        package antlr;
    
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iscdhcpParser}.
 */
public interface iscdhcpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(iscdhcpParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(iscdhcpParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterServerconfline(iscdhcpParser.ServerconflineContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitServerconfline(iscdhcpParser.ServerconflineContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterCommonconfline(iscdhcpParser.CommonconflineContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitCommonconfline(iscdhcpParser.CommonconflineContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void enterConfblock(iscdhcpParser.ConfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void exitConfblock(iscdhcpParser.ConfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#sharednetblock}.
	 * @param ctx the parse tree
	 */
	void enterSharednetblock(iscdhcpParser.SharednetblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#sharednetblock}.
	 * @param ctx the parse tree
	 */
	void exitSharednetblock(iscdhcpParser.SharednetblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#subnetblock}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblock(iscdhcpParser.SubnetblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#subnetblock}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblock(iscdhcpParser.SubnetblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblockbody(iscdhcpParser.SubnetblockbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblockbody(iscdhcpParser.SubnetblockbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#hostblock}.
	 * @param ctx the parse tree
	 */
	void enterHostblock(iscdhcpParser.HostblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#hostblock}.
	 * @param ctx the parse tree
	 */
	void exitHostblock(iscdhcpParser.HostblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link iscdhcpParser#hostblockbody}.
	 * @param ctx the parse tree
	 */
	void enterHostblockbody(iscdhcpParser.HostblockbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link iscdhcpParser#hostblockbody}.
	 * @param ctx the parse tree
	 */
	void exitHostblockbody(iscdhcpParser.HostblockbodyContext ctx);
}