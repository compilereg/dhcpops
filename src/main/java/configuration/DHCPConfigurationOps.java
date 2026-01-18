package configuration;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Exceptions.HostNameNotFoundException;
import Exceptions.SharedNetworkNameNotExistException;
import Exceptions.SubnetNotExistException;
import edu.aast.cndc.dhcpparser.iscdhcpLexer;
import edu.aast.cndc.dhcpparser.iscdhcpParser;
import listeners.DHCPFilerLoader;
import models.DDNSOptionsModel;
import models.DHCPConfig;
import models.HostBasicInfoModel;
import models.OptionsModel;
import models.SubnetBlockModel;
import models.ZoneModel;

public class DHCPConfigurationOps {
	
	 private DHCPConfig config;

	 
	 private String getMainConfigFile(String baseFileName) {
		 return baseFileName;
	 
	 }
	 
	 private String getHostsConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".hosts";
	 
	 }
	 
	 private String getSubnetsConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".subnets";
	 
	 }
	 
	 private String getOptionsConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".options";
	 
	 }
	 
	 private String getDDNSOptionsConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".ddnsoptions";
	 
	 }
	 
	 private String getUpdateZonesConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".domains";
	 
	 }
	 
	 private String getUpdateKeyConfigFile(String baseFileName) {
		 return getMainConfigFile(baseFileName) + ".key";
	 
	 }
	 
	 
	 
	 /*
	  * Method writes any options. It takes the myWriter, and lineprefix such as \t and list of optns
	  */
	 private void WriteOtionsToFile(FileWriter myWriter, String LinePrefix, OptionsModel olm) throws IOException {
			
		 String OptionValue = "";	
				 for ( String OptionName : olm.getOptions().keySet() ) {
					 OptionValue = olm.getOptions().get(OptionName);
					// System.out.println(OptionName + " " + OptionVale);
					 myWriter.write(LinePrefix + "option " + OptionName + " " + OptionValue + ";\n");
				 }
	
	 }
	 
	 
	 /*
	  *Method uses  WriteToOptionsToFile to write to options file, used to write the main options
	  */
	 public void WriteToOptionsFile(String BaseConfigFile) {
		 if ( config.getOptionsList().getSize() <= 0 )
			 return;
		 
		 try {
				FileWriter myWriter = new FileWriter(getOptionsConfigFile(BaseConfigFile));
				WriteOtionsToFile(myWriter,"",config.getOptionsList());
				myWriter.close();
		 }	catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 }
	 
	 /*
	  * Method writes any options. It takes the myWriter, and lineprefix such as \t and list of optns
	  */
	 private void WriteDDNSOtionsToFile(FileWriter myWriter, String LinePrefix, DDNSOptionsModel ddnsolm) throws IOException {
			
		 String DDNSOptionValue = "";	
				 for ( String DDNSOptionName : ddnsolm.getDdnsoptions().keySet() ) {
					 DDNSOptionValue = ddnsolm.getDdnsoptions().get(DDNSOptionName);
					// System.out.println(OptionName + " " + OptionVale);
					 myWriter.write(LinePrefix + DDNSOptionName + " " + DDNSOptionValue + ";\n");
				 }
	
	 }
	 
	 
	 /*
	  *Method uses  WriteToOptionsToFile to write to options file, used to write the main options
	  */
	 public void WriteToDDNSOptionsFile(String BaseConfigFile) {
		 if ( config.getDDNSOptionList().getSize() <= 0 )
			 return;
		 
				try {
					FileWriter myWriter = new FileWriter(getDDNSOptionsConfigFile(BaseConfigFile));
					WriteDDNSOtionsToFile(myWriter,"",config.getDDNSOptionList());
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	 }
	 

	 /*
	  * Method writes main directives
	  */
	 public void WriteToMainFile(String BaseConfigFile) {
		FileWriter myWriter;		 
		 ///Start writing all directives
		HashMap<String,String> dlm = config.getDirectiveList().getDirectives();
		String DirectiveValue = "";	
		try {
				myWriter = new FileWriter(getMainConfigFile(BaseConfigFile));
				
				//Write all main directives
				 for ( String DirectiveName : dlm.keySet() ) {
					 DirectiveValue = dlm.get(DirectiveName);
					// System.out.println(OptionName + " " + OptionVale);
					 myWriter.write(DirectiveName + " " + DirectiveValue + ";\n");
				 }
				 
				 //Write all includes
				 if ( config.getOptionsList().getSize() >= 1 ) 
					 myWriter.write( "\ninclude \"" + getOptionsConfigFile(BaseConfigFile) + "\";" + "\n");
				 if ( config.getDDNSOptionList().getSize() >= 1 ) 
					 myWriter.write( "\ninclude \"" + getDDNSOptionsConfigFile(BaseConfigFile) + "\";" + "\n");
				 if ( config.getHostBlockList().getSize() >= 1 ) 
					 myWriter.write( "\ninclude \"" + getHostsConfigFile(BaseConfigFile) + "\";" + "\n");
				 if ( config.getSubnetBlockList().getSize() >=1 || config.getSharedNetwork().getSize() >=1 )
					 myWriter.write( "\ninclude \"" + getSubnetsConfigFile(BaseConfigFile) + "\";" + "\n");
				 if ( config.getDnsUpdateKey() != null )
					 myWriter.write( "\ninclude \"" + this.getUpdateKeyConfigFile(BaseConfigFile) + "\";" + "\n");
				 if ( config.getZonesLis().getSize() >= 1 )
					 myWriter.write( "\ninclude \"" + this.getUpdateZonesConfigFile(BaseConfigFile) + "\";" + "\n");
				 
				 
				 myWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	 }
	 
	 
	 /*
	  * Method writes all hosts 
	  */
	 public void WriteToHostsConfigFile(String BaseConfigFile) {
		 if ( config.getHostBlockList().getSize() <= 0 )
			 return;
		 String Hdr;
		 try {
			 FileWriter myWriter = new FileWriter(getHostsConfigFile(BaseConfigFile));
			 
			 for (HostBasicInfoModel hb: config.getHostBlockList().getHostBlockList() ) {
				 
				 //1-Write the header to the file
				 Hdr = "host " + hb.getHostName() + " {";
				 myWriter.write(Hdr + "\n");
				 
				 //2-Write the details
				 	//Host info
				 	myWriter.write("\t" + "hardware ethernet " + hb.getMACAddress() + ";" + "\n");
				 	myWriter.write("\t" + "fixed-address " + hb.getIPAddress() + ";" + "\n");
				 	//Host Options
				 	WriteOtionsToFile(myWriter,"\t",hb.getHostOptions());
				 	//Host DDNS Options
				 	WriteDDNSOtionsToFile(myWriter,"\t",hb.getDdnsHostOption());
				 
				 //3-Close the block
				 myWriter.write("}" + "\n");
				 
			 }
			 
			 myWriter.close();
		 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 
	 
	 /*
	  * MEthod write a subnet blocks to a file
	  */
	 private void WriteSubnetsToFile(FileWriter myWriter,String LinePrefix , List<SubnetBlockModel> sbm) throws IOException {
		 
		 for(SubnetBlockModel sb: sbm) {
			 
			 //Open a subnet block
			 String Hdr = "\t" + "subnet " + sb.getIP4() + " netmask " + sb.getSubnetMask() + " {";
			 myWriter.write(Hdr + "\n");
			 
			 //Write the subnet basic info
			 myWriter.write(LinePrefix + "\t" + "range " + sb.getRangeStart() + " " + sb.getRangeEnd()   + ";" + "\n");
			 if ( sb.getFilename() != null ) 
				 myWriter.write(LinePrefix + "\t" + " filename " +sb.getFilename()   + ";" + "\n");
			 if ( sb.getNextServer() != null )
				 myWriter.write(LinePrefix + "\t" + "next-server "+ sb.getNextServer()   + ";" + "\n");
			 if ( sb.getsubnetOptions() != null)
				 this.WriteOtionsToFile(myWriter, LinePrefix + "\t", sb.getsubnetOptions());
			 if ( sb.getSubnetDDNSOptions() != null)
			 this.WriteDDNSOtionsToFile(myWriter, LinePrefix + "\t", sb.getSubnetDDNSOptions());
			 
			 //Close the opened subnet block
			 myWriter.write("\t" + "}" + "\n");
		 }
		 
	 }
	 
	 
	 /*
	  * Writes subnets to a file
	  */
	 public void WriteToSubnetsConfigFile(String BaseConfigFile) {
		 FileWriter myWriter = null;
		 String SubnetsFileName=this.getSubnetsConfigFile(BaseConfigFile);
		 
		 
		 //Open  a writer if there is at least one subnet defined ( under shared network or standalone)
		 if ( config.getSharedNetwork().getSize() >= 1  || config.getSubnetBlockList().getSize() >= 1)
			 try {
				 myWriter = new FileWriter(getHostsConfigFile(SubnetsFileName));
			 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
		//1-Write all subnets under shared network	 
		 if ( config.getSharedNetwork().getSize() >= 1 ) {
			 try {
				 
				 //Open a shared network block
				 	String Hdr="shared_network " + config.getSharedNetwork().getNetworkName() + "{";
				 	myWriter.write(Hdr + "\n");
				 	
				 //Write the subnet details
				 	this.WriteSubnetsToFile(myWriter,"\t",config.getSharedNetwork().getSubnetBlockList());
				 
				 //Close the shared network block
				 myWriter.write("}" + "\n");
				 
			 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		 }
		 
		 //2-Write all subnets out of shared network
		 if ( config.getSubnetBlockList().getSize() >= 1) {
			 try {
				 
				//Write the subnet details
				 	this.WriteSubnetsToFile(myWriter,"\t",config.getSubnetBlockList().getSubnetBlockList());
				 
			 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 
		 
		 //Close the writer if opened
		 if ( config.getSharedNetwork().getSize() >= 1  || config.getSubnetBlockList().getSize() >= 1)
			 try {
				 myWriter.close();
			 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 }
	 
	public void WriteToUpdateZonesConfigFile(String BaseConfigFile) {
		
		if ( config.getZonesLis().getSize() <= 0) return;

		try {
			//Create a file for the update key
			FileWriter myWriter = new FileWriter(this.getUpdateZonesConfigFile(BaseConfigFile));

			for ( String zoneName: config.getZonesLis().getZonesList().keySet()) {
				ZoneModel zm = config.getZonesLis().getZone(zoneName);
				//OPen a zone block
				String Hdr="zone " + zoneName + " {";
				myWriter.write(Hdr + "\n");
				
				//Write the zone data
				myWriter.write("\t" + "primary " + zm.getZonePrimary() + ";"+"\n");
				myWriter.write("\t" + "key " + zm.getZoneKey() + ";" + "\n");
						
				//Close the zone block
				myWriter.write("}" + "\n");			
			}
			
			//Close the opened file
			myWriter.close();
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public void WriteToKeysConfigFile(String BaseConfigFile) {
		
		if ( config.getDnsUpdateKey() == null ) return;

			try {
				//Create a file for the update key
				FileWriter myWriter = new FileWriter(this.getUpdateKeyConfigFile(BaseConfigFile));
				
				myWriter.write("key " + config.getDnsUpdateKey().getKeyName() + " {" + "\n");
				
				myWriter.write("\t" + "algorithm " + config.getDnsUpdateKey().getAlg() + ";" + "\n");
				myWriter.write("\t" + "secret \"" + config.getDnsUpdateKey().getSecret() + "\";" + "\n");
				
				
				myWriter.write("};" + "\n");
				
				//Close the opened file
				myWriter.close();
				
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	 
	 public void writeConfig(String baseConfigFile) {
		 
			this.WriteToMainFile(baseConfigFile);
			this.WriteToOptionsFile(baseConfigFile);
			this.WriteToDDNSOptionsFile(baseConfigFile);
			this.WriteToHostsConfigFile(baseConfigFile);
			this.WriteToSubnetsConfigFile(baseConfigFile);
			this.WriteToUpdateZonesConfigFile(baseConfigFile);
			this.WriteToKeysConfigFile(baseConfigFile);

	 }
	 
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
