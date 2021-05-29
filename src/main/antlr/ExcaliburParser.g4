parser grammar ExcaliburParser;

options { tokenVocab = ExcaliburLexer; }

start
    : topLevels EOF
    ;

topLevels
    : SEMI* (topLevel (SEMI topLevel)*)? SEMI*
    ;

topLevel
    : klass
    | function
    | expression
    | declaration
    ;

klass
    : CLASS name=IDENT (LCUR topLevels RCUR)?
    ;

function
    : FUN name=IDENT LPAR arguments RPAR (COLON type=IDENT)? block
    ;

arguments
    : (argument (COMMA argument)*)? COMMA?
    ;

argument
    : name=IDENT COLON type=IDENT
    ;

statements
    : SEMI* (statement (SEMI statement)*)? SEMI*
    ;

statement
    : declaration
    | assigment
    | expression
    | block
    ;

block
    : LCUR statements RCUR
    ;

declaration
    : name=IDENT (COLON type=IDENT)? (ASSIGNMENT expression)?
    ;

assigment
    : name=IDENT ASSIGNMENT expression
    ;

expression
    : INT #intExpr
    | IDENT #identExpr
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
    : INCR
    | DECR
    | ADD
    | SUB
    | INV
    ;


