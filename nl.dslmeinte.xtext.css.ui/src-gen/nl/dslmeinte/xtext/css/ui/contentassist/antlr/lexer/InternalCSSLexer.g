
/*
* generated by Xtext
*/
lexer grammar InternalCSSLexer;


@header {
package nl.dslmeinte.xtext.css.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_82 : ('N'|'n')('T'|'t')('H'|'h')'-'('L'|'l')('A'|'a')('S'|'s')('T'|'t')'-'('I'|'i')('F'|'f')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_81 : ('N'|'n')('T'|'t')('H'|'h')'-'('L'|'l')('A'|'a')('S'|'s')('T'|'t')'-'('C'|'c')('H'|'h')('I'|'i')('L'|'l')('D'|'d');

KEYWORD_79 : ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t')'-'('O'|'o')('F'|'f')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_80 : ('I'|'i')('N'|'n')('D'|'d')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('M'|'m')('I'|'i')('N'|'n')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_76 : ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t')'-'('L'|'l')('E'|'e')('T'|'t')('T'|'t')('E'|'e')('R'|'r');

KEYWORD_77 : ('L'|'l')('A'|'a')('S'|'s')('T'|'t')'-'('O'|'o')('F'|'f')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_78 : ('O'|'o')('N'|'n')('L'|'l')('Y'|'y')'-'('O'|'o')('F'|'f')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_74 : ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t')'-'('C'|'c')('H'|'h')('I'|'i')('L'|'l')('D'|'d');

