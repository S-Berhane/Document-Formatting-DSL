
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.resumecompiler.parser.ResumeLexer;
import com.resumecompiler.parser.ResumeParser;

/**
 * @author Simon Berhane
 * This program takes the absolute paths of data file's and design file's. It appends the data
 * into specified design file tags, and outputs a filled in template.
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if(args.length < 2) {
			throw new Exception("Insufficient number of arguments.");
		}
		//Initialize the Lexer and Parser
		ANTLRInputStream input = new ANTLRFileStream(args[0]);
		ResumeLexer lexer = new ResumeLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ResumeParser parser = new ResumeParser(tokens);
		ParseTree tree = parser.startrule();
		
		//Grab specified HTML element
		File template = new File(args[1]);
		Document doc = Jsoup.parse(template, "UTF-8", "http");
		
		//Walk the tree and listen for events
		ParseTreeWalker walker = new ParseTreeWalker();
		ResumeListener listener = new ResumeListener(doc);
		walker.walk(listener, tree);
		
		//Write the updated document
		final File f = new File("resume1.html");
		FileUtils.writeStringToFile(f, doc.toString());
			
		//Optionally load other sources ... for revision 2
		
	}

}
