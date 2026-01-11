package models;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;

import Exceptions.OptionExistException;
import Exceptions.OptionNotExistException;
import configuration.Configuration;

/*
 * To hold list of option model
 */
public class OptionsModel extends Configuration {
	@SerializedName("Options")
	private HashMap<String,String> options;
	//private List<OptionModel> options;
	
	public OptionsModel() {
		options = new HashMap<>();
	}

	public void setOptions(HashMap<String,String> options) {
		this.options = options;
	}

	public HashMap<String,String>  getOptions() {
		return options;
	}
	
	public void addOption(String name, String value ) {
		//Means the option already exist in the options list, throw an exception
		if ( options.containsKey(name)) {
			throw new OptionExistException();
		}
		//Here to add the option name, and value 
		this.options.put(name,value);
	}
	
	public void removeOption(String name) {
		//Check is the option is already exist
		if ( ! options.containsKey(name)) {
			throw new OptionNotExistException();
		}
		options.remove(name);
	}
	
}
