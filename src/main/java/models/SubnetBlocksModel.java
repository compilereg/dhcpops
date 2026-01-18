package models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import Exceptions.OptionExistException;
import Exceptions.OptionNotExistException;
import Exceptions.SubnetExistException;
import Exceptions.SubnetNotExistException;
import utils.FindItem;

public class SubnetBlocksModel  {
	@SerializedName("Subnets_List")
	private List<SubnetBlockModel> subnetBlockList; 
	
	public int getSize() {
		return this.subnetBlockList.size();
	}
	
	public SubnetBlocksModel() {
		subnetBlockList = new ArrayList<>();
	}

	public List<SubnetBlockModel> getSubnetBlockList() {
		return subnetBlockList;
	}

	public void setSubnetBlockList(List<SubnetBlockModel> subnetBlockList) {
		this.subnetBlockList = subnetBlockList;
	}
	
	public void addNewSubnet(String IP4, String NetMask, String nextServer, String filename) {
		//Check if the host is already exist
		if ( FindItem.elementExist(subnetBlockList,IP4)) {
				throw new SubnetExistException();
		}
		
		SubnetBlockModel m = new SubnetBlockModel(IP4,NetMask, nextServer, filename);
		subnetBlockList.add(m);

	}
	
	public void addNewSubnet(String IP4, String NetMask, String nextServer) {
		//Check if the host is already exist
		if ( FindItem.elementExist(subnetBlockList,IP4)) {
				throw new SubnetExistException();
		}
		
		SubnetBlockModel m = new SubnetBlockModel(IP4,NetMask, nextServer);
		subnetBlockList.add(m);

	}
	
	public void addNewSubnet(String IP4, String NetMask) {
		//Check if the host is already exist
		if ( FindItem.elementExist(subnetBlockList,IP4)) {
				throw new SubnetExistException();
		}
		
		SubnetBlockModel m = new SubnetBlockModel(IP4,NetMask);
		subnetBlockList.add(m);

	}
	
	
	public void removeSubnet(String IP4) {
		//Check if the host is already exist
		if ( ! FindItem.elementExist(subnetBlockList,IP4)) {
				throw new SubnetNotExistException();
		}
		int location = FindItem.getLocation(subnetBlockList,IP4);
		subnetBlockList.remove(location);
		
	}
	
	public SubnetBlockModel getSubnet(String IP4) {
		//Check of subnet is not found
		if ( ! FindItem.elementExist(subnetBlockList,IP4)) {
			throw new SubnetNotExistException();
		}
		SubnetBlockModel sb;
		int location = FindItem.getLocation(subnetBlockList,IP4);
		sb = subnetBlockList.get(location);
		return sb;
	}
	
	
	public void addSubnetOption(String IP4, String name, String value) {
		//Check of subnet is not found
		if ( ! FindItem.elementExist(subnetBlockList,IP4)) {
			throw new SubnetNotExistException();
		}
		int location = FindItem.getLocation(subnetBlockList,IP4);
		try {
			subnetBlockList.get(location).addSubnetOption(name, value);
		} catch ( OptionExistException e) {
			throw new OptionExistException(e + " for subnet " + IP4);
		}
	}
	
	public void removeSubnetOption(String IP4, String name) {
		//Check of subet is not found
		if ( ! FindItem.elementExist(subnetBlockList,IP4)) {
			throw new SubnetNotExistException();
		}
		int location = FindItem.getLocation(subnetBlockList,IP4);
		try {
			subnetBlockList.get(location).removeSubnetOption(name);
		} catch ( OptionNotExistException e) {
			throw new OptionNotExistException(e + " for subnet " + IP4);
		}
	}
}
