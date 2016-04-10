grammar Resume;

startrule	: expression+ ;	

action		: START 
			| STOP ;

command 		: action texttype ;

expression	: command NEWLINE
			| body NEWLINE;

texttype		: PERSONAL
			| EXPERIENCE
			| SKILLS
			| EDUCATION ;

body			: personal
			| experience
			| skills
			| education ;

personal		: pertype ':' VALUE ; 
experience	: exptype ':' VALUE ;
education	: edutype ':' VALUE ;
skills		: skitype ':' VALUE ;

pertype		: NAME
			| ADDRESS
			| PHONE
			| EMAIL ;

edutype		: DEGREE
			| SCHOOL
			| STARTYEAR
			| ENDYEAR ;

exptype		: TITLE
			| COMPANY
			| STARTYEAR
			| ENDYEAR
			| STARTMONTH
			| ENDMONTH 
			| SENTENCE;

skitype		: GENERAL ;

GENERAL		: 'general';
TITLE		: 'title' ;
COMPANY		: 'company' ;
STARTMONTH	: 'startmonth' ;
ENDMONTH		: 'endmonth' ;

START		: 'start' ;
STOP			: 'stop' ;

NAME			: 'name' ;
ADDRESS		: 'address' ;
PHONE		: 'phone' ;
EMAIL		: 'email' ;

DEGREE		: 'degree' ;
SCHOOL		: 'school' ;
STARTYEAR	: 'startyear' ;
ENDYEAR		: 'endyear' ;

PERSONAL		: 'personal' ;
SKILLS		: 'skills' ;
EDUCATION	: 'education' ;
EXPERIENCE	: 'experience' ;

VALUE		: [a-zA-Z]+ ;

NEWLINE		: '\r'? '\n' ;
WS			: [ \t]+ -> skip ;
