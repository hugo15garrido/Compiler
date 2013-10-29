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
		RULE_op_and = 16, RULE_eq_op = 17, RULE_op_rel = 18, RULE_op_shift = 19, 
		RULE_op_msm = 20, RULE_op_muldiv = 21, RULE_not = 22, RULE_minus = 23, 
		RULE_expr2 = 24, RULE_literal = 25, RULE_string_literal = 26, RULE_location = 27, 
		RULE_id = 28, RULE_int_literal = 29;
	public static final String[] ruleNames = {
		"program", "field_decl", "field2", "method_decl", "method_param", "metodo2", 
		"block", "var_decl", "type", "statement", "assign_op", "method_call", 
		"method_name", "callout_arg", "expr", "op_or", "op_and", "eq_op", "op_rel", 
		"op_shift", "op_msm", "op_muldiv", "not", "minus", "expr2", "literal", 
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(CLASS);
				setState(61); match(PROGRAM);
				setState(62); match(OPENBRACE);
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(63); field_decl();
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(69); method_decl();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75); match(CLOSEDBRACE);
				 stack1.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				 stack2.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				}
				break;

			case 2:
				_localctx = new Root1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLASS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(79); match(PROGRAM);
				setState(80); match(OPENBRACE);
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(81); field_decl();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(87); method_decl();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93); match(CLOSEDBRACE);
				Error("Expecting \"CLASS\" ", ((TokenStream) this).LT(-1).getLine() );
				}
				break;

			case 3:
				_localctx = new Root2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95); match(CLASS);
				setState(96);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(97); match(OPENBRACE);
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(98); field_decl();
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(104); method_decl();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110); match(CLOSEDBRACE);
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
			setState(114); type();
			{
			setState(115); field2();
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(116); match(COLON);
				setState(117); field2();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(SEMICOLON);
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
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Fielddecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); id();
				 stack1.push("field2: id");
				 stack2.push("field2: id");
				}
				break;

			case 2:
				_localctx = new Fielddecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131); id();
				setState(132); match(OPENTHING);
				setState(133); int_literal();
				setState(134); match(CLOSEDTHING);
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
			setState(140); metodo2();
			setState(141); id();
			setState(142); match(OPENPAREN);
			setState(144);
			_la = _input.LA(1);
			if (_la==BOOLEANN || _la==INT) {
				{
				setState(143); method_param();
				}
			}

			setState(146); match(CLOSEDPAREN);
			setState(147); block();
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
			setState(151); type();
			setState(152); id();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(153); match(COLON);
				setState(154); type();
				setState(155); id();
				}
				}
				setState(161);
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
			setState(172);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new MethodDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165); type();
				 stack1.push("metodo2: type;");
				 stack2.push("metodo2: type;");
				}
				break;
			case VOID:
				_localctx = new MethodDeclVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(VOID);
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
			setState(174); match(OPENBRACE);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(175); var_decl();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(181); statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); match(CLOSEDBRACE);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(188); var_decl();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(194); statement();
					}
					} 
				}
				setState(199);
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
			setState(226);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				_localctx = new VardeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203); type();
				setState(204); id();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(205); match(COLON);
					setState(206); id();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212); match(SEMICOLON);
				 stack1.push("var_decl	: type id (COLON id)* SEMICOLON");
				 stack2.push("var_decl	: type id (COLON id)* SEMICOLON");
				}
				break;
			case IDENTIFIER:
				_localctx = new Vardeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); id();
				setState(217); match(OPENTHING);
				setState(218); expr();
				setState(219); match(CLOSEDTHING);
				setState(220); match(ASSIGNATION);
				setState(221); expr();
				setState(222); match(SEMICOLON);
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
			setState(234);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(INT);
				 stack1.push("type		: INT");
				 stack2.push("type		: INT");
				}
				break;
			case BOOLEANN:
				_localctx = new BooleannTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(BOOLEANN);
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
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Statement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236); location();
				setState(237); assign_op();
				setState(238); expr();
				setState(239); match(SEMICOLON);
				 stack1.push("statement	: location assign_op expr SEMICOLON");
				 stack2.push("statement	: location assign_op expr SEMICOLON");
				}
				break;

			case 2:
				_localctx = new Statement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243); method_call();
				setState(244); match(SEMICOLON);
				 stack1.push("statement	: method_call SEMICOLON ");
				 stack2.push("statement	: method_call SEMICOLON ");
				}
				break;

			case 3:
				_localctx = new CallMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248); method_call();
				 stack1.push("statement	: method_call");
				 stack2.push("statement	: method_call");
				}
				break;

			case 4:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252); match(IF);
				setState(253); match(OPENPAREN);
				setState(254); expr();
				setState(255); match(CLOSEDPAREN);
				setState(256); block();
				{
				setState(257); match(ELSE);
				{
				setState(258); block();
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
				setState(263); match(FOR);
				setState(264); id();
				setState(265); match(ASSIGNATION);
				setState(266); expr();
				setState(267); match(COLON);
				setState(268); expr();
				setState(269); block();
				 stack1.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				 stack2.push("statement	: FOR id ASSIGNATION expr COLON expr block");
				}
				break;

			case 6:
				_localctx = new AsignationColonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273); match(RETURN);
				setState(274); expr();
				setState(275); match(SEMICOLON);
				 stack1.push("statement	: RETURN expr SEMICOLON");
				 stack2.push("statement	: RETURN expr SEMICOLON");
				}
				break;

			case 7:
				_localctx = new BreakSemiContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(279); match(BREAK);
				setState(280); match(SEMICOLON);
				 stack1.push("statement	: BREAK SEMICOLON");
				 stack2.push("statement	: BREAK SEMICOLON");
				}
				break;

			case 8:
				_localctx = new ContinueSemiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283); match(CONTINUE);
				setState(284); match(SEMICOLON);
				 stack1.push("statement	: CONTINUE SEMICOLON");
				 stack2.push("statement	: CONTINUE SEMICOLON");
				}
				break;

			case 9:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(287); block();
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
			setState(299);
			switch (_input.LA(1)) {
			case ASSIGNATION:
				_localctx = new AssignOp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(ASSIGNATION);
				 stack1.push("assign_op	: ASSIGNATION");
				 stack2.push("assign_op	: ASSIGNATION");
				}
				break;
			case PLUSEQUAL:
				_localctx = new AssignOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(PLUSEQUAL);
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
			setState(334);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MethodCall1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301); method_name();
				setState(315);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					{
					setState(302); match(OPENPAREN);
					setState(303); expr();
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(304); match(COLON);
						setState(305); expr();
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311); match(CLOSEDPAREN);
					}
					}
					break;

				case 2:
					{
					{
					setState(313); match(OPENPAREN);
					setState(314); match(CLOSEDPAREN);
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
				setState(320); match(CALLOUT);
				setState(321); match(OPENPAREN);
				setState(322); string_literal();
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(323); match(COLON);
					setState(324); callout_arg();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(330); match(CLOSEDPAREN);
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
			setState(336); id();
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
			setState(348);
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
				setState(340); expr();
				 stack1.push("callout_arg	: expr");
				 stack2.push("callout_arg	: expr");
				}
				break;
			case STRING:
				_localctx = new CalloutArg2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344); string_literal();
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
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Expr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350); op_or();
				 stack1.push("expr		:op_or");
				 stack2.push("expr		:op_or");
				}
				break;

			case 2:
				_localctx = new ExprAst2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354); id();
				setState(355); match(OPENPAREN);
				setState(356); match(CLOSEDPAREN);
				 stack1.push("expr		:id OPENPAREN CLOSEDPAREN");
				 stack2.push("expr		:id OPENPAREN CLOSEDPAREN");
				}
				break;

			case 3:
				_localctx = new Expr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360); literal();
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
			setState(366); op_and();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(367); match(OR);
				setState(368); op_and();
				}
				}
				setState(373);
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
			setState(377); eq_op();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(378); match(AND);
				setState(379); eq_op();
				}
				}
				setState(384);
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
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			_localctx = new OpEqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388); op_rel();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOTEQUAL) {
				{
				{
				setState(389);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(390); op_rel();
				}
				}
				setState(395);
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
		enterRule(_localctx, 36, RULE_op_rel);
		int _la;
		try {
			_localctx = new OpShifftContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399); op_shift();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) {
				{
				{
				setState(400);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(401); op_shift();
				}
				}
				setState(406);
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
		enterRule(_localctx, 38, RULE_op_shift);
		int _la;
		try {
			_localctx = new OpShifft1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410); op_msm();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLL || _la==SRL) {
				{
				{
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==SLL || _la==SRL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(412); op_msm();
				}
				}
				setState(417);
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
		enterRule(_localctx, 40, RULE_op_msm);
		int _la;
		try {
			_localctx = new OpMsmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(421); op_muldiv();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(422);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(423); op_muldiv();
				}
				}
				setState(428);
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
		enterRule(_localctx, 42, RULE_op_muldiv);
		int _la;
		try {
			_localctx = new OpMuldDivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(432); not();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(433);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(434); not();
				}
				}
				setState(439);
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
		enterRule(_localctx, 44, RULE_not);
		int _la;
		try {
			_localctx = new OpNotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(443); match(NOT);
				}
			}

			setState(446); minus();
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
		enterRule(_localctx, 46, RULE_minus);
		int _la;
		try {
			_localctx = new OpMinusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(450); match(MINUS);
				}
			}

			setState(453); expr2();
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
		enterRule(_localctx, 48, RULE_expr2);
		try {
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new LocationOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457); location();
				 stack1.push("expr2	: location");
				 stack2.push("expr2	: location");
				}
				break;

			case 2:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461); method_call();
				 stack1.push("expr2	: method_call");
				 stack2.push("expr2	: method_call");
				}
				break;

			case 3:
				_localctx = new LiteralExpr2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(465); literal();
				 stack1.push("expr2	: literal");
				 stack2.push("expr2	: literal");
				}
				break;

			case 4:
				_localctx = new ExpreParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(469); match(OPENPAREN);
				setState(470); expr();
				setState(471); match(CLOSEDPAREN);
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
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(487);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEXADECIMAL:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477); int_literal();
				 stack1.push("literal		: int_literal");
				 stack2.push("literal		: int_literal");
				}
				break;
			case SINGLECHAR:
				_localctx = new LiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481); match(SINGLECHAR);
				 stack1.push("literal		: SINGLECHAR");
				 stack2.push("literal		: SINGLECHAR");
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(484); match(BOOLEAN);
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
		enterRule(_localctx, 52, RULE_string_literal);
		try {
			_localctx = new LiteralStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(STRING);
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
		enterRule(_localctx, 54, RULE_location);
		int _la;
		try {
			_localctx = new Location1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(493); id();
			setState(498);
			_la = _input.LA(1);
			if (_la==OPENTHING) {
				{
				setState(494); match(OPENTHING);
				setState(495); expr();
				setState(496); match(CLOSEDTHING);
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
		enterRule(_localctx, 56, RULE_id);
		try {
			_localctx = new IdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(IDENTIFIER);
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
		enterRule(_localctx, 58, RULE_int_literal);
		try {
			setState(513);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new IntLiteralNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507); match(NUMBER);
				 stack1.push("int_literal	: NUMBER");
				 stack2.push("int_literal	: NUMBER");
				}
				break;
			case HEXADECIMAL:
				_localctx = new IntLiteralHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(510); match(HEXADECIMAL);
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
		"\2\3;\u0206\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\3\2\3\2\3\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16"+
		"\2L\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\7\2["+
		"\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i\13\2\3"+
		"\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\5\2s\n\2\3\3\3\3\3\3\3\3\7\3y\n\3\f"+
		"\3\16\3|\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\b\3\b\7\b\u00b3\n\b\f\b\16"+
		"\b\u00b6\13\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\b\3\b\7\b\u00c0"+
		"\n\b\f\b\16\b\u00c3\13\b\3\b\7\b\u00c6\n\b\f\b\16\b\u00c9\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\t\u00d2\n\t\f\t\16\t\u00d5\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e5\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ed\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0126\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u012e\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\7\r\u0135\n\r\f\r\16\r\u0138\13\r\3\r\3\r\3\r\3"+
		"\r\5\r\u013e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0148\n\r\f\r\16"+
		"\r\u014b\13\r\3\r\3\r\3\r\3\r\5\r\u0151\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u015f\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u016f\n\20\3\21"+
		"\3\21\3\21\7\21\u0174\n\21\f\21\16\21\u0177\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u017f\n\22\f\22\16\22\u0182\13\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u018a\n\23\f\23\16\23\u018d\13\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u0195\n\24\f\24\16\24\u0198\13\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u01a0\n\25\f\25\16\25\u01a3\13\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u01ab\n\26\f\26\16\26\u01ae\13\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u01b6\n\27\f\27\16\27\u01b9\13\27\3\27\3\27\3\27\3\30"+
		"\5\30\u01bf\n\30\3\30\3\30\3\30\3\30\3\31\5\31\u01c6\n\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u01de\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01ea\n\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u01f5\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0204\n\37\3\37\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\3\'\'\3((\4\f\f\32\32\5"+
		"\27\27\35\35!\"\3,-\3\3\4\4\5\6\25\25\u021b\2r\3\2\2\2\4t\3\2\2\2\6\u008c"+
		"\3\2\2\2\b\u008e\3\2\2\2\n\u0099\3\2\2\2\f\u00ae\3\2\2\2\16\u00b0\3\2"+
		"\2\2\20\u00e4\3\2\2\2\22\u00ec\3\2\2\2\24\u0125\3\2\2\2\26\u012d\3\2\2"+
		"\2\30\u0150\3\2\2\2\32\u0152\3\2\2\2\34\u015e\3\2\2\2\36\u016e\3\2\2\2"+
		" \u0170\3\2\2\2\"\u017b\3\2\2\2$\u0186\3\2\2\2&\u0191\3\2\2\2(\u019c\3"+
		"\2\2\2*\u01a7\3\2\2\2,\u01b2\3\2\2\2.\u01be\3\2\2\2\60\u01c5\3\2\2\2\62"+
		"\u01dd\3\2\2\2\64\u01e9\3\2\2\2\66\u01eb\3\2\2\28\u01ef\3\2\2\2:\u01f9"+
		"\3\2\2\2<\u0203\3\2\2\2>?\7\'\2\2?@\7(\2\2@D\7\20\2\2AC\5\4\3\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\b\5\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\26\2\2NO\b"+
		"\2\1\2Os\b\2\1\2PQ\n\2\2\2QR\7(\2\2RV\7\20\2\2SU\5\4\3\2TS\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XV\3\2\2\2Y[\5\b\5\2ZY\3\2\2\2[^"+
		"\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\26\2\2`s\b\2\1"+
		"\2ab\7\'\2\2bc\n\3\2\2cg\7\20\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hm\3\2\2\2ig\3\2\2\2jl\5\b\5\2kj\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\26\2\2qs\b\2\1\2r>\3\2\2\2rP\3"+
		"\2\2\2ra\3\2\2\2s\3\3\2\2\2tu\5\22\n\2uz\5\6\4\2vw\7\24\2\2wy\5\6\4\2"+
		"xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\b\2\2"+
		"~\177\b\3\1\2\177\u0080\b\3\1\2\u0080\5\3\2\2\2\u0081\u0082\5:\36\2\u0082"+
		"\u0083\b\4\1\2\u0083\u0084\b\4\1\2\u0084\u008d\3\2\2\2\u0085\u0086\5:"+
		"\36\2\u0086\u0087\7\22\2\2\u0087\u0088\5<\37\2\u0088\u0089\7\23\2\2\u0089"+
		"\u008a\b\4\1\2\u008a\u008b\b\4\1\2\u008b\u008d\3\2\2\2\u008c\u0081\3\2"+
		"\2\2\u008c\u0085\3\2\2\2\u008d\7\3\2\2\2\u008e\u008f\5\f\7\2\u008f\u0090"+
		"\5:\36\2\u0090\u0092\7\16\2\2\u0091\u0093\5\n\6\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0096"+
		"\5\16\b\2\u0096\u0097\b\5\1\2\u0097\u0098\b\5\1\2\u0098\t\3\2\2\2\u0099"+
		"\u009a\5\22\n\2\u009a\u00a1\5:\36\2\u009b\u009c\7\24\2\2\u009c\u009d\5"+
		"\22\n\2\u009d\u009e\5:\36\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\6\1\2\u00a5\u00a6\b\6\1\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\b\7\1\2\u00a9\u00aa\b\7\1"+
		"\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\7\62\2\2\u00ac\u00ad\b\7\1\2\u00ad"+
		"\u00af\b\7\1\2\u00ae\u00a7\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\r\3\2\2\2"+
		"\u00b0\u00b4\7\20\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b9\5\24\13\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c1\7\26\2\2\u00be\u00c0\5\20\t\2\u00bf\u00be\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c7\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\b\1\2\u00cb\u00cc\b\b"+
		"\1\2\u00cc\17\3\2\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00d3\5:\36\2\u00cf\u00d0"+
		"\7\24\2\2\u00d0\u00d2\5:\36\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\b\t\1\2\u00d9"+
		"\u00e5\3\2\2\2\u00da\u00db\5:\36\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\5"+
		"\36\20\2\u00dd\u00de\7\23\2\2\u00de\u00df\7\r\2\2\u00df\u00e0\5\36\20"+
		"\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\b\t\1\2\u00e2\u00e3\b\t\1\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00cd\3\2\2\2\u00e4\u00da\3\2\2\2\u00e5\21\3\2\2\2\u00e6"+
		"\u00e7\7/\2\2\u00e7\u00e8\b\n\1\2\u00e8\u00ed\b\n\1\2\u00e9\u00ea\7$\2"+
		"\2\u00ea\u00eb\b\n\1\2\u00eb\u00ed\b\n\1\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9"+
		"\3\2\2\2\u00ed\23\3\2\2\2\u00ee\u00ef\58\35\2\u00ef\u00f0\5\26\f\2\u00f0"+
		"\u00f1\5\36\20\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\b\13\1\2\u00f3\u00f4"+
		"\b\13\1\2\u00f4\u0126\3\2\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7\b\2\2"+
		"\u00f7\u00f8\b\13\1\2\u00f8\u00f9\b\13\1\2\u00f9\u0126\3\2\2\2\u00fa\u00fb"+
		"\5\30\r\2\u00fb\u00fc\b\13\1\2\u00fc\u00fd\b\13\1\2\u00fd\u0126\3\2\2"+
		"\2\u00fe\u00ff\7.\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\5\36\20\2\u0101"+
		"\u0102\7\17\2\2\u0102\u0103\5\16\b\2\u0103\u0104\7*\2\2\u0104\u0105\5"+
		"\16\b\2\u0105\u0106\3\2\2\2\u0106\u0107\b\13\1\2\u0107\u0108\b\13\1\2"+
		"\u0108\u0126\3\2\2\2\u0109\u010a\7+\2\2\u010a\u010b\5:\36\2\u010b\u010c"+
		"\7\r\2\2\u010c\u010d\5\36\20\2\u010d\u010e\7\24\2\2\u010e\u010f\5\36\20"+
		"\2\u010f\u0110\5\16\b\2\u0110\u0111\b\13\1\2\u0111\u0112\b\13\1\2\u0112"+
		"\u0126\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\5\36\20\2\u0115\u0116"+
		"\7\b\2\2\u0116\u0117\b\13\1\2\u0117\u0118\b\13\1\2\u0118\u0126\3\2\2\2"+
		"\u0119\u011a\7%\2\2\u011a\u011b\7\b\2\2\u011b\u011c\b\13\1\2\u011c\u0126"+
		"\b\13\1\2\u011d\u011e\7)\2\2\u011e\u011f\7\b\2\2\u011f\u0120\b\13\1\2"+
		"\u0120\u0126\b\13\1\2\u0121\u0122\5\16\b\2\u0122\u0123\b\13\1\2\u0123"+
		"\u0124\b\13\1\2\u0124\u0126\3\2\2\2\u0125\u00ee\3\2\2\2\u0125\u00f5\3"+
		"\2\2\2\u0125\u00fa\3\2\2\2\u0125\u00fe\3\2\2\2\u0125\u0109\3\2\2\2\u0125"+
		"\u0113\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0121\3\2"+
		"\2\2\u0126\25\3\2\2\2\u0127\u0128\7\r\2\2\u0128\u0129\b\f\1\2\u0129\u012e"+
		"\b\f\1\2\u012a\u012b\7\31\2\2\u012b\u012c\b\f\1\2\u012c\u012e\b\f\1\2"+
		"\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e\27\3\2\2\2\u012f\u013d"+
		"\5\32\16\2\u0130\u0131\7\16\2\2\u0131\u0136\5\36\20\2\u0132\u0133\7\24"+
		"\2\2\u0133\u0135\5\36\20\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013a\7\17\2\2\u013a\u013e\3\2\2\2\u013b\u013c\7\16\2\2\u013c"+
		"\u013e\7\17\2\2\u013d\u0130\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0140\b\r\1\2\u0140\u0141\b\r\1\2\u0141\u0151\3\2\2\2\u0142"+
		"\u0143\7&\2\2\u0143\u0144\7\16\2\2\u0144\u0149\5\66\34\2\u0145\u0146\7"+
		"\24\2\2\u0146\u0148\5\34\17\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\7\17\2\2\u014d\u014e\b\r\1\2\u014e\u014f\b\r\1\2"+
		"\u014f\u0151\3\2\2\2\u0150\u012f\3\2\2\2\u0150\u0142\3\2\2\2\u0151\31"+
		"\3\2\2\2\u0152\u0153\5:\36\2\u0153\u0154\b\16\1\2\u0154\u0155\b\16\1\2"+
		"\u0155\33\3\2\2\2\u0156\u0157\5\36\20\2\u0157\u0158\b\17\1\2\u0158\u0159"+
		"\b\17\1\2\u0159\u015f\3\2\2\2\u015a\u015b\5\66\34\2\u015b\u015c\b\17\1"+
		"\2\u015c\u015d\b\17\1\2\u015d\u015f\3\2\2\2\u015e\u0156\3\2\2\2\u015e"+
		"\u015a\3\2\2\2\u015f\35\3\2\2\2\u0160\u0161\5 \21\2\u0161\u0162\b\20\1"+
		"\2\u0162\u0163\b\20\1\2\u0163\u016f\3\2\2\2\u0164\u0165\5:\36\2\u0165"+
		"\u0166\7\16\2\2\u0166\u0167\7\17\2\2\u0167\u0168\b\20\1\2\u0168\u0169"+
		"\b\20\1\2\u0169\u016f\3\2\2\2\u016a\u016b\5\64\33\2\u016b\u016c\b\20\1"+
		"\2\u016c\u016d\b\20\1\2\u016d\u016f\3\2\2\2\u016e\u0160\3\2\2\2\u016e"+
		"\u0164\3\2\2\2\u016e\u016a\3\2\2\2\u016f\37\3\2\2\2\u0170\u0175\5\"\22"+
		"\2\u0171\u0172\7\21\2\2\u0172\u0174\5\"\22\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u0179\b\21\1\2\u0179\u017a\b\21\1\2\u017a"+
		"!\3\2\2\2\u017b\u0180\5$\23\2\u017c\u017d\7\33\2\2\u017d\u017f\5$\23\2"+
		"\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b\22\1\2"+
		"\u0184\u0185\b\22\1\2\u0185#\3\2\2\2\u0186\u018b\5&\24\2\u0187\u0188\t"+
		"\4\2\2\u0188\u018a\5&\24\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u018f\b\23\1\2\u018f\u0190\b\23\1\2\u0190%\3\2\2\2\u0191\u0196"+
		"\5(\25\2\u0192\u0193\t\5\2\2\u0193\u0195\5(\25\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u019a\b\24\1\2\u019a\u019b\b\24\1\2\u019b"+
		"\'\3\2\2\2\u019c\u01a1\5*\26\2\u019d\u019e\t\6\2\2\u019e\u01a0\5*\26\2"+
		"\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\b\25\1\2"+
		"\u01a5\u01a6\b\25\1\2\u01a6)\3\2\2\2\u01a7\u01ac\5,\27\2\u01a8\u01a9\t"+
		"\7\2\2\u01a9\u01ab\5,\27\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01af\u01b0\b\26\1\2\u01b0\u01b1\b\26\1\2\u01b1+\3\2\2\2\u01b2\u01b7"+
		"\5.\30\2\u01b3\u01b4\t\b\2\2\u01b4\u01b6\5.\30\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b\27\1\2\u01bb\u01bc\b\27\1\2\u01bc"+
		"-\3\2\2\2\u01bd\u01bf\7\34\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5\60\31\2\u01c1\u01c2\b\30\1\2\u01c2"+
		"\u01c3\b\30\1\2\u01c3/\3\2\2\2\u01c4\u01c6\7\4\2\2\u01c5\u01c4\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5\62\32\2\u01c8\u01c9"+
		"\b\31\1\2\u01c9\u01ca\b\31\1\2\u01ca\61\3\2\2\2\u01cb\u01cc\58\35\2\u01cc"+
		"\u01cd\b\32\1\2\u01cd\u01ce\b\32\1\2\u01ce\u01de\3\2\2\2\u01cf\u01d0\5"+
		"\30\r\2\u01d0\u01d1\b\32\1\2\u01d1\u01d2\b\32\1\2\u01d2\u01de\3\2\2\2"+
		"\u01d3\u01d4\5\64\33\2\u01d4\u01d5\b\32\1\2\u01d5\u01d6\b\32\1\2\u01d6"+
		"\u01de\3\2\2\2\u01d7\u01d8\7\16\2\2\u01d8\u01d9\5\36\20\2\u01d9\u01da"+
		"\7\17\2\2\u01da\u01db\b\32\1\2\u01db\u01dc\b\32\1\2\u01dc\u01de\3\2\2"+
		"\2\u01dd\u01cb\3\2\2\2\u01dd\u01cf\3\2\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d7"+
		"\3\2\2\2\u01de\63\3\2\2\2\u01df\u01e0\5<\37\2\u01e0\u01e1\b\33\1\2\u01e1"+
		"\u01e2\b\33\1\2\u01e2\u01ea\3\2\2\2\u01e3\u01e4\7\66\2\2\u01e4\u01e5\b"+
		"\33\1\2\u01e5\u01ea\b\33\1\2\u01e6\u01e7\7#\2\2\u01e7\u01e8\b\33\1\2\u01e8"+
		"\u01ea\b\33\1\2\u01e9\u01df\3\2\2\2\u01e9\u01e3\3\2\2\2\u01e9\u01e6\3"+
		"\2\2\2\u01ea\65\3\2\2\2\u01eb\u01ec\7\67\2\2\u01ec\u01ed\b\34\1\2\u01ed"+
		"\u01ee\b\34\1\2\u01ee\67\3\2\2\2\u01ef\u01f4\5:\36\2\u01f0\u01f1\7\22"+
		"\2\2\u01f1\u01f2\5\36\20\2\u01f2\u01f3\7\23\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f0\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\b\35"+
		"\1\2\u01f7\u01f8\b\35\1\2\u01f89\3\2\2\2\u01f9\u01fa\78\2\2\u01fa\u01fb"+
		"\b\36\1\2\u01fb\u01fc\b\36\1\2\u01fc;\3\2\2\2\u01fd\u01fe\7\7\2\2\u01fe"+
		"\u01ff\b\37\1\2\u01ff\u0204\b\37\1\2\u0200\u0201\7\13\2\2\u0201\u0202"+
		"\b\37\1\2\u0202\u0204\b\37\1\2\u0203\u01fd\3\2\2\2\u0203\u0200\3\2\2\2"+
		"\u0204=\3\2\2\2*DJV\\gmrz\u008c\u0092\u00a1\u00ae\u00b4\u00ba\u00c1\u00c7"+
		"\u00d3\u00e4\u00ec\u0125\u012d\u0136\u013d\u0149\u0150\u015e\u016e\u0175"+
		"\u0180\u018b\u0196\u01a1\u01ac\u01b7\u01be\u01c5\u01dd\u01e9\u01f4\u0203";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}