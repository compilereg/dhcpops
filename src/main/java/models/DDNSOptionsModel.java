package models;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;

import Exceptions.DDNSOptionExistException;
import Exceptions.DDNSOptionNotExistException;
/*
 * Hold list of DDNSOption
 */
public class DDNSOptionsModel {
	@SerializedName("DDNSOptions_List")
	private HashMap<String,String> ddnsoptions;
	
	public void setDdnsoptions(HashMap<String,String> ddnsoptions) {
		this.ddnsoptions = ddnsoptions;
	}

	public DDNSOptionsModel() {
		this.ddnsoptions = new HashMap<>(); 
	}

	public HashMap<String,String> getDdnsoptions() {
		return ddnsoptions;
	}
	
	public void addDDNSOption(String name, String value) {
		//Means the DDNSoption already exist in the DDNSoptions list, throw an exception
		if ( ddnsoptions.containsKey(name) ) {
			throw new DDNSOptionExistException("The DDNS option already exists");
		}
		//Here to add the option name, and value 
		ddnsoptions.put(name,value);
	}
	
	public void removeDDNSOption(String name) {
		//Check is the option is already exist
		if ( ! ddnsoptions.containsKey(name) ) {
			throw new DDNSOptionNotExistException();
		}
		ddnsoptions.remove(name);
	}

}
