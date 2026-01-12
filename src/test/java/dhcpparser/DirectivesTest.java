package dhcpparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.google.gson.Gson;

import Exceptions.DirectiveExistException;
import Exceptions.DirectiveNotExistException;
import models.DirectivesModel;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DirectivesTest {
	private static DirectivesModel dm;
	private static DirectivesModel dmVerify;
	private static String json;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dm = new DirectivesModel();
		dmVerify = new DirectivesModel();
		//some startup directive :-)
		dm.addDirective("allow", "booting");
	}

	@Test
	@Order(1)
	void addNewDirective() {
		
		//Add a new directive, no exception
		 assertDoesNotThrow(() -> {
			 dm.addDirective("default-lease-time","604800");
		 });
	
	}
	/*
	@Test
	@Order(2)
	void addExistingDirective() {
		
		//Add allow default-lease-time directive which is exist from the setupBeforeClass, throw exception
		assertThrows(DirectiveExistException.class,() -> {
			dm.addDirective("default-lease-time", "604800");
		});
	}
	*/
	@Test
	@Order(3)
	void removeExistingDirective() {
		
		//Removes an existing directive, no exception
		assertDoesNotThrow(() -> {
			dm.removeDirective("default-lease-time");
		});
	}
	
	@Test
	@Order(4) 
	void removeNonExistDirective() {
		assertThrows(DirectiveNotExistException.class, () -> {
			dm.removeDirective("log-facility");
		});
	}
	
	@Test
	@Order(5)
	void createDirectivesListJSON() {
		
		//Create a JSON string from DirectivesModel object
		
		//1-Create an object and fill with data
		dm.addDirective("authoritative");
		dm.addDirective("max-lease-time", "604800");
		dm.addDirective("default-lease-time","604800");
		dm.addDirective("log-facility", "local7");
		
		
		//2-Create an empty Gson object
		Gson gson = new Gson();
		
		//3-Convert the DirectivesModel object to JSON String
		assertDoesNotThrow(() -> {
			 json = gson.toJson(dm);
	        });

	}
	
	@Test
	@Order(6)
	void createDirectiveListFromJSON() {

		//Convert back from JSON String to a new empty DirectivesModel object
		
		//1-Create a Gson object
		Gson gson = new Gson();
		
		//2-Convert from JSON String to the object
		assertDoesNotThrow(() -> { 
			dmVerify = gson.fromJson(json, DirectivesModel.class);
			
		});
	}
	
	
	
	
}
