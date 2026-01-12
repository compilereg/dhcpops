package listeners;

import edu.aast.cndc.dhcpparser.iscdhcpBaseListener;
import edu.aast.cndc.dhcpparser.iscdhcpParser.AllowBootingDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.AuthoritativeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DDNSDomainNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DDNSHostNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DDNSRevDomainNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DDNSUpdateStyleDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DDNSUpdatesDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DHCPConfigContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DefaultLeaseTimeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.FixedAddressDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HardwareEthernetDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HostBlockDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HostblockContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.IncludeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.LogFacilityDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.MaxLeaseTimeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameServersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainSearchDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionHostNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionRoutersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionSubnetMaskDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.UpdateStaticLeasesDirectiveContext;
import models.DHCPConfig;
import models.HostBasicInfoModel;

//handles the open and close of dhcp config files
public class DHCPFilerLoader extends iscdhcpBaseListener  {
	
	private int counter;
	private DHCPConfig config;
	private boolean hostBlock;
	private boolean subnetBlock;
	private String hostName;
	
	public DHCPFilerLoader(DHCPConfig config) {
		this.counter = 0;
		this.config = config;
		this.hostBlock = false;
		this.subnetBlock = false;
	}
	
	public DHCPConfig getConfig() {
		return config;
	}

	public void setConfig(DHCPConfig config) {
		this.config = config;
	}
	
	@Override
	public void enterDHCPConfig(DHCPConfigContext ctx) {
		// TODO Auto-generated method stub
		super.enterDHCPConfig(ctx);
	}
	
	private void processOption(String name, String value) {
		
		//Check if the option is root (Not inside host block nor inside subnet block)
		String newName = name.replace("option ", "");
		if ( ! this.hostBlock && ! this.subnetBlock) {
			//Add the option to the root			
			this.config.getOptionsList().addOption(newName,value);					
		}
		else {
			HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
			hb.getHostOptions().addOption(newName,value);
		}

	}	
	
	private void processDDNSOption(String name, String value) {
		
		//Check if the option is root (Not inside host block nor inside subnet block)
		if ( ! this.hostBlock && ! this.subnetBlock) {
			//Add the option to the root
			this.config.getDDNSOptionList().addDDNSOption(name, value);					
		}
		else {
			HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
			hb.getDdnsHostOption().addDDNSOption(name,value);
		}

	}	
	
	private void processDirective(String name, String value) {
		
		//Check if the option is root (Not inside host block nor inside subnet block)
		if ( ! this.hostBlock && ! this.subnetBlock) {
			//Add the option to the root
			//this.config.getDDNSOptionList().addDDNSOption(name, value);
			this.config.getDirectiveList().addDirective(name, value);
			
		}

	}
	
	private void processIncludes(String fileName) {

		//Check if the option is root (Not inside host block nor inside subnet block)
				if ( ! this.hostBlock && ! this.subnetBlock) {
					//Add the option to the root
					//this.config.getDDNSOptionList().addDDNSOption(name, value);
					this.config.getIncludeFilesList().addIncludeFile(fileName);
				}
		
	}
	
	/*
	 * Start host block
	 */
	
	@Override
	public void enterHostBlockDirective(HostBlockDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterHostBlockDirective(ctx);
		this.hostBlock = true;
	}
	
	@Override
	public void exitHostblock(HostblockContext ctx) {
		// TODO Auto-generated method stub
		super.exitHostblock(ctx);
		this.hostBlock = false;
	}
	
	
	@Override
	public void enterHostblock(HostblockContext ctx) {
		// TODO Auto-generated method stub
		super.enterHostblock(ctx);
		if ( this.hostBlock ) {
			this.hostName = ctx.getChild(1).getText();
			config.getHostBlockList().addNewHostReservation(hostName);
		}
	}
	
	@Override
	public void enterHardwareEthernetDirective(HardwareEthernetDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterHardwareEthernetDirective(ctx);
		if ( this.hostBlock ) {
					
			HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
			hb.setMACAddress(ctx.getChild(1).getText());
			
		}
	}

	@Override
	public void enterFixedAddressDirective(FixedAddressDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixedAddressDirective(ctx);
		if ( this.hostBlock ) {
			
			HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
			hb.setIPAddress(ctx.getChild(1).getText());
			
		}
	}
	
	
	/*
	 * End host block
	 */
	
	

	



	/*
	 * Start Directives
	 */
	@Override
	public void enterAuthoritativeDirective(AuthoritativeDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterAuthoritativeDirective(ctx);
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterAllowBootingDirective(AllowBootingDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterAllowBootingDirective(ctx);
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterUpdateStaticLeasesDirective(UpdateStaticLeasesDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterUpdateStaticLeasesDirective(ctx);
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterDefaultLeaseTimeDirective(DefaultLeaseTimeDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDefaultLeaseTimeDirective(ctx);		
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterMaxLeaseTimeDirective(MaxLeaseTimeDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterMaxLeaseTimeDirective(ctx);
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterLogFacilityDirective(LogFacilityDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterLogFacilityDirective(ctx);
		processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterIncludeDirective(IncludeDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterIncludeDirective(ctx);		
		//processDirective(ctx.getChild(0).getText(),ctx.getChild(1).getText());
		processIncludes(ctx.getChild(1).getText());
	}

	
	/*
	 * End Directives
	 */
	
	
	/*
	 * Start DDNSOption directives
	 */	
	@Override
	public void enterDDNSUpdatesDirective(DDNSUpdatesDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDDNSUpdatesDirective(ctx);
		processDDNSOption(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	
	@Override
	public void enterDDNSUpdateStyleDirective(DDNSUpdateStyleDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDDNSUpdateStyleDirective(ctx);
		processDDNSOption(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterDDNSDomainNameDirective(DDNSDomainNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDDNSDomainNameDirective(ctx);
		processDDNSOption(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterDDNSHostNameDirective(DDNSHostNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDDNSHostNameDirective(ctx);
		processDDNSOption(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}

	@Override
	public void enterDDNSRevDomainNameDirective(DDNSRevDomainNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterDDNSRevDomainNameDirective(ctx);
		processDDNSOption(ctx.getChild(0).getText(),ctx.getChild(1).getText());
	}
	/*
	 * End DDNSOption directives
	 */
	
	/*
	 * Start Option directives
	 */
 
	
	@Override
	public void enterOptionDomainNameDirective(OptionDomainNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainNameDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());	
	}

	@Override
	public void enterOptionDomainNameServersDirective(OptionDomainNameServersDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainNameServersDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());
	}

	@Override
	public void enterOptionRoutersDirective(OptionRoutersDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionRoutersDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());
	}

	@Override
	public void enterOptionDomainSearchDirective(OptionDomainSearchDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainSearchDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());
	}

	@Override
	public void enterOptionSubnetMaskDirective(OptionSubnetMaskDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionSubnetMaskDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());
	}

	@Override
	public void enterOptionHostNameDirective(OptionHostNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionHostNameDirective(ctx);
		processOption( ctx.getChild(0).getText() ,  ctx.getChild(1).getText());
	}
	
	/*
	 * Start Option directives
	 */
	
	

}
