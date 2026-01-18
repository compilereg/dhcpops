package models;

import java.util.HashMap;

import Exceptions.ZoneExistException;
import Exceptions.ZoneNotExistException;

public class ZonesModel {
	private HashMap<String, ZoneModel> ZonesList;
	
	public  int getSize() {
		return this.ZonesList.size();
	}
	
	public ZonesModel() {
		this.ZonesList = new HashMap<>();
	}

	public HashMap<String, ZoneModel> getZonesList() {
		return ZonesList;
	}

	public void setZonesList(HashMap<String, ZoneModel> zonesList) {
		
		ZonesList = zonesList;
	}
	
	public void addZone(String name, String primary, String key) {
		
		if ( ZonesList.containsKey(name) ) {
			throw new ZoneExistException();
		}
		ZonesList.put(name,  new ZoneModel(primary,key));
		
	}
	
	public void removeZone(String name) {
	
		if ( ! ZonesList.containsKey(name) ) {
			throw new ZoneNotExistException();
		}
		
		ZonesList.remove(name);
		
	}
	
	public ZoneModel getZone(String name) {
		
		if ( ! ZonesList.containsKey(name) ) {
			throw new ZoneNotExistException();
		}
		return ZonesList.get(name);
	
	}
	
}
