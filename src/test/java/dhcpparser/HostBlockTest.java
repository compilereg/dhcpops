/**
 * 
 */
package dhcpparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Exceptions.DDNSOptionExistException;
import Exceptions.OptionExistException;
import models.HostBasicInfoModel;

/**
 * 
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HostBlockTest {
	private static HostBasicInfoModel h;	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		h = new HostBasicInfoModel("team1" , "11:22:33:44:55:66" ,"1.2.3.4");
	}

	@Test
	@Order(1)
	void testNewHostBlockOption() { 
		
		//1st, test add an option that is not exist
		 assertDoesNotThrow(() -> {
	            h.addHostOption("routers", "1.2.3.4");
	        });
	
	}
	
	@Test
	@Order(2)
	void testExistHostBlockOption() {
		
		//2nd, test an existing option
			assertThrows(OptionExistException.class,() -> {
				h.addHostOption("routers", "1.2.3.4");
	        });
	
	}
	
	@Test
	@Order(3)
	void testNewHostBlockDDNSOption() {
			
		//3rd, test a new DDNS option
		assertDoesNotThrow(() -> {
		        h.addHostDDNSOption("ddns-host-name", "team1");
		      });
	
	}
	
	@Test
	@Order(4)
	void testExisHostBlockDDNSOption() {
	
		//4th, test an existing DDNS option
		assertThrows(DDNSOptionExistException.class,() -> {
				h.addHostDDNSOption("ddns-host-name", "team1");
        });
			
	}

}
