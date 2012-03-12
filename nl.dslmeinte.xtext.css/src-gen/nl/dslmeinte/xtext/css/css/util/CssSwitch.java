/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.util;

import nl.dslmeinte.xtext.css.css.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage
 * @generated
 */
public class CssSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CssPackage.STYLESHEET:
      {
        Stylesheet stylesheet = (Stylesheet)theEObject;
        T result = caseStylesheet(stylesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.CSS_TOP_LEVEL_STATEMENT:
      {
        CSSTopLevelStatement cssTopLevelStatement = (CSSTopLevelStatement)theEObject;
        T result = caseCSSTopLevelStatement(cssTopLevelStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.CSS_OTHER_TOP_LEVEL_DECLARATION:
      {
        CSSOtherTopLevelDeclaration cssOtherTopLevelDeclaration = (CSSOtherTopLevelDeclaration)theEObject;
        T result = caseCSSOtherTopLevelDeclaration(cssOtherTopLevelDeclaration);
        if (result == null) result = caseCSSTopLevelStatement(cssOtherTopLevelDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.IMPORT_DECLARATION:
      {
        ImportDeclaration importDeclaration = (ImportDeclaration)theEObject;
        T result = caseImportDeclaration(importDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.MEDIA_DECLARATION:
      {
        MediaDeclaration mediaDeclaration = (MediaDeclaration)theEObject;
        T result = caseMediaDeclaration(mediaDeclaration);
        if (result == null) result = caseCSSOtherTopLevelDeclaration(mediaDeclaration);
        if (result == null) result = caseCSSTopLevelStatement(mediaDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.MEDIA_DECLARATION_MEMBERS:
      {
        MediaDeclarationMembers mediaDeclarationMembers = (MediaDeclarationMembers)theEObject;
        T result = caseMediaDeclarationMembers(mediaDeclarationMembers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.MEDIA_QUERY:
      {
        MediaQuery mediaQuery = (MediaQuery)theEObject;
        T result = caseMediaQuery(mediaQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.MEDIA_QUERY_EXPRESSION:
      {
        MediaQueryExpression mediaQueryExpression = (MediaQueryExpression)theEObject;
        T result = caseMediaQueryExpression(mediaQueryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PAGE_DECLARATION:
      {
        PageDeclaration pageDeclaration = (PageDeclaration)theEObject;
        T result = casePageDeclaration(pageDeclaration);
        if (result == null) result = caseCSSOtherTopLevelDeclaration(pageDeclaration);
        if (result == null) result = caseCSSTopLevelStatement(pageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NAMESPACE_DECLARATION:
      {
        NamespaceDeclaration namespaceDeclaration = (NamespaceDeclaration)theEObject;
        T result = caseNamespaceDeclaration(namespaceDeclaration);
        if (result == null) result = caseCSSOtherTopLevelDeclaration(namespaceDeclaration);
        if (result == null) result = caseCSSTopLevelStatement(namespaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.FONT_FACE_DECLARATION:
      {
        FontFaceDeclaration fontFaceDeclaration = (FontFaceDeclaration)theEObject;
        T result = caseFontFaceDeclaration(fontFaceDeclaration);
        if (result == null) result = caseCSSOtherTopLevelDeclaration(fontFaceDeclaration);
        if (result == null) result = caseCSSTopLevelStatement(fontFaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.RULE_SET:
      {
        RuleSet ruleSet = (RuleSet)theEObject;
        T result = caseRuleSet(ruleSet);
        if (result == null) result = caseCSSTopLevelStatement(ruleSet);
        if (result == null) result = caseMediaDeclarationMembers(ruleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.RULE_SET_BODY:
      {
        RuleSetBody ruleSetBody = (RuleSetBody)theEObject;
        T result = caseRuleSetBody(ruleSetBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PROPERTY_DECLARATION:
      {
        PropertyDeclaration propertyDeclaration = (PropertyDeclaration)theEObject;
        T result = casePropertyDeclaration(propertyDeclaration);
        if (result == null) result = caseMediaDeclarationMembers(propertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.KNOWN_PROPERTY_DECLARATION:
      {
        KnownPropertyDeclaration knownPropertyDeclaration = (KnownPropertyDeclaration)theEObject;
        T result = caseKnownPropertyDeclaration(knownPropertyDeclaration);
        if (result == null) result = casePropertyDeclaration(knownPropertyDeclaration);
        if (result == null) result = caseMediaDeclarationMembers(knownPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.UNRECOGNIZED_PROPERTY_DECLARATION:
      {
        UnrecognizedPropertyDeclaration unrecognizedPropertyDeclaration = (UnrecognizedPropertyDeclaration)theEObject;
        T result = caseUnrecognizedPropertyDeclaration(unrecognizedPropertyDeclaration);
        if (result == null) result = casePropertyDeclaration(unrecognizedPropertyDeclaration);
        if (result == null) result = caseMediaDeclarationMembers(unrecognizedPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PROPERTY_VALUES_LISTS:
      {
        PropertyValuesLists propertyValuesLists = (PropertyValuesLists)theEObject;
        T result = casePropertyValuesLists(propertyValuesLists);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PROPERTY_VALUES_LIST:
      {
        PropertyValuesList propertyValuesList = (PropertyValuesList)theEObject;
        T result = casePropertyValuesList(propertyValuesList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.SELECTOR:
      {
        Selector selector = (Selector)theEObject;
        T result = caseSelector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.SIMPLE_SELECTOR:
      {
        SimpleSelector simpleSelector = (SimpleSelector)theEObject;
        T result = caseSimpleSelector(simpleSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.TYPE_SELECTOR:
      {
        TypeSelector typeSelector = (TypeSelector)theEObject;
        T result = caseTypeSelector(typeSelector);
        if (result == null) result = caseSimpleSelector(typeSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NAMESPACE_PREFIX:
      {
        NamespacePrefix namespacePrefix = (NamespacePrefix)theEObject;
        T result = caseNamespacePrefix(namespacePrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.UNIVERSAL_SELECTOR:
      {
        UniversalSelector universalSelector = (UniversalSelector)theEObject;
        T result = caseUniversalSelector(universalSelector);
        if (result == null) result = caseSimpleSelector(universalSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ATTRIBUTE_SELECTOR:
      {
        AttributeSelector attributeSelector = (AttributeSelector)theEObject;
        T result = caseAttributeSelector(attributeSelector);
        if (result == null) result = caseSimpleSelector(attributeSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ATTRIBUTE_VALUE_LITERAL:
      {
        AttributeValueLiteral attributeValueLiteral = (AttributeValueLiteral)theEObject;
        T result = caseAttributeValueLiteral(attributeValueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ID_SELECTOR:
      {
        IDSelector idSelector = (IDSelector)theEObject;
        T result = caseIDSelector(idSelector);
        if (result == null) result = caseSimpleSelector(idSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.CLASS_SELECTOR:
      {
        ClassSelector classSelector = (ClassSelector)theEObject;
        T result = caseClassSelector(classSelector);
        if (result == null) result = caseSimpleSelector(classSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PSEUDO_SELECTOR:
      {
        PseudoSelector pseudoSelector = (PseudoSelector)theEObject;
        T result = casePseudoSelector(pseudoSelector);
        if (result == null) result = caseSimpleSelector(pseudoSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR:
      {
        NoArgsPseudoClassSelector noArgsPseudoClassSelector = (NoArgsPseudoClassSelector)theEObject;
        T result = caseNoArgsPseudoClassSelector(noArgsPseudoClassSelector);
        if (result == null) result = casePseudoSelector(noArgsPseudoClassSelector);
        if (result == null) result = caseSimpleSelector(noArgsPseudoClassSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PSEUDO_ELEMENT_SELECTOR:
      {
        PseudoElementSelector pseudoElementSelector = (PseudoElementSelector)theEObject;
        T result = casePseudoElementSelector(pseudoElementSelector);
        if (result == null) result = casePseudoSelector(pseudoElementSelector);
        if (result == null) result = caseSimpleSelector(pseudoElementSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR:
      {
        LanguagePseudoClassSelector languagePseudoClassSelector = (LanguagePseudoClassSelector)theEObject;
        T result = caseLanguagePseudoClassSelector(languagePseudoClassSelector);
        if (result == null) result = casePseudoSelector(languagePseudoClassSelector);
        if (result == null) result = caseSimpleSelector(languagePseudoClassSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR:
      {
        FunctionalPseudoClassSelector functionalPseudoClassSelector = (FunctionalPseudoClassSelector)theEObject;
        T result = caseFunctionalPseudoClassSelector(functionalPseudoClassSelector);
        if (result == null) result = casePseudoSelector(functionalPseudoClassSelector);
        if (result == null) result = caseSimpleSelector(functionalPseudoClassSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.TYPE_ARGUMENT:
      {
        TypeArgument typeArgument = (TypeArgument)theEObject;
        T result = caseTypeArgument(typeArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.LINEAR_ARGUMENT:
      {
        LinearArgument linearArgument = (LinearArgument)theEObject;
        T result = caseLinearArgument(linearArgument);
        if (result == null) result = caseTypeArgument(linearArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COEFFICIENT:
      {
        Coefficient coefficient = (Coefficient)theEObject;
        T result = caseCoefficient(coefficient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.CONSTANT_ARGUMENT:
      {
        ConstantArgument constantArgument = (ConstantArgument)theEObject;
        T result = caseConstantArgument(constantArgument);
        if (result == null) result = caseTypeArgument(constantArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.PARITY_ARGUMENT:
      {
        ParityArgument parityArgument = (ParityArgument)theEObject;
        T result = caseParityArgument(parityArgument);
        if (result == null) result = caseTypeArgument(parityArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NEGATION_SELECTOR:
      {
        NegationSelector negationSelector = (NegationSelector)theEObject;
        T result = caseNegationSelector(negationSelector);
        if (result == null) result = caseSimpleSelector(negationSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.VALUE_LITERAL:
      {
        ValueLiteral valueLiteral = (ValueLiteral)theEObject;
        T result = caseValueLiteral(valueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.SIZE_LITERAL:
      {
        SizeLiteral sizeLiteral = (SizeLiteral)theEObject;
        T result = caseSizeLiteral(sizeLiteral);
        if (result == null) result = caseValueLiteral(sizeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseValueLiteral(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COLOR_LITERAL:
      {
        ColorLiteral colorLiteral = (ColorLiteral)theEObject;
        T result = caseColorLiteral(colorLiteral);
        if (result == null) result = caseValueLiteral(colorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COMPONENT_COLOR_LITERAL:
      {
        ComponentColorLiteral componentColorLiteral = (ComponentColorLiteral)theEObject;
        T result = caseComponentColorLiteral(componentColorLiteral);
        if (result == null) result = caseColorLiteral(componentColorLiteral);
        if (result == null) result = caseValueLiteral(componentColorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COLOR_COMPONENT_LITERAL:
      {
        ColorComponentLiteral colorComponentLiteral = (ColorComponentLiteral)theEObject;
        T result = caseColorComponentLiteral(colorComponentLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.URL_LITERAL:
      {
        URLLiteral urlLiteral = (URLLiteral)theEObject;
        T result = caseURLLiteral(urlLiteral);
        if (result == null) result = caseValueLiteral(urlLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.BARE_WORD_LITERAL:
      {
        BareWordLiteral bareWordLiteral = (BareWordLiteral)theEObject;
        T result = caseBareWordLiteral(bareWordLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.FUNCTION_CALL_LITERAL:
      {
        FunctionCallLiteral functionCallLiteral = (FunctionCallLiteral)theEObject;
        T result = caseFunctionCallLiteral(functionCallLiteral);
        if (result == null) result = caseValueLiteral(functionCallLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.DESCENDANT_COMBINATOR:
      {
        DescendantCombinator descendantCombinator = (DescendantCombinator)theEObject;
        T result = caseDescendantCombinator(descendantCombinator);
        if (result == null) result = caseSelector(descendantCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.CHILD_COMBINATOR:
      {
        ChildCombinator childCombinator = (ChildCombinator)theEObject;
        T result = caseChildCombinator(childCombinator);
        if (result == null) result = caseSelector(childCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ADJACENT_SIBLING_COMBINATOR:
      {
        AdjacentSiblingCombinator adjacentSiblingCombinator = (AdjacentSiblingCombinator)theEObject;
        T result = caseAdjacentSiblingCombinator(adjacentSiblingCombinator);
        if (result == null) result = caseSelector(adjacentSiblingCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.GENERAL_SIBLING_COMBINATOR:
      {
        GeneralSiblingCombinator generalSiblingCombinator = (GeneralSiblingCombinator)theEObject;
        T result = caseGeneralSiblingCombinator(generalSiblingCombinator);
        if (result == null) result = caseSelector(generalSiblingCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE:
      {
        SimpleSelectorSequence simpleSelectorSequence = (SimpleSelectorSequence)theEObject;
        T result = caseSimpleSelectorSequence(simpleSelectorSequence);
        if (result == null) result = caseSelector(simpleSelectorSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.UNIVERSAL_NAMESPACE_PREFIX:
      {
        UniversalNamespacePrefix universalNamespacePrefix = (UniversalNamespacePrefix)theEObject;
        T result = caseUniversalNamespacePrefix(universalNamespacePrefix);
        if (result == null) result = caseNamespacePrefix(universalNamespacePrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.WITHOUT_NAMESPACE_PREFIX:
      {
        WithoutNamespacePrefix withoutNamespacePrefix = (WithoutNamespacePrefix)theEObject;
        T result = caseWithoutNamespacePrefix(withoutNamespacePrefix);
        if (result == null) result = caseNamespacePrefix(withoutNamespacePrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.STRING_ATTRIBUTE_VALUE_LITERAL:
      {
        StringAttributeValueLiteral stringAttributeValueLiteral = (StringAttributeValueLiteral)theEObject;
        T result = caseStringAttributeValueLiteral(stringAttributeValueLiteral);
        if (result == null) result = caseAttributeValueLiteral(stringAttributeValueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.INTEGER_ATTRIBUTE_VALUE_LITERAL:
      {
        IntegerAttributeValueLiteral integerAttributeValueLiteral = (IntegerAttributeValueLiteral)theEObject;
        T result = caseIntegerAttributeValueLiteral(integerAttributeValueLiteral);
        if (result == null) result = caseAttributeValueLiteral(integerAttributeValueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.DECIMAL_ATTRIBUTE_VALUE_LITERAL:
      {
        DecimalAttributeValueLiteral decimalAttributeValueLiteral = (DecimalAttributeValueLiteral)theEObject;
        T result = caseDecimalAttributeValueLiteral(decimalAttributeValueLiteral);
        if (result == null) result = caseAttributeValueLiteral(decimalAttributeValueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseNumberLiteral(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.DECIMAL_LITERAL:
      {
        DecimalLiteral decimalLiteral = (DecimalLiteral)theEObject;
        T result = caseDecimalLiteral(decimalLiteral);
        if (result == null) result = caseNumberLiteral(decimalLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.QUANTIFIED_SIZE_LITERAL:
      {
        QuantifiedSizeLiteral quantifiedSizeLiteral = (QuantifiedSizeLiteral)theEObject;
        T result = caseQuantifiedSizeLiteral(quantifiedSizeLiteral);
        if (result == null) result = caseSizeLiteral(quantifiedSizeLiteral);
        if (result == null) result = caseValueLiteral(quantifiedSizeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.QUALIFIED_SIZE_LITERAL:
      {
        QualifiedSizeLiteral qualifiedSizeLiteral = (QualifiedSizeLiteral)theEObject;
        T result = caseQualifiedSizeLiteral(qualifiedSizeLiteral);
        if (result == null) result = caseSizeLiteral(qualifiedSizeLiteral);
        if (result == null) result = caseValueLiteral(qualifiedSizeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.FONT_HEIGHT_LITERAL:
      {
        FontHeightLiteral fontHeightLiteral = (FontHeightLiteral)theEObject;
        T result = caseFontHeightLiteral(fontHeightLiteral);
        if (result == null) result = caseSizeLiteral(fontHeightLiteral);
        if (result == null) result = caseValueLiteral(fontHeightLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.RGB_COLOR:
      {
        RGBColor rgbColor = (RGBColor)theEObject;
        T result = caseRGBColor(rgbColor);
        if (result == null) result = caseColorLiteral(rgbColor);
        if (result == null) result = caseValueLiteral(rgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.NAMED_COLOR:
      {
        NamedColor namedColor = (NamedColor)theEObject;
        T result = caseNamedColor(namedColor);
        if (result == null) result = caseColorLiteral(namedColor);
        if (result == null) result = caseValueLiteral(namedColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COMPONENT_RGB_COLOR:
      {
        ComponentRGBColor componentRGBColor = (ComponentRGBColor)theEObject;
        T result = caseComponentRGBColor(componentRGBColor);
        if (result == null) result = caseComponentColorLiteral(componentRGBColor);
        if (result == null) result = caseColorLiteral(componentRGBColor);
        if (result == null) result = caseValueLiteral(componentRGBColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COMPONENT_RGB_ALPHA_COLOR:
      {
        ComponentRGBAlphaColor componentRGBAlphaColor = (ComponentRGBAlphaColor)theEObject;
        T result = caseComponentRGBAlphaColor(componentRGBAlphaColor);
        if (result == null) result = caseComponentColorLiteral(componentRGBAlphaColor);
        if (result == null) result = caseColorLiteral(componentRGBAlphaColor);
        if (result == null) result = caseValueLiteral(componentRGBAlphaColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COMPONENT_HSL_COLOR:
      {
        ComponentHSLColor componentHSLColor = (ComponentHSLColor)theEObject;
        T result = caseComponentHSLColor(componentHSLColor);
        if (result == null) result = caseComponentColorLiteral(componentHSLColor);
        if (result == null) result = caseColorLiteral(componentHSLColor);
        if (result == null) result = caseValueLiteral(componentHSLColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR:
      {
        ComponentHSLAlphaColor componentHSLAlphaColor = (ComponentHSLAlphaColor)theEObject;
        T result = caseComponentHSLAlphaColor(componentHSLAlphaColor);
        if (result == null) result = caseComponentColorLiteral(componentHSLAlphaColor);
        if (result == null) result = caseColorLiteral(componentHSLAlphaColor);
        if (result == null) result = caseValueLiteral(componentHSLAlphaColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssPackage.ALPHA_LITERAL:
      {
        AlphaLiteral alphaLiteral = (AlphaLiteral)theEObject;
        T result = caseAlphaLiteral(alphaLiteral);
        if (result == null) result = caseFunctionCallLiteral(alphaLiteral);
        if (result == null) result = caseValueLiteral(alphaLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stylesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stylesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStylesheet(Stylesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Top Level Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Top Level Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSTopLevelStatement(CSSTopLevelStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Other Top Level Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Other Top Level Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSOtherTopLevelDeclaration(CSSOtherTopLevelDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDeclaration(ImportDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Media Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Media Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMediaDeclaration(MediaDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Media Declaration Members</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Media Declaration Members</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMediaDeclarationMembers(MediaDeclarationMembers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Media Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Media Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMediaQuery(MediaQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Media Query Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Media Query Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMediaQueryExpression(MediaQueryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageDeclaration(PageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceDeclaration(NamespaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Face Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Face Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontFaceDeclaration(FontFaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleSet(RuleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Set Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Set Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleSetBody(RuleSetBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDeclaration(PropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Known Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Known Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKnownPropertyDeclaration(KnownPropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unrecognized Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unrecognized Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnrecognizedPropertyDeclaration(UnrecognizedPropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Values Lists</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Values Lists</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValuesLists(PropertyValuesLists object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Values List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Values List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValuesList(PropertyValuesList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelector(Selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSelector(SimpleSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSelector(TypeSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespacePrefix(NamespacePrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universal Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universal Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversalSelector(UniversalSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSelector(AttributeSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Value Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValueLiteral(AttributeValueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDSelector(IDSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassSelector(ClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoSelector(PseudoSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Args Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Args Pseudo Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoArgsPseudoClassSelector(NoArgsPseudoClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Element Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Element Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoElementSelector(PseudoElementSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Pseudo Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguagePseudoClassSelector(LanguagePseudoClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functional Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Pseudo Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionalPseudoClassSelector(FunctionalPseudoClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeArgument(TypeArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearArgument(LinearArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coefficient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coefficient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoefficient(Coefficient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantArgument(ConstantArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parity Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parity Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParityArgument(ParityArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegationSelector(NegationSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueLiteral(ValueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeLiteral(SizeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorLiteral(ColorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Color Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Color Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentColorLiteral(ComponentColorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Component Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Component Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorComponentLiteral(ColorComponentLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURLLiteral(URLLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bare Word Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bare Word Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBareWordLiteral(BareWordLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallLiteral(FunctionCallLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descendant Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descendant Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescendantCombinator(DescendantCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Child Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildCombinator(ChildCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adjacent Sibling Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adjacent Sibling Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjacentSiblingCombinator(AdjacentSiblingCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Sibling Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Sibling Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralSiblingCombinator(GeneralSiblingCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Selector Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Selector Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSelectorSequence(SimpleSelectorSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universal Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universal Namespace Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversalNamespacePrefix(UniversalNamespacePrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Without Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Without Namespace Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithoutNamespacePrefix(WithoutNamespacePrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attribute Value Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttributeValueLiteral(StringAttributeValueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attribute Value Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttributeValueLiteral(IntegerAttributeValueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Attribute Value Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalAttributeValueLiteral(DecimalAttributeValueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalLiteral(DecimalLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Size Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Size Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedSizeLiteral(QuantifiedSizeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Size Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Size Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedSizeLiteral(QualifiedSizeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Height Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Height Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontHeightLiteral(FontHeightLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGBColor(RGBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedColor(NamedColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component RGB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component RGB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRGBColor(ComponentRGBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component RGB Alpha Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component RGB Alpha Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRGBAlphaColor(ComponentRGBAlphaColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component HSL Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component HSL Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentHSLColor(ComponentHSLColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component HSL Alpha Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component HSL Alpha Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentHSLAlphaColor(ComponentHSLAlphaColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlphaLiteral(AlphaLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CssSwitch
