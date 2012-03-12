/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage
 * @generated
 */
public interface CssFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssFactory eINSTANCE = nl.dslmeinte.xtext.css.css.impl.CssFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Stylesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stylesheet</em>'.
   * @generated
   */
  Stylesheet createStylesheet();

  /**
   * Returns a new object of class '<em>CSS Top Level Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Top Level Statement</em>'.
   * @generated
   */
  CSSTopLevelStatement createCSSTopLevelStatement();

  /**
   * Returns a new object of class '<em>CSS Other Top Level Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Other Top Level Declaration</em>'.
   * @generated
   */
  CSSOtherTopLevelDeclaration createCSSOtherTopLevelDeclaration();

  /**
   * Returns a new object of class '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Declaration</em>'.
   * @generated
   */
  ImportDeclaration createImportDeclaration();

  /**
   * Returns a new object of class '<em>Media Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Media Declaration</em>'.
   * @generated
   */
  MediaDeclaration createMediaDeclaration();

  /**
   * Returns a new object of class '<em>Media Declaration Members</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Media Declaration Members</em>'.
   * @generated
   */
  MediaDeclarationMembers createMediaDeclarationMembers();

  /**
   * Returns a new object of class '<em>Media Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Media Query</em>'.
   * @generated
   */
  MediaQuery createMediaQuery();

  /**
   * Returns a new object of class '<em>Media Query Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Media Query Expression</em>'.
   * @generated
   */
  MediaQueryExpression createMediaQueryExpression();

  /**
   * Returns a new object of class '<em>Page Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Declaration</em>'.
   * @generated
   */
  PageDeclaration createPageDeclaration();

  /**
   * Returns a new object of class '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Declaration</em>'.
   * @generated
   */
  NamespaceDeclaration createNamespaceDeclaration();

  /**
   * Returns a new object of class '<em>Font Face Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Face Declaration</em>'.
   * @generated
   */
  FontFaceDeclaration createFontFaceDeclaration();

  /**
   * Returns a new object of class '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Set</em>'.
   * @generated
   */
  RuleSet createRuleSet();

  /**
   * Returns a new object of class '<em>Rule Set Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Set Body</em>'.
   * @generated
   */
  RuleSetBody createRuleSetBody();

  /**
   * Returns a new object of class '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Declaration</em>'.
   * @generated
   */
  PropertyDeclaration createPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Known Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Known Property Declaration</em>'.
   * @generated
   */
  KnownPropertyDeclaration createKnownPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Unrecognized Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unrecognized Property Declaration</em>'.
   * @generated
   */
  UnrecognizedPropertyDeclaration createUnrecognizedPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Property Values Lists</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Values Lists</em>'.
   * @generated
   */
  PropertyValuesLists createPropertyValuesLists();

  /**
   * Returns a new object of class '<em>Property Values List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Values List</em>'.
   * @generated
   */
  PropertyValuesList createPropertyValuesList();

  /**
   * Returns a new object of class '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Value</em>'.
   * @generated
   */
  PropertyValue createPropertyValue();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>Simple Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Selector</em>'.
   * @generated
   */
  SimpleSelector createSimpleSelector();

  /**
   * Returns a new object of class '<em>Type Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Selector</em>'.
   * @generated
   */
  TypeSelector createTypeSelector();

  /**
   * Returns a new object of class '<em>Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Prefix</em>'.
   * @generated
   */
  NamespacePrefix createNamespacePrefix();

  /**
   * Returns a new object of class '<em>Universal Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Universal Selector</em>'.
   * @generated
   */
  UniversalSelector createUniversalSelector();

  /**
   * Returns a new object of class '<em>Attribute Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Selector</em>'.
   * @generated
   */
  AttributeSelector createAttributeSelector();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value Literal</em>'.
   * @generated
   */
  AttributeValueLiteral createAttributeValueLiteral();

  /**
   * Returns a new object of class '<em>ID Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Selector</em>'.
   * @generated
   */
  IDSelector createIDSelector();

  /**
   * Returns a new object of class '<em>Class Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Selector</em>'.
   * @generated
   */
  ClassSelector createClassSelector();

  /**
   * Returns a new object of class '<em>Pseudo Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Selector</em>'.
   * @generated
   */
  PseudoSelector createPseudoSelector();

  /**
   * Returns a new object of class '<em>No Args Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Args Pseudo Class Selector</em>'.
   * @generated
   */
  NoArgsPseudoClassSelector createNoArgsPseudoClassSelector();

  /**
   * Returns a new object of class '<em>Pseudo Element Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Element Selector</em>'.
   * @generated
   */
  PseudoElementSelector createPseudoElementSelector();

  /**
   * Returns a new object of class '<em>Language Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Pseudo Class Selector</em>'.
   * @generated
   */
  LanguagePseudoClassSelector createLanguagePseudoClassSelector();

  /**
   * Returns a new object of class '<em>Functional Pseudo Class Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Pseudo Class Selector</em>'.
   * @generated
   */
  FunctionalPseudoClassSelector createFunctionalPseudoClassSelector();

  /**
   * Returns a new object of class '<em>Type Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Argument</em>'.
   * @generated
   */
  TypeArgument createTypeArgument();

  /**
   * Returns a new object of class '<em>Linear Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linear Argument</em>'.
   * @generated
   */
  LinearArgument createLinearArgument();

  /**
   * Returns a new object of class '<em>Coefficient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coefficient</em>'.
   * @generated
   */
  Coefficient createCoefficient();

  /**
   * Returns a new object of class '<em>Constant Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Argument</em>'.
   * @generated
   */
  ConstantArgument createConstantArgument();

  /**
   * Returns a new object of class '<em>Parity Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parity Argument</em>'.
   * @generated
   */
  ParityArgument createParityArgument();

  /**
   * Returns a new object of class '<em>Negation Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation Selector</em>'.
   * @generated
   */
  NegationSelector createNegationSelector();

  /**
   * Returns a new object of class '<em>Value Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Literal</em>'.
   * @generated
   */
  ValueLiteral createValueLiteral();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Size Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Literal</em>'.
   * @generated
   */
  SizeLiteral createSizeLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Color Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Literal</em>'.
   * @generated
   */
  ColorLiteral createColorLiteral();

  /**
   * Returns a new object of class '<em>Component Color Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Color Literal</em>'.
   * @generated
   */
  ComponentColorLiteral createComponentColorLiteral();

  /**
   * Returns a new object of class '<em>Color Component Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Component Literal</em>'.
   * @generated
   */
  ColorComponentLiteral createColorComponentLiteral();

  /**
   * Returns a new object of class '<em>URL Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URL Literal</em>'.
   * @generated
   */
  URLLiteral createURLLiteral();

  /**
   * Returns a new object of class '<em>Bare Word Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bare Word Literal</em>'.
   * @generated
   */
  BareWordLiteral createBareWordLiteral();

  /**
   * Returns a new object of class '<em>Function Call Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Literal</em>'.
   * @generated
   */
  FunctionCallLiteral createFunctionCallLiteral();

  /**
   * Returns a new object of class '<em>Descendant Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descendant Combinator</em>'.
   * @generated
   */
  DescendantCombinator createDescendantCombinator();

  /**
   * Returns a new object of class '<em>Child Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Child Combinator</em>'.
   * @generated
   */
  ChildCombinator createChildCombinator();

  /**
   * Returns a new object of class '<em>Adjacent Sibling Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adjacent Sibling Combinator</em>'.
   * @generated
   */
  AdjacentSiblingCombinator createAdjacentSiblingCombinator();

  /**
   * Returns a new object of class '<em>General Sibling Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Sibling Combinator</em>'.
   * @generated
   */
  GeneralSiblingCombinator createGeneralSiblingCombinator();

  /**
   * Returns a new object of class '<em>Simple Selector Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Selector Sequence</em>'.
   * @generated
   */
  SimpleSelectorSequence createSimpleSelectorSequence();

  /**
   * Returns a new object of class '<em>Universal Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Universal Namespace Prefix</em>'.
   * @generated
   */
  UniversalNamespacePrefix createUniversalNamespacePrefix();

  /**
   * Returns a new object of class '<em>Without Namespace Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Without Namespace Prefix</em>'.
   * @generated
   */
  WithoutNamespacePrefix createWithoutNamespacePrefix();

  /**
   * Returns a new object of class '<em>String Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attribute Value Literal</em>'.
   * @generated
   */
  StringAttributeValueLiteral createStringAttributeValueLiteral();

  /**
   * Returns a new object of class '<em>Integer Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attribute Value Literal</em>'.
   * @generated
   */
  IntegerAttributeValueLiteral createIntegerAttributeValueLiteral();

  /**
   * Returns a new object of class '<em>Decimal Attribute Value Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Attribute Value Literal</em>'.
   * @generated
   */
  DecimalAttributeValueLiteral createDecimalAttributeValueLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Literal</em>'.
   * @generated
   */
  DecimalLiteral createDecimalLiteral();

  /**
   * Returns a new object of class '<em>Quantified Size Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Size Literal</em>'.
   * @generated
   */
  QuantifiedSizeLiteral createQuantifiedSizeLiteral();

  /**
   * Returns a new object of class '<em>Qualified Size Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Size Literal</em>'.
   * @generated
   */
  QualifiedSizeLiteral createQualifiedSizeLiteral();

  /**
   * Returns a new object of class '<em>Font Height Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Height Literal</em>'.
   * @generated
   */
  FontHeightLiteral createFontHeightLiteral();

  /**
   * Returns a new object of class '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB Color</em>'.
   * @generated
   */
  RGBColor createRGBColor();

  /**
   * Returns a new object of class '<em>Named Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Color</em>'.
   * @generated
   */
  NamedColor createNamedColor();

  /**
   * Returns a new object of class '<em>Component RGB Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component RGB Color</em>'.
   * @generated
   */
  ComponentRGBColor createComponentRGBColor();

  /**
   * Returns a new object of class '<em>Component RGB Alpha Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component RGB Alpha Color</em>'.
   * @generated
   */
  ComponentRGBAlphaColor createComponentRGBAlphaColor();

  /**
   * Returns a new object of class '<em>Component HSL Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component HSL Color</em>'.
   * @generated
   */
  ComponentHSLColor createComponentHSLColor();

  /**
   * Returns a new object of class '<em>Component HSL Alpha Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component HSL Alpha Color</em>'.
   * @generated
   */
  ComponentHSLAlphaColor createComponentHSLAlphaColor();

  /**
   * Returns a new object of class '<em>Alpha Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alpha Literal</em>'.
   * @generated
   */
  AlphaLiteral createAlphaLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CssPackage getCssPackage();

} //CssFactory
