/*
* generated by Xtext
*/
package nl.dslmeinte.xtext.css.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import nl.dslmeinte.xtext.css.services.CSSGrammarAccess;

public class CSSParser extends AbstractContentAssistParser {
	
	@Inject
	private CSSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected nl.dslmeinte.xtext.css.ui.contentassist.antlr.internal.InternalCSSParser createParser() {
		nl.dslmeinte.xtext.css.ui.contentassist.antlr.internal.InternalCSSParser result = new nl.dslmeinte.xtext.css.ui.contentassist.antlr.internal.InternalCSSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCSSTopLevelStatementAccess().getAlternatives(), "rule__CSSTopLevelStatement__Alternatives");
					put(grammarAccess.getCSSOtherTopLevelDeclarationAccess().getAlternatives(), "rule__CSSOtherTopLevelDeclaration__Alternatives");
					put(grammarAccess.getImportDeclarationAccess().getAlternatives_1(), "rule__ImportDeclaration__Alternatives_1");
					put(grammarAccess.getMediaDeclarationMembersAccess().getAlternatives(), "rule__MediaDeclarationMembers__Alternatives");
					put(grammarAccess.getMediaQueryAccess().getAlternatives(), "rule__MediaQuery__Alternatives");
					put(grammarAccess.getMediaQueryAccess().getAlternatives_0_0(), "rule__MediaQuery__Alternatives_0_0");
					put(grammarAccess.getNamespaceDeclarationAccess().getUrlAlternatives_2_0(), "rule__NamespaceDeclaration__UrlAlternatives_2_0");
					put(grammarAccess.getPropertyDeclarationAccess().getAlternatives(), "rule__PropertyDeclaration__Alternatives");
					put(grammarAccess.getPropertyNameAccess().getAlternatives(), "rule__PropertyName__Alternatives");
					put(grammarAccess.getCombinatorExpressionAccess().getAlternatives_1(), "rule__CombinatorExpression__Alternatives_1");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getAlternatives_1(), "rule__SimpleSelectorSequence__Alternatives_1");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getHeadAlternatives_1_0_0_0(), "rule__SimpleSelectorSequence__HeadAlternatives_1_0_0_0");
					put(grammarAccess.getTailSimpleSelectorAccess().getAlternatives(), "rule__TailSimpleSelector__Alternatives");
					put(grammarAccess.getSimpleSelectorAccess().getAlternatives(), "rule__SimpleSelector__Alternatives");
					put(grammarAccess.getNamespacePrefixAccess().getAlternatives(), "rule__NamespacePrefix__Alternatives");
					put(grammarAccess.getNamespacePrefixAccess().getAlternatives_0_0(), "rule__NamespacePrefix__Alternatives_0_0");
					put(grammarAccess.getAttributeValueLiteralAccess().getAlternatives(), "rule__AttributeValueLiteral__Alternatives");
					put(grammarAccess.getAttributeValueLiteralAccess().getValueAlternatives_0_1_0(), "rule__AttributeValueLiteral__ValueAlternatives_0_1_0");
					put(grammarAccess.getIDSelectorAccess().getNameAlternatives_0(), "rule__IDSelector__NameAlternatives_0");
					put(grammarAccess.getPseudoSelectorAccess().getAlternatives(), "rule__PseudoSelector__Alternatives");
					put(grammarAccess.getTypeArgumentAccess().getAlternatives(), "rule__TypeArgument__Alternatives");
					put(grammarAccess.getLinearArgumentAccess().getConstantSignAlternatives_2_0_0(), "rule__LinearArgument__ConstantSignAlternatives_2_0_0");
					put(grammarAccess.getCoefficientAccess().getAlternatives(), "rule__Coefficient__Alternatives");
					put(grammarAccess.getConstantArgumentAccess().getSignAlternatives_0_0(), "rule__ConstantArgument__SignAlternatives_0_0");
					put(grammarAccess.getNegationSimpleSelectorAccess().getAlternatives(), "rule__NegationSimpleSelector__Alternatives");
					put(grammarAccess.getValueLiteralAccess().getAlternatives(), "rule__ValueLiteral__Alternatives");
					put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
					put(grammarAccess.getSizeLiteralAccess().getAlternatives_0(), "rule__SizeLiteral__Alternatives_0");
					put(grammarAccess.getColorLiteralAccess().getAlternatives(), "rule__ColorLiteral__Alternatives");
					put(grammarAccess.getComponentColorLiteralAccess().getAlternatives(), "rule__ComponentColorLiteral__Alternatives");
					put(grammarAccess.getFunctionCallLiteralAccess().getAlternatives(), "rule__FunctionCallLiteral__Alternatives");
					put(grammarAccess.getKnownPropertiesAccess().getAlternatives(), "rule__KnownProperties__Alternatives");
					put(grammarAccess.getAttributeSelectorMatchersAccess().getAlternatives(), "rule__AttributeSelectorMatchers__Alternatives");
					put(grammarAccess.getNoArgsPseudosAccess().getAlternatives(), "rule__NoArgsPseudos__Alternatives");
					put(grammarAccess.getPseudoElementsAccess().getAlternatives(), "rule__PseudoElements__Alternatives");
					put(grammarAccess.getFunctionalPseudoClassesAccess().getAlternatives(), "rule__FunctionalPseudoClasses__Alternatives");
					put(grammarAccess.getParitiesAccess().getAlternatives(), "rule__Parities__Alternatives");
					put(grammarAccess.getDimensionsAccess().getAlternatives(), "rule__Dimensions__Alternatives");
					put(grammarAccess.getColorNamesAccess().getAlternatives(), "rule__ColorNames__Alternatives");
					put(grammarAccess.getStylesheetAccess().getGroup(), "rule__Stylesheet__Group__0");
					put(grammarAccess.getStylesheetAccess().getGroup_0(), "rule__Stylesheet__Group_0__0");
					put(grammarAccess.getImportDeclarationAccess().getGroup(), "rule__ImportDeclaration__Group__0");
					put(grammarAccess.getImportDeclarationAccess().getGroup_2(), "rule__ImportDeclaration__Group_2__0");
					put(grammarAccess.getImportDeclarationAccess().getGroup_2_1(), "rule__ImportDeclaration__Group_2_1__0");
					put(grammarAccess.getMediaDeclarationAccess().getGroup(), "rule__MediaDeclaration__Group__0");
					put(grammarAccess.getMediaDeclarationAccess().getGroup_2(), "rule__MediaDeclaration__Group_2__0");
					put(grammarAccess.getMediaDeclarationMembersAccess().getGroup_1(), "rule__MediaDeclarationMembers__Group_1__0");
					put(grammarAccess.getMediaQueryAccess().getGroup_0(), "rule__MediaQuery__Group_0__0");
					put(grammarAccess.getMediaQueryAccess().getGroup_0_2(), "rule__MediaQuery__Group_0_2__0");
					put(grammarAccess.getMediaQueryAccess().getGroup_1(), "rule__MediaQuery__Group_1__0");
					put(grammarAccess.getMediaQueryAccess().getGroup_1_1(), "rule__MediaQuery__Group_1_1__0");
					put(grammarAccess.getMediaQueryExpressionAccess().getGroup(), "rule__MediaQueryExpression__Group__0");
					put(grammarAccess.getMediaQueryExpressionAccess().getGroup_2(), "rule__MediaQueryExpression__Group_2__0");
					put(grammarAccess.getPageDeclarationAccess().getGroup(), "rule__PageDeclaration__Group__0");
					put(grammarAccess.getPageDeclarationAccess().getGroup_1(), "rule__PageDeclaration__Group_1__0");
					put(grammarAccess.getNamespaceDeclarationAccess().getGroup(), "rule__NamespaceDeclaration__Group__0");
					put(grammarAccess.getFontFaceDeclarationAccess().getGroup(), "rule__FontFaceDeclaration__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup(), "rule__RuleSet__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup_1(), "rule__RuleSet__Group_1__0");
					put(grammarAccess.getRuleSetBodyAccess().getGroup(), "rule__RuleSetBody__Group__0");
					put(grammarAccess.getRuleSetBodyAccess().getGroup_2(), "rule__RuleSetBody__Group_2__0");
					put(grammarAccess.getRuleSetBodyAccess().getGroup_2_1(), "rule__RuleSetBody__Group_2_1__0");
					put(grammarAccess.getKnownPropertyDeclarationAccess().getGroup(), "rule__KnownPropertyDeclaration__Group__0");
					put(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getGroup(), "rule__UnrecognizedPropertyDeclaration__Group__0");
					put(grammarAccess.getPropertyValuesListsAccess().getGroup(), "rule__PropertyValuesLists__Group__0");
					put(grammarAccess.getPropertyValuesListsAccess().getGroup_1(), "rule__PropertyValuesLists__Group_1__0");
					put(grammarAccess.getPropertyValueAccess().getGroup(), "rule__PropertyValue__Group__0");
					put(grammarAccess.getCombinatorExpressionAccess().getGroup(), "rule__CombinatorExpression__Group__0");
					put(grammarAccess.getCombinatorExpressionAccess().getGroup_1_0(), "rule__CombinatorExpression__Group_1_0__0");
					put(grammarAccess.getCombinatorExpressionAccess().getGroup_1_1(), "rule__CombinatorExpression__Group_1_1__0");
					put(grammarAccess.getCombinatorExpressionAccess().getGroup_1_2(), "rule__CombinatorExpression__Group_1_2__0");
					put(grammarAccess.getCombinatorExpressionAccess().getGroup_1_3(), "rule__CombinatorExpression__Group_1_3__0");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getGroup(), "rule__SimpleSelectorSequence__Group__0");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getGroup_1_0(), "rule__SimpleSelectorSequence__Group_1_0__0");
					put(grammarAccess.getTypeSelectorAccess().getGroup(), "rule__TypeSelector__Group__0");
					put(grammarAccess.getNamespacePrefixAccess().getGroup_0(), "rule__NamespacePrefix__Group_0__0");
					put(grammarAccess.getNamespacePrefixAccess().getGroup_0_0_0(), "rule__NamespacePrefix__Group_0_0_0__0");
					put(grammarAccess.getNamespacePrefixAccess().getGroup_0_0_1(), "rule__NamespacePrefix__Group_0_0_1__0");
					put(grammarAccess.getNamespacePrefixAccess().getGroup_1(), "rule__NamespacePrefix__Group_1__0");
					put(grammarAccess.getUniversalSelectorAccess().getGroup(), "rule__UniversalSelector__Group__0");
					put(grammarAccess.getAttributeSelectorAccess().getGroup(), "rule__AttributeSelector__Group__0");
					put(grammarAccess.getAttributeSelectorAccess().getGroup_2(), "rule__AttributeSelector__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeValueLiteralAccess().getGroup_0(), "rule__AttributeValueLiteral__Group_0__0");
					put(grammarAccess.getAttributeValueLiteralAccess().getGroup_1(), "rule__AttributeValueLiteral__Group_1__0");
					put(grammarAccess.getAttributeValueLiteralAccess().getGroup_2(), "rule__AttributeValueLiteral__Group_2__0");
					put(grammarAccess.getNoArgsPseudoClassSelectorAccess().getGroup(), "rule__NoArgsPseudoClassSelector__Group__0");
					put(grammarAccess.getPseudoElementSelectorAccess().getGroup(), "rule__PseudoElementSelector__Group__0");
					put(grammarAccess.getLanguagePseudoClassSelectorAccess().getGroup(), "rule__LanguagePseudoClassSelector__Group__0");
					put(grammarAccess.getFunctionalPseudoClassSelectorAccess().getGroup(), "rule__FunctionalPseudoClassSelector__Group__0");
					put(grammarAccess.getLinearArgumentAccess().getGroup(), "rule__LinearArgument__Group__0");
					put(grammarAccess.getLinearArgumentAccess().getGroup_2(), "rule__LinearArgument__Group_2__0");
					put(grammarAccess.getCoefficientAccess().getGroup_1(), "rule__Coefficient__Group_1__0");
					put(grammarAccess.getConstantArgumentAccess().getGroup(), "rule__ConstantArgument__Group__0");
					put(grammarAccess.getNegationSelectorAccess().getGroup(), "rule__NegationSelector__Group__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup_0(), "rule__NumberLiteral__Group_0__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup_1(), "rule__NumberLiteral__Group_1__0");
					put(grammarAccess.getSizeLiteralAccess().getGroup(), "rule__SizeLiteral__Group__0");
					put(grammarAccess.getSizeLiteralAccess().getGroup_0_0(), "rule__SizeLiteral__Group_0_0__0");
					put(grammarAccess.getSizeLiteralAccess().getGroup_0_1(), "rule__SizeLiteral__Group_0_1__0");
					put(grammarAccess.getSizeLiteralAccess().getGroup_1(), "rule__SizeLiteral__Group_1__0");
					put(grammarAccess.getColorLiteralAccess().getGroup_0(), "rule__ColorLiteral__Group_0__0");
					put(grammarAccess.getColorLiteralAccess().getGroup_1(), "rule__ColorLiteral__Group_1__0");
					put(grammarAccess.getComponentColorLiteralAccess().getGroup_0(), "rule__ComponentColorLiteral__Group_0__0");
					put(grammarAccess.getComponentColorLiteralAccess().getGroup_1(), "rule__ComponentColorLiteral__Group_1__0");
					put(grammarAccess.getComponentColorLiteralAccess().getGroup_2(), "rule__ComponentColorLiteral__Group_2__0");
					put(grammarAccess.getComponentColorLiteralAccess().getGroup_3(), "rule__ComponentColorLiteral__Group_3__0");
					put(grammarAccess.getColorComponentLiteralAccess().getGroup(), "rule__ColorComponentLiteral__Group__0");
					put(grammarAccess.getFunctionCallLiteralAccess().getGroup_0(), "rule__FunctionCallLiteral__Group_0__0");
					put(grammarAccess.getFunctionCallLiteralAccess().getGroup_0_2(), "rule__FunctionCallLiteral__Group_0_2__0");
					put(grammarAccess.getFunctionCallLiteralAccess().getGroup_0_2_1(), "rule__FunctionCallLiteral__Group_0_2_1__0");
					put(grammarAccess.getFunctionCallLiteralAccess().getGroup_1(), "rule__FunctionCallLiteral__Group_1__0");
					put(grammarAccess.getStylesheetAccess().getCharSetAssignment_0_1(), "rule__Stylesheet__CharSetAssignment_0_1");
					put(grammarAccess.getStylesheetAccess().getImportsAssignment_1(), "rule__Stylesheet__ImportsAssignment_1");
					put(grammarAccess.getStylesheetAccess().getStatementsAssignment_2(), "rule__Stylesheet__StatementsAssignment_2");
					put(grammarAccess.getImportDeclarationAccess().getImportURIAssignment_1_0(), "rule__ImportDeclaration__ImportURIAssignment_1_0");
					put(grammarAccess.getImportDeclarationAccess().getUrlAssignment_1_1(), "rule__ImportDeclaration__UrlAssignment_1_1");
					put(grammarAccess.getImportDeclarationAccess().getMediaAssignment_2_0(), "rule__ImportDeclaration__MediaAssignment_2_0");
					put(grammarAccess.getImportDeclarationAccess().getMediaAssignment_2_1_1(), "rule__ImportDeclaration__MediaAssignment_2_1_1");
					put(grammarAccess.getMediaDeclarationAccess().getMediaQueriesAssignment_1(), "rule__MediaDeclaration__MediaQueriesAssignment_1");
					put(grammarAccess.getMediaDeclarationAccess().getMediaAssignment_2_1(), "rule__MediaDeclaration__MediaAssignment_2_1");
					put(grammarAccess.getMediaDeclarationAccess().getMembersAssignment_4(), "rule__MediaDeclaration__MembersAssignment_4");
					put(grammarAccess.getMediaQueryAccess().getOnlyAssignment_0_0_0(), "rule__MediaQuery__OnlyAssignment_0_0_0");
					put(grammarAccess.getMediaQueryAccess().getNotAssignment_0_0_1(), "rule__MediaQuery__NotAssignment_0_0_1");
					put(grammarAccess.getMediaQueryAccess().getMediaTypeAssignment_0_1(), "rule__MediaQuery__MediaTypeAssignment_0_1");
					put(grammarAccess.getMediaQueryAccess().getExpressionsAssignment_0_2_1(), "rule__MediaQuery__ExpressionsAssignment_0_2_1");
					put(grammarAccess.getMediaQueryAccess().getExpressionsAssignment_1_0(), "rule__MediaQuery__ExpressionsAssignment_1_0");
					put(grammarAccess.getMediaQueryAccess().getExpressionsAssignment_1_1_1(), "rule__MediaQuery__ExpressionsAssignment_1_1_1");
					put(grammarAccess.getMediaQueryExpressionAccess().getFeatureAssignment_1(), "rule__MediaQueryExpression__FeatureAssignment_1");
					put(grammarAccess.getMediaQueryExpressionAccess().getExpressionAssignment_2_1(), "rule__MediaQueryExpression__ExpressionAssignment_2_1");
					put(grammarAccess.getPageDeclarationAccess().getPseudoPageAssignment_1_1(), "rule__PageDeclaration__PseudoPageAssignment_1_1");
					put(grammarAccess.getPageDeclarationAccess().getBodyAssignment_2(), "rule__PageDeclaration__BodyAssignment_2");
					put(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1(), "rule__NamespaceDeclaration__NameAssignment_1");
					put(grammarAccess.getNamespaceDeclarationAccess().getUrlAssignment_2(), "rule__NamespaceDeclaration__UrlAssignment_2");
					put(grammarAccess.getFontFaceDeclarationAccess().getBodyAssignment_1(), "rule__FontFaceDeclaration__BodyAssignment_1");
					put(grammarAccess.getRuleSetAccess().getSelectorsAssignment_0(), "rule__RuleSet__SelectorsAssignment_0");
					put(grammarAccess.getRuleSetAccess().getSelectorsAssignment_1_1(), "rule__RuleSet__SelectorsAssignment_1_1");
					put(grammarAccess.getRuleSetAccess().getBodyAssignment_2(), "rule__RuleSet__BodyAssignment_2");
					put(grammarAccess.getRuleSetBodyAccess().getDeclarationsAssignment_2_0(), "rule__RuleSetBody__DeclarationsAssignment_2_0");
					put(grammarAccess.getRuleSetBodyAccess().getDeclarationsAssignment_2_1_1(), "rule__RuleSetBody__DeclarationsAssignment_2_1_1");
					put(grammarAccess.getKnownPropertyDeclarationAccess().getNameAssignment_0(), "rule__KnownPropertyDeclaration__NameAssignment_0");
					put(grammarAccess.getKnownPropertyDeclarationAccess().getValuesListsAssignment_2(), "rule__KnownPropertyDeclaration__ValuesListsAssignment_2");
					put(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getNameAssignment_0(), "rule__UnrecognizedPropertyDeclaration__NameAssignment_0");
					put(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getValuesListsAssignment_2(), "rule__UnrecognizedPropertyDeclaration__ValuesListsAssignment_2");
					put(grammarAccess.getPropertyValuesListsAccess().getListsAssignment_0(), "rule__PropertyValuesLists__ListsAssignment_0");
					put(grammarAccess.getPropertyValuesListsAccess().getListsAssignment_1_1(), "rule__PropertyValuesLists__ListsAssignment_1_1");
					put(grammarAccess.getPropertyValuesListAccess().getValuesAssignment(), "rule__PropertyValuesList__ValuesAssignment");
					put(grammarAccess.getPropertyValueAccess().getValueAssignment_0(), "rule__PropertyValue__ValueAssignment_0");
					put(grammarAccess.getPropertyValueAccess().getImportantAssignment_1(), "rule__PropertyValue__ImportantAssignment_1");
					put(grammarAccess.getCombinatorExpressionAccess().getWsIAssignment_1_0_1(), "rule__CombinatorExpression__WsIAssignment_1_0_1");
					put(grammarAccess.getCombinatorExpressionAccess().getRightAssignment_1_0_2(), "rule__CombinatorExpression__RightAssignment_1_0_2");
					put(grammarAccess.getCombinatorExpressionAccess().getWsLAssignment_1_1_1(), "rule__CombinatorExpression__WsLAssignment_1_1_1");
					put(grammarAccess.getCombinatorExpressionAccess().getWsRAssignment_1_1_3(), "rule__CombinatorExpression__WsRAssignment_1_1_3");
					put(grammarAccess.getCombinatorExpressionAccess().getRightAssignment_1_1_4(), "rule__CombinatorExpression__RightAssignment_1_1_4");
					put(grammarAccess.getCombinatorExpressionAccess().getWsLAssignment_1_2_1(), "rule__CombinatorExpression__WsLAssignment_1_2_1");
					put(grammarAccess.getCombinatorExpressionAccess().getWsRAssignment_1_2_3(), "rule__CombinatorExpression__WsRAssignment_1_2_3");
					put(grammarAccess.getCombinatorExpressionAccess().getRightAssignment_1_2_4(), "rule__CombinatorExpression__RightAssignment_1_2_4");
					put(grammarAccess.getCombinatorExpressionAccess().getWsLAssignment_1_3_1(), "rule__CombinatorExpression__WsLAssignment_1_3_1");
					put(grammarAccess.getCombinatorExpressionAccess().getWsRAssignment_1_3_3(), "rule__CombinatorExpression__WsRAssignment_1_3_3");
					put(grammarAccess.getCombinatorExpressionAccess().getRightAssignment_1_3_4(), "rule__CombinatorExpression__RightAssignment_1_3_4");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getHeadAssignment_1_0_0(), "rule__SimpleSelectorSequence__HeadAssignment_1_0_0");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getSimpleSelectorsAssignment_1_0_1(), "rule__SimpleSelectorSequence__SimpleSelectorsAssignment_1_0_1");
					put(grammarAccess.getSimpleSelectorSequenceAccess().getSimpleSelectorsAssignment_1_1(), "rule__SimpleSelectorSequence__SimpleSelectorsAssignment_1_1");
					put(grammarAccess.getTypeSelectorAccess().getNamespacePrefixAssignment_0(), "rule__TypeSelector__NamespacePrefixAssignment_0");
					put(grammarAccess.getTypeSelectorAccess().getTypeAssignment_1(), "rule__TypeSelector__TypeAssignment_1");
					put(grammarAccess.getNamespacePrefixAccess().getNamespaceAssignment_0_0_0_1(), "rule__NamespacePrefix__NamespaceAssignment_0_0_0_1");
					put(grammarAccess.getUniversalSelectorAccess().getNamespacePrefixAssignment_1(), "rule__UniversalSelector__NamespacePrefixAssignment_1");
					put(grammarAccess.getAttributeSelectorAccess().getAttributeAssignment_1(), "rule__AttributeSelector__AttributeAssignment_1");
					put(grammarAccess.getAttributeSelectorAccess().getMatcherAssignment_2_0(), "rule__AttributeSelector__MatcherAssignment_2_0");
					put(grammarAccess.getAttributeSelectorAccess().getValueAssignment_2_1(), "rule__AttributeSelector__ValueAssignment_2_1");
					put(grammarAccess.getAttributeAccess().getNamespacePrefixAssignment_0(), "rule__Attribute__NamespacePrefixAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeValueLiteralAccess().getValueAssignment_0_1(), "rule__AttributeValueLiteral__ValueAssignment_0_1");
					put(grammarAccess.getAttributeValueLiteralAccess().getValueAssignment_1_1(), "rule__AttributeValueLiteral__ValueAssignment_1_1");
					put(grammarAccess.getAttributeValueLiteralAccess().getValueAssignment_2_1(), "rule__AttributeValueLiteral__ValueAssignment_2_1");
					put(grammarAccess.getIDSelectorAccess().getNameAssignment(), "rule__IDSelector__NameAssignment");
					put(grammarAccess.getClassSelectorAccess().getNameAssignment(), "rule__ClassSelector__NameAssignment");
					put(grammarAccess.getNoArgsPseudoClassSelectorAccess().getPseudoAssignment_1(), "rule__NoArgsPseudoClassSelector__PseudoAssignment_1");
					put(grammarAccess.getPseudoElementSelectorAccess().getDoubleSemiColonAssignment_1(), "rule__PseudoElementSelector__DoubleSemiColonAssignment_1");
					put(grammarAccess.getPseudoElementSelectorAccess().getPseudoAssignment_2(), "rule__PseudoElementSelector__PseudoAssignment_2");
					put(grammarAccess.getLanguagePseudoClassSelectorAccess().getLangugageIdAssignment_3(), "rule__LanguagePseudoClassSelector__LangugageIdAssignment_3");
					put(grammarAccess.getFunctionalPseudoClassSelectorAccess().getPseudoAssignment_1(), "rule__FunctionalPseudoClassSelector__PseudoAssignment_1");
					put(grammarAccess.getFunctionalPseudoClassSelectorAccess().getArgumentAssignment_3(), "rule__FunctionalPseudoClassSelector__ArgumentAssignment_3");
					put(grammarAccess.getLinearArgumentAccess().getCoefficientAssignment_1(), "rule__LinearArgument__CoefficientAssignment_1");
					put(grammarAccess.getLinearArgumentAccess().getConstantSignAssignment_2_0(), "rule__LinearArgument__ConstantSignAssignment_2_0");
					put(grammarAccess.getLinearArgumentAccess().getConstantAssignment_2_1(), "rule__LinearArgument__ConstantAssignment_2_1");
					put(grammarAccess.getCoefficientAccess().getIdentAssignment_0(), "rule__Coefficient__IdentAssignment_0");
					put(grammarAccess.getCoefficientAccess().getIntAssignment_1_1(), "rule__Coefficient__IntAssignment_1_1");
					put(grammarAccess.getConstantArgumentAccess().getSignAssignment_0(), "rule__ConstantArgument__SignAssignment_0");
					put(grammarAccess.getConstantArgumentAccess().getIntAssignment_1(), "rule__ConstantArgument__IntAssignment_1");
					put(grammarAccess.getParityArgumentAccess().getParityAssignment(), "rule__ParityArgument__ParityAssignment");
					put(grammarAccess.getNegationSelectorAccess().getSimpleSelectorAssignment_2(), "rule__NegationSelector__SimpleSelectorAssignment_2");
					put(grammarAccess.getNumberLiteralAccess().getIntAssignment_0_1(), "rule__NumberLiteral__IntAssignment_0_1");
					put(grammarAccess.getNumberLiteralAccess().getDecimalAssignment_1_1(), "rule__NumberLiteral__DecimalAssignment_1_1");
					put(grammarAccess.getSizeLiteralAccess().getNumberAssignment_0_0_1(), "rule__SizeLiteral__NumberAssignment_0_0_1");
					put(grammarAccess.getSizeLiteralAccess().getDimensionAssignment_0_0_2(), "rule__SizeLiteral__DimensionAssignment_0_0_2");
					put(grammarAccess.getSizeLiteralAccess().getBarewordAssignment_0_1_1(), "rule__SizeLiteral__BarewordAssignment_0_1_1");
					put(grammarAccess.getSizeLiteralAccess().getLineHeightAssignment_1_2(), "rule__SizeLiteral__LineHeightAssignment_1_2");
					put(grammarAccess.getSizeLiteralAccess().getLineHeightDimensionAssignment_1_3(), "rule__SizeLiteral__LineHeightDimensionAssignment_1_3");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getColorLiteralAccess().getRgbAssignment_0_1(), "rule__ColorLiteral__RgbAssignment_0_1");
					put(grammarAccess.getColorLiteralAccess().getColorAssignment_1_1(), "rule__ColorLiteral__ColorAssignment_1_1");
					put(grammarAccess.getComponentColorLiteralAccess().getRedAssignment_0_3(), "rule__ComponentColorLiteral__RedAssignment_0_3");
					put(grammarAccess.getComponentColorLiteralAccess().getGreenAssignment_0_5(), "rule__ComponentColorLiteral__GreenAssignment_0_5");
					put(grammarAccess.getComponentColorLiteralAccess().getBlueAssignment_0_7(), "rule__ComponentColorLiteral__BlueAssignment_0_7");
					put(grammarAccess.getComponentColorLiteralAccess().getRedAssignment_1_3(), "rule__ComponentColorLiteral__RedAssignment_1_3");
					put(grammarAccess.getComponentColorLiteralAccess().getGreenAssignment_1_5(), "rule__ComponentColorLiteral__GreenAssignment_1_5");
					put(grammarAccess.getComponentColorLiteralAccess().getBlueAssignment_1_7(), "rule__ComponentColorLiteral__BlueAssignment_1_7");
					put(grammarAccess.getComponentColorLiteralAccess().getOpacityAssignment_1_9(), "rule__ComponentColorLiteral__OpacityAssignment_1_9");
					put(grammarAccess.getComponentColorLiteralAccess().getHueAssignment_2_3(), "rule__ComponentColorLiteral__HueAssignment_2_3");
					put(grammarAccess.getComponentColorLiteralAccess().getSaturationAssignment_2_5(), "rule__ComponentColorLiteral__SaturationAssignment_2_5");
					put(grammarAccess.getComponentColorLiteralAccess().getLightnessAssignment_2_7(), "rule__ComponentColorLiteral__LightnessAssignment_2_7");
					put(grammarAccess.getComponentColorLiteralAccess().getHueAssignment_3_3(), "rule__ComponentColorLiteral__HueAssignment_3_3");
					put(grammarAccess.getComponentColorLiteralAccess().getSaturationAssignment_3_5(), "rule__ComponentColorLiteral__SaturationAssignment_3_5");
					put(grammarAccess.getComponentColorLiteralAccess().getLightnessAssignment_3_7(), "rule__ComponentColorLiteral__LightnessAssignment_3_7");
					put(grammarAccess.getComponentColorLiteralAccess().getOpacityAssignment_3_9(), "rule__ComponentColorLiteral__OpacityAssignment_3_9");
					put(grammarAccess.getColorComponentLiteralAccess().getNumberAssignment_0(), "rule__ColorComponentLiteral__NumberAssignment_0");
					put(grammarAccess.getColorComponentLiteralAccess().getPercentageAssignment_1(), "rule__ColorComponentLiteral__PercentageAssignment_1");
					put(grammarAccess.getURLLiteralAccess().getValueAssignment(), "rule__URLLiteral__ValueAssignment");
					put(grammarAccess.getBareWordLiteralAccess().getBareWordAssignment(), "rule__BareWordLiteral__BareWordAssignment");
					put(grammarAccess.getFunctionCallLiteralAccess().getFunctionAssignment_0_0(), "rule__FunctionCallLiteral__FunctionAssignment_0_0");
					put(grammarAccess.getFunctionCallLiteralAccess().getArgumentsAssignment_0_2_0(), "rule__FunctionCallLiteral__ArgumentsAssignment_0_2_0");
					put(grammarAccess.getFunctionCallLiteralAccess().getArgumentsAssignment_0_2_1_1(), "rule__FunctionCallLiteral__ArgumentsAssignment_0_2_1_1");
					put(grammarAccess.getFunctionCallLiteralAccess().getOpacityAssignment_1_5(), "rule__FunctionCallLiteral__OpacityAssignment_1_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			nl.dslmeinte.xtext.css.ui.contentassist.antlr.internal.InternalCSSParser typedParser = (nl.dslmeinte.xtext.css.ui.contentassist.antlr.internal.InternalCSSParser) parser;
			typedParser.entryRuleStylesheet();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT" };
	}
	
	public CSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
