package listeners;

import edu.aast.cndc.dhcpparser.iscdhcpBaseListener;
import edu.aast.cndc.dhcpparser.iscdhcpParser.DHCPConfigContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainNameServersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionDomainSearchDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionHostNameDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionRoutersDirectiveContext;
import edu.aast.cndc.dhcpparser.iscdhcpParser.OptionSubnetMaskDirectiveContext;

//handles the open and close of dhcp config files
public class DHCPFilerLoader extends iscdhcpBaseListener  {
	
	private int counter;
	
	public DHCPFilerLoader() {
		this.counter = 0;
	}
	
	@Override
	public void enterDHCPConfig(DHCPConfigContext ctx) {
		// TODO Auto-generated method stub
		super.enterDHCPConfig(ctx);
	}
  
	private <T> void processOption(T ctx) {
		
		if ( ctx instanceof OptionDomainNameDirectiveContext )
			System.out.println("Entering Option domain name " +  ((OptionDomainNameDirectiveContext) ctx).getText());
		
		if ( ctx instanceof OptionDomainNameServersDirectiveContext )
			System.out.println("Entering Option domain name " +  ((OptionDomainNameServersDirectiveContext) ctx).getText());
		
		if ( ctx instanceof OptionRoutersDirectiveContext )
			System.out.println("Entering Option domain name " +  ((OptionRoutersDirectiveContext) ctx).getText());
		
		if ( ctx instanceof OptionDomainSearchDirectiveContext )
			System.out.println("Entering Option domain name " +  ((OptionDomainSearchDirectiveContext) ctx).getText());
		
		if ( ctx instanceof OptionSubnetMaskDirectiveContext )
			System.out.println("Entering Option domain name " +  ((OptionSubnetMaskDirectiveContext) ctx).getText());
		
		if ( ctx instanceof OptionHostNameDirectiveContext )	
			System.out.println("Entering Option domain name " +  ((OptionHostNameDirectiveContext) ctx).getText());
		this.counter++;
		System.out.println("Counter = " + this.counter);
	}
	
	
	@Override
	public void enterOptionDomainNameDirective(OptionDomainNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainNameDirective(ctx);
		this.processOption(ctx);
		
	}

	@Override
	public void enterOptionDomainNameServersDirective(OptionDomainNameServersDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainNameServersDirective(ctx);
		this.processOption(ctx);
	}

	@Override
	public void enterOptionRoutersDirective(OptionRoutersDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionRoutersDirective(ctx);
		this.processOption(ctx);
	}

	@Override
	public void enterOptionDomainSearchDirective(OptionDomainSearchDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionDomainSearchDirective(ctx);
		this.processOption(ctx);
	}

	@Override
	public void enterOptionSubnetMaskDirective(OptionSubnetMaskDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionSubnetMaskDirective(ctx);
		this.processOption(ctx);
	}

	@Override
	public void enterOptionHostNameDirective(OptionHostNameDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterOptionHostNameDirective(ctx);
		this.processOption(ctx);
	}
	
	
	
	

}
