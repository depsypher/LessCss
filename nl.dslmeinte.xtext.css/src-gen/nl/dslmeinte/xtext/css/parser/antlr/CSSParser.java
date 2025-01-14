/*
* generated by Xtext
*/
package nl.dslmeinte.xtext.css.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import nl.dslmeinte.xtext.css.services.CSSGrammarAccess;

public class CSSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CSSGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
	}
	
	@Override
	protected nl.dslmeinte.xtext.css.parser.antlr.internal.InternalCSSParser createParser(XtextTokenStream stream) {
		return new nl.dslmeinte.xtext.css.parser.antlr.internal.InternalCSSParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Stylesheet";
	}
	
	public CSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
