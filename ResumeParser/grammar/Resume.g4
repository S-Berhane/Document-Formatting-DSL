grammar Resume;

startrule	: expression+ ;	

action		: START 
			| STOP ;

command 	: action texttype ORDER
			| action texttype ;
			
expression	: command EOL 
			| body EOL ;

texttype	: PERSONAL
			| EXPERIENCE
			| SKILLS
			| EDUCATION ;

body		: personal
			| experience
			| skills
			| education ;

personal	: pertype ':' value ; 
experience	: exptype ':' value ;
education	: edutype ':' value ;
skills		: skitype ':' value ;

pertype		: NAME
			| ADDRESS
			| PHONE
			| EMAIL 
			| GENERAL;

edutype		: DEGREE
			| SCHOOL
			| STARTYEAR
			| ENDYEAR 
			| GENERAL;

exptype		: TITLE
			| COMPANY
			| STARTYEAR
			| ENDYEAR
			| STARTMONTH
			| ENDMONTH 
			| GENERAL;

skitype		: GENERAL ;

value		: VALUE+;

ORDER		: [1-9]+;
START		: 'start' ;
STOP		: 'stop' ;

GENERAL		: 'general';
TITLE		: 'title' ;
COMPANY		: 'company' ;
STARTMONTH	: 'startmonth' ;
ENDMONTH	: 'endmonth' ;

NAME		: 'name' ;
ADDRESS		: 'address' ;
PHONE		: 'phone' ;
EMAIL		: 'email' ;

DEGREE		: 'degree' ;
SCHOOL		: 'school' ;
STARTYEAR	: 'startyear' ;
ENDYEAR		: 'endyear' ;

PERSONAL	: 'personal' ;
SKILLS		: 'skills' ;
EDUCATION	: 'education' ;
EXPERIENCE	: 'experience' ;



EOL			: '\r'? '\n' | '\r' ;
VALUE		: ('a'..'z' | '0'..'9' | 'A'..'Z' | '.' | '@' | '!' | '%' | '$' | '*' | '-' )+ ;
NEWLINE		: '\r'? '\n' ;
WS 			: (' ' | '\t')+ -> channel(HIDDEN);

