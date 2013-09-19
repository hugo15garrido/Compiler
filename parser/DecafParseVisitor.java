// Generated from parser\DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;


import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParseVisitor<T> extends ParseTreeVisitor<T> {
	T visitBreakSemi(DecafParse.BreakSemiContext ctx);

	T visitBlockExpr(DecafParse.BlockExprContext ctx);

	T visitRoot(DecafParse.RootContext ctx);

	T visitIntType(DecafParse.IntTypeContext ctx);

	T visitAsignationColon(DecafParse.AsignationColonContext ctx);

	T visitLocationOp(DecafParse.LocationOpContext ctx);

	T visitOpAnd(DecafParse.OpAndContext ctx);

	T visitStatement2(DecafParse.Statement2Context ctx);

	T visitStatement1(DecafParse.Statement1Context ctx);

	T visitMethodDecl(DecafParse.MethodDeclContext ctx);

	T visitIdentifier(DecafParse.IdentifierContext ctx);

	T visitLiteralBoolean(DecafParse.LiteralBooleanContext ctx);

	T visitIntLiteralHex(DecafParse.IntLiteralHexContext ctx);

	T visitAssignOp1(DecafParse.AssignOp1Context ctx);

	T visitAssignOp2(DecafParse.AssignOp2Context ctx);

	T visitOpMinus(DecafParse.OpMinusContext ctx);

	T visitFielddecl1(DecafParse.Fielddecl1Context ctx);

	T visitFielddecl2(DecafParse.Fielddecl2Context ctx);

	T visitVardeclaration(DecafParse.VardeclarationContext ctx);

	T visitLiteralChar(DecafParse.LiteralCharContext ctx);

	T visitLiteralExpr2(DecafParse.LiteralExpr2Context ctx);

	T visitLiteralInt(DecafParse.LiteralIntContext ctx);

	T visitLocationId(DecafParse.LocationIdContext ctx);

	T visitForAssignation(DecafParse.ForAssignationContext ctx);

	T visitBooleannType(DecafParse.BooleannTypeContext ctx);

	T visitOpEqual(DecafParse.OpEqualContext ctx);

	T visitExprAst2(DecafParse.ExprAst2Context ctx);

	T visitBlockStatement(DecafParse.BlockStatementContext ctx);

	T visitMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx);

	T visitLocation1(DecafParse.Location1Context ctx);

	T visitLiteralString(DecafParse.LiteralStringContext ctx);

	T visitExpreParen(DecafParse.ExpreParenContext ctx);

	T visitOpShifft1(DecafParse.OpShifft1Context ctx);

	T visitOpMuldDiv(DecafParse.OpMuldDivContext ctx);

	T visitCalloutArg2(DecafParse.CalloutArg2Context ctx);

	T visitMethodCall(DecafParse.MethodCallContext ctx);

	T visitCalloutArg1(DecafParse.CalloutArg1Context ctx);

	T visitMethodName(DecafParse.MethodNameContext ctx);

	T visitExpr3(DecafParse.Expr3Context ctx);

	T visitContinueSemi(DecafParse.ContinueSemiContext ctx);

	T visitExpr1(DecafParse.Expr1Context ctx);

	T visitCallMethod(DecafParse.CallMethodContext ctx);

	T visitMethodCall1(DecafParse.MethodCall1Context ctx);

	T visitMethodCall2(DecafParse.MethodCall2Context ctx);

	T visitIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx);

	T visitRoot2(DecafParse.Root2Context ctx);

	T visitMethodDeclType(DecafParse.MethodDeclTypeContext ctx);

	T visitOpShifft(DecafParse.OpShifftContext ctx);

	T visitOpMsm(DecafParse.OpMsmContext ctx);

	T visitFielddecl(DecafParse.FielddeclContext ctx);

	T visitOpOr(DecafParse.OpOrContext ctx);

	T visitBlockdefinition(DecafParse.BlockdefinitionContext ctx);

	T visitOpNot(DecafParse.OpNotContext ctx);

	T visitRoot1(DecafParse.Root1Context ctx);

	T visitVardeclaration1(DecafParse.Vardeclaration1Context ctx);
}