package nl.dslmeinte.xtext.css.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator;
import nl.dslmeinte.xtext.css.css.AlphaLiteral;
import nl.dslmeinte.xtext.css.css.Attribute;
import nl.dslmeinte.xtext.css.css.AttributeSelector;
import nl.dslmeinte.xtext.css.css.BareWordLiteral;
import nl.dslmeinte.xtext.css.css.ChildCombinator;
import nl.dslmeinte.xtext.css.css.ClassSelector;
import nl.dslmeinte.xtext.css.css.Coefficient;
import nl.dslmeinte.xtext.css.css.ColorComponentLiteral;
import nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor;
import nl.dslmeinte.xtext.css.css.ComponentHSLColor;
import nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor;
import nl.dslmeinte.xtext.css.css.ComponentRGBColor;
import nl.dslmeinte.xtext.css.css.ConstantArgument;
import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.DecimalLiteral;
import nl.dslmeinte.xtext.css.css.DescendantCombinator;
import nl.dslmeinte.xtext.css.css.FontFaceDeclaration;
import nl.dslmeinte.xtext.css.css.FontHeightLiteral;
import nl.dslmeinte.xtext.css.css.FunctionCallLiteral;
import nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator;
import nl.dslmeinte.xtext.css.css.IDSelector;
import nl.dslmeinte.xtext.css.css.ImportDeclaration;
import nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.IntegerLiteral;
import nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration;
import nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector;
import nl.dslmeinte.xtext.css.css.LinearArgument;
import nl.dslmeinte.xtext.css.css.MediaDeclaration;
import nl.dslmeinte.xtext.css.css.MediaQuery;
import nl.dslmeinte.xtext.css.css.MediaQueryExpression;
import nl.dslmeinte.xtext.css.css.NamedColor;
import nl.dslmeinte.xtext.css.css.NamespaceDeclaration;
import nl.dslmeinte.xtext.css.css.NamespacePrefix;
import nl.dslmeinte.xtext.css.css.NegationSelector;
import nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.PageDeclaration;
import nl.dslmeinte.xtext.css.css.ParityArgument;
import nl.dslmeinte.xtext.css.css.PropertyValue;
import nl.dslmeinte.xtext.css.css.PropertyValuesList;
import nl.dslmeinte.xtext.css.css.PropertyValuesLists;
import nl.dslmeinte.xtext.css.css.PseudoElementSelector;
import nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral;
import nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral;
import nl.dslmeinte.xtext.css.css.RGBColor;
import nl.dslmeinte.xtext.css.css.RuleSet;
import nl.dslmeinte.xtext.css.css.RuleSetBody;
import nl.dslmeinte.xtext.css.css.SimpleSelectorSequence;
import nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.StringLiteral;
import nl.dslmeinte.xtext.css.css.Stylesheet;
import nl.dslmeinte.xtext.css.css.TypeSelector;
import nl.dslmeinte.xtext.css.css.URLLiteral;
import nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix;
import nl.dslmeinte.xtext.css.css.UniversalSelector;
import nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration;
import nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix;
import nl.dslmeinte.xtext.css.services.CSSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractCSSSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected CSSGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssPackage.ADJACENT_SIBLING_COMBINATOR:
				if(context == grammarAccess.getCombinatorExpressionRule() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0() ||
				   context == grammarAccess.getSelectorRule()) {
					sequence_CombinatorExpression(context, (AdjacentSiblingCombinator) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.ALPHA_LITERAL:
				if(context == grammarAccess.getFunctionCallLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_FunctionCallLiteral(context, (AlphaLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.ATTRIBUTE_SELECTOR:
				if(context == grammarAccess.getAttributeSelectorRule() ||
				   context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_AttributeSelector(context, (AttributeSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.BARE_WORD_LITERAL:
				if(context == grammarAccess.getBareWordLiteralRule()) {
					sequence_BareWordLiteral(context, (BareWordLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.CHILD_COMBINATOR:
				if(context == grammarAccess.getCombinatorExpressionRule() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0() ||
				   context == grammarAccess.getSelectorRule()) {
					sequence_CombinatorExpression(context, (ChildCombinator) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.CLASS_SELECTOR:
				if(context == grammarAccess.getClassSelectorRule() ||
				   context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_ClassSelector(context, (ClassSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COEFFICIENT:
				if(context == grammarAccess.getCoefficientRule()) {
					sequence_Coefficient(context, (Coefficient) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COLOR_COMPONENT_LITERAL:
				if(context == grammarAccess.getColorComponentLiteralRule()) {
					sequence_ColorComponentLiteral(context, (ColorComponentLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COMPONENT_HSL_ALPHA_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getComponentColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ComponentColorLiteral(context, (ComponentHSLAlphaColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COMPONENT_HSL_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getComponentColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ComponentColorLiteral(context, (ComponentHSLColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COMPONENT_RGB_ALPHA_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getComponentColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ComponentColorLiteral(context, (ComponentRGBAlphaColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.COMPONENT_RGB_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getComponentColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ComponentColorLiteral(context, (ComponentRGBColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.CONSTANT_ARGUMENT:
				if(context == grammarAccess.getConstantArgumentRule() ||
				   context == grammarAccess.getTypeArgumentRule()) {
					sequence_ConstantArgument(context, (ConstantArgument) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.DECIMAL_ATTRIBUTE_VALUE_LITERAL:
				if(context == grammarAccess.getAttributeValueLiteralRule()) {
					sequence_AttributeValueLiteral(context, (DecimalAttributeValueLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.DECIMAL_LITERAL:
				if(context == grammarAccess.getNumberLiteralRule()) {
					sequence_NumberLiteral(context, (DecimalLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.DESCENDANT_COMBINATOR:
				if(context == grammarAccess.getCombinatorExpressionRule() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0() ||
				   context == grammarAccess.getSelectorRule()) {
					sequence_CombinatorExpression(context, (DescendantCombinator) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.FONT_FACE_DECLARATION:
				if(context == grammarAccess.getCSSOtherTopLevelDeclarationRule() ||
				   context == grammarAccess.getCSSTopLevelStatementRule() ||
				   context == grammarAccess.getFontFaceDeclarationRule()) {
					sequence_FontFaceDeclaration(context, (FontFaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.FONT_HEIGHT_LITERAL:
				if(context == grammarAccess.getSizeLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_SizeLiteral(context, (FontHeightLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.FUNCTION_CALL_LITERAL:
				if(context == grammarAccess.getFunctionCallLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_FunctionCallLiteral(context, (FunctionCallLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR:
				if(context == grammarAccess.getFunctionalPseudoClassSelectorRule() ||
				   context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getPseudoSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_FunctionalPseudoClassSelector(context, (FunctionalPseudoClassSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.GENERAL_SIBLING_COMBINATOR:
				if(context == grammarAccess.getCombinatorExpressionRule() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0() ||
				   context == grammarAccess.getSelectorRule()) {
					sequence_CombinatorExpression(context, (GeneralSiblingCombinator) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.ID_SELECTOR:
				if(context == grammarAccess.getIDSelectorRule() ||
				   context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_IDSelector(context, (IDSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.IMPORT_DECLARATION:
				if(context == grammarAccess.getImportDeclarationRule()) {
					sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.INTEGER_ATTRIBUTE_VALUE_LITERAL:
				if(context == grammarAccess.getAttributeValueLiteralRule()) {
					sequence_AttributeValueLiteral(context, (IntegerAttributeValueLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getNumberLiteralRule()) {
					sequence_NumberLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.KNOWN_PROPERTY_DECLARATION:
				if(context == grammarAccess.getKnownPropertyDeclarationRule() ||
				   context == grammarAccess.getMediaDeclarationMembersRule() ||
				   context == grammarAccess.getPropertyDeclarationRule()) {
					sequence_KnownPropertyDeclaration(context, (KnownPropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR:
				if(context == grammarAccess.getLanguagePseudoClassSelectorRule() ||
				   context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getPseudoSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_LanguagePseudoClassSelector(context, (LanguagePseudoClassSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.LINEAR_ARGUMENT:
				if(context == grammarAccess.getLinearArgumentRule() ||
				   context == grammarAccess.getTypeArgumentRule()) {
					sequence_LinearArgument(context, (LinearArgument) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.MEDIA_DECLARATION:
				if(context == grammarAccess.getCSSOtherTopLevelDeclarationRule() ||
				   context == grammarAccess.getCSSTopLevelStatementRule() ||
				   context == grammarAccess.getMediaDeclarationRule()) {
					sequence_MediaDeclaration(context, (MediaDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.MEDIA_QUERY:
				if(context == grammarAccess.getMediaQueryRule()) {
					sequence_MediaQuery(context, (MediaQuery) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.MEDIA_QUERY_EXPRESSION:
				if(context == grammarAccess.getMediaQueryExpressionRule()) {
					sequence_MediaQueryExpression(context, (MediaQueryExpression) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.NAMED_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ColorLiteral(context, (NamedColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getCSSOtherTopLevelDeclarationRule() ||
				   context == grammarAccess.getCSSTopLevelStatementRule() ||
				   context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_NamespaceDeclaration(context, (NamespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.NAMESPACE_PREFIX:
				if(context == grammarAccess.getNamespacePrefixRule()) {
					sequence_NamespacePrefix(context, (NamespacePrefix) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.NEGATION_SELECTOR:
				if(context == grammarAccess.getNegationSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_NegationSelector(context, (NegationSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR:
				if(context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getNoArgsPseudoClassSelectorRule() ||
				   context == grammarAccess.getPseudoSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_NoArgsPseudoClassSelector(context, (NoArgsPseudoClassSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PAGE_DECLARATION:
				if(context == grammarAccess.getCSSOtherTopLevelDeclarationRule() ||
				   context == grammarAccess.getCSSTopLevelStatementRule() ||
				   context == grammarAccess.getPageDeclarationRule()) {
					sequence_PageDeclaration(context, (PageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PARITY_ARGUMENT:
				if(context == grammarAccess.getParityArgumentRule() ||
				   context == grammarAccess.getTypeArgumentRule()) {
					sequence_ParityArgument(context, (ParityArgument) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PROPERTY_VALUE:
				if(context == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (PropertyValue) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PROPERTY_VALUES_LIST:
				if(context == grammarAccess.getPropertyValuesListRule()) {
					sequence_PropertyValuesList(context, (PropertyValuesList) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PROPERTY_VALUES_LISTS:
				if(context == grammarAccess.getPropertyValuesListsRule()) {
					sequence_PropertyValuesLists(context, (PropertyValuesLists) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.PSEUDO_ELEMENT_SELECTOR:
				if(context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getPseudoElementSelectorRule() ||
				   context == grammarAccess.getPseudoSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTailSimpleSelectorRule()) {
					sequence_PseudoElementSelector(context, (PseudoElementSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.QUALIFIED_SIZE_LITERAL:
				if(context == grammarAccess.getSizeLiteralRule() ||
				   context == grammarAccess.getSizeLiteralAccess().getFontHeightLiteralFontHeightAction_1_1() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_SizeLiteral(context, (QualifiedSizeLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.QUANTIFIED_SIZE_LITERAL:
				if(context == grammarAccess.getSizeLiteralRule() ||
				   context == grammarAccess.getSizeLiteralAccess().getFontHeightLiteralFontHeightAction_1_1() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_SizeLiteral(context, (QuantifiedSizeLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.RGB_COLOR:
				if(context == grammarAccess.getColorLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_ColorLiteral(context, (RGBColor) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.RULE_SET:
				if(context == grammarAccess.getCSSTopLevelStatementRule() ||
				   context == grammarAccess.getMediaDeclarationMembersRule() ||
				   context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.RULE_SET_BODY:
				if(context == grammarAccess.getRuleSetBodyRule()) {
					sequence_RuleSetBody(context, (RuleSetBody) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.SIMPLE_SELECTOR_SEQUENCE:
				if(context == grammarAccess.getCombinatorExpressionRule() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getAdjacentSiblingCombinatorLeftAction_1_2_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getChildCombinatorLeftAction_1_1_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0() ||
				   context == grammarAccess.getCombinatorExpressionAccess().getGeneralSiblingCombinatorLeftAction_1_3_0() ||
				   context == grammarAccess.getSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorSequenceRule()) {
					sequence_SimpleSelectorSequence(context, (SimpleSelectorSequence) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.STRING_ATTRIBUTE_VALUE_LITERAL:
				if(context == grammarAccess.getAttributeValueLiteralRule()) {
					sequence_AttributeValueLiteral(context, (StringAttributeValueLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.STRING_LITERAL:
				if(context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_Stylesheet(context, (Stylesheet) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.TYPE_SELECTOR:
				if(context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getTypeSelectorRule()) {
					sequence_TypeSelector(context, (TypeSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.URL_LITERAL:
				if(context == grammarAccess.getURLLiteralRule() ||
				   context == grammarAccess.getValueLiteralRule()) {
					sequence_URLLiteral(context, (URLLiteral) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.UNIVERSAL_NAMESPACE_PREFIX:
				if(context == grammarAccess.getNamespacePrefixRule()) {
					sequence_NamespacePrefix(context, (UniversalNamespacePrefix) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.UNIVERSAL_SELECTOR:
				if(context == grammarAccess.getNegationSimpleSelectorRule() ||
				   context == grammarAccess.getSimpleSelectorRule() ||
				   context == grammarAccess.getUniversalSelectorRule()) {
					sequence_UniversalSelector(context, (UniversalSelector) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.UNRECOGNIZED_PROPERTY_DECLARATION:
				if(context == grammarAccess.getMediaDeclarationMembersRule() ||
				   context == grammarAccess.getPropertyDeclarationRule() ||
				   context == grammarAccess.getUnrecognizedPropertyDeclarationRule()) {
					sequence_UnrecognizedPropertyDeclaration(context, (UnrecognizedPropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CssPackage.WITHOUT_NAMESPACE_PREFIX:
				if(context == grammarAccess.getNamespacePrefixRule()) {
					sequence_NamespacePrefix(context, (WithoutNamespacePrefix) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attribute=Attribute (matcher=AttributeSelectorMatchers value=AttributeValueLiteral)?)
	 */
	protected void sequence_AttributeSelector(EObject context, AttributeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DECIMAL
	 */
	protected void sequence_AttributeValueLiteral(EObject context, DecimalAttributeValueLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.DECIMAL_ATTRIBUTE_VALUE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.DECIMAL_ATTRIBUTE_VALUE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeValueLiteralAccess().getValueDECIMALTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_AttributeValueLiteral(EObject context, IntegerAttributeValueLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.INTEGER_ATTRIBUTE_VALUE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.INTEGER_ATTRIBUTE_VALUE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeValueLiteralAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=IDENT | value=STRING)
	 */
	protected void sequence_AttributeValueLiteral(EObject context, StringAttributeValueLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespacePrefix=NamespacePrefix? name=IDENT)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bareWord=IDENT
	 */
	protected void sequence_BareWordLiteral(EObject context, BareWordLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.BARE_WORD_LITERAL__BARE_WORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.BARE_WORD_LITERAL__BARE_WORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBareWordLiteralAccess().getBareWordIDENTTerminalRuleCall_0(), semanticObject.getBareWord());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=DOT_ID
	 */
	protected void sequence_ClassSelector(EObject context, ClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.CLASS_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.CLASS_SELECTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassSelectorAccess().getNameDOT_IDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (int=INT?)
	 */
	protected void sequence_Coefficient(EObject context, Coefficient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=NumberLiteral percentage?='%'?)
	 */
	protected void sequence_ColorComponentLiteral(EObject context, ColorComponentLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=ColorNames
	 */
	protected void sequence_ColorLiteral(EObject context, NamedColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.NAMED_COLOR__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.NAMED_COLOR__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorLiteralAccess().getColorColorNamesEnumRuleCall_1_1_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rgb=HEX_COLOR
	 */
	protected void sequence_ColorLiteral(EObject context, RGBColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.RGB_COLOR__RGB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.RGB_COLOR__RGB));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorLiteralAccess().getRgbHEX_COLORTerminalRuleCall_0_1_0(), semanticObject.getRgb());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (
	 *                 (left=CombinatorExpression_AdjacentSiblingCombinator_1_2_0 wsL=WS? wsR=WS?) | 
	 *                 (left=CombinatorExpression_AdjacentSiblingCombinator_1_2_0 wsR=WS?)
	 *             ) 
	 *             right=SimpleSelectorSequence
	 *         ) | 
	 *         (left=CombinatorExpression_AdjacentSiblingCombinator_1_2_0 right=SimpleSelectorSequence)
	 *     )
	 */
	protected void sequence_CombinatorExpression(EObject context, AdjacentSiblingCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             ((left=CombinatorExpression_ChildCombinator_1_1_0 wsL=WS? wsR=WS?) | (left=CombinatorExpression_ChildCombinator_1_1_0 wsR=WS?)) 
	 *             right=SimpleSelectorSequence
	 *         ) | 
	 *         (left=CombinatorExpression_ChildCombinator_1_1_0 right=SimpleSelectorSequence)
	 *     )
	 */
	protected void sequence_CombinatorExpression(EObject context, ChildCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CombinatorExpression_DescendantCombinator_1_0_0 wsI=WS right=SimpleSelectorSequence)
	 */
	protected void sequence_CombinatorExpression(EObject context, DescendantCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__LEFT));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__WS_I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__WS_I));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.DESCENDANT_COMBINATOR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCombinatorExpressionAccess().getDescendantCombinatorLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCombinatorExpressionAccess().getWsIWSTerminalRuleCall_1_0_1_0(), semanticObject.getWsI());
		feeder.accept(grammarAccess.getCombinatorExpressionAccess().getRightSimpleSelectorSequenceParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             ((left=CombinatorExpression_GeneralSiblingCombinator_1_3_0 wsL=WS? wsR=WS?) | (left=CombinatorExpression_GeneralSiblingCombinator_1_3_0 wsR=WS?)) 
	 *             right=SimpleSelectorSequence
	 *         ) | 
	 *         (left=CombinatorExpression_GeneralSiblingCombinator_1_3_0 right=SimpleSelectorSequence)
	 *     )
	 */
	protected void sequence_CombinatorExpression(EObject context, GeneralSiblingCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (hue=ColorComponentLiteral saturation=ColorComponentLiteral lightness=ColorComponentLiteral opacity=ColorComponentLiteral)
	 */
	protected void sequence_ComponentColorLiteral(EObject context, ComponentHSLAlphaColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__HUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__HUE));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__SATURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__SATURATION));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__OPACITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR__OPACITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getHueColorComponentLiteralParserRuleCall_3_3_0(), semanticObject.getHue());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getSaturationColorComponentLiteralParserRuleCall_3_5_0(), semanticObject.getSaturation());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getLightnessColorComponentLiteralParserRuleCall_3_7_0(), semanticObject.getLightness());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getOpacityColorComponentLiteralParserRuleCall_3_9_0(), semanticObject.getOpacity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (hue=ColorComponentLiteral saturation=ColorComponentLiteral lightness=ColorComponentLiteral)
	 */
	protected void sequence_ComponentColorLiteral(EObject context, ComponentHSLColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__HUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__HUE));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__SATURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__SATURATION));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__LIGHTNESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_HSL_COLOR__LIGHTNESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getHueColorComponentLiteralParserRuleCall_2_3_0(), semanticObject.getHue());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getSaturationColorComponentLiteralParserRuleCall_2_5_0(), semanticObject.getSaturation());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getLightnessColorComponentLiteralParserRuleCall_2_7_0(), semanticObject.getLightness());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (red=ColorComponentLiteral green=ColorComponentLiteral blue=ColorComponentLiteral opacity=ColorComponentLiteral)
	 */
	protected void sequence_ComponentColorLiteral(EObject context, ComponentRGBAlphaColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__RED));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__GREEN));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__BLUE));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__OPACITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_ALPHA_COLOR__OPACITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getRedColorComponentLiteralParserRuleCall_1_3_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getGreenColorComponentLiteralParserRuleCall_1_5_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getBlueColorComponentLiteralParserRuleCall_1_7_0(), semanticObject.getBlue());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getOpacityColorComponentLiteralParserRuleCall_1_9_0(), semanticObject.getOpacity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (red=ColorComponentLiteral green=ColorComponentLiteral blue=ColorComponentLiteral)
	 */
	protected void sequence_ComponentColorLiteral(EObject context, ComponentRGBColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__RED));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__GREEN));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.COMPONENT_RGB_COLOR__BLUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getRedColorComponentLiteralParserRuleCall_0_3_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getGreenColorComponentLiteralParserRuleCall_0_5_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getComponentColorLiteralAccess().getBlueColorComponentLiteralParserRuleCall_0_7_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((sign='-' | sign='+')? int=INT)
	 */
	protected void sequence_ConstantArgument(EObject context, ConstantArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=RuleSetBody
	 */
	protected void sequence_FontFaceDeclaration(EObject context, FontFaceDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.FONT_FACE_DECLARATION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.FONT_FACE_DECLARATION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFontFaceDeclarationAccess().getBodyRuleSetBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     opacity=NumberLiteral
	 */
	protected void sequence_FunctionCallLiteral(EObject context, AlphaLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=IDENT (arguments+=ValueLiteral arguments+=ValueLiteral*)?)
	 */
	protected void sequence_FunctionCallLiteral(EObject context, FunctionCallLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pseudo=FunctionalPseudoClasses argument=TypeArgument)
	 */
	protected void sequence_FunctionalPseudoClassSelector(EObject context, FunctionalPseudoClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionalPseudoClassSelectorAccess().getPseudoFunctionalPseudoClassesEnumRuleCall_1_0(), semanticObject.getPseudo());
		feeder.accept(grammarAccess.getFunctionalPseudoClassSelectorAccess().getArgumentTypeArgumentParserRuleCall_3_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=HASH_ID | name=HEX_COLOR)
	 */
	protected void sequence_IDSelector(EObject context, IDSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((importURI=STRING | url=URL) (media+=IDENT media+=IDENT*)?)
	 */
	protected void sequence_ImportDeclaration(EObject context, ImportDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=KnownProperties valuesLists=PropertyValuesLists)
	 */
	protected void sequence_KnownPropertyDeclaration(EObject context, KnownPropertyDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.PROPERTY_DECLARATION__VALUES_LISTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.PROPERTY_DECLARATION__VALUES_LISTS));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.KNOWN_PROPERTY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.KNOWN_PROPERTY_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKnownPropertyDeclarationAccess().getNameKnownPropertiesEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKnownPropertyDeclarationAccess().getValuesListsPropertyValuesListsParserRuleCall_2_0(), semanticObject.getValuesLists());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     langugageId=IDENT
	 */
	protected void sequence_LanguagePseudoClassSelector(EObject context, LanguagePseudoClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLanguagePseudoClassSelectorAccess().getLangugageIdIDENTTerminalRuleCall_3_0(), semanticObject.getLangugageId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (coefficient=Coefficient ((constantSign='-' | constantSign='+')? constant=INT)?)
	 */
	protected void sequence_LinearArgument(EObject context, LinearArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mediaQueries+=MediaQuery media+=MediaQuery* members+=MediaDeclarationMembers*)
	 */
	protected void sequence_MediaDeclaration(EObject context, MediaDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=IDENT expression=ValueLiteral?)
	 */
	protected void sequence_MediaQueryExpression(EObject context, MediaQueryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((only?='only' | not?='not')? mediaType=IDENT expressions+=MediaQueryExpression*) | 
	 *         (expressions+=MediaQueryExpression expressions+=MediaQueryExpression*)
	 *     )
	 */
	protected void sequence_MediaQuery(EObject context, MediaQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT? (url=STRING | url=URL))
	 */
	protected void sequence_NamespaceDeclaration(EObject context, NamespaceDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namespace=[NamespaceDeclaration|IDENT]
	 */
	protected void sequence_NamespacePrefix(EObject context, NamespacePrefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.NAMESPACE_PREFIX__NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.NAMESPACE_PREFIX__NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespacePrefixAccess().getNamespaceNamespaceDeclarationIDENTTerminalRuleCall_0_0_0_1_0_1(), semanticObject.getNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {UniversalNamespacePrefix}
	 */
	protected void sequence_NamespacePrefix(EObject context, UniversalNamespacePrefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WithoutNamespacePrefix}
	 */
	protected void sequence_NamespacePrefix(EObject context, WithoutNamespacePrefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     simpleSelector=NegationSimpleSelector
	 */
	protected void sequence_NegationSelector(EObject context, NegationSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.NEGATION_SELECTOR__SIMPLE_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.NEGATION_SELECTOR__SIMPLE_SELECTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationSelectorAccess().getSimpleSelectorNegationSimpleSelectorParserRuleCall_2_0(), semanticObject.getSimpleSelector());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pseudo=NoArgsPseudos
	 */
	protected void sequence_NoArgsPseudoClassSelector(EObject context, NoArgsPseudoClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoArgsPseudoClassSelectorAccess().getPseudoNoArgsPseudosEnumRuleCall_1_0(), semanticObject.getPseudo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     decimal=DECIMAL
	 */
	protected void sequence_NumberLiteral(EObject context, DecimalLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.DECIMAL_LITERAL__DECIMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.DECIMAL_LITERAL__DECIMAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getDecimalDECIMALTerminalRuleCall_1_1_0(), semanticObject.getDecimal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     int=INT
	 */
	protected void sequence_NumberLiteral(EObject context, IntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.INTEGER_LITERAL__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.INTEGER_LITERAL__INT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getIntINTTerminalRuleCall_0_1_0(), semanticObject.getInt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pseudoPage=IDENT? body=RuleSetBody)
	 */
	protected void sequence_PageDeclaration(EObject context, PageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parity=Parities
	 */
	protected void sequence_ParityArgument(EObject context, ParityArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.PARITY_ARGUMENT__PARITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.PARITY_ARGUMENT__PARITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParityArgumentAccess().getParityParitiesEnumRuleCall_0(), semanticObject.getParity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=ValueLiteral important?='!important'?)
	 */
	protected void sequence_PropertyValue(EObject context, PropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=PropertyValue+
	 */
	protected void sequence_PropertyValuesList(EObject context, PropertyValuesList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lists+=PropertyValuesList lists+=PropertyValuesList*)
	 */
	protected void sequence_PropertyValuesLists(EObject context, PropertyValuesLists semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doubleSemiColon?=':'? pseudo=PseudoElements)
	 */
	protected void sequence_PseudoElementSelector(EObject context, PseudoElementSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declarations+=PropertyDeclaration declarations+=PropertyDeclaration*)?)
	 */
	protected void sequence_RuleSetBody(EObject context, RuleSetBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=Selector selectors+=Selector* body=RuleSetBody)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((head=TypeSelector | head=UniversalSelector) simpleSelectors+=TailSimpleSelector*) | simpleSelectors+=TailSimpleSelector+)
	 */
	protected void sequence_SimpleSelectorSequence(EObject context, SimpleSelectorSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fontHeight=SizeLiteral_FontHeightLiteral_1_1 lineHeight=NumberLiteral lineHeightDimension=Dimensions?)
	 */
	protected void sequence_SizeLiteral(EObject context, FontHeightLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bareword=IDENT
	 */
	protected void sequence_SizeLiteral(EObject context, QualifiedSizeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.QUALIFIED_SIZE_LITERAL__BAREWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.QUALIFIED_SIZE_LITERAL__BAREWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeLiteralAccess().getBarewordIDENTTerminalRuleCall_0_1_1_0(), semanticObject.getBareword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (number=NumberLiteral dimension=Dimensions?)
	 */
	protected void sequence_SizeLiteral(EObject context, QuantifiedSizeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (charSet=STRING? imports+=ImportDeclaration* statements+=CSSTopLevelStatement*)
	 */
	protected void sequence_Stylesheet(EObject context, Stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespacePrefix=NamespacePrefix? type=IDENT)
	 */
	protected void sequence_TypeSelector(EObject context, TypeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=URL
	 */
	protected void sequence_URLLiteral(EObject context, URLLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.URL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.URL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getURLLiteralAccess().getValueURLTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (namespacePrefix=NamespacePrefix?)
	 */
	protected void sequence_UniversalSelector(EObject context, UniversalSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PropertyName valuesLists=PropertyValuesLists)
	 */
	protected void sequence_UnrecognizedPropertyDeclaration(EObject context, UnrecognizedPropertyDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.PROPERTY_DECLARATION__VALUES_LISTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.PROPERTY_DECLARATION__VALUES_LISTS));
			if(transientValues.isValueTransient(semanticObject, CssPackage.Literals.UNRECOGNIZED_PROPERTY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssPackage.Literals.UNRECOGNIZED_PROPERTY_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getNamePropertyNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUnrecognizedPropertyDeclarationAccess().getValuesListsPropertyValuesListsParserRuleCall_2_0(), semanticObject.getValuesLists());
		feeder.finish();
	}
}
