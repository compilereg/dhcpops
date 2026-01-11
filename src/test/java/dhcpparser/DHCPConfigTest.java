package dhcpparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.DHCPConfig;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DHCPConfigTest {
	
	private static DHCPConfig config;
	private static String json;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		config = new DHCPConfig(); 
	}

	@Test
	@Order(1)
	void CreateJSONFromDHCP() {
		/*
		 * Create a JSONM from DHCPConfig object, no exception
		 */
		
		//1-Create a full dhcp configuration
		assertDoesNotThrow(() -> {
			/*
			//Adding global directives
			config.getDirectiveList().addDirective("authoritative");
			config.getDirectiveList().addDirective("update-static-leases", "on");
			config.getDirectiveList().addDirective("default-lease-time", "604800");
			config.getDirectiveList().addDirective("max-lease-time", "604800");
			config.getDirectiveList().addDirective("log-facility", "local7");
			*/
			//Adding global Options
			config.getOptionsList().addOption("domain-name", "acpc.local");
			config.getOptionsList().addOption("domain-name-servers", "10.0.3.2");
			config.getOptionsList().addOption("domain-search", "acpc.local");
			/*
			//Adding DDNS Options
			config.getDDNSOptionList().addDDNSOption("ddns-updates", "on");
			config.getDDNSOptionList().addDDNSOption("ddns-update-style", "on");
			config.getDDNSOptionList().addDDNSOption("ddns-domainname", "acpc.local");
			config.getDDNSOptionList().addDDNSOption("ddns-rev-domainname", "0.10.in-addr.arpa");
			
			
			//Adding global includes
			config.getIncludeFilesList().addIncludeFile("/acpc/adm/etc/dhcp/dhcpd.conf.hosts");
			config.getIncludeFilesList().addIncludeFile("/acpc/adm/etc/dhcp/dhcpd.conf.options");
			config.getIncludeFilesList().addIncludeFile("/acpc/adm/etc/dhcp/dhcpd.conf.subnet");
			
			//define shared network and two subnets
			config.getSharedNetwork().setNetworkName("lan");
				config.getSharedNetwork().addNewSubnet("10.0.3.0", "255.255.255.0");
					config.getSharedNetwork().addSubnetOption("10.0.3.0", "routers", "10.0.3.5");
				config.getSharedNetwork().addNewSubnet("10.0.4.0", "255.255.255.0");
					config.getSharedNetwork().addSubnetOption("10.0.4.0", "routers", "10.0.4.5");
			
			
			//define 2 hosts
			config.getHostBlockList().addNewHostReservation("team1", "11:22:33:44:55:66", "10.0.3.100");
				config.getHostBlockList().addHostOption("team1", "routers", "10.0.3.1");
				config.getHostBlockList().addHostDDNSOption("team1", "ddns-host-name", "team1");
			config.getHostBlockList().addNewHostReservation("team2","11:22:33:44:55:67", "10.0.3.101");
				config.getHostBlockList().addHostOption("team2", "routers", "10.0.3.1");
				config.getHostBlockList().addHostDDNSOption("team2", "ddns-host-name", "team2");
				*/
		});
		
		//2-Create an empty Gson object
		//Gson gson = new Gson();
		Gson gson = new  GsonBuilder().setPrettyPrinting().create();
		assertDoesNotThrow(() -> {
			json = gson.toJson(config);
		});
		
		System.out.println(json);
			
	}

}
