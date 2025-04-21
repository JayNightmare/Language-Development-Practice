grammar fspow;
// workshop 4 version

prog:   stat+ ;

// labelling alternatives creates extra visitor methods
// the labels migh clash with rule names, so I make them unique
stat:
        assignment      # statAssignment 
    |   fcList          # statFcList
    |   fcApplySelector # statFcApplySelector
    |   message         # statMessage
    ;

assignment :
    ID '=' expression ;
    
// when alternatives are introduced, try using labels to distinguish
expression : 
    ID              # exprID
    |
    selCreation     # exprSelCreation 
    |
    fcCreation   # exprFcCreation
    ;
// -------
// filecollection statements    
// -------
fcCreation:         fcCreationName '(' rootSpecifier ')' ;

fcCreationName:     'FileCollection' ;
rootSpecifier:      STRING ;
// -------
// selector statements    
// -------
selCreation :       selCreationName '(' filterSpecifier ')' ;

selCreationName:    'Selector' ; 
filterSpecifier:    selfilter '(' STRING ')' ;
selfilter:          'name' ;     
// -------
// apply statement    
// -------
fcApplySelector:    ID '.' applyName '(' expression ')' ;

applyName:          'apply' ;
// -------
// print statement    
// -------
fcList:             ID '.' printName ;

printName:          'print()' ;
// -------
// message statement    
// -------
message: 'message' STRING ;

ID:         [a-zA-Z][a-zA-Z0-9]* ;
STRING:     '"'.*?'"';
WS :        [ \t\r\n]+ -> skip ;
COMMENT :   '//' ~[\r\n]* -> channel(HIDDEN) ;
