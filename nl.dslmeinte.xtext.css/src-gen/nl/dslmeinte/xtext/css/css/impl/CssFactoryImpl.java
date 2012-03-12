/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssFactoryImpl extends EFactoryImpl implements CssFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssFactory init()
  {
    try
    {
      CssFactory theCssFactory = (CssFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dslmeinte.nl/xtext/css"); 
      if (theCssFactory != null)
      {
        return theCssFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CssPackage.STYLESHEET: return createStylesheet();
      case CssPackage.CSS_TOP_LEVEL_STATEMENT: return createCSSTopLevelStatement();
      case CssPackage.CSS_OTHER_TOP_LEVEL_DECLARATION: return createCSSOtherTopLevelDeclaration();
      case CssPackage.IMPORT_DECLARATION: return createImportDeclaration();
      case CssPackage.MEDIA_DECLARATION: return createMediaDeclaration();
      case CssPackage.MEDIA_DECLARATION_MEMBERS: return createMediaDeclarationMembers();
      case CssPackage.MEDIA_QUERY: return createMediaQuery();
      case CssPackage.MEDIA_QUERY_EXPRESSION: return createMediaQueryExpression();
      case CssPackage.PAGE_DECLARATION: return createPageDeclaration();
      case CssPackage.NAMESPACE_DECLARATION: return createNamespaceDeclaration();
      case CssPackage.FONT_FACE_DECLARATION: return createFontFaceDeclaration();
      case CssPackage.RULE_SET: return createRuleSet();
      case CssPackage.RULE_SET_BODY: return createRuleSetBody();
      case CssPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case CssPackage.KNOWN_PROPERTY_DECLARATION: return createKnownPropertyDeclaration();
      case CssPackage.UNRECOGNIZED_PROPERTY_DECLARATION: return createUnrecognizedPropertyDeclaration();
      case CssPackage.PROPERTY_VALUES_LISTS: return createPropertyValuesLists();
      case CssPackage.PROPERTY_VALUES_LIST: return createPropertyValuesList();
      case CssPackage.PROPERTY_VALUE: return createPropertyValue();
      case CssPackage.SELECTOR: return createSelector();
      case CssPackage.SIMPLE_SELECTOR: return createSimpleSelector();
      case CssPackage.TYPE_SELECTOR: return createTypeSelector();
      case CssPackage.NAMESPACE_PREFIX: return createNamespacePrefix();
      case CssPackage.UNIVERSAL_SELECTOR: return createUniversalSelector();
      case CssPackage.ATTRIBUTE_SELECTOR: return createAttributeSelector();
      case CssPackage.ATTRIBUTE: return createAttribute();
      case CssPackage.ATTRIBUTE_VALUE_LITERAL: return createAttributeValueLiteral();
      case CssPackage.ID_SELECTOR: return createIDSelector();
      case CssPackage.CLASS_SELECTOR: return createClassSelector();
      case CssPackage.PSEUDO_SELECTOR: return createPseudoSelector();
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR: return createNoArgsPseudoClassSelector();
      case CssPackage.PSEUDO_ELEMENT_SELECTOR: return createPseudoElementSelector();
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR: return createLanguagePseudoClassSelector();
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR: return createFunctionalPseudoClassSelector();
      case CssPackage.TYPE_ARGUMENT: return createTypeArgument();
      case CssPackage.LINEAR_ARGUMENT: return createLinearArgument();
      case CssPackage.COEFFICIENT: return createCoefficient();
      case CssPackage.CONSTANT_ARGUMENT: return createConstantArgument();
      case CssPackage.PARITY_ARGUMENT: return createParityArgument();
      case CssPackage.NEGATION_SELECTOR: return createNegationSelector();
      case CssPackage.VALUE_LITERAL: return createValueLiteral();
      case CssPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CssPackage.SIZE_LITERAL: return createSizeLiteral();
      case CssPackage.STRING_LITERAL: return createStringLiteral();
      case CssPackage.COLOR_LITERAL: return createColorLiteral();
      case CssPackage.COMPONENT_COLOR_LITERAL: return createComponentColorLiteral();
      case CssPackage.COLOR_COMPONENT_LITERAL: return createColorComponentLiteral();
      case CssPackage.URL_LITERAL: return createURLLiteral();
      case CssPackage.BARE_WORD_LITERAL: return createBareWordLiteral();
      case CssPackage.FUNCTION_CALL_LITERAL: return createFunctionCallLiteral();
      case CssPackage.DESCENDANT_COMBINATOR: return createDescendantCombinator();
      case CssPackage.CHILD_COMBINATOR: return createChildCombinator();
      case CssPackage.ADJACENT_SIBLING_COMBINATOR: return createAdjacentSiblingCombinator();
      case CssPackage.GENERAL_SIBLING_COMBINATOR: return createGeneralSiblingCombinator();
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE: return createSimpleSelectorSequence();
      case CssPackage.UNIVERSAL_NAMESPACE_PREFIX: return createUniversalNamespacePrefix();
      case CssPackage.WITHOUT_NAMESPACE_PREFIX: return createWithoutNamespacePrefix();
      case CssPackage.STRING_ATTRIBUTE_VALUE_LITERAL: return createStringAttributeValueLiteral();
      case CssPackage.INTEGER_ATTRIBUTE_VALUE_LITERAL: return createIntegerAttributeValueLiteral();
      case CssPackage.DECIMAL_ATTRIBUTE_VALUE_LITERAL: return createDecimalAttributeValueLiteral();
      case CssPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case CssPackage.DECIMAL_LITERAL: return createDecimalLiteral();
      case CssPackage.QUANTIFIED_SIZE_LITERAL: return createQuantifiedSizeLiteral();
      case CssPackage.QUALIFIED_SIZE_LITERAL: return createQualifiedSizeLiteral();
      case CssPackage.FONT_HEIGHT_LITERAL: return createFontHeightLiteral();
      case CssPackage.RGB_COLOR: return createRGBColor();
      case CssPackage.NAMED_COLOR: return createNamedColor();
      case CssPackage.COMPONENT_RGB_COLOR: return createComponentRGBColor();
      case CssPackage.COMPONENT_RGB_ALPHA_COLOR: return createComponentRGBAlphaColor();
      case CssPackage.COMPONENT_HSL_COLOR: return createComponentHSLColor();
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR: return createComponentHSLAlphaColor();
      case CssPackage.ALPHA_LITERAL: return createAlphaLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CssPackage.KNOWN_PROPERTIES:
        return createKnownPropertiesFromString(eDataType, initialValue);
      case CssPackage.ATTRIBUTE_SELECTOR_MATCHERS:
        return createAttributeSelectorMatchersFromString(eDataType, initialValue);
      case CssPackage.NO_ARGS_PSEUDOS:
        return createNoArgsPseudosFromString(eDataType, initialValue);
      case CssPackage.PSEUDO_ELEMENTS:
        return createPseudoElementsFromString(eDataType, initialValue);
      case CssPackage.FUNCTIONAL_PSEUDO_CLASSES:
        return createFunctionalPseudoClassesFromString(eDataType, initialValue);
      case CssPackage.PARITIES:
        return createParitiesFromString(eDataType, initialValue);
      case CssPackage.DIMENSIONS:
        return createDimensionsFromString(eDataType, initialValue);
      case CssPackage.COLOR_NAMES:
        return createColorNamesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CssPackage.KNOWN_PROPERTIES:
        return convertKnownPropertiesToString(eDataType, instanceValue);
      case CssPackage.ATTRIBUTE_SELECTOR_MATCHERS:
        return convertAttributeSelectorMatchersToString(eDataType, instanceValue);
      case CssPackage.NO_ARGS_PSEUDOS:
        return convertNoArgsPseudosToString(eDataType, instanceValue);
      case CssPackage.PSEUDO_ELEMENTS:
        return convertPseudoElementsToString(eDataType, instanceValue);
      case CssPackage.FUNCTIONAL_PSEUDO_CLASSES:
        return convertFunctionalPseudoClassesToString(eDataType, instanceValue);
      case CssPackage.PARITIES:
        return convertParitiesToString(eDataType, instanceValue);
      case CssPackage.DIMENSIONS:
        return convertDimensionsToString(eDataType, instanceValue);
      case CssPackage.COLOR_NAMES:
        return convertColorNamesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stylesheet createStylesheet()
  {
    StylesheetImpl stylesheet = new StylesheetImpl();
    return stylesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSTopLevelStatement createCSSTopLevelStatement()
  {
    CSSTopLevelStatementImpl cssTopLevelStatement = new CSSTopLevelStatementImpl();
    return cssTopLevelStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSOtherTopLevelDeclaration createCSSOtherTopLevelDeclaration()
  {
    CSSOtherTopLevelDeclarationImpl cssOtherTopLevelDeclaration = new CSSOtherTopLevelDeclarationImpl();
    return cssOtherTopLevelDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclaration createImportDeclaration()
  {
    ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
    return importDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediaDeclaration createMediaDeclaration()
  {
    MediaDeclarationImpl mediaDeclaration = new MediaDeclarationImpl();
    return mediaDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediaDeclarationMembers createMediaDeclarationMembers()
  {
    MediaDeclarationMembersImpl mediaDeclarationMembers = new MediaDeclarationMembersImpl();
    return mediaDeclarationMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediaQuery createMediaQuery()
  {
    MediaQueryImpl mediaQuery = new MediaQueryImpl();
    return mediaQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediaQueryExpression createMediaQueryExpression()
  {
    MediaQueryExpressionImpl mediaQueryExpression = new MediaQueryExpressionImpl();
    return mediaQueryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageDeclaration createPageDeclaration()
  {
    PageDeclarationImpl pageDeclaration = new PageDeclarationImpl();
    return pageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration createNamespaceDeclaration()
  {
    NamespaceDeclarationImpl namespaceDeclaration = new NamespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFaceDeclaration createFontFaceDeclaration()
  {
    FontFaceDeclarationImpl fontFaceDeclaration = new FontFaceDeclarationImpl();
    return fontFaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet createRuleSet()
  {
    RuleSetImpl ruleSet = new RuleSetImpl();
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSetBody createRuleSetBody()
  {
    RuleSetBodyImpl ruleSetBody = new RuleSetBodyImpl();
    return ruleSetBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDeclaration createPropertyDeclaration()
  {
    PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
    return propertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnownPropertyDeclaration createKnownPropertyDeclaration()
  {
    KnownPropertyDeclarationImpl knownPropertyDeclaration = new KnownPropertyDeclarationImpl();
    return knownPropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnrecognizedPropertyDeclaration createUnrecognizedPropertyDeclaration()
  {
    UnrecognizedPropertyDeclarationImpl unrecognizedPropertyDeclaration = new UnrecognizedPropertyDeclarationImpl();
    return unrecognizedPropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValuesLists createPropertyValuesLists()
  {
    PropertyValuesListsImpl propertyValuesLists = new PropertyValuesListsImpl();
    return propertyValuesLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValuesList createPropertyValuesList()
  {
    PropertyValuesListImpl propertyValuesList = new PropertyValuesListImpl();
    return propertyValuesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelector createSimpleSelector()
  {
    SimpleSelectorImpl simpleSelector = new SimpleSelectorImpl();
    return simpleSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSelector createTypeSelector()
  {
    TypeSelectorImpl typeSelector = new TypeSelectorImpl();
    return typeSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespacePrefix createNamespacePrefix()
  {
    NamespacePrefixImpl namespacePrefix = new NamespacePrefixImpl();
    return namespacePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniversalSelector createUniversalSelector()
  {
    UniversalSelectorImpl universalSelector = new UniversalSelectorImpl();
    return universalSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSelector createAttributeSelector()
  {
    AttributeSelectorImpl attributeSelector = new AttributeSelectorImpl();
    return attributeSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValueLiteral createAttributeValueLiteral()
  {
    AttributeValueLiteralImpl attributeValueLiteral = new AttributeValueLiteralImpl();
    return attributeValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDSelector createIDSelector()
  {
    IDSelectorImpl idSelector = new IDSelectorImpl();
    return idSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassSelector createClassSelector()
  {
    ClassSelectorImpl classSelector = new ClassSelectorImpl();
    return classSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoSelector createPseudoSelector()
  {
    PseudoSelectorImpl pseudoSelector = new PseudoSelectorImpl();
    return pseudoSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoArgsPseudoClassSelector createNoArgsPseudoClassSelector()
  {
    NoArgsPseudoClassSelectorImpl noArgsPseudoClassSelector = new NoArgsPseudoClassSelectorImpl();
    return noArgsPseudoClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoElementSelector createPseudoElementSelector()
  {
    PseudoElementSelectorImpl pseudoElementSelector = new PseudoElementSelectorImpl();
    return pseudoElementSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguagePseudoClassSelector createLanguagePseudoClassSelector()
  {
    LanguagePseudoClassSelectorImpl languagePseudoClassSelector = new LanguagePseudoClassSelectorImpl();
    return languagePseudoClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalPseudoClassSelector createFunctionalPseudoClassSelector()
  {
    FunctionalPseudoClassSelectorImpl functionalPseudoClassSelector = new FunctionalPseudoClassSelectorImpl();
    return functionalPseudoClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArgument createTypeArgument()
  {
    TypeArgumentImpl typeArgument = new TypeArgumentImpl();
    return typeArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearArgument createLinearArgument()
  {
    LinearArgumentImpl linearArgument = new LinearArgumentImpl();
    return linearArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coefficient createCoefficient()
  {
    CoefficientImpl coefficient = new CoefficientImpl();
    return coefficient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantArgument createConstantArgument()
  {
    ConstantArgumentImpl constantArgument = new ConstantArgumentImpl();
    return constantArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParityArgument createParityArgument()
  {
    ParityArgumentImpl parityArgument = new ParityArgumentImpl();
    return parityArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegationSelector createNegationSelector()
  {
    NegationSelectorImpl negationSelector = new NegationSelectorImpl();
    return negationSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueLiteral createValueLiteral()
  {
    ValueLiteralImpl valueLiteral = new ValueLiteralImpl();
    return valueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeLiteral createSizeLiteral()
  {
    SizeLiteralImpl sizeLiteral = new SizeLiteralImpl();
    return sizeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorLiteral createColorLiteral()
  {
    ColorLiteralImpl colorLiteral = new ColorLiteralImpl();
    return colorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentColorLiteral createComponentColorLiteral()
  {
    ComponentColorLiteralImpl componentColorLiteral = new ComponentColorLiteralImpl();
    return componentColorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral createColorComponentLiteral()
  {
    ColorComponentLiteralImpl colorComponentLiteral = new ColorComponentLiteralImpl();
    return colorComponentLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URLLiteral createURLLiteral()
  {
    URLLiteralImpl urlLiteral = new URLLiteralImpl();
    return urlLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BareWordLiteral createBareWordLiteral()
  {
    BareWordLiteralImpl bareWordLiteral = new BareWordLiteralImpl();
    return bareWordLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCallLiteral createFunctionCallLiteral()
  {
    FunctionCallLiteralImpl functionCallLiteral = new FunctionCallLiteralImpl();
    return functionCallLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescendantCombinator createDescendantCombinator()
  {
    DescendantCombinatorImpl descendantCombinator = new DescendantCombinatorImpl();
    return descendantCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChildCombinator createChildCombinator()
  {
    ChildCombinatorImpl childCombinator = new ChildCombinatorImpl();
    return childCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjacentSiblingCombinator createAdjacentSiblingCombinator()
  {
    AdjacentSiblingCombinatorImpl adjacentSiblingCombinator = new AdjacentSiblingCombinatorImpl();
    return adjacentSiblingCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralSiblingCombinator createGeneralSiblingCombinator()
  {
    GeneralSiblingCombinatorImpl generalSiblingCombinator = new GeneralSiblingCombinatorImpl();
    return generalSiblingCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelectorSequence createSimpleSelectorSequence()
  {
    SimpleSelectorSequenceImpl simpleSelectorSequence = new SimpleSelectorSequenceImpl();
    return simpleSelectorSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniversalNamespacePrefix createUniversalNamespacePrefix()
  {
    UniversalNamespacePrefixImpl universalNamespacePrefix = new UniversalNamespacePrefixImpl();
    return universalNamespacePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithoutNamespacePrefix createWithoutNamespacePrefix()
  {
    WithoutNamespacePrefixImpl withoutNamespacePrefix = new WithoutNamespacePrefixImpl();
    return withoutNamespacePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringAttributeValueLiteral createStringAttributeValueLiteral()
  {
    StringAttributeValueLiteralImpl stringAttributeValueLiteral = new StringAttributeValueLiteralImpl();
    return stringAttributeValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttributeValueLiteral createIntegerAttributeValueLiteral()
  {
    IntegerAttributeValueLiteralImpl integerAttributeValueLiteral = new IntegerAttributeValueLiteralImpl();
    return integerAttributeValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalAttributeValueLiteral createDecimalAttributeValueLiteral()
  {
    DecimalAttributeValueLiteralImpl decimalAttributeValueLiteral = new DecimalAttributeValueLiteralImpl();
    return decimalAttributeValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalLiteral createDecimalLiteral()
  {
    DecimalLiteralImpl decimalLiteral = new DecimalLiteralImpl();
    return decimalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedSizeLiteral createQuantifiedSizeLiteral()
  {
    QuantifiedSizeLiteralImpl quantifiedSizeLiteral = new QuantifiedSizeLiteralImpl();
    return quantifiedSizeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedSizeLiteral createQualifiedSizeLiteral()
  {
    QualifiedSizeLiteralImpl qualifiedSizeLiteral = new QualifiedSizeLiteralImpl();
    return qualifiedSizeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontHeightLiteral createFontHeightLiteral()
  {
    FontHeightLiteralImpl fontHeightLiteral = new FontHeightLiteralImpl();
    return fontHeightLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGBColor createRGBColor()
  {
    RGBColorImpl rgbColor = new RGBColorImpl();
    return rgbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedColor createNamedColor()
  {
    NamedColorImpl namedColor = new NamedColorImpl();
    return namedColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRGBColor createComponentRGBColor()
  {
    ComponentRGBColorImpl componentRGBColor = new ComponentRGBColorImpl();
    return componentRGBColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRGBAlphaColor createComponentRGBAlphaColor()
  {
    ComponentRGBAlphaColorImpl componentRGBAlphaColor = new ComponentRGBAlphaColorImpl();
    return componentRGBAlphaColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentHSLColor createComponentHSLColor()
  {
    ComponentHSLColorImpl componentHSLColor = new ComponentHSLColorImpl();
    return componentHSLColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentHSLAlphaColor createComponentHSLAlphaColor()
  {
    ComponentHSLAlphaColorImpl componentHSLAlphaColor = new ComponentHSLAlphaColorImpl();
    return componentHSLAlphaColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlphaLiteral createAlphaLiteral()
  {
    AlphaLiteralImpl alphaLiteral = new AlphaLiteralImpl();
    return alphaLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnownProperties createKnownPropertiesFromString(EDataType eDataType, String initialValue)
  {
    KnownProperties result = KnownProperties.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertKnownPropertiesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSelectorMatchers createAttributeSelectorMatchersFromString(EDataType eDataType, String initialValue)
  {
    AttributeSelectorMatchers result = AttributeSelectorMatchers.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeSelectorMatchersToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoArgsPseudos createNoArgsPseudosFromString(EDataType eDataType, String initialValue)
  {
    NoArgsPseudos result = NoArgsPseudos.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNoArgsPseudosToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoElements createPseudoElementsFromString(EDataType eDataType, String initialValue)
  {
    PseudoElements result = PseudoElements.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPseudoElementsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalPseudoClasses createFunctionalPseudoClassesFromString(EDataType eDataType, String initialValue)
  {
    FunctionalPseudoClasses result = FunctionalPseudoClasses.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFunctionalPseudoClassesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parities createParitiesFromString(EDataType eDataType, String initialValue)
  {
    Parities result = Parities.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParitiesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimensions createDimensionsFromString(EDataType eDataType, String initialValue)
  {
    Dimensions result = Dimensions.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDimensionsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorNames createColorNamesFromString(EDataType eDataType, String initialValue)
  {
    ColorNames result = ColorNames.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorNamesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssPackage getCssPackage()
  {
    return (CssPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssPackage getPackage()
  {
    return CssPackage.eINSTANCE;
  }

} //CssFactoryImpl
