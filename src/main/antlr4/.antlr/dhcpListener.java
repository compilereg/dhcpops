// Generated from /home/compiler/git/dhcpparser/src/main/antlr4/dhcp.g4 by ANTLR 4.13.1

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dhcpParser}.
 */
public interface dhcpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dhcpParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(dhcpParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(dhcpParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(dhcpParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(dhcpParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#dirline}.
	 * @param ctx the parse tree
	 */
	void enterDirline(dhcpParser.DirlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#dirline}.
	 * @param ctx the parse tree
	 */
	void exitDirline(dhcpParser.DirlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#includelist}.
	 * @param ctx the parse tree
	 */
	void enterIncludelist(dhcpParser.IncludelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#includelist}.
	 * @param ctx the parse tree
	 */
	void exitIncludelist(dhcpParser.IncludelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#includeline}.
	 * @param ctx the parse tree
	 */
	void enterIncludeline(dhcpParser.IncludelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#includeline}.
	 * @param ctx the parse tree
	 */
	void exitIncludeline(dhcpParser.IncludelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#hostblocklist}.
	 * @param ctx the parse tree
	 */
	void enterHostblocklist(dhcpParser.HostblocklistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#hostblocklist}.
	 * @param ctx the parse tree
	 */
	void exitHostblocklist(dhcpParser.HostblocklistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#hostblock}.
	 * @param ctx the parse tree
	 */
	void enterHostblock(dhcpParser.HostblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#hostblock}.
	 * @param ctx the parse tree
	 */
	void exitHostblock(dhcpParser.HostblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#hostblockcontent}.
	 * @param ctx the parse tree
	 */
	void enterHostblockcontent(dhcpParser.HostblockcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#hostblockcontent}.
	 * @param ctx the parse tree
	 */
	void exitHostblockcontent(dhcpParser.HostblockcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#hostblockcontentlines}.
	 * @param ctx the parse tree
	 */
	void enterHostblockcontentlines(dhcpParser.HostblockcontentlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#hostblockcontentlines}.
	 * @param ctx the parse tree
	 */
	void exitHostblockcontentlines(dhcpParser.HostblockcontentlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#hardwareline}.
	 * @param ctx the parse tree
	 */
	void enterHardwareline(dhcpParser.HardwarelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#hardwareline}.
	 * @param ctx the parse tree
	 */
	void exitHardwareline(dhcpParser.HardwarelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#fixedaddressline}.
	 * @param ctx the parse tree
	 */
	void enterFixedaddressline(dhcpParser.FixedaddresslineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#fixedaddressline}.
	 * @param ctx the parse tree
	 */
	void exitFixedaddressline(dhcpParser.FixedaddresslineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#sharednetworkblock}.
	 * @param ctx the parse tree
	 */
	void enterSharednetworkblock(dhcpParser.SharednetworkblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#sharednetworkblock}.
	 * @param ctx the parse tree
	 */
	void exitSharednetworkblock(dhcpParser.SharednetworkblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#subnetblocklist}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblocklist(dhcpParser.SubnetblocklistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#subnetblocklist}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblocklist(dhcpParser.SubnetblocklistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#subnetblock}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblock(dhcpParser.SubnetblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#subnetblock}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblock(dhcpParser.SubnetblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnslines}.
	 * @param ctx the parse tree
	 */
	void enterDdnslines(dhcpParser.DdnslinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnslines}.
	 * @param ctx the parse tree
	 */
	void exitDdnslines(dhcpParser.DdnslinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#optionlines}.
	 * @param ctx the parse tree
	 */
	void enterOptionlines(dhcpParser.OptionlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#optionlines}.
	 * @param ctx the parse tree
	 */
	void exitOptionlines(dhcpParser.OptionlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#subnetblockcontent}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblockcontent(dhcpParser.SubnetblockcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#subnetblockcontent}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblockcontent(dhcpParser.SubnetblockcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#subnetblockcontentline}.
	 * @param ctx the parse tree
	 */
	void enterSubnetblockcontentline(dhcpParser.SubnetblockcontentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#subnetblockcontentline}.
	 * @param ctx the parse tree
	 */
	void exitSubnetblockcontentline(dhcpParser.SubnetblockcontentlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#rangeline}.
	 * @param ctx the parse tree
	 */
	void enterRangeline(dhcpParser.RangelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#rangeline}.
	 * @param ctx the parse tree
	 */
	void exitRangeline(dhcpParser.RangelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#optionsdetails}.
	 * @param ctx the parse tree
	 */
	void enterOptionsdetails(dhcpParser.OptionsdetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#optionsdetails}.
	 * @param ctx the parse tree
	 */
	void exitOptionsdetails(dhcpParser.OptionsdetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#serverslist}.
	 * @param ctx the parse tree
	 */
	void enterServerslist(dhcpParser.ServerslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#serverslist}.
	 * @param ctx the parse tree
	 */
	void exitServerslist(dhcpParser.ServerslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#domainlist}.
	 * @param ctx the parse tree
	 */
	void enterDomainlist(dhcpParser.DomainlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#domainlist}.
	 * @param ctx the parse tree
	 */
	void exitDomainlist(dhcpParser.DomainlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#nextserverline}.
	 * @param ctx the parse tree
	 */
	void enterNextserverline(dhcpParser.NextserverlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#nextserverline}.
	 * @param ctx the parse tree
	 */
	void exitNextserverline(dhcpParser.NextserverlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnsupdatestyle}.
	 * @param ctx the parse tree
	 */
	void enterDdnsupdatestyle(dhcpParser.DdnsupdatestyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnsupdatestyle}.
	 * @param ctx the parse tree
	 */
	void exitDdnsupdatestyle(dhcpParser.DdnsupdatestyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnsupdates}.
	 * @param ctx the parse tree
	 */
	void enterDdnsupdates(dhcpParser.DdnsupdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnsupdates}.
	 * @param ctx the parse tree
	 */
	void exitDdnsupdates(dhcpParser.DdnsupdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#updatestaticleases}.
	 * @param ctx the parse tree
	 */
	void enterUpdatestaticleases(dhcpParser.UpdatestaticleasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#updatestaticleases}.
	 * @param ctx the parse tree
	 */
	void exitUpdatestaticleases(dhcpParser.UpdatestaticleasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#allow}.
	 * @param ctx the parse tree
	 */
	void enterAllow(dhcpParser.AllowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#allow}.
	 * @param ctx the parse tree
	 */
	void exitAllow(dhcpParser.AllowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#defaultleasetime}.
	 * @param ctx the parse tree
	 */
	void enterDefaultleasetime(dhcpParser.DefaultleasetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#defaultleasetime}.
	 * @param ctx the parse tree
	 */
	void exitDefaultleasetime(dhcpParser.DefaultleasetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#maxleasetime}.
	 * @param ctx the parse tree
	 */
	void enterMaxleasetime(dhcpParser.MaxleasetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#maxleasetime}.
	 * @param ctx the parse tree
	 */
	void exitMaxleasetime(dhcpParser.MaxleasetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#logfacility}.
	 * @param ctx the parse tree
	 */
	void enterLogfacility(dhcpParser.LogfacilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#logfacility}.
	 * @param ctx the parse tree
	 */
	void exitLogfacility(dhcpParser.LogfacilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnsrevdomainname}.
	 * @param ctx the parse tree
	 */
	void enterDdnsrevdomainname(dhcpParser.DdnsrevdomainnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnsrevdomainname}.
	 * @param ctx the parse tree
	 */
	void exitDdnsrevdomainname(dhcpParser.DdnsrevdomainnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnsdomainname}.
	 * @param ctx the parse tree
	 */
	void enterDdnsdomainname(dhcpParser.DdnsdomainnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnsdomainname}.
	 * @param ctx the parse tree
	 */
	void exitDdnsdomainname(dhcpParser.DdnsdomainnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dhcpParser#ddnshostname}.
	 * @param ctx the parse tree
	 */
	void enterDdnshostname(dhcpParser.DdnshostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dhcpParser#ddnshostname}.
	 * @param ctx the parse tree
	 */
	void exitDdnshostname(dhcpParser.DdnshostnameContext ctx);
}