package models;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;

import Exceptions.DirectiveExistException;
import Exceptions.DirectiveNotExistException;
import configuration.Configuration;

public class DirectivesModel extends Configuration {
	@SerializedName("Directives_List")
	private HashMap<String,String> directives;
	
	public DirectivesModel() {
		this.directives = new HashMap<>();
	}

	public HashMap<String,String> getDirectives() {
		return directives;
	}

	public void setDirectives(HashMap<String,String> directives) {
		this.directives = directives;
	}
	
	public void addDirective(String name) {
		this.addDirective(name, "");
	}
	
	public void addDirective(String name, String value) {
		//Check if the directive is already added before
/*		if ( directives.containsKey(name) ) {
			throw new DirectiveExistException();
		}*/
		//Add the directive
		directives.put(name, value);
	}
	
	public void removeDirective(String name) {
		//Check if the directive is already added before
		if ( ! directives.containsKey(name) ) {
				throw new DirectiveNotExistException();
		}
		//Remove the directive
		directives.remove(name);
		
	}

}
