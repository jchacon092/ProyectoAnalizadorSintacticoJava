package analizadorsintactico;

import static analizadorsintactico.Token2.*;
%%
%class Lexer2
%type Token2
L = [a-zA-Z_]
D = [0-9]
NUMERO = [0-9]+
ID = [a-zA-Z]?+[0-9]*
WHITE=[ \t\r]
BR=[\n] 

FOR="for"
IF="if"
WHILE="while"
DO="do"
INT="int"
STRING="string"
CHAR="char"
BYTE="byte"

SHORT="short"
ESPACIO=" "
PUNTOCOMA=";"
INBLOQUE="{"
FINBLOQUE="}"
PARE1="("
PARE2=")"
IGUAL = "="
PRINTF="printf"
OPERADOR_RELACIONAL = [">"|"<"|"=="|"!="|">="|"<="|"<<"|">>"]
OPERADOR_ARITMETICO = ["+"|"-"] 

%{
int contL=1;
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}




/* INT */
{INT}{ESPACIO}{ID}{ESPACIO}{IGUAL}{ESPACIO}{NUMERO}{PUNTOCOMA} {lexeme = yytext(); return VARIABLE_INT;}

/*STRING*/
{STRING}{ESPACIO}{ID}{ESPACIO}{IGUAL}{ESPACIO}{ID}{PUNTOCOMA} {lexeme = yytext(); return VARIABLE_STRING;}

/*VARIABLE CHAR*/
{CHAR}{ESPACIO}{ID}{ESPACIO}{IGUAL}{ESPACIO}{L}{PUNTOCOMA} {lexeme = yytext(); return VARIABLE_CHAR;}

/**/

/*ESPACIO*/
{BR} {contL++;lexeme = yytext(); return LINEA;}


. {return ERROR;}
