lexer grammar ExcaliburLexer;

ASSIGNMENT: '=';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

INCR: '++';
DECR: '--';

INV: '!';

LPAR: '(';
RPAR: ')';
LCUR: '{';
RCUR: '}';
LBRA: '[';
RBRA: ']';

INT: '0'..'9'+;

FUN: 'fun';
CLASS: 'class';

IDENT: NameStartChar NameChar*;
fragment NameChar
   : NameStartChar
   | '0'..'9'
   | '_'
   ;
fragment NameStartChar
    : 'A'..'Z'
    | 'a'..'z'
    ;
COMMA: ',';
COLON: ':';

SEMI: ([ \r\t]*(SEMICOLON | NL))+;
WS: [ \r\t]+ -> skip;
SEMICOLON: ';';
NL: '\n' | '\r' '\n'?;
