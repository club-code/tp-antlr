parser grammar ExcaliburParser;

options { tokenVocab = ExcaliburLexer; }

start
    : expressions EOF
    ;

expressions
    : NL* (expression (NL expression)*)? NL*
    ;

expression
    : INT #intExpr
    | '(' expression ')' #parenExpr
    | left=expression multiplicativeOperator right=expression #multExpr
    | left=expression additiveOperator right=expression #addExpr
    | unaryOperator expression #unaryExpr
    ;

additiveOperator
    : ADD
    | SUB
    ;

multiplicativeOperator
    : MUL
    | DIV
    ;

unaryOperator
    : ADD
    | SUB
    ;


