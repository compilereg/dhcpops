package dhcpparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Exceptions.HostNameExistException;
import Exceptions.HostNameNotFoundException;
import models.HostBlocksModel;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HostBlockListTest {
	
	private static HostBlocksModel hl;	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hl = new HostBlocksModel();
	}

	@Test
	@Order(1)
	void AddNewHostReservation() {
		
		//1-Add a new host that is not exist. So, no exception
		 assertDoesNotThrow(() -> {
	            hl.addNewHostReservation("team1" , "11:22:33:44:55:66" ,"1.2.3.4");
	        });
		 
	}
	
	@Test
	@Order(2)
	void AddExistHostReservation() {
		
		//2-Add an exist host,  exception threw
		assertThrows(HostNameExistException.class,() -> {
	            hl.addNewHostReservation("team1" , "11:22:33:44:55:66" ,"1.2.3.4");
	        });
	
	}
	
	@Test
	@Order(3)
	void AddNewOptionToExistingHost() {
		
		//3-Add a new option to exist host, no exception
		assertDoesNotThrow(() -> {
	            hl.addHostOption("team1" , "routers" ,"1.2.3.4");
	        });
	
	}
	
	@Test
	@Order(4)
	void AddNewOptionToNotExistingHost() {
		
		//3-Add a new option to not exist host, exception threw
		assertThrows(HostNameNotFoundException.class,() -> {
	            hl.addHostOption("team2" , "routers" ,"1.2.3.4");
	        });
	
	}
	
	@Test
	@Order(5)
	void AddNewDDNSOptionToExistingHost() {
		
		//3-Add a new option to exist host, no exception
		assertDoesNotThrow(() -> {
	            hl.addHostOption("team1" , "ddns-host-name" ,"\"team1\"");
	        });
	
	}
	
	@Test
	@Order(6)
	void AddNewDDNSOptionToNotExistingHost() {
		
		//3-Add a new option to not exist host, exception threw
		assertThrows(HostNameNotFoundException.class,() -> {
	            hl.addHostOption("team2" , "ddns-host-name" ,"\"team2\"");
	        });
	
	}
	
	@Test
	@Order(7)
	void removeExistReservedHost() {
		
		/*
		 * Tries to remove an existing host.
		 * 1-Add new host
		 * 2-Remove it 
		 */
		//Adding new host
		hl.addNewHostReservation("team3", "22:22:22:22:22:22", "1.2.3.5");
		
		//Remove it
		assertDoesNotThrow(() -> {
		hl.removeHostReservation("team3");
		});
		
	}
	
	
	@Test
	@Order(8)
	void removeNotExistHost() {
		//Tries to remove non exist host, throw exception
		
		assertThrows(HostNameNotFoundException.class,() -> {
			hl.removeHostReservation("team4");
		});
	
	}
	
}
