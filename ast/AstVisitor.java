package compiler.ast;

import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

 
public class AstVisitor extends DecafParseBaseVisitor <Node>{

	@Override public Node visitRoot(DecafParse.RootContext ctx) { 
		Root root = new Root();
		
		List<DecafParse.Field_declContext> start = ctx.field_decl();
		
		for(DecafParse.Field_declContext e : start){
			root.add(visit(e));
			System.out.println (e);
		}
		return root;
	}

}
