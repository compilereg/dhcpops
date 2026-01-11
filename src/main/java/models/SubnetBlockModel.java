package models;

import com.google.gson.annotations.SerializedName;

import Exceptions.OptionExistException;
import Exceptions.OptionNotExistException;
import configuration.Configuration;
import utils.IGetName;

public class SubnetBlockModel extends Configuration implements IGetName {
	
	@SerializedName("Fixed-Address")
	private String IP4;
	@SerializedName("Netmask")
	private String SubnetMask;
	@SerializedName("Next-Server")
	private String NextServer;
	@SerializedName("Filename")
	private String Filename;
	
	@SerializedName("Options_List")
	private OptionsModel subnetOptions;

	public SubnetBlockModel(String iP4, String subnetMask, String nextServer, String filename) {
		super();
		IP4 = iP4;
		SubnetMask = subnetMask;
		NextServer = nextServer;
		Filename = filename;
		subnetOptions = new OptionsModel();
	}
	
	public SubnetBlockModel(String iP4, String subnetMask, String nextServer) {
		super();
		IP4 = iP4;
		SubnetMask = subnetMask;
		NextServer = nextServer;
		subnetOptions = new OptionsModel();
	}
	
	
	public SubnetBlockModel(String iP4, String subnetMask) {
		super();
		IP4 = iP4;
		SubnetMask = subnetMask;
		subnetOptions = new OptionsModel();
	}

	public void addSubnetOption(String name, String value) {
		try {
			subnetOptions.addOption(name, value);
		} catch (OptionExistException e) {
			throw new OptionExistException(e + " for subnet " + this.IP4);
		}
	}
	
	public void removeSubnetOption(String name) {
		try {
			subnetOptions.removeOption(name);
		} catch ( OptionNotExistException e) {
			throw new OptionNotExistException(e + " For subnet " + IP4);
		}
	}
	
	
	public String getIP4() {
		return IP4;
	}


	public void setIP4(String iP4) {
		IP4 = iP4;
	}


	public String getSubnetMask() {
		return SubnetMask;
	}


	public void setSubnetMask(String subnetMask) {
		SubnetMask = subnetMask;
	}


	public String getNextServer() {
		return NextServer;
	}


	public void setNextServer(String nextServer) {
		NextServer = nextServer;
	}


	public String getFilename() {
		return Filename;
	}


	public void setFilename(String filename) {
		Filename = filename;
	}


	public OptionsModel getsubnetOptions() {
		return subnetOptions;
	}


	public void setsubnetOptions(OptionsModel subnetOptions) {
		this.subnetOptions = subnetOptions;
	}	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.IP4;
	}

	
}
