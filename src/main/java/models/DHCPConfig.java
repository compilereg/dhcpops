package models;


import com.google.gson.annotations.SerializedName;

public class DHCPConfig {
	@SerializedName("Global_Direcives")
	private DirectivesModel DirectiveList;		//Done
	@SerializedName("Hosts")
	private HostBlocksModel HostBlockList;		//Done
	@SerializedName("Subnets")
	private SubnetBlocksModel SubnetBlockList;	//Done
	@SerializedName("Global_Options")
	private OptionsModel OptionsList;		//Done
	@SerializedName("Global_DDNSOptions")
	private DDNSOptionsModel DDNSOptionList; //Done
	@SerializedName("Shared_network")
	private SharedNetwork SharedNetwork;		//Done
	@SerializedName("Includes")
	private IncludesModel IncludeFilesList;		//Done	
	@SerializedName("DNSUpdateKey")
	private DNSUpdateKey dnsUpdateKey;
	
	public void createObjs() {
		
		this.DirectiveList = new DirectivesModel(); 
		this.HostBlockList = new HostBlocksModel();
		this.SubnetBlockList = new SubnetBlocksModel();
		this.OptionsList = new OptionsModel();
		this.DDNSOptionList = new DDNSOptionsModel();
		this.IncludeFilesList = new IncludesModel();
		this.dnsUpdateKey = new DNSUpdateKey();
		
	}
	
	public DHCPConfig() {
		this.createObjs();
		this.SharedNetwork = new SharedNetwork("default");
	}
	
	public DHCPConfig(String networkName) {
		this.createObjs();
		this.SharedNetwork = new SharedNetwork(networkName);
	}


	//All getters and Setters
	public DirectivesModel getDirectiveList() {
		return DirectiveList;
	}
	public void setDirectiveList(DirectivesModel DirectiveList) {
		this.DirectiveList = DirectiveList;
	}
	public HostBlocksModel getHostBlockList() {
		return HostBlockList;
	}
	public void setHostBlockList(HostBlocksModel HostBlockList) {
		this.HostBlockList = HostBlockList;
	}
	public DNSUpdateKey getDnsUpdateKey() {
		return dnsUpdateKey;
	}

	public void setDnsUpdateKey(DNSUpdateKey dnsUpdateKey) {
		this.dnsUpdateKey = dnsUpdateKey;
	}

	public SubnetBlocksModel getSubnetBlockList() {
		return SubnetBlockList;
	}
	public void setSubnetBlockList(SubnetBlocksModel SubnetBlockList) {
		this.SubnetBlockList = SubnetBlockList;
	}
	public OptionsModel getOptionsList() {
		return OptionsList;
	}
	public void setOptionsList(OptionsModel OptionsList) {
		this.OptionsList = OptionsList;
	}
	public DDNSOptionsModel getDDNSOptionList() {
		return DDNSOptionList;
	}
	public void setDDNSOptionList(DDNSOptionsModel DDNSOptionList) {
		this.DDNSOptionList = DDNSOptionList;
	}
	public SharedNetwork getSharedNetwork() {
		return SharedNetwork;
	}
	public void setSharedNetwork(SharedNetwork SharedNetwork) {
		this.SharedNetwork = SharedNetwork;
	}

	public IncludesModel getIncludeFilesList() {
		return IncludeFilesList;
	}

	public void setIncludeFilesList(IncludesModel IncludeFilesList) {
		this.IncludeFilesList = IncludeFilesList;
	}
	
	

}
