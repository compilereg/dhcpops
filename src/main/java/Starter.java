import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import configuration.DHCPConfigurationParser;
import models.DHCPConfig;

public class Starter {
	private static String filename = "config/dhcpd.conf";
	//private static String filename = "dhcpd.conf.hosts";
	
	private static DHCPConfig config;
	private static String json;
	
	public static void main(String[] args) throws IOException {
		
		config = DHCPConfigurationParser.parseDHCP(filename, new DHCPConfig());
		
		//Start map DHCPConfig object to json
		//I used disableHTMLEscaping to avoid converting the strig to unicodes
		Gson gson = new  GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
		json = gson.toJson(config);
		System.out.println(json);
	
	}
}
/*
 * To add a new rule
 * 	1-Add the rule in the .g4 file
 *  2-Maven -> Generate sources
 *  3-In listeners, in the DHCPFilerLoader, add the missed overloaded method
 *  4-To accomplish you may need to add a model
 */
