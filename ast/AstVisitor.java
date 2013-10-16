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
			variables.add(new Variable(ctx.type().getText(), ctx.field2(i).getText()));
		}	
		return variables;
	}

}
