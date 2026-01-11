package models;

import com.google.gson.annotations.SerializedName;

public class SharedNetwork extends SubnetBlocksModel {
	@SerializedName("Name")
	private String NetworkName;

	public SharedNetwork(String networkName) {
		super();
		NetworkName = networkName;
	}

	public String getNetworkName() {
		return NetworkName;
	}

	public void setNetworkName(String networkName) {
		NetworkName = networkName;
	}
	
}
