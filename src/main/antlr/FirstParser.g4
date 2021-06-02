parser grammar FirstParser;

options { tokenVocab = FirstLexer; }

start
    : (ADD
    | SUB
    | MUL
    | DIV
    | LPAR
    | RPAR
    | INT
    | NL)*
    ;
