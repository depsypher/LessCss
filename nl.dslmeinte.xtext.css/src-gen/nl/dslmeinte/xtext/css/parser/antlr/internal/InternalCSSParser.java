package nl.dslmeinte.xtext.css.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.dslmeinte.xtext.css.services.CSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_82", "KEYWORD_81", "KEYWORD_79", "KEYWORD_80", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_74", "KEYWORD_75", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_66", "KEYWORD_64", "KEYWORD_65", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "RULE_HEX_DIGIT", "RULE_HEX_COLOR", "RULE_ID_START", "RULE_ID_PART", "RULE_IDENT", "RULE_PREFIXABLE_ID_START", "RULE_HASH_ID", "RULE_DOT_ID", "RULE_URL", "RULE_DEC_DIGIT", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS"
    };
    public static final int RULE_HASH_ID=92;
    public static final int RULE_HEX_COLOR=87;
    public static final int KEYWORD_56=29;
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
    public static final int KEYWORD_3=69;
    public static final int KEYWORD_70=16;
    public static final int KEYWORD_2=68;
    public static final int RULE_URL=94;
    public static final int KEYWORD_82=4;
    public static final int RULE_ID_PART=89;
    public static final int KEYWORD_81=5;
    public static final int KEYWORD_80=7;
    public static final int RULE_WS=100;

    // delegates
    // delegators


        public InternalCSSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSSParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g"; }




    	private CSSGrammarAccess grammarAccess;
    	 	
    	public InternalCSSParser(TokenStream input, CSSGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Stylesheet";	
    	} 
    	   	   	
    	@Override
    	protected CSSGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleStylesheet"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:62:1: entryRuleStylesheet returns [EObject current=null] : iv_ruleStylesheet= ruleStylesheet EOF ;
    public final EObject entryRuleStylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStylesheet = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:63:2: (iv_ruleStylesheet= ruleStylesheet EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:64:2: iv_ruleStylesheet= ruleStylesheet EOF
            {
             newCompositeNode(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_ruleStylesheet_in_entryRuleStylesheet67);
            iv_ruleStylesheet=ruleStylesheet();

            state._fsp--;

             current =iv_ruleStylesheet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStylesheet77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:71:1: ruleStylesheet returns [EObject current=null] : ( (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )* ) ;
    public final EObject ruleStylesheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_charSet_1_0=null;
        Token otherlv_2=null;
        EObject lv_imports_3_0 = null;

        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:74:28: ( ( (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )* ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:75:1: ( (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )* )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:75:1: ( (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )* )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:75:2: (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )*
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:75:2: (otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_64) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:76:2: otherlv_0= KEYWORD_64 ( (lv_charSet_1_0= RULE_STRING ) ) otherlv_2= KEYWORD_10
                    {
                    otherlv_0=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleStylesheet116); 

                        	newLeafNode(otherlv_0, grammarAccess.getStylesheetAccess().getCharsetKeyword_0_0());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:80:1: ( (lv_charSet_1_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:81:1: (lv_charSet_1_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:81:1: (lv_charSet_1_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:82:3: lv_charSet_1_0= RULE_STRING
                    {
                    lv_charSet_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStylesheet132); 

                    			newLeafNode(lv_charSet_1_0, grammarAccess.getStylesheetAccess().getCharSetSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStylesheetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"charSet",
                            		lv_charSet_1_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleStylesheet150); 

                        	newLeafNode(otherlv_2, grammarAccess.getStylesheetAccess().getSemicolonKeyword_0_2());
                        

                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:103:3: ( (lv_imports_3_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_59) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:104:1: (lv_imports_3_0= ruleImportDeclaration )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:104:1: (lv_imports_3_0= ruleImportDeclaration )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:105:3: lv_imports_3_0= ruleImportDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleStylesheet172);
            	    lv_imports_3_0=ruleImportDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"ImportDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:121:3: ( (lv_statements_4_0= ruleCSSTopLevelStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=KEYWORD_68 && LA3_0<=KEYWORD_69)||LA3_0==KEYWORD_55||LA3_0==KEYWORD_46||LA3_0==KEYWORD_4||LA3_0==KEYWORD_9||LA3_0==KEYWORD_13||LA3_0==KEYWORD_17||LA3_0==RULE_HEX_COLOR||LA3_0==RULE_IDENT||(LA3_0>=RULE_HASH_ID && LA3_0<=RULE_DOT_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:122:1: (lv_statements_4_0= ruleCSSTopLevelStatement )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:122:1: (lv_statements_4_0= ruleCSSTopLevelStatement )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:123:3: lv_statements_4_0= ruleCSSTopLevelStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getStatementsCSSTopLevelStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCSSTopLevelStatement_in_ruleStylesheet194);
            	    lv_statements_4_0=ruleCSSTopLevelStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_4_0, 
            	            		"CSSTopLevelStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleCSSTopLevelStatement"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:147:1: entryRuleCSSTopLevelStatement returns [EObject current=null] : iv_ruleCSSTopLevelStatement= ruleCSSTopLevelStatement EOF ;
    public final EObject entryRuleCSSTopLevelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSTopLevelStatement = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:148:2: (iv_ruleCSSTopLevelStatement= ruleCSSTopLevelStatement EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:149:2: iv_ruleCSSTopLevelStatement= ruleCSSTopLevelStatement EOF
            {
             newCompositeNode(grammarAccess.getCSSTopLevelStatementRule()); 
            pushFollow(FOLLOW_ruleCSSTopLevelStatement_in_entryRuleCSSTopLevelStatement230);
            iv_ruleCSSTopLevelStatement=ruleCSSTopLevelStatement();

            state._fsp--;

             current =iv_ruleCSSTopLevelStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSTopLevelStatement240); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSTopLevelStatement"


    // $ANTLR start "ruleCSSTopLevelStatement"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:156:1: ruleCSSTopLevelStatement returns [EObject current=null] : (this_RuleSet_0= ruleRuleSet | this_CSSOtherTopLevelDeclaration_1= ruleCSSOtherTopLevelDeclaration ) ;
    public final EObject ruleCSSTopLevelStatement() throws RecognitionException {
        EObject current = null;

        EObject this_RuleSet_0 = null;

        EObject this_CSSOtherTopLevelDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:159:28: ( (this_RuleSet_0= ruleRuleSet | this_CSSOtherTopLevelDeclaration_1= ruleCSSOtherTopLevelDeclaration ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:160:1: (this_RuleSet_0= ruleRuleSet | this_CSSOtherTopLevelDeclaration_1= ruleCSSOtherTopLevelDeclaration )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:160:1: (this_RuleSet_0= ruleRuleSet | this_CSSOtherTopLevelDeclaration_1= ruleCSSOtherTopLevelDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_4||LA4_0==KEYWORD_9||LA4_0==KEYWORD_13||LA4_0==KEYWORD_17||LA4_0==RULE_HEX_COLOR||LA4_0==RULE_IDENT||(LA4_0>=RULE_HASH_ID && LA4_0<=RULE_DOT_ID)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=KEYWORD_68 && LA4_0<=KEYWORD_69)||LA4_0==KEYWORD_55||LA4_0==KEYWORD_46) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:161:5: this_RuleSet_0= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getCSSTopLevelStatementAccess().getRuleSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleCSSTopLevelStatement287);
                    this_RuleSet_0=ruleRuleSet();

                    state._fsp--;


                            current = this_RuleSet_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:171:5: this_CSSOtherTopLevelDeclaration_1= ruleCSSOtherTopLevelDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCSSTopLevelStatementAccess().getCSSOtherTopLevelDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCSSOtherTopLevelDeclaration_in_ruleCSSTopLevelStatement314);
                    this_CSSOtherTopLevelDeclaration_1=ruleCSSOtherTopLevelDeclaration();

                    state._fsp--;


                            current = this_CSSOtherTopLevelDeclaration_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSTopLevelStatement"


    // $ANTLR start "entryRuleCSSOtherTopLevelDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:187:1: entryRuleCSSOtherTopLevelDeclaration returns [EObject current=null] : iv_ruleCSSOtherTopLevelDeclaration= ruleCSSOtherTopLevelDeclaration EOF ;
    public final EObject entryRuleCSSOtherTopLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSOtherTopLevelDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:188:2: (iv_ruleCSSOtherTopLevelDeclaration= ruleCSSOtherTopLevelDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:189:2: iv_ruleCSSOtherTopLevelDeclaration= ruleCSSOtherTopLevelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getCSSOtherTopLevelDeclarationRule()); 
            pushFollow(FOLLOW_ruleCSSOtherTopLevelDeclaration_in_entryRuleCSSOtherTopLevelDeclaration348);
            iv_ruleCSSOtherTopLevelDeclaration=ruleCSSOtherTopLevelDeclaration();

            state._fsp--;

             current =iv_ruleCSSOtherTopLevelDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSOtherTopLevelDeclaration358); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSOtherTopLevelDeclaration"


    // $ANTLR start "ruleCSSOtherTopLevelDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:196:1: ruleCSSOtherTopLevelDeclaration returns [EObject current=null] : (this_MediaDeclaration_0= ruleMediaDeclaration | this_PageDeclaration_1= rulePageDeclaration | this_NamespaceDeclaration_2= ruleNamespaceDeclaration | this_FontFaceDeclaration_3= ruleFontFaceDeclaration ) ;
    public final EObject ruleCSSOtherTopLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_MediaDeclaration_0 = null;

        EObject this_PageDeclaration_1 = null;

        EObject this_NamespaceDeclaration_2 = null;

        EObject this_FontFaceDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:199:28: ( (this_MediaDeclaration_0= ruleMediaDeclaration | this_PageDeclaration_1= rulePageDeclaration | this_NamespaceDeclaration_2= ruleNamespaceDeclaration | this_FontFaceDeclaration_3= ruleFontFaceDeclaration ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:200:1: (this_MediaDeclaration_0= ruleMediaDeclaration | this_PageDeclaration_1= rulePageDeclaration | this_NamespaceDeclaration_2= ruleNamespaceDeclaration | this_FontFaceDeclaration_3= ruleFontFaceDeclaration )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:200:1: (this_MediaDeclaration_0= ruleMediaDeclaration | this_PageDeclaration_1= rulePageDeclaration | this_NamespaceDeclaration_2= ruleNamespaceDeclaration | this_FontFaceDeclaration_3= ruleFontFaceDeclaration )
            int alt5=4;
            switch ( input.LA(1) ) {
            case KEYWORD_55:
                {
                alt5=1;
                }
                break;
            case KEYWORD_46:
                {
                alt5=2;
                }
                break;
            case KEYWORD_69:
                {
                alt5=3;
                }
                break;
            case KEYWORD_68:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:201:5: this_MediaDeclaration_0= ruleMediaDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCSSOtherTopLevelDeclarationAccess().getMediaDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMediaDeclaration_in_ruleCSSOtherTopLevelDeclaration405);
                    this_MediaDeclaration_0=ruleMediaDeclaration();

                    state._fsp--;


                            current = this_MediaDeclaration_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:211:5: this_PageDeclaration_1= rulePageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCSSOtherTopLevelDeclarationAccess().getPageDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePageDeclaration_in_ruleCSSOtherTopLevelDeclaration432);
                    this_PageDeclaration_1=rulePageDeclaration();

                    state._fsp--;


                            current = this_PageDeclaration_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:221:5: this_NamespaceDeclaration_2= ruleNamespaceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCSSOtherTopLevelDeclarationAccess().getNamespaceDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceDeclaration_in_ruleCSSOtherTopLevelDeclaration459);
                    this_NamespaceDeclaration_2=ruleNamespaceDeclaration();

                    state._fsp--;


                            current = this_NamespaceDeclaration_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:231:5: this_FontFaceDeclaration_3= ruleFontFaceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCSSOtherTopLevelDeclarationAccess().getFontFaceDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFontFaceDeclaration_in_ruleCSSOtherTopLevelDeclaration486);
                    this_FontFaceDeclaration_3=ruleFontFaceDeclaration();

                    state._fsp--;


                            current = this_FontFaceDeclaration_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSOtherTopLevelDeclaration"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:247:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:248:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:249:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration520);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration530); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:256:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) ) ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )? otherlv_6= KEYWORD_10 ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token lv_url_2_0=null;
        Token lv_media_3_0=null;
        Token otherlv_4=null;
        Token lv_media_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:259:28: ( (otherlv_0= KEYWORD_59 ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) ) ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )? otherlv_6= KEYWORD_10 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:260:1: (otherlv_0= KEYWORD_59 ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) ) ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )? otherlv_6= KEYWORD_10 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:260:1: (otherlv_0= KEYWORD_59 ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) ) ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )? otherlv_6= KEYWORD_10 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:261:2: otherlv_0= KEYWORD_59 ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) ) ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )? otherlv_6= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleImportDeclaration568); 

                	newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:265:1: ( ( (lv_importURI_1_0= RULE_STRING ) ) | ( (lv_url_2_0= RULE_URL ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_URL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:265:2: ( (lv_importURI_1_0= RULE_STRING ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:265:2: ( (lv_importURI_1_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:266:1: (lv_importURI_1_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:266:1: (lv_importURI_1_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:267:3: lv_importURI_1_0= RULE_STRING
                    {
                    lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportDeclaration585); 

                    			newLeafNode(lv_importURI_1_0, grammarAccess.getImportDeclarationAccess().getImportURISTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"importURI",
                            		lv_importURI_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:284:6: ( (lv_url_2_0= RULE_URL ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:284:6: ( (lv_url_2_0= RULE_URL ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:285:1: (lv_url_2_0= RULE_URL )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:285:1: (lv_url_2_0= RULE_URL )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:286:3: lv_url_2_0= RULE_URL
                    {
                    lv_url_2_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleImportDeclaration613); 

                    			newLeafNode(lv_url_2_0, grammarAccess.getImportDeclarationAccess().getUrlURLTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_2_0, 
                            		"URL");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:302:3: ( ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:302:4: ( (lv_media_3_0= RULE_IDENT ) ) (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )*
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:302:4: ( (lv_media_3_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:303:1: (lv_media_3_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:303:1: (lv_media_3_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:304:3: lv_media_3_0= RULE_IDENT
                    {
                    lv_media_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleImportDeclaration637); 

                    			newLeafNode(lv_media_3_0, grammarAccess.getImportDeclarationAccess().getMediaIDENTTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"media",
                            		lv_media_3_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:320:2: (otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==KEYWORD_6) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:321:2: otherlv_4= KEYWORD_6 ( (lv_media_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleImportDeclaration656); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getImportDeclarationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:325:1: ( (lv_media_5_0= RULE_IDENT ) )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:326:1: (lv_media_5_0= RULE_IDENT )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:326:1: (lv_media_5_0= RULE_IDENT )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:327:3: lv_media_5_0= RULE_IDENT
                    	    {
                    	    lv_media_5_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleImportDeclaration672); 

                    	    			newLeafNode(lv_media_5_0, grammarAccess.getImportDeclarationAccess().getMediaIDENTTerminalRuleCall_2_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getImportDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"media",
                    	            		lv_media_5_0, 
                    	            		"IDENT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleImportDeclaration694); 

                	newLeafNode(otherlv_6, grammarAccess.getImportDeclarationAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleMediaDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:356:1: entryRuleMediaDeclaration returns [EObject current=null] : iv_ruleMediaDeclaration= ruleMediaDeclaration EOF ;
    public final EObject entryRuleMediaDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:357:2: (iv_ruleMediaDeclaration= ruleMediaDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:358:2: iv_ruleMediaDeclaration= ruleMediaDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMediaDeclarationRule()); 
            pushFollow(FOLLOW_ruleMediaDeclaration_in_entryRuleMediaDeclaration728);
            iv_ruleMediaDeclaration=ruleMediaDeclaration();

            state._fsp--;

             current =iv_ruleMediaDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMediaDeclaration738); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaDeclaration"


    // $ANTLR start "ruleMediaDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:365:1: ruleMediaDeclaration returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_mediaQueries_1_0= ruleMediaQuery ) ) (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )* otherlv_4= KEYWORD_16 ( (lv_members_5_0= ruleMediaDeclarationMembers ) )* otherlv_6= KEYWORD_18 ) ;
    public final EObject ruleMediaDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_mediaQueries_1_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:368:28: ( (otherlv_0= KEYWORD_55 ( (lv_mediaQueries_1_0= ruleMediaQuery ) ) (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )* otherlv_4= KEYWORD_16 ( (lv_members_5_0= ruleMediaDeclarationMembers ) )* otherlv_6= KEYWORD_18 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:369:1: (otherlv_0= KEYWORD_55 ( (lv_mediaQueries_1_0= ruleMediaQuery ) ) (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )* otherlv_4= KEYWORD_16 ( (lv_members_5_0= ruleMediaDeclarationMembers ) )* otherlv_6= KEYWORD_18 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:369:1: (otherlv_0= KEYWORD_55 ( (lv_mediaQueries_1_0= ruleMediaQuery ) ) (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )* otherlv_4= KEYWORD_16 ( (lv_members_5_0= ruleMediaDeclarationMembers ) )* otherlv_6= KEYWORD_18 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:370:2: otherlv_0= KEYWORD_55 ( (lv_mediaQueries_1_0= ruleMediaQuery ) ) (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )* otherlv_4= KEYWORD_16 ( (lv_members_5_0= ruleMediaDeclarationMembers ) )* otherlv_6= KEYWORD_18
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleMediaDeclaration776); 

                	newLeafNode(otherlv_0, grammarAccess.getMediaDeclarationAccess().getMediaKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:374:1: ( (lv_mediaQueries_1_0= ruleMediaQuery ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:375:1: (lv_mediaQueries_1_0= ruleMediaQuery )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:375:1: (lv_mediaQueries_1_0= ruleMediaQuery )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:376:3: lv_mediaQueries_1_0= ruleMediaQuery
            {
             
            	        newCompositeNode(grammarAccess.getMediaDeclarationAccess().getMediaQueriesMediaQueryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMediaQuery_in_ruleMediaDeclaration796);
            lv_mediaQueries_1_0=ruleMediaQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMediaDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"mediaQueries",
                    		lv_mediaQueries_1_0, 
                    		"MediaQuery");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:392:2: (otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_6) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:393:2: otherlv_2= KEYWORD_6 ( (lv_media_3_0= ruleMediaQuery ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMediaDeclaration810); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMediaDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:397:1: ( (lv_media_3_0= ruleMediaQuery ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:398:1: (lv_media_3_0= ruleMediaQuery )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:398:1: (lv_media_3_0= ruleMediaQuery )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:399:3: lv_media_3_0= ruleMediaQuery
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaDeclarationAccess().getMediaMediaQueryParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMediaQuery_in_ruleMediaDeclaration830);
            	    lv_media_3_0=ruleMediaQuery();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"media",
            	            		lv_media_3_0, 
            	            		"MediaQuery");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleMediaDeclaration845); 

                	newLeafNode(otherlv_4, grammarAccess.getMediaDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:420:1: ( (lv_members_5_0= ruleMediaDeclarationMembers ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_70||LA10_0==KEYWORD_48||(LA10_0>=KEYWORD_50 && LA10_0<=KEYWORD_51)||LA10_0==KEYWORD_4||LA10_0==KEYWORD_9||LA10_0==KEYWORD_13||LA10_0==KEYWORD_17||LA10_0==RULE_HEX_COLOR||LA10_0==RULE_IDENT||(LA10_0>=RULE_HASH_ID && LA10_0<=RULE_DOT_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:421:1: (lv_members_5_0= ruleMediaDeclarationMembers )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:421:1: (lv_members_5_0= ruleMediaDeclarationMembers )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:422:3: lv_members_5_0= ruleMediaDeclarationMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaDeclarationAccess().getMembersMediaDeclarationMembersParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMediaDeclarationMembers_in_ruleMediaDeclaration865);
            	    lv_members_5_0=ruleMediaDeclarationMembers();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_5_0, 
            	            		"MediaDeclarationMembers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleMediaDeclaration879); 

                	newLeafNode(otherlv_6, grammarAccess.getMediaDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaDeclaration"


    // $ANTLR start "entryRuleMediaDeclarationMembers"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:451:1: entryRuleMediaDeclarationMembers returns [EObject current=null] : iv_ruleMediaDeclarationMembers= ruleMediaDeclarationMembers EOF ;
    public final EObject entryRuleMediaDeclarationMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaDeclarationMembers = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:452:2: (iv_ruleMediaDeclarationMembers= ruleMediaDeclarationMembers EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:453:2: iv_ruleMediaDeclarationMembers= ruleMediaDeclarationMembers EOF
            {
             newCompositeNode(grammarAccess.getMediaDeclarationMembersRule()); 
            pushFollow(FOLLOW_ruleMediaDeclarationMembers_in_entryRuleMediaDeclarationMembers913);
            iv_ruleMediaDeclarationMembers=ruleMediaDeclarationMembers();

            state._fsp--;

             current =iv_ruleMediaDeclarationMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMediaDeclarationMembers923); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaDeclarationMembers"


    // $ANTLR start "ruleMediaDeclarationMembers"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:460:1: ruleMediaDeclarationMembers returns [EObject current=null] : (this_RuleSet_0= ruleRuleSet | (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 ) ) ;
    public final EObject ruleMediaDeclarationMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RuleSet_0 = null;

        EObject this_PropertyDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:463:28: ( (this_RuleSet_0= ruleRuleSet | (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:464:1: (this_RuleSet_0= ruleRuleSet | (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:464:1: (this_RuleSet_0= ruleRuleSet | (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=KEYWORD_5 && LA11_1<=KEYWORD_6)||(LA11_1>=KEYWORD_12 && LA11_1<=KEYWORD_13)||(LA11_1>=KEYWORD_16 && LA11_1<=KEYWORD_17)||LA11_1==KEYWORD_19||LA11_1==RULE_HEX_COLOR||(LA11_1>=RULE_HASH_ID && LA11_1<=RULE_DOT_ID)||LA11_1==RULE_WS) ) {
                    alt11=1;
                }
                else if ( (LA11_1==KEYWORD_9) ) {
                    int LA11_4 = input.LA(3);

                    if ( ((LA11_4>=KEYWORD_82 && LA11_4<=KEYWORD_75)||(LA11_4>=KEYWORD_71 && LA11_4<=KEYWORD_66)||LA11_4==KEYWORD_65||(LA11_4>=KEYWORD_60 && LA11_4<=KEYWORD_61)||LA11_4==KEYWORD_63||(LA11_4>=KEYWORD_56 && LA11_4<=KEYWORD_58)||LA11_4==KEYWORD_47||(LA11_4>=KEYWORD_51 && LA11_4<=KEYWORD_53)||(LA11_4>=KEYWORD_40 && LA11_4<=KEYWORD_42)||LA11_4==KEYWORD_45||LA11_4==KEYWORD_9) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_4>=KEYWORD_48 && LA11_4<=KEYWORD_49)||LA11_4==KEYWORD_54||LA11_4==KEYWORD_39||LA11_4==KEYWORD_44||LA11_4==KEYWORD_34||LA11_4==KEYWORD_37||LA11_4==RULE_HEX_COLOR||LA11_4==RULE_IDENT||LA11_4==RULE_URL||(LA11_4>=RULE_INT && LA11_4<=RULE_STRING)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_4:
            case KEYWORD_9:
            case KEYWORD_13:
            case KEYWORD_17:
            case RULE_HEX_COLOR:
            case RULE_HASH_ID:
            case RULE_DOT_ID:
                {
                alt11=1;
                }
                break;
            case KEYWORD_70:
            case KEYWORD_48:
            case KEYWORD_50:
            case KEYWORD_51:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:465:5: this_RuleSet_0= ruleRuleSet
                    {
                     
                            newCompositeNode(grammarAccess.getMediaDeclarationMembersAccess().getRuleSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleSet_in_ruleMediaDeclarationMembers970);
                    this_RuleSet_0=ruleRuleSet();

                    state._fsp--;


                            current = this_RuleSet_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:474:6: (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:474:6: (this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:475:5: this_PropertyDeclaration_1= rulePropertyDeclaration otherlv_2= KEYWORD_10
                    {
                     
                            newCompositeNode(grammarAccess.getMediaDeclarationMembersAccess().getPropertyDeclarationParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleMediaDeclarationMembers998);
                    this_PropertyDeclaration_1=rulePropertyDeclaration();

                    state._fsp--;


                            current = this_PropertyDeclaration_1;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleMediaDeclarationMembers1010); 

                        	newLeafNode(otherlv_2, grammarAccess.getMediaDeclarationMembersAccess().getSemicolonKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaDeclarationMembers"


    // $ANTLR start "entryRuleMediaQuery"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:496:1: entryRuleMediaQuery returns [EObject current=null] : iv_ruleMediaQuery= ruleMediaQuery EOF ;
    public final EObject entryRuleMediaQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaQuery = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:497:2: (iv_ruleMediaQuery= ruleMediaQuery EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:498:2: iv_ruleMediaQuery= ruleMediaQuery EOF
            {
             newCompositeNode(grammarAccess.getMediaQueryRule()); 
            pushFollow(FOLLOW_ruleMediaQuery_in_entryRuleMediaQuery1045);
            iv_ruleMediaQuery=ruleMediaQuery();

            state._fsp--;

             current =iv_ruleMediaQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMediaQuery1055); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaQuery"


    // $ANTLR start "ruleMediaQuery"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:505:1: ruleMediaQuery returns [EObject current=null] : ( ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* ) | ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* ) ) ;
    public final EObject ruleMediaQuery() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;
        Token lv_not_1_0=null;
        Token lv_mediaType_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_expressions_4_0 = null;

        EObject lv_expressions_5_0 = null;

        EObject lv_expressions_7_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:508:28: ( ( ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* ) | ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:1: ( ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* ) | ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:1: ( ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* ) | ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_43||LA15_0==KEYWORD_35||LA15_0==RULE_IDENT) ) {
                alt15=1;
            }
            else if ( (LA15_0==KEYWORD_2) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:2: ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:2: ( ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )* )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:3: ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )? ( (lv_mediaType_2_0= RULE_IDENT ) ) (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )*
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:3: ( ( (lv_only_0_0= KEYWORD_43 ) ) | ( (lv_not_1_0= KEYWORD_35 ) ) )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==KEYWORD_43) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==KEYWORD_35) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:4: ( (lv_only_0_0= KEYWORD_43 ) )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:509:4: ( (lv_only_0_0= KEYWORD_43 ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:510:1: (lv_only_0_0= KEYWORD_43 )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:510:1: (lv_only_0_0= KEYWORD_43 )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:511:3: lv_only_0_0= KEYWORD_43
                            {
                            lv_only_0_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleMediaQuery1101); 

                                    newLeafNode(lv_only_0_0, grammarAccess.getMediaQueryAccess().getOnlyOnlyKeyword_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMediaQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "only", true, "only");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:526:6: ( (lv_not_1_0= KEYWORD_35 ) )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:526:6: ( (lv_not_1_0= KEYWORD_35 ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:527:1: (lv_not_1_0= KEYWORD_35 )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:527:1: (lv_not_1_0= KEYWORD_35 )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:528:3: lv_not_1_0= KEYWORD_35
                            {
                            lv_not_1_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleMediaQuery1137); 

                                    newLeafNode(lv_not_1_0, grammarAccess.getMediaQueryAccess().getNotNotKeyword_0_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMediaQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "not", true, "not");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:542:4: ( (lv_mediaType_2_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:543:1: (lv_mediaType_2_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:543:1: (lv_mediaType_2_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:544:3: lv_mediaType_2_0= RULE_IDENT
                    {
                    lv_mediaType_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMediaQuery1167); 

                    			newLeafNode(lv_mediaType_2_0, grammarAccess.getMediaQueryAccess().getMediaTypeIDENTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMediaQueryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mediaType",
                            		lv_mediaType_2_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:560:2: (otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==KEYWORD_33) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:561:2: otherlv_3= KEYWORD_33 ( (lv_expressions_4_0= ruleMediaQueryExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleMediaQuery1186); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMediaQueryAccess().getAndKeyword_0_2_0());
                    	        
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:565:1: ( (lv_expressions_4_0= ruleMediaQueryExpression ) )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:566:1: (lv_expressions_4_0= ruleMediaQueryExpression )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:566:1: (lv_expressions_4_0= ruleMediaQueryExpression )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:567:3: lv_expressions_4_0= ruleMediaQueryExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMediaQueryAccess().getExpressionsMediaQueryExpressionParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1206);
                    	    lv_expressions_4_0=ruleMediaQueryExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMediaQueryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_4_0, 
                    	            		"MediaQueryExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:584:6: ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:584:6: ( ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )* )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:584:7: ( (lv_expressions_5_0= ruleMediaQueryExpression ) ) (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )*
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:584:7: ( (lv_expressions_5_0= ruleMediaQueryExpression ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:585:1: (lv_expressions_5_0= ruleMediaQueryExpression )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:585:1: (lv_expressions_5_0= ruleMediaQueryExpression )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:586:3: lv_expressions_5_0= ruleMediaQueryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediaQueryAccess().getExpressionsMediaQueryExpressionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1237);
                    lv_expressions_5_0=ruleMediaQueryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediaQueryRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_5_0, 
                            		"MediaQueryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:602:2: (otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==KEYWORD_33) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:603:2: otherlv_6= KEYWORD_33 ( (lv_expressions_7_0= ruleMediaQueryExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleMediaQuery1251); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMediaQueryAccess().getAndKeyword_1_1_0());
                    	        
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:607:1: ( (lv_expressions_7_0= ruleMediaQueryExpression ) )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:608:1: (lv_expressions_7_0= ruleMediaQueryExpression )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:608:1: (lv_expressions_7_0= ruleMediaQueryExpression )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:609:3: lv_expressions_7_0= ruleMediaQueryExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMediaQueryAccess().getExpressionsMediaQueryExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1271);
                    	    lv_expressions_7_0=ruleMediaQueryExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMediaQueryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_7_0, 
                    	            		"MediaQueryExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaQuery"


    // $ANTLR start "entryRuleMediaQueryExpression"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:633:1: entryRuleMediaQueryExpression returns [EObject current=null] : iv_ruleMediaQueryExpression= ruleMediaQueryExpression EOF ;
    public final EObject entryRuleMediaQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaQueryExpression = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:634:2: (iv_ruleMediaQueryExpression= ruleMediaQueryExpression EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:635:2: iv_ruleMediaQueryExpression= ruleMediaQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getMediaQueryExpressionRule()); 
            pushFollow(FOLLOW_ruleMediaQueryExpression_in_entryRuleMediaQueryExpression1309);
            iv_ruleMediaQueryExpression=ruleMediaQueryExpression();

            state._fsp--;

             current =iv_ruleMediaQueryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMediaQueryExpression1319); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaQueryExpression"


    // $ANTLR start "ruleMediaQueryExpression"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:642:1: ruleMediaQueryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_2 ( (lv_feature_1_0= RULE_IDENT ) ) (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )? otherlv_4= KEYWORD_3 ) ;
    public final EObject ruleMediaQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feature_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:645:28: ( (otherlv_0= KEYWORD_2 ( (lv_feature_1_0= RULE_IDENT ) ) (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )? otherlv_4= KEYWORD_3 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:646:1: (otherlv_0= KEYWORD_2 ( (lv_feature_1_0= RULE_IDENT ) ) (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )? otherlv_4= KEYWORD_3 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:646:1: (otherlv_0= KEYWORD_2 ( (lv_feature_1_0= RULE_IDENT ) ) (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )? otherlv_4= KEYWORD_3 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:647:2: otherlv_0= KEYWORD_2 ( (lv_feature_1_0= RULE_IDENT ) ) (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )? otherlv_4= KEYWORD_3
            {
            otherlv_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMediaQueryExpression1357); 

                	newLeafNode(otherlv_0, grammarAccess.getMediaQueryExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:651:1: ( (lv_feature_1_0= RULE_IDENT ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:652:1: (lv_feature_1_0= RULE_IDENT )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:652:1: (lv_feature_1_0= RULE_IDENT )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:653:3: lv_feature_1_0= RULE_IDENT
            {
            lv_feature_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMediaQueryExpression1373); 

            			newLeafNode(lv_feature_1_0, grammarAccess.getMediaQueryExpressionAccess().getFeatureIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMediaQueryExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:669:2: (otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_9) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:670:2: otherlv_2= KEYWORD_9 ( (lv_expression_3_0= ruleValueLiteral ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleMediaQueryExpression1392); 

                        	newLeafNode(otherlv_2, grammarAccess.getMediaQueryExpressionAccess().getColonKeyword_2_0());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:674:1: ( (lv_expression_3_0= ruleValueLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:675:1: (lv_expression_3_0= ruleValueLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:675:1: (lv_expression_3_0= ruleValueLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:676:3: lv_expression_3_0= ruleValueLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediaQueryExpressionAccess().getExpressionValueLiteralParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueLiteral_in_ruleMediaQueryExpression1412);
                    lv_expression_3_0=ruleValueLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediaQueryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"ValueLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleMediaQueryExpression1427); 

                	newLeafNode(otherlv_4, grammarAccess.getMediaQueryExpressionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaQueryExpression"


    // $ANTLR start "entryRulePageDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:705:1: entryRulePageDeclaration returns [EObject current=null] : iv_rulePageDeclaration= rulePageDeclaration EOF ;
    public final EObject entryRulePageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:706:2: (iv_rulePageDeclaration= rulePageDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:707:2: iv_rulePageDeclaration= rulePageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPageDeclarationRule()); 
            pushFollow(FOLLOW_rulePageDeclaration_in_entryRulePageDeclaration1461);
            iv_rulePageDeclaration=rulePageDeclaration();

            state._fsp--;

             current =iv_rulePageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageDeclaration1471); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageDeclaration"


    // $ANTLR start "rulePageDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:714:1: rulePageDeclaration returns [EObject current=null] : (otherlv_0= KEYWORD_46 (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )? ( (lv_body_3_0= ruleRuleSetBody ) ) ) ;
    public final EObject rulePageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pseudoPage_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:717:28: ( (otherlv_0= KEYWORD_46 (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )? ( (lv_body_3_0= ruleRuleSetBody ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:718:1: (otherlv_0= KEYWORD_46 (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )? ( (lv_body_3_0= ruleRuleSetBody ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:718:1: (otherlv_0= KEYWORD_46 (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )? ( (lv_body_3_0= ruleRuleSetBody ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:719:2: otherlv_0= KEYWORD_46 (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )? ( (lv_body_3_0= ruleRuleSetBody ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rulePageDeclaration1509); 

                	newLeafNode(otherlv_0, grammarAccess.getPageDeclarationAccess().getPageKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:723:1: (otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_9) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:724:2: otherlv_1= KEYWORD_9 ( (lv_pseudoPage_2_0= RULE_IDENT ) )
                    {
                    otherlv_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePageDeclaration1522); 

                        	newLeafNode(otherlv_1, grammarAccess.getPageDeclarationAccess().getColonKeyword_1_0());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:728:1: ( (lv_pseudoPage_2_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:729:1: (lv_pseudoPage_2_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:729:1: (lv_pseudoPage_2_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:730:3: lv_pseudoPage_2_0= RULE_IDENT
                    {
                    lv_pseudoPage_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePageDeclaration1538); 

                    			newLeafNode(lv_pseudoPage_2_0, grammarAccess.getPageDeclarationAccess().getPseudoPageIDENTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pseudoPage",
                            		lv_pseudoPage_2_0, 
                            		"IDENT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:746:4: ( (lv_body_3_0= ruleRuleSetBody ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:747:1: (lv_body_3_0= ruleRuleSetBody )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:747:1: (lv_body_3_0= ruleRuleSetBody )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:748:3: lv_body_3_0= ruleRuleSetBody
            {
             
            	        newCompositeNode(grammarAccess.getPageDeclarationAccess().getBodyRuleSetBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleSetBody_in_rulePageDeclaration1566);
            lv_body_3_0=ruleRuleSetBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"RuleSetBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageDeclaration"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:772:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:773:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:774:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration1601);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration1611); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:781:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= KEYWORD_69 ( (lv_name_1_0= RULE_IDENT ) )? ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) ) otherlv_3= KEYWORD_10 ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_url_2_1=null;
        Token lv_url_2_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:784:28: ( (otherlv_0= KEYWORD_69 ( (lv_name_1_0= RULE_IDENT ) )? ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) ) otherlv_3= KEYWORD_10 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:785:1: (otherlv_0= KEYWORD_69 ( (lv_name_1_0= RULE_IDENT ) )? ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) ) otherlv_3= KEYWORD_10 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:785:1: (otherlv_0= KEYWORD_69 ( (lv_name_1_0= RULE_IDENT ) )? ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) ) otherlv_3= KEYWORD_10 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:786:2: otherlv_0= KEYWORD_69 ( (lv_name_1_0= RULE_IDENT ) )? ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) ) otherlv_3= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleNamespaceDeclaration1649); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:790:1: ( (lv_name_1_0= RULE_IDENT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:791:1: (lv_name_1_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:791:1: (lv_name_1_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:792:3: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleNamespaceDeclaration1665); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getNamespaceDeclarationAccess().getNameIDENTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"IDENT");
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:808:3: ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:809:1: ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:809:1: ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:810:1: (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:810:1: (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_URL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_URL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:811:3: lv_url_2_1= RULE_STRING
                    {
                    lv_url_2_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNamespaceDeclaration1690); 

                    			newLeafNode(lv_url_2_1, grammarAccess.getNamespaceDeclarationAccess().getUrlSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_2_1, 
                            		"STRING");
                    	    

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:826:8: lv_url_2_2= RULE_URL
                    {
                    lv_url_2_2=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleNamespaceDeclaration1710); 

                    			newLeafNode(lv_url_2_2, grammarAccess.getNamespaceDeclarationAccess().getUrlURLTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_2_2, 
                            		"URL");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNamespaceDeclaration1731); 

                	newLeafNode(otherlv_3, grammarAccess.getNamespaceDeclarationAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleFontFaceDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:857:1: entryRuleFontFaceDeclaration returns [EObject current=null] : iv_ruleFontFaceDeclaration= ruleFontFaceDeclaration EOF ;
    public final EObject entryRuleFontFaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontFaceDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:858:2: (iv_ruleFontFaceDeclaration= ruleFontFaceDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:859:2: iv_ruleFontFaceDeclaration= ruleFontFaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFontFaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleFontFaceDeclaration_in_entryRuleFontFaceDeclaration1765);
            iv_ruleFontFaceDeclaration=ruleFontFaceDeclaration();

            state._fsp--;

             current =iv_ruleFontFaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontFaceDeclaration1775); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontFaceDeclaration"


    // $ANTLR start "ruleFontFaceDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:866:1: ruleFontFaceDeclaration returns [EObject current=null] : (otherlv_0= KEYWORD_68 ( (lv_body_1_0= ruleRuleSetBody ) ) ) ;
    public final EObject ruleFontFaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:869:28: ( (otherlv_0= KEYWORD_68 ( (lv_body_1_0= ruleRuleSetBody ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:870:1: (otherlv_0= KEYWORD_68 ( (lv_body_1_0= ruleRuleSetBody ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:870:1: (otherlv_0= KEYWORD_68 ( (lv_body_1_0= ruleRuleSetBody ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:871:2: otherlv_0= KEYWORD_68 ( (lv_body_1_0= ruleRuleSetBody ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleFontFaceDeclaration1813); 

                	newLeafNode(otherlv_0, grammarAccess.getFontFaceDeclarationAccess().getFontFaceKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:875:1: ( (lv_body_1_0= ruleRuleSetBody ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:876:1: (lv_body_1_0= ruleRuleSetBody )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:876:1: (lv_body_1_0= ruleRuleSetBody )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:877:3: lv_body_1_0= ruleRuleSetBody
            {
             
            	        newCompositeNode(grammarAccess.getFontFaceDeclarationAccess().getBodyRuleSetBodyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleSetBody_in_ruleFontFaceDeclaration1833);
            lv_body_1_0=ruleRuleSetBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFontFaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_1_0, 
                    		"RuleSetBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontFaceDeclaration"


    // $ANTLR start "entryRuleRuleSet"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:901:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:902:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:903:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet1868);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet1878); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:910:1: ruleRuleSet returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )* ( (lv_body_3_0= ruleRuleSetBody ) ) ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:913:28: ( ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )* ( (lv_body_3_0= ruleRuleSetBody ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:914:1: ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )* ( (lv_body_3_0= ruleRuleSetBody ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:914:1: ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )* ( (lv_body_3_0= ruleRuleSetBody ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:914:2: ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )* ( (lv_body_3_0= ruleRuleSetBody ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:914:2: ( (lv_selectors_0_0= ruleSelector ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:915:1: (lv_selectors_0_0= ruleSelector )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:915:1: (lv_selectors_0_0= ruleSelector )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:916:3: lv_selectors_0_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getRuleSetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleRuleSet1924);
            lv_selectors_0_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	        }
                   		add(
                   			current, 
                   			"selectors",
                    		lv_selectors_0_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:932:2: (otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==KEYWORD_6) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:933:2: otherlv_1= KEYWORD_6 ( (lv_selectors_2_0= ruleSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleRuleSet1938); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:937:1: ( (lv_selectors_2_0= ruleSelector ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:938:1: (lv_selectors_2_0= ruleSelector )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:938:1: (lv_selectors_2_0= ruleSelector )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:939:3: lv_selectors_2_0= ruleSelector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelector_in_ruleRuleSet1958);
            	    lv_selectors_2_0=ruleSelector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selectors",
            	            		lv_selectors_2_0, 
            	            		"Selector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:955:4: ( (lv_body_3_0= ruleRuleSetBody ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:956:1: (lv_body_3_0= ruleRuleSetBody )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:956:1: (lv_body_3_0= ruleRuleSetBody )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:957:3: lv_body_3_0= ruleRuleSetBody
            {
             
            	        newCompositeNode(grammarAccess.getRuleSetAccess().getBodyRuleSetBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleSetBody_in_ruleRuleSet1981);
            lv_body_3_0=ruleRuleSetBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"RuleSetBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleRuleSetBody"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:981:1: entryRuleRuleSetBody returns [EObject current=null] : iv_ruleRuleSetBody= ruleRuleSetBody EOF ;
    public final EObject entryRuleRuleSetBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSetBody = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:982:2: (iv_ruleRuleSetBody= ruleRuleSetBody EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:983:2: iv_ruleRuleSetBody= ruleRuleSetBody EOF
            {
             newCompositeNode(grammarAccess.getRuleSetBodyRule()); 
            pushFollow(FOLLOW_ruleRuleSetBody_in_entryRuleRuleSetBody2016);
            iv_ruleRuleSetBody=ruleRuleSetBody();

            state._fsp--;

             current =iv_ruleRuleSetBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSetBody2026); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSetBody"


    // $ANTLR start "ruleRuleSetBody"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:990:1: ruleRuleSetBody returns [EObject current=null] : ( () otherlv_1= KEYWORD_16 ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )? otherlv_6= KEYWORD_18 ) ;
    public final EObject ruleRuleSetBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:993:28: ( ( () otherlv_1= KEYWORD_16 ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )? otherlv_6= KEYWORD_18 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:994:1: ( () otherlv_1= KEYWORD_16 ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )? otherlv_6= KEYWORD_18 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:994:1: ( () otherlv_1= KEYWORD_16 ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )? otherlv_6= KEYWORD_18 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:994:2: () otherlv_1= KEYWORD_16 ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )? otherlv_6= KEYWORD_18
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:994:2: ()
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:995:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleSetBodyAccess().getRuleSetBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleRuleSetBody2073); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleSetBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1005:1: ( ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_70||LA23_0==KEYWORD_48||(LA23_0>=KEYWORD_50 && LA23_0<=KEYWORD_51)||LA23_0==RULE_IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1005:2: ( (lv_declarations_2_0= rulePropertyDeclaration ) ) (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )* (otherlv_5= KEYWORD_10 )?
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1005:2: ( (lv_declarations_2_0= rulePropertyDeclaration ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1006:1: (lv_declarations_2_0= rulePropertyDeclaration )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1006:1: (lv_declarations_2_0= rulePropertyDeclaration )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1007:3: lv_declarations_2_0= rulePropertyDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleSetBodyAccess().getDeclarationsPropertyDeclarationParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleSetBody2094);
                    lv_declarations_2_0=rulePropertyDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleSetBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"declarations",
                            		lv_declarations_2_0, 
                            		"PropertyDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1023:2: (otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==KEYWORD_10) ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1==KEYWORD_70||LA21_1==KEYWORD_48||(LA21_1>=KEYWORD_50 && LA21_1<=KEYWORD_51)||LA21_1==RULE_IDENT) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1024:2: otherlv_3= KEYWORD_10 ( (lv_declarations_4_0= rulePropertyDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleRuleSetBody2108); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getRuleSetBodyAccess().getSemicolonKeyword_2_1_0());
                    	        
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1028:1: ( (lv_declarations_4_0= rulePropertyDeclaration ) )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1029:1: (lv_declarations_4_0= rulePropertyDeclaration )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1029:1: (lv_declarations_4_0= rulePropertyDeclaration )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1030:3: lv_declarations_4_0= rulePropertyDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleSetBodyAccess().getDeclarationsPropertyDeclarationParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleSetBody2128);
                    	    lv_declarations_4_0=rulePropertyDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleSetBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declarations",
                    	            		lv_declarations_4_0, 
                    	            		"PropertyDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1046:4: (otherlv_5= KEYWORD_10 )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KEYWORD_10) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1047:2: otherlv_5= KEYWORD_10
                            {
                            otherlv_5=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleRuleSetBody2144); 

                                	newLeafNode(otherlv_5, grammarAccess.getRuleSetBodyAccess().getSemicolonKeyword_2_2());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleRuleSetBody2160); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleSetBodyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSetBody"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1064:1: entryRulePropertyDeclaration returns [EObject current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final EObject entryRulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1065:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1066:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration2194);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration2204); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1073:1: rulePropertyDeclaration returns [EObject current=null] : (this_KnownPropertyDeclaration_0= ruleKnownPropertyDeclaration | this_UnrecognizedPropertyDeclaration_1= ruleUnrecognizedPropertyDeclaration ) ;
    public final EObject rulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_KnownPropertyDeclaration_0 = null;

        EObject this_UnrecognizedPropertyDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1076:28: ( (this_KnownPropertyDeclaration_0= ruleKnownPropertyDeclaration | this_UnrecognizedPropertyDeclaration_1= ruleUnrecognizedPropertyDeclaration ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1077:1: (this_KnownPropertyDeclaration_0= ruleKnownPropertyDeclaration | this_UnrecognizedPropertyDeclaration_1= ruleUnrecognizedPropertyDeclaration )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1077:1: (this_KnownPropertyDeclaration_0= ruleKnownPropertyDeclaration | this_UnrecognizedPropertyDeclaration_1= ruleUnrecognizedPropertyDeclaration )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_70||LA24_0==KEYWORD_50) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_48||LA24_0==KEYWORD_51||LA24_0==RULE_IDENT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1078:5: this_KnownPropertyDeclaration_0= ruleKnownPropertyDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getKnownPropertyDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKnownPropertyDeclaration_in_rulePropertyDeclaration2251);
                    this_KnownPropertyDeclaration_0=ruleKnownPropertyDeclaration();

                    state._fsp--;


                            current = this_KnownPropertyDeclaration_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1088:5: this_UnrecognizedPropertyDeclaration_1= ruleUnrecognizedPropertyDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getUnrecognizedPropertyDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnrecognizedPropertyDeclaration_in_rulePropertyDeclaration2278);
                    this_UnrecognizedPropertyDeclaration_1=ruleUnrecognizedPropertyDeclaration();

                    state._fsp--;


                            current = this_UnrecognizedPropertyDeclaration_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleKnownPropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1104:1: entryRuleKnownPropertyDeclaration returns [EObject current=null] : iv_ruleKnownPropertyDeclaration= ruleKnownPropertyDeclaration EOF ;
    public final EObject entryRuleKnownPropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnownPropertyDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1105:2: (iv_ruleKnownPropertyDeclaration= ruleKnownPropertyDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1106:2: iv_ruleKnownPropertyDeclaration= ruleKnownPropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getKnownPropertyDeclarationRule()); 
            pushFollow(FOLLOW_ruleKnownPropertyDeclaration_in_entryRuleKnownPropertyDeclaration2312);
            iv_ruleKnownPropertyDeclaration=ruleKnownPropertyDeclaration();

            state._fsp--;

             current =iv_ruleKnownPropertyDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnownPropertyDeclaration2322); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnownPropertyDeclaration"


    // $ANTLR start "ruleKnownPropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1113:1: ruleKnownPropertyDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleKnownProperties ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) ) ;
    public final EObject ruleKnownPropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_valuesLists_2_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1116:28: ( ( ( (lv_name_0_0= ruleKnownProperties ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1117:1: ( ( (lv_name_0_0= ruleKnownProperties ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1117:1: ( ( (lv_name_0_0= ruleKnownProperties ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1117:2: ( (lv_name_0_0= ruleKnownProperties ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1117:2: ( (lv_name_0_0= ruleKnownProperties ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1118:1: (lv_name_0_0= ruleKnownProperties )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1118:1: (lv_name_0_0= ruleKnownProperties )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1119:3: lv_name_0_0= ruleKnownProperties
            {
             
            	        newCompositeNode(grammarAccess.getKnownPropertyDeclarationAccess().getNameKnownPropertiesEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleKnownProperties_in_ruleKnownPropertyDeclaration2368);
            lv_name_0_0=ruleKnownProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKnownPropertyDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"KnownProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleKnownPropertyDeclaration2381); 

                	newLeafNode(otherlv_1, grammarAccess.getKnownPropertyDeclarationAccess().getColonKeyword_1());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1140:1: ( (lv_valuesLists_2_0= rulePropertyValuesLists ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1141:1: (lv_valuesLists_2_0= rulePropertyValuesLists )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1141:1: (lv_valuesLists_2_0= rulePropertyValuesLists )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1142:3: lv_valuesLists_2_0= rulePropertyValuesLists
            {
             
            	        newCompositeNode(grammarAccess.getKnownPropertyDeclarationAccess().getValuesListsPropertyValuesListsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyValuesLists_in_ruleKnownPropertyDeclaration2401);
            lv_valuesLists_2_0=rulePropertyValuesLists();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKnownPropertyDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"valuesLists",
                    		lv_valuesLists_2_0, 
                    		"PropertyValuesLists");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnownPropertyDeclaration"


    // $ANTLR start "entryRuleUnrecognizedPropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1166:1: entryRuleUnrecognizedPropertyDeclaration returns [EObject current=null] : iv_ruleUnrecognizedPropertyDeclaration= ruleUnrecognizedPropertyDeclaration EOF ;
    public final EObject entryRuleUnrecognizedPropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnrecognizedPropertyDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1167:2: (iv_ruleUnrecognizedPropertyDeclaration= ruleUnrecognizedPropertyDeclaration EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1168:2: iv_ruleUnrecognizedPropertyDeclaration= ruleUnrecognizedPropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUnrecognizedPropertyDeclarationRule()); 
            pushFollow(FOLLOW_ruleUnrecognizedPropertyDeclaration_in_entryRuleUnrecognizedPropertyDeclaration2436);
            iv_ruleUnrecognizedPropertyDeclaration=ruleUnrecognizedPropertyDeclaration();

            state._fsp--;

             current =iv_ruleUnrecognizedPropertyDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnrecognizedPropertyDeclaration2446); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrecognizedPropertyDeclaration"


    // $ANTLR start "ruleUnrecognizedPropertyDeclaration"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1175:1: ruleUnrecognizedPropertyDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) ) ;
    public final EObject ruleUnrecognizedPropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_valuesLists_2_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1178:28: ( ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1179:1: ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1179:1: ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1179:2: ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= KEYWORD_9 ( (lv_valuesLists_2_0= rulePropertyValuesLists ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1179:2: ( (lv_name_0_0= rulePropertyName ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1180:1: (lv_name_0_0= rulePropertyName )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1180:1: (lv_name_0_0= rulePropertyName )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1181:3: lv_name_0_0= rulePropertyName
            {
             
            	        newCompositeNode(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getNamePropertyNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyName_in_ruleUnrecognizedPropertyDeclaration2492);
            lv_name_0_0=rulePropertyName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnrecognizedPropertyDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PropertyName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnrecognizedPropertyDeclaration2505); 

                	newLeafNode(otherlv_1, grammarAccess.getUnrecognizedPropertyDeclarationAccess().getColonKeyword_1());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1202:1: ( (lv_valuesLists_2_0= rulePropertyValuesLists ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1203:1: (lv_valuesLists_2_0= rulePropertyValuesLists )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1203:1: (lv_valuesLists_2_0= rulePropertyValuesLists )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1204:3: lv_valuesLists_2_0= rulePropertyValuesLists
            {
             
            	        newCompositeNode(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getValuesListsPropertyValuesListsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyValuesLists_in_ruleUnrecognizedPropertyDeclaration2525);
            lv_valuesLists_2_0=rulePropertyValuesLists();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnrecognizedPropertyDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"valuesLists",
                    		lv_valuesLists_2_0, 
                    		"PropertyValuesLists");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnrecognizedPropertyDeclaration"


    // $ANTLR start "entryRulePropertyName"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1228:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1229:1: (iv_rulePropertyName= rulePropertyName EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1230:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName2561);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName2572); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1237:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | kw= KEYWORD_51 | kw= KEYWORD_48 ) ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1241:6: ( (this_IDENT_0= RULE_IDENT | kw= KEYWORD_51 | kw= KEYWORD_48 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1242:1: (this_IDENT_0= RULE_IDENT | kw= KEYWORD_51 | kw= KEYWORD_48 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1242:1: (this_IDENT_0= RULE_IDENT | kw= KEYWORD_51 | kw= KEYWORD_48 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt25=1;
                }
                break;
            case KEYWORD_51:
                {
                alt25=2;
                }
                break;
            case KEYWORD_48:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1242:6: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyName2612); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getPropertyNameAccess().getIDENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1251:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rulePropertyName2636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getEmptyKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1258:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulePropertyName2655); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getAlphaKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRulePropertyValuesLists"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1271:1: entryRulePropertyValuesLists returns [EObject current=null] : iv_rulePropertyValuesLists= rulePropertyValuesLists EOF ;
    public final EObject entryRulePropertyValuesLists() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuesLists = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1272:2: (iv_rulePropertyValuesLists= rulePropertyValuesLists EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1273:2: iv_rulePropertyValuesLists= rulePropertyValuesLists EOF
            {
             newCompositeNode(grammarAccess.getPropertyValuesListsRule()); 
            pushFollow(FOLLOW_rulePropertyValuesLists_in_entryRulePropertyValuesLists2694);
            iv_rulePropertyValuesLists=rulePropertyValuesLists();

            state._fsp--;

             current =iv_rulePropertyValuesLists; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuesLists2704); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValuesLists"


    // $ANTLR start "rulePropertyValuesLists"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1280:1: rulePropertyValuesLists returns [EObject current=null] : ( ( (lv_lists_0_0= rulePropertyValuesList ) ) (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )* ) ;
    public final EObject rulePropertyValuesLists() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lists_0_0 = null;

        EObject lv_lists_2_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1283:28: ( ( ( (lv_lists_0_0= rulePropertyValuesList ) ) (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )* ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1284:1: ( ( (lv_lists_0_0= rulePropertyValuesList ) ) (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )* )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1284:1: ( ( (lv_lists_0_0= rulePropertyValuesList ) ) (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )* )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1284:2: ( (lv_lists_0_0= rulePropertyValuesList ) ) (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )*
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1284:2: ( (lv_lists_0_0= rulePropertyValuesList ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1285:1: (lv_lists_0_0= rulePropertyValuesList )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1285:1: (lv_lists_0_0= rulePropertyValuesList )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1286:3: lv_lists_0_0= rulePropertyValuesList
            {
             
            	        newCompositeNode(grammarAccess.getPropertyValuesListsAccess().getListsPropertyValuesListParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyValuesList_in_rulePropertyValuesLists2750);
            lv_lists_0_0=rulePropertyValuesList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyValuesListsRule());
            	        }
                   		add(
                   			current, 
                   			"lists",
                    		lv_lists_0_0, 
                    		"PropertyValuesList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1302:2: (otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_6) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1303:2: otherlv_1= KEYWORD_6 ( (lv_lists_2_0= rulePropertyValuesList ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyValuesLists2764); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPropertyValuesListsAccess().getCommaKeyword_1_0());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1307:1: ( (lv_lists_2_0= rulePropertyValuesList ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1308:1: (lv_lists_2_0= rulePropertyValuesList )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1308:1: (lv_lists_2_0= rulePropertyValuesList )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1309:3: lv_lists_2_0= rulePropertyValuesList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyValuesListsAccess().getListsPropertyValuesListParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyValuesList_in_rulePropertyValuesLists2784);
            	    lv_lists_2_0=rulePropertyValuesList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyValuesListsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lists",
            	            		lv_lists_2_0, 
            	            		"PropertyValuesList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValuesLists"


    // $ANTLR start "entryRulePropertyValuesList"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1333:1: entryRulePropertyValuesList returns [EObject current=null] : iv_rulePropertyValuesList= rulePropertyValuesList EOF ;
    public final EObject entryRulePropertyValuesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuesList = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1334:2: (iv_rulePropertyValuesList= rulePropertyValuesList EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1335:2: iv_rulePropertyValuesList= rulePropertyValuesList EOF
            {
             newCompositeNode(grammarAccess.getPropertyValuesListRule()); 
            pushFollow(FOLLOW_rulePropertyValuesList_in_entryRulePropertyValuesList2821);
            iv_rulePropertyValuesList=rulePropertyValuesList();

            state._fsp--;

             current =iv_rulePropertyValuesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuesList2831); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValuesList"


    // $ANTLR start "rulePropertyValuesList"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1342:1: rulePropertyValuesList returns [EObject current=null] : ( (lv_values_0_0= rulePropertyValue ) )+ ;
    public final EObject rulePropertyValuesList() throws RecognitionException {
        EObject current = null;

        EObject lv_values_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1345:28: ( ( (lv_values_0_0= rulePropertyValue ) )+ )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1346:1: ( (lv_values_0_0= rulePropertyValue ) )+
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1346:1: ( (lv_values_0_0= rulePropertyValue ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=KEYWORD_48 && LA27_0<=KEYWORD_49)||LA27_0==KEYWORD_54||LA27_0==KEYWORD_39||LA27_0==KEYWORD_44||LA27_0==KEYWORD_34||LA27_0==KEYWORD_37||LA27_0==RULE_HEX_COLOR||LA27_0==RULE_IDENT||LA27_0==RULE_URL||(LA27_0>=RULE_INT && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1347:1: (lv_values_0_0= rulePropertyValue )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1347:1: (lv_values_0_0= rulePropertyValue )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1348:3: lv_values_0_0= rulePropertyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyValuesListAccess().getValuesPropertyValueParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyValue_in_rulePropertyValuesList2876);
            	    lv_values_0_0=rulePropertyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyValuesListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_0_0, 
            	            		"PropertyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValuesList"


    // $ANTLR start "entryRulePropertyValue"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1372:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1376:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1377:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue2917);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue2927); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1387:1: rulePropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleValueLiteral ) ) ( (lv_important_1_0= KEYWORD_67 ) )? ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_important_1_0=null;
        EObject lv_value_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1391:28: ( ( ( (lv_value_0_0= ruleValueLiteral ) ) ( (lv_important_1_0= KEYWORD_67 ) )? ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1392:1: ( ( (lv_value_0_0= ruleValueLiteral ) ) ( (lv_important_1_0= KEYWORD_67 ) )? )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1392:1: ( ( (lv_value_0_0= ruleValueLiteral ) ) ( (lv_important_1_0= KEYWORD_67 ) )? )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1392:2: ( (lv_value_0_0= ruleValueLiteral ) ) ( (lv_important_1_0= KEYWORD_67 ) )?
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1392:2: ( (lv_value_0_0= ruleValueLiteral ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1393:1: (lv_value_0_0= ruleValueLiteral )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1393:1: (lv_value_0_0= ruleValueLiteral )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1394:3: lv_value_0_0= ruleValueLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPropertyValueAccess().getValueValueLiteralParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValueLiteral_in_rulePropertyValue2977);
            lv_value_0_0=ruleValueLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ValueLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1410:2: ( (lv_important_1_0= KEYWORD_67 ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_67) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1411:1: (lv_important_1_0= KEYWORD_67 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1411:1: (lv_important_1_0= KEYWORD_67 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1412:3: lv_important_1_0= KEYWORD_67
                    {
                    lv_important_1_0=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_rulePropertyValue2996); 

                            newLeafNode(lv_important_1_0, grammarAccess.getPropertyValueAccess().getImportantImportantKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyValueRule());
                    	        }
                           		setWithLastConsumed(current, "important", true, "!important");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1437:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1438:2: (iv_ruleSelector= ruleSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1439:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector3047);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector3057); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1446:1: ruleSelector returns [EObject current=null] : this_CombinatorExpression_0= ruleCombinatorExpression ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_CombinatorExpression_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1449:28: (this_CombinatorExpression_0= ruleCombinatorExpression )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1451:5: this_CombinatorExpression_0= ruleCombinatorExpression
            {
             
                    newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCombinatorExpression_in_ruleSelector3103);
            this_CombinatorExpression_0=ruleCombinatorExpression();

            state._fsp--;


                    current = this_CombinatorExpression_0;
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleCombinatorExpression"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1467:1: entryRuleCombinatorExpression returns [EObject current=null] : iv_ruleCombinatorExpression= ruleCombinatorExpression EOF ;
    public final EObject entryRuleCombinatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinatorExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1471:2: (iv_ruleCombinatorExpression= ruleCombinatorExpression EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1472:2: iv_ruleCombinatorExpression= ruleCombinatorExpression EOF
            {
             newCompositeNode(grammarAccess.getCombinatorExpressionRule()); 
            pushFollow(FOLLOW_ruleCombinatorExpression_in_entryRuleCombinatorExpression3142);
            iv_ruleCombinatorExpression=ruleCombinatorExpression();

            state._fsp--;

             current =iv_ruleCombinatorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCombinatorExpression3152); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCombinatorExpression"


    // $ANTLR start "ruleCombinatorExpression"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1482:1: ruleCombinatorExpression returns [EObject current=null] : (this_SimpleSelectorSequence_0= ruleSimpleSelectorSequence ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )* ) ;
    public final EObject ruleCombinatorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_wsI_2_0=null;
        Token lv_wsL_5_0=null;
        Token otherlv_6=null;
        Token lv_wsR_7_0=null;
        Token lv_wsL_10_0=null;
        Token otherlv_11=null;
        Token lv_wsR_12_0=null;
        Token lv_wsL_15_0=null;
        Token otherlv_16=null;
        Token lv_wsR_17_0=null;
        EObject this_SimpleSelectorSequence_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_right_13_0 = null;

        EObject lv_right_18_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1486:28: ( (this_SimpleSelectorSequence_0= ruleSimpleSelectorSequence ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )* ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1487:1: (this_SimpleSelectorSequence_0= ruleSimpleSelectorSequence ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )* )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1487:1: (this_SimpleSelectorSequence_0= ruleSimpleSelectorSequence ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )* )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1488:5: this_SimpleSelectorSequence_0= ruleSimpleSelectorSequence ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCombinatorExpressionAccess().getSimpleSelectorSequenceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3203);
            this_SimpleSelectorSequence_0=ruleSimpleSelectorSequence();

            state._fsp--;


                    current = this_SimpleSelectorSequence_0;
                    afterParserOrEnumRuleCall();
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1496:1: ( ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) ) | ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) ) )*
            loop35:
            do {
                int alt35=5;
                switch ( input.LA(1) ) {
                case RULE_WS:
                    {
                    switch ( input.LA(2) ) {
                    case KEYWORD_12:
                        {
                        alt35=2;
                        }
                        break;
                    case KEYWORD_4:
                    case KEYWORD_9:
                    case KEYWORD_13:
                    case KEYWORD_17:
                    case RULE_HEX_COLOR:
                    case RULE_IDENT:
                    case RULE_HASH_ID:
                    case RULE_DOT_ID:
                        {
                        alt35=1;
                        }
                        break;
                    case KEYWORD_5:
                        {
                        alt35=3;
                        }
                        break;
                    case KEYWORD_19:
                        {
                        alt35=4;
                        }
                        break;

                    }

                    }
                    break;
                case KEYWORD_12:
                    {
                    alt35=2;
                    }
                    break;
                case KEYWORD_5:
                    {
                    alt35=3;
                    }
                    break;
                case KEYWORD_19:
                    {
                    alt35=4;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1496:2: ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1496:2: ( () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1496:3: () ( (lv_wsI_2_0= RULE_WS ) ) ( (lv_right_3_0= ruleSimpleSelectorSequence ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1496:3: ()
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1497:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1502:2: ( (lv_wsI_2_0= RULE_WS ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1503:1: (lv_wsI_2_0= RULE_WS )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1503:1: (lv_wsI_2_0= RULE_WS )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1504:3: lv_wsI_2_0= RULE_WS
            	    {
            	    lv_wsI_2_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3230); 

            	    			newLeafNode(lv_wsI_2_0, grammarAccess.getCombinatorExpressionAccess().getWsIWSTerminalRuleCall_1_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"wsI",
            	            		lv_wsI_2_0, 
            	            		"WS");
            	    	    

            	    }


            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1520:2: ( (lv_right_3_0= ruleSimpleSelectorSequence ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1521:1: (lv_right_3_0= ruleSimpleSelectorSequence )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1521:1: (lv_right_3_0= ruleSimpleSelectorSequence )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1522:3: lv_right_3_0= ruleSimpleSelectorSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCombinatorExpressionAccess().getRightSimpleSelectorSequenceParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3256);
            	    lv_right_3_0=ruleSimpleSelectorSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCombinatorExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SimpleSelectorSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1539:6: ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1539:6: ( () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1539:7: () ( (lv_wsL_5_0= RULE_WS ) )? otherlv_6= KEYWORD_12 ( (lv_wsR_7_0= RULE_WS ) )? ( (lv_right_8_0= ruleSimpleSelectorSequence ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1539:7: ()
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1540:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0(),
            	                current);
            	        

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1545:2: ( (lv_wsL_5_0= RULE_WS ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_WS) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1546:1: (lv_wsL_5_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1546:1: (lv_wsL_5_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1547:3: lv_wsL_5_0= RULE_WS
            	            {
            	            lv_wsL_5_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3290); 

            	            			newLeafNode(lv_wsL_5_0, grammarAccess.getCombinatorExpressionAccess().getWsLWSTerminalRuleCall_1_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsL",
            	                    		lv_wsL_5_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleCombinatorExpression3309); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCombinatorExpressionAccess().getGreaterThanSignKeyword_1_1_2());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1568:1: ( (lv_wsR_7_0= RULE_WS ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==RULE_WS) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1569:1: (lv_wsR_7_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1569:1: (lv_wsR_7_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1570:3: lv_wsR_7_0= RULE_WS
            	            {
            	            lv_wsR_7_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3325); 

            	            			newLeafNode(lv_wsR_7_0, grammarAccess.getCombinatorExpressionAccess().getWsRWSTerminalRuleCall_1_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsR",
            	                    		lv_wsR_7_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1586:3: ( (lv_right_8_0= ruleSimpleSelectorSequence ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1587:1: (lv_right_8_0= ruleSimpleSelectorSequence )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1587:1: (lv_right_8_0= ruleSimpleSelectorSequence )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1588:3: lv_right_8_0= ruleSimpleSelectorSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCombinatorExpressionAccess().getRightSimpleSelectorSequenceParserRuleCall_1_1_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3352);
            	    lv_right_8_0=ruleSimpleSelectorSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCombinatorExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_8_0, 
            	            		"SimpleSelectorSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1605:6: ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1605:6: ( () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1605:7: () ( (lv_wsL_10_0= RULE_WS ) )? otherlv_11= KEYWORD_5 ( (lv_wsR_12_0= RULE_WS ) )? ( (lv_right_13_0= ruleSimpleSelectorSequence ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1605:7: ()
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1606:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0(),
            	                current);
            	        

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1611:2: ( (lv_wsL_10_0= RULE_WS ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_WS) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1612:1: (lv_wsL_10_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1612:1: (lv_wsL_10_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1613:3: lv_wsL_10_0= RULE_WS
            	            {
            	            lv_wsL_10_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3386); 

            	            			newLeafNode(lv_wsL_10_0, grammarAccess.getCombinatorExpressionAccess().getWsLWSTerminalRuleCall_1_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsL",
            	                    		lv_wsL_10_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleCombinatorExpression3405); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCombinatorExpressionAccess().getPlusSignKeyword_1_2_2());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1634:1: ( (lv_wsR_12_0= RULE_WS ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_WS) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1635:1: (lv_wsR_12_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1635:1: (lv_wsR_12_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1636:3: lv_wsR_12_0= RULE_WS
            	            {
            	            lv_wsR_12_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3421); 

            	            			newLeafNode(lv_wsR_12_0, grammarAccess.getCombinatorExpressionAccess().getWsRWSTerminalRuleCall_1_2_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsR",
            	                    		lv_wsR_12_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1652:3: ( (lv_right_13_0= ruleSimpleSelectorSequence ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1653:1: (lv_right_13_0= ruleSimpleSelectorSequence )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1653:1: (lv_right_13_0= ruleSimpleSelectorSequence )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1654:3: lv_right_13_0= ruleSimpleSelectorSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCombinatorExpressionAccess().getRightSimpleSelectorSequenceParserRuleCall_1_2_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3448);
            	    lv_right_13_0=ruleSimpleSelectorSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCombinatorExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_13_0, 
            	            		"SimpleSelectorSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1671:6: ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1671:6: ( () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1671:7: () ( (lv_wsL_15_0= RULE_WS ) )? otherlv_16= KEYWORD_19 ( (lv_wsR_17_0= RULE_WS ) )? ( (lv_right_18_0= ruleSimpleSelectorSequence ) )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1671:7: ()
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1672:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0(),
            	                current);
            	        

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1677:2: ( (lv_wsL_15_0= RULE_WS ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_WS) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1678:1: (lv_wsL_15_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1678:1: (lv_wsL_15_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1679:3: lv_wsL_15_0= RULE_WS
            	            {
            	            lv_wsL_15_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3482); 

            	            			newLeafNode(lv_wsL_15_0, grammarAccess.getCombinatorExpressionAccess().getWsLWSTerminalRuleCall_1_3_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsL",
            	                    		lv_wsL_15_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleCombinatorExpression3501); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCombinatorExpressionAccess().getTildeKeyword_1_3_2());
            	        
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1700:1: ( (lv_wsR_17_0= RULE_WS ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_WS) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1701:1: (lv_wsR_17_0= RULE_WS )
            	            {
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1701:1: (lv_wsR_17_0= RULE_WS )
            	            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1702:3: lv_wsR_17_0= RULE_WS
            	            {
            	            lv_wsR_17_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCombinatorExpression3517); 

            	            			newLeafNode(lv_wsR_17_0, grammarAccess.getCombinatorExpressionAccess().getWsRWSTerminalRuleCall_1_3_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCombinatorExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"wsR",
            	                    		lv_wsR_17_0, 
            	                    		"WS");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1718:3: ( (lv_right_18_0= ruleSimpleSelectorSequence ) )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1719:1: (lv_right_18_0= ruleSimpleSelectorSequence )
            	    {
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1719:1: (lv_right_18_0= ruleSimpleSelectorSequence )
            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1720:3: lv_right_18_0= ruleSimpleSelectorSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCombinatorExpressionAccess().getRightSimpleSelectorSequenceParserRuleCall_1_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3544);
            	    lv_right_18_0=ruleSimpleSelectorSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCombinatorExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_18_0, 
            	            		"SimpleSelectorSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCombinatorExpression"


    // $ANTLR start "entryRuleSimpleSelectorSequence"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1747:1: entryRuleSimpleSelectorSequence returns [EObject current=null] : iv_ruleSimpleSelectorSequence= ruleSimpleSelectorSequence EOF ;
    public final EObject entryRuleSimpleSelectorSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectorSequence = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1751:2: (iv_ruleSimpleSelectorSequence= ruleSimpleSelectorSequence EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1752:2: iv_ruleSimpleSelectorSequence= ruleSimpleSelectorSequence EOF
            {
             newCompositeNode(grammarAccess.getSimpleSelectorSequenceRule()); 
            pushFollow(FOLLOW_ruleSimpleSelectorSequence_in_entryRuleSimpleSelectorSequence3592);
            iv_ruleSimpleSelectorSequence=ruleSimpleSelectorSequence();

            state._fsp--;

             current =iv_ruleSimpleSelectorSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSelectorSequence3602); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelectorSequence"


    // $ANTLR start "ruleSimpleSelectorSequence"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1762:1: ruleSimpleSelectorSequence returns [EObject current=null] : ( () ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ ) ) ;
    public final EObject ruleSimpleSelectorSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_head_1_1 = null;

        EObject lv_head_1_2 = null;

        EObject lv_simpleSelectors_2_0 = null;

        EObject lv_simpleSelectors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1766:28: ( ( () ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1767:1: ( () ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1767:1: ( () ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1767:2: () ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1767:2: ()
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1768:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSelectorSequenceAccess().getSimpleSelectorSequenceAction_0(),
                        current);
                

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1773:2: ( ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* ) | ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+ )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_4||LA39_0==KEYWORD_17||LA39_0==RULE_IDENT) ) {
                alt39=1;
            }
            else if ( (LA39_0==KEYWORD_9||LA39_0==KEYWORD_13||LA39_0==RULE_HEX_COLOR||(LA39_0>=RULE_HASH_ID && LA39_0<=RULE_DOT_ID)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1773:3: ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1773:3: ( ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )* )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1773:4: ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) ) ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )*
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1773:4: ( ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1774:1: ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1774:1: ( (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1775:1: (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1775:1: (lv_head_1_1= ruleTypeSelector | lv_head_1_2= ruleUniversalSelector )
                    int alt36=2;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                        {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==KEYWORD_17) ) {
                            int LA36_4 = input.LA(3);

                            if ( (LA36_4==RULE_IDENT) ) {
                                alt36=1;
                            }
                            else if ( (LA36_4==KEYWORD_4) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA36_1==EOF||(LA36_1>=KEYWORD_5 && LA36_1<=KEYWORD_6)||LA36_1==KEYWORD_9||(LA36_1>=KEYWORD_12 && LA36_1<=KEYWORD_13)||LA36_1==KEYWORD_16||LA36_1==KEYWORD_19||LA36_1==RULE_HEX_COLOR||(LA36_1>=RULE_HASH_ID && LA36_1<=RULE_DOT_ID)||LA36_1==RULE_WS) ) {
                            alt36=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case KEYWORD_4:
                        {
                        int LA36_2 = input.LA(2);

                        if ( (LA36_2==KEYWORD_17) ) {
                            int LA36_4 = input.LA(3);

                            if ( (LA36_4==RULE_IDENT) ) {
                                alt36=1;
                            }
                            else if ( (LA36_4==KEYWORD_4) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA36_2==EOF||(LA36_2>=KEYWORD_5 && LA36_2<=KEYWORD_6)||LA36_2==KEYWORD_9||(LA36_2>=KEYWORD_12 && LA36_2<=KEYWORD_13)||LA36_2==KEYWORD_16||LA36_2==KEYWORD_19||LA36_2==RULE_HEX_COLOR||(LA36_2>=RULE_HASH_ID && LA36_2<=RULE_DOT_ID)||LA36_2==RULE_WS) ) {
                            alt36=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case KEYWORD_17:
                        {
                        int LA36_3 = input.LA(2);

                        if ( (LA36_3==KEYWORD_4) ) {
                            alt36=2;
                        }
                        else if ( (LA36_3==RULE_IDENT) ) {
                            alt36=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1776:3: lv_head_1_1= ruleTypeSelector
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimpleSelectorSequenceAccess().getHeadTypeSelectorParserRuleCall_1_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeSelector_in_ruleSimpleSelectorSequence3665);
                            lv_head_1_1=ruleTypeSelector();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSimpleSelectorSequenceRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"head",
                                    		lv_head_1_1, 
                                    		"TypeSelector");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1791:8: lv_head_1_2= ruleUniversalSelector
                            {
                             
                            	        newCompositeNode(grammarAccess.getSimpleSelectorSequenceAccess().getHeadUniversalSelectorParserRuleCall_1_0_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorSequence3684);
                            lv_head_1_2=ruleUniversalSelector();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSimpleSelectorSequenceRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"head",
                                    		lv_head_1_2, 
                                    		"UniversalSelector");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1809:2: ( (lv_simpleSelectors_2_0= ruleTailSimpleSelector ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==KEYWORD_9||LA37_0==KEYWORD_13||LA37_0==RULE_HEX_COLOR||(LA37_0>=RULE_HASH_ID && LA37_0<=RULE_DOT_ID)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1810:1: (lv_simpleSelectors_2_0= ruleTailSimpleSelector )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1810:1: (lv_simpleSelectors_2_0= ruleTailSimpleSelector )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1811:3: lv_simpleSelectors_2_0= ruleTailSimpleSelector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSelectorSequenceAccess().getSimpleSelectorsTailSimpleSelectorParserRuleCall_1_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTailSimpleSelector_in_ruleSimpleSelectorSequence3708);
                    	    lv_simpleSelectors_2_0=ruleTailSimpleSelector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleSelectorSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"simpleSelectors",
                    	            		lv_simpleSelectors_2_0, 
                    	            		"TailSimpleSelector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1828:6: ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1828:6: ( (lv_simpleSelectors_3_0= ruleTailSimpleSelector ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==KEYWORD_9||LA38_0==KEYWORD_13||LA38_0==RULE_HEX_COLOR||(LA38_0>=RULE_HASH_ID && LA38_0<=RULE_DOT_ID)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1829:1: (lv_simpleSelectors_3_0= ruleTailSimpleSelector )
                    	    {
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1829:1: (lv_simpleSelectors_3_0= ruleTailSimpleSelector )
                    	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1830:3: lv_simpleSelectors_3_0= ruleTailSimpleSelector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSelectorSequenceAccess().getSimpleSelectorsTailSimpleSelectorParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTailSimpleSelector_in_ruleSimpleSelectorSequence3737);
                    	    lv_simpleSelectors_3_0=ruleTailSimpleSelector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleSelectorSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"simpleSelectors",
                    	            		lv_simpleSelectors_3_0, 
                    	            		"TailSimpleSelector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSimpleSelectorSequence"


    // $ANTLR start "entryRuleTailSimpleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1857:1: entryRuleTailSimpleSelector returns [EObject current=null] : iv_ruleTailSimpleSelector= ruleTailSimpleSelector EOF ;
    public final EObject entryRuleTailSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTailSimpleSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1858:2: (iv_ruleTailSimpleSelector= ruleTailSimpleSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1859:2: iv_ruleTailSimpleSelector= ruleTailSimpleSelector EOF
            {
             newCompositeNode(grammarAccess.getTailSimpleSelectorRule()); 
            pushFollow(FOLLOW_ruleTailSimpleSelector_in_entryRuleTailSimpleSelector3778);
            iv_ruleTailSimpleSelector=ruleTailSimpleSelector();

            state._fsp--;

             current =iv_ruleTailSimpleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTailSimpleSelector3788); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTailSimpleSelector"


    // $ANTLR start "ruleTailSimpleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1866:1: ruleTailSimpleSelector returns [EObject current=null] : (this_IDSelector_0= ruleIDSelector | this_AttributeSelector_1= ruleAttributeSelector | this_ClassSelector_2= ruleClassSelector | this_PseudoSelector_3= rulePseudoSelector | this_NegationSelector_4= ruleNegationSelector ) ;
    public final EObject ruleTailSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IDSelector_0 = null;

        EObject this_AttributeSelector_1 = null;

        EObject this_ClassSelector_2 = null;

        EObject this_PseudoSelector_3 = null;

        EObject this_NegationSelector_4 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1869:28: ( (this_IDSelector_0= ruleIDSelector | this_AttributeSelector_1= ruleAttributeSelector | this_ClassSelector_2= ruleClassSelector | this_PseudoSelector_3= rulePseudoSelector | this_NegationSelector_4= ruleNegationSelector ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1870:1: (this_IDSelector_0= ruleIDSelector | this_AttributeSelector_1= ruleAttributeSelector | this_ClassSelector_2= ruleClassSelector | this_PseudoSelector_3= rulePseudoSelector | this_NegationSelector_4= ruleNegationSelector )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1870:1: (this_IDSelector_0= ruleIDSelector | this_AttributeSelector_1= ruleAttributeSelector | this_ClassSelector_2= ruleClassSelector | this_PseudoSelector_3= rulePseudoSelector | this_NegationSelector_4= ruleNegationSelector )
            int alt40=5;
            switch ( input.LA(1) ) {
            case RULE_HEX_COLOR:
            case RULE_HASH_ID:
                {
                alt40=1;
                }
                break;
            case KEYWORD_13:
                {
                alt40=2;
                }
                break;
            case RULE_DOT_ID:
                {
                alt40=3;
                }
                break;
            case KEYWORD_9:
                {
                int LA40_4 = input.LA(2);

                if ( ((LA40_4>=KEYWORD_82 && LA40_4<=KEYWORD_75)||(LA40_4>=KEYWORD_71 && LA40_4<=KEYWORD_66)||LA40_4==KEYWORD_65||(LA40_4>=KEYWORD_60 && LA40_4<=KEYWORD_61)||LA40_4==KEYWORD_63||(LA40_4>=KEYWORD_56 && LA40_4<=KEYWORD_58)||LA40_4==KEYWORD_47||(LA40_4>=KEYWORD_51 && LA40_4<=KEYWORD_53)||(LA40_4>=KEYWORD_40 && LA40_4<=KEYWORD_41)||LA40_4==KEYWORD_45||LA40_4==KEYWORD_9) ) {
                    alt40=4;
                }
                else if ( (LA40_4==KEYWORD_42) ) {
                    alt40=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1871:5: this_IDSelector_0= ruleIDSelector
                    {
                     
                            newCompositeNode(grammarAccess.getTailSimpleSelectorAccess().getIDSelectorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDSelector_in_ruleTailSimpleSelector3835);
                    this_IDSelector_0=ruleIDSelector();

                    state._fsp--;


                            current = this_IDSelector_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1881:5: this_AttributeSelector_1= ruleAttributeSelector
                    {
                     
                            newCompositeNode(grammarAccess.getTailSimpleSelectorAccess().getAttributeSelectorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleTailSimpleSelector3862);
                    this_AttributeSelector_1=ruleAttributeSelector();

                    state._fsp--;


                            current = this_AttributeSelector_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1891:5: this_ClassSelector_2= ruleClassSelector
                    {
                     
                            newCompositeNode(grammarAccess.getTailSimpleSelectorAccess().getClassSelectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleTailSimpleSelector3889);
                    this_ClassSelector_2=ruleClassSelector();

                    state._fsp--;


                            current = this_ClassSelector_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1901:5: this_PseudoSelector_3= rulePseudoSelector
                    {
                     
                            newCompositeNode(grammarAccess.getTailSimpleSelectorAccess().getPseudoSelectorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePseudoSelector_in_ruleTailSimpleSelector3916);
                    this_PseudoSelector_3=rulePseudoSelector();

                    state._fsp--;


                            current = this_PseudoSelector_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1911:5: this_NegationSelector_4= ruleNegationSelector
                    {
                     
                            newCompositeNode(grammarAccess.getTailSimpleSelectorAccess().getNegationSelectorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNegationSelector_in_ruleTailSimpleSelector3943);
                    this_NegationSelector_4=ruleNegationSelector();

                    state._fsp--;


                            current = this_NegationSelector_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTailSimpleSelector"


    // $ANTLR start "entryRuleTypeSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1929:1: entryRuleTypeSelector returns [EObject current=null] : iv_ruleTypeSelector= ruleTypeSelector EOF ;
    public final EObject entryRuleTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1930:2: (iv_ruleTypeSelector= ruleTypeSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1931:2: iv_ruleTypeSelector= ruleTypeSelector EOF
            {
             newCompositeNode(grammarAccess.getTypeSelectorRule()); 
            pushFollow(FOLLOW_ruleTypeSelector_in_entryRuleTypeSelector3979);
            iv_ruleTypeSelector=ruleTypeSelector();

            state._fsp--;

             current =iv_ruleTypeSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSelector3989); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSelector"


    // $ANTLR start "ruleTypeSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1938:1: ruleTypeSelector returns [EObject current=null] : ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_type_1_0= RULE_IDENT ) ) ) ;
    public final EObject ruleTypeSelector() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        EObject lv_namespacePrefix_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1941:28: ( ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_type_1_0= RULE_IDENT ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1942:1: ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_type_1_0= RULE_IDENT ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1942:1: ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_type_1_0= RULE_IDENT ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1942:2: ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_type_1_0= RULE_IDENT ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1942:2: ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_IDENT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==KEYWORD_17) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==KEYWORD_4||LA41_0==KEYWORD_17) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1943:1: (lv_namespacePrefix_0_0= ruleNamespacePrefix )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1943:1: (lv_namespacePrefix_0_0= ruleNamespacePrefix )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1944:3: lv_namespacePrefix_0_0= ruleNamespacePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeSelectorAccess().getNamespacePrefixNamespacePrefixParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespacePrefix_in_ruleTypeSelector4035);
                    lv_namespacePrefix_0_0=ruleNamespacePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"namespacePrefix",
                            		lv_namespacePrefix_0_0, 
                            		"NamespacePrefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1960:3: ( (lv_type_1_0= RULE_IDENT ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1961:1: (lv_type_1_0= RULE_IDENT )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1961:1: (lv_type_1_0= RULE_IDENT )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1962:3: lv_type_1_0= RULE_IDENT
            {
            lv_type_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypeSelector4053); 

            			newLeafNode(lv_type_1_0, grammarAccess.getTypeSelectorAccess().getTypeIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeSelectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"IDENT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSelector"


    // $ANTLR start "entryRuleNamespacePrefix"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1986:1: entryRuleNamespacePrefix returns [EObject current=null] : iv_ruleNamespacePrefix= ruleNamespacePrefix EOF ;
    public final EObject entryRuleNamespacePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespacePrefix = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1987:2: (iv_ruleNamespacePrefix= ruleNamespacePrefix EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1988:2: iv_ruleNamespacePrefix= ruleNamespacePrefix EOF
            {
             newCompositeNode(grammarAccess.getNamespacePrefixRule()); 
            pushFollow(FOLLOW_ruleNamespacePrefix_in_entryRuleNamespacePrefix4093);
            iv_ruleNamespacePrefix=ruleNamespacePrefix();

            state._fsp--;

             current =iv_ruleNamespacePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespacePrefix4103); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespacePrefix"


    // $ANTLR start "ruleNamespacePrefix"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1995:1: ruleNamespacePrefix returns [EObject current=null] : ( ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 ) | ( () otherlv_6= KEYWORD_17 ) ) ;
    public final EObject ruleNamespacePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1998:28: ( ( ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 ) | ( () otherlv_6= KEYWORD_17 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:1: ( ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 ) | ( () otherlv_6= KEYWORD_17 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:1: ( ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 ) | ( () otherlv_6= KEYWORD_17 ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_4||LA43_0==RULE_IDENT) ) {
                alt43=1;
            }
            else if ( (LA43_0==KEYWORD_17) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:2: ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:2: ( ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:3: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) ) otherlv_4= KEYWORD_17
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:3: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) | ( () otherlv_3= KEYWORD_4 ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_IDENT) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==KEYWORD_4) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:4: ( () ( (otherlv_1= RULE_IDENT ) ) )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:4: ( () ( (otherlv_1= RULE_IDENT ) ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:5: () ( (otherlv_1= RULE_IDENT ) )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:1999:5: ()
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2000:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getNamespacePrefixAccess().getNamespacePrefixAction_0_0_0_0(),
                                        current);
                                

                            }

                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2005:2: ( (otherlv_1= RULE_IDENT ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2006:1: (otherlv_1= RULE_IDENT )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2006:1: (otherlv_1= RULE_IDENT )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2007:3: otherlv_1= RULE_IDENT
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getNamespacePrefixRule());
                            	        }
                                    
                            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleNamespacePrefix4160); 

                            		newLeafNode(otherlv_1, grammarAccess.getNamespacePrefixAccess().getNamespaceNamespaceDeclarationCrossReference_0_0_0_1_0()); 
                            	

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2019:6: ( () otherlv_3= KEYWORD_4 )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2019:6: ( () otherlv_3= KEYWORD_4 )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2019:7: () otherlv_3= KEYWORD_4
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2019:7: ()
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2020:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getNamespacePrefixAccess().getUniversalNamespacePrefixAction_0_0_1_0(),
                                        current);
                                

                            }

                            otherlv_3=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleNamespacePrefix4190); 

                                	newLeafNode(otherlv_3, grammarAccess.getNamespacePrefixAccess().getAsteriskKeyword_0_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleNamespacePrefix4204); 

                        	newLeafNode(otherlv_4, grammarAccess.getNamespacePrefixAccess().getVerticalLineKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2036:6: ( () otherlv_6= KEYWORD_17 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2036:6: ( () otherlv_6= KEYWORD_17 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2036:7: () otherlv_6= KEYWORD_17
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2036:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2037:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNamespacePrefixAccess().getWithoutNamespacePrefixAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleNamespacePrefix4233); 

                        	newLeafNode(otherlv_6, grammarAccess.getNamespacePrefixAccess().getVerticalLineKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespacePrefix"


    // $ANTLR start "entryRuleUniversalSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2055:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2056:2: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2057:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
             newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector4268);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;

             current =iv_ruleUniversalSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector4278); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2064:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )? otherlv_2= KEYWORD_4 ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_namespacePrefix_1_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2067:28: ( ( () ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )? otherlv_2= KEYWORD_4 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2068:1: ( () ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )? otherlv_2= KEYWORD_4 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2068:1: ( () ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )? otherlv_2= KEYWORD_4 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2068:2: () ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )? otherlv_2= KEYWORD_4
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2068:2: ()
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2069:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
                        current);
                

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2074:2: ( (lv_namespacePrefix_1_0= ruleNamespacePrefix ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_17||LA44_0==RULE_IDENT) ) {
                alt44=1;
            }
            else if ( (LA44_0==KEYWORD_4) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==KEYWORD_17) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2075:1: (lv_namespacePrefix_1_0= ruleNamespacePrefix )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2075:1: (lv_namespacePrefix_1_0= ruleNamespacePrefix )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2076:3: lv_namespacePrefix_1_0= ruleNamespacePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespacePrefixNamespacePrefixParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespacePrefix_in_ruleUniversalSelector4333);
                    lv_namespacePrefix_1_0=ruleNamespacePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUniversalSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"namespacePrefix",
                            		lv_namespacePrefix_1_0, 
                            		"NamespacePrefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUniversalSelector4347); 

                	newLeafNode(otherlv_2, grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2105:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2109:2: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2110:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
             newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector4387);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;

             current =iv_ruleAttributeSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector4397); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2120:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= KEYWORD_13 ( (lv_attribute_1_0= ruleAttribute ) ) ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )? otherlv_4= KEYWORD_14 ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_attribute_1_0 = null;

        Enumerator lv_matcher_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2124:28: ( (otherlv_0= KEYWORD_13 ( (lv_attribute_1_0= ruleAttribute ) ) ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )? otherlv_4= KEYWORD_14 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2125:1: (otherlv_0= KEYWORD_13 ( (lv_attribute_1_0= ruleAttribute ) ) ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )? otherlv_4= KEYWORD_14 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2125:1: (otherlv_0= KEYWORD_13 ( (lv_attribute_1_0= ruleAttribute ) ) ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )? otherlv_4= KEYWORD_14 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2126:2: otherlv_0= KEYWORD_13 ( (lv_attribute_1_0= ruleAttribute ) ) ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )? otherlv_4= KEYWORD_14
            {
            otherlv_0=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAttributeSelector4439); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2130:1: ( (lv_attribute_1_0= ruleAttribute ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2131:1: (lv_attribute_1_0= ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2131:1: (lv_attribute_1_0= ruleAttribute )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2132:3: lv_attribute_1_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getAttributeAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeSelector4459);
            lv_attribute_1_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_1_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2148:2: ( ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=KEYWORD_20 && LA45_0<=KEYWORD_22)||(LA45_0>=KEYWORD_31 && LA45_0<=KEYWORD_32)||LA45_0==KEYWORD_11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2148:3: ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) ) ( (lv_value_3_0= ruleAttributeValueLiteral ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2148:3: ( (lv_matcher_2_0= ruleAttributeSelectorMatchers ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2149:1: (lv_matcher_2_0= ruleAttributeSelectorMatchers )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2149:1: (lv_matcher_2_0= ruleAttributeSelectorMatchers )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2150:3: lv_matcher_2_0= ruleAttributeSelectorMatchers
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getMatcherAttributeSelectorMatchersEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeSelectorMatchers_in_ruleAttributeSelector4481);
                    lv_matcher_2_0=ruleAttributeSelectorMatchers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"matcher",
                            		lv_matcher_2_0, 
                            		"AttributeSelectorMatchers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2166:2: ( (lv_value_3_0= ruleAttributeValueLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2167:1: (lv_value_3_0= ruleAttributeValueLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2167:1: (lv_value_3_0= ruleAttributeValueLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2168:3: lv_value_3_0= ruleAttributeValueLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getValueAttributeValueLiteralParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueLiteral_in_ruleAttributeSelector4502);
                    lv_value_3_0=ruleAttributeValueLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"AttributeValueLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAttributeSelector4517); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleAttribute"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2200:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2204:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2205:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4561);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4571); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2215:1: ruleAttribute returns [EObject current=null] : ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_name_1_0= RULE_IDENT ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_namespacePrefix_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2219:28: ( ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_name_1_0= RULE_IDENT ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2220:1: ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_name_1_0= RULE_IDENT ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2220:1: ( ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_name_1_0= RULE_IDENT ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2220:2: ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )? ( (lv_name_1_0= RULE_IDENT ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2220:2: ( (lv_namespacePrefix_0_0= ruleNamespacePrefix ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_IDENT) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==KEYWORD_17) ) {
                    alt46=1;
                }
            }
            else if ( (LA46_0==KEYWORD_4||LA46_0==KEYWORD_17) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2221:1: (lv_namespacePrefix_0_0= ruleNamespacePrefix )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2221:1: (lv_namespacePrefix_0_0= ruleNamespacePrefix )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2222:3: lv_namespacePrefix_0_0= ruleNamespacePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getNamespacePrefixNamespacePrefixParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespacePrefix_in_ruleAttribute4621);
                    lv_namespacePrefix_0_0=ruleNamespacePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"namespacePrefix",
                            		lv_namespacePrefix_0_0, 
                            		"NamespacePrefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2238:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2239:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2239:1: (lv_name_1_0= RULE_IDENT )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2240:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAttribute4639); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"IDENT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValueLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2267:1: entryRuleAttributeValueLiteral returns [EObject current=null] : iv_ruleAttributeValueLiteral= ruleAttributeValueLiteral EOF ;
    public final EObject entryRuleAttributeValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2268:2: (iv_ruleAttributeValueLiteral= ruleAttributeValueLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2269:2: iv_ruleAttributeValueLiteral= ruleAttributeValueLiteral EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueLiteralRule()); 
            pushFollow(FOLLOW_ruleAttributeValueLiteral_in_entryRuleAttributeValueLiteral4683);
            iv_ruleAttributeValueLiteral=ruleAttributeValueLiteral();

            state._fsp--;

             current =iv_ruleAttributeValueLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueLiteral4693); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValueLiteral"


    // $ANTLR start "ruleAttributeValueLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2276:1: ruleAttributeValueLiteral returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DECIMAL ) ) ) ) ;
    public final EObject ruleAttributeValueLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2279:28: ( ( ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DECIMAL ) ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:1: ( ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DECIMAL ) ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:1: ( ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DECIMAL ) ) ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case RULE_INT:
                {
                alt48=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:2: ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:2: ( () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:3: () ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2280:3: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2281:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueLiteralAccess().getStringAttributeValueLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2286:2: ( ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2287:1: ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2287:1: ( (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2288:1: (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2288:1: (lv_value_1_1= RULE_IDENT | lv_value_1_2= RULE_STRING )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_IDENT) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_STRING) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2289:3: lv_value_1_1= RULE_IDENT
                            {
                            lv_value_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAttributeValueLiteral4747); 

                            			newLeafNode(lv_value_1_1, grammarAccess.getAttributeValueLiteralAccess().getValueIDENTTerminalRuleCall_0_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeValueLiteralRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_1, 
                                    		"IDENT");
                            	    

                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2304:8: lv_value_1_2= RULE_STRING
                            {
                            lv_value_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeValueLiteral4767); 

                            			newLeafNode(lv_value_1_2, grammarAccess.getAttributeValueLiteralAccess().getValueSTRINGTerminalRuleCall_0_1_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeValueLiteralRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_2, 
                                    		"STRING");
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2323:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2323:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2323:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2323:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2324:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueLiteralAccess().getIntegerAttributeValueLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2329:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2330:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2330:1: (lv_value_3_0= RULE_INT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2331:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeValueLiteral4809); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAttributeValueLiteralAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeValueLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2348:6: ( () ( (lv_value_5_0= RULE_DECIMAL ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2348:6: ( () ( (lv_value_5_0= RULE_DECIMAL ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2348:7: () ( (lv_value_5_0= RULE_DECIMAL ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2348:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2349:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueLiteralAccess().getDecimalAttributeValueLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2354:2: ( (lv_value_5_0= RULE_DECIMAL ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2355:1: (lv_value_5_0= RULE_DECIMAL )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2355:1: (lv_value_5_0= RULE_DECIMAL )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2356:3: lv_value_5_0= RULE_DECIMAL
                    {
                    lv_value_5_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleAttributeValueLiteral4848); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getAttributeValueLiteralAccess().getValueDECIMALTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeValueLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"DECIMAL");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValueLiteral"


    // $ANTLR start "entryRuleIDSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2380:1: entryRuleIDSelector returns [EObject current=null] : iv_ruleIDSelector= ruleIDSelector EOF ;
    public final EObject entryRuleIDSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2381:2: (iv_ruleIDSelector= ruleIDSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2382:2: iv_ruleIDSelector= ruleIDSelector EOF
            {
             newCompositeNode(grammarAccess.getIDSelectorRule()); 
            pushFollow(FOLLOW_ruleIDSelector_in_entryRuleIDSelector4889);
            iv_ruleIDSelector=ruleIDSelector();

            state._fsp--;

             current =iv_ruleIDSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDSelector4899); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDSelector"


    // $ANTLR start "ruleIDSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2389:1: ruleIDSelector returns [EObject current=null] : ( ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) ) ) ;
    public final EObject ruleIDSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2392:28: ( ( ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2393:1: ( ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2393:1: ( ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2394:1: ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2394:1: ( (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2395:1: (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2395:1: (lv_name_0_1= RULE_HASH_ID | lv_name_0_2= RULE_HEX_COLOR )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_HASH_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_HEX_COLOR) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2396:3: lv_name_0_1= RULE_HASH_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_HASH_ID,FOLLOW_RULE_HASH_ID_in_ruleIDSelector4942); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getIDSelectorAccess().getNameHASH_IDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIDSelectorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"HASH_ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2411:8: lv_name_0_2= RULE_HEX_COLOR
                    {
                    lv_name_0_2=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleIDSelector4962); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getIDSelectorAccess().getNameHEX_COLORTerminalRuleCall_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIDSelectorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"HEX_COLOR");
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDSelector"


    // $ANTLR start "entryRuleClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2437:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2438:2: (iv_ruleClassSelector= ruleClassSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2439:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
             newCompositeNode(grammarAccess.getClassSelectorRule()); 
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector5004);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;

             current =iv_ruleClassSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector5014); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2446:1: ruleClassSelector returns [EObject current=null] : ( (lv_name_0_0= RULE_DOT_ID ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2449:28: ( ( (lv_name_0_0= RULE_DOT_ID ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2450:1: ( (lv_name_0_0= RULE_DOT_ID ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2450:1: ( (lv_name_0_0= RULE_DOT_ID ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2451:1: (lv_name_0_0= RULE_DOT_ID )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2451:1: (lv_name_0_0= RULE_DOT_ID )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2452:3: lv_name_0_0= RULE_DOT_ID
            {
            lv_name_0_0=(Token)match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_ruleClassSelector5055); 

            			newLeafNode(lv_name_0_0, grammarAccess.getClassSelectorAccess().getNameDOT_IDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassSelectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"DOT_ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRulePseudoSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2476:1: entryRulePseudoSelector returns [EObject current=null] : iv_rulePseudoSelector= rulePseudoSelector EOF ;
    public final EObject entryRulePseudoSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2477:2: (iv_rulePseudoSelector= rulePseudoSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2478:2: iv_rulePseudoSelector= rulePseudoSelector EOF
            {
             newCompositeNode(grammarAccess.getPseudoSelectorRule()); 
            pushFollow(FOLLOW_rulePseudoSelector_in_entryRulePseudoSelector5094);
            iv_rulePseudoSelector=rulePseudoSelector();

            state._fsp--;

             current =iv_rulePseudoSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoSelector5104); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoSelector"


    // $ANTLR start "rulePseudoSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2485:1: rulePseudoSelector returns [EObject current=null] : (this_NoArgsPseudoClassSelector_0= ruleNoArgsPseudoClassSelector | this_PseudoElementSelector_1= rulePseudoElementSelector | this_LanguagePseudoClassSelector_2= ruleLanguagePseudoClassSelector | this_FunctionalPseudoClassSelector_3= ruleFunctionalPseudoClassSelector ) ;
    public final EObject rulePseudoSelector() throws RecognitionException {
        EObject current = null;

        EObject this_NoArgsPseudoClassSelector_0 = null;

        EObject this_PseudoElementSelector_1 = null;

        EObject this_LanguagePseudoClassSelector_2 = null;

        EObject this_FunctionalPseudoClassSelector_3 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2488:28: ( (this_NoArgsPseudoClassSelector_0= ruleNoArgsPseudoClassSelector | this_PseudoElementSelector_1= rulePseudoElementSelector | this_LanguagePseudoClassSelector_2= ruleLanguagePseudoClassSelector | this_FunctionalPseudoClassSelector_3= ruleFunctionalPseudoClassSelector ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2489:1: (this_NoArgsPseudoClassSelector_0= ruleNoArgsPseudoClassSelector | this_PseudoElementSelector_1= rulePseudoElementSelector | this_LanguagePseudoClassSelector_2= ruleLanguagePseudoClassSelector | this_FunctionalPseudoClassSelector_3= ruleFunctionalPseudoClassSelector )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2489:1: (this_NoArgsPseudoClassSelector_0= ruleNoArgsPseudoClassSelector | this_PseudoElementSelector_1= rulePseudoElementSelector | this_LanguagePseudoClassSelector_2= ruleLanguagePseudoClassSelector | this_FunctionalPseudoClassSelector_3= ruleFunctionalPseudoClassSelector )
            int alt50=4;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_9) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_40:
                    {
                    alt50=3;
                    }
                    break;
                case KEYWORD_76:
                case KEYWORD_71:
                case KEYWORD_57:
                case KEYWORD_47:
                case KEYWORD_9:
                    {
                    alt50=2;
                    }
                    break;
                case KEYWORD_82:
                case KEYWORD_81:
                case KEYWORD_79:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_75:
                case KEYWORD_66:
                    {
                    alt50=4;
                    }
                    break;
                case KEYWORD_80:
                case KEYWORD_74:
                case KEYWORD_72:
                case KEYWORD_73:
                case KEYWORD_65:
                case KEYWORD_60:
                case KEYWORD_61:
                case KEYWORD_63:
                case KEYWORD_56:
                case KEYWORD_58:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_53:
                case KEYWORD_41:
                case KEYWORD_45:
                    {
                    alt50=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2490:5: this_NoArgsPseudoClassSelector_0= ruleNoArgsPseudoClassSelector
                    {
                     
                            newCompositeNode(grammarAccess.getPseudoSelectorAccess().getNoArgsPseudoClassSelectorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNoArgsPseudoClassSelector_in_rulePseudoSelector5151);
                    this_NoArgsPseudoClassSelector_0=ruleNoArgsPseudoClassSelector();

                    state._fsp--;


                            current = this_NoArgsPseudoClassSelector_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2500:5: this_PseudoElementSelector_1= rulePseudoElementSelector
                    {
                     
                            newCompositeNode(grammarAccess.getPseudoSelectorAccess().getPseudoElementSelectorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePseudoElementSelector_in_rulePseudoSelector5178);
                    this_PseudoElementSelector_1=rulePseudoElementSelector();

                    state._fsp--;


                            current = this_PseudoElementSelector_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2510:5: this_LanguagePseudoClassSelector_2= ruleLanguagePseudoClassSelector
                    {
                     
                            newCompositeNode(grammarAccess.getPseudoSelectorAccess().getLanguagePseudoClassSelectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLanguagePseudoClassSelector_in_rulePseudoSelector5205);
                    this_LanguagePseudoClassSelector_2=ruleLanguagePseudoClassSelector();

                    state._fsp--;


                            current = this_LanguagePseudoClassSelector_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2520:5: this_FunctionalPseudoClassSelector_3= ruleFunctionalPseudoClassSelector
                    {
                     
                            newCompositeNode(grammarAccess.getPseudoSelectorAccess().getFunctionalPseudoClassSelectorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFunctionalPseudoClassSelector_in_rulePseudoSelector5232);
                    this_FunctionalPseudoClassSelector_3=ruleFunctionalPseudoClassSelector();

                    state._fsp--;


                            current = this_FunctionalPseudoClassSelector_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoSelector"


    // $ANTLR start "entryRuleNoArgsPseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2536:1: entryRuleNoArgsPseudoClassSelector returns [EObject current=null] : iv_ruleNoArgsPseudoClassSelector= ruleNoArgsPseudoClassSelector EOF ;
    public final EObject entryRuleNoArgsPseudoClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoArgsPseudoClassSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2540:2: (iv_ruleNoArgsPseudoClassSelector= ruleNoArgsPseudoClassSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2541:2: iv_ruleNoArgsPseudoClassSelector= ruleNoArgsPseudoClassSelector EOF
            {
             newCompositeNode(grammarAccess.getNoArgsPseudoClassSelectorRule()); 
            pushFollow(FOLLOW_ruleNoArgsPseudoClassSelector_in_entryRuleNoArgsPseudoClassSelector5272);
            iv_ruleNoArgsPseudoClassSelector=ruleNoArgsPseudoClassSelector();

            state._fsp--;

             current =iv_ruleNoArgsPseudoClassSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoArgsPseudoClassSelector5282); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNoArgsPseudoClassSelector"


    // $ANTLR start "ruleNoArgsPseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2551:1: ruleNoArgsPseudoClassSelector returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleNoArgsPseudos ) ) ) ;
    public final EObject ruleNoArgsPseudoClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_pseudo_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2555:28: ( (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleNoArgsPseudos ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2556:1: (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleNoArgsPseudos ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2556:1: (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleNoArgsPseudos ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2557:2: otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleNoArgsPseudos ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNoArgsPseudoClassSelector5324); 

                	newLeafNode(otherlv_0, grammarAccess.getNoArgsPseudoClassSelectorAccess().getColonKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2561:1: ( (lv_pseudo_1_0= ruleNoArgsPseudos ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2562:1: (lv_pseudo_1_0= ruleNoArgsPseudos )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2562:1: (lv_pseudo_1_0= ruleNoArgsPseudos )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2563:3: lv_pseudo_1_0= ruleNoArgsPseudos
            {
             
            	        newCompositeNode(grammarAccess.getNoArgsPseudoClassSelectorAccess().getPseudoNoArgsPseudosEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNoArgsPseudos_in_ruleNoArgsPseudoClassSelector5344);
            lv_pseudo_1_0=ruleNoArgsPseudos();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNoArgsPseudoClassSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"pseudo",
                    		lv_pseudo_1_0, 
                    		"NoArgsPseudos");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNoArgsPseudoClassSelector"


    // $ANTLR start "entryRulePseudoElementSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2590:1: entryRulePseudoElementSelector returns [EObject current=null] : iv_rulePseudoElementSelector= rulePseudoElementSelector EOF ;
    public final EObject entryRulePseudoElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoElementSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2594:2: (iv_rulePseudoElementSelector= rulePseudoElementSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2595:2: iv_rulePseudoElementSelector= rulePseudoElementSelector EOF
            {
             newCompositeNode(grammarAccess.getPseudoElementSelectorRule()); 
            pushFollow(FOLLOW_rulePseudoElementSelector_in_entryRulePseudoElementSelector5389);
            iv_rulePseudoElementSelector=rulePseudoElementSelector();

            state._fsp--;

             current =iv_rulePseudoElementSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoElementSelector5399); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePseudoElementSelector"


    // $ANTLR start "rulePseudoElementSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2605:1: rulePseudoElementSelector returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )? ( (lv_pseudo_2_0= rulePseudoElements ) ) ) ;
    public final EObject rulePseudoElementSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_doubleSemiColon_1_0=null;
        Enumerator lv_pseudo_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2609:28: ( (otherlv_0= KEYWORD_9 ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )? ( (lv_pseudo_2_0= rulePseudoElements ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2610:1: (otherlv_0= KEYWORD_9 ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )? ( (lv_pseudo_2_0= rulePseudoElements ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2610:1: (otherlv_0= KEYWORD_9 ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )? ( (lv_pseudo_2_0= rulePseudoElements ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2611:2: otherlv_0= KEYWORD_9 ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )? ( (lv_pseudo_2_0= rulePseudoElements ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePseudoElementSelector5441); 

                	newLeafNode(otherlv_0, grammarAccess.getPseudoElementSelectorAccess().getColonKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2615:1: ( (lv_doubleSemiColon_1_0= KEYWORD_9 ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_9) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2616:1: (lv_doubleSemiColon_1_0= KEYWORD_9 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2616:1: (lv_doubleSemiColon_1_0= KEYWORD_9 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2617:3: lv_doubleSemiColon_1_0= KEYWORD_9
                    {
                    lv_doubleSemiColon_1_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePseudoElementSelector5459); 

                            newLeafNode(lv_doubleSemiColon_1_0, grammarAccess.getPseudoElementSelectorAccess().getDoubleSemiColonColonKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPseudoElementSelectorRule());
                    	        }
                           		setWithLastConsumed(current, "doubleSemiColon", true, ":");
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2631:3: ( (lv_pseudo_2_0= rulePseudoElements ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2632:1: (lv_pseudo_2_0= rulePseudoElements )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2632:1: (lv_pseudo_2_0= rulePseudoElements )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2633:3: lv_pseudo_2_0= rulePseudoElements
            {
             
            	        newCompositeNode(grammarAccess.getPseudoElementSelectorAccess().getPseudoPseudoElementsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePseudoElements_in_rulePseudoElementSelector5492);
            lv_pseudo_2_0=rulePseudoElements();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPseudoElementSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"pseudo",
                    		lv_pseudo_2_0, 
                    		"PseudoElements");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePseudoElementSelector"


    // $ANTLR start "entryRuleLanguagePseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2660:1: entryRuleLanguagePseudoClassSelector returns [EObject current=null] : iv_ruleLanguagePseudoClassSelector= ruleLanguagePseudoClassSelector EOF ;
    public final EObject entryRuleLanguagePseudoClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguagePseudoClassSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2664:2: (iv_ruleLanguagePseudoClassSelector= ruleLanguagePseudoClassSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2665:2: iv_ruleLanguagePseudoClassSelector= ruleLanguagePseudoClassSelector EOF
            {
             newCompositeNode(grammarAccess.getLanguagePseudoClassSelectorRule()); 
            pushFollow(FOLLOW_ruleLanguagePseudoClassSelector_in_entryRuleLanguagePseudoClassSelector5537);
            iv_ruleLanguagePseudoClassSelector=ruleLanguagePseudoClassSelector();

            state._fsp--;

             current =iv_ruleLanguagePseudoClassSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguagePseudoClassSelector5547); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLanguagePseudoClassSelector"


    // $ANTLR start "ruleLanguagePseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2675:1: ruleLanguagePseudoClassSelector returns [EObject current=null] : (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_40 otherlv_2= KEYWORD_2 ( (lv_langugageId_3_0= RULE_IDENT ) ) otherlv_4= KEYWORD_3 ) ;
    public final EObject ruleLanguagePseudoClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_langugageId_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2679:28: ( (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_40 otherlv_2= KEYWORD_2 ( (lv_langugageId_3_0= RULE_IDENT ) ) otherlv_4= KEYWORD_3 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2680:1: (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_40 otherlv_2= KEYWORD_2 ( (lv_langugageId_3_0= RULE_IDENT ) ) otherlv_4= KEYWORD_3 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2680:1: (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_40 otherlv_2= KEYWORD_2 ( (lv_langugageId_3_0= RULE_IDENT ) ) otherlv_4= KEYWORD_3 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2681:2: otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_40 otherlv_2= KEYWORD_2 ( (lv_langugageId_3_0= RULE_IDENT ) ) otherlv_4= KEYWORD_3
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleLanguagePseudoClassSelector5589); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguagePseudoClassSelectorAccess().getColonKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleLanguagePseudoClassSelector5601); 

                	newLeafNode(otherlv_1, grammarAccess.getLanguagePseudoClassSelectorAccess().getLangKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleLanguagePseudoClassSelector5613); 

                	newLeafNode(otherlv_2, grammarAccess.getLanguagePseudoClassSelectorAccess().getLeftParenthesisKeyword_2());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2695:1: ( (lv_langugageId_3_0= RULE_IDENT ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2696:1: (lv_langugageId_3_0= RULE_IDENT )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2696:1: (lv_langugageId_3_0= RULE_IDENT )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2697:3: lv_langugageId_3_0= RULE_IDENT
            {
            lv_langugageId_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleLanguagePseudoClassSelector5629); 

            			newLeafNode(lv_langugageId_3_0, grammarAccess.getLanguagePseudoClassSelectorAccess().getLangugageIdIDENTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguagePseudoClassSelectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"langugageId",
                    		lv_langugageId_3_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleLanguagePseudoClassSelector5647); 

                	newLeafNode(otherlv_4, grammarAccess.getLanguagePseudoClassSelectorAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLanguagePseudoClassSelector"


    // $ANTLR start "entryRuleFunctionalPseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2729:1: entryRuleFunctionalPseudoClassSelector returns [EObject current=null] : iv_ruleFunctionalPseudoClassSelector= ruleFunctionalPseudoClassSelector EOF ;
    public final EObject entryRuleFunctionalPseudoClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalPseudoClassSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2733:2: (iv_ruleFunctionalPseudoClassSelector= ruleFunctionalPseudoClassSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2734:2: iv_ruleFunctionalPseudoClassSelector= ruleFunctionalPseudoClassSelector EOF
            {
             newCompositeNode(grammarAccess.getFunctionalPseudoClassSelectorRule()); 
            pushFollow(FOLLOW_ruleFunctionalPseudoClassSelector_in_entryRuleFunctionalPseudoClassSelector5691);
            iv_ruleFunctionalPseudoClassSelector=ruleFunctionalPseudoClassSelector();

            state._fsp--;

             current =iv_ruleFunctionalPseudoClassSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalPseudoClassSelector5701); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalPseudoClassSelector"


    // $ANTLR start "ruleFunctionalPseudoClassSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2744:1: ruleFunctionalPseudoClassSelector returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) ) otherlv_2= KEYWORD_2 ( (lv_argument_3_0= ruleTypeArgument ) ) otherlv_4= KEYWORD_3 ) ;
    public final EObject ruleFunctionalPseudoClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_pseudo_1_0 = null;

        EObject lv_argument_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2748:28: ( (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) ) otherlv_2= KEYWORD_2 ( (lv_argument_3_0= ruleTypeArgument ) ) otherlv_4= KEYWORD_3 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2749:1: (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) ) otherlv_2= KEYWORD_2 ( (lv_argument_3_0= ruleTypeArgument ) ) otherlv_4= KEYWORD_3 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2749:1: (otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) ) otherlv_2= KEYWORD_2 ( (lv_argument_3_0= ruleTypeArgument ) ) otherlv_4= KEYWORD_3 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2750:2: otherlv_0= KEYWORD_9 ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) ) otherlv_2= KEYWORD_2 ( (lv_argument_3_0= ruleTypeArgument ) ) otherlv_4= KEYWORD_3
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleFunctionalPseudoClassSelector5743); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionalPseudoClassSelectorAccess().getColonKeyword_0());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2754:1: ( (lv_pseudo_1_0= ruleFunctionalPseudoClasses ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2755:1: (lv_pseudo_1_0= ruleFunctionalPseudoClasses )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2755:1: (lv_pseudo_1_0= ruleFunctionalPseudoClasses )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2756:3: lv_pseudo_1_0= ruleFunctionalPseudoClasses
            {
             
            	        newCompositeNode(grammarAccess.getFunctionalPseudoClassSelectorAccess().getPseudoFunctionalPseudoClassesEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionalPseudoClasses_in_ruleFunctionalPseudoClassSelector5763);
            lv_pseudo_1_0=ruleFunctionalPseudoClasses();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionalPseudoClassSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"pseudo",
                    		lv_pseudo_1_0, 
                    		"FunctionalPseudoClasses");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFunctionalPseudoClassSelector5776); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionalPseudoClassSelectorAccess().getLeftParenthesisKeyword_2());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2777:1: ( (lv_argument_3_0= ruleTypeArgument ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2778:1: (lv_argument_3_0= ruleTypeArgument )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2778:1: (lv_argument_3_0= ruleTypeArgument )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2779:3: lv_argument_3_0= ruleTypeArgument
            {
             
            	        newCompositeNode(grammarAccess.getFunctionalPseudoClassSelectorAccess().getArgumentTypeArgumentParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeArgument_in_ruleFunctionalPseudoClassSelector5796);
            lv_argument_3_0=ruleTypeArgument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionalPseudoClassSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_3_0, 
                    		"TypeArgument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFunctionalPseudoClassSelector5809); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionalPseudoClassSelectorAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFunctionalPseudoClassSelector"


    // $ANTLR start "entryRuleTypeArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2811:1: entryRuleTypeArgument returns [EObject current=null] : iv_ruleTypeArgument= ruleTypeArgument EOF ;
    public final EObject entryRuleTypeArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeArgument = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2815:2: (iv_ruleTypeArgument= ruleTypeArgument EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2816:2: iv_ruleTypeArgument= ruleTypeArgument EOF
            {
             newCompositeNode(grammarAccess.getTypeArgumentRule()); 
            pushFollow(FOLLOW_ruleTypeArgument_in_entryRuleTypeArgument5853);
            iv_ruleTypeArgument=ruleTypeArgument();

            state._fsp--;

             current =iv_ruleTypeArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeArgument5863); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTypeArgument"


    // $ANTLR start "ruleTypeArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2826:1: ruleTypeArgument returns [EObject current=null] : (this_ParityArgument_0= ruleParityArgument | this_LinearArgument_1= ruleLinearArgument | this_ConstantArgument_2= ruleConstantArgument ) ;
    public final EObject ruleTypeArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ParityArgument_0 = null;

        EObject this_LinearArgument_1 = null;

        EObject this_ConstantArgument_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2830:28: ( (this_ParityArgument_0= ruleParityArgument | this_LinearArgument_1= ruleLinearArgument | this_ConstantArgument_2= ruleConstantArgument ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2831:1: (this_ParityArgument_0= ruleParityArgument | this_LinearArgument_1= ruleLinearArgument | this_ConstantArgument_2= ruleConstantArgument )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2831:1: (this_ParityArgument_0= ruleParityArgument | this_LinearArgument_1= ruleLinearArgument | this_ConstantArgument_2= ruleConstantArgument )
            int alt52=3;
            switch ( input.LA(1) ) {
            case KEYWORD_38:
            case KEYWORD_36:
                {
                alt52=1;
                }
                break;
            case KEYWORD_15:
            case RULE_IDENT:
                {
                alt52=2;
                }
                break;
            case RULE_INT:
                {
                int LA52_3 = input.LA(2);

                if ( (LA52_3==EOF||LA52_3==KEYWORD_3) ) {
                    alt52=3;
                }
                else if ( (LA52_3==KEYWORD_15) ) {
                    alt52=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
            case KEYWORD_7:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2832:5: this_ParityArgument_0= ruleParityArgument
                    {
                     
                            newCompositeNode(grammarAccess.getTypeArgumentAccess().getParityArgumentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParityArgument_in_ruleTypeArgument5914);
                    this_ParityArgument_0=ruleParityArgument();

                    state._fsp--;


                            current = this_ParityArgument_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2842:5: this_LinearArgument_1= ruleLinearArgument
                    {
                     
                            newCompositeNode(grammarAccess.getTypeArgumentAccess().getLinearArgumentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLinearArgument_in_ruleTypeArgument5941);
                    this_LinearArgument_1=ruleLinearArgument();

                    state._fsp--;


                            current = this_LinearArgument_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2852:5: this_ConstantArgument_2= ruleConstantArgument
                    {
                     
                            newCompositeNode(grammarAccess.getTypeArgumentAccess().getConstantArgumentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstantArgument_in_ruleTypeArgument5968);
                    this_ConstantArgument_2=ruleConstantArgument();

                    state._fsp--;


                            current = this_ConstantArgument_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTypeArgument"


    // $ANTLR start "entryRuleLinearArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2871:1: entryRuleLinearArgument returns [EObject current=null] : iv_ruleLinearArgument= ruleLinearArgument EOF ;
    public final EObject entryRuleLinearArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearArgument = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2875:2: (iv_ruleLinearArgument= ruleLinearArgument EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2876:2: iv_ruleLinearArgument= ruleLinearArgument EOF
            {
             newCompositeNode(grammarAccess.getLinearArgumentRule()); 
            pushFollow(FOLLOW_ruleLinearArgument_in_entryRuleLinearArgument6012);
            iv_ruleLinearArgument=ruleLinearArgument();

            state._fsp--;

             current =iv_ruleLinearArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearArgument6022); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLinearArgument"


    // $ANTLR start "ruleLinearArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2886:1: ruleLinearArgument returns [EObject current=null] : ( () ( (lv_coefficient_1_0= ruleCoefficient ) ) ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleLinearArgument() throws RecognitionException {
        EObject current = null;

        Token lv_constantSign_2_1=null;
        Token lv_constantSign_2_2=null;
        Token lv_constant_3_0=null;
        EObject lv_coefficient_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2890:28: ( ( () ( (lv_coefficient_1_0= ruleCoefficient ) ) ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )? ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2891:1: ( () ( (lv_coefficient_1_0= ruleCoefficient ) ) ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )? )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2891:1: ( () ( (lv_coefficient_1_0= ruleCoefficient ) ) ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )? )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2891:2: () ( (lv_coefficient_1_0= ruleCoefficient ) ) ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )?
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2891:2: ()
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinearArgumentAccess().getLinearArgumentAction_0(),
                        current);
                

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2897:2: ( (lv_coefficient_1_0= ruleCoefficient ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2898:1: (lv_coefficient_1_0= ruleCoefficient )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2898:1: (lv_coefficient_1_0= ruleCoefficient )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2899:3: lv_coefficient_1_0= ruleCoefficient
            {
             
            	        newCompositeNode(grammarAccess.getLinearArgumentAccess().getCoefficientCoefficientParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoefficient_in_ruleLinearArgument6081);
            lv_coefficient_1_0=ruleCoefficient();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearArgumentRule());
            	        }
                   		set(
                   			current, 
                   			"coefficient",
                    		lv_coefficient_1_0, 
                    		"Coefficient");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2915:2: ( ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KEYWORD_5||LA55_0==KEYWORD_7||LA55_0==RULE_INT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2915:3: ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )? ( (lv_constant_3_0= RULE_INT ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2915:3: ( ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==KEYWORD_5||LA54_0==KEYWORD_7) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2916:1: ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2916:1: ( (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2917:1: (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2917:1: (lv_constantSign_2_1= KEYWORD_7 | lv_constantSign_2_2= KEYWORD_5 )
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==KEYWORD_7) ) {
                                alt53=1;
                            }
                            else if ( (LA53_0==KEYWORD_5) ) {
                                alt53=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 53, 0, input);

                                throw nvae;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2918:3: lv_constantSign_2_1= KEYWORD_7
                                    {
                                    lv_constantSign_2_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleLinearArgument6103); 

                                            newLeafNode(lv_constantSign_2_1, grammarAccess.getLinearArgumentAccess().getConstantSignHyphenMinusKeyword_2_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getLinearArgumentRule());
                                    	        }
                                           		setWithLastConsumed(current, "constantSign", lv_constantSign_2_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2931:8: lv_constantSign_2_2= KEYWORD_5
                                    {
                                    lv_constantSign_2_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleLinearArgument6131); 

                                            newLeafNode(lv_constantSign_2_2, grammarAccess.getLinearArgumentAccess().getConstantSignPlusSignKeyword_2_0_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getLinearArgumentRule());
                                    	        }
                                           		setWithLastConsumed(current, "constantSign", lv_constantSign_2_2, null);
                                    	    

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2947:3: ( (lv_constant_3_0= RULE_INT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2948:1: (lv_constant_3_0= RULE_INT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2948:1: (lv_constant_3_0= RULE_INT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2949:3: lv_constant_3_0= RULE_INT
                    {
                    lv_constant_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinearArgument6163); 

                    			newLeafNode(lv_constant_3_0, grammarAccess.getLinearArgumentAccess().getConstantINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinearArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constant",
                            		lv_constant_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLinearArgument"


    // $ANTLR start "entryRuleCoefficient"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2976:1: entryRuleCoefficient returns [EObject current=null] : iv_ruleCoefficient= ruleCoefficient EOF ;
    public final EObject entryRuleCoefficient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoefficient = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2980:2: (iv_ruleCoefficient= ruleCoefficient EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2981:2: iv_ruleCoefficient= ruleCoefficient EOF
            {
             newCompositeNode(grammarAccess.getCoefficientRule()); 
            pushFollow(FOLLOW_ruleCoefficient_in_entryRuleCoefficient6215);
            iv_ruleCoefficient=ruleCoefficient();

            state._fsp--;

             current =iv_ruleCoefficient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoefficient6225); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCoefficient"


    // $ANTLR start "ruleCoefficient"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2991:1: ruleCoefficient returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) | ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 ) ) ;
    public final EObject ruleCoefficient() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token lv_int_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2995:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) | ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2996:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) | ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2996:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) | ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_IDENT) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_15||LA57_0==RULE_INT) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2996:2: ( (lv_ident_0_0= RULE_IDENT ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2996:2: ( (lv_ident_0_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2997:1: (lv_ident_0_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2997:1: (lv_ident_0_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:2998:3: lv_ident_0_0= RULE_IDENT
                    {
                    lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleCoefficient6271); 

                    			newLeafNode(lv_ident_0_0, grammarAccess.getCoefficientAccess().getIdentIDENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCoefficientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ident",
                            		lv_ident_0_0, 
                            		"IDENT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3015:6: ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3015:6: ( () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3015:7: () ( (lv_int_2_0= RULE_INT ) )? otherlv_3= KEYWORD_15
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3015:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3016:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCoefficientAccess().getCoefficientAction_1_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3021:2: ( (lv_int_2_0= RULE_INT ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3022:1: (lv_int_2_0= RULE_INT )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3022:1: (lv_int_2_0= RULE_INT )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3023:3: lv_int_2_0= RULE_INT
                            {
                            lv_int_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCoefficient6309); 

                            			newLeafNode(lv_int_2_0, grammarAccess.getCoefficientAccess().getIntINTTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCoefficientRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"int",
                                    		lv_int_2_0, 
                                    		"INT");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleCoefficient6328); 

                        	newLeafNode(otherlv_3, grammarAccess.getCoefficientAccess().getNKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCoefficient"


    // $ANTLR start "entryRuleConstantArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3055:1: entryRuleConstantArgument returns [EObject current=null] : iv_ruleConstantArgument= ruleConstantArgument EOF ;
    public final EObject entryRuleConstantArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantArgument = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3059:2: (iv_ruleConstantArgument= ruleConstantArgument EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3060:2: iv_ruleConstantArgument= ruleConstantArgument EOF
            {
             newCompositeNode(grammarAccess.getConstantArgumentRule()); 
            pushFollow(FOLLOW_ruleConstantArgument_in_entryRuleConstantArgument6373);
            iv_ruleConstantArgument=ruleConstantArgument();

            state._fsp--;

             current =iv_ruleConstantArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantArgument6383); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleConstantArgument"


    // $ANTLR start "ruleConstantArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3070:1: ruleConstantArgument returns [EObject current=null] : ( ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )? ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleConstantArgument() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_1=null;
        Token lv_sign_0_2=null;
        Token lv_int_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3074:28: ( ( ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )? ( (lv_int_1_0= RULE_INT ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3075:1: ( ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )? ( (lv_int_1_0= RULE_INT ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3075:1: ( ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )? ( (lv_int_1_0= RULE_INT ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3075:2: ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )? ( (lv_int_1_0= RULE_INT ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3075:2: ( ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_5||LA59_0==KEYWORD_7) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3076:1: ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3076:1: ( (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3077:1: (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3077:1: (lv_sign_0_1= KEYWORD_7 | lv_sign_0_2= KEYWORD_5 )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==KEYWORD_7) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==KEYWORD_5) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3078:3: lv_sign_0_1= KEYWORD_7
                            {
                            lv_sign_0_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleConstantArgument6433); 

                                    newLeafNode(lv_sign_0_1, grammarAccess.getConstantArgumentAccess().getSignHyphenMinusKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantArgumentRule());
                            	        }
                                   		setWithLastConsumed(current, "sign", lv_sign_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3091:8: lv_sign_0_2= KEYWORD_5
                            {
                            lv_sign_0_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleConstantArgument6461); 

                                    newLeafNode(lv_sign_0_2, grammarAccess.getConstantArgumentAccess().getSignPlusSignKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantArgumentRule());
                            	        }
                                   		setWithLastConsumed(current, "sign", lv_sign_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3107:3: ( (lv_int_1_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3108:1: (lv_int_1_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3108:1: (lv_int_1_0= RULE_INT )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3109:3: lv_int_1_0= RULE_INT
            {
            lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantArgument6493); 

            			newLeafNode(lv_int_1_0, grammarAccess.getConstantArgumentAccess().getIntINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"int",
                    		lv_int_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleConstantArgument"


    // $ANTLR start "entryRuleParityArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3136:1: entryRuleParityArgument returns [EObject current=null] : iv_ruleParityArgument= ruleParityArgument EOF ;
    public final EObject entryRuleParityArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParityArgument = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3137:2: (iv_ruleParityArgument= ruleParityArgument EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3138:2: iv_ruleParityArgument= ruleParityArgument EOF
            {
             newCompositeNode(grammarAccess.getParityArgumentRule()); 
            pushFollow(FOLLOW_ruleParityArgument_in_entryRuleParityArgument6537);
            iv_ruleParityArgument=ruleParityArgument();

            state._fsp--;

             current =iv_ruleParityArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParityArgument6547); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParityArgument"


    // $ANTLR start "ruleParityArgument"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3145:1: ruleParityArgument returns [EObject current=null] : ( (lv_parity_0_0= ruleParities ) ) ;
    public final EObject ruleParityArgument() throws RecognitionException {
        EObject current = null;

        Enumerator lv_parity_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3148:28: ( ( (lv_parity_0_0= ruleParities ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3149:1: ( (lv_parity_0_0= ruleParities ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3149:1: ( (lv_parity_0_0= ruleParities ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3150:1: (lv_parity_0_0= ruleParities )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3150:1: (lv_parity_0_0= ruleParities )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3151:3: lv_parity_0_0= ruleParities
            {
             
            	        newCompositeNode(grammarAccess.getParityArgumentAccess().getParityParitiesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParities_in_ruleParityArgument6592);
            lv_parity_0_0=ruleParities();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParityArgumentRule());
            	        }
                   		set(
                   			current, 
                   			"parity",
                    		lv_parity_0_0, 
                    		"Parities");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParityArgument"


    // $ANTLR start "entryRuleNegationSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3175:1: entryRuleNegationSelector returns [EObject current=null] : iv_ruleNegationSelector= ruleNegationSelector EOF ;
    public final EObject entryRuleNegationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3179:2: (iv_ruleNegationSelector= ruleNegationSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3180:2: iv_ruleNegationSelector= ruleNegationSelector EOF
            {
             newCompositeNode(grammarAccess.getNegationSelectorRule()); 
            pushFollow(FOLLOW_ruleNegationSelector_in_entryRuleNegationSelector6632);
            iv_ruleNegationSelector=ruleNegationSelector();

            state._fsp--;

             current =iv_ruleNegationSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationSelector6642); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNegationSelector"


    // $ANTLR start "ruleNegationSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3190:1: ruleNegationSelector returns [EObject current=null] : (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_42 ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) ) otherlv_3= KEYWORD_3 ) ;
    public final EObject ruleNegationSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_simpleSelector_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3194:28: ( (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_42 ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) ) otherlv_3= KEYWORD_3 ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3195:1: (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_42 ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) ) otherlv_3= KEYWORD_3 )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3195:1: (otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_42 ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) ) otherlv_3= KEYWORD_3 )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3196:2: otherlv_0= KEYWORD_9 otherlv_1= KEYWORD_42 ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) ) otherlv_3= KEYWORD_3
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNegationSelector6684); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationSelectorAccess().getColonKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleNegationSelector6696); 

                	newLeafNode(otherlv_1, grammarAccess.getNegationSelectorAccess().getNotKeyword_1());
                
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3205:1: ( (lv_simpleSelector_2_0= ruleNegationSimpleSelector ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3206:1: (lv_simpleSelector_2_0= ruleNegationSimpleSelector )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3206:1: (lv_simpleSelector_2_0= ruleNegationSimpleSelector )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3207:3: lv_simpleSelector_2_0= ruleNegationSimpleSelector
            {
             
            	        newCompositeNode(grammarAccess.getNegationSelectorAccess().getSimpleSelectorNegationSimpleSelectorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNegationSimpleSelector_in_ruleNegationSelector6716);
            lv_simpleSelector_2_0=ruleNegationSimpleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegationSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"simpleSelector",
                    		lv_simpleSelector_2_0, 
                    		"NegationSimpleSelector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNegationSelector6729); 

                	newLeafNode(otherlv_3, grammarAccess.getNegationSelectorAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNegationSelector"


    // $ANTLR start "entryRuleNegationSimpleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3239:1: entryRuleNegationSimpleSelector returns [EObject current=null] : iv_ruleNegationSimpleSelector= ruleNegationSimpleSelector EOF ;
    public final EObject entryRuleNegationSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationSimpleSelector = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3240:2: (iv_ruleNegationSimpleSelector= ruleNegationSimpleSelector EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3241:2: iv_ruleNegationSimpleSelector= ruleNegationSimpleSelector EOF
            {
             newCompositeNode(grammarAccess.getNegationSimpleSelectorRule()); 
            pushFollow(FOLLOW_ruleNegationSimpleSelector_in_entryRuleNegationSimpleSelector6767);
            iv_ruleNegationSimpleSelector=ruleNegationSimpleSelector();

            state._fsp--;

             current =iv_ruleNegationSimpleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationSimpleSelector6777); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationSimpleSelector"


    // $ANTLR start "ruleNegationSimpleSelector"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3248:1: ruleNegationSimpleSelector returns [EObject current=null] : (this_TypeSelector_0= ruleTypeSelector | this_UniversalSelector_1= ruleUniversalSelector | this_AttributeSelector_2= ruleAttributeSelector | this_IDSelector_3= ruleIDSelector | this_ClassSelector_4= ruleClassSelector | this_PseudoSelector_5= rulePseudoSelector ) ;
    public final EObject ruleNegationSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_TypeSelector_0 = null;

        EObject this_UniversalSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_IDSelector_3 = null;

        EObject this_ClassSelector_4 = null;

        EObject this_PseudoSelector_5 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3251:28: ( (this_TypeSelector_0= ruleTypeSelector | this_UniversalSelector_1= ruleUniversalSelector | this_AttributeSelector_2= ruleAttributeSelector | this_IDSelector_3= ruleIDSelector | this_ClassSelector_4= ruleClassSelector | this_PseudoSelector_5= rulePseudoSelector ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3252:1: (this_TypeSelector_0= ruleTypeSelector | this_UniversalSelector_1= ruleUniversalSelector | this_AttributeSelector_2= ruleAttributeSelector | this_IDSelector_3= ruleIDSelector | this_ClassSelector_4= ruleClassSelector | this_PseudoSelector_5= rulePseudoSelector )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3252:1: (this_TypeSelector_0= ruleTypeSelector | this_UniversalSelector_1= ruleUniversalSelector | this_AttributeSelector_2= ruleAttributeSelector | this_IDSelector_3= ruleIDSelector | this_ClassSelector_4= ruleClassSelector | this_PseudoSelector_5= rulePseudoSelector )
            int alt60=6;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3253:5: this_TypeSelector_0= ruleTypeSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getTypeSelectorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeSelector_in_ruleNegationSimpleSelector6824);
                    this_TypeSelector_0=ruleTypeSelector();

                    state._fsp--;


                            current = this_TypeSelector_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3263:5: this_UniversalSelector_1= ruleUniversalSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getUniversalSelectorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUniversalSelector_in_ruleNegationSimpleSelector6851);
                    this_UniversalSelector_1=ruleUniversalSelector();

                    state._fsp--;


                            current = this_UniversalSelector_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3273:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleNegationSimpleSelector6878);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;


                            current = this_AttributeSelector_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3283:5: this_IDSelector_3= ruleIDSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getIDSelectorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIDSelector_in_ruleNegationSimpleSelector6905);
                    this_IDSelector_3=ruleIDSelector();

                    state._fsp--;


                            current = this_IDSelector_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3293:5: this_ClassSelector_4= ruleClassSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getClassSelectorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleNegationSimpleSelector6932);
                    this_ClassSelector_4=ruleClassSelector();

                    state._fsp--;


                            current = this_ClassSelector_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3303:5: this_PseudoSelector_5= rulePseudoSelector
                    {
                     
                            newCompositeNode(grammarAccess.getNegationSimpleSelectorAccess().getPseudoSelectorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePseudoSelector_in_ruleNegationSimpleSelector6959);
                    this_PseudoSelector_5=rulePseudoSelector();

                    state._fsp--;


                            current = this_PseudoSelector_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationSimpleSelector"


    // $ANTLR start "entryRuleValueLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3319:1: entryRuleValueLiteral returns [EObject current=null] : iv_ruleValueLiteral= ruleValueLiteral EOF ;
    public final EObject entryRuleValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3320:2: (iv_ruleValueLiteral= ruleValueLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3321:2: iv_ruleValueLiteral= ruleValueLiteral EOF
            {
             newCompositeNode(grammarAccess.getValueLiteralRule()); 
            pushFollow(FOLLOW_ruleValueLiteral_in_entryRuleValueLiteral6993);
            iv_ruleValueLiteral=ruleValueLiteral();

            state._fsp--;

             current =iv_ruleValueLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueLiteral7003); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueLiteral"


    // $ANTLR start "ruleValueLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3328:1: ruleValueLiteral returns [EObject current=null] : (this_SizeLiteral_0= ruleSizeLiteral | this_StringLiteral_1= ruleStringLiteral | this_ColorLiteral_2= ruleColorLiteral | this_URLLiteral_3= ruleURLLiteral | this_FunctionCallLiteral_4= ruleFunctionCallLiteral ) ;
    public final EObject ruleValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SizeLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_ColorLiteral_2 = null;

        EObject this_URLLiteral_3 = null;

        EObject this_FunctionCallLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3331:28: ( (this_SizeLiteral_0= ruleSizeLiteral | this_StringLiteral_1= ruleStringLiteral | this_ColorLiteral_2= ruleColorLiteral | this_URLLiteral_3= ruleURLLiteral | this_FunctionCallLiteral_4= ruleFunctionCallLiteral ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3332:1: (this_SizeLiteral_0= ruleSizeLiteral | this_StringLiteral_1= ruleStringLiteral | this_ColorLiteral_2= ruleColorLiteral | this_URLLiteral_3= ruleURLLiteral | this_FunctionCallLiteral_4= ruleFunctionCallLiteral )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3332:1: (this_SizeLiteral_0= ruleSizeLiteral | this_StringLiteral_1= ruleStringLiteral | this_ColorLiteral_2= ruleColorLiteral | this_URLLiteral_3= ruleURLLiteral | this_FunctionCallLiteral_4= ruleFunctionCallLiteral )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt61=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==EOF||LA61_2==KEYWORD_67||(LA61_2>=KEYWORD_48 && LA61_2<=KEYWORD_49)||LA61_2==KEYWORD_54||LA61_2==KEYWORD_39||LA61_2==KEYWORD_44||LA61_2==KEYWORD_34||LA61_2==KEYWORD_37||LA61_2==KEYWORD_3||LA61_2==KEYWORD_6||LA61_2==KEYWORD_8||LA61_2==KEYWORD_10||LA61_2==KEYWORD_18||LA61_2==RULE_HEX_COLOR||LA61_2==RULE_IDENT||LA61_2==RULE_URL||(LA61_2>=RULE_INT && LA61_2<=RULE_STRING)) ) {
                    alt61=1;
                }
                else if ( (LA61_2==KEYWORD_2) ) {
                    alt61=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt61=2;
                }
                break;
            case KEYWORD_49:
            case KEYWORD_54:
            case KEYWORD_39:
            case KEYWORD_44:
            case KEYWORD_34:
            case KEYWORD_37:
            case RULE_HEX_COLOR:
                {
                alt61=3;
                }
                break;
            case RULE_URL:
                {
                alt61=4;
                }
                break;
            case KEYWORD_48:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3333:5: this_SizeLiteral_0= ruleSizeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueLiteralAccess().getSizeLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSizeLiteral_in_ruleValueLiteral7050);
                    this_SizeLiteral_0=ruleSizeLiteral();

                    state._fsp--;


                            current = this_SizeLiteral_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3343:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueLiteralAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValueLiteral7077);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                            current = this_StringLiteral_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3353:5: this_ColorLiteral_2= ruleColorLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueLiteralAccess().getColorLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleColorLiteral_in_ruleValueLiteral7104);
                    this_ColorLiteral_2=ruleColorLiteral();

                    state._fsp--;


                            current = this_ColorLiteral_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3363:5: this_URLLiteral_3= ruleURLLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueLiteralAccess().getURLLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleURLLiteral_in_ruleValueLiteral7131);
                    this_URLLiteral_3=ruleURLLiteral();

                    state._fsp--;


                            current = this_URLLiteral_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3373:5: this_FunctionCallLiteral_4= ruleFunctionCallLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueLiteralAccess().getFunctionCallLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCallLiteral_in_ruleValueLiteral7158);
                    this_FunctionCallLiteral_4=ruleFunctionCallLiteral();

                    state._fsp--;


                            current = this_FunctionCallLiteral_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3389:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3390:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3391:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7192);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral7202); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3398:1: ruleNumberLiteral returns [EObject current=null] : ( ( () ( (lv_int_1_0= RULE_INT ) ) ) | ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;
        Token lv_decimal_3_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3401:28: ( ( ( () ( (lv_int_1_0= RULE_INT ) ) ) | ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:1: ( ( () ( (lv_int_1_0= RULE_INT ) ) ) | ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:1: ( ( () ( (lv_int_1_0= RULE_INT ) ) ) | ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_DECIMAL) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:3: () ( (lv_int_1_0= RULE_INT ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3402:3: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3403:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3408:2: ( (lv_int_1_0= RULE_INT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3409:1: (lv_int_1_0= RULE_INT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3409:1: (lv_int_1_0= RULE_INT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3410:3: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral7254); 

                    			newLeafNode(lv_int_1_0, grammarAccess.getNumberLiteralAccess().getIntINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3427:6: ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3427:6: ( () ( (lv_decimal_3_0= RULE_DECIMAL ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3427:7: () ( (lv_decimal_3_0= RULE_DECIMAL ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3427:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3428:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3433:2: ( (lv_decimal_3_0= RULE_DECIMAL ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3434:1: (lv_decimal_3_0= RULE_DECIMAL )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3434:1: (lv_decimal_3_0= RULE_DECIMAL )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3435:3: lv_decimal_3_0= RULE_DECIMAL
                    {
                    lv_decimal_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumberLiteral7293); 

                    			newLeafNode(lv_decimal_3_0, grammarAccess.getNumberLiteralAccess().getDecimalDECIMALTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"decimal",
                            		lv_decimal_3_0, 
                            		"DECIMAL");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleSizeLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3459:1: entryRuleSizeLiteral returns [EObject current=null] : iv_ruleSizeLiteral= ruleSizeLiteral EOF ;
    public final EObject entryRuleSizeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3463:2: (iv_ruleSizeLiteral= ruleSizeLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3464:2: iv_ruleSizeLiteral= ruleSizeLiteral EOF
            {
             newCompositeNode(grammarAccess.getSizeLiteralRule()); 
            pushFollow(FOLLOW_ruleSizeLiteral_in_entryRuleSizeLiteral7340);
            iv_ruleSizeLiteral=ruleSizeLiteral();

            state._fsp--;

             current =iv_ruleSizeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeLiteral7350); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSizeLiteral"


    // $ANTLR start "ruleSizeLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3474:1: ruleSizeLiteral returns [EObject current=null] : ( ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) ) (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )? ) ;
    public final EObject ruleSizeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bareword_4_0=null;
        Token otherlv_5=null;
        EObject lv_number_1_0 = null;

        Enumerator lv_dimension_2_0 = null;

        EObject lv_lineHeight_7_0 = null;

        Enumerator lv_lineHeightDimension_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3478:28: ( ( ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) ) (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )? ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:1: ( ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) ) (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )? )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:1: ( ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) ) (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )? )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:2: ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) ) (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )?
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:2: ( ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? ) | ( () ( (lv_bareword_4_0= RULE_IDENT ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_DECIMAL)) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_IDENT) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:3: ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:3: ( () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )? )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:4: () ( (lv_number_1_0= ruleNumberLiteral ) ) ( (lv_dimension_2_0= ruleDimensions ) )?
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3479:4: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3480:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSizeLiteralAccess().getQuantifiedSizeLiteralAction_0_0_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3485:2: ( (lv_number_1_0= ruleNumberLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3486:1: (lv_number_1_0= ruleNumberLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3486:1: (lv_number_1_0= ruleNumberLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3487:3: lv_number_1_0= ruleNumberLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeLiteralAccess().getNumberNumberLiteralParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleSizeLiteral7411);
                    lv_number_1_0=ruleNumberLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"NumberLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3503:2: ( (lv_dimension_2_0= ruleDimensions ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=KEYWORD_23 && LA63_0<=KEYWORD_30)||LA63_0==KEYWORD_1) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3504:1: (lv_dimension_2_0= ruleDimensions )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3504:1: (lv_dimension_2_0= ruleDimensions )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3505:3: lv_dimension_2_0= ruleDimensions
                            {
                             
                            	        newCompositeNode(grammarAccess.getSizeLiteralAccess().getDimensionDimensionsEnumRuleCall_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDimensions_in_ruleSizeLiteral7432);
                            lv_dimension_2_0=ruleDimensions();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSizeLiteralRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"dimension",
                                    		lv_dimension_2_0, 
                                    		"Dimensions");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3522:6: ( () ( (lv_bareword_4_0= RULE_IDENT ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3522:6: ( () ( (lv_bareword_4_0= RULE_IDENT ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3522:7: () ( (lv_bareword_4_0= RULE_IDENT ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3522:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3523:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSizeLiteralAccess().getQualifiedSizeLiteralAction_0_1_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3528:2: ( (lv_bareword_4_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3529:1: (lv_bareword_4_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3529:1: (lv_bareword_4_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3530:3: lv_bareword_4_0= RULE_IDENT
                    {
                    lv_bareword_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSizeLiteral7467); 

                    			newLeafNode(lv_bareword_4_0, grammarAccess.getSizeLiteralAccess().getBarewordIDENTTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSizeLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bareword",
                            		lv_bareword_4_0, 
                            		"IDENT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3546:4: (otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_8) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3547:2: otherlv_5= KEYWORD_8 () ( (lv_lineHeight_7_0= ruleNumberLiteral ) ) ( (lv_lineHeightDimension_8_0= ruleDimensions ) )?
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSizeLiteral7488); 

                        	newLeafNode(otherlv_5, grammarAccess.getSizeLiteralAccess().getSolidusKeyword_1_0());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3551:1: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3552:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getSizeLiteralAccess().getFontHeightLiteralFontHeightAction_1_1(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3557:2: ( (lv_lineHeight_7_0= ruleNumberLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3558:1: (lv_lineHeight_7_0= ruleNumberLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3558:1: (lv_lineHeight_7_0= ruleNumberLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3559:3: lv_lineHeight_7_0= ruleNumberLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeLiteralAccess().getLineHeightNumberLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleSizeLiteral7517);
                    lv_lineHeight_7_0=ruleNumberLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lineHeight",
                            		lv_lineHeight_7_0, 
                            		"NumberLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3575:2: ( (lv_lineHeightDimension_8_0= ruleDimensions ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=KEYWORD_23 && LA65_0<=KEYWORD_30)||LA65_0==KEYWORD_1) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3576:1: (lv_lineHeightDimension_8_0= ruleDimensions )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3576:1: (lv_lineHeightDimension_8_0= ruleDimensions )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3577:3: lv_lineHeightDimension_8_0= ruleDimensions
                            {
                             
                            	        newCompositeNode(grammarAccess.getSizeLiteralAccess().getLineHeightDimensionDimensionsEnumRuleCall_1_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDimensions_in_ruleSizeLiteral7538);
                            lv_lineHeightDimension_8_0=ruleDimensions();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSizeLiteralRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"lineHeightDimension",
                                    		lv_lineHeightDimension_8_0, 
                                    		"Dimensions");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSizeLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3604:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3605:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3606:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7580);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7590); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3613:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3616:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3617:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3617:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3618:1: (lv_value_0_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3618:1: (lv_value_0_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3619:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7631); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3643:1: entryRuleColorLiteral returns [EObject current=null] : iv_ruleColorLiteral= ruleColorLiteral EOF ;
    public final EObject entryRuleColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3644:2: (iv_ruleColorLiteral= ruleColorLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3645:2: iv_ruleColorLiteral= ruleColorLiteral EOF
            {
             newCompositeNode(grammarAccess.getColorLiteralRule()); 
            pushFollow(FOLLOW_ruleColorLiteral_in_entryRuleColorLiteral7670);
            iv_ruleColorLiteral=ruleColorLiteral();

            state._fsp--;

             current =iv_ruleColorLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorLiteral7680); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorLiteral"


    // $ANTLR start "ruleColorLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3652:1: ruleColorLiteral returns [EObject current=null] : ( ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) ) | ( () ( (lv_color_3_0= ruleColorNames ) ) ) | this_ComponentColorLiteral_4= ruleComponentColorLiteral ) ;
    public final EObject ruleColorLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_rgb_1_0=null;
        Enumerator lv_color_3_0 = null;

        EObject this_ComponentColorLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3655:28: ( ( ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) ) | ( () ( (lv_color_3_0= ruleColorNames ) ) ) | this_ComponentColorLiteral_4= ruleComponentColorLiteral ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:1: ( ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) ) | ( () ( (lv_color_3_0= ruleColorNames ) ) ) | this_ComponentColorLiteral_4= ruleComponentColorLiteral )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:1: ( ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) ) | ( () ( (lv_color_3_0= ruleColorNames ) ) ) | this_ComponentColorLiteral_4= ruleComponentColorLiteral )
            int alt67=3;
            switch ( input.LA(1) ) {
            case RULE_HEX_COLOR:
                {
                alt67=1;
                }
                break;
            case KEYWORD_49:
            case KEYWORD_54:
                {
                alt67=2;
                }
                break;
            case KEYWORD_39:
            case KEYWORD_44:
            case KEYWORD_34:
            case KEYWORD_37:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:2: ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:2: ( () ( (lv_rgb_1_0= RULE_HEX_COLOR ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:3: () ( (lv_rgb_1_0= RULE_HEX_COLOR ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3656:3: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3657:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorLiteralAccess().getRGBColorAction_0_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3662:2: ( (lv_rgb_1_0= RULE_HEX_COLOR ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3663:1: (lv_rgb_1_0= RULE_HEX_COLOR )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3663:1: (lv_rgb_1_0= RULE_HEX_COLOR )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3664:3: lv_rgb_1_0= RULE_HEX_COLOR
                    {
                    lv_rgb_1_0=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleColorLiteral7732); 

                    			newLeafNode(lv_rgb_1_0, grammarAccess.getColorLiteralAccess().getRgbHEX_COLORTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rgb",
                            		lv_rgb_1_0, 
                            		"HEX_COLOR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3681:6: ( () ( (lv_color_3_0= ruleColorNames ) ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3681:6: ( () ( (lv_color_3_0= ruleColorNames ) ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3681:7: () ( (lv_color_3_0= ruleColorNames ) )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3681:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3682:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorLiteralAccess().getNamedColorAction_1_0(),
                                current);
                        

                    }

                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3687:2: ( (lv_color_3_0= ruleColorNames ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3688:1: (lv_color_3_0= ruleColorNames )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3688:1: (lv_color_3_0= ruleColorNames )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3689:3: lv_color_3_0= ruleColorNames
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorLiteralAccess().getColorColorNamesEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorNames_in_ruleColorLiteral7775);
                    lv_color_3_0=ruleColorNames();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_3_0, 
                            		"ColorNames");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3707:5: this_ComponentColorLiteral_4= ruleComponentColorLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getColorLiteralAccess().getComponentColorLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleComponentColorLiteral_in_ruleColorLiteral7804);
                    this_ComponentColorLiteral_4=ruleComponentColorLiteral();

                    state._fsp--;


                            current = this_ComponentColorLiteral_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorLiteral"


    // $ANTLR start "entryRuleComponentColorLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3723:1: entryRuleComponentColorLiteral returns [EObject current=null] : iv_ruleComponentColorLiteral= ruleComponentColorLiteral EOF ;
    public final EObject entryRuleComponentColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentColorLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3724:2: (iv_ruleComponentColorLiteral= ruleComponentColorLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3725:2: iv_ruleComponentColorLiteral= ruleComponentColorLiteral EOF
            {
             newCompositeNode(grammarAccess.getComponentColorLiteralRule()); 
            pushFollow(FOLLOW_ruleComponentColorLiteral_in_entryRuleComponentColorLiteral7838);
            iv_ruleComponentColorLiteral=ruleComponentColorLiteral();

            state._fsp--;

             current =iv_ruleComponentColorLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentColorLiteral7848); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentColorLiteral"


    // $ANTLR start "ruleComponentColorLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3732:1: ruleComponentColorLiteral returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 ) | ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 ) | ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 ) | ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 ) ) ;
    public final EObject ruleComponentColorLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        EObject lv_red_3_0 = null;

        EObject lv_green_5_0 = null;

        EObject lv_blue_7_0 = null;

        EObject lv_red_12_0 = null;

        EObject lv_green_14_0 = null;

        EObject lv_blue_16_0 = null;

        EObject lv_opacity_18_0 = null;

        EObject lv_hue_23_0 = null;

        EObject lv_saturation_25_0 = null;

        EObject lv_lightness_27_0 = null;

        EObject lv_hue_32_0 = null;

        EObject lv_saturation_34_0 = null;

        EObject lv_lightness_36_0 = null;

        EObject lv_opacity_38_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3735:28: ( ( ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 ) | ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 ) | ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 ) | ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:1: ( ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 ) | ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 ) | ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 ) | ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:1: ( ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 ) | ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 ) | ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 ) | ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case KEYWORD_37:
                {
                alt68=1;
                }
                break;
            case KEYWORD_44:
                {
                alt68=2;
                }
                break;
            case KEYWORD_34:
                {
                alt68=3;
                }
                break;
            case KEYWORD_39:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:2: ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:2: ( () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:3: () otherlv_1= KEYWORD_37 otherlv_2= KEYWORD_2 ( (lv_red_3_0= ruleColorComponentLiteral ) ) otherlv_4= KEYWORD_6 ( (lv_green_5_0= ruleColorComponentLiteral ) ) otherlv_6= KEYWORD_6 ( (lv_blue_7_0= ruleColorComponentLiteral ) ) otherlv_8= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3736:3: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3737:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentColorLiteralAccess().getComponentRGBColorAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleComponentColorLiteral7896); 

                        	newLeafNode(otherlv_1, grammarAccess.getComponentColorLiteralAccess().getRgbKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral7908); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentColorLiteralAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3752:1: ( (lv_red_3_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3753:1: (lv_red_3_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3753:1: (lv_red_3_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3754:3: lv_red_3_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getRedColorComponentLiteralParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7928);
                    lv_red_3_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"red",
                            		lv_red_3_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral7941); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_0_4());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3775:1: ( (lv_green_5_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3776:1: (lv_green_5_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3776:1: (lv_green_5_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3777:3: lv_green_5_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getGreenColorComponentLiteralParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7961);
                    lv_green_5_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"green",
                            		lv_green_5_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral7974); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_0_6());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3798:1: ( (lv_blue_7_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3799:1: (lv_blue_7_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3799:1: (lv_blue_7_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3800:3: lv_blue_7_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getBlueColorComponentLiteralParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7994);
                    lv_blue_7_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"blue",
                            		lv_blue_7_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8007); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentColorLiteralAccess().getRightParenthesisKeyword_0_8());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3822:6: ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3822:6: ( () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3822:7: () otherlv_10= KEYWORD_44 otherlv_11= KEYWORD_2 ( (lv_red_12_0= ruleColorComponentLiteral ) ) otherlv_13= KEYWORD_6 ( (lv_green_14_0= ruleColorComponentLiteral ) ) otherlv_15= KEYWORD_6 ( (lv_blue_16_0= ruleColorComponentLiteral ) ) otherlv_17= KEYWORD_6 ( (lv_opacity_18_0= ruleColorComponentLiteral ) ) otherlv_19= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3822:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3823:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentColorLiteralAccess().getComponentRGBAlphaColorAction_1_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleComponentColorLiteral8036); 

                        	newLeafNode(otherlv_10, grammarAccess.getComponentColorLiteralAccess().getRgbaKeyword_1_1());
                        
                    otherlv_11=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8048); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentColorLiteralAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3838:1: ( (lv_red_12_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3839:1: (lv_red_12_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3839:1: (lv_red_12_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3840:3: lv_red_12_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getRedColorComponentLiteralParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8068);
                    lv_red_12_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"red",
                            		lv_red_12_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8081); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_1_4());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3861:1: ( (lv_green_14_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3862:1: (lv_green_14_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3862:1: (lv_green_14_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3863:3: lv_green_14_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getGreenColorComponentLiteralParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8101);
                    lv_green_14_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"green",
                            		lv_green_14_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8114); 

                        	newLeafNode(otherlv_15, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_1_6());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3884:1: ( (lv_blue_16_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3885:1: (lv_blue_16_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3885:1: (lv_blue_16_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3886:3: lv_blue_16_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getBlueColorComponentLiteralParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8134);
                    lv_blue_16_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"blue",
                            		lv_blue_16_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8147); 

                        	newLeafNode(otherlv_17, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_1_8());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3907:1: ( (lv_opacity_18_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3908:1: (lv_opacity_18_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3908:1: (lv_opacity_18_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3909:3: lv_opacity_18_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getOpacityColorComponentLiteralParserRuleCall_1_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8167);
                    lv_opacity_18_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"opacity",
                            		lv_opacity_18_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8180); 

                        	newLeafNode(otherlv_19, grammarAccess.getComponentColorLiteralAccess().getRightParenthesisKeyword_1_10());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3931:6: ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3931:6: ( () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3931:7: () otherlv_21= KEYWORD_34 otherlv_22= KEYWORD_2 ( (lv_hue_23_0= ruleColorComponentLiteral ) ) otherlv_24= KEYWORD_6 ( (lv_saturation_25_0= ruleColorComponentLiteral ) ) otherlv_26= KEYWORD_6 ( (lv_lightness_27_0= ruleColorComponentLiteral ) ) otherlv_28= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3931:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3932:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentColorLiteralAccess().getComponentHSLColorAction_2_0(),
                                current);
                        

                    }

                    otherlv_21=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleComponentColorLiteral8209); 

                        	newLeafNode(otherlv_21, grammarAccess.getComponentColorLiteralAccess().getHslKeyword_2_1());
                        
                    otherlv_22=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8221); 

                        	newLeafNode(otherlv_22, grammarAccess.getComponentColorLiteralAccess().getLeftParenthesisKeyword_2_2());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3947:1: ( (lv_hue_23_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3948:1: (lv_hue_23_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3948:1: (lv_hue_23_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3949:3: lv_hue_23_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getHueColorComponentLiteralParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8241);
                    lv_hue_23_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"hue",
                            		lv_hue_23_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_24=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8254); 

                        	newLeafNode(otherlv_24, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_2_4());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3970:1: ( (lv_saturation_25_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3971:1: (lv_saturation_25_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3971:1: (lv_saturation_25_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3972:3: lv_saturation_25_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getSaturationColorComponentLiteralParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8274);
                    lv_saturation_25_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"saturation",
                            		lv_saturation_25_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8287); 

                        	newLeafNode(otherlv_26, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_2_6());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3993:1: ( (lv_lightness_27_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3994:1: (lv_lightness_27_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3994:1: (lv_lightness_27_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:3995:3: lv_lightness_27_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getLightnessColorComponentLiteralParserRuleCall_2_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8307);
                    lv_lightness_27_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lightness",
                            		lv_lightness_27_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8320); 

                        	newLeafNode(otherlv_28, grammarAccess.getComponentColorLiteralAccess().getRightParenthesisKeyword_2_8());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4017:6: ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4017:6: ( () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4017:7: () otherlv_30= KEYWORD_39 otherlv_31= KEYWORD_2 ( (lv_hue_32_0= ruleColorComponentLiteral ) ) otherlv_33= KEYWORD_6 ( (lv_saturation_34_0= ruleColorComponentLiteral ) ) otherlv_35= KEYWORD_6 ( (lv_lightness_36_0= ruleColorComponentLiteral ) ) otherlv_37= KEYWORD_6 ( (lv_opacity_38_0= ruleColorComponentLiteral ) ) otherlv_39= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4017:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4018:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentColorLiteralAccess().getComponentHSLAlphaColorAction_3_0(),
                                current);
                        

                    }

                    otherlv_30=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleComponentColorLiteral8349); 

                        	newLeafNode(otherlv_30, grammarAccess.getComponentColorLiteralAccess().getHslaKeyword_3_1());
                        
                    otherlv_31=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8361); 

                        	newLeafNode(otherlv_31, grammarAccess.getComponentColorLiteralAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4033:1: ( (lv_hue_32_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4034:1: (lv_hue_32_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4034:1: (lv_hue_32_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4035:3: lv_hue_32_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getHueColorComponentLiteralParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8381);
                    lv_hue_32_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"hue",
                            		lv_hue_32_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8394); 

                        	newLeafNode(otherlv_33, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_3_4());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4056:1: ( (lv_saturation_34_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4057:1: (lv_saturation_34_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4057:1: (lv_saturation_34_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4058:3: lv_saturation_34_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getSaturationColorComponentLiteralParserRuleCall_3_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8414);
                    lv_saturation_34_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"saturation",
                            		lv_saturation_34_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_35=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8427); 

                        	newLeafNode(otherlv_35, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_3_6());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4079:1: ( (lv_lightness_36_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4080:1: (lv_lightness_36_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4080:1: (lv_lightness_36_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4081:3: lv_lightness_36_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getLightnessColorComponentLiteralParserRuleCall_3_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8447);
                    lv_lightness_36_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lightness",
                            		lv_lightness_36_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_37=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8460); 

                        	newLeafNode(otherlv_37, grammarAccess.getComponentColorLiteralAccess().getCommaKeyword_3_8());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4102:1: ( (lv_opacity_38_0= ruleColorComponentLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4103:1: (lv_opacity_38_0= ruleColorComponentLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4103:1: (lv_opacity_38_0= ruleColorComponentLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4104:3: lv_opacity_38_0= ruleColorComponentLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentColorLiteralAccess().getOpacityColorComponentLiteralParserRuleCall_3_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8480);
                    lv_opacity_38_0=ruleColorComponentLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentColorLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"opacity",
                            		lv_opacity_38_0, 
                            		"ColorComponentLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_39=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8493); 

                        	newLeafNode(otherlv_39, grammarAccess.getComponentColorLiteralAccess().getRightParenthesisKeyword_3_10());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentColorLiteral"


    // $ANTLR start "entryRuleColorComponentLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4133:1: entryRuleColorComponentLiteral returns [EObject current=null] : iv_ruleColorComponentLiteral= ruleColorComponentLiteral EOF ;
    public final EObject entryRuleColorComponentLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorComponentLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4137:2: (iv_ruleColorComponentLiteral= ruleColorComponentLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4138:2: iv_ruleColorComponentLiteral= ruleColorComponentLiteral EOF
            {
             newCompositeNode(grammarAccess.getColorComponentLiteralRule()); 
            pushFollow(FOLLOW_ruleColorComponentLiteral_in_entryRuleColorComponentLiteral8534);
            iv_ruleColorComponentLiteral=ruleColorComponentLiteral();

            state._fsp--;

             current =iv_ruleColorComponentLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorComponentLiteral8544); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleColorComponentLiteral"


    // $ANTLR start "ruleColorComponentLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4148:1: ruleColorComponentLiteral returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumberLiteral ) ) ( (lv_percentage_1_0= KEYWORD_1 ) )? ) ;
    public final EObject ruleColorComponentLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_percentage_1_0=null;
        EObject lv_number_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4152:28: ( ( ( (lv_number_0_0= ruleNumberLiteral ) ) ( (lv_percentage_1_0= KEYWORD_1 ) )? ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4153:1: ( ( (lv_number_0_0= ruleNumberLiteral ) ) ( (lv_percentage_1_0= KEYWORD_1 ) )? )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4153:1: ( ( (lv_number_0_0= ruleNumberLiteral ) ) ( (lv_percentage_1_0= KEYWORD_1 ) )? )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4153:2: ( (lv_number_0_0= ruleNumberLiteral ) ) ( (lv_percentage_1_0= KEYWORD_1 ) )?
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4153:2: ( (lv_number_0_0= ruleNumberLiteral ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4154:1: (lv_number_0_0= ruleNumberLiteral )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4154:1: (lv_number_0_0= ruleNumberLiteral )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4155:3: lv_number_0_0= ruleNumberLiteral
            {
             
            	        newCompositeNode(grammarAccess.getColorComponentLiteralAccess().getNumberNumberLiteralParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLiteral_in_ruleColorComponentLiteral8594);
            lv_number_0_0=ruleNumberLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorComponentLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_0_0, 
                    		"NumberLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4171:2: ( (lv_percentage_1_0= KEYWORD_1 ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEYWORD_1) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4172:1: (lv_percentage_1_0= KEYWORD_1 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4172:1: (lv_percentage_1_0= KEYWORD_1 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4173:3: lv_percentage_1_0= KEYWORD_1
                    {
                    lv_percentage_1_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleColorComponentLiteral8613); 

                            newLeafNode(lv_percentage_1_0, grammarAccess.getColorComponentLiteralAccess().getPercentagePercentSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColorComponentLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "percentage", true, "%");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColorComponentLiteral"


    // $ANTLR start "entryRuleURLLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4198:1: entryRuleURLLiteral returns [EObject current=null] : iv_ruleURLLiteral= ruleURLLiteral EOF ;
    public final EObject entryRuleURLLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4199:2: (iv_ruleURLLiteral= ruleURLLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4200:2: iv_ruleURLLiteral= ruleURLLiteral EOF
            {
             newCompositeNode(grammarAccess.getURLLiteralRule()); 
            pushFollow(FOLLOW_ruleURLLiteral_in_entryRuleURLLiteral8664);
            iv_ruleURLLiteral=ruleURLLiteral();

            state._fsp--;

             current =iv_ruleURLLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLLiteral8674); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURLLiteral"


    // $ANTLR start "ruleURLLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4207:1: ruleURLLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_URL ) ) ;
    public final EObject ruleURLLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4210:28: ( ( (lv_value_0_0= RULE_URL ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4211:1: ( (lv_value_0_0= RULE_URL ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4211:1: ( (lv_value_0_0= RULE_URL ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4212:1: (lv_value_0_0= RULE_URL )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4212:1: (lv_value_0_0= RULE_URL )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4213:3: lv_value_0_0= RULE_URL
            {
            lv_value_0_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleURLLiteral8715); 

            			newLeafNode(lv_value_0_0, grammarAccess.getURLLiteralAccess().getValueURLTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURLLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"URL");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURLLiteral"


    // $ANTLR start "entryRuleFunctionCallLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4239:1: entryRuleFunctionCallLiteral returns [EObject current=null] : iv_ruleFunctionCallLiteral= ruleFunctionCallLiteral EOF ;
    public final EObject entryRuleFunctionCallLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4240:2: (iv_ruleFunctionCallLiteral= ruleFunctionCallLiteral EOF )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4241:2: iv_ruleFunctionCallLiteral= ruleFunctionCallLiteral EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallLiteralRule()); 
            pushFollow(FOLLOW_ruleFunctionCallLiteral_in_entryRuleFunctionCallLiteral8756);
            iv_ruleFunctionCallLiteral=ruleFunctionCallLiteral();

            state._fsp--;

             current =iv_ruleFunctionCallLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallLiteral8766); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallLiteral"


    // $ANTLR start "ruleFunctionCallLiteral"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4248:1: ruleFunctionCallLiteral returns [EObject current=null] : ( ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 ) | ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 ) ) ;
    public final EObject ruleFunctionCallLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_opacity_11_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4251:28: ( ( ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 ) | ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:1: ( ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 ) | ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:1: ( ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 ) | ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_IDENT) ) {
                alt72=1;
            }
            else if ( (LA72_0==KEYWORD_48) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:2: ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:2: ( ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:3: ( (lv_function_0_0= RULE_IDENT ) ) otherlv_1= KEYWORD_2 ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )? otherlv_5= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4252:3: ( (lv_function_0_0= RULE_IDENT ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4253:1: (lv_function_0_0= RULE_IDENT )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4253:1: (lv_function_0_0= RULE_IDENT )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4254:3: lv_function_0_0= RULE_IDENT
                    {
                    lv_function_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFunctionCallLiteral8809); 

                    			newLeafNode(lv_function_0_0, grammarAccess.getFunctionCallLiteralAccess().getFunctionIDENTTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionCallLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"function",
                            		lv_function_0_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFunctionCallLiteral8827); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionCallLiteralAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4275:1: ( ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=KEYWORD_48 && LA71_0<=KEYWORD_49)||LA71_0==KEYWORD_54||LA71_0==KEYWORD_39||LA71_0==KEYWORD_44||LA71_0==KEYWORD_34||LA71_0==KEYWORD_37||LA71_0==RULE_HEX_COLOR||LA71_0==RULE_IDENT||LA71_0==RULE_URL||(LA71_0>=RULE_INT && LA71_0<=RULE_STRING)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4275:2: ( (lv_arguments_2_0= ruleValueLiteral ) ) (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )*
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4275:2: ( (lv_arguments_2_0= ruleValueLiteral ) )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4276:1: (lv_arguments_2_0= ruleValueLiteral )
                            {
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4276:1: (lv_arguments_2_0= ruleValueLiteral )
                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4277:3: lv_arguments_2_0= ruleValueLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionCallLiteralAccess().getArgumentsValueLiteralParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleValueLiteral_in_ruleFunctionCallLiteral8848);
                            lv_arguments_2_0=ruleValueLiteral();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionCallLiteralRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"arguments",
                                    		lv_arguments_2_0, 
                                    		"ValueLiteral");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4293:2: (otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==KEYWORD_6) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4294:2: otherlv_3= KEYWORD_6 ( (lv_arguments_4_0= ruleValueLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleFunctionCallLiteral8862); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallLiteralAccess().getCommaKeyword_0_2_1_0());
                            	        
                            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4298:1: ( (lv_arguments_4_0= ruleValueLiteral ) )
                            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4299:1: (lv_arguments_4_0= ruleValueLiteral )
                            	    {
                            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4299:1: (lv_arguments_4_0= ruleValueLiteral )
                            	    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4300:3: lv_arguments_4_0= ruleValueLiteral
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFunctionCallLiteralAccess().getArgumentsValueLiteralParserRuleCall_0_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleValueLiteral_in_ruleFunctionCallLiteral8882);
                            	    lv_arguments_4_0=ruleValueLiteral();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFunctionCallLiteralRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"arguments",
                            	            		lv_arguments_4_0, 
                            	            		"ValueLiteral");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFunctionCallLiteral8899); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionCallLiteralAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4322:6: ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4322:6: ( () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4322:7: () otherlv_7= KEYWORD_48 otherlv_8= KEYWORD_2 otherlv_9= KEYWORD_62 otherlv_10= KEYWORD_11 ( (lv_opacity_11_0= ruleNumberLiteral ) ) otherlv_12= KEYWORD_3
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4322:7: ()
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4323:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFunctionCallLiteralAccess().getAlphaLiteralAction_1_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleFunctionCallLiteral8928); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionCallLiteralAccess().getAlphaKeyword_1_1());
                        
                    otherlv_8=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFunctionCallLiteral8940); 

                        	newLeafNode(otherlv_8, grammarAccess.getFunctionCallLiteralAccess().getLeftParenthesisKeyword_1_2());
                        
                    otherlv_9=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleFunctionCallLiteral8952); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionCallLiteralAccess().getOpacityKeyword_1_3());
                        
                    otherlv_10=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleFunctionCallLiteral8964); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionCallLiteralAccess().getEqualsSignKeyword_1_4());
                        
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4348:1: ( (lv_opacity_11_0= ruleNumberLiteral ) )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4349:1: (lv_opacity_11_0= ruleNumberLiteral )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4349:1: (lv_opacity_11_0= ruleNumberLiteral )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4350:3: lv_opacity_11_0= ruleNumberLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallLiteralAccess().getOpacityNumberLiteralParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleFunctionCallLiteral8984);
                    lv_opacity_11_0=ruleNumberLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"opacity",
                            		lv_opacity_11_0, 
                            		"NumberLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFunctionCallLiteral8997); 

                        	newLeafNode(otherlv_12, grammarAccess.getFunctionCallLiteralAccess().getRightParenthesisKeyword_1_6());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallLiteral"


    // $ANTLR start "ruleKnownProperties"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4379:1: ruleKnownProperties returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_50 ) | (enumLiteral_1= KEYWORD_70 ) ) ;
    public final Enumerator ruleKnownProperties() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4381:28: ( ( (enumLiteral_0= KEYWORD_50 ) | (enumLiteral_1= KEYWORD_70 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4382:1: ( (enumLiteral_0= KEYWORD_50 ) | (enumLiteral_1= KEYWORD_70 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4382:1: ( (enumLiteral_0= KEYWORD_50 ) | (enumLiteral_1= KEYWORD_70 ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KEYWORD_50) ) {
                alt73=1;
            }
            else if ( (LA73_0==KEYWORD_70) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4382:2: (enumLiteral_0= KEYWORD_50 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4382:2: (enumLiteral_0= KEYWORD_50 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4382:7: enumLiteral_0= KEYWORD_50
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleKnownProperties9050); 

                            current = grammarAccess.getKnownPropertiesAccess().getColorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getKnownPropertiesAccess().getColorEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4388:6: (enumLiteral_1= KEYWORD_70 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4388:6: (enumLiteral_1= KEYWORD_70 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4388:11: enumLiteral_1= KEYWORD_70
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleKnownProperties9072); 

                            current = grammarAccess.getKnownPropertiesAccess().getBorder_topEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getKnownPropertiesAccess().getBorder_topEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnownProperties"


    // $ANTLR start "ruleAttributeSelectorMatchers"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4398:1: ruleAttributeSelectorMatchers returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_20 ) | (enumLiteral_2= KEYWORD_21 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_32 ) | (enumLiteral_5= KEYWORD_31 ) ) ;
    public final Enumerator ruleAttributeSelectorMatchers() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4400:28: ( ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_20 ) | (enumLiteral_2= KEYWORD_21 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_32 ) | (enumLiteral_5= KEYWORD_31 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4401:1: ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_20 ) | (enumLiteral_2= KEYWORD_21 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_32 ) | (enumLiteral_5= KEYWORD_31 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4401:1: ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_20 ) | (enumLiteral_2= KEYWORD_21 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_32 ) | (enumLiteral_5= KEYWORD_31 ) )
            int alt74=6;
            switch ( input.LA(1) ) {
            case KEYWORD_22:
                {
                alt74=1;
                }
                break;
            case KEYWORD_20:
                {
                alt74=2;
                }
                break;
            case KEYWORD_21:
                {
                alt74=3;
                }
                break;
            case KEYWORD_11:
                {
                alt74=4;
                }
                break;
            case KEYWORD_32:
                {
                alt74=5;
                }
                break;
            case KEYWORD_31:
                {
                alt74=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4401:2: (enumLiteral_0= KEYWORD_22 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4401:2: (enumLiteral_0= KEYWORD_22 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4401:7: enumLiteral_0= KEYWORD_22
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleAttributeSelectorMatchers9122); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getPrefixEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeSelectorMatchersAccess().getPrefixEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4407:6: (enumLiteral_1= KEYWORD_20 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4407:6: (enumLiteral_1= KEYWORD_20 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4407:11: enumLiteral_1= KEYWORD_20
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAttributeSelectorMatchers9144); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getSuffixEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeSelectorMatchersAccess().getSuffixEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4413:6: (enumLiteral_2= KEYWORD_21 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4413:6: (enumLiteral_2= KEYWORD_21 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4413:11: enumLiteral_2= KEYWORD_21
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAttributeSelectorMatchers9166); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getSubstringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeSelectorMatchersAccess().getSubstringEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4419:6: (enumLiteral_3= KEYWORD_11 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4419:6: (enumLiteral_3= KEYWORD_11 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4419:11: enumLiteral_3= KEYWORD_11
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleAttributeSelectorMatchers9188); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getExactEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeSelectorMatchersAccess().getExactEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4425:6: (enumLiteral_4= KEYWORD_32 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4425:6: (enumLiteral_4= KEYWORD_32 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4425:11: enumLiteral_4= KEYWORD_32
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleAttributeSelectorMatchers9210); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getIncludesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAttributeSelectorMatchersAccess().getIncludesEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4431:6: (enumLiteral_5= KEYWORD_31 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4431:6: (enumLiteral_5= KEYWORD_31 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4431:11: enumLiteral_5= KEYWORD_31
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleAttributeSelectorMatchers9232); 

                            current = grammarAccess.getAttributeSelectorMatchersAccess().getLanguageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAttributeSelectorMatchersAccess().getLanguageEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeSelectorMatchers"


    // $ANTLR start "ruleNoArgsPseudos"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4441:1: ruleNoArgsPseudos returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_41 ) | (enumLiteral_1= KEYWORD_63 ) | (enumLiteral_2= KEYWORD_53 ) | (enumLiteral_3= KEYWORD_56 ) | (enumLiteral_4= KEYWORD_52 ) | (enumLiteral_5= KEYWORD_58 ) | (enumLiteral_6= KEYWORD_61 ) | (enumLiteral_7= KEYWORD_65 ) | (enumLiteral_8= KEYWORD_60 ) | (enumLiteral_9= KEYWORD_80 ) | (enumLiteral_10= KEYWORD_45 ) | (enumLiteral_11= KEYWORD_74 ) | (enumLiteral_12= KEYWORD_72 ) | (enumLiteral_13= KEYWORD_73 ) | (enumLiteral_14= KEYWORD_51 ) ) ;
    public final Enumerator ruleNoArgsPseudos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4443:28: ( ( (enumLiteral_0= KEYWORD_41 ) | (enumLiteral_1= KEYWORD_63 ) | (enumLiteral_2= KEYWORD_53 ) | (enumLiteral_3= KEYWORD_56 ) | (enumLiteral_4= KEYWORD_52 ) | (enumLiteral_5= KEYWORD_58 ) | (enumLiteral_6= KEYWORD_61 ) | (enumLiteral_7= KEYWORD_65 ) | (enumLiteral_8= KEYWORD_60 ) | (enumLiteral_9= KEYWORD_80 ) | (enumLiteral_10= KEYWORD_45 ) | (enumLiteral_11= KEYWORD_74 ) | (enumLiteral_12= KEYWORD_72 ) | (enumLiteral_13= KEYWORD_73 ) | (enumLiteral_14= KEYWORD_51 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4444:1: ( (enumLiteral_0= KEYWORD_41 ) | (enumLiteral_1= KEYWORD_63 ) | (enumLiteral_2= KEYWORD_53 ) | (enumLiteral_3= KEYWORD_56 ) | (enumLiteral_4= KEYWORD_52 ) | (enumLiteral_5= KEYWORD_58 ) | (enumLiteral_6= KEYWORD_61 ) | (enumLiteral_7= KEYWORD_65 ) | (enumLiteral_8= KEYWORD_60 ) | (enumLiteral_9= KEYWORD_80 ) | (enumLiteral_10= KEYWORD_45 ) | (enumLiteral_11= KEYWORD_74 ) | (enumLiteral_12= KEYWORD_72 ) | (enumLiteral_13= KEYWORD_73 ) | (enumLiteral_14= KEYWORD_51 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4444:1: ( (enumLiteral_0= KEYWORD_41 ) | (enumLiteral_1= KEYWORD_63 ) | (enumLiteral_2= KEYWORD_53 ) | (enumLiteral_3= KEYWORD_56 ) | (enumLiteral_4= KEYWORD_52 ) | (enumLiteral_5= KEYWORD_58 ) | (enumLiteral_6= KEYWORD_61 ) | (enumLiteral_7= KEYWORD_65 ) | (enumLiteral_8= KEYWORD_60 ) | (enumLiteral_9= KEYWORD_80 ) | (enumLiteral_10= KEYWORD_45 ) | (enumLiteral_11= KEYWORD_74 ) | (enumLiteral_12= KEYWORD_72 ) | (enumLiteral_13= KEYWORD_73 ) | (enumLiteral_14= KEYWORD_51 ) )
            int alt75=15;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
                {
                alt75=1;
                }
                break;
            case KEYWORD_63:
                {
                alt75=2;
                }
                break;
            case KEYWORD_53:
                {
                alt75=3;
                }
                break;
            case KEYWORD_56:
                {
                alt75=4;
                }
                break;
            case KEYWORD_52:
                {
                alt75=5;
                }
                break;
            case KEYWORD_58:
                {
                alt75=6;
                }
                break;
            case KEYWORD_61:
                {
                alt75=7;
                }
                break;
            case KEYWORD_65:
                {
                alt75=8;
                }
                break;
            case KEYWORD_60:
                {
                alt75=9;
                }
                break;
            case KEYWORD_80:
                {
                alt75=10;
                }
                break;
            case KEYWORD_45:
                {
                alt75=11;
                }
                break;
            case KEYWORD_74:
                {
                alt75=12;
                }
                break;
            case KEYWORD_72:
                {
                alt75=13;
                }
                break;
            case KEYWORD_73:
                {
                alt75=14;
                }
                break;
            case KEYWORD_51:
                {
                alt75=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4444:2: (enumLiteral_0= KEYWORD_41 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4444:2: (enumLiteral_0= KEYWORD_41 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4444:7: enumLiteral_0= KEYWORD_41
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleNoArgsPseudos9282); 

                            current = grammarAccess.getNoArgsPseudosAccess().getLinkEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNoArgsPseudosAccess().getLinkEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4450:6: (enumLiteral_1= KEYWORD_63 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4450:6: (enumLiteral_1= KEYWORD_63 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4450:11: enumLiteral_1= KEYWORD_63
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleNoArgsPseudos9304); 

                            current = grammarAccess.getNoArgsPseudosAccess().getVisitedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNoArgsPseudosAccess().getVisitedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4456:6: (enumLiteral_2= KEYWORD_53 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4456:6: (enumLiteral_2= KEYWORD_53 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4456:11: enumLiteral_2= KEYWORD_53
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleNoArgsPseudos9326); 

                            current = grammarAccess.getNoArgsPseudosAccess().getHoverEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNoArgsPseudosAccess().getHoverEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4462:6: (enumLiteral_3= KEYWORD_56 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4462:6: (enumLiteral_3= KEYWORD_56 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4462:11: enumLiteral_3= KEYWORD_56
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleNoArgsPseudos9348); 

                            current = grammarAccess.getNoArgsPseudosAccess().getActiveEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNoArgsPseudosAccess().getActiveEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4468:6: (enumLiteral_4= KEYWORD_52 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4468:6: (enumLiteral_4= KEYWORD_52 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4468:11: enumLiteral_4= KEYWORD_52
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleNoArgsPseudos9370); 

                            current = grammarAccess.getNoArgsPseudosAccess().getFocusEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getNoArgsPseudosAccess().getFocusEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4474:6: (enumLiteral_5= KEYWORD_58 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4474:6: (enumLiteral_5= KEYWORD_58 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4474:11: enumLiteral_5= KEYWORD_58
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleNoArgsPseudos9392); 

                            current = grammarAccess.getNoArgsPseudosAccess().getTargetEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getNoArgsPseudosAccess().getTargetEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4480:6: (enumLiteral_6= KEYWORD_61 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4480:6: (enumLiteral_6= KEYWORD_61 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4480:11: enumLiteral_6= KEYWORD_61
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleNoArgsPseudos9414); 

                            current = grammarAccess.getNoArgsPseudosAccess().getEnabledEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getNoArgsPseudosAccess().getEnabledEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4486:6: (enumLiteral_7= KEYWORD_65 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4486:6: (enumLiteral_7= KEYWORD_65 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4486:11: enumLiteral_7= KEYWORD_65
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleNoArgsPseudos9436); 

                            current = grammarAccess.getNoArgsPseudosAccess().getDisabledEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getNoArgsPseudosAccess().getDisabledEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4492:6: (enumLiteral_8= KEYWORD_60 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4492:6: (enumLiteral_8= KEYWORD_60 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4492:11: enumLiteral_8= KEYWORD_60
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleNoArgsPseudos9458); 

                            current = grammarAccess.getNoArgsPseudosAccess().getCheckedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getNoArgsPseudosAccess().getCheckedEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4498:6: (enumLiteral_9= KEYWORD_80 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4498:6: (enumLiteral_9= KEYWORD_80 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4498:11: enumLiteral_9= KEYWORD_80
                    {
                    enumLiteral_9=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleNoArgsPseudos9480); 

                            current = grammarAccess.getNoArgsPseudosAccess().getIndeterminateEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getNoArgsPseudosAccess().getIndeterminateEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4504:6: (enumLiteral_10= KEYWORD_45 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4504:6: (enumLiteral_10= KEYWORD_45 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4504:11: enumLiteral_10= KEYWORD_45
                    {
                    enumLiteral_10=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleNoArgsPseudos9502); 

                            current = grammarAccess.getNoArgsPseudosAccess().getRootEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getNoArgsPseudosAccess().getRootEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4510:6: (enumLiteral_11= KEYWORD_74 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4510:6: (enumLiteral_11= KEYWORD_74 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4510:11: enumLiteral_11= KEYWORD_74
                    {
                    enumLiteral_11=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleNoArgsPseudos9524); 

                            current = grammarAccess.getNoArgsPseudosAccess().getFirstChildEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getNoArgsPseudosAccess().getFirstChildEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4516:6: (enumLiteral_12= KEYWORD_72 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4516:6: (enumLiteral_12= KEYWORD_72 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4516:11: enumLiteral_12= KEYWORD_72
                    {
                    enumLiteral_12=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleNoArgsPseudos9546); 

                            current = grammarAccess.getNoArgsPseudosAccess().getLastChildEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getNoArgsPseudosAccess().getLastChildEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4522:6: (enumLiteral_13= KEYWORD_73 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4522:6: (enumLiteral_13= KEYWORD_73 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4522:11: enumLiteral_13= KEYWORD_73
                    {
                    enumLiteral_13=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleNoArgsPseudos9568); 

                            current = grammarAccess.getNoArgsPseudosAccess().getOnlyChildEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getNoArgsPseudosAccess().getOnlyChildEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4528:6: (enumLiteral_14= KEYWORD_51 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4528:6: (enumLiteral_14= KEYWORD_51 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4528:11: enumLiteral_14= KEYWORD_51
                    {
                    enumLiteral_14=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleNoArgsPseudos9590); 

                            current = grammarAccess.getNoArgsPseudosAccess().getEmptyEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getNoArgsPseudosAccess().getEmptyEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoArgsPseudos"


    // $ANTLR start "rulePseudoElements"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4538:1: rulePseudoElements returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_71 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_47 ) ) ;
    public final Enumerator rulePseudoElements() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4540:28: ( ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_71 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_47 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4541:1: ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_71 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_47 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4541:1: ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_71 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_47 ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case KEYWORD_76:
                {
                alt76=1;
                }
                break;
            case KEYWORD_71:
                {
                alt76=2;
                }
                break;
            case KEYWORD_57:
                {
                alt76=3;
                }
                break;
            case KEYWORD_47:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4541:2: (enumLiteral_0= KEYWORD_76 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4541:2: (enumLiteral_0= KEYWORD_76 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4541:7: enumLiteral_0= KEYWORD_76
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_rulePseudoElements9640); 

                            current = grammarAccess.getPseudoElementsAccess().getFirstLetterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPseudoElementsAccess().getFirstLetterEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4547:6: (enumLiteral_1= KEYWORD_71 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4547:6: (enumLiteral_1= KEYWORD_71 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4547:11: enumLiteral_1= KEYWORD_71
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_rulePseudoElements9662); 

                            current = grammarAccess.getPseudoElementsAccess().getFirstLineEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPseudoElementsAccess().getFirstLineEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4553:6: (enumLiteral_2= KEYWORD_57 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4553:6: (enumLiteral_2= KEYWORD_57 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4553:11: enumLiteral_2= KEYWORD_57
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rulePseudoElements9684); 

                            current = grammarAccess.getPseudoElementsAccess().getBeforeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPseudoElementsAccess().getBeforeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4559:6: (enumLiteral_3= KEYWORD_47 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4559:6: (enumLiteral_3= KEYWORD_47 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4559:11: enumLiteral_3= KEYWORD_47
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rulePseudoElements9706); 

                            current = grammarAccess.getPseudoElementsAccess().getAfterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPseudoElementsAccess().getAfterEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoElements"


    // $ANTLR start "ruleFunctionalPseudoClasses"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4569:1: ruleFunctionalPseudoClasses returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_66 ) | (enumLiteral_1= KEYWORD_81 ) | (enumLiteral_2= KEYWORD_75 ) | (enumLiteral_3= KEYWORD_82 ) | (enumLiteral_4= KEYWORD_79 ) | (enumLiteral_5= KEYWORD_77 ) | (enumLiteral_6= KEYWORD_78 ) ) ;
    public final Enumerator ruleFunctionalPseudoClasses() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4571:28: ( ( (enumLiteral_0= KEYWORD_66 ) | (enumLiteral_1= KEYWORD_81 ) | (enumLiteral_2= KEYWORD_75 ) | (enumLiteral_3= KEYWORD_82 ) | (enumLiteral_4= KEYWORD_79 ) | (enumLiteral_5= KEYWORD_77 ) | (enumLiteral_6= KEYWORD_78 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4572:1: ( (enumLiteral_0= KEYWORD_66 ) | (enumLiteral_1= KEYWORD_81 ) | (enumLiteral_2= KEYWORD_75 ) | (enumLiteral_3= KEYWORD_82 ) | (enumLiteral_4= KEYWORD_79 ) | (enumLiteral_5= KEYWORD_77 ) | (enumLiteral_6= KEYWORD_78 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4572:1: ( (enumLiteral_0= KEYWORD_66 ) | (enumLiteral_1= KEYWORD_81 ) | (enumLiteral_2= KEYWORD_75 ) | (enumLiteral_3= KEYWORD_82 ) | (enumLiteral_4= KEYWORD_79 ) | (enumLiteral_5= KEYWORD_77 ) | (enumLiteral_6= KEYWORD_78 ) )
            int alt77=7;
            switch ( input.LA(1) ) {
            case KEYWORD_66:
                {
                alt77=1;
                }
                break;
            case KEYWORD_81:
                {
                alt77=2;
                }
                break;
            case KEYWORD_75:
                {
                alt77=3;
                }
                break;
            case KEYWORD_82:
                {
                alt77=4;
                }
                break;
            case KEYWORD_79:
                {
                alt77=5;
                }
                break;
            case KEYWORD_77:
                {
                alt77=6;
                }
                break;
            case KEYWORD_78:
                {
                alt77=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4572:2: (enumLiteral_0= KEYWORD_66 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4572:2: (enumLiteral_0= KEYWORD_66 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4572:7: enumLiteral_0= KEYWORD_66
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleFunctionalPseudoClasses9756); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getNthChildEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFunctionalPseudoClassesAccess().getNthChildEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4578:6: (enumLiteral_1= KEYWORD_81 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4578:6: (enumLiteral_1= KEYWORD_81 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4578:11: enumLiteral_1= KEYWORD_81
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleFunctionalPseudoClasses9778); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getNthLastChildEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFunctionalPseudoClassesAccess().getNthLastChildEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4584:6: (enumLiteral_2= KEYWORD_75 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4584:6: (enumLiteral_2= KEYWORD_75 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4584:11: enumLiteral_2= KEYWORD_75
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleFunctionalPseudoClasses9800); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getNthOfTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFunctionalPseudoClassesAccess().getNthOfTypeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4590:6: (enumLiteral_3= KEYWORD_82 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4590:6: (enumLiteral_3= KEYWORD_82 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4590:11: enumLiteral_3= KEYWORD_82
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleFunctionalPseudoClasses9822); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getNthLastOfTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFunctionalPseudoClassesAccess().getNthLastOfTypeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4596:6: (enumLiteral_4= KEYWORD_79 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4596:6: (enumLiteral_4= KEYWORD_79 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4596:11: enumLiteral_4= KEYWORD_79
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleFunctionalPseudoClasses9844); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getFirstOfTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFunctionalPseudoClassesAccess().getFirstOfTypeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4602:6: (enumLiteral_5= KEYWORD_77 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4602:6: (enumLiteral_5= KEYWORD_77 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4602:11: enumLiteral_5= KEYWORD_77
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleFunctionalPseudoClasses9866); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getLastOfTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFunctionalPseudoClassesAccess().getLastOfTypeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4608:6: (enumLiteral_6= KEYWORD_78 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4608:6: (enumLiteral_6= KEYWORD_78 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4608:11: enumLiteral_6= KEYWORD_78
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleFunctionalPseudoClasses9888); 

                            current = grammarAccess.getFunctionalPseudoClassesAccess().getOnlyOfTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFunctionalPseudoClassesAccess().getOnlyOfTypeEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalPseudoClasses"


    // $ANTLR start "ruleParities"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4618:1: ruleParities returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_36 ) | (enumLiteral_1= KEYWORD_38 ) ) ;
    public final Enumerator ruleParities() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4620:28: ( ( (enumLiteral_0= KEYWORD_36 ) | (enumLiteral_1= KEYWORD_38 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4621:1: ( (enumLiteral_0= KEYWORD_36 ) | (enumLiteral_1= KEYWORD_38 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4621:1: ( (enumLiteral_0= KEYWORD_36 ) | (enumLiteral_1= KEYWORD_38 ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==KEYWORD_36) ) {
                alt78=1;
            }
            else if ( (LA78_0==KEYWORD_38) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4621:2: (enumLiteral_0= KEYWORD_36 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4621:2: (enumLiteral_0= KEYWORD_36 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4621:7: enumLiteral_0= KEYWORD_36
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleParities9938); 

                            current = grammarAccess.getParitiesAccess().getOddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getParitiesAccess().getOddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4627:6: (enumLiteral_1= KEYWORD_38 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4627:6: (enumLiteral_1= KEYWORD_38 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4627:11: enumLiteral_1= KEYWORD_38
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleParities9960); 

                            current = grammarAccess.getParitiesAccess().getEvenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getParitiesAccess().getEvenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParities"


    // $ANTLR start "ruleDimensions"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4637:1: ruleDimensions returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_23 ) | (enumLiteral_2= KEYWORD_27 ) | (enumLiteral_3= KEYWORD_29 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_24 ) | (enumLiteral_6= KEYWORD_25 ) | (enumLiteral_7= KEYWORD_30 ) | (enumLiteral_8= KEYWORD_1 ) ) ;
    public final Enumerator ruleDimensions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4639:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_23 ) | (enumLiteral_2= KEYWORD_27 ) | (enumLiteral_3= KEYWORD_29 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_24 ) | (enumLiteral_6= KEYWORD_25 ) | (enumLiteral_7= KEYWORD_30 ) | (enumLiteral_8= KEYWORD_1 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4640:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_23 ) | (enumLiteral_2= KEYWORD_27 ) | (enumLiteral_3= KEYWORD_29 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_24 ) | (enumLiteral_6= KEYWORD_25 ) | (enumLiteral_7= KEYWORD_30 ) | (enumLiteral_8= KEYWORD_1 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4640:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_23 ) | (enumLiteral_2= KEYWORD_27 ) | (enumLiteral_3= KEYWORD_29 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_24 ) | (enumLiteral_6= KEYWORD_25 ) | (enumLiteral_7= KEYWORD_30 ) | (enumLiteral_8= KEYWORD_1 ) )
            int alt79=9;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt79=1;
                }
                break;
            case KEYWORD_23:
                {
                alt79=2;
                }
                break;
            case KEYWORD_27:
                {
                alt79=3;
                }
                break;
            case KEYWORD_29:
                {
                alt79=4;
                }
                break;
            case KEYWORD_28:
                {
                alt79=5;
                }
                break;
            case KEYWORD_24:
                {
                alt79=6;
                }
                break;
            case KEYWORD_25:
                {
                alt79=7;
                }
                break;
            case KEYWORD_30:
                {
                alt79=8;
                }
                break;
            case KEYWORD_1:
                {
                alt79=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4640:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4640:2: (enumLiteral_0= KEYWORD_26 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4640:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleDimensions10010); 

                            current = grammarAccess.getDimensionsAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDimensionsAccess().getInEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4646:6: (enumLiteral_1= KEYWORD_23 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4646:6: (enumLiteral_1= KEYWORD_23 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4646:11: enumLiteral_1= KEYWORD_23
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleDimensions10032); 

                            current = grammarAccess.getDimensionsAccess().getCmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDimensionsAccess().getCmEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4652:6: (enumLiteral_2= KEYWORD_27 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4652:6: (enumLiteral_2= KEYWORD_27 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4652:11: enumLiteral_2= KEYWORD_27
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleDimensions10054); 

                            current = grammarAccess.getDimensionsAccess().getMmEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDimensionsAccess().getMmEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4658:6: (enumLiteral_3= KEYWORD_29 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4658:6: (enumLiteral_3= KEYWORD_29 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4658:11: enumLiteral_3= KEYWORD_29
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleDimensions10076); 

                            current = grammarAccess.getDimensionsAccess().getPtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDimensionsAccess().getPtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4664:6: (enumLiteral_4= KEYWORD_28 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4664:6: (enumLiteral_4= KEYWORD_28 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4664:11: enumLiteral_4= KEYWORD_28
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleDimensions10098); 

                            current = grammarAccess.getDimensionsAccess().getPcEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDimensionsAccess().getPcEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4670:6: (enumLiteral_5= KEYWORD_24 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4670:6: (enumLiteral_5= KEYWORD_24 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4670:11: enumLiteral_5= KEYWORD_24
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleDimensions10120); 

                            current = grammarAccess.getDimensionsAccess().getEmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDimensionsAccess().getEmEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4676:6: (enumLiteral_6= KEYWORD_25 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4676:6: (enumLiteral_6= KEYWORD_25 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4676:11: enumLiteral_6= KEYWORD_25
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleDimensions10142); 

                            current = grammarAccess.getDimensionsAccess().getExEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDimensionsAccess().getExEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4682:6: (enumLiteral_7= KEYWORD_30 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4682:6: (enumLiteral_7= KEYWORD_30 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4682:11: enumLiteral_7= KEYWORD_30
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleDimensions10164); 

                            current = grammarAccess.getDimensionsAccess().getPxEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDimensionsAccess().getPxEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4688:6: (enumLiteral_8= KEYWORD_1 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4688:6: (enumLiteral_8= KEYWORD_1 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4688:11: enumLiteral_8= KEYWORD_1
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleDimensions10186); 

                            current = grammarAccess.getDimensionsAccess().getPercEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDimensionsAccess().getPercEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensions"


    // $ANTLR start "ruleColorNames"
    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4698:1: ruleColorNames returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_49 ) | (enumLiteral_1= KEYWORD_54 ) ) ;
    public final Enumerator ruleColorNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4700:28: ( ( (enumLiteral_0= KEYWORD_49 ) | (enumLiteral_1= KEYWORD_54 ) ) )
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4701:1: ( (enumLiteral_0= KEYWORD_49 ) | (enumLiteral_1= KEYWORD_54 ) )
            {
            // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4701:1: ( (enumLiteral_0= KEYWORD_49 ) | (enumLiteral_1= KEYWORD_54 ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KEYWORD_49) ) {
                alt80=1;
            }
            else if ( (LA80_0==KEYWORD_54) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4701:2: (enumLiteral_0= KEYWORD_49 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4701:2: (enumLiteral_0= KEYWORD_49 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4701:7: enumLiteral_0= KEYWORD_49
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleColorNames10236); 

                            current = grammarAccess.getColorNamesAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorNamesAccess().getBlackEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4707:6: (enumLiteral_1= KEYWORD_54 )
                    {
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4707:6: (enumLiteral_1= KEYWORD_54 )
                    // ../nl.dslmeinte.xtext.css/src-gen/nl/dslmeinte/xtext/css/parser/antlr/internal/InternalCSSParser.g:4707:11: enumLiteral_1= KEYWORD_54
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleColorNames10258); 

                            current = grammarAccess.getColorNamesAccess().getWhiteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorNamesAccess().getWhiteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorNames"

    // Delegated rules


    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA60_eotS =
        "\13\uffff";
    static final String DFA60_eofS =
        "\1\uffff\1\11\1\12\10\uffff";
    static final String DFA60_minS =
        "\1\106\2\105\1\106\4\uffff\1\106\2\uffff";
    static final String DFA60_maxS =
        "\1\135\2\123\1\132\4\uffff\1\132\2\uffff";
    static final String DFA60_acceptS =
        "\4\uffff\1\3\1\4\1\5\1\6\1\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\13\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\4\uffff\1\7\3\uffff\1\4\3\uffff\1\3\3\uffff\1\5\2\uffff"+
            "\1\1\1\uffff\1\5\1\6",
            "\1\11\15\uffff\1\10",
            "\1\12\15\uffff\1\10",
            "\1\12\23\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\12\23\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3252:1: (this_TypeSelector_0= ruleTypeSelector | this_UniversalSelector_1= ruleUniversalSelector | this_AttributeSelector_2= ruleAttributeSelector | this_IDSelector_3= ruleIDSelector | this_ClassSelector_4= ruleClassSelector | this_PseudoSelector_5= rulePseudoSelector )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStylesheet_in_entryRuleStylesheet67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStylesheet77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleStylesheet116 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStylesheet132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleStylesheet150 = new BitSet(new long[]{0x000000011080C002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleStylesheet172 = new BitSet(new long[]{0x000000011080C002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleCSSTopLevelStatement_in_ruleStylesheet194 = new BitSet(new long[]{0x000000011000C002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleCSSTopLevelStatement_in_entryRuleCSSTopLevelStatement230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSTopLevelStatement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleCSSTopLevelStatement287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSOtherTopLevelDeclaration_in_ruleCSSTopLevelStatement314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSOtherTopLevelDeclaration_in_entryRuleCSSOtherTopLevelDeclaration348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSOtherTopLevelDeclaration358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMediaDeclaration_in_ruleCSSOtherTopLevelDeclaration405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageDeclaration_in_ruleCSSOtherTopLevelDeclaration432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_ruleCSSOtherTopLevelDeclaration459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFaceDeclaration_in_ruleCSSOtherTopLevelDeclaration486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleImportDeclaration568 = new BitSet(new long[]{0x0000000000000000L,0x0000000440000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportDeclaration585 = new BitSet(new long[]{0x0000000000000000L,0x0000000004001000L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleImportDeclaration613 = new BitSet(new long[]{0x0000000000000000L,0x0000000004001000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleImportDeclaration637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleImportDeclaration656 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleImportDeclaration672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001100L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleImportDeclaration694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMediaDeclaration_in_entryRuleMediaDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMediaDeclaration738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleMediaDeclaration776 = new BitSet(new long[]{0x0008400000000000L,0x0000000004000010L});
    public static final BitSet FOLLOW_ruleMediaQuery_in_ruleMediaDeclaration796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMediaDeclaration810 = new BitSet(new long[]{0x0008400000000000L,0x0000000004000010L});
    public static final BitSet FOLLOW_ruleMediaQuery_in_ruleMediaDeclaration830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040100L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleMediaDeclaration845 = new BitSet(new long[]{0x0000003400010000L,0x0000000034988840L});
    public static final BitSet FOLLOW_ruleMediaDeclarationMembers_in_ruleMediaDeclaration865 = new BitSet(new long[]{0x0000003400010000L,0x0000000034988840L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleMediaDeclaration879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMediaDeclarationMembers_in_entryRuleMediaDeclarationMembers913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMediaDeclarationMembers923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_ruleMediaDeclarationMembers970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleMediaDeclarationMembers998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleMediaDeclarationMembers1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMediaQuery_in_entryRuleMediaQuery1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMediaQuery1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleMediaQuery1101 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleMediaQuery1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMediaQuery1167 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleMediaQuery1186 = new BitSet(new long[]{0x0008400000000000L,0x0000000004000010L});
    public static final BitSet FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1206 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1237 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleMediaQuery1251 = new BitSet(new long[]{0x0008400000000000L,0x0000000004000010L});
    public static final BitSet FOLLOW_ruleMediaQueryExpression_in_ruleMediaQuery1271 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleMediaQueryExpression_in_entryRuleMediaQueryExpression1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMediaQueryExpression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMediaQueryExpression1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMediaQueryExpression1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleMediaQueryExpression1392 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800000L});
    public static final BitSet FOLLOW_ruleValueLiteral_in_ruleMediaQueryExpression1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleMediaQueryExpression1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageDeclaration_in_entryRulePageDeclaration1461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rulePageDeclaration1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040800L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePageDeclaration1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePageDeclaration1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040800L});
    public static final BitSet FOLLOW_ruleRuleSetBody_in_rulePageDeclaration1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleNamespaceDeclaration1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000444000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleNamespaceDeclaration1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000440000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNamespaceDeclaration1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleNamespaceDeclaration1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNamespaceDeclaration1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontFaceDeclaration_in_entryRuleFontFaceDeclaration1765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontFaceDeclaration1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleFontFaceDeclaration1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040800L});
    public static final BitSet FOLLOW_ruleRuleSetBody_in_ruleFontFaceDeclaration1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleRuleSet1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040900L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleRuleSet1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleRuleSet1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040900L});
    public static final BitSet FOLLOW_ruleRuleSetBody_in_ruleRuleSet1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleSetBody_in_entryRuleRuleSetBody2016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSetBody2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleRuleSetBody2073 = new BitSet(new long[]{0x0000003400010000L,0x0000000034988840L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleSetBody2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleRuleSetBody2108 = new BitSet(new long[]{0x0000003400010000L,0x0000000034888840L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleSetBody2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleRuleSetBody2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleRuleSetBody2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration2194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnownPropertyDeclaration_in_rulePropertyDeclaration2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnrecognizedPropertyDeclaration_in_rulePropertyDeclaration2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnownPropertyDeclaration_in_entryRuleKnownPropertyDeclaration2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnownPropertyDeclaration2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnownProperties_in_ruleKnownPropertyDeclaration2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleKnownPropertyDeclaration2381 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800000L});
    public static final BitSet FOLLOW_rulePropertyValuesLists_in_ruleKnownPropertyDeclaration2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnrecognizedPropertyDeclaration_in_entryRuleUnrecognizedPropertyDeclaration2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnrecognizedPropertyDeclaration2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleUnrecognizedPropertyDeclaration2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnrecognizedPropertyDeclaration2505 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800000L});
    public static final BitSet FOLLOW_rulePropertyValuesLists_in_ruleUnrecognizedPropertyDeclaration2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyName2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rulePropertyName2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulePropertyName2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuesLists_in_entryRulePropertyValuesLists2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuesLists2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuesList_in_rulePropertyValuesLists2750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyValuesLists2764 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800000L});
    public static final BitSet FOLLOW_rulePropertyValuesList_in_rulePropertyValuesLists2784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rulePropertyValuesList_in_entryRulePropertyValuesList2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuesList2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_rulePropertyValuesList2876 = new BitSet(new long[]{0x0024850C00000002L,0x0000000744800000L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueLiteral_in_rulePropertyValue2977 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_rulePropertyValue2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombinatorExpression_in_ruleSelector3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombinatorExpression_in_entryRuleCombinatorExpression3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCombinatorExpression3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3203 = new BitSet(new long[]{0x0000000000000002L,0x0000001000204080L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3256 = new BitSet(new long[]{0x0000000000000002L,0x0000001000204080L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleCombinatorExpression3309 = new BitSet(new long[]{0x0000000000000000L,0x0000001034888840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3352 = new BitSet(new long[]{0x0000000000000002L,0x0000001000204080L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleCombinatorExpression3405 = new BitSet(new long[]{0x0000000000000000L,0x0000001034888840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3448 = new BitSet(new long[]{0x0000000000000002L,0x0000001000204080L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleCombinatorExpression3501 = new BitSet(new long[]{0x0000000000000000L,0x0000001034888840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCombinatorExpression3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_ruleCombinatorExpression3544 = new BitSet(new long[]{0x0000000000000002L,0x0000001000204080L});
    public static final BitSet FOLLOW_ruleSimpleSelectorSequence_in_entryRuleSimpleSelectorSequence3592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSelectorSequence3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelector_in_ruleSimpleSelectorSequence3665 = new BitSet(new long[]{0x0000000000000002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorSequence3684 = new BitSet(new long[]{0x0000000000000002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleTailSimpleSelector_in_ruleSimpleSelectorSequence3708 = new BitSet(new long[]{0x0000000000000002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleTailSimpleSelector_in_ruleSimpleSelectorSequence3737 = new BitSet(new long[]{0x0000000000000002L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleTailSimpleSelector_in_entryRuleTailSimpleSelector3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTailSimpleSelector3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDSelector_in_ruleTailSimpleSelector3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleTailSimpleSelector3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleTailSimpleSelector3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoSelector_in_ruleTailSimpleSelector3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationSelector_in_ruleTailSimpleSelector3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelector_in_entryRuleTypeSelector3979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSelector3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacePrefix_in_ruleTypeSelector4035 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypeSelector4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacePrefix_in_entryRuleNamespacePrefix4093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespacePrefix4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleNamespacePrefix4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleNamespacePrefix4190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleNamespacePrefix4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleNamespacePrefix4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector4268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacePrefix_in_ruleUniversalSelector4333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUniversalSelector4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector4387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAttributeSelector4439 = new BitSet(new long[]{0x0000000000000000L,0x0000000004080040L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeSelector4459 = new BitSet(new long[]{0x01C0000000000000L,0x0000000000012006L});
    public static final BitSet FOLLOW_ruleAttributeSelectorMatchers_in_ruleAttributeSelector4481 = new BitSet(new long[]{0x0000000000000000L,0x0000000704000000L});
    public static final BitSet FOLLOW_ruleAttributeValueLiteral_in_ruleAttributeSelector4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAttributeSelector4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacePrefix_in_ruleAttribute4621 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttribute4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueLiteral_in_entryRuleAttributeValueLiteral4683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueLiteral4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttributeValueLiteral4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeValueLiteral4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeValueLiteral4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleAttributeValueLiteral4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDSelector_in_entryRuleIDSelector4889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDSelector4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_ID_in_ruleIDSelector4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleIDSelector4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector5004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_ruleClassSelector5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoSelector_in_entryRulePseudoSelector5094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoSelector5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoArgsPseudoClassSelector_in_rulePseudoSelector5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoElementSelector_in_rulePseudoSelector5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguagePseudoClassSelector_in_rulePseudoSelector5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalPseudoClassSelector_in_rulePseudoSelector5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoArgsPseudoClassSelector_in_entryRuleNoArgsPseudoClassSelector5272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoArgsPseudoClassSelector5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNoArgsPseudoClassSelector5324 = new BitSet(new long[]{0x000110E0AB4C0880L});
    public static final BitSet FOLLOW_ruleNoArgsPseudos_in_ruleNoArgsPseudoClassSelector5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoElementSelector_in_entryRulePseudoElementSelector5389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoElementSelector5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePseudoElementSelector5441 = new BitSet(new long[]{0x0000000240020100L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePseudoElementSelector5459 = new BitSet(new long[]{0x0000000240020100L,0x0000000000000800L});
    public static final BitSet FOLLOW_rulePseudoElements_in_rulePseudoElementSelector5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguagePseudoClassSelector_in_entryRuleLanguagePseudoClassSelector5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguagePseudoClassSelector5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleLanguagePseudoClassSelector5589 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleLanguagePseudoClassSelector5601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleLanguagePseudoClassSelector5613 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLanguagePseudoClassSelector5629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleLanguagePseudoClassSelector5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalPseudoClassSelector_in_entryRuleFunctionalPseudoClassSelector5691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalPseudoClassSelector5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleFunctionalPseudoClassSelector5743 = new BitSet(new long[]{0x0000000000101670L});
    public static final BitSet FOLLOW_ruleFunctionalPseudoClasses_in_ruleFunctionalPseudoClassSelector5763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFunctionalPseudoClassSelector5776 = new BitSet(new long[]{0x0010020000000000L,0x0000000104020280L});
    public static final BitSet FOLLOW_ruleTypeArgument_in_ruleFunctionalPseudoClassSelector5796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFunctionalPseudoClassSelector5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeArgument_in_entryRuleTypeArgument5853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeArgument5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParityArgument_in_ruleTypeArgument5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearArgument_in_ruleTypeArgument5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantArgument_in_ruleTypeArgument5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearArgument_in_entryRuleLinearArgument6012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearArgument6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoefficient_in_ruleLinearArgument6081 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000280L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleLinearArgument6103 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleLinearArgument6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinearArgument6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoefficient_in_entryRuleCoefficient6215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoefficient6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleCoefficient6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCoefficient6309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleCoefficient6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantArgument_in_entryRuleConstantArgument6373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantArgument6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleConstantArgument6433 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleConstantArgument6461 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantArgument6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParityArgument_in_entryRuleParityArgument6537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParityArgument6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParities_in_ruleParityArgument6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationSelector_in_entryRuleNegationSelector6632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationSelector6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNegationSelector6684 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleNegationSelector6696 = new BitSet(new long[]{0x0000000000000000L,0x0000000034888840L});
    public static final BitSet FOLLOW_ruleNegationSimpleSelector_in_ruleNegationSelector6716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNegationSelector6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationSimpleSelector_in_entryRuleNegationSimpleSelector6767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationSimpleSelector6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelector_in_ruleNegationSimpleSelector6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_ruleNegationSimpleSelector6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleNegationSimpleSelector6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDSelector_in_ruleNegationSimpleSelector6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleNegationSimpleSelector6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoSelector_in_ruleNegationSimpleSelector6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueLiteral_in_entryRuleValueLiteral6993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueLiteral7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeLiteral_in_ruleValueLiteral7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValueLiteral7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorLiteral_in_ruleValueLiteral7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLLiteral_in_ruleValueLiteral7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallLiteral_in_ruleValueLiteral7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumberLiteral7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeLiteral_in_entryRuleSizeLiteral7340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeLiteral7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleSizeLiteral7411 = new BitSet(new long[]{0xFE00000000000002L,0x0000000000000409L});
    public static final BitSet FOLLOW_ruleDimensions_in_ruleSizeLiteral7432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSizeLiteral7467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSizeLiteral7488 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleSizeLiteral7517 = new BitSet(new long[]{0xFE00000000000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleDimensions_in_ruleSizeLiteral7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorLiteral_in_entryRuleColorLiteral7670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorLiteral7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleColorLiteral7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorNames_in_ruleColorLiteral7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentColorLiteral_in_ruleColorLiteral7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentColorLiteral_in_entryRuleComponentColorLiteral7838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentColorLiteral7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleComponentColorLiteral7896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral7908 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral7941 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral7974 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral7994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleComponentColorLiteral8036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8048 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8081 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8147 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleComponentColorLiteral8209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8221 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8254 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8287 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleComponentColorLiteral8349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentColorLiteral8361 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8394 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8427 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponentColorLiteral8460 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_ruleComponentColorLiteral8480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleComponentColorLiteral8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorComponentLiteral_in_entryRuleColorComponentLiteral8534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorComponentLiteral8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleColorComponentLiteral8594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleColorComponentLiteral8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLLiteral_in_entryRuleURLLiteral8664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLLiteral8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleURLLiteral8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallLiteral_in_entryRuleFunctionCallLiteral8756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallLiteral8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFunctionCallLiteral8809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFunctionCallLiteral8827 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800020L});
    public static final BitSet FOLLOW_ruleValueLiteral_in_ruleFunctionCallLiteral8848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleFunctionCallLiteral8862 = new BitSet(new long[]{0x0024850C00000000L,0x0000000744800000L});
    public static final BitSet FOLLOW_ruleValueLiteral_in_ruleFunctionCallLiteral8882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFunctionCallLiteral8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleFunctionCallLiteral8928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFunctionCallLiteral8940 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleFunctionCallLiteral8952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleFunctionCallLiteral8964 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleFunctionCallLiteral8984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFunctionCallLiteral8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleKnownProperties9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleKnownProperties9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleAttributeSelectorMatchers9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAttributeSelectorMatchers9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAttributeSelectorMatchers9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleAttributeSelectorMatchers9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleAttributeSelectorMatchers9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleAttributeSelectorMatchers9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleNoArgsPseudos9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleNoArgsPseudos9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleNoArgsPseudos9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleNoArgsPseudos9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleNoArgsPseudos9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleNoArgsPseudos9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleNoArgsPseudos9414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleNoArgsPseudos9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleNoArgsPseudos9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleNoArgsPseudos9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleNoArgsPseudos9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleNoArgsPseudos9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleNoArgsPseudos9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleNoArgsPseudos9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleNoArgsPseudos9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_rulePseudoElements9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_rulePseudoElements9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rulePseudoElements9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rulePseudoElements9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleFunctionalPseudoClasses9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleFunctionalPseudoClasses9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleFunctionalPseudoClasses9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleFunctionalPseudoClasses9822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleFunctionalPseudoClasses9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleFunctionalPseudoClasses9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleFunctionalPseudoClasses9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleParities9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleParities9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleDimensions10010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleDimensions10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleDimensions10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleDimensions10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleDimensions10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleDimensions10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleDimensions10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleDimensions10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleDimensions10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleColorNames10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleColorNames10258 = new BitSet(new long[]{0x0000000000000002L});

}