Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

method_decl	:metodo2 id ((OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN)| (OPENPAREN CLOSEDPAREN)) block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: method_call SEMICOLON 

method_call	: method_name OPENPAREN  expr (COLON expr)* CLOSEDPAREN

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: literal

literal		: int_literal

int_literal	: NUMBER

method_name	: id

id		: IDENTIFIER

id		: IDENTIFIER

metodo2: VOID;

method_decl	:metodo2 id ((OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN)| (OPENPAREN CLOSEDPAREN)) block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: FOR id ASSIGNATION expr COLON expr block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: location assign_op expr SEMICOLON

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: literal

literal		: int_literal

int_literal	: NUMBER

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: location

location	: id

id		: IDENTIFIER

assign_op	: ASSIGNATION

location	: id

id		: IDENTIFIER

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: location

location	: id

id		: IDENTIFIER

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel((EQUALS| NOTEQUAL)op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: literal

literal		: int_literal

int_literal	: NUMBER

id		: IDENTIFIER

id		: IDENTIFIER

type		: INT

id		: IDENTIFIER

metodo2: VOID;
Stage: ast
