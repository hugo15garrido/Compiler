package compiler.ast;

import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

 
public class AstVisitor extends DecafParseBaseVisitor <Node>{
Root root = new Root();
	@Override public Node visitRoot(DecafParse.RootContext ctx) { 
		
		
		List<DecafParse.Field_declContext> fieldDecl = ctx.field_decl();
		List<DecafParse.Method_declContext> methodDecl = ctx.method_decl();
		
		for(DecafParse.Field_declContext e : fieldDecl){
			root.add(visit(e));
			System.out.println (e);
		}
		
		for(DecafParse.Method_declContext e : methodDecl){
			root.add(visit(e));
			System.out.println (e);
		}
		return root;
	}
	
	@Override public Node visitFielddecl(DecafParse.FielddeclContext ctx) { 
		
		List<DecafParse.Field2Context> fieldDecl2 = ctx.field2();
		
		for(DecafParse.Field2Context e : fieldDecl2){
			root.add(visit(e));
			System.out.println (e);
		}
		return root;
	}

}
