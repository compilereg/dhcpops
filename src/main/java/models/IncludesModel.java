package models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import Exceptions.IncludeFileExistException;
import Exceptions.IncludeFileNotExistException;
import configuration.Configuration;

public class IncludesModel extends Configuration {
	@SerializedName("Includes_List")
	private List<String> includeFiles;
	
	public IncludesModel() {
		includeFiles = new ArrayList<>();
	}

	public List<String> getIncludeFiles() {
		return includeFiles;
	}

	public void setIncludeFiles(List<String> includeFiles) {
		this.includeFiles = includeFiles;
	}
	
	public void addIncludeFile(String fileName) {
		
		//Check if the file in the list
		if ( this.includeFiles.contains(fileName)) {
			throw new IncludeFileExistException("The file " + fileName + " is already included");
		}
		this.includeFiles.add(fileName);
	}
	
	public void removeIncludeFile(String fileName) {
		
		//Check if the file in the list
		if (  this.includeFiles.contains(fileName)) {
			throw new IncludeFileNotExistException("The file " + fileName + " is not included");
		}
		this.includeFiles.remove(fileName);
		
	}

}
