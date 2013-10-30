package compiler.semantic;
import compiler.ast.Ast;
import compiler.ast.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Semantic{
Ast archivo;
	public Semantic (Ast name){    
		archivo= name;
	}      
	public void Semant (PrintStream out, boolean deb, boolean printSemantic) throws IOException{
		out.println("Stage: semantic");
		VisitorRoot Simbolos1 = (VisitorRoot) archivo.getTreeRoot().getList().get(0);
		Root variables = (Root) Simbolos1.retFiel();
		Root metodos = (Root) Simbolos1.retMethod();
		
		List<Node> listaCampos = variables.getList();
		List<Node> listaMetodos = metodos.getList();
		
		List<Simbolo> tablaSimbolos = new ArrayList<Simbolo>();
		
		Variable Var;
		Metodo Met;

		for (int i=0; i< listaCampos.size(); i++){
			//System.out.println ("entro");
			Var = (Variable) ((Root) listaCampos.get(i)).getList().get(0);
			tablaSimbolos.add(new Simbolo(Var.retID(), (i*4), Var.retTipo()));
		}
		for (int i=0; i< listaMetodos.size(); i++){
		//System.out.println ("entro1");
			Met = (Metodo) listaMetodos.get(i);
			System.out.println(Met.retId());
			tablaSimbolos.add(new Simbolo(Met.retId(), 0, "void"));
		}
		//System.out.println(printSemantic);
		if (printSemantic == true) {
		//System.out.println(tablaSimbolos);
			out.println(tablaSimbolos);
		}
		if (deb == true){
			System.out.println(tablaSimbolos);
		}
		if(deb==true){
			Debug debug = new Debug();
			debug.DebugPrint("semantic");
		}
	 }
	public String toString(){ 
		String s= " stage: Semantic";
		return s;
	}
}