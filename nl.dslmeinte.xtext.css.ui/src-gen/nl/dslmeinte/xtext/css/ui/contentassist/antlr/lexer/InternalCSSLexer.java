package nl.dslmeinte.xtext.css.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSLexer extends Lexer {
    public static final int RULE_HASH_ID=92;
    public static final int KEYWORD_56=29;
    public static final int RULE_HEX_COLOR=87;
    public static final int KEYWORD_55=28;
    public static final int KEYWORD_54=40;
    public static final int KEYWORD_53=39;
    public static final int KEYWORD_52=38;
    public static final int KEYWORD_51=37;
    public static final int KEYWORD_50=36;
    public static final int EOF=-1;
    public static final int KEYWORD_59=23;
    public static final int KEYWORD_58=31;
    public static final int KEYWORD_57=30;
    public static final int RULE_PREFIXABLE_ID_START=91;
    public static final int KEYWORD_65=22;
    public static final int KEYWORD_64=21;
    public static final int KEYWORD_67=13;
    public static final int KEYWORD_66=20;
    public static final int KEYWORD_61=25;
    public static final int KEYWORD_60=24;
    public static final int KEYWORD_63=27;
    public static final int KEYWORD_62=26;
    public static final int RULE_DECIMAL=97;
    public static final int KEYWORD_69=15;
    public static final int KEYWORD_68=14;
    public static final int RULE_DEC_DIGIT=95;
    public static final int KEYWORD_30=64;
    public static final int RULE_HEX_DIGIT=86;
    public static final int KEYWORD_34=50;
    public static final int KEYWORD_33=49;
    public static final int KEYWORD_32=66;
    public static final int KEYWORD_31=65;
    public static final int KEYWORD_38=41;
    public static final int KEYWORD_37=53;
    public static final int KEYWORD_36=52;
    public static final int KEYWORD_35=51;
    public static final int RULE_ML_COMMENT=99;
    public static final int KEYWORD_39=42;
    public static final int RULE_STRING=98;
    public static final int RULE_IDENT=90;
    public static final int KEYWORD_41=44;
    public static final int KEYWORD_40=43;
    public static final int KEYWORD_43=46;
    public static final int KEYWORD_42=45;
    public static final int KEYWORD_45=48;
    public static final int KEYWORD_44=47;
    public static final int KEYWORD_47=33;
    public static final int KEYWORD_46=32;
    public static final int KEYWORD_49=35;
    public static final int KEYWORD_48=34;
    public static final int KEYWORD_19=85;
    public static final int KEYWORD_17=83;
    public static final int KEYWORD_18=84;
    public static final int KEYWORD_15=81;
    public static final int KEYWORD_16=82;
    public static final int KEYWORD_13=79;
    public static final int KEYWORD_14=80;
    public static final int KEYWORD_11=77;
    public static final int KEYWORD_12=78;
    public static final int KEYWORD_10=76;
    public static final int RULE_ID_START=88;
    public static final int RULE_DOT_ID=93;
    public static final int KEYWORD_6=72;
    public static final int KEYWORD_7=73;
    public static final int KEYWORD_8=74;
    public static final int KEYWORD_9=75;
    public static final int KEYWORD_28=62;
    public static final int KEYWORD_29=63;
    public static final int RULE_INT=96;
    public static final int KEYWORD_24=58;
    public static final int KEYWORD_25=59;
    public static final int KEYWORD_26=60;
    public static final int KEYWORD_27=61;
    public static final int KEYWORD_20=54;
    public static final int KEYWORD_21=55;
    public static final int KEYWORD_22=56;
    public static final int KEYWORD_23=57;
    public static final int KEYWORD_79=6;
    public static final int KEYWORD_71=17;
    public static final int KEYWORD_72=18;
    public static final int KEYWORD_73=19;
    public static final int KEYWORD_74=11;
    public static final int KEYWORD_75=12;
    public static final int KEYWORD_76=8;
    public static final int KEYWORD_77=9;
    public static final int KEYWORD_78=10;
    public static final int KEYWORD_1=67;
    public static final int KEYWORD_5=71;
    public static final int KEYWORD_4=70;
    public static final int KEYWORD_70=16;
    public static final int KEYWORD_3=69;
    public static final int KEYWORD_2=68;
    public static final int RULE_URL=94;
    public static final int KEYWORD_82=4;
    public static final int RULE_ID_PART=89;
    public static final int KEYWORD_81=5;
    public static final int KEYWORD_80=7;
    public static final int RULE_WS=100;

    // delegates
    // delegators

    public InternalCSSLexer() {;} 
    public InternalCSSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCSSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g"; }

    // $ANTLR start "KEYWORD_82"
    public final void mKEYWORD_82() throws RecognitionException {
        try {
            int _type = KEYWORD_82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:19:12: ( ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'I' | 'i' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:19:14: ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'I' | 'i' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_82"

    // $ANTLR start "KEYWORD_81"
    public final void mKEYWORD_81() throws RecognitionException {
        try {
            int _type = KEYWORD_81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:21:12: ( ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:21:14: ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_81"

    // $ANTLR start "KEYWORD_79"
    public final void mKEYWORD_79() throws RecognitionException {
        try {
            int _type = KEYWORD_79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:23:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:23:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_79"

    // $ANTLR start "KEYWORD_80"
    public final void mKEYWORD_80() throws RecognitionException {
        try {
            int _type = KEYWORD_80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:25:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:25:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_80"

    // $ANTLR start "KEYWORD_76"
    public final void mKEYWORD_76() throws RecognitionException {
        try {
            int _type = KEYWORD_76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:27:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:27:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_76"

    // $ANTLR start "KEYWORD_77"
    public final void mKEYWORD_77() throws RecognitionException {
        try {
            int _type = KEYWORD_77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:29:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:29:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_77"

    // $ANTLR start "KEYWORD_78"
    public final void mKEYWORD_78() throws RecognitionException {
        try {
            int _type = KEYWORD_78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:31:12: ( ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:31:14: ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_78"

    // $ANTLR start "KEYWORD_74"
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:33:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:33:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_74"

    // $ANTLR start "KEYWORD_75"
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:35:12: ( ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:35:14: ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'O' | 'o' ) ( 'F' | 'f' ) '-' ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_75"

    // $ANTLR start "KEYWORD_67"
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:37:12: ( '!' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:37:14: '!' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            match('!'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_67"

    // $ANTLR start "KEYWORD_68"
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:39:12: ( '@' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) '-' ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:39:14: '@' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) '-' ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_68"

    // $ANTLR start "KEYWORD_69"
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:41:12: ( '@' ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:41:14: '@' ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_69"

    // $ANTLR start "KEYWORD_70"
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:43:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '-' ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:43:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '-' ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_70"

    // $ANTLR start "KEYWORD_71"
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:45:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:45:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_71"

    // $ANTLR start "KEYWORD_72"
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:47:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:47:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_72"

    // $ANTLR start "KEYWORD_73"
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:49:12: ( ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:49:14: ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_73"

    // $ANTLR start "KEYWORD_66"
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:51:12: ( ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:51:14: ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) '-' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_66"

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:53:12: ( '@' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:53:14: '@' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            match('@'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_65"
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:55:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:55:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_65"

    // $ANTLR start "KEYWORD_59"
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:57:12: ( '@' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:57:14: '@' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            match('@'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:59:12: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:59:14: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:61:12: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:61:14: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:63:12: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:63:14: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:65:12: ( ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:65:14: ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_63"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:67:12: ( '@' ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:67:14: '@' ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' )
            {
            match('@'); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:69:12: ( ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:69:14: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:71:12: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:71:14: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:73:12: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:73:14: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_58"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:75:12: ( '@' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:75:14: '@' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:77:12: ( ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:77:14: ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:79:12: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'A' | 'a' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:79:14: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:81:12: ( ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:81:14: ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:83:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:83:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:85:12: ( ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:85:14: ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:87:12: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:87:14: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:89:12: ( ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:89:14: ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:91:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:91:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:93:12: ( ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:93:14: ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:95:12: ( ( 'H' | 'h' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:95:14: ( 'H' | 'h' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:97:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:97:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:99:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:99:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:101:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) '(' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:101:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) '('
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:103:12: ( ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:103:14: ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:105:12: ( ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'B' | 'b' ) ( 'A' | 'a' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:105:14: ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'B' | 'b' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:107:12: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:107:14: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:109:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:109:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:111:12: ( ( 'H' | 'h' ) ( 'S' | 's' ) ( 'L' | 'l' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:111:14: ( 'H' | 'h' ) ( 'S' | 's' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:113:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:113:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:115:12: ( ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:115:14: ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:117:12: ( ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'B' | 'b' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:117:14: ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:119:12: ( '$' '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:119:14: '$' '='
            {
            match('$'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:121:12: ( '*' '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:121:14: '*' '='
            {
            match('*'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:123:12: ( '^' '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:123:14: '^' '='
            {
            match('^'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:125:12: ( ( 'C' | 'c' ) ( 'M' | 'm' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:125:14: ( 'C' | 'c' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:127:12: ( ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:127:14: ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:129:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:129:14: ( 'E' | 'e' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:131:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:131:14: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:133:12: ( ( 'M' | 'm' ) ( 'M' | 'm' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:133:14: ( 'M' | 'm' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:135:12: ( ( 'P' | 'p' ) ( 'C' | 'c' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:135:14: ( 'P' | 'p' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:137:12: ( ( 'P' | 'p' ) ( 'T' | 't' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:137:14: ( 'P' | 'p' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:139:12: ( ( 'P' | 'p' ) ( 'X' | 'x' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:139:14: ( 'P' | 'p' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:141:12: ( '|' '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:141:14: '|' '='
            {
            match('|'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:143:12: ( '~' '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:143:14: '~' '='
            {
            match('~'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:145:11: ( '%' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:145:13: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:147:11: ( '(' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:147:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:149:11: ( ')' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:149:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:151:11: ( '*' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:151:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:153:11: ( '+' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:153:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:155:11: ( ',' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:155:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:157:11: ( '-' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:157:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:159:11: ( '/' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:159:13: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:161:11: ( ':' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:161:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:163:12: ( ';' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:163:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:165:12: ( '=' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:165:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:167:12: ( '>' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:167:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:169:12: ( '[' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:169:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:171:12: ( ']' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:171:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:173:12: ( ( 'N' | 'n' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:173:14: ( 'N' | 'n' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:175:12: ( '{' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:175:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:177:12: ( '|' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:177:14: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:179:12: ( '}' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:179:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:181:12: ( '~' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:181:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "RULE_HEX_COLOR"
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:185:16: ( '#' ( RULE_HEX_DIGIT )+ )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:185:18: '#' ( RULE_HEX_DIGIT )+
            {
            match('#'); 
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:185:22: ( RULE_HEX_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:185:22: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_COLOR"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:187:12: ( RULE_ID_START ( RULE_ID_PART )* )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:187:14: RULE_ID_START ( RULE_ID_PART )*
            {
            mRULE_ID_START(); 
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:187:28: ( RULE_ID_PART )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:187:28: RULE_ID_PART
            	    {
            	    mRULE_ID_PART(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_HASH_ID"
    public final void mRULE_HASH_ID() throws RecognitionException {
        try {
            int _type = RULE_HASH_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:189:14: ( '#' RULE_PREFIXABLE_ID_START ( RULE_ID_PART )* )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:189:16: '#' RULE_PREFIXABLE_ID_START ( RULE_ID_PART )*
            {
            match('#'); 
            mRULE_PREFIXABLE_ID_START(); 
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:189:45: ( RULE_ID_PART )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:189:45: RULE_ID_PART
            	    {
            	    mRULE_ID_PART(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH_ID"

    // $ANTLR start "RULE_DOT_ID"
    public final void mRULE_DOT_ID() throws RecognitionException {
        try {
            int _type = RULE_DOT_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:191:13: ( '.' RULE_PREFIXABLE_ID_START ( RULE_ID_PART )* )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:191:15: '.' RULE_PREFIXABLE_ID_START ( RULE_ID_PART )*
            {
            match('.'); 
            mRULE_PREFIXABLE_ID_START(); 
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:191:44: ( RULE_ID_PART )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:191:44: RULE_ID_PART
            	    {
            	    mRULE_ID_PART(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT_ID"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:193:10: ( 'url(' ( options {greedy=false; } : . )* ')' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:193:12: 'url(' ( options {greedy=false; } : . )* ')'
            {
            match("url("); 

            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:193:19: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==')') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='(')||(LA5_0>='*' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:193:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:195:10: ( ( RULE_DEC_DIGIT )+ )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:195:12: ( RULE_DEC_DIGIT )+
            {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:195:12: ( RULE_DEC_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:195:12: RULE_DEC_DIGIT
            	    {
            	    mRULE_DEC_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:14: ( ( '-' )? ( RULE_DEC_DIGIT )* '.' ( RULE_DEC_DIGIT )+ )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:16: ( '-' )? ( RULE_DEC_DIGIT )* '.' ( RULE_DEC_DIGIT )+
            {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:16: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:21: ( RULE_DEC_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:21: RULE_DEC_DIGIT
            	    {
            	    mRULE_DEC_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('.'); 
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:41: ( RULE_DEC_DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:197:41: RULE_DEC_DIGIT
            	    {
            	    mRULE_DEC_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:199:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:199:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_DEC_DIGIT"
    public final void mRULE_DEC_DIGIT() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:201:25: ( '0' .. '9' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:201:27: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_DIGIT"

    // $ANTLR start "RULE_ID_PART"
    public final void mRULE_ID_PART() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:203:23: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:203:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_PART"

    // $ANTLR start "RULE_ID_START"
    public final void mRULE_ID_START() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:205:24: ( ( RULE_PREFIXABLE_ID_START | '-' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:205:26: ( RULE_PREFIXABLE_ID_START | '-' )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_START"

    // $ANTLR start "RULE_PREFIXABLE_ID_START"
    public final void mRULE_PREFIXABLE_ID_START() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:207:35: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:207:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFIXABLE_ID_START"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:209:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:211:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:211:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:211:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:211:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:213:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:213:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:213:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:8: ( KEYWORD_82 | KEYWORD_81 | KEYWORD_79 | KEYWORD_80 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_74 | KEYWORD_75 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_66 | KEYWORD_64 | KEYWORD_65 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | RULE_HEX_COLOR | RULE_IDENT | RULE_HASH_ID | RULE_DOT_ID | RULE_URL | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_WS )
        int alt15=92;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:10: KEYWORD_82
                {
                mKEYWORD_82(); 

                }
                break;
            case 2 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:21: KEYWORD_81
                {
                mKEYWORD_81(); 

                }
                break;
            case 3 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:32: KEYWORD_79
                {
                mKEYWORD_79(); 

                }
                break;
            case 4 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:43: KEYWORD_80
                {
                mKEYWORD_80(); 

                }
                break;
            case 5 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:54: KEYWORD_76
                {
                mKEYWORD_76(); 

                }
                break;
            case 6 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:65: KEYWORD_77
                {
                mKEYWORD_77(); 

                }
                break;
            case 7 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:76: KEYWORD_78
                {
                mKEYWORD_78(); 

                }
                break;
            case 8 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:87: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 9 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:98: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 10 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:109: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 11 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:120: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 12 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:131: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 13 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:142: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 14 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:153: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 15 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:164: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 16 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:175: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 17 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:186: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 18 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:197: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 19 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:208: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 20 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:219: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 21 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:230: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 22 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:241: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 23 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:252: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 24 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:263: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 25 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:274: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 26 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:285: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 27 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:296: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 28 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:307: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 29 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:318: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 30 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:329: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 31 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:340: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 32 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:351: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 33 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:362: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 34 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:373: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 35 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:384: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 36 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:395: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 37 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:406: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 38 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:417: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 39 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:428: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 40 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:439: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 41 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:450: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 42 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:461: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 43 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:472: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 44 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:483: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 45 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:494: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 46 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:505: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 47 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:516: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 48 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:527: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 49 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:538: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 50 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:549: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 51 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:560: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 52 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:571: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 53 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:582: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 54 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:593: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 55 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:604: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 56 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:615: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 57 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:626: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 58 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:637: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 59 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:648: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 60 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:659: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 61 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:670: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 62 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:681: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 63 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:692: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 64 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:703: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 65 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:713: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 66 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:723: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 67 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:733: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 68 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:743: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 69 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:753: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 70 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:763: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 71 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:773: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 72 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:783: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 73 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:793: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 74 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:804: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 75 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:815: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 76 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:826: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 77 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:837: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 78 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:848: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 79 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:859: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 80 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:870: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 81 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:881: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 82 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:892: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 83 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:903: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 84 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:918: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 85 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:929: RULE_HASH_ID
                {
                mRULE_HASH_ID(); 

                }
                break;
            case 86 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:942: RULE_DOT_ID
                {
                mRULE_DOT_ID(); 

                }
                break;
            case 87 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:954: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 88 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:963: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 89 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:972: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 90 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:985: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 91 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:997: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 92 :
                // ../nl.dslmeinte.xtext.css.ui/src-gen/nl/dslmeinte/xtext/css/ui/contentassist/antlr/lexer/InternalCSSLexer.g:1:1013: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\61\4\53\2\uffff\12\53\1\uffff\1\127\1\uffff\2\53\1\135"+
        "\1\137\5\uffff\1\142\1\144\11\uffff\1\53\2\uffff\1\152\2\uffff\2"+
        "\53\1\uffff\2\53\1\160\5\53\6\uffff\6\53\1\175\1\53\1\u0080\1\53"+
        "\1\u0082\13\53\2\uffff\1\u008e\1\u008f\1\u0090\1\u0091\4\uffff\1"+
        "\53\4\uffff\1\146\2\uffff\1\53\2\uffff\1\53\1\u0096\3\53\1\uffff"+
        "\5\53\1\u009f\6\53\1\uffff\2\53\1\uffff\1\53\1\uffff\4\53\1\u00ad"+
        "\2\53\1\u00b1\1\53\1\u00b4\1\53\4\uffff\1\146\2\53\2\uffff\4\53"+
        "\1\u00be\1\u00bf\1\u00c1\1\53\1\uffff\10\53\1\u00cb\4\53\1\uffff"+
        "\2\53\1\u00d2\1\uffff\1\53\1\u00d4\1\uffff\1\u00d5\1\uffff\4\53"+
        "\1\u00da\2\53\2\uffff\1\53\1\uffff\3\53\1\u00e3\2\53\1\u00e6\1\53"+
        "\1\u00e8\1\uffff\2\53\1\u00eb\1\u00ec\1\53\1\u00ee\1\uffff\1\u00ef"+
        "\2\uffff\4\53\1\uffff\7\53\1\u00fd\1\uffff\2\53\1\uffff\1\53\1\uffff"+
        "\1\53\1\u0102\2\uffff\1\u0103\2\uffff\13\53\1\u0110\1\53\1\uffff"+
        "\1\53\1\u0113\1\u0114\1\u0115\2\uffff\14\53\1\uffff\1\53\1\u0123"+
        "\3\uffff\2\53\1\u0127\12\53\1\uffff\3\53\1\uffff\2\53\1\u0137\3"+
        "\53\1\u013b\1\53\1\u013d\1\u013e\2\53\1\u0141\2\53\1\uffff\1\u0144"+
        "\2\53\1\uffff\1\53\2\uffff\2\53\1\uffff\1\53\1\u014b\1\uffff\1\53"+
        "\1\u014d\1\u014e\2\53\1\u0151\1\uffff\1\u0152\2\uffff\1\53\1\u0154"+
        "\2\uffff\1\53\1\uffff\1\u0156\1\uffff";
    static final String DFA15_eofS =
        "\u0157\uffff";
    static final String DFA15_minS =
        "\1\11\1\55\1\111\1\116\1\101\1\104\1\uffff\1\103\1\105\1\111\1\110"+
        "\1\115\1\111\1\103\1\101\1\117\1\110\1\107\1\uffff\1\75\1\uffff"+
        "\1\115\1\103\2\75\5\uffff\1\55\1\52\10\uffff\1\60\1\162\1\60\1\uffff"+
        "\1\56\2\uffff\1\110\1\124\1\uffff\1\122\1\103\1\55\2\116\1\114\1"+
        "\101\1\104\6\uffff\1\122\1\106\1\101\1\123\1\105\1\114\1\55\1\101"+
        "\1\55\1\105\1\55\1\123\2\124\1\120\1\104\1\122\1\126\1\114\1\111"+
        "\1\102\1\117\2\uffff\4\55\4\uffff\1\56\4\uffff\1\55\2\uffff\1\154"+
        "\2\uffff\1\55\1\50\1\123\1\125\1\105\1\uffff\1\124\1\107\1\113\1"+
        "\131\1\103\1\55\1\104\1\117\1\103\1\101\1\103\1\117\1\uffff\1\102"+
        "\1\124\1\uffff\1\116\1\uffff\2\111\1\105\1\110\1\55\1\107\1\105"+
        "\1\55\1\124\1\55\1\124\4\uffff\1\55\1\50\1\103\2\uffff\1\124\1\123"+
        "\1\124\4\55\1\111\1\uffff\1\105\1\122\1\113\1\102\1\113\1\122\1"+
        "\114\1\131\1\55\1\124\1\126\1\122\1\101\1\uffff\1\105\1\122\1\55"+
        "\1\uffff\1\105\1\55\1\uffff\1\55\1\uffff\1\101\1\106\1\110\2\55"+
        "\1\105\1\103\2\uffff\1\103\1\uffff\1\124\1\122\1\105\1\55\1\114"+
        "\1\105\1\55\1\105\1\55\1\uffff\2\105\2\55\1\124\1\55\1\uffff\1\55"+
        "\2\uffff\1\123\1\55\1\111\1\103\1\uffff\1\122\1\106\1\110\1\106"+
        "\1\110\1\131\2\55\1\uffff\1\105\1\104\1\uffff\1\104\1\uffff\1\104"+
        "\1\55\2\uffff\1\55\2\uffff\2\124\1\114\1\106\1\105\1\110\1\115\1"+
        "\55\1\111\1\55\1\111\1\55\1\124\1\uffff\1\104\3\55\2\uffff\1\55"+
        "\1\131\1\104\1\55\1\124\1\116\2\111\1\124\1\114\1\124\1\114\1\uffff"+
        "\1\117\1\55\3\uffff\1\103\1\120\1\55\2\124\1\105\1\114\1\116\1\131"+
        "\1\104\1\131\1\104\1\120\1\uffff\1\106\1\110\1\105\1\uffff\1\131"+
        "\1\105\1\55\1\104\1\101\1\120\1\55\1\120\3\55\1\111\1\55\1\120\1"+
        "\122\1\uffff\1\55\1\124\1\105\1\uffff\1\105\2\uffff\1\124\1\114"+
        "\1\uffff\1\105\1\55\1\uffff\1\105\2\55\1\131\1\104\1\55\1\uffff"+
        "\1\55\2\uffff\1\120\1\55\2\uffff\1\105\1\uffff\1\55\1\uffff";
    static final String DFA15_maxS =
        "\1\176\1\172\1\157\1\156\1\151\1\160\1\uffff\1\160\1\157\1\151\1"+
        "\157\1\170\1\151\1\156\1\141\1\163\1\150\1\157\1\uffff\1\75\1\uffff"+
        "\1\155\1\170\2\75\5\uffff\1\172\1\52\10\uffff\1\172\1\162\1\172"+
        "\1\uffff\1\71\2\uffff\1\150\1\164\1\uffff\1\162\1\143\1\172\1\163"+
        "\1\156\1\154\1\141\1\144\6\uffff\1\162\1\146\1\141\1\163\1\145\1"+
        "\154\1\172\1\141\1\172\1\145\1\172\1\163\2\164\1\160\1\144\1\162"+
        "\1\166\1\154\1\151\1\142\1\157\2\uffff\4\172\4\uffff\1\71\4\uffff"+
        "\1\172\2\uffff\1\154\2\uffff\1\55\1\172\1\163\1\165\1\145\1\uffff"+
        "\1\164\1\147\1\153\1\171\1\143\1\172\1\144\1\157\1\143\1\141\1\143"+
        "\1\157\1\uffff\1\142\1\164\1\uffff\1\156\1\uffff\2\151\1\145\1\150"+
        "\1\172\1\147\1\145\1\172\1\164\1\172\1\164\4\uffff\1\172\1\50\1"+
        "\157\2\uffff\1\164\1\163\1\164\1\55\3\172\1\151\1\uffff\1\145\1"+
        "\162\1\153\1\142\1\153\1\162\1\154\1\171\1\172\1\164\1\166\1\162"+
        "\1\141\1\uffff\1\145\1\162\1\172\1\uffff\1\145\1\172\1\uffff\1\172"+
        "\1\uffff\1\141\1\146\1\150\1\55\1\172\1\145\1\157\2\uffff\1\157"+
        "\1\uffff\1\164\1\162\1\145\1\172\1\154\1\145\1\172\1\145\1\172\1"+
        "\uffff\2\145\2\172\1\164\1\172\1\uffff\1\172\2\uffff\1\163\1\55"+
        "\1\151\1\157\1\uffff\1\162\1\146\1\150\1\146\1\150\1\171\1\55\1"+
        "\172\1\uffff\1\145\1\144\1\uffff\1\144\1\uffff\1\144\1\172\2\uffff"+
        "\1\172\2\uffff\2\164\1\154\1\146\1\151\1\150\1\155\1\55\1\151\1"+
        "\55\1\151\1\172\1\164\1\uffff\1\144\3\172\2\uffff\1\55\1\171\1\144"+
        "\1\55\1\164\1\156\2\151\1\164\1\154\1\164\1\154\1\uffff\1\157\1"+
        "\172\3\uffff\1\151\1\160\1\172\2\164\1\145\1\154\1\156\1\171\1\144"+
        "\1\171\1\144\1\160\1\uffff\1\146\1\150\1\145\1\uffff\1\171\1\145"+
        "\1\172\1\144\1\141\1\160\1\172\1\160\2\172\1\55\1\151\1\172\1\160"+
        "\1\162\1\uffff\1\172\1\164\1\145\1\uffff\1\145\2\uffff\1\164\1\154"+
        "\1\uffff\1\145\1\172\1\uffff\1\145\2\172\1\171\1\144\1\172\1\uffff"+
        "\1\172\2\uffff\1\160\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\12\13\uffff\1\63\1\uffff\1\65\4\uffff\1\100\1\101\1\102"+
        "\1\104\1\105\2\uffff\1\110\1\111\1\112\1\113\1\114\1\115\1\117\1"+
        "\121\3\uffff\1\124\1\uffff\1\132\1\134\2\uffff\1\116\10\uffff\1"+
        "\13\1\14\1\22\1\24\1\31\1\35\26\uffff\1\64\1\103\4\uffff\1\76\1"+
        "\120\1\77\1\122\1\uffff\1\131\1\106\1\133\1\107\1\uffff\1\123\1"+
        "\125\1\uffff\1\126\1\130\5\uffff\1\71\14\uffff\1\66\2\uffff\1\67"+
        "\1\uffff\1\70\13\uffff\1\72\1\73\1\74\1\75\3\uffff\1\52\1\60\10"+
        "\uffff\1\61\15\uffff\1\56\3\uffff\1\57\2\uffff\1\62\1\uffff\1\127"+
        "\7\uffff\1\50\1\51\1\uffff\1\53\11\uffff\1\46\6\uffff\1\47\1\uffff"+
        "\1\54\1\55\4\uffff\1\43\10\uffff\1\40\2\uffff\1\41\1\uffff\1\42"+
        "\2\uffff\1\36\1\37\1\uffff\1\44\1\45\15\uffff\1\33\4\uffff\1\32"+
        "\1\34\14\uffff\1\27\2\uffff\1\25\1\26\1\30\15\uffff\1\23\3\uffff"+
        "\1\21\17\uffff\1\16\3\uffff\1\17\1\uffff\1\20\1\15\2\uffff\1\11"+
        "\2\uffff\1\10\6\uffff\1\5\1\uffff\1\6\1\7\2\uffff\1\3\1\4\1\uffff"+
        "\1\2\1\uffff\1\1";
    static final String DFA15_specialS =
        "\u0157\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\6\1\55\1\50\1\22\1\31\1\uffff"+
            "\1\55\1\32\1\33\1\23\1\34\1\35\1\36\1\52\1\37\12\54\1\40\1\41"+
            "\1\uffff\1\42\1\43\1\uffff\1\7\1\15\1\10\1\12\1\11\1\13\1\2"+
            "\1\53\1\17\1\3\2\53\1\4\1\25\1\1\1\5\1\26\1\53\1\21\1\53\1\16"+
            "\1\53\1\14\1\20\3\53\1\44\1\uffff\1\45\1\24\1\53\1\uffff\1\15"+
            "\1\10\1\12\1\11\1\13\1\2\1\53\1\17\1\3\2\53\1\4\1\25\1\1\1\5"+
            "\1\26\1\53\1\21\1\53\1\16\1\51\1\14\1\20\3\53\1\46\1\27\1\47"+
            "\1\30",
            "\1\53\2\uffff\12\53\7\uffff\16\53\1\60\4\53\1\57\6\53\4\uffff"+
            "\1\53\1\uffff\16\53\1\60\4\53\1\57\6\53",
            "\1\62\5\uffff\1\63\31\uffff\1\62\5\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\7\uffff\1\66\27\uffff\1\65\7\uffff\1\66",
            "\1\71\11\uffff\1\67\1\uffff\1\70\23\uffff\1\71\11\uffff\1\67"+
            "\1\uffff\1\70",
            "",
            "\1\74\2\uffff\1\72\2\uffff\1\75\3\uffff\1\76\1\73\1\uffff\1"+
            "\77\22\uffff\1\74\2\uffff\1\72\2\uffff\1\75\3\uffff\1\76\1\73"+
            "\1\uffff\1\77",
            "\1\101\6\uffff\1\102\2\uffff\1\100\25\uffff\1\101\6\uffff\1"+
            "\102\2\uffff\1\100",
            "\1\103\37\uffff\1\103",
            "\1\104\4\uffff\1\106\1\uffff\1\105\30\uffff\1\104\4\uffff\1"+
            "\106\1\uffff\1\105",
            "\1\110\1\107\7\uffff\1\111\1\uffff\1\112\24\uffff\1\110\1\107"+
            "\7\uffff\1\111\1\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\114\2\uffff\1\115\5\uffff\1\116\1\uffff\1\117\24\uffff\1"+
            "\114\2\uffff\1\115\5\uffff\1\116\1\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\1\121\3\uffff\1\122\33\uffff\1\121\3\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\7\uffff\1\125\27\uffff\1\124\7\uffff\1\125",
            "",
            "\1\126",
            "",
            "\1\130\37\uffff\1\130",
            "\1\131\20\uffff\1\132\3\uffff\1\133\12\uffff\1\131\20\uffff"+
            "\1\132\3\uffff\1\133",
            "\1\134",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\141\1\uffff\12\140\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\146\7\uffff\6\145\24\147\4\uffff\1\147\1\uffff\6\145\24"+
            "\147",
            "\1\150",
            "\12\141\7\uffff\32\151\4\uffff\1\151\1\uffff\32\151",
            "",
            "\1\141\1\uffff\12\54",
            "",
            "",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\53\2\uffff\12\53\7\uffff\3\53\1\157\26\53\4\uffff\1\53\1"+
            "\uffff\3\53\1\157\26\53",
            "\1\162\4\uffff\1\161\32\uffff\1\162\4\uffff\1\161",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\176\37\uffff\1\176",
            "\1\53\2\uffff\12\53\7\uffff\17\53\1\177\12\53\4\uffff\1\53"+
            "\1\uffff\17\53\1\177\12\53",
            "\1\u0081\37\uffff\1\u0081",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\141\1\uffff\12\140",
            "",
            "",
            "",
            "",
            "\1\147\2\uffff\12\u0092\7\uffff\6\u0092\24\147\4\uffff\1\147"+
            "\1\uffff\6\u0092\24\147",
            "",
            "",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095\4\uffff\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1"+
            "\53\1\uffff\32\53",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "",
            "\1\u00a8\37\uffff\1\u00a8",
            "",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\53\2\uffff\12\53\7\uffff\1\u00b0\31\53\4\uffff\1\53\1\uffff"+
            "\1\u00b0\31\53",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\53\2\uffff\12\53\7\uffff\1\u00b3\31\53\4\uffff\1\53\1\uffff"+
            "\1\u00b3\31\53",
            "\1\u00b5\37\uffff\1\u00b5",
            "",
            "",
            "",
            "",
            "\1\147\2\uffff\12\u0092\7\uffff\6\u0092\24\147\4\uffff\1\147"+
            "\1\uffff\6\u0092\24\147",
            "\1\u00b6",
            "\1\u00b9\10\uffff\1\u00b7\2\uffff\1\u00b8\23\uffff\1\u00b9"+
            "\10\uffff\1\u00b7\2\uffff\1\u00b8",
            "",
            "",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c0\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\u00c2\37\uffff\1\u00c2",
            "",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dd\13\uffff\1\u00dc\23\uffff\1\u00dd\13\uffff\1\u00dc",
            "",
            "",
            "\1\u00df\13\uffff\1\u00de\23\uffff\1\u00df\13\uffff\1\u00de",
            "",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f5\10\uffff\1\u00f4\2\uffff\1\u00f3\23\uffff\1\u00f5"+
            "\10\uffff\1\u00f4\2\uffff\1\u00f3",
            "",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "",
            "\1\u0100\37\uffff\1\u0100",
            "",
            "\1\u0101\37\uffff\1\u0101",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\3\uffff\1\u0109\33\uffff\1\u0108\3\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0111\37\uffff\1\u0111",
            "",
            "\1\u0112\37\uffff\1\u0112",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "",
            "\1\u0122\37\uffff\1\u0122",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u0125\5\uffff\1\u0124\31\uffff\1\u0125\5\uffff\1\u0124",
            "\1\u0126\37\uffff\1\u0126",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u013c\37\uffff\1\u013c",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "",
            "\1\u0147\37\uffff\1\u0147",
            "",
            "",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "",
            "\1\u014a\37\uffff\1\u014a",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u014c\37\uffff\1\u014c",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0153\37\uffff\1\u0153",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0155\37\uffff\1\u0155",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_82 | KEYWORD_81 | KEYWORD_79 | KEYWORD_80 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_74 | KEYWORD_75 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_66 | KEYWORD_64 | KEYWORD_65 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | RULE_HEX_COLOR | RULE_IDENT | RULE_HASH_ID | RULE_DOT_ID | RULE_URL | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_WS );";
        }
    }
 

}