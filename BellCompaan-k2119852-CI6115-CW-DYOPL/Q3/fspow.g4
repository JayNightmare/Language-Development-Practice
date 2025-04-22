grammar fspow;

// Parser Rules
prog: stat+ EOF;

stat: assignment                #StatAssignment
        | fcApplySelector          #StatFcApplySelector
        | fcList                   #StatFcList
        | message                  #StatMessage
        ;

assignment: ID '=' expression;

expression: fcCreation         #ExprFcCreation
        | selCreation         #ExprSelCreation
        | ID                  #ExprID
        ;

fcCreation: 'FileCollection' '(' rootSpecifier ')'    #FcCreationName;

selCreation: 'Selector' '(' selfilter ')'             #SelCreationName;

selfilter: 'name' '(' STRING ')'                      #FilterName
        | 'size' '(' STRING ')'                       #FilterSize
        | 'date' '(' STRING ')'                       #FilterDate
        | 'top' '(' NUMBER ',' topAttr ')'            #FilterTop
        | selfilter 'intersect' selfilter             #FilterIntersect
        | 'not' '(' selfilter ')'                     #FilterNot
        | '(' selfilter ')'                           #FilterParens
        ;

topAttr: 'Biggest'                                    #AttrBiggest
        | 'Smallest'                                   #AttrSmallest
        | 'Oldest'                                     #AttrOldest
        | 'Newest'                                     #AttrNewest
        ;

// fcApplySelector: ID '.apply' '(' ID ')';
fcApplySelector: ID '=' ID '.' 'apply' '(' ID ')' ;

fcList: ID '.list' '(' ')';

message: 'message' '(' STRING ')';

rootSpecifier: STRING;

// Lexer Rules
ID: [a-zA-Z][a-zA-Z0-9_]*;
STRING: '"' (~["])* '"';
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
