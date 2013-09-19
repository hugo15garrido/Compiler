package laboratorios.lab04;
 
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import laboratorios.lab04.Lab04Parser;
import laboratorios.lab04.Lab04ParserBaseVisitor;

 
public class AstVisitor extends Lab04ParserBaseVisitor <Node>{

	/*@Override public Node visitVarMin(Lab04Parser.VarMinContext ctx) { 	
		TerminalNode op =  ctx.RESTA();
		return new BinOp(op.getText(), visit(ctx.ENTERO(0)), visit(ctx.ENTERO(1))); }

	@Override public Node visitExpression(Lab04Parser.ExpressionContext ctx) { 
		Root root = new Root();
		
		List<Lab04Parser.Expr_listContext> start = ctx.expr_list();
		
		for(Lab04Parser.Expr_listContext e : start){
			root.add(visit(e));
		}
		return root;
	}*/

	@Override public Node visitSpaced(Lab04Parser.SpacedContext ctx) { 
		return new IntLiteral(ctx.ENTERO().getText());
	}
	
	/*@Override public Node visitVarDiv(Lab04Parser.VarDivContext ctx) { 
		TerminalNode op =  ctx.DIVISION();
		return new BinOp(op.getText(), visit(ctx.ENTERO(0)), visit(ctx.ENTERO(1)));
	}
	
	@Override public Node visitVarMult(Lab04Parser.VarMultContext ctx) { 		
		TerminalNode op =  ctx.MULTIPLICACION();
		return new BinOp(op.getText(), visit(ctx.ENTERO(0)), visit(ctx.ENTERO(1))); 
	}
	
	@Override public Node visitVarSum(Lab04Parser.VarSumContext ctx) { 		
		TerminalNode op =  ctx.SUMA();
		return new BinOp(op.getText(), visit(ctx.ENTERO(0)), visit(ctx.ENTERO(1)));  
	}
	
	@Override public Node visitVarInt(Lab04Parser.VarIntContext ctx) { 
		return new IntLiteral(ctx.ENTERO().getText()); 
	}*/
}
