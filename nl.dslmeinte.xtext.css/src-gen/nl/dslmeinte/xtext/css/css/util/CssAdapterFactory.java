/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.util;

import nl.dslmeinte.xtext.css.css.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage
 * @generated
 */
public class CssAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CssSwitch<Adapter> modelSwitch =
    new CssSwitch<Adapter>()
    {
      @Override
      public Adapter caseStylesheet(Stylesheet object)
      {
        return createStylesheetAdapter();
      }
      @Override
      public Adapter caseCSSTopLevelStatement(CSSTopLevelStatement object)
      {
        return createCSSTopLevelStatementAdapter();
      }
      @Override
      public Adapter caseCSSOtherTopLevelDeclaration(CSSOtherTopLevelDeclaration object)
      {
        return createCSSOtherTopLevelDeclarationAdapter();
      }
      @Override
      public Adapter caseImportDeclaration(ImportDeclaration object)
      {
        return createImportDeclarationAdapter();
      }
      @Override
      public Adapter caseMediaDeclaration(MediaDeclaration object)
      {
        return createMediaDeclarationAdapter();
      }
      @Override
      public Adapter caseMediaDeclarationMembers(MediaDeclarationMembers object)
      {
        return createMediaDeclarationMembersAdapter();
      }
      @Override
      public Adapter caseMediaQuery(MediaQuery object)
      {
        return createMediaQueryAdapter();
      }
      @Override
      public Adapter caseMediaQueryExpression(MediaQueryExpression object)
      {
        return createMediaQueryExpressionAdapter();
      }
      @Override
      public Adapter casePageDeclaration(PageDeclaration object)
      {
        return createPageDeclarationAdapter();
      }
      @Override
      public Adapter caseNamespaceDeclaration(NamespaceDeclaration object)
      {
        return createNamespaceDeclarationAdapter();
      }
      @Override
      public Adapter caseFontFaceDeclaration(FontFaceDeclaration object)
      {
        return createFontFaceDeclarationAdapter();
      }
      @Override
      public Adapter caseRuleSet(RuleSet object)
      {
        return createRuleSetAdapter();
      }
      @Override
      public Adapter caseRuleSetBody(RuleSetBody object)
      {
        return createRuleSetBodyAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseKnownPropertyDeclaration(KnownPropertyDeclaration object)
      {
        return createKnownPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseUnrecognizedPropertyDeclaration(UnrecognizedPropertyDeclaration object)
      {
        return createUnrecognizedPropertyDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyValuesLists(PropertyValuesLists object)
      {
        return createPropertyValuesListsAdapter();
      }
      @Override
      public Adapter casePropertyValuesList(PropertyValuesList object)
      {
        return createPropertyValuesListAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseSelector(Selector object)
      {
        return createSelectorAdapter();
      }
      @Override
      public Adapter caseSimpleSelector(SimpleSelector object)
      {
        return createSimpleSelectorAdapter();
      }
      @Override
      public Adapter caseTypeSelector(TypeSelector object)
      {
        return createTypeSelectorAdapter();
      }
      @Override
      public Adapter caseNamespacePrefix(NamespacePrefix object)
      {
        return createNamespacePrefixAdapter();
      }
      @Override
      public Adapter caseUniversalSelector(UniversalSelector object)
      {
        return createUniversalSelectorAdapter();
      }
      @Override
      public Adapter caseAttributeSelector(AttributeSelector object)
      {
        return createAttributeSelectorAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeValueLiteral(AttributeValueLiteral object)
      {
        return createAttributeValueLiteralAdapter();
      }
      @Override
      public Adapter caseIDSelector(IDSelector object)
      {
        return createIDSelectorAdapter();
      }
      @Override
      public Adapter caseClassSelector(ClassSelector object)
      {
        return createClassSelectorAdapter();
      }
      @Override
      public Adapter casePseudoSelector(PseudoSelector object)
      {
        return createPseudoSelectorAdapter();
      }
      @Override
      public Adapter caseNoArgsPseudoClassSelector(NoArgsPseudoClassSelector object)
      {
        return createNoArgsPseudoClassSelectorAdapter();
      }
      @Override
      public Adapter casePseudoElementSelector(PseudoElementSelector object)
      {
        return createPseudoElementSelectorAdapter();
      }
      @Override
      public Adapter caseLanguagePseudoClassSelector(LanguagePseudoClassSelector object)
      {
        return createLanguagePseudoClassSelectorAdapter();
      }
      @Override
      public Adapter caseFunctionalPseudoClassSelector(FunctionalPseudoClassSelector object)
      {
        return createFunctionalPseudoClassSelectorAdapter();
      }
      @Override
      public Adapter caseTypeArgument(TypeArgument object)
      {
        return createTypeArgumentAdapter();
      }
      @Override
      public Adapter caseLinearArgument(LinearArgument object)
      {
        return createLinearArgumentAdapter();
      }
      @Override
      public Adapter caseCoefficient(Coefficient object)
      {
        return createCoefficientAdapter();
      }
      @Override
      public Adapter caseConstantArgument(ConstantArgument object)
      {
        return createConstantArgumentAdapter();
      }
      @Override
      public Adapter caseParityArgument(ParityArgument object)
      {
        return createParityArgumentAdapter();
      }
      @Override
      public Adapter caseNegationSelector(NegationSelector object)
      {
        return createNegationSelectorAdapter();
      }
      @Override
      public Adapter caseValueLiteral(ValueLiteral object)
      {
        return createValueLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseSizeLiteral(SizeLiteral object)
      {
        return createSizeLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseColorLiteral(ColorLiteral object)
      {
        return createColorLiteralAdapter();
      }
      @Override
      public Adapter caseComponentColorLiteral(ComponentColorLiteral object)
      {
        return createComponentColorLiteralAdapter();
      }
      @Override
      public Adapter caseColorComponentLiteral(ColorComponentLiteral object)
      {
        return createColorComponentLiteralAdapter();
      }
      @Override
      public Adapter caseURLLiteral(URLLiteral object)
      {
        return createURLLiteralAdapter();
      }
      @Override
      public Adapter caseBareWordLiteral(BareWordLiteral object)
      {
        return createBareWordLiteralAdapter();
      }
      @Override
      public Adapter caseFunctionCallLiteral(FunctionCallLiteral object)
      {
        return createFunctionCallLiteralAdapter();
      }
      @Override
      public Adapter caseDescendantCombinator(DescendantCombinator object)
      {
        return createDescendantCombinatorAdapter();
      }
      @Override
      public Adapter caseChildCombinator(ChildCombinator object)
      {
        return createChildCombinatorAdapter();
      }
      @Override
      public Adapter caseAdjacentSiblingCombinator(AdjacentSiblingCombinator object)
      {
        return createAdjacentSiblingCombinatorAdapter();
      }
      @Override
      public Adapter caseGeneralSiblingCombinator(GeneralSiblingCombinator object)
      {
        return createGeneralSiblingCombinatorAdapter();
      }
      @Override
      public Adapter caseSimpleSelectorSequence(SimpleSelectorSequence object)
      {
        return createSimpleSelectorSequenceAdapter();
      }
      @Override
      public Adapter caseUniversalNamespacePrefix(UniversalNamespacePrefix object)
      {
        return createUniversalNamespacePrefixAdapter();
      }
      @Override
      public Adapter caseWithoutNamespacePrefix(WithoutNamespacePrefix object)
      {
        return createWithoutNamespacePrefixAdapter();
      }
      @Override
      public Adapter caseStringAttributeValueLiteral(StringAttributeValueLiteral object)
      {
        return createStringAttributeValueLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerAttributeValueLiteral(IntegerAttributeValueLiteral object)
      {
        return createIntegerAttributeValueLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalAttributeValueLiteral(DecimalAttributeValueLiteral object)
      {
        return createDecimalAttributeValueLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalLiteral(DecimalLiteral object)
      {
        return createDecimalLiteralAdapter();
      }
      @Override
      public Adapter caseQuantifiedSizeLiteral(QuantifiedSizeLiteral object)
      {
        return createQuantifiedSizeLiteralAdapter();
      }
      @Override
      public Adapter caseQualifiedSizeLiteral(QualifiedSizeLiteral object)
      {
        return createQualifiedSizeLiteralAdapter();
      }
      @Override
      public Adapter caseFontHeightLiteral(FontHeightLiteral object)
      {
        return createFontHeightLiteralAdapter();
      }
      @Override
      public Adapter caseRGBColor(RGBColor object)
      {
        return createRGBColorAdapter();
      }
      @Override
      public Adapter caseNamedColor(NamedColor object)
      {
        return createNamedColorAdapter();
      }
      @Override
      public Adapter caseComponentRGBColor(ComponentRGBColor object)
      {
        return createComponentRGBColorAdapter();
      }
      @Override
      public Adapter caseComponentRGBAlphaColor(ComponentRGBAlphaColor object)
      {
        return createComponentRGBAlphaColorAdapter();
      }
      @Override
      public Adapter caseComponentHSLColor(ComponentHSLColor object)
      {
        return createComponentHSLColorAdapter();
      }
      @Override
      public Adapter caseComponentHSLAlphaColor(ComponentHSLAlphaColor object)
      {
        return createComponentHSLAlphaColorAdapter();
      }
      @Override
      public Adapter caseAlphaLiteral(AlphaLiteral object)
      {
        return createAlphaLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.Stylesheet <em>Stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.Stylesheet
   * @generated
   */
  public Adapter createStylesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.CSSTopLevelStatement <em>CSS Top Level Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.CSSTopLevelStatement
   * @generated
   */
  public Adapter createCSSTopLevelStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.CSSOtherTopLevelDeclaration <em>CSS Other Top Level Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.CSSOtherTopLevelDeclaration
   * @generated
   */
  public Adapter createCSSOtherTopLevelDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ImportDeclaration
   * @generated
   */
  public Adapter createImportDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.MediaDeclaration <em>Media Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclaration
   * @generated
   */
  public Adapter createMediaDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.MediaDeclarationMembers <em>Media Declaration Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclarationMembers
   * @generated
   */
  public Adapter createMediaDeclarationMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.MediaQuery <em>Media Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery
   * @generated
   */
  public Adapter createMediaQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.MediaQueryExpression <em>Media Query Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.MediaQueryExpression
   * @generated
   */
  public Adapter createMediaQueryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PageDeclaration <em>Page Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PageDeclaration
   * @generated
   */
  public Adapter createPageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NamespaceDeclaration
   * @generated
   */
  public Adapter createNamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.FontFaceDeclaration <em>Font Face Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.FontFaceDeclaration
   * @generated
   */
  public Adapter createFontFaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.RuleSet
   * @generated
   */
  public Adapter createRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.RuleSetBody <em>Rule Set Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.RuleSetBody
   * @generated
   */
  public Adapter createRuleSetBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration <em>Known Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration
   * @generated
   */
  public Adapter createKnownPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration <em>Unrecognized Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration
   * @generated
   */
  public Adapter createUnrecognizedPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PropertyValuesLists <em>Property Values Lists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesLists
   * @generated
   */
  public Adapter createPropertyValuesListsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PropertyValuesList <em>Property Values List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesList
   * @generated
   */
  public Adapter createPropertyValuesListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.Selector
   * @generated
   */
  public Adapter createSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.SimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelector
   * @generated
   */
  public Adapter createSimpleSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.TypeSelector <em>Type Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.TypeSelector
   * @generated
   */
  public Adapter createTypeSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NamespacePrefix
   * @generated
   */
  public Adapter createNamespacePrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.UniversalSelector <em>Universal Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.UniversalSelector
   * @generated
   */
  public Adapter createUniversalSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.AttributeSelector <em>Attribute Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelector
   * @generated
   */
  public Adapter createAttributeSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.AttributeValueLiteral <em>Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.AttributeValueLiteral
   * @generated
   */
  public Adapter createAttributeValueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.IDSelector <em>ID Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.IDSelector
   * @generated
   */
  public Adapter createIDSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ClassSelector <em>Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ClassSelector
   * @generated
   */
  public Adapter createClassSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PseudoSelector <em>Pseudo Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PseudoSelector
   * @generated
   */
  public Adapter createPseudoSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector <em>No Args Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector
   * @generated
   */
  public Adapter createNoArgsPseudoClassSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector <em>Pseudo Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.PseudoElementSelector
   * @generated
   */
  public Adapter createPseudoElementSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector <em>Language Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector
   * @generated
   */
  public Adapter createLanguagePseudoClassSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector <em>Functional Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector
   * @generated
   */
  public Adapter createFunctionalPseudoClassSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.TypeArgument <em>Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.TypeArgument
   * @generated
   */
  public Adapter createTypeArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.LinearArgument <em>Linear Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.LinearArgument
   * @generated
   */
  public Adapter createLinearArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.Coefficient <em>Coefficient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.Coefficient
   * @generated
   */
  public Adapter createCoefficientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ConstantArgument <em>Constant Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ConstantArgument
   * @generated
   */
  public Adapter createConstantArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ParityArgument <em>Parity Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ParityArgument
   * @generated
   */
  public Adapter createParityArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NegationSelector <em>Negation Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NegationSelector
   * @generated
   */
  public Adapter createNegationSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ValueLiteral <em>Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ValueLiteral
   * @generated
   */
  public Adapter createValueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.SizeLiteral <em>Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.SizeLiteral
   * @generated
   */
  public Adapter createSizeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ColorLiteral <em>Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ColorLiteral
   * @generated
   */
  public Adapter createColorLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ComponentColorLiteral <em>Component Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ComponentColorLiteral
   * @generated
   */
  public Adapter createComponentColorLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral <em>Color Component Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ColorComponentLiteral
   * @generated
   */
  public Adapter createColorComponentLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.URLLiteral <em>URL Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.URLLiteral
   * @generated
   */
  public Adapter createURLLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.BareWordLiteral <em>Bare Word Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.BareWordLiteral
   * @generated
   */
  public Adapter createBareWordLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral <em>Function Call Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.FunctionCallLiteral
   * @generated
   */
  public Adapter createFunctionCallLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator <em>Descendant Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.DescendantCombinator
   * @generated
   */
  public Adapter createDescendantCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ChildCombinator <em>Child Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator
   * @generated
   */
  public Adapter createChildCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator <em>Adjacent Sibling Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator
   * @generated
   */
  public Adapter createAdjacentSiblingCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator <em>General Sibling Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator
   * @generated
   */
  public Adapter createGeneralSiblingCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence <em>Simple Selector Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelectorSequence
   * @generated
   */
  public Adapter createSimpleSelectorSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix <em>Universal Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix
   * @generated
   */
  public Adapter createUniversalNamespacePrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix <em>Without Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix
   * @generated
   */
  public Adapter createWithoutNamespacePrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral <em>String Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral
   * @generated
   */
  public Adapter createStringAttributeValueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral <em>Integer Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral
   * @generated
   */
  public Adapter createIntegerAttributeValueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral <em>Decimal Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral
   * @generated
   */
  public Adapter createDecimalAttributeValueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.DecimalLiteral <em>Decimal Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.DecimalLiteral
   * @generated
   */
  public Adapter createDecimalLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral <em>Quantified Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral
   * @generated
   */
  public Adapter createQuantifiedSizeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral <em>Qualified Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral
   * @generated
   */
  public Adapter createQualifiedSizeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral <em>Font Height Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.FontHeightLiteral
   * @generated
   */
  public Adapter createFontHeightLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.RGBColor
   * @generated
   */
  public Adapter createRGBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.NamedColor
   * @generated
   */
  public Adapter createNamedColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ComponentRGBColor <em>Component RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBColor
   * @generated
   */
  public Adapter createComponentRGBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor <em>Component RGB Alpha Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor
   * @generated
   */
  public Adapter createComponentRGBAlphaColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor <em>Component HSL Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLColor
   * @generated
   */
  public Adapter createComponentHSLColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor <em>Component HSL Alpha Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor
   * @generated
   */
  public Adapter createComponentHSLAlphaColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.xtext.css.css.AlphaLiteral <em>Alpha Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.xtext.css.css.AlphaLiteral
   * @generated
   */
  public Adapter createAlphaLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CssAdapterFactory
