package listeners;

import java.util.ArrayList;
import java.util.List;

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
import edu.aast.cndc.dhcpparser.iscdhcpParser.FilenameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.FixedAddressDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HardwareEthernetDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HostBlockDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.HostblockContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.IncludeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.KeyBlockDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.LogFacilityDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.MaxLeaseTimeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.NextServerDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameServersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainSearchDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionHostNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionRoutersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionSubnetMaskDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.RangeDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.SharedNetBlockDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.SharednetblockContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.SubnetblockContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.UpdateStaticLeasesDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.ZoneBlockDirectiveContext;
import models.DHCPConfig;
import models.HostBasicInfoModel;
import models.SubnetBlockModel;

//handles the open and close of dhcp config files
public class DHCPFilerLoader extends iscdhcpBaseListener  {
	

	private DHCPConfig config;
	private boolean hostBlock;
	private boolean subnetBlock;
	private boolean sharednetwork;
	private String hostName;
	private String sharenetwork_name;
	private String subnet_ip;
	
	//Used to store the incudeFiles which will be recursivly visited from the caller
	private List<String> includeFilePathes;
	
	
	public List<String> getIncludeFilePathes() {
		return includeFilePathes;
	}

	public DHCPFilerLoader(DHCPConfig config) {

		this.config = config;
		this.hostBlock = false;
		this.subnetBlock = false;
		this.sharednetwork = false;
		this.includeFilePathes = new ArrayList<>();
	}
	
	
	//USed to format a string, 
	private String normalizeString(String s) {
		String str;
				str = s.replaceAll("\"", "");
		return str.toString();
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
			this.config.getOptionsList().addOption(newName,normalizeString(value));					
		}
		else {
			if ( this.hostBlock ) {
			HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
			hb.getHostOptions().addOption(newName,normalizeString(value));
			}
			else {	//add the option in subnet
				SubnetBlockModel sb;
				//If subnet inside shared network
	 			if ( this.sharednetwork && this.subnetBlock )  {
	 				sb=this.config.getSharedNetwork().getSubnet(this.subnet_ip);
	 				sb.addSubnetOption(newName,normalizeString(value));
	 			} else  {
	 				//If subnet is out of shared network
	 				sb = config.getSubnetBlockList().getSubnet(this.subnet_ip);
	 				sb.addSubnetOption(newName,normalizeString(value));
	 			}
			}
		}

	}	
	
	private void processDDNSOption(String name, String value) {
		
		//Check if the option is root (Not inside host block nor inside subnet block)
		if ( ! this.hostBlock && ! this.subnetBlock) {
			//Add the option to the root
			this.config.getDDNSOptionList().addDDNSOption(name, normalizeString(value));					
		}
		else {
			//Add the options in host block
			if ( this.hostBlock ) {
				HostBasicInfoModel hb = config.getHostBlockList().getHost(this.hostName);
				hb.getDdnsHostOption().addDDNSOption(name,normalizeString(value));
			} 
			else {	//add the ddns option in subnet
				SubnetBlockModel sb;
				//If subnet inside shared network
	 			if ( this.sharednetwork && this.subnetBlock )  {
	 				sb=this.config.getSharedNetwork().getSubnet(this.subnet_ip);
	 				sb.addSubnetDDNSOption(name,normalizeString(value));
	 			} else  {
	 				//If subnet is out of shared network
	 				sb = config.getSubnetBlockList().getSubnet(this.subnet_ip);
	 				sb.addSubnetDDNSOption(name,normalizeString(value));
	 			}
			}
		}

	}	
	
	private void processDirective(String name, String value) {
		
		//Check if the option is root (Not inside host block nor inside subnet block)
		if ( ! this.hostBlock && ! this.subnetBlock) {
			//Add the option to the root
			//this.config.getDDNSOptionList().addDDNSOption(name, value);
			this.config.getDirectiveList().addDirective(name, normalizeString(value));
		}
	}
	
	private void processIncludes(String fileName) {

		//Check if the option is root (Not inside host block nor inside subnet block)
				if ( ! this.hostBlock && ! this.subnetBlock) {
					//Add the option to the root
					//this.config.getDDNSOptionList().addDDNSOption(name, value);
					this.config.getIncludeFilesList().addIncludeFile(normalizeString(fileName));
					includeFilePathes.add(normalizeString(fileName));
				}		
	}
	
	
	/* 
	 * Start the zone :-)
	 */

	@Override
	public void enterZoneBlockDirective(ZoneBlockDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterZoneBlockDirective(ctx);
		this.config.getZonesLis().addZone(ctx.getChild(1).getText(), ctx.getChild(4).getText(), ctx.getChild(7).getText());
	}
	
	
	/*
	 * End the zone
	 * 
	 */
	
	
	
	/*
	 * Start the key :-)
	 */
	

	@Override
	public void enterKeyBlockDirective(KeyBlockDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterKeyBlockDirective(ctx);
		config.getDnsUpdateKey().setKeyName(ctx.getChild(1).getText());
		config.getDnsUpdateKey().setAlg(ctx.getChild(4).getText());
		config.getDnsUpdateKey().setSecret( normalizeString(ctx.getChild(7).getText()));
	}

	
	/*
	 * End the key
	 */
	
	/*
	 * Start the subnet 
	 */

	@Override
	public void enterSubnetblock(SubnetblockContext ctx) {
		
		// TODO Auto-generated method stub
		super.enterSubnetblock(ctx);
		this.subnetBlock = true;
		this.subnet_ip = ctx.getChild(1).getText();
		String NetMask = ctx.getChild(3).getText();
		//Create the subnet in shared network if sharednetwork is true
		if ( this.sharednetwork ) {
			this.config.getSharedNetwork().addNewSubnet(this.subnet_ip, NetMask);
		}
		else {	
			this.config.getSubnetBlockList().addNewSubnet(this.subnet_ip, NetMask);
		}
	}

	
	@Override
	public void enterRangeDirective(RangeDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterRangeDirective(ctx);
		if ( this.subnetBlock ) {
			String r1 = ctx.getChild(1).getText();
			String r2 = ctx.getChild(2).getText();
			SubnetBlockModel sb;
			if ( this.sharednetwork )
				sb = config.getSharedNetwork().getSubnet(this.subnet_ip);
			else
				sb = config.getSubnetBlockList().getSubnet(this.subnet_ip);;
			sb.setRangeStart(r1);
			sb.setRangeEnd(r2);
		}
	}

	@Override
	public void enterNextServerDirective(NextServerDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterNextServerDirective(ctx);
	
		if ( this.subnetBlock ) {
			SubnetBlockModel sb;
			if ( this.sharednetwork )
				sb = config.getSharedNetwork().getSubnet(this.subnet_ip);
			else
				sb = config.getSubnetBlockList().getSubnet(this.subnet_ip);;
			String nextserverIP =  ctx.getChild(1).getText(); 
			sb.setNextServer(nextserverIP);
		}
	
	}

	@Override
	public void enterFilenameDirective(FilenameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterFilenameDirective(ctx);
		if ( this.subnetBlock ) {
			SubnetBlockModel sb;
			if ( this.sharednetwork )
				sb = config.getSharedNetwork().getSubnet(this.subnet_ip);
			else
				sb = config.getSubnetBlockList().getSubnet(this.subnet_ip);;
			String fileName =  ctx.getChild(1).getText(); 
			sb.setFilename(fileName);
		}
	}


	@Override
	public void exitSubnetblock(SubnetblockContext ctx) {
		
		// TODO Auto-generated method stub
		super.exitSubnetblock(ctx);
		this.subnetBlock = false;
		this.subnet_ip = null;

	}
	
	
	/*
	 * End the subnet
	 */
	
	
	/*
	 * Start the shared network
	 */
	

	@Override
	public void enterSharedNetBlockDirective(SharedNetBlockDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterSharedNetBlockDirective(ctx);
		this.sharednetwork = true;
		
	}


	@Override
	public void enterSharednetblock(SharednetblockContext ctx) {
		// TODO Auto-generated method stub
		super.enterSharednetblock(ctx);
		if  ( this.sharednetwork ) {
			this.sharenetwork_name = ctx.getChild(1).getText();
			this.config.getSharedNetwork().setNetworkName(this.sharenetwork_name);
		}
	}

	
	@Override
	public void exitSharedNetBlockDirective(SharedNetBlockDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.exitSharedNetBlockDirective(ctx);
		this.sharednetwork = false;
	}


	
	/*
	 * End the shared network
	 */
	
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
	 * End Option directives
	 */
	
	

}
