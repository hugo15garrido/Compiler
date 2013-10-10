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
	@Override public Node visitMethodDecl(DecafParse.MethodDeclContext ctx) 
	{ Node op =  (visit(ctx.type())); 
		root.add(op);
		List<DecafParse.IdContext> id2 = ctx.id();
		
		for(DecafParse.IdContext e : id2){
			root.add(visit(e));
			System.out.println (e);
		}
		return root;
	}
	
	@Override public Node visitFielddecl(DecafParse.FielddeclContext ctx) { 
		Node op =  (visit(ctx.type()));
		root.add(op);
		List<DecafParse.Field2Context> fieldDecl2 = ctx.field2();
		
		for(DecafParse.Field2Context e : fieldDecl2){
			root.add(visit(e));
			System.out.println (e);
		}
		return root;
	}
	
	@Override public Node visitLiteralInt(DecafParse.LiteralIntContext ctx) { 
		return new IntLiteral(ctx.int_literal().getText()); 
	}
	@Override public Node visitLiteralChar(DecafParse.LiteralCharContext ctx) { 
		return new IntLiteral(ctx.SINGLECHAR().getText()); 
	}

}
