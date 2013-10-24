package compiler.ast;

import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

 
public class AstVisitor extends DecafParseBaseVisitor <Node>{

	@Override public Node visitRoot(DecafParse.RootContext ctx) {
		Root root = new Root();
		Root rootfieldDecl = new Root();
		Root rootmethodDecl = new Root();
		List<DecafParse.Field_declContext> fieldDecl = ctx.field_decl();
		List<DecafParse.Method_declContext> methodDecl = ctx.method_decl();
		
		for(DecafParse.Field_declContext e : fieldDecl){
			rootfieldDecl.add(visit(e));
		}
		
		for(DecafParse.Method_declContext e : methodDecl){
			rootmethodDecl.add(visit(e));
		}
		root.add(new VisitorRoot(ctx.PROGRAM(), rootfieldDecl, rootmethodDecl));
		return root;
	}
	
	@Override public Node visitFielddecl(DecafParse.FielddeclContext ctx) { 
		Root variables = new Root();
		int Variables = ctx.field2().size();
		for (int i = 0; i<Variables; i++){
			variables.add(new Variable(ctx.type().getText(), ctx.field2(i).getText(), "var"));
		}	
		return variables;
	}
	
	@Override public Node visitMethodDecl(DecafParse.MethodDeclContext ctx) {

		//System.out.println (ctx.method_param().getText());
		
		Node parametros = ctx.method_param() == null? (new Root()) : visit(ctx.method_param());
		Node bloque = ctx.block() == null? (new Root()) : visit(ctx.block());
		Node tipo =  visit(ctx.metodo2());
		
		return new Metodo(tipo, ctx.id().getText(), parametros, bloque, ctx.metodo2().getText());
		
	}
	
	@Override public Node visitMethodParameter(DecafParse.MethodParameterContext ctx) {
		int i1 = ctx.type().size();
		Root parametros = new Root();
		for (int i=0;i<i1; i++){
			parametros.add(new Variable(ctx.type(i).getText(), ctx.id(i).getText(), "param"));
		}
		return parametros;
	}
	
	@Override public Node visitMethodDeclType(DecafParse.MethodDeclTypeContext ctx) { 
		return new SimpleNode(ctx.type().getText()); 
	}

}
