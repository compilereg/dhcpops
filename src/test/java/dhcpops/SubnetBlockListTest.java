package dhcpops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.google.gson.Gson;

import Exceptions.OptionExistException;
import Exceptions.SubnetExistException;
import models.SubnetBlocksModel;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SubnetBlockListTest {
	
	private static SubnetBlocksModel sl;
	private static SubnetBlocksModel slVerify; 
	private static String json;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sl = new SubnetBlocksModel();
	}

	@Test
	@Order(1)
	void addNewSubnetTest() {
		
		//Add a new subnet, no exception
		assertDoesNotThrow(() -> {
			sl.addNewSubnet("10.0.3.0", "255.255.255.0");
		 });
		 
	}
	
	@Test
	@Order(2)
	void addExistSubnetTest() {
		
		//Add the previously created subnet, throw an exception
		assertThrows(SubnetExistException.class,() -> {
			sl.addNewSubnet("10.0.3.0", "255.255.255.0");
		});
	
	}
	
	@Test
	@Order(3)
	void addNewSubnetOption() {
		
		//Add a new option to existing subnet, no exception
		assertDoesNotThrow(() -> {
			sl.addSubnetOption("10.0.3.0", "routers", "10.0.3.1");
		 });
		
	}

	@Test
	@Order(3)
	void addExistSubnetOption() {
		
		//Add a existing option to existing subnet, throw exception
		assertThrows(OptionExistException.class,() -> {
			sl.addSubnetOption("10.0.3.0", "routers", "10.0.3.1");
		 });
		
	}
	
	@Test
	@Order(4)
	void createSubnetBlockListJSON() {
		/*
		 * Test creating a JSON string from the subnet block list
		 * Add more subnets, and options for each subnet, then create the string
		 */
		
		//1-Add two new subnets
		sl.addNewSubnet("10.0.4.0", "255.255.255.0");
		sl.addNewSubnet("10.0.5.0", "255.255.255.0");
		
		//2-Add an option to each each subnet
		sl.addSubnetOption("10.0.4.0", "routers", "10.0.4.1");
		sl.addSubnetOption("10.0.5.0", "routers", "10.0.5.1");
		
		//3-Create the JSON string
		Gson gson = new Gson();		
		
		assertDoesNotThrow(() -> {
			 json = gson.toJson(sl);
	        });
		
	}
	
	@Test
	@Order(5)
	void createSubnetBlockListFromJSON() {
		/*
		 * Return back the JSON to a new subnetblocklist object without any exception
		 */
		slVerify = new SubnetBlocksModel();
		Gson gson = new Gson();
		assertDoesNotThrow(() -> {
			slVerify = gson.fromJson(json, SubnetBlocksModel.class);
	        });
		
	}
	
}
