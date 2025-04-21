// Define a grammar called Hello

grammar Hello;

start : 'hello' ID ;

ID : [a-zA-Z_]+[a-zA-Z_0-9]* ;

WS : [ \t\r\n]+ -> skip ;
