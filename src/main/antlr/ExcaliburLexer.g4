lexer grammar ExcaliburLexer;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

LPAR: '(';
RPAR: ')';

INT: '0'..'9'+;

WS: [ \r\t]+ -> skip;
NL: '\n' | '\r' '\n';
