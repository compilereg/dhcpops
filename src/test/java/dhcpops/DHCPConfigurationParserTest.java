package dhcpops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import configuration.DHCPConfigurationParser;
import models.DHCPConfig;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DHCPConfigurationParserTest {
	private static String fileName="config/dhcpd.conf";
	private static DHCPConfig config;
	private static String json;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	@Order(1)
	void GenerateJSONFromDHCPFile() {
		assertDoesNotThrow ( () -> {
			config = DHCPConfigurationParser.parseDHCP(fileName, new DHCPConfig());
			//Start map DHCPConfig object to json
			//I used disableHTMLEscaping to avoid converting the strig to unicodes
			Gson gson = new  GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
			json = gson.toJson(config);
			System.out.println(json);
		});
		

		
		
		
		
	}

}
