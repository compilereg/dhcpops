import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.aast.cndc.dhcpparser.iscdhcpLexer;
import edu.aast.cndc.dhcpparser.iscdhcpParser;
import listeners.DHCPFilerLoader;

public class Starter {
	private static String filename = "config/dhcpd.conf.options";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Starting parsing DHCP");
		
		//Read the input file content
		CharStream input = CharStreams.fromFileName(filename);
		
		// create a lexer that feeds off of input CharStream
		iscdhcpLexer lexer = new iscdhcpLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		iscdhcpParser parser = new iscdhcpParser(tokens);
		
		//Call to the new parser with listener
		ParseTreeWalker walker = new ParseTreeWalker();
		DHCPFilerLoader loader = new DHCPFilerLoader();
		ParseTree tree = parser.config();
		
		walker.walk(loader, tree	);
		
		System.out.println(tree.toStringTree(parser)); 
		
		//Call to the original parse
		/*
		 * 
		// create a parser that feeds off the tokens buffer
		
		
		
		ParseTree tree = parser.config(); // begin parsing at init rule
		//System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		*/
		
	}

}
