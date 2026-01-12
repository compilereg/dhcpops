package configuration;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.aast.cndc.dhcpparser.iscdhcpLexer;
import edu.aast.cndc.dhcpparser.iscdhcpParser;
import listeners.DHCPFilerLoader;
import models.DHCPConfig;

public class DHCPConfigurationParser {

	
	public static DHCPConfig parseDHCP(String filename,DHCPConfig config) {
		
		
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
				config = parseDHCP(includeFile,config);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return config;
	}
}
