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

		Node parametros = ctx.method_param() == null? (new Root()) : visit(ctx.method_param());
		Node bloque = visit(ctx.block());
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
	
	@Override 
	public Node visitBlockdefinition(DecafParse.BlockdefinitionContext ctx) { 
		List<DecafParse.Var_declContext> var_decl_list = ctx.var_decl();
		List<DecafParse.StatementContext> statement_list = ctx.statement();
		Root variables1 = new Root();
		Root sentencias1 = new Root();
		for(DecafParse.Var_declContext e : var_decl_list){
			variables1.add(visit(e)); 
		}
		for(DecafParse.StatementContext e : statement_list){
			sentencias1.add(visit(e)); 
		}
		Block bloque = new Block(variables1, sentencias1);
		//bloque.print("");
		return new Block(variables1, sentencias1);
	}
	@Override 
	public Node visitVardeclaration(DecafParse.VardeclarationContext ctx) { 
		//System.out.println ("entro aqui");
		int cantVar = ctx.id().size();
		String vars;
		vars = ctx.id(0).getText();
		for (int i = 1; i<cantVar; i++){
			vars = vars + ", " + ctx.id(i).getText();
		}
		return new Variable(ctx.type().getText(), vars, "var"); 
	}
	@Override 
	public Node visitVardeclaration1(DecafParse.Vardeclaration1Context ctx) {
		//System.out.println ("entro aqui1");
		//System.out.println (ctx.id().getText());
		//System.out.println (ctx.ASSIGNATION().getText());
		//System.out.println (ctx.id().getText());
		int cantExpr = ctx.expr().size();
		//System.out.println (ctx.expr(0).getText());
		//System.out.println (ctx.expr(1).getText());
		return new VarDecl1(ctx.id().getText(), ctx.ASSIGNATION().getText(), visit(ctx.expr(0)), visit(ctx.expr(1))); 
	}
	@Override 
	public Node visitStatement1(DecafParse.Statement1Context ctx) { 
	//System.out.println ("entro aqui2");
	//System.out.println (ctx.location().getText());
	//System.out.println (ctx.expr().getText());
	Assign_op operacion = new Assign_op(visit(ctx.location()), ctx.assign_op().getText(), visit(ctx.expr()));
	operacion.print("");
		return new Assign_op(visit(ctx.location()), ctx.assign_op().getText(), visit(ctx.expr())); 
	}	
	@Override 
	public Node	visitLocation1(DecafParse.Location1Context ctx){
			Node expresion = ctx.expr() == null? (new Root()) : visit(ctx.expr());
			return new Location (ctx.id().getText(), expresion);
	}
	@Override 
	public Node visitExpr1(DecafParse.Expr1Context ctx) { 
		return visit(ctx.op_or());
	}
	@Override 
	public Node	visitExprAst2(DecafParse.ExprAst2Context ctx){
		return new SimpleNode(ctx.id().getText());
	}
	@Override 
	public Node	visitExpr3(DecafParse.Expr3Context ctx){
		return new SimpleNode(ctx.literal().getText());
	}
	@Override 
	public Node	visitOpOr(DecafParse.OpOrContext ctx){
		//if (ctx.OR().size() == 0){
			return visit(ctx.op_and(0));
		/*}else{
		System.out.println("entro OPOR1");
			int i1 = ctx.op_and().size();
			Root opAnd = new Root();
			for (int i=0;i<i1; i++){
				opAnd.add(new Location(ctx.OR(i).getText(), visit(ctx.op_and(i))));
			}
			return opAnd;
		}*/
	}
	@Override 
	public Node	visitOpAnd(DecafParse.OpAndContext ctx){
		//if (ctx.AND().size() == 0){
			return visit(ctx.eq_op(0));
		/*}else{
			int i1 = ctx.eq_op().size();
			Root opEq = new Root();
			for (int i=0;i<i1; i++){
				opEq.add(new Location(ctx.AND(i).getText(), visit(ctx.eq_op(i))));
			}
			return opEq;
		}*/
	}
	@Override 
	public Node	visitOpEqual(DecafParse.OpEqualContext ctx){
		//if (ctx.EQUALS().size() == 0 && ctx.NOTEQUAL().size() == 0){
			return visit(ctx.op_rel(0));
		/*}else{
			int i1 = ctx.op_rel().size();
			Root opEq = new Root();
			String eq_not_eq;
			for (int i=0;i<i1; i++){
				if (ctx.EQUALS(i) == null){
					eq_not_eq = ctx.NOTEQUAL(i).getText();
				}else{
					eq_not_eq = ctx.EQUALS(i).getText();
				}
				opEq.add(new Location(eq_not_eq, visit(ctx.op_rel(i))));
			}
			return opEq;
		}*/
	}
	@Override 
	public Node	visitOpShifft(DecafParse.OpShifftContext ctx) { 
		//if (ctx.GREATERTHANOREQUALTO().size() == 0 && ctx.LESSTHANOREQUALTO().size() == 0 && ctx.GREATERTHAN().size() == 0 && ctx.LESSTHAN().size() == 0){
			return visit(ctx.op_shift(0));
		/*}else{
			Root opShifft = new Root();
			return opShifft;
		}*/		
	}
	@Override 
	public Node	visitOpShifft1(DecafParse.OpShifft1Context ctx) { 
		//if (ctx.SLL().size() == 0 && ctx.SRL().size() == 0){
			return visit(ctx.op_msm(0));
		/*}else{
			Root opMsm = new Root();
			return opMsm;
		}*/		
	}
	@Override 
	public Node	visitOpMsm(DecafParse.OpMsmContext ctx){
		if (ctx.operador_suma().size() == 0){
			return visit(ctx.op_muldiv(0));
		}else{
			//System.out.println(ctx.operador_suma().size());
			//System.out.println(ctx.op_muldiv().size());
			int i1 = ctx.op_muldiv().size();
			Root opMsm = new Root();
			for (int i=0;i+1<i1; i++){
			//System.out.println(ctx.operador_suma(i).getText());
			//System.out.println(ctx.op_muldiv(i).getText());
			//System.out.println(ctx.op_muldiv(i+1).getText());
				opMsm.add(new BinOp(ctx.operador_suma(i).getText(), visit(ctx.op_muldiv(i)), visit(ctx.op_muldiv(i+1))));
			}
			//opMsm.print();
			return opMsm;
		}		
	}
}
