// Generated from edu/aast/cndc/dhcpparser/iscdhcp.g4 by ANTLR 4.13.1
package edu.aast.cndc.dhcpparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link iscdhcpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface iscdhcpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DHCPConfig}
	 * labeled alternative in {@link iscdhcpParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDHCPConfig(iscdhcpParser.DHCPConfigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AuthoritativeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthoritativeDirective(iscdhcpParser.AuthoritativeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllowBootingDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowBootingDirective(iscdhcpParser.AllowBootingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UpdateStaticLeasesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStaticLeasesDirective(iscdhcpParser.UpdateStaticLeasesDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultLeaseTimeDirective(iscdhcpParser.DefaultLeaseTimeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxLeaseTimeDirective(iscdhcpParser.MaxLeaseTimeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogFacilityDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogFacilityDirective(iscdhcpParser.LogFacilityDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncludeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeDirective(iscdhcpParser.IncludeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDNSUpdatesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDNSUpdatesDirective(iscdhcpParser.DDNSUpdatesDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDNSUpdateStyleDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDNSUpdateStyleDirective(iscdhcpParser.DDNSUpdateStyleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDNSDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDNSDomainNameDirective(iscdhcpParser.DDNSDomainNameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDNSHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDNSHostNameDirective(iscdhcpParser.DDNSHostNameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDNSRevDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDNSRevDomainNameDirective(iscdhcpParser.DDNSRevDomainNameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDomainNameDirective(iscdhcpParser.OptionDomainNameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionDomainNameServersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDomainNameServersDirective(iscdhcpParser.OptionDomainNameServersDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionRoutersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionRoutersDirective(iscdhcpParser.OptionRoutersDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionDomainSearchDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDomainSearchDirective(iscdhcpParser.OptionDomainSearchDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HostBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostBlockDirective(iscdhcpParser.HostBlockDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubnetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnetBlockDirective(iscdhcpParser.SubnetBlockDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SharedNetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedNetBlockDirective(iscdhcpParser.SharedNetBlockDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#keyblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyBlockDirective(iscdhcpParser.KeyBlockDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ZoneBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#zoneblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZoneBlockDirective(iscdhcpParser.ZoneBlockDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link iscdhcpParser#sharednetblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharednetblock(iscdhcpParser.SharednetblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link iscdhcpParser#subnetblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnetblock(iscdhcpParser.SubnetblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RangeDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeDirective(iscdhcpParser.RangeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionSubnetMaskDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionSubnetMaskDirective(iscdhcpParser.OptionSubnetMaskDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NextServerDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextServerDirective(iscdhcpParser.NextServerDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilenameDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilenameDirective(iscdhcpParser.FilenameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommonConfLineInSubnetblock}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonConfLineInSubnetblock(iscdhcpParser.CommonConfLineInSubnetblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link iscdhcpParser#hostblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostblock(iscdhcpParser.HostblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HardwareEthernetDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardwareEthernetDirective(iscdhcpParser.HardwareEthernetDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FixedAddressDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedAddressDirective(iscdhcpParser.FixedAddressDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionHostNameDirective(iscdhcpParser.OptionHostNameDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommonConfLineInHostblock}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonConfLineInHostblock(iscdhcpParser.CommonConfLineInHostblockContext ctx);
}