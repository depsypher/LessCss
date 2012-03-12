/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator;
import nl.dslmeinte.xtext.css.css.AlphaLiteral;
import nl.dslmeinte.xtext.css.css.Attribute;
import nl.dslmeinte.xtext.css.css.AttributeSelector;
import nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers;
import nl.dslmeinte.xtext.css.css.AttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.BareWordLiteral;
import nl.dslmeinte.xtext.css.css.CSSOtherTopLevelDeclaration;
import nl.dslmeinte.xtext.css.css.CSSTopLevelStatement;
import nl.dslmeinte.xtext.css.css.ChildCombinator;
import nl.dslmeinte.xtext.css.css.ClassSelector;
import nl.dslmeinte.xtext.css.css.Coefficient;
import nl.dslmeinte.xtext.css.css.ColorComponentLiteral;
import nl.dslmeinte.xtext.css.css.ColorLiteral;
import nl.dslmeinte.xtext.css.css.ColorNames;
import nl.dslmeinte.xtext.css.css.ComponentColorLiteral;
import nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor;
import nl.dslmeinte.xtext.css.css.ComponentHSLColor;
import nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor;
import nl.dslmeinte.xtext.css.css.ComponentRGBColor;
import nl.dslmeinte.xtext.css.css.ConstantArgument;
import nl.dslmeinte.xtext.css.css.CssFactory;
import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.DecimalLiteral;
import nl.dslmeinte.xtext.css.css.DescendantCombinator;
import nl.dslmeinte.xtext.css.css.Dimensions;
import nl.dslmeinte.xtext.css.css.FontFaceDeclaration;
import nl.dslmeinte.xtext.css.css.FontHeightLiteral;
import nl.dslmeinte.xtext.css.css.FunctionCallLiteral;
import nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses;
import nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator;
import nl.dslmeinte.xtext.css.css.IDSelector;
import nl.dslmeinte.xtext.css.css.ImportDeclaration;
import nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.IntegerLiteral;
import nl.dslmeinte.xtext.css.css.KnownProperties;
import nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration;
import nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector;
import nl.dslmeinte.xtext.css.css.LinearArgument;
import nl.dslmeinte.xtext.css.css.MediaDeclaration;
import nl.dslmeinte.xtext.css.css.MediaDeclarationMembers;
import nl.dslmeinte.xtext.css.css.MediaQuery;
import nl.dslmeinte.xtext.css.css.MediaQueryExpression;
import nl.dslmeinte.xtext.css.css.NamedColor;
import nl.dslmeinte.xtext.css.css.NamespaceDeclaration;
import nl.dslmeinte.xtext.css.css.NamespacePrefix;
import nl.dslmeinte.xtext.css.css.NegationSelector;
import nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.NoArgsPseudos;
import nl.dslmeinte.xtext.css.css.NumberLiteral;
import nl.dslmeinte.xtext.css.css.PageDeclaration;
import nl.dslmeinte.xtext.css.css.Parities;
import nl.dslmeinte.xtext.css.css.ParityArgument;
import nl.dslmeinte.xtext.css.css.PropertyDeclaration;
import nl.dslmeinte.xtext.css.css.PropertyValue;
import nl.dslmeinte.xtext.css.css.PropertyValuesList;
import nl.dslmeinte.xtext.css.css.PropertyValuesLists;
import nl.dslmeinte.xtext.css.css.PseudoElementSelector;
import nl.dslmeinte.xtext.css.css.PseudoElements;
import nl.dslmeinte.xtext.css.css.PseudoSelector;
import nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral;
import nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral;
import nl.dslmeinte.xtext.css.css.RGBColor;
import nl.dslmeinte.xtext.css.css.RuleSet;
import nl.dslmeinte.xtext.css.css.RuleSetBody;
import nl.dslmeinte.xtext.css.css.Selector;
import nl.dslmeinte.xtext.css.css.SimpleSelector;
import nl.dslmeinte.xtext.css.css.SimpleSelectorSequence;
import nl.dslmeinte.xtext.css.css.SizeLiteral;
import nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.StringLiteral;
import nl.dslmeinte.xtext.css.css.Stylesheet;
import nl.dslmeinte.xtext.css.css.TypeArgument;
import nl.dslmeinte.xtext.css.css.TypeSelector;
import nl.dslmeinte.xtext.css.css.URLLiteral;
import nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix;
import nl.dslmeinte.xtext.css.css.UniversalSelector;
import nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration;
import nl.dslmeinte.xtext.css.css.ValueLiteral;
import nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssPackageImpl extends EPackageImpl implements CssPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stylesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssTopLevelStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssOtherTopLevelDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaDeclarationMembersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaQueryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSetBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass knownPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unrecognizedPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValuesListsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValuesListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespacePrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass universalSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeValueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noArgsPseudoClassSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoElementSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languagePseudoClassSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalPseudoClassSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coefficientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parityArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentColorLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorComponentLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bareWordLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descendantCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjacentSiblingCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalSiblingCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleSelectorSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass universalNamespacePrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withoutNamespacePrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringAttributeValueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttributeValueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalAttributeValueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedSizeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedSizeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontHeightLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentRGBColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentRGBAlphaColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentHSLColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentHSLAlphaColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alphaLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum knownPropertiesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeSelectorMatchersEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum noArgsPseudosEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum pseudoElementsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum functionalPseudoClassesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum paritiesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dimensionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorNamesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nl.dslmeinte.xtext.css.css.CssPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CssPackageImpl()
  {
    super(eNS_URI, CssFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CssPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CssPackage init()
  {
    if (isInited) return (CssPackage)EPackage.Registry.INSTANCE.getEPackage(CssPackage.eNS_URI);

    // Obtain or create and register package
    CssPackageImpl theCssPackage = (CssPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CssPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CssPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCssPackage.createPackageContents();

    // Initialize created meta-data
    theCssPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCssPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CssPackage.eNS_URI, theCssPackage);
    return theCssPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStylesheet()
  {
    return stylesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStylesheet_CharSet()
  {
    return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStylesheet_Imports()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStylesheet_Statements()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSTopLevelStatement()
  {
    return cssTopLevelStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSOtherTopLevelDeclaration()
  {
    return cssOtherTopLevelDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDeclaration()
  {
    return importDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclaration_ImportURI()
  {
    return (EAttribute)importDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclaration_Url()
  {
    return (EAttribute)importDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclaration_Media()
  {
    return (EAttribute)importDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMediaDeclaration()
  {
    return mediaDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediaDeclaration_MediaQueries()
  {
    return (EReference)mediaDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediaDeclaration_Media()
  {
    return (EReference)mediaDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediaDeclaration_Members()
  {
    return (EReference)mediaDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMediaDeclarationMembers()
  {
    return mediaDeclarationMembersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMediaQuery()
  {
    return mediaQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMediaQuery_Only()
  {
    return (EAttribute)mediaQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMediaQuery_Not()
  {
    return (EAttribute)mediaQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMediaQuery_MediaType()
  {
    return (EAttribute)mediaQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediaQuery_Expressions()
  {
    return (EReference)mediaQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMediaQueryExpression()
  {
    return mediaQueryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMediaQueryExpression_Feature()
  {
    return (EAttribute)mediaQueryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediaQueryExpression_Expression()
  {
    return (EReference)mediaQueryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageDeclaration()
  {
    return pageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageDeclaration_PseudoPage()
  {
    return (EAttribute)pageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageDeclaration_Body()
  {
    return (EReference)pageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceDeclaration()
  {
    return namespaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespaceDeclaration_Name()
  {
    return (EAttribute)namespaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespaceDeclaration_Url()
  {
    return (EAttribute)namespaceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFaceDeclaration()
  {
    return fontFaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontFaceDeclaration_Body()
  {
    return (EReference)fontFaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleSet()
  {
    return ruleSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Selectors()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Body()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleSetBody()
  {
    return ruleSetBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSetBody_Declarations()
  {
    return (EReference)ruleSetBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDeclaration()
  {
    return propertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDeclaration_ValuesLists()
  {
    return (EReference)propertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKnownPropertyDeclaration()
  {
    return knownPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnownPropertyDeclaration_Name()
  {
    return (EAttribute)knownPropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnrecognizedPropertyDeclaration()
  {
    return unrecognizedPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnrecognizedPropertyDeclaration_Name()
  {
    return (EAttribute)unrecognizedPropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValuesLists()
  {
    return propertyValuesListsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyValuesLists_Lists()
  {
    return (EReference)propertyValuesListsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValuesList()
  {
    return propertyValuesListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyValuesList_Values()
  {
    return (EReference)propertyValuesListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyValue_Value()
  {
    return (EReference)propertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyValue_Important()
  {
    return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleSelector()
  {
    return simpleSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSelector()
  {
    return typeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeSelector_NamespacePrefix()
  {
    return (EReference)typeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSelector_Type()
  {
    return (EAttribute)typeSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespacePrefix()
  {
    return namespacePrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespacePrefix_Namespace()
  {
    return (EReference)namespacePrefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniversalSelector()
  {
    return universalSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniversalSelector_NamespacePrefix()
  {
    return (EReference)universalSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeSelector()
  {
    return attributeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeSelector_Attribute()
  {
    return (EReference)attributeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSelector_Matcher()
  {
    return (EAttribute)attributeSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeSelector_Value()
  {
    return (EReference)attributeSelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_NamespacePrefix()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeValueLiteral()
  {
    return attributeValueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDSelector()
  {
    return idSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDSelector_Name()
  {
    return (EAttribute)idSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassSelector()
  {
    return classSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassSelector_Name()
  {
    return (EAttribute)classSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoSelector()
  {
    return pseudoSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoArgsPseudoClassSelector()
  {
    return noArgsPseudoClassSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNoArgsPseudoClassSelector_Pseudo()
  {
    return (EAttribute)noArgsPseudoClassSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoElementSelector()
  {
    return pseudoElementSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPseudoElementSelector_DoubleSemiColon()
  {
    return (EAttribute)pseudoElementSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPseudoElementSelector_Pseudo()
  {
    return (EAttribute)pseudoElementSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguagePseudoClassSelector()
  {
    return languagePseudoClassSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguagePseudoClassSelector_LangugageId()
  {
    return (EAttribute)languagePseudoClassSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalPseudoClassSelector()
  {
    return functionalPseudoClassSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionalPseudoClassSelector_Pseudo()
  {
    return (EAttribute)functionalPseudoClassSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionalPseudoClassSelector_Argument()
  {
    return (EReference)functionalPseudoClassSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeArgument()
  {
    return typeArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearArgument()
  {
    return linearArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearArgument_Coefficient()
  {
    return (EReference)linearArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearArgument_ConstantSign()
  {
    return (EAttribute)linearArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearArgument_Constant()
  {
    return (EAttribute)linearArgumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoefficient()
  {
    return coefficientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoefficient_Ident()
  {
    return (EAttribute)coefficientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoefficient_Int()
  {
    return (EAttribute)coefficientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantArgument()
  {
    return constantArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantArgument_Sign()
  {
    return (EAttribute)constantArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantArgument_Int()
  {
    return (EAttribute)constantArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParityArgument()
  {
    return parityArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParityArgument_Parity()
  {
    return (EAttribute)parityArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegationSelector()
  {
    return negationSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegationSelector_SimpleSelector()
  {
    return (EReference)negationSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueLiteral()
  {
    return valueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeLiteral()
  {
    return sizeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorLiteral()
  {
    return colorLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentColorLiteral()
  {
    return componentColorLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorComponentLiteral()
  {
    return colorComponentLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorComponentLiteral_Number()
  {
    return (EReference)colorComponentLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorComponentLiteral_Percentage()
  {
    return (EAttribute)colorComponentLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURLLiteral()
  {
    return urlLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURLLiteral_Value()
  {
    return (EAttribute)urlLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBareWordLiteral()
  {
    return bareWordLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBareWordLiteral_BareWord()
  {
    return (EAttribute)bareWordLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCallLiteral()
  {
    return functionCallLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionCallLiteral_Function()
  {
    return (EAttribute)functionCallLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallLiteral_Arguments()
  {
    return (EReference)functionCallLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescendantCombinator()
  {
    return descendantCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescendantCombinator_Left()
  {
    return (EReference)descendantCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescendantCombinator_WsI()
  {
    return (EAttribute)descendantCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescendantCombinator_Right()
  {
    return (EReference)descendantCombinatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChildCombinator()
  {
    return childCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChildCombinator_Left()
  {
    return (EReference)childCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChildCombinator_WsL()
  {
    return (EAttribute)childCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChildCombinator_WsR()
  {
    return (EAttribute)childCombinatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChildCombinator_Right()
  {
    return (EReference)childCombinatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjacentSiblingCombinator()
  {
    return adjacentSiblingCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdjacentSiblingCombinator_Left()
  {
    return (EReference)adjacentSiblingCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjacentSiblingCombinator_WsL()
  {
    return (EAttribute)adjacentSiblingCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjacentSiblingCombinator_WsR()
  {
    return (EAttribute)adjacentSiblingCombinatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdjacentSiblingCombinator_Right()
  {
    return (EReference)adjacentSiblingCombinatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralSiblingCombinator()
  {
    return generalSiblingCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralSiblingCombinator_Left()
  {
    return (EReference)generalSiblingCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralSiblingCombinator_WsL()
  {
    return (EAttribute)generalSiblingCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralSiblingCombinator_WsR()
  {
    return (EAttribute)generalSiblingCombinatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralSiblingCombinator_Right()
  {
    return (EReference)generalSiblingCombinatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleSelectorSequence()
  {
    return simpleSelectorSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelectorSequence_Head()
  {
    return (EReference)simpleSelectorSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSelectorSequence_SimpleSelectors()
  {
    return (EReference)simpleSelectorSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniversalNamespacePrefix()
  {
    return universalNamespacePrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithoutNamespacePrefix()
  {
    return withoutNamespacePrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringAttributeValueLiteral()
  {
    return stringAttributeValueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringAttributeValueLiteral_Value()
  {
    return (EAttribute)stringAttributeValueLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttributeValueLiteral()
  {
    return integerAttributeValueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerAttributeValueLiteral_Value()
  {
    return (EAttribute)integerAttributeValueLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecimalAttributeValueLiteral()
  {
    return decimalAttributeValueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecimalAttributeValueLiteral_Value()
  {
    return (EAttribute)decimalAttributeValueLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_Int()
  {
    return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecimalLiteral()
  {
    return decimalLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecimalLiteral_Decimal()
  {
    return (EAttribute)decimalLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedSizeLiteral()
  {
    return quantifiedSizeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedSizeLiteral_Number()
  {
    return (EReference)quantifiedSizeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifiedSizeLiteral_Dimension()
  {
    return (EAttribute)quantifiedSizeLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedSizeLiteral()
  {
    return qualifiedSizeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedSizeLiteral_Bareword()
  {
    return (EAttribute)qualifiedSizeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontHeightLiteral()
  {
    return fontHeightLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontHeightLiteral_FontHeight()
  {
    return (EReference)fontHeightLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontHeightLiteral_LineHeight()
  {
    return (EReference)fontHeightLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontHeightLiteral_LineHeightDimension()
  {
    return (EAttribute)fontHeightLiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGBColor()
  {
    return rgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Rgb()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedColor()
  {
    return namedColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedColor_Color()
  {
    return (EAttribute)namedColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentRGBColor()
  {
    return componentRGBColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBColor_Red()
  {
    return (EReference)componentRGBColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBColor_Green()
  {
    return (EReference)componentRGBColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBColor_Blue()
  {
    return (EReference)componentRGBColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentRGBAlphaColor()
  {
    return componentRGBAlphaColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBAlphaColor_Red()
  {
    return (EReference)componentRGBAlphaColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBAlphaColor_Green()
  {
    return (EReference)componentRGBAlphaColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBAlphaColor_Blue()
  {
    return (EReference)componentRGBAlphaColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRGBAlphaColor_Opacity()
  {
    return (EReference)componentRGBAlphaColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentHSLColor()
  {
    return componentHSLColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLColor_Hue()
  {
    return (EReference)componentHSLColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLColor_Saturation()
  {
    return (EReference)componentHSLColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLColor_Lightness()
  {
    return (EReference)componentHSLColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentHSLAlphaColor()
  {
    return componentHSLAlphaColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLAlphaColor_Hue()
  {
    return (EReference)componentHSLAlphaColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLAlphaColor_Saturation()
  {
    return (EReference)componentHSLAlphaColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLAlphaColor_Lightness()
  {
    return (EReference)componentHSLAlphaColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentHSLAlphaColor_Opacity()
  {
    return (EReference)componentHSLAlphaColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlphaLiteral()
  {
    return alphaLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlphaLiteral_Opacity()
  {
    return (EReference)alphaLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getKnownProperties()
  {
    return knownPropertiesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributeSelectorMatchers()
  {
    return attributeSelectorMatchersEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNoArgsPseudos()
  {
    return noArgsPseudosEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPseudoElements()
  {
    return pseudoElementsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFunctionalPseudoClasses()
  {
    return functionalPseudoClassesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParities()
  {
    return paritiesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDimensions()
  {
    return dimensionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColorNames()
  {
    return colorNamesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssFactory getCssFactory()
  {
    return (CssFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stylesheetEClass = createEClass(STYLESHEET);
    createEAttribute(stylesheetEClass, STYLESHEET__CHAR_SET);
    createEReference(stylesheetEClass, STYLESHEET__IMPORTS);
    createEReference(stylesheetEClass, STYLESHEET__STATEMENTS);

    cssTopLevelStatementEClass = createEClass(CSS_TOP_LEVEL_STATEMENT);

    cssOtherTopLevelDeclarationEClass = createEClass(CSS_OTHER_TOP_LEVEL_DECLARATION);

    importDeclarationEClass = createEClass(IMPORT_DECLARATION);
    createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__IMPORT_URI);
    createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__URL);
    createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__MEDIA);

    mediaDeclarationEClass = createEClass(MEDIA_DECLARATION);
    createEReference(mediaDeclarationEClass, MEDIA_DECLARATION__MEDIA_QUERIES);
    createEReference(mediaDeclarationEClass, MEDIA_DECLARATION__MEDIA);
    createEReference(mediaDeclarationEClass, MEDIA_DECLARATION__MEMBERS);

    mediaDeclarationMembersEClass = createEClass(MEDIA_DECLARATION_MEMBERS);

    mediaQueryEClass = createEClass(MEDIA_QUERY);
    createEAttribute(mediaQueryEClass, MEDIA_QUERY__ONLY);
    createEAttribute(mediaQueryEClass, MEDIA_QUERY__NOT);
    createEAttribute(mediaQueryEClass, MEDIA_QUERY__MEDIA_TYPE);
    createEReference(mediaQueryEClass, MEDIA_QUERY__EXPRESSIONS);

    mediaQueryExpressionEClass = createEClass(MEDIA_QUERY_EXPRESSION);
    createEAttribute(mediaQueryExpressionEClass, MEDIA_QUERY_EXPRESSION__FEATURE);
    createEReference(mediaQueryExpressionEClass, MEDIA_QUERY_EXPRESSION__EXPRESSION);

    pageDeclarationEClass = createEClass(PAGE_DECLARATION);
    createEAttribute(pageDeclarationEClass, PAGE_DECLARATION__PSEUDO_PAGE);
    createEReference(pageDeclarationEClass, PAGE_DECLARATION__BODY);

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAME);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__URL);

    fontFaceDeclarationEClass = createEClass(FONT_FACE_DECLARATION);
    createEReference(fontFaceDeclarationEClass, FONT_FACE_DECLARATION__BODY);

    ruleSetEClass = createEClass(RULE_SET);
    createEReference(ruleSetEClass, RULE_SET__SELECTORS);
    createEReference(ruleSetEClass, RULE_SET__BODY);

    ruleSetBodyEClass = createEClass(RULE_SET_BODY);
    createEReference(ruleSetBodyEClass, RULE_SET_BODY__DECLARATIONS);

    propertyDeclarationEClass = createEClass(PROPERTY_DECLARATION);
    createEReference(propertyDeclarationEClass, PROPERTY_DECLARATION__VALUES_LISTS);

    knownPropertyDeclarationEClass = createEClass(KNOWN_PROPERTY_DECLARATION);
    createEAttribute(knownPropertyDeclarationEClass, KNOWN_PROPERTY_DECLARATION__NAME);

    unrecognizedPropertyDeclarationEClass = createEClass(UNRECOGNIZED_PROPERTY_DECLARATION);
    createEAttribute(unrecognizedPropertyDeclarationEClass, UNRECOGNIZED_PROPERTY_DECLARATION__NAME);

    propertyValuesListsEClass = createEClass(PROPERTY_VALUES_LISTS);
    createEReference(propertyValuesListsEClass, PROPERTY_VALUES_LISTS__LISTS);

    propertyValuesListEClass = createEClass(PROPERTY_VALUES_LIST);
    createEReference(propertyValuesListEClass, PROPERTY_VALUES_LIST__VALUES);

    propertyValueEClass = createEClass(PROPERTY_VALUE);
    createEReference(propertyValueEClass, PROPERTY_VALUE__VALUE);
    createEAttribute(propertyValueEClass, PROPERTY_VALUE__IMPORTANT);

    selectorEClass = createEClass(SELECTOR);

    simpleSelectorEClass = createEClass(SIMPLE_SELECTOR);

    typeSelectorEClass = createEClass(TYPE_SELECTOR);
    createEReference(typeSelectorEClass, TYPE_SELECTOR__NAMESPACE_PREFIX);
    createEAttribute(typeSelectorEClass, TYPE_SELECTOR__TYPE);

    namespacePrefixEClass = createEClass(NAMESPACE_PREFIX);
    createEReference(namespacePrefixEClass, NAMESPACE_PREFIX__NAMESPACE);

    universalSelectorEClass = createEClass(UNIVERSAL_SELECTOR);
    createEReference(universalSelectorEClass, UNIVERSAL_SELECTOR__NAMESPACE_PREFIX);

    attributeSelectorEClass = createEClass(ATTRIBUTE_SELECTOR);
    createEReference(attributeSelectorEClass, ATTRIBUTE_SELECTOR__ATTRIBUTE);
    createEAttribute(attributeSelectorEClass, ATTRIBUTE_SELECTOR__MATCHER);
    createEReference(attributeSelectorEClass, ATTRIBUTE_SELECTOR__VALUE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__NAMESPACE_PREFIX);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    attributeValueLiteralEClass = createEClass(ATTRIBUTE_VALUE_LITERAL);

    idSelectorEClass = createEClass(ID_SELECTOR);
    createEAttribute(idSelectorEClass, ID_SELECTOR__NAME);

    classSelectorEClass = createEClass(CLASS_SELECTOR);
    createEAttribute(classSelectorEClass, CLASS_SELECTOR__NAME);

    pseudoSelectorEClass = createEClass(PSEUDO_SELECTOR);

    noArgsPseudoClassSelectorEClass = createEClass(NO_ARGS_PSEUDO_CLASS_SELECTOR);
    createEAttribute(noArgsPseudoClassSelectorEClass, NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO);

    pseudoElementSelectorEClass = createEClass(PSEUDO_ELEMENT_SELECTOR);
    createEAttribute(pseudoElementSelectorEClass, PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON);
    createEAttribute(pseudoElementSelectorEClass, PSEUDO_ELEMENT_SELECTOR__PSEUDO);

    languagePseudoClassSelectorEClass = createEClass(LANGUAGE_PSEUDO_CLASS_SELECTOR);
    createEAttribute(languagePseudoClassSelectorEClass, LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID);

    functionalPseudoClassSelectorEClass = createEClass(FUNCTIONAL_PSEUDO_CLASS_SELECTOR);
    createEAttribute(functionalPseudoClassSelectorEClass, FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO);
    createEReference(functionalPseudoClassSelectorEClass, FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT);

    typeArgumentEClass = createEClass(TYPE_ARGUMENT);

    linearArgumentEClass = createEClass(LINEAR_ARGUMENT);
    createEReference(linearArgumentEClass, LINEAR_ARGUMENT__COEFFICIENT);
    createEAttribute(linearArgumentEClass, LINEAR_ARGUMENT__CONSTANT_SIGN);
    createEAttribute(linearArgumentEClass, LINEAR_ARGUMENT__CONSTANT);

    coefficientEClass = createEClass(COEFFICIENT);
    createEAttribute(coefficientEClass, COEFFICIENT__IDENT);
    createEAttribute(coefficientEClass, COEFFICIENT__INT);

    constantArgumentEClass = createEClass(CONSTANT_ARGUMENT);
    createEAttribute(constantArgumentEClass, CONSTANT_ARGUMENT__SIGN);
    createEAttribute(constantArgumentEClass, CONSTANT_ARGUMENT__INT);

    parityArgumentEClass = createEClass(PARITY_ARGUMENT);
    createEAttribute(parityArgumentEClass, PARITY_ARGUMENT__PARITY);

    negationSelectorEClass = createEClass(NEGATION_SELECTOR);
    createEReference(negationSelectorEClass, NEGATION_SELECTOR__SIMPLE_SELECTOR);

    valueLiteralEClass = createEClass(VALUE_LITERAL);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);

    sizeLiteralEClass = createEClass(SIZE_LITERAL);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    colorLiteralEClass = createEClass(COLOR_LITERAL);

    componentColorLiteralEClass = createEClass(COMPONENT_COLOR_LITERAL);

    colorComponentLiteralEClass = createEClass(COLOR_COMPONENT_LITERAL);
    createEReference(colorComponentLiteralEClass, COLOR_COMPONENT_LITERAL__NUMBER);
    createEAttribute(colorComponentLiteralEClass, COLOR_COMPONENT_LITERAL__PERCENTAGE);

    urlLiteralEClass = createEClass(URL_LITERAL);
    createEAttribute(urlLiteralEClass, URL_LITERAL__VALUE);

    bareWordLiteralEClass = createEClass(BARE_WORD_LITERAL);
    createEAttribute(bareWordLiteralEClass, BARE_WORD_LITERAL__BARE_WORD);

    functionCallLiteralEClass = createEClass(FUNCTION_CALL_LITERAL);
    createEAttribute(functionCallLiteralEClass, FUNCTION_CALL_LITERAL__FUNCTION);
    createEReference(functionCallLiteralEClass, FUNCTION_CALL_LITERAL__ARGUMENTS);

    descendantCombinatorEClass = createEClass(DESCENDANT_COMBINATOR);
    createEReference(descendantCombinatorEClass, DESCENDANT_COMBINATOR__LEFT);
    createEAttribute(descendantCombinatorEClass, DESCENDANT_COMBINATOR__WS_I);
    createEReference(descendantCombinatorEClass, DESCENDANT_COMBINATOR__RIGHT);

    childCombinatorEClass = createEClass(CHILD_COMBINATOR);
    createEReference(childCombinatorEClass, CHILD_COMBINATOR__LEFT);
    createEAttribute(childCombinatorEClass, CHILD_COMBINATOR__WS_L);
    createEAttribute(childCombinatorEClass, CHILD_COMBINATOR__WS_R);
    createEReference(childCombinatorEClass, CHILD_COMBINATOR__RIGHT);

    adjacentSiblingCombinatorEClass = createEClass(ADJACENT_SIBLING_COMBINATOR);
    createEReference(adjacentSiblingCombinatorEClass, ADJACENT_SIBLING_COMBINATOR__LEFT);
    createEAttribute(adjacentSiblingCombinatorEClass, ADJACENT_SIBLING_COMBINATOR__WS_L);
    createEAttribute(adjacentSiblingCombinatorEClass, ADJACENT_SIBLING_COMBINATOR__WS_R);
    createEReference(adjacentSiblingCombinatorEClass, ADJACENT_SIBLING_COMBINATOR__RIGHT);

    generalSiblingCombinatorEClass = createEClass(GENERAL_SIBLING_COMBINATOR);
    createEReference(generalSiblingCombinatorEClass, GENERAL_SIBLING_COMBINATOR__LEFT);
    createEAttribute(generalSiblingCombinatorEClass, GENERAL_SIBLING_COMBINATOR__WS_L);
    createEAttribute(generalSiblingCombinatorEClass, GENERAL_SIBLING_COMBINATOR__WS_R);
    createEReference(generalSiblingCombinatorEClass, GENERAL_SIBLING_COMBINATOR__RIGHT);

    simpleSelectorSequenceEClass = createEClass(SIMPLE_SELECTOR_SEQUENCE);
    createEReference(simpleSelectorSequenceEClass, SIMPLE_SELECTOR_SEQUENCE__HEAD);
    createEReference(simpleSelectorSequenceEClass, SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS);

    universalNamespacePrefixEClass = createEClass(UNIVERSAL_NAMESPACE_PREFIX);

    withoutNamespacePrefixEClass = createEClass(WITHOUT_NAMESPACE_PREFIX);

    stringAttributeValueLiteralEClass = createEClass(STRING_ATTRIBUTE_VALUE_LITERAL);
    createEAttribute(stringAttributeValueLiteralEClass, STRING_ATTRIBUTE_VALUE_LITERAL__VALUE);

    integerAttributeValueLiteralEClass = createEClass(INTEGER_ATTRIBUTE_VALUE_LITERAL);
    createEAttribute(integerAttributeValueLiteralEClass, INTEGER_ATTRIBUTE_VALUE_LITERAL__VALUE);

    decimalAttributeValueLiteralEClass = createEClass(DECIMAL_ATTRIBUTE_VALUE_LITERAL);
    createEAttribute(decimalAttributeValueLiteralEClass, DECIMAL_ATTRIBUTE_VALUE_LITERAL__VALUE);

    integerLiteralEClass = createEClass(INTEGER_LITERAL);
    createEAttribute(integerLiteralEClass, INTEGER_LITERAL__INT);

    decimalLiteralEClass = createEClass(DECIMAL_LITERAL);
    createEAttribute(decimalLiteralEClass, DECIMAL_LITERAL__DECIMAL);

    quantifiedSizeLiteralEClass = createEClass(QUANTIFIED_SIZE_LITERAL);
    createEReference(quantifiedSizeLiteralEClass, QUANTIFIED_SIZE_LITERAL__NUMBER);
    createEAttribute(quantifiedSizeLiteralEClass, QUANTIFIED_SIZE_LITERAL__DIMENSION);

    qualifiedSizeLiteralEClass = createEClass(QUALIFIED_SIZE_LITERAL);
    createEAttribute(qualifiedSizeLiteralEClass, QUALIFIED_SIZE_LITERAL__BAREWORD);

    fontHeightLiteralEClass = createEClass(FONT_HEIGHT_LITERAL);
    createEReference(fontHeightLiteralEClass, FONT_HEIGHT_LITERAL__FONT_HEIGHT);
    createEReference(fontHeightLiteralEClass, FONT_HEIGHT_LITERAL__LINE_HEIGHT);
    createEAttribute(fontHeightLiteralEClass, FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION);

    rgbColorEClass = createEClass(RGB_COLOR);
    createEAttribute(rgbColorEClass, RGB_COLOR__RGB);

    namedColorEClass = createEClass(NAMED_COLOR);
    createEAttribute(namedColorEClass, NAMED_COLOR__COLOR);

    componentRGBColorEClass = createEClass(COMPONENT_RGB_COLOR);
    createEReference(componentRGBColorEClass, COMPONENT_RGB_COLOR__RED);
    createEReference(componentRGBColorEClass, COMPONENT_RGB_COLOR__GREEN);
    createEReference(componentRGBColorEClass, COMPONENT_RGB_COLOR__BLUE);

    componentRGBAlphaColorEClass = createEClass(COMPONENT_RGB_ALPHA_COLOR);
    createEReference(componentRGBAlphaColorEClass, COMPONENT_RGB_ALPHA_COLOR__RED);
    createEReference(componentRGBAlphaColorEClass, COMPONENT_RGB_ALPHA_COLOR__GREEN);
    createEReference(componentRGBAlphaColorEClass, COMPONENT_RGB_ALPHA_COLOR__BLUE);
    createEReference(componentRGBAlphaColorEClass, COMPONENT_RGB_ALPHA_COLOR__OPACITY);

    componentHSLColorEClass = createEClass(COMPONENT_HSL_COLOR);
    createEReference(componentHSLColorEClass, COMPONENT_HSL_COLOR__HUE);
    createEReference(componentHSLColorEClass, COMPONENT_HSL_COLOR__SATURATION);
    createEReference(componentHSLColorEClass, COMPONENT_HSL_COLOR__LIGHTNESS);

    componentHSLAlphaColorEClass = createEClass(COMPONENT_HSL_ALPHA_COLOR);
    createEReference(componentHSLAlphaColorEClass, COMPONENT_HSL_ALPHA_COLOR__HUE);
    createEReference(componentHSLAlphaColorEClass, COMPONENT_HSL_ALPHA_COLOR__SATURATION);
    createEReference(componentHSLAlphaColorEClass, COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS);
    createEReference(componentHSLAlphaColorEClass, COMPONENT_HSL_ALPHA_COLOR__OPACITY);

    alphaLiteralEClass = createEClass(ALPHA_LITERAL);
    createEReference(alphaLiteralEClass, ALPHA_LITERAL__OPACITY);

    // Create enums
    knownPropertiesEEnum = createEEnum(KNOWN_PROPERTIES);
    attributeSelectorMatchersEEnum = createEEnum(ATTRIBUTE_SELECTOR_MATCHERS);
    noArgsPseudosEEnum = createEEnum(NO_ARGS_PSEUDOS);
    pseudoElementsEEnum = createEEnum(PSEUDO_ELEMENTS);
    functionalPseudoClassesEEnum = createEEnum(FUNCTIONAL_PSEUDO_CLASSES);
    paritiesEEnum = createEEnum(PARITIES);
    dimensionsEEnum = createEEnum(DIMENSIONS);
    colorNamesEEnum = createEEnum(COLOR_NAMES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cssOtherTopLevelDeclarationEClass.getESuperTypes().add(this.getCSSTopLevelStatement());
    mediaDeclarationEClass.getESuperTypes().add(this.getCSSOtherTopLevelDeclaration());
    pageDeclarationEClass.getESuperTypes().add(this.getCSSOtherTopLevelDeclaration());
    namespaceDeclarationEClass.getESuperTypes().add(this.getCSSOtherTopLevelDeclaration());
    fontFaceDeclarationEClass.getESuperTypes().add(this.getCSSOtherTopLevelDeclaration());
    ruleSetEClass.getESuperTypes().add(this.getCSSTopLevelStatement());
    ruleSetEClass.getESuperTypes().add(this.getMediaDeclarationMembers());
    propertyDeclarationEClass.getESuperTypes().add(this.getMediaDeclarationMembers());
    knownPropertyDeclarationEClass.getESuperTypes().add(this.getPropertyDeclaration());
    unrecognizedPropertyDeclarationEClass.getESuperTypes().add(this.getPropertyDeclaration());
    typeSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    universalSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    attributeSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    idSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    classSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    pseudoSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    noArgsPseudoClassSelectorEClass.getESuperTypes().add(this.getPseudoSelector());
    pseudoElementSelectorEClass.getESuperTypes().add(this.getPseudoSelector());
    languagePseudoClassSelectorEClass.getESuperTypes().add(this.getPseudoSelector());
    functionalPseudoClassSelectorEClass.getESuperTypes().add(this.getPseudoSelector());
    linearArgumentEClass.getESuperTypes().add(this.getTypeArgument());
    constantArgumentEClass.getESuperTypes().add(this.getTypeArgument());
    parityArgumentEClass.getESuperTypes().add(this.getTypeArgument());
    negationSelectorEClass.getESuperTypes().add(this.getSimpleSelector());
    sizeLiteralEClass.getESuperTypes().add(this.getValueLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getValueLiteral());
    colorLiteralEClass.getESuperTypes().add(this.getValueLiteral());
    componentColorLiteralEClass.getESuperTypes().add(this.getColorLiteral());
    urlLiteralEClass.getESuperTypes().add(this.getValueLiteral());
    functionCallLiteralEClass.getESuperTypes().add(this.getValueLiteral());
    descendantCombinatorEClass.getESuperTypes().add(this.getSelector());
    childCombinatorEClass.getESuperTypes().add(this.getSelector());
    adjacentSiblingCombinatorEClass.getESuperTypes().add(this.getSelector());
    generalSiblingCombinatorEClass.getESuperTypes().add(this.getSelector());
    simpleSelectorSequenceEClass.getESuperTypes().add(this.getSelector());
    universalNamespacePrefixEClass.getESuperTypes().add(this.getNamespacePrefix());
    withoutNamespacePrefixEClass.getESuperTypes().add(this.getNamespacePrefix());
    stringAttributeValueLiteralEClass.getESuperTypes().add(this.getAttributeValueLiteral());
    integerAttributeValueLiteralEClass.getESuperTypes().add(this.getAttributeValueLiteral());
    decimalAttributeValueLiteralEClass.getESuperTypes().add(this.getAttributeValueLiteral());
    integerLiteralEClass.getESuperTypes().add(this.getNumberLiteral());
    decimalLiteralEClass.getESuperTypes().add(this.getNumberLiteral());
    quantifiedSizeLiteralEClass.getESuperTypes().add(this.getSizeLiteral());
    qualifiedSizeLiteralEClass.getESuperTypes().add(this.getSizeLiteral());
    fontHeightLiteralEClass.getESuperTypes().add(this.getSizeLiteral());
    rgbColorEClass.getESuperTypes().add(this.getColorLiteral());
    namedColorEClass.getESuperTypes().add(this.getColorLiteral());
    componentRGBColorEClass.getESuperTypes().add(this.getComponentColorLiteral());
    componentRGBAlphaColorEClass.getESuperTypes().add(this.getComponentColorLiteral());
    componentHSLColorEClass.getESuperTypes().add(this.getComponentColorLiteral());
    componentHSLAlphaColorEClass.getESuperTypes().add(this.getComponentColorLiteral());
    alphaLiteralEClass.getESuperTypes().add(this.getFunctionCallLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(stylesheetEClass, Stylesheet.class, "Stylesheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStylesheet_CharSet(), ecorePackage.getEString(), "charSet", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStylesheet_Imports(), this.getImportDeclaration(), null, "imports", null, 0, -1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStylesheet_Statements(), this.getCSSTopLevelStatement(), null, "statements", null, 0, -1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssTopLevelStatementEClass, CSSTopLevelStatement.class, "CSSTopLevelStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cssOtherTopLevelDeclarationEClass, CSSOtherTopLevelDeclaration.class, "CSSOtherTopLevelDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportDeclaration_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDeclaration_Url(), ecorePackage.getEString(), "url", null, 0, 1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDeclaration_Media(), ecorePackage.getEString(), "media", null, 0, -1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaDeclarationEClass, MediaDeclaration.class, "MediaDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMediaDeclaration_MediaQueries(), this.getMediaQuery(), null, "mediaQueries", null, 0, -1, MediaDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMediaDeclaration_Media(), this.getMediaQuery(), null, "media", null, 0, -1, MediaDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMediaDeclaration_Members(), this.getMediaDeclarationMembers(), null, "members", null, 0, -1, MediaDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaDeclarationMembersEClass, MediaDeclarationMembers.class, "MediaDeclarationMembers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mediaQueryEClass, MediaQuery.class, "MediaQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMediaQuery_Only(), ecorePackage.getEBoolean(), "only", null, 0, 1, MediaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMediaQuery_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, MediaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMediaQuery_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, MediaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMediaQuery_Expressions(), this.getMediaQueryExpression(), null, "expressions", null, 0, -1, MediaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaQueryExpressionEClass, MediaQueryExpression.class, "MediaQueryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMediaQueryExpression_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, MediaQueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMediaQueryExpression_Expression(), this.getValueLiteral(), null, "expression", null, 0, 1, MediaQueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageDeclarationEClass, PageDeclaration.class, "PageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPageDeclaration_PseudoPage(), ecorePackage.getEString(), "pseudoPage", null, 0, 1, PageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPageDeclaration_Body(), this.getRuleSetBody(), null, "body", null, 0, 1, PageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, NamespaceDeclaration.class, "NamespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNamespaceDeclaration_Url(), ecorePackage.getEString(), "url", null, 0, 1, NamespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontFaceDeclarationEClass, FontFaceDeclaration.class, "FontFaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFontFaceDeclaration_Body(), this.getRuleSetBody(), null, "body", null, 0, 1, FontFaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleSet_Selectors(), this.getSelector(), null, "selectors", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleSet_Body(), this.getRuleSetBody(), null, "body", null, 0, 1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleSetBodyEClass, RuleSetBody.class, "RuleSetBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleSetBody_Declarations(), this.getPropertyDeclaration(), null, "declarations", null, 0, -1, RuleSetBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDeclarationEClass, PropertyDeclaration.class, "PropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDeclaration_ValuesLists(), this.getPropertyValuesLists(), null, "valuesLists", null, 0, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(knownPropertyDeclarationEClass, KnownPropertyDeclaration.class, "KnownPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKnownPropertyDeclaration_Name(), this.getKnownProperties(), "name", null, 0, 1, KnownPropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unrecognizedPropertyDeclarationEClass, UnrecognizedPropertyDeclaration.class, "UnrecognizedPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnrecognizedPropertyDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnrecognizedPropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValuesListsEClass, PropertyValuesLists.class, "PropertyValuesLists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyValuesLists_Lists(), this.getPropertyValuesList(), null, "lists", null, 0, -1, PropertyValuesLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValuesListEClass, PropertyValuesList.class, "PropertyValuesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyValuesList_Values(), this.getPropertyValue(), null, "values", null, 0, -1, PropertyValuesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyValue_Value(), this.getValueLiteral(), null, "value", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyValue_Important(), ecorePackage.getEBoolean(), "important", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleSelectorEClass, SimpleSelector.class, "SimpleSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeSelectorEClass, TypeSelector.class, "TypeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeSelector_NamespacePrefix(), this.getNamespacePrefix(), null, "namespacePrefix", null, 0, 1, TypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeSelector_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespacePrefixEClass, NamespacePrefix.class, "NamespacePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespacePrefix_Namespace(), this.getNamespaceDeclaration(), null, "namespace", null, 0, 1, NamespacePrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(universalSelectorEClass, UniversalSelector.class, "UniversalSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniversalSelector_NamespacePrefix(), this.getNamespacePrefix(), null, "namespacePrefix", null, 0, 1, UniversalSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeSelectorEClass, AttributeSelector.class, "AttributeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeSelector_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeSelector_Matcher(), this.getAttributeSelectorMatchers(), "matcher", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeSelector_Value(), this.getAttributeValueLiteral(), null, "value", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_NamespacePrefix(), this.getNamespacePrefix(), null, "namespacePrefix", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueLiteralEClass, AttributeValueLiteral.class, "AttributeValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(idSelectorEClass, IDSelector.class, "IDSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, IDSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classSelectorEClass, ClassSelector.class, "ClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoSelectorEClass, PseudoSelector.class, "PseudoSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noArgsPseudoClassSelectorEClass, NoArgsPseudoClassSelector.class, "NoArgsPseudoClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNoArgsPseudoClassSelector_Pseudo(), this.getNoArgsPseudos(), "pseudo", null, 0, 1, NoArgsPseudoClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoElementSelectorEClass, PseudoElementSelector.class, "PseudoElementSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPseudoElementSelector_DoubleSemiColon(), ecorePackage.getEBoolean(), "doubleSemiColon", null, 0, 1, PseudoElementSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPseudoElementSelector_Pseudo(), this.getPseudoElements(), "pseudo", null, 0, 1, PseudoElementSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languagePseudoClassSelectorEClass, LanguagePseudoClassSelector.class, "LanguagePseudoClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguagePseudoClassSelector_LangugageId(), ecorePackage.getEString(), "langugageId", null, 0, 1, LanguagePseudoClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionalPseudoClassSelectorEClass, FunctionalPseudoClassSelector.class, "FunctionalPseudoClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionalPseudoClassSelector_Pseudo(), this.getFunctionalPseudoClasses(), "pseudo", null, 0, 1, FunctionalPseudoClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionalPseudoClassSelector_Argument(), this.getTypeArgument(), null, "argument", null, 0, 1, FunctionalPseudoClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeArgumentEClass, TypeArgument.class, "TypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linearArgumentEClass, LinearArgument.class, "LinearArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinearArgument_Coefficient(), this.getCoefficient(), null, "coefficient", null, 0, 1, LinearArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinearArgument_ConstantSign(), ecorePackage.getEString(), "constantSign", null, 0, 1, LinearArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinearArgument_Constant(), ecorePackage.getEInt(), "constant", null, 0, 1, LinearArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coefficientEClass, Coefficient.class, "Coefficient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoefficient_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, Coefficient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoefficient_Int(), ecorePackage.getEInt(), "int", null, 0, 1, Coefficient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantArgumentEClass, ConstantArgument.class, "ConstantArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantArgument_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, ConstantArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantArgument_Int(), ecorePackage.getEInt(), "int", null, 0, 1, ConstantArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parityArgumentEClass, ParityArgument.class, "ParityArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParityArgument_Parity(), this.getParities(), "parity", null, 0, 1, ParityArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negationSelectorEClass, NegationSelector.class, "NegationSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegationSelector_SimpleSelector(), this.getSimpleSelector(), null, "simpleSelector", null, 0, 1, NegationSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueLiteralEClass, ValueLiteral.class, "ValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sizeLiteralEClass, SizeLiteral.class, "SizeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorLiteralEClass, ColorLiteral.class, "ColorLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentColorLiteralEClass, ComponentColorLiteral.class, "ComponentColorLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(colorComponentLiteralEClass, ColorComponentLiteral.class, "ColorComponentLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorComponentLiteral_Number(), this.getNumberLiteral(), null, "number", null, 0, 1, ColorComponentLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorComponentLiteral_Percentage(), ecorePackage.getEBoolean(), "percentage", null, 0, 1, ColorComponentLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlLiteralEClass, URLLiteral.class, "URLLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURLLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, URLLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bareWordLiteralEClass, BareWordLiteral.class, "BareWordLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBareWordLiteral_BareWord(), ecorePackage.getEString(), "bareWord", null, 0, 1, BareWordLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallLiteralEClass, FunctionCallLiteral.class, "FunctionCallLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionCallLiteral_Function(), ecorePackage.getEString(), "function", null, 0, 1, FunctionCallLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCallLiteral_Arguments(), this.getValueLiteral(), null, "arguments", null, 0, -1, FunctionCallLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descendantCombinatorEClass, DescendantCombinator.class, "DescendantCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescendantCombinator_Left(), this.getSelector(), null, "left", null, 0, 1, DescendantCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDescendantCombinator_WsI(), ecorePackage.getEString(), "wsI", null, 0, 1, DescendantCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDescendantCombinator_Right(), this.getSelector(), null, "right", null, 0, 1, DescendantCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(childCombinatorEClass, ChildCombinator.class, "ChildCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChildCombinator_Left(), this.getSelector(), null, "left", null, 0, 1, ChildCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChildCombinator_WsL(), ecorePackage.getEString(), "wsL", null, 0, 1, ChildCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChildCombinator_WsR(), ecorePackage.getEString(), "wsR", null, 0, 1, ChildCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChildCombinator_Right(), this.getSelector(), null, "right", null, 0, 1, ChildCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjacentSiblingCombinatorEClass, AdjacentSiblingCombinator.class, "AdjacentSiblingCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdjacentSiblingCombinator_Left(), this.getSelector(), null, "left", null, 0, 1, AdjacentSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjacentSiblingCombinator_WsL(), ecorePackage.getEString(), "wsL", null, 0, 1, AdjacentSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjacentSiblingCombinator_WsR(), ecorePackage.getEString(), "wsR", null, 0, 1, AdjacentSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdjacentSiblingCombinator_Right(), this.getSelector(), null, "right", null, 0, 1, AdjacentSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalSiblingCombinatorEClass, GeneralSiblingCombinator.class, "GeneralSiblingCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralSiblingCombinator_Left(), this.getSelector(), null, "left", null, 0, 1, GeneralSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralSiblingCombinator_WsL(), ecorePackage.getEString(), "wsL", null, 0, 1, GeneralSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralSiblingCombinator_WsR(), ecorePackage.getEString(), "wsR", null, 0, 1, GeneralSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralSiblingCombinator_Right(), this.getSelector(), null, "right", null, 0, 1, GeneralSiblingCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleSelectorSequenceEClass, SimpleSelectorSequence.class, "SimpleSelectorSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSelectorSequence_Head(), this.getSimpleSelector(), null, "head", null, 0, 1, SimpleSelectorSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleSelectorSequence_SimpleSelectors(), this.getSimpleSelector(), null, "simpleSelectors", null, 0, -1, SimpleSelectorSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(universalNamespacePrefixEClass, UniversalNamespacePrefix.class, "UniversalNamespacePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withoutNamespacePrefixEClass, WithoutNamespacePrefix.class, "WithoutNamespacePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringAttributeValueLiteralEClass, StringAttributeValueLiteral.class, "StringAttributeValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringAttributeValueLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAttributeValueLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttributeValueLiteralEClass, IntegerAttributeValueLiteral.class, "IntegerAttributeValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerAttributeValueLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerAttributeValueLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalAttributeValueLiteralEClass, DecimalAttributeValueLiteral.class, "DecimalAttributeValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalAttributeValueLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DecimalAttributeValueLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerLiteral_Int(), ecorePackage.getEInt(), "int", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalLiteralEClass, DecimalLiteral.class, "DecimalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalLiteral_Decimal(), ecorePackage.getEDouble(), "decimal", null, 0, 1, DecimalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedSizeLiteralEClass, QuantifiedSizeLiteral.class, "QuantifiedSizeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantifiedSizeLiteral_Number(), this.getNumberLiteral(), null, "number", null, 0, 1, QuantifiedSizeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantifiedSizeLiteral_Dimension(), this.getDimensions(), "dimension", null, 0, 1, QuantifiedSizeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedSizeLiteralEClass, QualifiedSizeLiteral.class, "QualifiedSizeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedSizeLiteral_Bareword(), ecorePackage.getEString(), "bareword", null, 0, 1, QualifiedSizeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontHeightLiteralEClass, FontHeightLiteral.class, "FontHeightLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFontHeightLiteral_FontHeight(), this.getSizeLiteral(), null, "fontHeight", null, 0, 1, FontHeightLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFontHeightLiteral_LineHeight(), this.getNumberLiteral(), null, "lineHeight", null, 0, 1, FontHeightLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFontHeightLiteral_LineHeightDimension(), this.getDimensions(), "lineHeightDimension", null, 0, 1, FontHeightLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGBColor_Rgb(), ecorePackage.getEString(), "rgb", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedColorEClass, NamedColor.class, "NamedColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedColor_Color(), this.getColorNames(), "color", null, 0, 1, NamedColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentRGBColorEClass, ComponentRGBColor.class, "ComponentRGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentRGBColor_Red(), this.getColorComponentLiteral(), null, "red", null, 0, 1, ComponentRGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRGBColor_Green(), this.getColorComponentLiteral(), null, "green", null, 0, 1, ComponentRGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRGBColor_Blue(), this.getColorComponentLiteral(), null, "blue", null, 0, 1, ComponentRGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentRGBAlphaColorEClass, ComponentRGBAlphaColor.class, "ComponentRGBAlphaColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentRGBAlphaColor_Red(), this.getColorComponentLiteral(), null, "red", null, 0, 1, ComponentRGBAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRGBAlphaColor_Green(), this.getColorComponentLiteral(), null, "green", null, 0, 1, ComponentRGBAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRGBAlphaColor_Blue(), this.getColorComponentLiteral(), null, "blue", null, 0, 1, ComponentRGBAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRGBAlphaColor_Opacity(), this.getColorComponentLiteral(), null, "opacity", null, 0, 1, ComponentRGBAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentHSLColorEClass, ComponentHSLColor.class, "ComponentHSLColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentHSLColor_Hue(), this.getColorComponentLiteral(), null, "hue", null, 0, 1, ComponentHSLColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentHSLColor_Saturation(), this.getColorComponentLiteral(), null, "saturation", null, 0, 1, ComponentHSLColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentHSLColor_Lightness(), this.getColorComponentLiteral(), null, "lightness", null, 0, 1, ComponentHSLColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentHSLAlphaColorEClass, ComponentHSLAlphaColor.class, "ComponentHSLAlphaColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentHSLAlphaColor_Hue(), this.getColorComponentLiteral(), null, "hue", null, 0, 1, ComponentHSLAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentHSLAlphaColor_Saturation(), this.getColorComponentLiteral(), null, "saturation", null, 0, 1, ComponentHSLAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentHSLAlphaColor_Lightness(), this.getColorComponentLiteral(), null, "lightness", null, 0, 1, ComponentHSLAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentHSLAlphaColor_Opacity(), this.getColorComponentLiteral(), null, "opacity", null, 0, 1, ComponentHSLAlphaColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alphaLiteralEClass, AlphaLiteral.class, "AlphaLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlphaLiteral_Opacity(), this.getNumberLiteral(), null, "opacity", null, 0, 1, AlphaLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(knownPropertiesEEnum, KnownProperties.class, "KnownProperties");
    addEEnumLiteral(knownPropertiesEEnum, KnownProperties.COLOR);
    addEEnumLiteral(knownPropertiesEEnum, KnownProperties.BORDER_TOP);

    initEEnum(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.class, "AttributeSelectorMatchers");
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.PREFIX);
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.SUFFIX);
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.SUBSTRING);
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.EXACT);
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.INCLUDES);
    addEEnumLiteral(attributeSelectorMatchersEEnum, AttributeSelectorMatchers.LANGUAGE);

    initEEnum(noArgsPseudosEEnum, NoArgsPseudos.class, "NoArgsPseudos");
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.LINK);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.VISITED);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.HOVER);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.ACTIVE);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.FOCUS);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.TARGET);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.ENABLED);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.DISABLED);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.CHECKED);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.INDETERMINATE);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.ROOT);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.FIRST_CHILD);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.LAST_CHILD);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.ONLY_CHILD);
    addEEnumLiteral(noArgsPseudosEEnum, NoArgsPseudos.EMPTY);

    initEEnum(pseudoElementsEEnum, PseudoElements.class, "PseudoElements");
    addEEnumLiteral(pseudoElementsEEnum, PseudoElements.FIRST_LETTER);
    addEEnumLiteral(pseudoElementsEEnum, PseudoElements.FIRST_LINE);
    addEEnumLiteral(pseudoElementsEEnum, PseudoElements.BEFORE);
    addEEnumLiteral(pseudoElementsEEnum, PseudoElements.AFTER);

    initEEnum(functionalPseudoClassesEEnum, FunctionalPseudoClasses.class, "FunctionalPseudoClasses");
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.NTH_CHILD);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.NTH_LAST_CHILD);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.NTH_OF_TYPE);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.NTH_LAST_OF_TYPE);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.FIRST_OF_TYPE);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.LAST_OF_TYPE);
    addEEnumLiteral(functionalPseudoClassesEEnum, FunctionalPseudoClasses.ONLY_OF_TYPE);

    initEEnum(paritiesEEnum, Parities.class, "Parities");
    addEEnumLiteral(paritiesEEnum, Parities.ODD);
    addEEnumLiteral(paritiesEEnum, Parities.EVEN);

    initEEnum(dimensionsEEnum, Dimensions.class, "Dimensions");
    addEEnumLiteral(dimensionsEEnum, Dimensions.IN);
    addEEnumLiteral(dimensionsEEnum, Dimensions.CM);
    addEEnumLiteral(dimensionsEEnum, Dimensions.MM);
    addEEnumLiteral(dimensionsEEnum, Dimensions.PT);
    addEEnumLiteral(dimensionsEEnum, Dimensions.PC);
    addEEnumLiteral(dimensionsEEnum, Dimensions.EM);
    addEEnumLiteral(dimensionsEEnum, Dimensions.EX);
    addEEnumLiteral(dimensionsEEnum, Dimensions.PX);
    addEEnumLiteral(dimensionsEEnum, Dimensions.PERC);

    initEEnum(colorNamesEEnum, ColorNames.class, "ColorNames");
    addEEnumLiteral(colorNamesEEnum, ColorNames.BLACK);
    addEEnumLiteral(colorNamesEEnum, ColorNames.WHITE);

    // Create resource
    createResource(eNS_URI);
  }

} //CssPackageImpl
