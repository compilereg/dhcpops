package models;

public class ZoneModel {

	private String zonePrimary;
	private String zoneKey;
	
	
	
	public ZoneModel(String zonePrimary, String zoneKey) {
		super();
		
		this.zonePrimary = zonePrimary;
		this.zoneKey = zoneKey;
	}
	
	public String getZonePrimary() {
		return zonePrimary;
	}
	public void setZonePrimary(String zonePrimary) {
		this.zonePrimary = zonePrimary;
	}
	public String getZoneKey() {
		return zoneKey;
	}
	public void setZoneKey(String zoneKey) {
		this.zoneKey = zoneKey;
	}
	
	
}
