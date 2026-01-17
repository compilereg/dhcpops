package dhcpops;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Exceptions.HostNameNotFoundException;
import Exceptions.SubnetNotExistException;
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
				//System.out.println(json);
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
	@Order(4)
	void searchForExistHost() {
		//2-Search for non existing host
		assertDoesNotThrow(() -> {
	           config.isExistHostname("team1001");
	        });	
	}

	
	
	@Test
	@Order(5)
	void searchForNotExistSubnet() {
		//2-Search for non existing host, throw exception
		assertThrows(SubnetNotExistException.class,() -> {
	           config.isExistSubnet("10.0.3.0");
	        });	
	}


	@Test
	@Order(6)
	void searchForExistSubnetInNetwork() {
		//2-Search for non existing host
		assertDoesNotThrow(() -> {
	           config.isExistSubnet("lan","10.0.3.0");
	        });	
	}


}
