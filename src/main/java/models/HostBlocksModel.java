package models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import Exceptions.DDNSOptionExistException;
import Exceptions.DDNSOptionNotExistException;
import Exceptions.HostNameExistException;
import Exceptions.HostNameNotFoundException;
import Exceptions.OptionExistException;
import Exceptions.OptionNotExistException;
import configuration.Configuration;
import utils.FindItem;

/*
 * Store all host blocks found 
 */
public class HostBlocksModel extends Configuration  {
	@SerializedName("Hosts_List")
	private List<HostBasicInfoModel> hostBlockList;
	
	public HostBlocksModel() {
		hostBlockList = new ArrayList<>();
	}

	public List<HostBasicInfoModel> getHostBlockList() {
		return hostBlockList;
	}

	public void setHostBlockList(List<HostBasicInfoModel> hostBlockList) {
		this.hostBlockList = hostBlockList;
	}
	
	public void addNewHostReservation(String hostName, String mACAddress, String iPAddress) {
		//Check if the host is already exist
		if ( FindItem.elementExist(hostBlockList,hostName)) {
			throw new HostNameExistException();
		}
		HostBasicInfoModel m = new HostBasicInfoModel(hostName,mACAddress,iPAddress);
		hostBlockList.add(m);
	}
	
	public void removeHostReservation(String hostName) {
		//Check if the host is already exist
		if ( ! FindItem.elementExist(hostBlockList,hostName)) {
				throw new HostNameNotFoundException();
		}
		int location = FindItem.getLocation(hostBlockList,hostName);
		hostBlockList.remove(location);
	}
	
	public void addHostOption(String hostName, String name, String value) {
		//Check of host is not found
		if ( ! FindItem.elementExist(hostBlockList,hostName)) {
			throw new HostNameNotFoundException();
		}
		int location = FindItem.getLocation(hostBlockList,hostName);
		try {
			hostBlockList.get(location).addHostOption(name, value);
		} catch ( OptionExistException e) {
			throw new OptionExistException(e + " for host " + hostName);
		}
	}
	
	public void removeHostOption(String hostName, String name) {
		//Check of host is not found
		if ( ! FindItem.elementExist(hostBlockList,hostName)) {
			throw new HostNameNotFoundException();
		}
		int location = FindItem.getLocation(hostBlockList,hostName);
		try {
			hostBlockList.get(location).removeHostOption(name);
		} catch ( OptionNotExistException e) {
			throw new OptionNotExistException(e + " for host " + hostName);
		}
	}
	
	public void addHostDDNSOption(String hostName, String name, String value) {
		//Check of host is not found
		if ( ! FindItem.elementExist(hostBlockList,hostName)) {
			throw new HostNameNotFoundException();
		}
		int location = FindItem.getLocation(hostBlockList,hostName);
		try {
			hostBlockList.get(location).addHostDDNSOption(name, value);
		} catch ( DDNSOptionExistException e) {
			throw new DDNSOptionExistException(e + " for host " + hostName);
		}
	}
	
	public void removeHostDDNSOption(String hostName, String name) {
		//Check of host is not found
		if ( ! FindItem.elementExist(hostBlockList,hostName)) {
			throw new HostNameNotFoundException();
		}
		int location = FindItem.getLocation(hostBlockList,hostName);
		try {
			hostBlockList.get(location).removeHostDDNSOption(name);
		} catch ( DDNSOptionNotExistException e) {
			throw new DDNSOptionNotExistException(e + " for host " + hostName);
		}
	}
	
	
}
