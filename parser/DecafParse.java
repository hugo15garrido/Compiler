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
		RULE_metodo2 = 4, RULE_block = 5, RULE_var_decl = 6, RULE_type = 7, RULE_statement = 8, 
		RULE_assign_op = 9, RULE_method_call = 10, RULE_method_name = 11, RULE_callout_arg = 12, 
		RULE_expr = 13, RULE_op_or = 14, RULE_op_and = 15, RULE_eq_op = 16, RULE_op_rel = 17, 
		RULE_op_shift = 18, RULE_op_msm = 19, RULE_op_muldiv = 20, RULE_not = 21, 
		RULE_minus = 22, RULE_expr2 = 23, RULE_literal = 24, RULE_string_literal = 25, 
		RULE_location = 26, RULE_id = 27, RULE_int_literal = 28;
	public static final String[] ruleNames = {
		"program", "field_decl", "field2", "method_decl", "metodo2", "block", 
		"var_decl", "type", "statement", "assign_op", "method_call", "method_name", 
		"callout_arg", "expr", "op_or", "op_and", "eq_op", "op_rel", "op_shift", 
		"op_msm", "op_muldiv", "not", "minus", "expr2", "literal", "string_literal", 
		"location", "id", "int_literal"
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
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(CLASS);
				setState(59); match(PROGRAM);
				setState(60); match(OPENBRACE);
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(61); field_decl();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(67); method_decl();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73); match(CLOSEDBRACE);
				 stack1.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				 stack2.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				}
				break;

			case 2:
				_localctx = new Root1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLASS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(77); match(PROGRAM);
				setState(78); match(OPENBRACE);
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(79); field_decl();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(85); method_decl();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91); match(CLOSEDBRACE);
				Error("Expecting \"CLASS\" ", ((TokenStream) this).LT(-1).getLine() );
				}
				break;

			case 3:
				_localctx = new Root2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93); match(CLASS);
				setState(94);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(95); match(OPENBRACE);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(96); field_decl();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(102); method_decl();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); match(CLOSEDBRACE);
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
			setState(112); type();
			{
			setState(113); field2();
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(114); match(COLON);
				setState(115); field2();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(SEMICOLON);
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Fielddecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125); id();
				 stack1.push("field2: id");
				 stack2.push("field2: id");
				}
				break;

			case 2:
				_localctx = new Fielddecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129); id();
				setState(130); match(OPENTHING);
				setState(131); int_literal();
				setState(132); match(CLOSEDTHING);
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
		public TerminalNode COLON() { return getToken(DecafParse.COLON, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(138); metodo2();
			setState(139); id();
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(140); match(OPENPAREN);
				{
				setState(141); type();
				setState(142); id();
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					{
					setState(143); match(COLON);
					}
					{
					setState(144); type();
					setState(145); id();
					}
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152); match(CLOSEDPAREN);
				}
				}
				break;

			case 2:
				{
				{
				setState(154); match(OPENPAREN);
				setState(155); match(CLOSEDPAREN);
				}
				}
				break;
			}
			setState(158); block();
			 stack1.push("method_decl	:metodo2 id ((OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN)| (OPENPAREN CLOSEDPAREN)) block");
			 stack2.push("method_decl	:metodo2 id ((OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN)| (OPENPAREN CLOSEDPAREN)) block");
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
		enterRule(_localctx, 8, RULE_metodo2);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new MethodDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162); type();
				 stack1.push("metodo2: type;");
				 stack2.push("metodo2: type;");
				}
				break;
			case VOID:
				_localctx = new MethodDeclVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(VOID);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			_localctx = new BlockdefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(OPENBRACE);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(172); var_decl();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(178); statement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(CLOSEDBRACE);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(191); statement();
					}
					} 
				}
				setState(196);
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
		enterRule(_localctx, 12, RULE_var_decl);
		int _la;
		try {
			setState(223);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new VardeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200); type();
				setState(201); id();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(202); match(COLON);
					setState(203); id();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209); match(SEMICOLON);
				 stack1.push("var_decl	: type id (COLON id)* SEMICOLON");
				 stack2.push("var_decl	: type id (COLON id)* SEMICOLON");
				}
				break;
			case IDENTIFIER:
				_localctx = new Vardeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213); id();
				setState(214); match(OPENTHING);
				setState(215); expr();
				setState(216); match(CLOSEDTHING);
				setState(217); match(ASSIGNATION);
				setState(218); expr();
				setState(219); match(SEMICOLON);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(INT);
				 stack1.push("type		: INT");
				 stack2.push("type		: INT");
				}
				break;
			case BOOLEANN:
				_localctx = new BooleannTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228); match(BOOLEANN);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Statement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); location();
				setState(234); assign_op();
				setState(235); expr();
				setState(236); match(SEMICOLON);
				 stack1.push("statement	: location assign_op expr SEMICOLON");
				 stack2.push("statement	: location assign_op expr SEMICOLON");
				}
				break;

			case 2:
				_localctx = new Statement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240); method_call();
				setState(241); match(SEMICOLON);
				 stack1.push("statement	: method_call SEMICOLON ");
				 stack2.push("statement	: method_call SEMICOLON ");
				}
				break;

			case 3:
				_localctx = new CallMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245); method_call();
				 stack1.push("statement	: method_call");
				 stack2.push("statement	: method_call");
				}
				break;

			case 4:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249); match(IF);
				setState(250); match(OPENPAREN);
				setState(251); expr();
				setState(252); match(CLOSEDPAREN);
				setState(253); block();
				{
				setState(254); match(ELSE);
				{
				setState(255); block();
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
				setState(260); match(FOR);
				setState(261); id();
				setState(262); match(ASSIGNATION);
				setState(263); expr();
				setState(264); match(COLON);
				setState(265); expr();
				setState(266); block();
				 stack1.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				 stack2.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				}
				break;

			case 6:
				_localctx = new AsignationColonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270); match(RETURN);
				setState(271); expr();
				setState(272); match(SEMICOLON);
				 stack1.push("statement	: RETURN expr SEMICOLON");
				 stack2.push("statement	: RETURN expr SEMICOLON");
				}
				break;

			case 7:
				_localctx = new BreakSemiContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(276); match(BREAK);
				setState(277); match(SEMICOLON);
				 stack1.push("statement	: BREAK SEMICOLON");
				 stack2.push("statement	: BREAK SEMICOLON");
				}
				break;

			case 8:
				_localctx = new ContinueSemiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(280); match(CONTINUE);
				setState(281); match(SEMICOLON);
				 stack1.push("statement	: CONTINUE SEMICOLON");
				 stack2.push("statement	: CONTINUE SEMICOLON");
				}
				break;

			case 9:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(284); block();
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
		enterRule(_localctx, 18, RULE_assign_op);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case ASSIGNATION:
				_localctx = new AssignOp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(ASSIGNATION);
				 stack1.push("assign_op	: ASSIGNATION");
				 stack2.push("assign_op	: ASSIGNATION");
				}
				break;
			case PLUSEQUAL:
				_localctx = new AssignOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293); match(PLUSEQUAL);
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
		enterRule(_localctx, 20, RULE_method_call);
		int _la;
		try {
			setState(331);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MethodCall1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298); method_name();
				setState(312);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					{
					setState(299); match(OPENPAREN);
					setState(300); expr();
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(301); match(COLON);
						setState(302); expr();
						}
						}
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(308); match(CLOSEDPAREN);
					}
					}
					break;

				case 2:
					{
					{
					setState(310); match(OPENPAREN);
					setState(311); match(CLOSEDPAREN);
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
				setState(317); match(CALLOUT);
				setState(318); match(OPENPAREN);
				setState(319); string_literal();
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(320); match(COLON);
					setState(321); callout_arg();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(327); match(CLOSEDPAREN);
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
		enterRule(_localctx, 22, RULE_method_name);
		try {
			_localctx = new MethodNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(333); id();
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
		enterRule(_localctx, 24, RULE_callout_arg);
		try {
			setState(345);
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
				setState(337); expr();
				 stack1.push("callout_arg	: expr");
				 stack2.push("callout_arg	: expr");
				}
				break;
			case STRING:
				_localctx = new CalloutArg2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341); string_literal();
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Expr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347); op_or();
				 stack1.push("expr		:op_or");
				 stack2.push("expr		:op_or");
				}
				break;

			case 2:
				_localctx = new ExprAst2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351); id();
				setState(352); match(OPENPAREN);
				setState(353); match(CLOSEDPAREN);
				 stack1.push("expr		:id OPENPAREN CLOSEDPAREN");
				 stack2.push("expr		:id OPENPAREN CLOSEDPAREN");
				}
				break;

			case 3:
				_localctx = new Expr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357); literal();
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
		enterRule(_localctx, 28, RULE_op_or);
		int _la;
		try {
			_localctx = new OpOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363); op_and();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(364); match(OR);
				setState(365); op_and();
				}
				}
				setState(370);
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
		enterRule(_localctx, 30, RULE_op_and);
		int _la;
		try {
			_localctx = new OpAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(374); eq_op();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(375); match(AND);
				setState(376); eq_op();
				}
				}
				setState(381);
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
		public List<TerminalNode> EQUALS() { return getTokens(DecafParse.EQUALS); }
		public Op_relContext op_rel(int i) {
			return getRuleContext(Op_relContext.class,i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(DecafParse.EQUALS, i);
		}
		public TerminalNode NOTEQUAL(int i) {
			return getToken(DecafParse.NOTEQUAL, i);
		}
		public List<Op_relContext> op_rel() {
			return getRuleContexts(Op_relContext.class);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(DecafParse.NOTEQUAL); }
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
		enterRule(_localctx, 32, RULE_eq_op);
		int _la;
		try {
			_localctx = new OpEqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(385); op_rel();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOTEQUAL) {
				{
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(387); op_rel();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 stack1.push("eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*");
			 stack2.push("eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*");
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
		public TerminalNode LESSTHAN(int i) {
			return getToken(DecafParse.LESSTHAN, i);
		}
		public List<TerminalNode> GREATERTHANOREQUALTO() { return getTokens(DecafParse.GREATERTHANOREQUALTO); }
		public List<TerminalNode> LESSTHAN() { return getTokens(DecafParse.LESSTHAN); }
		public Op_shiftContext op_shift(int i) {
			return getRuleContext(Op_shiftContext.class,i);
		}
		public List<TerminalNode> LESSTHANOREQUALTO() { return getTokens(DecafParse.LESSTHANOREQUALTO); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(DecafParse.GREATERTHAN, i);
		}
		public TerminalNode LESSTHANOREQUALTO(int i) {
			return getToken(DecafParse.LESSTHANOREQUALTO, i);
		}
		public TerminalNode GREATERTHANOREQUALTO(int i) {
			return getToken(DecafParse.GREATERTHANOREQUALTO, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(DecafParse.GREATERTHAN); }
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
		enterRule(_localctx, 34, RULE_op_rel);
		int _la;
		try {
			_localctx = new OpShifftContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396); op_shift();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) {
				{
				{
				setState(397);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(398); op_shift();
				}
				}
				setState(403);
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
		public List<TerminalNode> SLL() { return getTokens(DecafParse.SLL); }
		public Op_msmContext op_msm(int i) {
			return getRuleContext(Op_msmContext.class,i);
		}
		public List<TerminalNode> SRL() { return getTokens(DecafParse.SRL); }
		public TerminalNode SRL(int i) {
			return getToken(DecafParse.SRL, i);
		}
		public List<Op_msmContext> op_msm() {
			return getRuleContexts(Op_msmContext.class);
		}
		public TerminalNode SLL(int i) {
			return getToken(DecafParse.SLL, i);
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
		enterRule(_localctx, 36, RULE_op_shift);
		int _la;
		try {
			_localctx = new OpShifft1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(407); op_msm();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLL || _la==SRL) {
				{
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==SLL || _la==SRL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(409); op_msm();
				}
				}
				setState(414);
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
		public List<TerminalNode> PLUS() { return getTokens(DecafParse.PLUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DecafParse.MINUS, i);
		}
		public List<Op_muldivContext> op_muldiv() {
			return getRuleContexts(Op_muldivContext.class);
		}
		public List<TerminalNode> MINUS() { return getTokens(DecafParse.MINUS); }
		public Op_muldivContext op_muldiv(int i) {
			return getRuleContext(Op_muldivContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(DecafParse.PLUS, i);
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
		enterRule(_localctx, 38, RULE_op_msm);
		int _la;
		try {
			_localctx = new OpMsmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(418); op_muldiv();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(420); op_muldiv();
				}
				}
				setState(425);
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
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public List<TerminalNode> DIVISION() { return getTokens(DecafParse.DIVISION); }
		public List<TerminalNode> MULTIPLICATION() { return getTokens(DecafParse.MULTIPLICATION); }
		public TerminalNode MOD(int i) {
			return getToken(DecafParse.MOD, i);
		}
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(DecafParse.MULTIPLICATION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DecafParse.MOD); }
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public TerminalNode DIVISION(int i) {
			return getToken(DecafParse.DIVISION, i);
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
		enterRule(_localctx, 40, RULE_op_muldiv);
		int _la;
		try {
			_localctx = new OpMuldDivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429); not();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(430);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(431); not();
				}
				}
				setState(436);
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
		enterRule(_localctx, 42, RULE_not);
		int _la;
		try {
			_localctx = new OpNotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(440); match(NOT);
				}
			}

			setState(443); minus();
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
		enterRule(_localctx, 44, RULE_minus);
		int _la;
		try {
			_localctx = new OpMinusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(447); match(MINUS);
				}
			}

			setState(450); expr2();
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
		enterRule(_localctx, 46, RULE_expr2);
		try {
			setState(472);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new LocationOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454); location();
				 stack1.push("expr2	: location");
				 stack2.push("expr2	: location");
				}
				break;

			case 2:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458); method_call();
				 stack1.push("expr2	: method_call");
				 stack2.push("expr2	: method_call");
				}
				break;

			case 3:
				_localctx = new LiteralExpr2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(462); literal();
				 stack1.push("expr2	: literal");
				 stack2.push("expr2	: literal");
				}
				break;

			case 4:
				_localctx = new ExpreParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466); match(OPENPAREN);
				setState(467); expr();
				setState(468); match(CLOSEDPAREN);
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
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(484);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEXADECIMAL:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474); int_literal();
				 stack1.push("literal		: int_literal");
				 stack2.push("literal		: int_literal");
				}
				break;
			case SINGLECHAR:
				_localctx = new LiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(478); match(SINGLECHAR);
				 stack1.push("literal		: SINGLECHAR");
				 stack2.push("literal		: SINGLECHAR");
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(481); match(BOOLEAN);
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
		enterRule(_localctx, 50, RULE_string_literal);
		try {
			_localctx = new LiteralStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(STRING);
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
	public static class LocationIdContext extends LocationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LocationIdContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLocationId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLocationId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLocationId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Location1Context extends LocationContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TerminalNode> OPENTHING() { return getTokens(DecafParse.OPENTHING); }
		public List<TerminalNode> CLOSEDTHING() { return getTokens(DecafParse.CLOSEDTHING); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPENTHING(int i) {
			return getToken(DecafParse.OPENTHING, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode CLOSEDTHING(int i) {
			return getToken(DecafParse.CLOSEDTHING, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		enterRule(_localctx, 52, RULE_location);
		int _la;
		try {
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new Location1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(490); id();
				setState(495);
				_la = _input.LA(1);
				if (_la==OPENTHING) {
					{
					setState(491); match(OPENTHING);
					setState(492); expr();
					setState(493); match(CLOSEDTHING);
					}
				}

				setState(497); id();
				setState(502);
				_la = _input.LA(1);
				if (_la==OPENTHING) {
					{
					setState(498); match(OPENTHING);
					setState(499); expr();
					setState(500); match(CLOSEDTHING);
					}
				}

				}
				 stack1.push("location	: (id (OPENTHING expr CLOSEDTHING)?  id (OPENTHING expr CLOSEDTHING)?)");
				 stack2.push("location	: (id (OPENTHING expr CLOSEDTHING)?  id (OPENTHING expr CLOSEDTHING)?)");
				}
				break;

			case 2:
				_localctx = new LocationIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507); id();
				 stack1.push("location	: id");
				 stack2.push("location	: id");
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
		enterRule(_localctx, 54, RULE_id);
		try {
			_localctx = new IdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(IDENTIFIER);
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
		enterRule(_localctx, 56, RULE_int_literal);
		try {
			setState(523);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new IntLiteralNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(517); match(NUMBER);
				 stack1.push("int_literal	: NUMBER");
				 stack2.push("int_literal	: NUMBER");
				}
				break;
			case HEXADECIMAL:
				_localctx = new IntLiteralHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(520); match(HEXADECIMAL);
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
		"\2\3;\u0210\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\3\2\3\2\3\2\7\2A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\7\2Y\n\2\f\2\16"+
		"\2\\\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\7\2j\n\2"+
		"\f\2\16\2m\13\2\3\2\3\2\5\2q\n\2\3\3\3\3\3\3\3\3\7\3w\n\3\f\3\16\3z\13"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008b"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0096\n\5\f\5\16\5\u0099"+
		"\13\5\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00ac\n\6\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7"+
		"\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\7\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0"+
		"\13\7\3\7\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\b\u00cf\n\b\f\b\16\b\u00d2\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ea"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0123\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012b"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u0132\n\f\f\f\16\f\u0135\13\f\3\f\3\f\3"+
		"\f\3\f\5\f\u013b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0145\n\f\f\f"+
		"\16\f\u0148\13\f\3\f\3\f\3\f\3\f\5\f\u014e\n\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u015c\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u016c\n\17\3\20"+
		"\3\20\3\20\7\20\u0171\n\20\f\20\16\20\u0174\13\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u017c\n\21\f\21\16\21\u017f\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u0187\n\22\f\22\16\22\u018a\13\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u0192\n\23\f\23\16\23\u0195\13\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u019d\n\24\f\24\16\24\u01a0\13\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u01a8\n\25\f\25\16\25\u01ab\13\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u01b3\n\26\f\26\16\26\u01b6\13\26\3\26\3\26\3\26\3\27"+
		"\5\27\u01bc\n\27\3\27\3\27\3\27\3\27\3\30\5\30\u01c3\n\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u01db\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01e7\n\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01f2\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u01f9\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0202\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u020e\n\36\3\36\2\37\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\t\3\'\'\3((\4"+
		"\f\f\32\32\5\27\27\35\35!\"\3,-\3\3\4\4\5\6\25\25\u0228\2p\3\2\2\2\4r"+
		"\3\2\2\2\6\u008a\3\2\2\2\b\u008c\3\2\2\2\n\u00ab\3\2\2\2\f\u00ad\3\2\2"+
		"\2\16\u00e1\3\2\2\2\20\u00e9\3\2\2\2\22\u0122\3\2\2\2\24\u012a\3\2\2\2"+
		"\26\u014d\3\2\2\2\30\u014f\3\2\2\2\32\u015b\3\2\2\2\34\u016b\3\2\2\2\36"+
		"\u016d\3\2\2\2 \u0178\3\2\2\2\"\u0183\3\2\2\2$\u018e\3\2\2\2&\u0199\3"+
		"\2\2\2(\u01a4\3\2\2\2*\u01af\3\2\2\2,\u01bb\3\2\2\2.\u01c2\3\2\2\2\60"+
		"\u01da\3\2\2\2\62\u01e6\3\2\2\2\64\u01e8\3\2\2\2\66\u0201\3\2\2\28\u0203"+
		"\3\2\2\2:\u020d\3\2\2\2<=\7\'\2\2=>\7(\2\2>B\7\20\2\2?A\5\4\3\2@?\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\b\5\2FE\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\26\2\2LM\b"+
		"\2\1\2Mq\b\2\1\2NO\n\2\2\2OP\7(\2\2PT\7\20\2\2QS\5\4\3\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\b\5\2XW\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\26\2\2^q\b\2\1\2"+
		"_`\7\'\2\2`a\n\3\2\2ae\7\20\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\26\2\2oq\b\2\1\2p<\3\2\2\2pN\3\2"+
		"\2\2p_\3\2\2\2q\3\3\2\2\2rs\5\20\t\2sx\5\6\4\2tu\7\24\2\2uw\5\6\4\2vt"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\b\2\2|"+
		"}\b\3\1\2}~\b\3\1\2~\5\3\2\2\2\177\u0080\58\35\2\u0080\u0081\b\4\1\2\u0081"+
		"\u0082\b\4\1\2\u0082\u008b\3\2\2\2\u0083\u0084\58\35\2\u0084\u0085\7\22"+
		"\2\2\u0085\u0086\5:\36\2\u0086\u0087\7\23\2\2\u0087\u0088\b\4\1\2\u0088"+
		"\u0089\b\4\1\2\u0089\u008b\3\2\2\2\u008a\177\3\2\2\2\u008a\u0083\3\2\2"+
		"\2\u008b\7\3\2\2\2\u008c\u008d\5\n\6\2\u008d\u009e\58\35\2\u008e\u008f"+
		"\7\16\2\2\u008f\u0097\5\20\t\2\u0090\u00b8\58\35\2\u0091\u0092\7\24\2"+
		"\2\u0092\u0093\5\20\t\2\u0093\u0094\58\35\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\17\2\2\u009b"+
		"\u009f\3\2\2\2\u009c\u009d\7\16\2\2\u009d\u009f\7\17\2\2\u009e\u008e\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\f\7\2\u00a1"+
		"\u00a2\b\5\1\2\u00a2\u00a3\b\5\1\2\u00a3\t\3\2\2\2\u00a4\u00a5\5\20\t"+
		"\2\u00a5\u00a6\b\6\1\2\u00a6\u00a7\b\6\1\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9"+
		"\7\62\2\2\u00a9\u00aa\b\6\1\2\u00aa\u00ac\b\6\1\2\u00ab\u00a4\3\2\2\2"+
		"\u00ab\u00a8\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00b1\7\20\2\2\u00ae\u00b0"+
		"\5\16\b\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6"+
		"\5\22\n\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00be"+
		"\7\26\2\2\u00bb\u00bd\5\16\b\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c3\5\22\n\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c8\b\7\1\2\u00c8\u00c9\b\7\1\2\u00c9\r\3\2\2\2\u00ca"+
		"\u00cb\5\20\t\2\u00cb\u00d0\58\35\2\u00cc\u00cd\7\24\2\2\u00cd\u00cf\5"+
		"8\35\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\b"+
		"\2\2\u00d4\u00d5\b\b\1\2\u00d5\u00d6\b\b\1\2\u00d6\u00e2\3\2\2\2\u00d7"+
		"\u00d8\58\35\2\u00d8\u00d9\7\22\2\2\u00d9\u00da\5\34\17\2\u00da\u00db"+
		"\7\23\2\2\u00db\u00dc\7\r\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\b\2"+
		"\2\u00de\u00df\b\b\1\2\u00df\u00e0\b\b\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00ca"+
		"\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4"+
		"\u00e5\b\t\1\2\u00e5\u00ea\b\t\1\2\u00e6\u00e7\7$\2\2\u00e7\u00e8\b\t"+
		"\1\2\u00e8\u00ea\b\t\1\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\21\3\2\2\2\u00eb\u00ec\5\66\34\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\5"+
		"\34\17\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\b\n\1\2\u00f0\u00f1\b\n\1\2\u00f1"+
		"\u0123\3\2\2\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\b"+
		"\n\1\2\u00f5\u00f6\b\n\1\2\u00f6\u0123\3\2\2\2\u00f7\u00f8\5\26\f\2\u00f8"+
		"\u00f9\b\n\1\2\u00f9\u00fa\b\n\1\2\u00fa\u0123\3\2\2\2\u00fb\u00fc\7."+
		"\2\2\u00fc\u00fd\7\16\2\2\u00fd\u00fe\5\34\17\2\u00fe\u00ff\7\17\2\2\u00ff"+
		"\u0100\5\f\7\2\u0100\u0101\7*\2\2\u0101\u0102\5\f\7\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0104\b\n\1\2\u0104\u0105\b\n\1\2\u0105\u0123\3\2\2\2\u0106"+
		"\u0107\7+\2\2\u0107\u0108\58\35\2\u0108\u0109\7\r\2\2\u0109\u010a\5\34"+
		"\17\2\u010a\u010b\7\24\2\2\u010b\u010c\5\34\17\2\u010c\u010d\5\f\7\2\u010d"+
		"\u010e\b\n\1\2\u010e\u010f\b\n\1\2\u010f\u0123\3\2\2\2\u0110\u0111\7\61"+
		"\2\2\u0111\u0112\5\34\17\2\u0112\u0113\7\b\2\2\u0113\u0114\b\n\1\2\u0114"+
		"\u0115\b\n\1\2\u0115\u0123\3\2\2\2\u0116\u0117\7%\2\2\u0117\u0118\7\b"+
		"\2\2\u0118\u0119\b\n\1\2\u0119\u0123\b\n\1\2\u011a\u011b\7)\2\2\u011b"+
		"\u011c\7\b\2\2\u011c\u011d\b\n\1\2\u011d\u0123\b\n\1\2\u011e\u011f\5\f"+
		"\7\2\u011f\u0120\b\n\1\2\u0120\u0121\b\n\1\2\u0121\u0123\3\2\2\2\u0122"+
		"\u00eb\3\2\2\2\u0122\u00f2\3\2\2\2\u0122\u00f7\3\2\2\2\u0122\u00fb\3\2"+
		"\2\2\u0122\u0106\3\2\2\2\u0122\u0110\3\2\2\2\u0122\u0116\3\2\2\2\u0122"+
		"\u011a\3\2\2\2\u0122\u011e\3\2\2\2\u0123\23\3\2\2\2\u0124\u0125\7\r\2"+
		"\2\u0125\u0126\b\13\1\2\u0126\u012b\b\13\1\2\u0127\u0128\7\31\2\2\u0128"+
		"\u0129\b\13\1\2\u0129\u012b\b\13\1\2\u012a\u0124\3\2\2\2\u012a\u0127\3"+
		"\2\2\2\u012b\25\3\2\2\2\u012c\u013a\5\30\r\2\u012d\u012e\7\16\2\2\u012e"+
		"\u0133\5\34\17\2\u012f\u0130\7\24\2\2\u0130\u0132\5\34\17\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\17\2\2\u0137\u013b\3"+
		"\2\2\2\u0138\u0139\7\16\2\2\u0139\u013b\7\17\2\2\u013a\u012d\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\f\1\2\u013d\u013e\b\f"+
		"\1\2\u013e\u014e\3\2\2\2\u013f\u0140\7&\2\2\u0140\u0141\7\16\2\2\u0141"+
		"\u0146\5\64\33\2\u0142\u0143\7\24\2\2\u0143\u0145\5\32\16\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\17\2\2\u014a\u014b\b"+
		"\f\1\2\u014b\u014c\b\f\1\2\u014c\u014e\3\2\2\2\u014d\u012c\3\2\2\2\u014d"+
		"\u013f\3\2\2\2\u014e\27\3\2\2\2\u014f\u0150\58\35\2\u0150\u0151\b\r\1"+
		"\2\u0151\u0152\b\r\1\2\u0152\31\3\2\2\2\u0153\u0154\5\34\17\2\u0154\u0155"+
		"\b\16\1\2\u0155\u0156\b\16\1\2\u0156\u015c\3\2\2\2\u0157\u0158\5\64\33"+
		"\2\u0158\u0159\b\16\1\2\u0159\u015a\b\16\1\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0153\3\2\2\2\u015b\u0157\3\2\2\2\u015c\33\3\2\2\2\u015d\u015e\5\36\20"+
		"\2\u015e\u015f\b\17\1\2\u015f\u0160\b\17\1\2\u0160\u016c\3\2\2\2\u0161"+
		"\u0162\58\35\2\u0162\u0163\7\16\2\2\u0163\u0164\7\17\2\2\u0164\u0165\b"+
		"\17\1\2\u0165\u0166\b\17\1\2\u0166\u016c\3\2\2\2\u0167\u0168\5\62\32\2"+
		"\u0168\u0169\b\17\1\2\u0169\u016a\b\17\1\2\u016a\u016c\3\2\2\2\u016b\u015d"+
		"\3\2\2\2\u016b\u0161\3\2\2\2\u016b\u0167\3\2\2\2\u016c\35\3\2\2\2\u016d"+
		"\u0172\5 \21\2\u016e\u016f\7\21\2\2\u016f\u0171\5 \21\2\u0170\u016e\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\b\20\1\2\u0176\u0177\b"+
		"\20\1\2\u0177\37\3\2\2\2\u0178\u017d\5\"\22\2\u0179\u017a\7\33\2\2\u017a"+
		"\u017c\5\"\22\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\b\21\1\2\u0181\u0182\b\21\1\2\u0182!\3\2\2\2\u0183\u0188\5$\23"+
		"\2\u0184\u0185\t\4\2\2\u0185\u0187\5$\23\2\u0186\u0184\3\2\2\2\u0187\u018a"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018c\b\22\1\2\u018c\u018d\b\22\1\2\u018d#\3\2\2"+
		"\2\u018e\u0193\5&\24\2\u018f\u0190\t\5\2\2\u0190\u0192\5&\24\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b\23\1\2\u0197\u0198\b"+
		"\23\1\2\u0198%\3\2\2\2\u0199\u019e\5(\25\2\u019a\u019b\t\6\2\2\u019b\u019d"+
		"\5(\25\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\b\24"+
		"\1\2\u01a2\u01a3\b\24\1\2\u01a3\'\3\2\2\2\u01a4\u01a9\5*\26\2\u01a5\u01a6"+
		"\t\7\2\2\u01a6\u01a8\5*\26\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ac\u01ad\b\25\1\2\u01ad\u01ae\b\25\1\2\u01ae)\3\2\2\2\u01af\u01b4"+
		"\5,\27\2\u01b0\u01b1\t\b\2\2\u01b1\u01b3\5,\27\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\b\26\1\2\u01b8\u01b9\b\26\1\2\u01b9"+
		"+\3\2\2\2\u01ba\u01bc\7\34\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01bd\3\2\2\2\u01bd\u01be\5.\30\2\u01be\u01bf\b\27\1\2\u01bf\u01c0"+
		"\b\27\1\2\u01c0-\3\2\2\2\u01c1\u01c3\7\4\2\2\u01c2\u01c1\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\60\31\2\u01c5\u01c6\b"+
		"\30\1\2\u01c6\u01c7\b\30\1\2\u01c7/\3\2\2\2\u01c8\u01c9\5\66\34\2\u01c9"+
		"\u01ca\b\31\1\2\u01ca\u01cb\b\31\1\2\u01cb\u01db\3\2\2\2\u01cc\u01cd\5"+
		"\26\f\2\u01cd\u01ce\b\31\1\2\u01ce\u01cf\b\31\1\2\u01cf\u01db\3\2\2\2"+
		"\u01d0\u01d1\5\62\32\2\u01d1\u01d2\b\31\1\2\u01d2\u01d3\b\31\1\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d5\7\16\2\2\u01d5\u01d6\5\34\17\2\u01d6\u01d7"+
		"\7\17\2\2\u01d7\u01d8\b\31\1\2\u01d8\u01d9\b\31\1\2\u01d9\u01db\3\2\2"+
		"\2\u01da\u01c8\3\2\2\2\u01da\u01cc\3\2\2\2\u01da\u01d0\3\2\2\2\u01da\u01d4"+
		"\3\2\2\2\u01db\61\3\2\2\2\u01dc\u01dd\5:\36\2\u01dd\u01de\b\32\1\2\u01de"+
		"\u01df\b\32\1\2\u01df\u01e7\3\2\2\2\u01e0\u01e1\7\66\2\2\u01e1\u01e2\b"+
		"\32\1\2\u01e2\u01e7\b\32\1\2\u01e3\u01e4\7#\2\2\u01e4\u01e5\b\32\1\2\u01e5"+
		"\u01e7\b\32\1\2\u01e6\u01dc\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e3\3"+
		"\2\2\2\u01e7\63\3\2\2\2\u01e8\u01e9\7\67\2\2\u01e9\u01ea\b\33\1\2\u01ea"+
		"\u01eb\b\33\1\2\u01eb\65\3\2\2\2\u01ec\u01f1\58\35\2\u01ed\u01ee\7\22"+
		"\2\2\u01ee\u01ef\5\34\17\2\u01ef\u01f0\7\23\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f8\58"+
		"\35\2\u01f4\u01f5\7\22\2\2\u01f5\u01f6\5\34\17\2\u01f6\u01f7\7\23\2\2"+
		"\u01f7\u01f9\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\b\34\1\2\u01fb\u01fc\b\34\1\2\u01fc\u0202\3\2\2\2"+
		"\u01fd\u01fe\58\35\2\u01fe\u01ff\b\34\1\2\u01ff\u0200\b\34\1\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01ec\3\2\2\2\u0201\u01fd\3\2\2\2\u0202\67\3\2\2\2\u0203"+
		"\u0204\78\2\2\u0204\u0205\b\35\1\2\u0205\u0206\b\35\1\2\u02069\3\2\2\2"+
		"\u0207\u0208\7\7\2\2\u0208\u0209\b\36\1\2\u0209\u020e\b\36\1\2\u020a\u020b"+
		"\7\13\2\2\u020b\u020c\b\36\1\2\u020c\u020e\b\36\1\2\u020d\u0207\3\2\2"+
		"\2\u020d\u020a\3\2\2\2\u020e;\3\2\2\2,BHTZekpx\u008a\u0097\u009e\u00ab"+
		"\u00b1\u00b7\u00be\u00c4\u00d0\u00e1\u00e9\u0122\u012a\u0133\u013a\u0146"+
		"\u014d\u015b\u016b\u0172\u017d\u0188\u0193\u019e\u01a9\u01b4\u01bb\u01c2"+
		"\u01da\u01e6\u01f1\u01f8\u0201\u020d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}