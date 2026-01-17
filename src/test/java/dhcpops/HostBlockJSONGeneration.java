package dhcpops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.google.gson.Gson;

import models.HostBasicInfoModel;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HostBlockJSONGeneration {
	private static HostBasicInfoModel h;
	private static HostBasicInfoModel hVerify;
	private static String json;
	private String newJSON;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		h = new HostBasicInfoModel("team1" , "11:22:33:44:55:66" ,"1.2.3.4");
		hVerify = new HostBasicInfoModel("team1" , "11:22:33:44:55:66" ,"1.2.3.4");
		h.addHostOption("routers", "1.2.3.4");
		h.addHostOption("domainname-servers", "1.2.3.4,1.2.3.5");
		h.addHostOption("domain-name", "\"acpc.local\"");
		h.addHostOption("host-name", "\"team1\"");
		h.addHostDDNSOption("ddns-hostname", "\"team1\"");
		h.addHostDDNSOption("ddns-domainname", "\"acpc.local\"");
		
	}

	@Test
	@Order(1)
	void GenerateJSONfromObject() {
		
		Gson gson = new Gson();		
		assertDoesNotThrow(() -> {
			 json = gson.toJson(h);
	        });
		
	}
	
	@Test
	@Order(2)
	void CreateObjectFromJSON() {
		
		/*
		 * The concept is to generate a new object from the original JSON, and then generate the newJSON from the generated hVerify..
		 * Then compare both strings newJSON and OriginalJSON ot avoid comparing objects
		 */
		//The JSON string comes from the init data in the setup. IF data changed, please change the OriginalJSON to avoid assertion
		String OriginalJSON="{\"hostName\":\"team1\",\"MACAddress\":\"11:22:33:44:55:66\",\"IPAddress\":\"1.2.3.4\",\"hostOptions\":{\"options\":[{\"name\":\"routers\",\"value\":\"1.2.3.4\"},{\"name\":\"domainname-servers\",\"value\":\"1.2.3.4,1.2.3.5\"},{\"name\":\"domain-name\",\"value\":\"\\\"acpc.local\\\"\"},{\"name\":\"host-name\",\"value\":\"\\\"team1\\\"\"}]},\"ddnsHostOption\":{\"ddnsoptions\":[{\"name\":\"ddns-hostname\",\"value\":\"\\\"team1\\\"\"},{\"name\":\"ddns-domainname\",\"value\":\"\\\"acpc.local\\\"\"}]}}\n"
				+ "";
		
		//Create an object from the OriginalJSON
		Gson gson = new Gson();
		assertDoesNotThrow(() -> {
			hVerify = gson.fromJson(OriginalJSON, HostBasicInfoModel.class);
	        });
		
		//Create the JSON from the the new generated object hVerify
		Gson gson1 = new Gson();
		
		assertDoesNotThrow(() -> {
			newJSON = gson1.toJson(hVerify);
	        });
			
		assertNotEquals(newJSON,OriginalJSON);
			
	}

}
