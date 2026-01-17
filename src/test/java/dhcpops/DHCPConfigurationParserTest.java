package dhcpops;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Exceptions.HostNameNotFoundException;
import configuration.DHCPConfigurationOps;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DHCPConfigurationParserTest {
	private static String fileName="config/dhcpd.conf";
	private static DHCPConfigurationOps config;
	private static String json;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Create a DHCPConfigurationOps from existing config files
		config = new DHCPConfigurationOps(fileName);
	}
	
	@Test
	@Order(1)
	void GenerateJSONFromDHCP() {
		assertDoesNotThrow ( () -> {
				//Use the create DHCP Object and return the JSON
				json = config.getJSON();
				System.out.println(json);
		});

	}

	@Test
	@Order(2)
	void GeneratePOJOFromDHCP() {
		assertDoesNotThrow ( () -> {
			//Use the created DHCP Object and return the POJO
			config.getConfig();
		});

	}
	
	@Test
	@Order(3)
	void searchForNotExistHost() {
		//2-Search for non existing host, throw exception
		assertThrows(HostNameNotFoundException.class,() -> {
	           config.isExistHostname("nonexist");
	        });	
	}
	

	@Test
	@Order(3)
	void searchForExistHost() {
		//2-Search for non existing host
		assertDoesNotThrow(() -> {
	           config.isExistHostname("team1001");
	        });	
	}


}
