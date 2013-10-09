package compiler.ast;
import compiler.parser.CC4Parser;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;
import org.antlr.v4.runtime.tree.*;

public class Ast{
CC4Parser file;
	public Ast (CC4Parser name){  
		file= name;
	}      
	public void AsPrint (PrintStream out, boolean deb) throws IOException{ 
			out.println("Stage: ast");
			start();
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("ast");
			}
	 }
	public String toString(){ 
		String s= " stage: ast";
		return s;
	}
	public void start() throws IOException{
	
		ParseTree tree = file.ExecParse();
		
		AstVisitor visitor = new AstVisitor();
		Root root = (Root)visitor.visit(tree);
	
		root.print("");
	}
}