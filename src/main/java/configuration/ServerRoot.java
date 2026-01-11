package configuration;

import java.util.ArrayList;
import java.util.List;

/*
 * The root of the dhcp server configuration
 */
public class ServerRoot {
	private List<Configuration> configurations;
	
	public ServerRoot() {
		this.configurations = new ArrayList<>();
	}

	public List<Configuration> getConfigurations() {
		return configurations;
	}

	public void setConfigurations(List<Configuration> configurations) {
		this.configurations = configurations;
	}
	
	public void addConfiguration(Configuration c) {
		this.configurations.add(c);
	}
}
