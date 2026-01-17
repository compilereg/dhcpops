package configuration;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Exceptions.HostNameNotFoundException;
import Exceptions.ZoneNotExistException;
import edu.aast.cndc.dhcpparser.iscdhcpLexer;
import edu.aast.cndc.dhcpparser.iscdhcpParser;
import listeners.DHCPFilerLoader;
import models.DHCPConfig;
import models.SubnetBlockModel;
import Exceptions.SharedNetworkNameNotExistException;
import Exceptions.SubnetNotExistException;

public class DHCPConfigurationOps {
	
	 private DHCPConfig config;

	 
	 public boolean isExistHostname(String hostName ) {
		 
		 try 
		 {
			 config.getHostBlockList().getHost(hostName);
		 } catch (HostNameNotFoundException e) {
			 	throw e;
		 }
		 
		 return true;
		 
	 }
	 
	 public boolean isExistSubnet(String IP4 ) {
		 
		 try 
		 {
			 config.getSubnetBlockList().getSubnet(IP4);
		 } catch (SubnetNotExistException e) {
			 	throw new SubnetNotExistException(e + " for subnet " + IP4);
		 }
		 
		 return true;
		 
	 }
	 
	 public boolean isExistSubnet(String NetworkName, String IP4 ) {
		 
		 try 
		 {
			 if ( config.getSharedNetwork().getNetworkName().equals(NetworkName) )
				 	config.getSharedNetwork().getSubnet(IP4);
			 else
				 throw new SharedNetworkNameNotExistException("Shared network does not exist" + NetworkName);
			 
		 } catch (SubnetNotExistException e) {
			 	throw new SubnetNotExistException(e + " for subnet " + IP4);
		 }
		 
		 return true;
		 
	 }
	 
	 public DHCPConfigurationOps(String fileName) {
		 config = this.configToPOJO(fileName, new DHCPConfig());
	 }
	 
	public DHCPConfig getConfig() {
		return config;
	}

	public void setConfig(DHCPConfig config) {
		 this.config = config;
	 }
	
	//Method parses dhcp to JSON string 
	public String getJSON() {

		String json = null;
		//Start map DHCPConfig object to json
		//I used disableHTMLEscaping to avoid converting the strig to unicodes
		Gson gson = new  GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
		json = gson.toJson(config);
	
		return json;
	
	}

	
	//Method parses a dhcp file, and return POJOs
	public DHCPConfig configToPOJO(String filename,DHCPConfig config) {

		CharStream input;
		try {
			
			//Read the input file content
			input = CharStreams.fromFileName(filename);
			
			// create a lexer that feeds off of input CharStream
			iscdhcpLexer lexer = new iscdhcpLexer(input);
			
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			iscdhcpParser parser = new iscdhcpParser(tokens);
			
			//Call to the new parser with listener, which will be the walker used with listener
			ParseTreeWalker walker = new ParseTreeWalker();
			DHCPFilerLoader loader = new DHCPFilerLoader(config);
			ParseTree tree = parser.config();
			
			walker.walk(loader, tree	);
			config = loader.getConfig();
			
			//Recursively visit any file in the includeFilePathes in the loader listender
			for (String includeFile: loader.getIncludeFilePathes()  )
				config = configToPOJO(includeFile,config);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return config;
	}	
	
}
