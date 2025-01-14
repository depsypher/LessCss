package nl.dslmeinte.xtext.css.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.dslmeinte.xtext.css.services.CSSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractCSSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CSSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_RuleSetBody_SemicolonKeyword_2_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CSSGrammarAccess) access;
		match_RuleSetBody_SemicolonKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getRuleSetBodyAccess().getSemicolonKeyword_2_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_RuleSetBody_SemicolonKeyword_2_2_q.equals(syntax))
				emit_RuleSetBody_SemicolonKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_RuleSetBody_SemicolonKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
