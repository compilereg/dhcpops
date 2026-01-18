// Generated from /home/compiler/git/dhcpops/src/main/antlr4/edu/aast/cndc/dhcpparser/iscdhcp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iscdhcpParser}.
 */
public interface iscdhcpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DHCPConfig}
	 * labeled alternative in {@link iscdhcpParser#config}.
	 * @param ctx the parse tree
	 */
	void enterDHCPConfig(iscdhcpParser.DHCPConfigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DHCPConfig}
	 * labeled alternative in {@link iscdhcpParser#config}.
	 * @param ctx the parse tree
	 */
	void exitDHCPConfig(iscdhcpParser.DHCPConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AuthoritativeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterAuthoritativeDirective(iscdhcpParser.AuthoritativeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AuthoritativeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitAuthoritativeDirective(iscdhcpParser.AuthoritativeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllowBootingDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterAllowBootingDirective(iscdhcpParser.AllowBootingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllowBootingDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitAllowBootingDirective(iscdhcpParser.AllowBootingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpdateStaticLeasesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStaticLeasesDirective(iscdhcpParser.UpdateStaticLeasesDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpdateStaticLeasesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStaticLeasesDirective(iscdhcpParser.UpdateStaticLeasesDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLeaseTimeDirective(iscdhcpParser.DefaultLeaseTimeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLeaseTimeDirective(iscdhcpParser.DefaultLeaseTimeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterMaxLeaseTimeDirective(iscdhcpParser.MaxLeaseTimeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxLeaseTimeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitMaxLeaseTimeDirective(iscdhcpParser.MaxLeaseTimeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogFacilityDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterLogFacilityDirective(iscdhcpParser.LogFacilityDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogFacilityDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitLogFacilityDirective(iscdhcpParser.LogFacilityDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncludeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDirective(iscdhcpParser.IncludeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncludeDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDirective(iscdhcpParser.IncludeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDNSUpdatesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterDDNSUpdatesDirective(iscdhcpParser.DDNSUpdatesDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDNSUpdatesDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitDDNSUpdatesDirective(iscdhcpParser.DDNSUpdatesDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDNSUpdateStyleDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void enterDDNSUpdateStyleDirective(iscdhcpParser.DDNSUpdateStyleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDNSUpdateStyleDirective}
	 * labeled alternative in {@link iscdhcpParser#serverconfline}.
	 * @param ctx the parse tree
	 */
	void exitDDNSUpdateStyleDirective(iscdhcpParser.DDNSUpdateStyleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDNSDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterDDNSDomainNameDirective(iscdhcpParser.DDNSDomainNameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDNSDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitDDNSDomainNameDirective(iscdhcpParser.DDNSDomainNameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDNSHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterDDNSHostNameDirective(iscdhcpParser.DDNSHostNameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDNSHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitDDNSHostNameDirective(iscdhcpParser.DDNSHostNameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDNSRevDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterDDNSRevDomainNameDirective(iscdhcpParser.DDNSRevDomainNameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDNSRevDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitDDNSRevDomainNameDirective(iscdhcpParser.DDNSRevDomainNameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterOptionDomainNameDirective(iscdhcpParser.OptionDomainNameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionDomainNameDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitOptionDomainNameDirective(iscdhcpParser.OptionDomainNameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionDomainNameServersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterOptionDomainNameServersDirective(iscdhcpParser.OptionDomainNameServersDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionDomainNameServersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitOptionDomainNameServersDirective(iscdhcpParser.OptionDomainNameServersDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionRoutersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterOptionRoutersDirective(iscdhcpParser.OptionRoutersDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionRoutersDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitOptionRoutersDirective(iscdhcpParser.OptionRoutersDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionDomainSearchDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void enterOptionDomainSearchDirective(iscdhcpParser.OptionDomainSearchDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionDomainSearchDirective}
	 * labeled alternative in {@link iscdhcpParser#commonconfline}.
	 * @param ctx the parse tree
	 */
	void exitOptionDomainSearchDirective(iscdhcpParser.OptionDomainSearchDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HostBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void enterHostBlockDirective(iscdhcpParser.HostBlockDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HostBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void exitHostBlockDirective(iscdhcpParser.HostBlockDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubnetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void enterSubnetBlockDirective(iscdhcpParser.SubnetBlockDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubnetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void exitSubnetBlockDirective(iscdhcpParser.SubnetBlockDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SharedNetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void enterSharedNetBlockDirective(iscdhcpParser.SharedNetBlockDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SharedNetBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#confblock}.
	 * @param ctx the parse tree
	 */
	void exitSharedNetBlockDirective(iscdhcpParser.SharedNetBlockDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#keyblock}.
	 * @param ctx the parse tree
	 */
	void enterKeyBlockDirective(iscdhcpParser.KeyBlockDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#keyblock}.
	 * @param ctx the parse tree
	 */
	void exitKeyBlockDirective(iscdhcpParser.KeyBlockDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ZoneBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#zoneblock}.
	 * @param ctx the parse tree
	 */
	void enterZoneBlockDirective(iscdhcpParser.ZoneBlockDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ZoneBlockDirective}
	 * labeled alternative in {@link iscdhcpParser#zoneblock}.
	 * @param ctx the parse tree
	 */
	void exitZoneBlockDirective(iscdhcpParser.ZoneBlockDirectiveContext ctx);
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
	 * Enter a parse tree produced by the {@code RangeDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterRangeDirective(iscdhcpParser.RangeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitRangeDirective(iscdhcpParser.RangeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionSubnetMaskDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterOptionSubnetMaskDirective(iscdhcpParser.OptionSubnetMaskDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionSubnetMaskDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitOptionSubnetMaskDirective(iscdhcpParser.OptionSubnetMaskDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NextServerDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterNextServerDirective(iscdhcpParser.NextServerDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NextServerDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitNextServerDirective(iscdhcpParser.NextServerDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilenameDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterFilenameDirective(iscdhcpParser.FilenameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilenameDirective}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitFilenameDirective(iscdhcpParser.FilenameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommonConfLineInSubnetblock}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void enterCommonConfLineInSubnetblock(iscdhcpParser.CommonConfLineInSubnetblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommonConfLineInSubnetblock}
	 * labeled alternative in {@link iscdhcpParser#subnetblockbody}.
	 * @param ctx the parse tree
	 */
	void exitCommonConfLineInSubnetblock(iscdhcpParser.CommonConfLineInSubnetblockContext ctx);
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
	 * Enter a parse tree produced by the {@code HardwareEthernetDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void enterHardwareEthernetDirective(iscdhcpParser.HardwareEthernetDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HardwareEthernetDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void exitHardwareEthernetDirective(iscdhcpParser.HardwareEthernetDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FixedAddressDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void enterFixedAddressDirective(iscdhcpParser.FixedAddressDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FixedAddressDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void exitFixedAddressDirective(iscdhcpParser.FixedAddressDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void enterOptionHostNameDirective(iscdhcpParser.OptionHostNameDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionHostNameDirective}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void exitOptionHostNameDirective(iscdhcpParser.OptionHostNameDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommonConfLineInHostblock}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void enterCommonConfLineInHostblock(iscdhcpParser.CommonConfLineInHostblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommonConfLineInHostblock}
	 * labeled alternative in {@link iscdhcpParser#hostblockbody1}.
	 * @param ctx the parse tree
	 */
	void exitCommonConfLineInHostblock(iscdhcpParser.CommonConfLineInHostblockContext ctx);
}