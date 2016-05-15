package main;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import analyse.Tiger3Lexer;
import analyse.Tiger3Parser;
import sun.applet.Main;


public class Displaytree {
	public static void main(String[] args) throws IOException, RecognitionException {
		ANTLRFileStream input = new ANTLRFileStream("../Fichier_test/test1.tg");
		Tiger3Lexer lexer = new Tiger3Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Tiger3Parser parser = new Tiger3Parser(tokens);
		Tiger3Parser.tiger3_return r = parser.tiger3();
		CommonTree t = (CommonTree)r.getTree();
		System.out.println(t.toStringTree());
		System.out.println(((CommonTree)t.getChild(0)).getToken().getText());
	}
}
