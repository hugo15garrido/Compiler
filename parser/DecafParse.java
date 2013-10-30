// Generated from parser\DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParse extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSEDBRACE=20, ASSIGNATION=11, INVALIDNEWLINE=51, CLASS=37, MOD=19, INVALIDDOUBLEQUOTE=49, 
		FOR=41, EQUALS=10, CLOSEDBRACKET=30, SLL=42, NOT=26, AND=25, BREAK=35, 
		CLOSEDPAREN=13, PLUSEQUAL=23, IF=44, NOTEQUAL=24, GREATEROREQUALTO=22, 
		GREATERTHANOREQUALTO=31, BOOLEAN=33, LESSOREQUAL=28, CONTINUE=39, INVALIDSINGLEQUOTE=46, 
		IDENTIFIER=54, ASSIGN_ERROR=56, RETURN=47, DIVISION=4, PLUS=1, VOID=48, 
		CLOSEDTHING=17, COMMENT=8, GREATERTHAN=21, CALLOUT=36, OPENBRACE=14, LESSTHAN=27, 
		INVALIDSYMBOL=50, SRL=43, ELSE=40, NUMBER=5, OPENBRACKET=29, ONE_CHAR=55, 
		WHITESPACE=7, HEXADECIMAL=9, SEMICOLON=6, INT=45, MINUS=2, COLON=18, SINGLECHAR=52, 
		OR=15, BOOLEANN=34, OPENTHING=16, MULTIPLICATION=3, PROGRAM=38, LESSTHANOREQUALTO=32, 
		OPENPAREN=12, STRING=53, EXPR=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "NUMBER", "';'", "WHITESPACE", 
		"COMMENT", "HEXADECIMAL", "'=='", "'='", "'('", "')'", "'{'", "'||'", 
		"OPENTHING", "CLOSEDTHING", "','", "'%'", "'}'", "'<'", "GREATEROREQUALTO", 
		"'+='", "'!='", "'&&'", "'!'", "'>'", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "'boolean'", "'break'", 
		"'callout'", "'class'", "'Program'", "'continue'", "'else'", "'for'", 
		"'>>'", "'<<'", "'if'", "'int'", "INVALIDSINGLEQUOTE", "'return'", "'void'", 
		"INVALIDDOUBLEQUOTE", "INVALIDSYMBOL", "INVALIDNEWLINE", "SINGLECHAR", 
		"STRING", "IDENTIFIER", "ONE_CHAR", "ASSIGN_ERROR", "EXPR"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_field2 = 2, RULE_method_decl = 3, 
		RULE_method_param = 4, RULE_metodo2 = 5, RULE_block = 6, RULE_var_decl = 7, 
		RULE_type = 8, RULE_statement = 9, RULE_assign_op = 10, RULE_method_call = 11, 
		RULE_method_name = 12, RULE_callout_arg = 13, RULE_expr = 14, RULE_op_or = 15, 
		RULE_op_and = 16, RULE_eq_op = 17, RULE_operador_eq = 18, RULE_op_rel = 19, 
		RULE_operador_rel = 20, RULE_op_shift = 21, RULE_operador_shifft = 22, 
		RULE_op_msm = 23, RULE_operador_suma = 24, RULE_op_muldiv = 25, RULE_operador_division = 26, 
		RULE_not = 27, RULE_minus = 28, RULE_expr2 = 29, RULE_literal = 30, RULE_string_literal = 31, 
		RULE_location = 32, RULE_id = 33, RULE_int_literal = 34;
	public static final String[] ruleNames = {
		"program", "field_decl", "field2", "method_decl", "method_param", "metodo2", 
		"block", "var_decl", "type", "statement", "assign_op", "method_call", 
		"method_name", "callout_arg", "expr", "op_or", "op_and", "eq_op", "operador_eq", 
		"op_rel", "operador_rel", "op_shift", "operador_shifft", "op_msm", "operador_suma", 
		"op_muldiv", "operador_division", "not", "minus", "expr2", "literal", 
		"string_literal", "location", "id", "int_literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParse.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }



		public Stack<String> stack1 = new Stack<String>();
		public Stack<String> stack2 = new Stack<String>();

		public void Error(String msg, int line){
			ErrorHandler e = new ErrorHandler();
			e.parserError(msg,line);
		}

	public DecafParse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Root2Context extends ProgramContext {
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(DecafParse.PROGRAM, 0); }
		public TerminalNode CLASS() { return getToken(DecafParse.CLASS, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Root2Context(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterRoot2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitRoot2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitRoot2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RootContext extends ProgramContext {
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(DecafParse.PROGRAM, 0); }
		public TerminalNode CLASS() { return getToken(DecafParse.CLASS, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public RootContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Root1Context extends ProgramContext {
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(DecafParse.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParse.PROGRAM, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Root1Context(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterRoot1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitRoot1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitRoot1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(CLASS);
				setState(71); match(PROGRAM);
				setState(72); match(OPENBRACE);
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(73); field_decl();
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(79); method_decl();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85); match(CLOSEDBRACE);
				 stack1.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				 stack2.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				}
				break;

			case 2:
				_localctx = new Root1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLASS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(89); match(PROGRAM);
				setState(90); match(OPENBRACE);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(91); field_decl();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(97); method_decl();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103); match(CLOSEDBRACE);
				Error("Expecting \"CLASS\" ", ((TokenStream) this).LT(-1).getLine() );
				}
				break;

			case 3:
				_localctx = new Root2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105); match(CLASS);
				setState(106);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(107); match(OPENBRACE);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(108); field_decl();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(114); method_decl();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120); match(CLOSEDBRACE);
				Error("Expecting \"Program\" ", ((TokenStream) this).LT(-1).getLine());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	 
		public Field_declContext() { }
		public void copyFrom(Field_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FielddeclContext extends Field_declContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<Field2Context> field2() {
			return getRuleContexts(Field2Context.class);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public Field2Context field2(int i) {
			return getRuleContext(Field2Context.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FielddeclContext(Field_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterFielddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitFielddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitFielddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			_localctx = new FielddeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124); type();
			{
			setState(125); field2();
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(126); match(COLON);
				setState(127); field2();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(SEMICOLON);
			 stack1.push("field_decl	: type (field2)(COLON field2)* SEMICOLON");
			 stack2.push("field_decl	: type (field2)(COLON field2)* SEMICOLON");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field2Context extends ParserRuleContext {
		public Field2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field2; }
	 
		public Field2Context() { }
		public void copyFrom(Field2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fielddecl1Context extends Field2Context {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Fielddecl1Context(Field2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterFielddecl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitFielddecl1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitFielddecl1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fielddecl2Context extends Field2Context {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Fielddecl2Context(Field2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterFielddecl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitFielddecl2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitFielddecl2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field2Context field2() throws RecognitionException {
		Field2Context _localctx = new Field2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_field2);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Fielddecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137); id();
				 stack1.push("field2: id");
				 stack2.push("field2: id");
				}
				break;

			case 2:
				_localctx = new Fielddecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); id();
				setState(142); match(OPENTHING);
				setState(143); int_literal();
				setState(144); match(CLOSEDTHING);
				 stack1.push("field2: id OPENTHING int_literal CLOSEDTHING");
				 stack2.push("field2: id OPENTHING int_literal CLOSEDTHING");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
	 
		public Method_declContext() { }
		public void copyFrom(Method_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclContext extends Method_declContext {
		public Method_paramContext method_param() {
			return getRuleContext(Method_paramContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public Metodo2Context metodo2() {
			return getRuleContext(Metodo2Context.class,0);
		}
		public MethodDeclContext(Method_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150); metodo2();
			setState(151); id();
			setState(152); match(OPENPAREN);
			setState(154);
			_la = _input.LA(1);
			if (_la==BOOLEANN || _la==INT) {
				{
				setState(153); method_param();
				}
			}

			setState(156); match(CLOSEDPAREN);
			setState(157); block();
			 stack1.push("metodo2 id OPENPAREN method_param? CLOSEDPAREN block");
			 stack2.push("metodo2 id OPENPAREN method_param? CLOSEDPAREN block");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_paramContext extends ParserRuleContext {
		public Method_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param; }
	 
		public Method_paramContext() { }
		public void copyFrom(Method_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodParameterContext extends Method_paramContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public MethodParameterContext(Method_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_paramContext method_param() throws RecognitionException {
		Method_paramContext _localctx = new Method_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_param);
		int _la;
		try {
			_localctx = new MethodParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161); type();
			setState(162); id();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(163); match(COLON);
				setState(164); type();
				setState(165); id();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("type id (COLON type id)* ");
			 stack2.push("type id (COLON type id)* ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metodo2Context extends ParserRuleContext {
		public Metodo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo2; }
	 
		public Metodo2Context() { }
		public void copyFrom(Metodo2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclVoidContext extends Metodo2Context {
		public TerminalNode VOID() { return getToken(DecafParse.VOID, 0); }
		public MethodDeclVoidContext(Metodo2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodDeclVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodDeclVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodDeclVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodDeclTypeContext extends Metodo2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclTypeContext(Metodo2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metodo2Context metodo2() throws RecognitionException {
		Metodo2Context _localctx = new Metodo2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodo2);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new MethodDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); type();
				 stack1.push("metodo2: type;");
				 stack2.push("metodo2: type;");
				}
				break;
			case VOID:
				_localctx = new MethodDeclVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179); match(VOID);
				 stack1.push("metodo2: VOID;");
				 stack2.push("metodo2: VOID;");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockdefinitionContext extends BlockContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public BlockdefinitionContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBlockdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBlockdefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBlockdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			int _alt;
			_localctx = new BlockdefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(OPENBRACE);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(185); var_decl();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(191); statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); match(CLOSEDBRACE);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(198); var_decl();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(204); statement();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			 stack1.push("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");
			 stack2.push("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VardeclarationContext extends Var_declContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VardeclarationContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitVardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vardeclaration1Context extends Var_declContext {
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Vardeclaration1Context(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterVardeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitVardeclaration1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitVardeclaration1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		int _la;
		try {
			setState(236);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new VardeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213); type();
				setState(214); id();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(215); match(COLON);
					setState(216); id();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222); match(SEMICOLON);
				 stack1.push("var_decl	: type id (COLON id)* SEMICOLON");
				 stack2.push("var_decl	: type id (COLON id)* SEMICOLON");
				}
				break;
			case IDENTIFIER:
				_localctx = new Vardeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226); id();
				setState(227); match(OPENTHING);
				setState(228); expr();
				setState(229); match(CLOSEDTHING);
				setState(230); match(ASSIGNATION);
				setState(231); expr();
				setState(232); match(SEMICOLON);
				 stack1.push("var_decl	: id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON");
				 stack2.push("var_decl	: id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleannTypeContext extends TypeContext {
		public TerminalNode BOOLEANN() { return getToken(DecafParse.BOOLEANN, 0); }
		public BooleannTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBooleannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBooleannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBooleannType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(DecafParse.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238); match(INT);
				 stack1.push("type		: INT");
				 stack2.push("type		: INT");
				}
				break;
			case BOOLEANN:
				_localctx = new BooleannTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); match(BOOLEANN);
				 stack1.push("type		: BOOLEANN");
				 stack2.push("type		: BOOLEANN");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakSemiContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(DecafParse.BREAK, 0); }
		public BreakSemiContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBreakSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBreakSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBreakSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForAssignationContext extends StatementContext {
		public TerminalNode COLON() { return getToken(DecafParse.COLON, 0); }
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DecafParse.FOR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ForAssignationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterForAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitForAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitForAssignation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExprContext extends StatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public TerminalNode ELSE() { return getToken(DecafParse.ELSE, 0); }
		public TerminalNode IF() { return getToken(DecafParse.IF, 0); }
		public BlockExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement2Context extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Statement2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitStatement2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitStatement2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement1Context extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public Statement1Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterStatement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitStatement1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitStatement1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueSemiContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParse.CONTINUE, 0); }
		public ContinueSemiContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterContinueSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitContinueSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitContinueSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallMethodContext extends StatementContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public CallMethodContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignationColonContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DecafParse.RETURN, 0); }
		public AsignationColonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterAsignationColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitAsignationColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitAsignationColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Statement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246); location();
				setState(247); assign_op();
				setState(248); expr();
				setState(249); match(SEMICOLON);
				 stack1.push("statement	: location assign_op expr SEMICOLON");
				 stack2.push("statement	: location assign_op expr SEMICOLON");
				}
				break;

			case 2:
				_localctx = new Statement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253); method_call();
				setState(254); match(SEMICOLON);
				 stack1.push("statement	: method_call SEMICOLON ");
				 stack2.push("statement	: method_call SEMICOLON ");
				}
				break;

			case 3:
				_localctx = new CallMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258); method_call();
				 stack1.push("statement	: method_call");
				 stack2.push("statement	: method_call");
				}
				break;

			case 4:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262); match(IF);
				setState(263); match(OPENPAREN);
				setState(264); expr();
				setState(265); match(CLOSEDPAREN);
				setState(266); block();
				{
				setState(267); match(ELSE);
				{
				setState(268); block();
				}
				}
				 stack1.push("statement	: IF OPENPAREN expr CLOSEDPAREN block (ELSE (block))");
				 stack2.push("statement	: IF OPENPAREN expr CLOSEDPAREN block (ELSE (block))");
				}
				break;

			case 5:
				_localctx = new ForAssignationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273); match(FOR);
				setState(274); id();
				setState(275); match(ASSIGNATION);
				setState(276); expr();
				setState(277); match(COLON);
				setState(278); expr();
				setState(279); block();
				 stack1.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				 stack2.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				}
				break;

			case 6:
				_localctx = new AsignationColonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283); match(RETURN);
				setState(284); expr();
				setState(285); match(SEMICOLON);
				 stack1.push("statement	: RETURN expr SEMICOLON");
				 stack2.push("statement	: RETURN expr SEMICOLON");
				}
				break;

			case 7:
				_localctx = new BreakSemiContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289); match(BREAK);
				setState(290); match(SEMICOLON);
				 stack1.push("statement	: BREAK SEMICOLON");
				 stack2.push("statement	: BREAK SEMICOLON");
				}
				break;

			case 8:
				_localctx = new ContinueSemiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(293); match(CONTINUE);
				setState(294); match(SEMICOLON);
				 stack1.push("statement	: CONTINUE SEMICOLON");
				 stack2.push("statement	: CONTINUE SEMICOLON");
				}
				break;

			case 9:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(297); block();
				 stack1.push("statement	: block");
				 stack2.push("statement	: block");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	 
		public Assign_opContext() { }
		public void copyFrom(Assign_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignOp1Context extends Assign_opContext {
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public AssignOp1Context(Assign_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterAssignOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitAssignOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitAssignOp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignOp2Context extends Assign_opContext {
		public TerminalNode PLUSEQUAL() { return getToken(DecafParse.PLUSEQUAL, 0); }
		public AssignOp2Context(Assign_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterAssignOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitAssignOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitAssignOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_op);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case ASSIGNATION:
				_localctx = new AssignOp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303); match(ASSIGNATION);
				 stack1.push("assign_op	: ASSIGNATION");
				 stack2.push("assign_op	: ASSIGNATION");
				}
				break;
			case PLUSEQUAL:
				_localctx = new AssignOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(PLUSEQUAL);
				 stack1.push("assign_op	: PLUSEQUAL");
				 stack2.push("assign_op	: PLUSEQUAL");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCall1Context extends Method_callContext {
		public TerminalNode COLON() { return getToken(DecafParse.COLON, 0); }
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public MethodCall1Context(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodCall1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodCall1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodCall1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCall2Context extends Method_callContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParse.CALLOUT, 0); }
		public MethodCall2Context(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodCall2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodCall2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_call);
		int _la;
		try {
			setState(344);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MethodCall1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311); method_name();
				setState(325);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					{
					setState(312); match(OPENPAREN);
					setState(313); expr();
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(314); match(COLON);
						setState(315); expr();
						}
						}
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(321); match(CLOSEDPAREN);
					}
					}
					break;

				case 2:
					{
					{
					setState(323); match(OPENPAREN);
					setState(324); match(CLOSEDPAREN);
					}
					}
					break;
				}
				 stack1.push("method_call	: method_name OPENPAREN  expr (COLON expr)* CLOSEDPAREN");
				 stack2.push("method_call	: method_name OPENPAREN  expr (COLON expr)* CLOSEDPAREN");
				}
				break;
			case CALLOUT:
				_localctx = new MethodCall2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330); match(CALLOUT);
				setState(331); match(OPENPAREN);
				setState(332); string_literal();
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(333); match(COLON);
					setState(334); callout_arg();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(340); match(CLOSEDPAREN);
				 stack1.push("method_call	: CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN");
				 stack2.push("method_call	: CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
	 
		public Method_nameContext() { }
		public void copyFrom(Method_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodNameContext extends Method_nameContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MethodNameContext(Method_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_name);
		try {
			_localctx = new MethodNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(346); id();
			 stack1.push("method_name	: id");
			 stack2.push("method_name	: id");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	 
		public Callout_argContext() { }
		public void copyFrom(Callout_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutArg2Context extends Callout_argContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public CalloutArg2Context(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterCalloutArg2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitCalloutArg2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitCalloutArg2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalloutArg1Context extends Callout_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CalloutArg1Context(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterCalloutArg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitCalloutArg1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitCalloutArg1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callout_arg);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
			case HEXADECIMAL:
			case OPENPAREN:
			case NOT:
			case BOOLEAN:
			case CALLOUT:
			case SINGLECHAR:
			case IDENTIFIER:
				_localctx = new CalloutArg1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350); expr();
				 stack1.push("callout_arg	: expr");
				 stack2.push("callout_arg	: expr");
				}
				break;
			case STRING:
				_localctx = new CalloutArg2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354); string_literal();
				 stack1.push("callout_arg	: string_literal");
				 stack2.push("callout_arg	: string_literal");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr3Context extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expr3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAst2Context extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public ExprAst2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExprAst2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExprAst2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExprAst2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1Context extends ExprContext {
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public Expr1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Expr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360); op_or();
				 stack1.push("expr		:op_or");
				 stack2.push("expr		:op_or");
				}
				break;

			case 2:
				_localctx = new ExprAst2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364); id();
				setState(365); match(OPENPAREN);
				setState(366); match(CLOSEDPAREN);
				 stack1.push("expr		:id OPENPAREN CLOSEDPAREN");
				 stack2.push("expr		:id OPENPAREN CLOSEDPAREN");
				}
				break;

			case 3:
				_localctx = new Expr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370); literal();
				 stack1.push("expr		:literal");
				 stack2.push("expr		:literal");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_orContext extends ParserRuleContext {
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
	 
		public Op_orContext() { }
		public void copyFrom(Op_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpOrContext extends Op_orContext {
		public List<Op_andContext> op_and() {
			return getRuleContexts(Op_andContext.class);
		}
		public TerminalNode OR(int i) {
			return getToken(DecafParse.OR, i);
		}
		public Op_andContext op_and(int i) {
			return getRuleContext(Op_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(DecafParse.OR); }
		public OpOrContext(Op_orContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_or);
		int _la;
		try {
			_localctx = new OpOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(376); op_and();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(377); match(OR);
				setState(378); op_and();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_or		:op_and(OR op_and)*");
			 stack2.push("op_or		:op_and(OR op_and)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_andContext extends ParserRuleContext {
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
	 
		public Op_andContext() { }
		public void copyFrom(Op_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpAndContext extends Op_andContext {
		public Eq_opContext eq_op(int i) {
			return getRuleContext(Eq_opContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DecafParse.AND); }
		public List<Eq_opContext> eq_op() {
			return getRuleContexts(Eq_opContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(DecafParse.AND, i);
		}
		public OpAndContext(Op_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_and);
		int _la;
		try {
			_localctx = new OpAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(387); eq_op();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(388); match(AND);
				setState(389); eq_op();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_and		:eq_op(AND eq_op )*");
			 stack2.push("op_and		:eq_op(AND eq_op )*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	 
		public Eq_opContext() { }
		public void copyFrom(Eq_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpEqualContext extends Eq_opContext {
		public Operador_eqContext operador_eq(int i) {
			return getRuleContext(Operador_eqContext.class,i);
		}
		public Op_relContext op_rel(int i) {
			return getRuleContext(Op_relContext.class,i);
		}
		public List<Op_relContext> op_rel() {
			return getRuleContexts(Op_relContext.class);
		}
		public List<Operador_eqContext> operador_eq() {
			return getRuleContexts(Operador_eqContext.class);
		}
		public OpEqualContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			_localctx = new OpEqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(398); op_rel();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOTEQUAL) {
				{
				{
				setState(399); operador_eq();
				setState(400); op_rel();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("eq_op		:op_rel(operador_eq op_rel)*");
			 stack2.push("eq_op		:op_rel(operador_eq op_rel)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_eqContext extends ParserRuleContext {
		public Operador_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_eq; }
	 
		public Operador_eqContext() { }
		public void copyFrom(Operador_eqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadoreqContext extends Operador_eqContext {
		public TerminalNode EQUALS() { return getToken(DecafParse.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DecafParse.NOTEQUAL, 0); }
		public OperadoreqContext(Operador_eqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperadoreq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperadoreq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperadoreq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_eqContext operador_eq() throws RecognitionException {
		Operador_eqContext _localctx = new Operador_eqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_eq);
		int _la;
		try {
			_localctx = new OperadoreqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 stack1.push("operador_eq : (EQUALS| NOTEQUAL)");
			 stack2.push("operador_eq : (EQUALS| NOTEQUAL)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relContext extends ParserRuleContext {
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
	 
		public Op_relContext() { }
		public void copyFrom(Op_relContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpShifftContext extends Op_relContext {
		public Operador_relContext operador_rel(int i) {
			return getRuleContext(Operador_relContext.class,i);
		}
		public Op_shiftContext op_shift(int i) {
			return getRuleContext(Op_shiftContext.class,i);
		}
		public List<Operador_relContext> operador_rel() {
			return getRuleContexts(Operador_relContext.class);
		}
		public List<Op_shiftContext> op_shift() {
			return getRuleContexts(Op_shiftContext.class);
		}
		public OpShifftContext(Op_relContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpShifft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpShifft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpShifft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_rel);
		int _la;
		try {
			_localctx = new OpShifftContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(414); op_shift();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) {
				{
				{
				setState(415); operador_rel();
				setState(416); op_shift();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*");
			 stack2.push("op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_relContext extends ParserRuleContext {
		public Operador_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_rel; }
	 
		public Operador_relContext() { }
		public void copyFrom(Operador_relContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorelContext extends Operador_relContext {
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(DecafParse.GREATERTHANOREQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(DecafParse.LESSTHAN, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(DecafParse.LESSTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(DecafParse.GREATERTHAN, 0); }
		public OperadorelContext(Operador_relContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperadorel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperadorel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperadorel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relContext operador_rel() throws RecognitionException {
		Operador_relContext _localctx = new Operador_relContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operador_rel);
		int _la;
		try {
			_localctx = new OperadorelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 stack1.push("operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)");
			 stack2.push("operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_shiftContext extends ParserRuleContext {
		public Op_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_shift; }
	 
		public Op_shiftContext() { }
		public void copyFrom(Op_shiftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpShifft1Context extends Op_shiftContext {
		public Operador_shifftContext operador_shifft(int i) {
			return getRuleContext(Operador_shifftContext.class,i);
		}
		public List<Operador_shifftContext> operador_shifft() {
			return getRuleContexts(Operador_shifftContext.class);
		}
		public Op_msmContext op_msm(int i) {
			return getRuleContext(Op_msmContext.class,i);
		}
		public List<Op_msmContext> op_msm() {
			return getRuleContexts(Op_msmContext.class);
		}
		public OpShifft1Context(Op_shiftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpShifft1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpShifft1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpShifft1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_shiftContext op_shift() throws RecognitionException {
		Op_shiftContext _localctx = new Op_shiftContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_shift);
		int _la;
		try {
			_localctx = new OpShifft1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(430); op_msm();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLL || _la==SRL) {
				{
				{
				setState(431); operador_shifft();
				setState(432); op_msm();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_shift	:op_msm ((SLL|SRL)op_msm)*");
			 stack2.push("op_shift	:op_msm ((SLL|SRL)op_msm)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_shifftContext extends ParserRuleContext {
		public Operador_shifftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_shifft; }
	 
		public Operador_shifftContext() { }
		public void copyFrom(Operador_shifftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorShifftContext extends Operador_shifftContext {
		public TerminalNode SLL() { return getToken(DecafParse.SLL, 0); }
		public TerminalNode SRL() { return getToken(DecafParse.SRL, 0); }
		public OperadorShifftContext(Operador_shifftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperadorShifft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperadorShifft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperadorShifft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_shifftContext operador_shifft() throws RecognitionException {
		Operador_shifftContext _localctx = new Operador_shifftContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operador_shifft);
		int _la;
		try {
			_localctx = new OperadorShifftContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !(_la==SLL || _la==SRL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 stack1.push("operador_shifft: (SLL|SRL)");
			 stack2.push("operador_shifft: (SLL|SRL)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_msmContext extends ParserRuleContext {
		public Op_msmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_msm; }
	 
		public Op_msmContext() { }
		public void copyFrom(Op_msmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpMsmContext extends Op_msmContext {
		public List<Operador_sumaContext> operador_suma() {
			return getRuleContexts(Operador_sumaContext.class);
		}
		public List<Op_muldivContext> op_muldiv() {
			return getRuleContexts(Op_muldivContext.class);
		}
		public Operador_sumaContext operador_suma(int i) {
			return getRuleContext(Operador_sumaContext.class,i);
		}
		public Op_muldivContext op_muldiv(int i) {
			return getRuleContext(Op_muldivContext.class,i);
		}
		public OpMsmContext(Op_msmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpMsm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpMsm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpMsm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_msmContext op_msm() throws RecognitionException {
		Op_msmContext _localctx = new Op_msmContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_msm);
		int _la;
		try {
			_localctx = new OpMsmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(446); op_muldiv();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(447); operador_suma();
				setState(448); op_muldiv();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*");
			 stack2.push("op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_sumaContext extends ParserRuleContext {
		public Operador_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_suma; }
	 
		public Operador_sumaContext() { }
		public void copyFrom(Operador_sumaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperadorSumaContext extends Operador_sumaContext {
		public TerminalNode PLUS() { return getToken(DecafParse.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DecafParse.MINUS, 0); }
		public OperadorSumaContext(Operador_sumaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperadorSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperadorSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperadorSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_sumaContext operador_suma() throws RecognitionException {
		Operador_sumaContext _localctx = new Operador_sumaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operador_suma);
		int _la;
		try {
			_localctx = new OperadorSumaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 stack1.push("operador_suma: (MINUS|PLUS)");
			 stack2.push("operador_suma: (MINUS|PLUS)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_muldivContext extends ParserRuleContext {
		public Op_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_muldiv; }
	 
		public Op_muldivContext() { }
		public void copyFrom(Op_muldivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpMuldDivContext extends Op_muldivContext {
		public List<Operador_divisionContext> operador_division() {
			return getRuleContexts(Operador_divisionContext.class);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public Operador_divisionContext operador_division(int i) {
			return getRuleContext(Operador_divisionContext.class,i);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public OpMuldDivContext(Op_muldivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpMuldDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpMuldDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpMuldDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_muldivContext op_muldiv() throws RecognitionException {
		Op_muldivContext _localctx = new Op_muldivContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_muldiv);
		int _la;
		try {
			_localctx = new OpMuldDivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(462); not();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(463); operador_division();
				setState(464); not();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*");
			 stack2.push("op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_divisionContext extends ParserRuleContext {
		public Operador_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_division; }
	 
		public Operador_divisionContext() { }
		public void copyFrom(Operador_divisionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpDivisionContext extends Operador_divisionContext {
		public TerminalNode DIVISION() { return getToken(DecafParse.DIVISION, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(DecafParse.MULTIPLICATION, 0); }
		public TerminalNode MOD() { return getToken(DecafParse.MOD, 0); }
		public OpDivisionContext(Operador_divisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_divisionContext operador_division() throws RecognitionException {
		Operador_divisionContext _localctx = new Operador_divisionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operador_division);
		int _la;
		try {
			_localctx = new OpDivisionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 stack1.push("operador_division: (MULTIPLICATION|DIVISION|MOD)");
			 stack2.push("operador_division: (MULTIPLICATION|DIVISION|MOD)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	 
		public NotContext() { }
		public void copyFrom(NotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpNotContext extends NotContext {
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DecafParse.NOT, 0); }
		public OpNotContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_not);
		int _la;
		try {
			_localctx = new OpNotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(478); match(NOT);
				}
			}

			setState(481); minus();
			 stack1.push("not		: (NOT)? minus");
			 stack2.push("not		: (NOT)? minus");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusContext extends ParserRuleContext {
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
	 
		public MinusContext() { }
		public void copyFrom(MinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpMinusContext extends MinusContext {
		public TerminalNode MINUS() { return getToken(DecafParse.MINUS, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public OpMinusContext(MinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOpMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOpMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minus);
		int _la;
		try {
			_localctx = new OpMinusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(485); match(MINUS);
				}
			}

			setState(488); expr2();
			 stack1.push("minus		: (MINUS)? expr2");
			 stack2.push("minus		: (MINUS)? expr2");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpreParenContext extends Expr2Context {
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public ExpreParenContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpreParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpreParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpreParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpr2Context extends Expr2Context {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpr2Context(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteralExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteralExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteralExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocationOpContext extends Expr2Context {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationOpContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLocationOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLocationOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLocationOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends Expr2Context {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr2);
		try {
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new LocationOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(492); location();
				 stack1.push("expr2	: location");
				 stack2.push("expr2	: location");
				}
				break;

			case 2:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(496); method_call();
				 stack1.push("expr2	: method_call");
				 stack2.push("expr2	: method_call");
				}
				break;

			case 3:
				_localctx = new LiteralExpr2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(500); literal();
				 stack1.push("expr2	: literal");
				 stack2.push("expr2	: literal");
				}
				break;

			case 4:
				_localctx = new ExpreParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(504); match(OPENPAREN);
				setState(505); expr();
				setState(506); match(CLOSEDPAREN);
				 stack1.push("expr2	: OPENPAREN expr CLOSEDPAREN");
				 stack2.push("expr2	: OPENPAREN expr CLOSEDPAREN");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralCharContext extends LiteralContext {
		public TerminalNode SINGLECHAR() { return getToken(DecafParse.SINGLECHAR, 0); }
		public LiteralCharContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteralChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteralChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteralChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBooleanContext extends LiteralContext {
		public TerminalNode BOOLEAN() { return getToken(DecafParse.BOOLEAN, 0); }
		public LiteralBooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteralBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteralBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntContext extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public LiteralIntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteralInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		try {
			setState(522);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEXADECIMAL:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(512); int_literal();
				 stack1.push("literal		: int_literal");
				 stack2.push("literal		: int_literal");
				}
				break;
			case SINGLECHAR:
				_localctx = new LiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516); match(SINGLECHAR);
				 stack1.push("literal		: SINGLECHAR");
				 stack2.push("literal		: SINGLECHAR");
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(519); match(BOOLEAN);
				 stack1.push("literal		: BOOLEAN");
				 stack2.push("literal		: BOOLEAN");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	 
		public String_literalContext() { }
		public void copyFrom(String_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralStringContext extends String_literalContext {
		public TerminalNode STRING() { return getToken(DecafParse.STRING, 0); }
		public LiteralStringContext(String_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string_literal);
		try {
			_localctx = new LiteralStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(524); match(STRING);
			 stack1.push("string_literal	: STRING");
			 stack2.push("string_literal	: STRING");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Location1Context extends LocationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Location1Context(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLocation1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLocation1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLocation1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_location);
		int _la;
		try {
			_localctx = new Location1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(528); id();
			setState(533);
			_la = _input.LA(1);
			if (_la==OPENTHING) {
				{
				setState(529); match(OPENTHING);
				setState(530); expr();
				setState(531); match(CLOSEDTHING);
				}
			}

			}
			 stack1.push("location	: id (OPENTHING expr CLOSEDTHING)?)");
			 stack2.push("location	: (id (OPENTHING expr CLOSEDTHING)?)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	 
		public IdContext() { }
		public void copyFrom(IdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends IdContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParse.IDENTIFIER, 0); }
		public IdentifierContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id);
		try {
			_localctx = new IdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(538); match(IDENTIFIER);
			 stack1.push("id		: IDENTIFIER");
			 stack2.push("id		: IDENTIFIER");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	 
		public Int_literalContext() { }
		public void copyFrom(Int_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLiteralHexContext extends Int_literalContext {
		public TerminalNode HEXADECIMAL() { return getToken(DecafParse.HEXADECIMAL, 0); }
		public IntLiteralHexContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterIntLiteralHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitIntLiteralHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitIntLiteralHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralNumberContext extends Int_literalContext {
		public TerminalNode NUMBER() { return getToken(DecafParse.NUMBER, 0); }
		public IntLiteralNumberContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterIntLiteralNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitIntLiteralNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitIntLiteralNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_int_literal);
		try {
			setState(548);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new IntLiteralNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542); match(NUMBER);
				 stack1.push("int_literal	: NUMBER");
				 stack2.push("int_literal	: NUMBER");
				}
				break;
			case HEXADECIMAL:
				_localctx = new IntLiteralHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545); match(HEXADECIMAL);
				 stack1.push("int_literal	: HEXADECIMAL");
				 stack2.push("int_literal	: HEXADECIMAL");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3;\u0229\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\7\2M\n\2\f"+
		"\2\16\2P\13\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\7\2_\n\2\f\2\16\2b\13\2\3\2\7\2e\n\2\f\2\16\2h\13\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\7\2v\n\2\f\2\16\2y\13\2\3\2\3\2\5\2"+
		"}\n\2\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0097\n\4\3\5\3\5\3"+
		"\5\3\5\5\5\u009d\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00aa"+
		"\n\6\f\6\16\6\u00ad\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9"+
		"\n\7\3\b\3\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13\b\3\b\7\b\u00c3\n\b\f\b\16"+
		"\b\u00c6\13\b\3\b\3\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\b\7\b\u00d0"+
		"\n\b\f\b\16\b\u00d3\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00dc\n\t\f\t"+
		"\16\t\u00df\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00ef\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0130\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0138\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u013f\n\r\f"+
		"\r\16\r\u0142\13\r\3\r\3\r\3\r\3\r\5\r\u0148\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u0152\n\r\f\r\16\r\u0155\13\r\3\r\3\r\3\r\3\r\5\r\u015b"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0169\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0179\n\20\3\21\3\21\3\21\7\21\u017e\n\21\f\21\16\21\u0181"+
		"\13\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u0189\n\22\f\22\16\22\u018c"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0195\n\23\f\23\16\23\u0198"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01a5"+
		"\n\25\f\25\16\25\u01a8\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u01b5\n\27\f\27\16\27\u01b8\13\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u01c5\n\31\f\31\16\31\u01c8"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u01d5"+
		"\n\33\f\33\16\33\u01d8\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\5"+
		"\35\u01e2\n\35\3\35\3\35\3\35\3\35\3\36\5\36\u01e9\n\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0201\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u020d\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0218\n\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0227\n$\3$\2%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\t\3\'\'\3((\4\f\f\32"+
		"\32\5\27\27\35\35!\"\3,-\3\3\4\4\5\6\25\25\u0239\2|\3\2\2\2\4~\3\2\2\2"+
		"\6\u0096\3\2\2\2\b\u0098\3\2\2\2\n\u00a3\3\2\2\2\f\u00b8\3\2\2\2\16\u00ba"+
		"\3\2\2\2\20\u00ee\3\2\2\2\22\u00f6\3\2\2\2\24\u012f\3\2\2\2\26\u0137\3"+
		"\2\2\2\30\u015a\3\2\2\2\32\u015c\3\2\2\2\34\u0168\3\2\2\2\36\u0178\3\2"+
		"\2\2 \u017a\3\2\2\2\"\u0185\3\2\2\2$\u0190\3\2\2\2&\u019c\3\2\2\2(\u01a0"+
		"\3\2\2\2*\u01ac\3\2\2\2,\u01b0\3\2\2\2.\u01bc\3\2\2\2\60\u01c0\3\2\2\2"+
		"\62\u01cc\3\2\2\2\64\u01d0\3\2\2\2\66\u01dc\3\2\2\28\u01e1\3\2\2\2:\u01e8"+
		"\3\2\2\2<\u0200\3\2\2\2>\u020c\3\2\2\2@\u020e\3\2\2\2B\u0212\3\2\2\2D"+
		"\u021c\3\2\2\2F\u0226\3\2\2\2HI\7\'\2\2IJ\7(\2\2JN\7\20\2\2KM\5\4\3\2"+
		"LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\5\b\5\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\26\2"+
		"\2XY\b\2\1\2Y}\b\2\1\2Z[\n\2\2\2[\\\7(\2\2\\`\7\20\2\2]_\5\4\3\2^]\3\2"+
		"\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\b\5\2dc\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\26\2\2j}\b"+
		"\2\1\2kl\7\'\2\2lm\n\3\2\2mq\7\20\2\2np\5\4\3\2on\3\2\2\2ps\3\2\2\2qo"+
		"\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\b\5\2ut\3\2\2\2vy\3\2\2\2w"+
		"u\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\26\2\2{}\b\2\1\2|H\3\2\2\2"+
		"|Z\3\2\2\2|k\3\2\2\2}\3\3\2\2\2~\177\5\22\n\2\177\u0084\5\6\4\2\u0080"+
		"\u0081\7\24\2\2\u0081\u0083\5\6\4\2\u0082\u0080\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089\b\3\1\2\u0089\u008a\b\3"+
		"\1\2\u008a\5\3\2\2\2\u008b\u008c\5D#\2\u008c\u008d\b\4\1\2\u008d\u008e"+
		"\b\4\1\2\u008e\u0097\3\2\2\2\u008f\u0090\5D#\2\u0090\u0091\7\22\2\2\u0091"+
		"\u0092\5F$\2\u0092\u0093\7\23\2\2\u0093\u0094\b\4\1\2\u0094\u0095\b\4"+
		"\1\2\u0095\u0097\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u008f\3\2\2\2\u0097"+
		"\7\3\2\2\2\u0098\u0099\5\f\7\2\u0099\u009a\5D#\2\u009a\u009c\7\16\2\2"+
		"\u009b\u009d\5\n\6\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\b\5\1\2"+
		"\u00a1\u00a2\b\5\1\2\u00a2\t\3\2\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00ab"+
		"\5D#\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\5D#\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\b\6\1\2\u00af\u00b0\b\6\1\2\u00b0\13\3\2\2\2\u00b1\u00b2\5\22\n"+
		"\2\u00b2\u00b3\b\7\1\2\u00b3\u00b4\b\7\1\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6"+
		"\7\62\2\2\u00b6\u00b7\b\7\1\2\u00b7\u00b9\b\7\1\2\u00b8\u00b1\3\2\2\2"+
		"\u00b8\u00b5\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00be\7\20\2\2\u00bb\u00bd"+
		"\5\20\t\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3"+
		"\5\24\13\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb"+
		"\7\26\2\2\u00c8\u00ca\5\20\t\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\b\b\1\2\u00d5\u00d6\b\b\1\2\u00d6\17\3\2\2\2\u00d7"+
		"\u00d8\5\22\n\2\u00d8\u00dd\5D#\2\u00d9\u00da\7\24\2\2\u00da\u00dc\5D"+
		"#\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\b"+
		"\2\2\u00e1\u00e2\b\t\1\2\u00e2\u00e3\b\t\1\2\u00e3\u00ef\3\2\2\2\u00e4"+
		"\u00e5\5D#\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\7"+
		"\23\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\b\2\2"+
		"\u00eb\u00ec\b\t\1\2\u00ec\u00ed\b\t\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00d7"+
		"\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ef\21\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1"+
		"\u00f2\b\n\1\2\u00f2\u00f7\b\n\1\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\b\n"+
		"\1\2\u00f5\u00f7\b\n\1\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"\23\3\2\2\2\u00f8\u00f9\5B\"\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\5\36\20"+
		"\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\b\13\1\2\u00fd\u00fe\b\13\1\2\u00fe"+
		"\u0130\3\2\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\7\b\2\2\u0101\u0102\b"+
		"\13\1\2\u0102\u0103\b\13\1\2\u0103\u0130\3\2\2\2\u0104\u0105\5\30\r\2"+
		"\u0105\u0106\b\13\1\2\u0106\u0107\b\13\1\2\u0107\u0130\3\2\2\2\u0108\u0109"+
		"\7.\2\2\u0109\u010a\7\16\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\17\2"+
		"\2\u010c\u010d\5\16\b\2\u010d\u010e\7*\2\2\u010e\u010f\5\16\b\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b\13\1\2\u0111\u0112\b\13\1\2\u0112\u0130\3"+
		"\2\2\2\u0113\u0114\7+\2\2\u0114\u0115\5D#\2\u0115\u0116\7\r\2\2\u0116"+
		"\u0117\5\36\20\2\u0117\u0118\7\24\2\2\u0118\u0119\5\36\20\2\u0119\u011a"+
		"\5\16\b\2\u011a\u011b\b\13\1\2\u011b\u011c\b\13\1\2\u011c\u0130\3\2\2"+
		"\2\u011d\u011e\7\61\2\2\u011e\u011f\5\36\20\2\u011f\u0120\7\b\2\2\u0120"+
		"\u0121\b\13\1\2\u0121\u0122\b\13\1\2\u0122\u0130\3\2\2\2\u0123\u0124\7"+
		"%\2\2\u0124\u0125\7\b\2\2\u0125\u0126\b\13\1\2\u0126\u0130\b\13\1\2\u0127"+
		"\u0128\7)\2\2\u0128\u0129\7\b\2\2\u0129\u012a\b\13\1\2\u012a\u0130\b\13"+
		"\1\2\u012b\u012c\5\16\b\2\u012c\u012d\b\13\1\2\u012d\u012e\b\13\1\2\u012e"+
		"\u0130\3\2\2\2\u012f\u00f8\3\2\2\2\u012f\u00ff\3\2\2\2\u012f\u0104\3\2"+
		"\2\2\u012f\u0108\3\2\2\2\u012f\u0113\3\2\2\2\u012f\u011d\3\2\2\2\u012f"+
		"\u0123\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012b\3\2\2\2\u0130\25\3\2\2"+
		"\2\u0131\u0132\7\r\2\2\u0132\u0133\b\f\1\2\u0133\u0138\b\f\1\2\u0134\u0135"+
		"\7\31\2\2\u0135\u0136\b\f\1\2\u0136\u0138\b\f\1\2\u0137\u0131\3\2\2\2"+
		"\u0137\u0134\3\2\2\2\u0138\27\3\2\2\2\u0139\u0147\5\32\16\2\u013a\u013b"+
		"\7\16\2\2\u013b\u0140\5\36\20\2\u013c\u013d\7\24\2\2\u013d\u013f\5\36"+
		"\20\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\17"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0146\7\16\2\2\u0146\u0148\7\17\2\2\u0147"+
		"\u013a\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\r"+
		"\1\2\u014a\u014b\b\r\1\2\u014b\u015b\3\2\2\2\u014c\u014d\7&\2\2\u014d"+
		"\u014e\7\16\2\2\u014e\u0153\5@!\2\u014f\u0150\7\24\2\2\u0150\u0152\5\34"+
		"\17\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\17"+
		"\2\2\u0157\u0158\b\r\1\2\u0158\u0159\b\r\1\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0139\3\2\2\2\u015a\u014c\3\2\2\2\u015b\31\3\2\2\2\u015c\u015d\5D#\2"+
		"\u015d\u015e\b\16\1\2\u015e\u015f\b\16\1\2\u015f\33\3\2\2\2\u0160\u0161"+
		"\5\36\20\2\u0161\u0162\b\17\1\2\u0162\u0163\b\17\1\2\u0163\u0169\3\2\2"+
		"\2\u0164\u0165\5@!\2\u0165\u0166\b\17\1\2\u0166\u0167\b\17\1\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0164\3\2\2\2\u0169\35\3\2\2\2\u016a"+
		"\u016b\5 \21\2\u016b\u016c\b\20\1\2\u016c\u016d\b\20\1\2\u016d\u0179\3"+
		"\2\2\2\u016e\u016f\5D#\2\u016f\u0170\7\16\2\2\u0170\u0171\7\17\2\2\u0171"+
		"\u0172\b\20\1\2\u0172\u0173\b\20\1\2\u0173\u0179\3\2\2\2\u0174\u0175\5"+
		"> \2\u0175\u0176\b\20\1\2\u0176\u0177\b\20\1\2\u0177\u0179\3\2\2\2\u0178"+
		"\u016a\3\2\2\2\u0178\u016e\3\2\2\2\u0178\u0174\3\2\2\2\u0179\37\3\2\2"+
		"\2\u017a\u017f\5\"\22\2\u017b\u017c\7\21\2\2\u017c\u017e\5\"\22\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\b\21\1\2\u0183"+
		"\u0184\b\21\1\2\u0184!\3\2\2\2\u0185\u018a\5$\23\2\u0186\u0187\7\33\2"+
		"\2\u0187\u0189\5$\23\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d"+
		"\u018e\b\22\1\2\u018e\u018f\b\22\1\2\u018f#\3\2\2\2\u0190\u0196\5(\25"+
		"\2\u0191\u0192\5&\24\2\u0192\u0193\5(\25\2\u0193\u0195\3\2\2\2\u0194\u0191"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\b\23\1\2\u019a\u019b\b"+
		"\23\1\2\u019b%\3\2\2\2\u019c\u019d\t\4\2\2\u019d\u019e\b\24\1\2\u019e"+
		"\u019f\b\24\1\2\u019f\'\3\2\2\2\u01a0\u01a6\5,\27\2\u01a1\u01a2\5*\26"+
		"\2\u01a2\u01a3\5,\27\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\b\25\1\2\u01aa\u01ab\b\25\1\2\u01ab)\3\2\2"+
		"\2\u01ac\u01ad\t\5\2\2\u01ad\u01ae\b\26\1\2\u01ae\u01af\b\26\1\2\u01af"+
		"+\3\2\2\2\u01b0\u01b6\5\60\31\2\u01b1\u01b2\5.\30\2\u01b2\u01b3\5\60\31"+
		"\2\u01b3\u01b5\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\b\27\1\2\u01ba\u01bb\b\27\1\2\u01bb-\3\2\2\2\u01bc\u01bd\t\6\2"+
		"\2\u01bd\u01be\b\30\1\2\u01be\u01bf\b\30\1\2\u01bf/\3\2\2\2\u01c0\u01c6"+
		"\5\64\33\2\u01c1\u01c2\5\62\32\2\u01c2\u01c3\5\64\33\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c1\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\b\31"+
		"\1\2\u01ca\u01cb\b\31\1\2\u01cb\61\3\2\2\2\u01cc\u01cd\t\7\2\2\u01cd\u01ce"+
		"\b\32\1\2\u01ce\u01cf\b\32\1\2\u01cf\63\3\2\2\2\u01d0\u01d6\58\35\2\u01d1"+
		"\u01d2\5\66\34\2\u01d2\u01d3\58\35\2\u01d3\u01d5\3\2\2\2\u01d4\u01d1\3"+
		"\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\b\33\1\2\u01da\u01db\b"+
		"\33\1\2\u01db\65\3\2\2\2\u01dc\u01dd\t\b\2\2\u01dd\u01de\b\34\1\2\u01de"+
		"\u01df\b\34\1\2\u01df\67\3\2\2\2\u01e0\u01e2\7\34\2\2\u01e1\u01e0\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\5:\36\2\u01e4"+
		"\u01e5\b\35\1\2\u01e5\u01e6\b\35\1\2\u01e69\3\2\2\2\u01e7\u01e9\7\4\2"+
		"\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb"+
		"\5<\37\2\u01eb\u01ec\b\36\1\2\u01ec\u01ed\b\36\1\2\u01ed;\3\2\2\2\u01ee"+
		"\u01ef\5B\"\2\u01ef\u01f0\b\37\1\2\u01f0\u01f1\b\37\1\2\u01f1\u0201\3"+
		"\2\2\2\u01f2\u01f3\5\30\r\2\u01f3\u01f4\b\37\1\2\u01f4\u01f5\b\37\1\2"+
		"\u01f5\u0201\3\2\2\2\u01f6\u01f7\5> \2\u01f7\u01f8\b\37\1\2\u01f8\u01f9"+
		"\b\37\1\2\u01f9\u0201\3\2\2\2\u01fa\u01fb\7\16\2\2\u01fb\u01fc\5\36\20"+
		"\2\u01fc\u01fd\7\17\2\2\u01fd\u01fe\b\37\1\2\u01fe\u01ff\b\37\1\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01ee\3\2\2\2\u0200\u01f2\3\2\2\2\u0200\u01f6\3\2"+
		"\2\2\u0200\u01fa\3\2\2\2\u0201=\3\2\2\2\u0202\u0203\5F$\2\u0203\u0204"+
		"\b \1\2\u0204\u0205\b \1\2\u0205\u020d\3\2\2\2\u0206\u0207\7\66\2\2\u0207"+
		"\u0208\b \1\2\u0208\u020d\b \1\2\u0209\u020a\7#\2\2\u020a\u020b\b \1\2"+
		"\u020b\u020d\b \1\2\u020c\u0202\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0209"+
		"\3\2\2\2\u020d?\3\2\2\2\u020e\u020f\7\67\2\2\u020f\u0210\b!\1\2\u0210"+
		"\u0211\b!\1\2\u0211A\3\2\2\2\u0212\u0217\5D#\2\u0213\u0214\7\22\2\2\u0214"+
		"\u0215\5\36\20\2\u0215\u0216\7\23\2\2\u0216\u0218\3\2\2\2\u0217\u0213"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\b\"\1\2\u021a"+
		"\u021b\b\"\1\2\u021bC\3\2\2\2\u021c\u021d\78\2\2\u021d\u021e\b#\1\2\u021e"+
		"\u021f\b#\1\2\u021fE\3\2\2\2\u0220\u0221\7\7\2\2\u0221\u0222\b$\1\2\u0222"+
		"\u0227\b$\1\2\u0223\u0224\7\13\2\2\u0224\u0225\b$\1\2\u0225\u0227\b$\1"+
		"\2\u0226\u0220\3\2\2\2\u0226\u0223\3\2\2\2\u0227G\3\2\2\2*NT`fqw|\u0084"+
		"\u0096\u009c\u00ab\u00b8\u00be\u00c4\u00cb\u00d1\u00dd\u00ee\u00f6\u012f"+
		"\u0137\u0140\u0147\u0153\u015a\u0168\u0178\u017f\u018a\u0196\u01a6\u01b6"+
		"\u01c6\u01d6\u01e1\u01e8\u0200\u020c\u0217\u0226";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}