KEYWORD_75 : ('N'|'n')('T'|'t')('H'|'h')'-'('O'|'o')('F'|'f')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_67 : '!'('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

KEYWORD_68 : '@'('F'|'f')('O'|'o')('N'|'n')('T'|'t')'-'('F'|'f')('A'|'a')('C'|'c')('E'|'e');

KEYWORD_69 : '@'('N'|'n')('A'|'a')('M'|'m')('E'|'e')('S'|'s')('P'|'p')('A'|'a')('C'|'c')('E'|'e');

KEYWORD_70 : ('B'|'b')('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r')'-'('T'|'t')('O'|'o')('P'|'p');

KEYWORD_71 : ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t')'-'('L'|'l')('I'|'i')('N'|'n')('E'|'e');

KEYWORD_72 : ('L'|'l')('A'|'a')('S'|'s')('T'|'t')'-'('C'|'c')('H'|'h')('I'|'i')('L'|'l')('D'|'d');

KEYWORD_73 : ('O'|'o')('N'|'n')('L'|'l')('Y'|'y')'-'('C'|'c')('H'|'h')('I'|'i')('L'|'l')('D'|'d');

KEYWORD_66 : ('N'|'n')('T'|'t')('H'|'h')'-'('C'|'c')('H'|'h')('I'|'i')('L'|'l')('D'|'d');

KEYWORD_64 : '@'('C'|'c')('H'|'h')('A'|'a')('R'|'r')('S'|'s')('E'|'e')('T'|'t');

KEYWORD_65 : ('D'|'d')('I'|'i')('S'|'s')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('D'|'d');

KEYWORD_59 : '@'('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t');

KEYWORD_60 : ('C'|'c')('H'|'h')('E'|'e')('C'|'c')('K'|'k')('E'|'e')('D'|'d');

KEYWORD_61 : ('E'|'e')('N'|'n')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('D'|'d');

KEYWORD_62 : ('O'|'o')('P'|'p')('A'|'a')('C'|'c')('I'|'i')('T'|'t')('Y'|'y');

KEYWORD_63 : ('V'|'v')('I'|'i')('S'|'s')('I'|'i')('T'|'t')('E'|'e')('D'|'d');

KEYWORD_55 : '@'('M'|'m')('E'|'e')('D'|'d')('I'|'i')('A'|'a');

KEYWORD_56 : ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('E'|'e');

KEYWORD_57 : ('B'|'b')('E'|'e')('F'|'f')('O'|'o')('R'|'r')('E'|'e');

KEYWORD_58 : ('T'|'t')('A'|'a')('R'|'r')('G'|'g')('E'|'e')('T'|'t');

KEYWORD_46 : '@'('P'|'p')('A'|'a')('G'|'g')('E'|'e');

KEYWORD_47 : ('A'|'a')('F'|'f')('T'|'t')('E'|'e')('R'|'r');

KEYWORD_48 : ('A'|'a')('L'|'l')('P'|'p')('H'|'h')('A'|'a');

KEYWORD_49 : ('B'|'b')('L'|'l')('A'|'a')('C'|'c')('K'|'k');

KEYWORD_50 : ('C'|'c')('O'|'o')('L'|'l')('O'|'o')('R'|'r');

KEYWORD_51 : ('E'|'e')('M'|'m')('P'|'p')('T'|'t')('Y'|'y');

KEYWORD_52 : ('F'|'f')('O'|'o')('C'|'c')('U'|'u')('S'|'s');

KEYWORD_53 : ('H'|'h')('O'|'o')('V'|'v')('E'|'e')('R'|'r');

KEYWORD_54 : ('W'|'w')('H'|'h')('I'|'i')('T'|'t')('E'|'e');

KEYWORD_38 : ('E'|'e')('V'|'v')('E'|'e')('N'|'n');

KEYWORD_39 : ('H'|'h')('S'|'s')('L'|'l')('A'|'a');

KEYWORD_40 : ('L'|'l')('A'|'a')('N'|'n')('G'|'g');

KEYWORD_41 : ('L'|'l')('I'|'i')('N'|'n')('K'|'k');

KEYWORD_42 : ('N'|'n')('O'|'o')('T'|'t')'(';

KEYWORD_43 : ('O'|'o')('N'|'n')('L'|'l')('Y'|'y');

KEYWORD_44 : ('R'|'r')('G'|'g')('B'|'b')('A'|'a');

KEYWORD_45 : ('R'|'r')('O'|'o')('O'|'o')('T'|'t');

KEYWORD_33 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_34 : ('H'|'h')('S'|'s')('L'|'l');

KEYWORD_35 : ('N'|'n')('O'|'o')('T'|'t');

KEYWORD_36 : ('O'|'o')('D'|'d')('D'|'d');

KEYWORD_37 : ('R'|'r')('G'|'g')('B'|'b');

KEYWORD_20 : '$''=';

KEYWORD_21 : '*''=';

KEYWORD_22 : '^''=';

KEYWORD_23 : ('C'|'c')('M'|'m');

KEYWORD_24 : ('E'|'e')('M'|'m');

KEYWORD_25 : ('E'|'e')('X'|'x');

KEYWORD_26 : ('I'|'i')('N'|'n');

KEYWORD_27 : ('M'|'m')('M'|'m');

KEYWORD_28 : ('P'|'p')('C'|'c');

KEYWORD_29 : ('P'|'p')('T'|'t');

KEYWORD_30 : ('P'|'p')('X'|'x');

KEYWORD_31 : '|''=';

KEYWORD_32 : '~''=';

KEYWORD_1 : '%';

KEYWORD_2 : '(';

KEYWORD_3 : ')';

KEYWORD_4 : '*';

KEYWORD_5 : '+';

KEYWORD_6 : ',';

KEYWORD_7 : '-';

KEYWORD_8 : '/';

KEYWORD_9 : ':';

KEYWORD_10 : ';';

KEYWORD_11 : '=';

KEYWORD_12 : '>';

KEYWORD_13 : '[';

KEYWORD_14 : ']';

KEYWORD_15 : ('N'|'n');

KEYWORD_16 : '{';

KEYWORD_17 : '|';

KEYWORD_18 : '}';

KEYWORD_19 : '~';



RULE_HEX_COLOR : '#' RULE_HEX_DIGIT+;

RULE_IDENT : RULE_ID_START RULE_ID_PART*;

RULE_HASH_ID : '#' RULE_PREFIXABLE_ID_START RULE_ID_PART*;

RULE_DOT_ID : '.' RULE_PREFIXABLE_ID_START RULE_ID_PART*;

RULE_URL : 'url(' ( options {greedy=false;} : . )*')';

RULE_INT : RULE_DEC_DIGIT+;

RULE_DECIMAL : '-'? RULE_DEC_DIGIT* '.' RULE_DEC_DIGIT+;

fragment RULE_HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_DEC_DIGIT : '0'..'9';

fragment RULE_ID_PART : ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9');

fragment RULE_ID_START : (RULE_PREFIXABLE_ID_START|'-');

fragment RULE_PREFIXABLE_ID_START : ('a'..'z'|'A'..'Z'|'_');

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;



