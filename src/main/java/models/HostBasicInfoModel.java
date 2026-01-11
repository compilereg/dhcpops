package models;

import com.google.gson.annotations.SerializedName;

import Exceptions.DDNSOptionExistException;
import Exceptions.DDNSOptionNotExistException;
import Exceptions.OptionExistException;
import Exceptions.OptionNotExistException;
import configuration.Configuration;
import utils.IGetName;

public class HostBasicInfoModel extends Configuration implements IGetName {
	
	@SerializedName("HostName")
	private String hostName;
	@SerializedName("MAC_Address")
	private String MACAddress;
	@SerializedName("IP_Address")
	private String IPAddress;
	@SerializedName("Options_List")
	private OptionsModel hostOptions;
	@SerializedName("DDNS_Options_List")
	private DDNSOptionsModel ddnsHostOption;
	/*
	 * Can add any other configuration categories here.
	 */
	
	public HostBasicInfoModel(String hostName, String mACAddress, String iPAddress) {
		super();
		this.hostName = hostName;
		this.MACAddress = mACAddress;
		this.IPAddress = iPAddress;
		this.hostOptions = new OptionsModel();
		this.ddnsHostOption = new DDNSOptionsModel();
		
	}
	
	public void addHostOption(String name, String value) {
		try {
			hostOptions.addOption(name, value);
		} catch (OptionExistException e) {
			throw new OptionExistException(e + " for host " + this.hostName);
		}
	}
	
	public void removeHostOption(String name) {
		try {
			hostOptions.removeOption(name);
		} catch (OptionNotExistException e) {
			throw new OptionNotExistException( e + " for host " + this.hostName);
		}
	}
	
	public void addHostDDNSOption(String name, String value) {
		try {
			ddnsHostOption.addDDNSOption(name, value);
		} catch (DDNSOptionExistException e) {
			throw new DDNSOptionExistException(e + " for host " + this.hostName);
		}
		
	}
	
	public void removeHostDDNSOption(String name) {
		try {
			ddnsHostOption.removeDDNSOption(name);
		} catch (DDNSOptionNotExistException e) {
			throw new DDNSOptionNotExistException( e + " for host " + this.hostName);
		}
	}

	public DDNSOptionsModel getDdnsHostOption() {
		return ddnsHostOption;
	}

	public void setDdnsHostOption(DDNSOptionsModel ddnsHostOption) {
		this.ddnsHostOption = ddnsHostOption;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public void setMACAddress(String mACAddress) {
		MACAddress = mACAddress;
	}

	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}

	public void setHostOptions(OptionsModel hostOptions) {
		this.hostOptions = hostOptions;
	}

	public String getHostName() {
		return hostName;
	}

	public String getMACAddress() {
		return MACAddress;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public OptionsModel getHostOptions() {
		return hostOptions;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.hostName;
	}
	
	
	
}
