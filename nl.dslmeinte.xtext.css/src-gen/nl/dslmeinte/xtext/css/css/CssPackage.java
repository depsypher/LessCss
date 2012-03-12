/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssFactory
 * @model kind="package"
 * @generated
 */
public interface CssPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "css";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslmeinte.nl/xtext/css";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "css";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssPackage eINSTANCE = nl.dslmeinte.xtext.css.css.impl.CssPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.StylesheetImpl <em>Stylesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.StylesheetImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStylesheet()
   * @generated
   */
  int STYLESHEET = 0;

  /**
   * The feature id for the '<em><b>Char Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__CHAR_SET = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Stylesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.CSSTopLevelStatementImpl <em>CSS Top Level Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.CSSTopLevelStatementImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCSSTopLevelStatement()
   * @generated
   */
  int CSS_TOP_LEVEL_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>CSS Top Level Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_TOP_LEVEL_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.CSSOtherTopLevelDeclarationImpl <em>CSS Other Top Level Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.CSSOtherTopLevelDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCSSOtherTopLevelDeclaration()
   * @generated
   */
  int CSS_OTHER_TOP_LEVEL_DECLARATION = 2;

  /**
   * The number of structural features of the '<em>CSS Other Top Level Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT = CSS_TOP_LEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ImportDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__URL = 1;

  /**
   * The feature id for the '<em><b>Media</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__MEDIA = 2;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl <em>Media Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaDeclaration()
   * @generated
   */
  int MEDIA_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Media Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_DECLARATION__MEDIA_QUERIES = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Media</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_DECLARATION__MEDIA = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_DECLARATION__MEMBERS = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Media Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_DECLARATION_FEATURE_COUNT = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationMembersImpl <em>Media Declaration Members</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.MediaDeclarationMembersImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaDeclarationMembers()
   * @generated
   */
  int MEDIA_DECLARATION_MEMBERS = 5;

  /**
   * The number of structural features of the '<em>Media Declaration Members</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_DECLARATION_MEMBERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl <em>Media Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaQuery()
   * @generated
   */
  int MEDIA_QUERY = 6;

  /**
   * The feature id for the '<em><b>Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY__ONLY = 0;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY__NOT = 1;

  /**
   * The feature id for the '<em><b>Media Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY__MEDIA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY__EXPRESSIONS = 3;

  /**
   * The number of structural features of the '<em>Media Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryExpressionImpl <em>Media Query Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.MediaQueryExpressionImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaQueryExpression()
   * @generated
   */
  int MEDIA_QUERY_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY_EXPRESSION__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Media Query Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_QUERY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PageDeclarationImpl <em>Page Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PageDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPageDeclaration()
   * @generated
   */
  int PAGE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Pseudo Page</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_DECLARATION__PSEUDO_PAGE = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_DECLARATION__BODY = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Page Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_DECLARATION_FEATURE_COUNT = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NamespaceDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAME = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__URL = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.FontFaceDeclarationImpl <em>Font Face Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.FontFaceDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFontFaceDeclaration()
   * @generated
   */
  int FONT_FACE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE_DECLARATION__BODY = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Face Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE_DECLARATION_FEATURE_COUNT = CSS_OTHER_TOP_LEVEL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.RuleSetImpl <em>Rule Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.RuleSetImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRuleSet()
   * @generated
   */
  int RULE_SET = 11;

  /**
   * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__SELECTORS = CSS_TOP_LEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__BODY = CSS_TOP_LEVEL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = CSS_TOP_LEVEL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.RuleSetBodyImpl <em>Rule Set Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.RuleSetBodyImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRuleSetBody()
   * @generated
   */
  int RULE_SET_BODY = 12;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_BODY__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Rule Set Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PropertyDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Values Lists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__VALUES_LISTS = MEDIA_DECLARATION_MEMBERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = MEDIA_DECLARATION_MEMBERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.KnownPropertyDeclarationImpl <em>Known Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.KnownPropertyDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getKnownPropertyDeclaration()
   * @generated
   */
  int KNOWN_PROPERTY_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Values Lists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWN_PROPERTY_DECLARATION__VALUES_LISTS = PROPERTY_DECLARATION__VALUES_LISTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWN_PROPERTY_DECLARATION__NAME = PROPERTY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Known Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWN_PROPERTY_DECLARATION_FEATURE_COUNT = PROPERTY_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.UnrecognizedPropertyDeclarationImpl <em>Unrecognized Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.UnrecognizedPropertyDeclarationImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUnrecognizedPropertyDeclaration()
   * @generated
   */
  int UNRECOGNIZED_PROPERTY_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Values Lists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNRECOGNIZED_PROPERTY_DECLARATION__VALUES_LISTS = PROPERTY_DECLARATION__VALUES_LISTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNRECOGNIZED_PROPERTY_DECLARATION__NAME = PROPERTY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unrecognized Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNRECOGNIZED_PROPERTY_DECLARATION_FEATURE_COUNT = PROPERTY_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValuesListsImpl <em>Property Values Lists</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PropertyValuesListsImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValuesLists()
   * @generated
   */
  int PROPERTY_VALUES_LISTS = 16;

  /**
   * The feature id for the '<em><b>Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUES_LISTS__LISTS = 0;

  /**
   * The number of structural features of the '<em>Property Values Lists</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUES_LISTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValuesListImpl <em>Property Values List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PropertyValuesListImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValuesList()
   * @generated
   */
  int PROPERTY_VALUES_LIST = 17;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUES_LIST__VALUES = 0;

  /**
   * The number of structural features of the '<em>Property Values List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUES_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PropertyValueImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Important</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__IMPORTANT = 1;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.SelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 19;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorImpl <em>Simple Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.SimpleSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSimpleSelector()
   * @generated
   */
  int SIMPLE_SELECTOR = 20;

  /**
   * The number of structural features of the '<em>Simple Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.TypeSelectorImpl <em>Type Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.TypeSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getTypeSelector()
   * @generated
   */
  int TYPE_SELECTOR = 21;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SELECTOR__NAMESPACE_PREFIX = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SELECTOR__TYPE = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NamespacePrefixImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamespacePrefix()
   * @generated
   */
  int NAMESPACE_PREFIX = 22;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_PREFIX__NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Namespace Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.UniversalSelectorImpl <em>Universal Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.UniversalSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUniversalSelector()
   * @generated
   */
  int UNIVERSAL_SELECTOR = 23;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_SELECTOR__NAMESPACE_PREFIX = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Universal Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeSelector()
   * @generated
   */
  int ATTRIBUTE_SELECTOR = 24;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__ATTRIBUTE = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matcher</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__MATCHER = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__VALUE = SIMPLE_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.AttributeImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 25;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAMESPACE_PREFIX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeValueLiteralImpl <em>Attribute Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.AttributeValueLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeValueLiteral()
   * @generated
   */
  int ATTRIBUTE_VALUE_LITERAL = 26;

  /**
   * The number of structural features of the '<em>Attribute Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.IDSelectorImpl <em>ID Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.IDSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIDSelector()
   * @generated
   */
  int ID_SELECTOR = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_SELECTOR__NAME = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ID Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ClassSelectorImpl <em>Class Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ClassSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getClassSelector()
   * @generated
   */
  int CLASS_SELECTOR = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SELECTOR__NAME = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PseudoSelectorImpl <em>Pseudo Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PseudoSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoSelector()
   * @generated
   */
  int PSEUDO_SELECTOR = 29;

  /**
   * The number of structural features of the '<em>Pseudo Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NoArgsPseudoClassSelectorImpl <em>No Args Pseudo Class Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NoArgsPseudoClassSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNoArgsPseudoClassSelector()
   * @generated
   */
  int NO_ARGS_PSEUDO_CLASS_SELECTOR = 30;

  /**
   * The feature id for the '<em><b>Pseudo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO = PSEUDO_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>No Args Pseudo Class Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ARGS_PSEUDO_CLASS_SELECTOR_FEATURE_COUNT = PSEUDO_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl <em>Pseudo Element Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoElementSelector()
   * @generated
   */
  int PSEUDO_ELEMENT_SELECTOR = 31;

  /**
   * The feature id for the '<em><b>Double Semi Colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON = PSEUDO_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pseudo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_ELEMENT_SELECTOR__PSEUDO = PSEUDO_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pseudo Element Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_ELEMENT_SELECTOR_FEATURE_COUNT = PSEUDO_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.LanguagePseudoClassSelectorImpl <em>Language Pseudo Class Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.LanguagePseudoClassSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getLanguagePseudoClassSelector()
   * @generated
   */
  int LANGUAGE_PSEUDO_CLASS_SELECTOR = 32;

  /**
   * The feature id for the '<em><b>Langugage Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID = PSEUDO_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Language Pseudo Class Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_PSEUDO_CLASS_SELECTOR_FEATURE_COUNT = PSEUDO_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl <em>Functional Pseudo Class Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionalPseudoClassSelector()
   * @generated
   */
  int FUNCTIONAL_PSEUDO_CLASS_SELECTOR = 33;

  /**
   * The feature id for the '<em><b>Pseudo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO = PSEUDO_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT = PSEUDO_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Functional Pseudo Class Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_PSEUDO_CLASS_SELECTOR_FEATURE_COUNT = PSEUDO_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.TypeArgumentImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getTypeArgument()
   * @generated
   */
  int TYPE_ARGUMENT = 34;

  /**
   * The number of structural features of the '<em>Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl <em>Linear Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getLinearArgument()
   * @generated
   */
  int LINEAR_ARGUMENT = 35;

  /**
   * The feature id for the '<em><b>Coefficient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_ARGUMENT__COEFFICIENT = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constant Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_ARGUMENT__CONSTANT_SIGN = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_ARGUMENT__CONSTANT = TYPE_ARGUMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Linear Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.CoefficientImpl <em>Coefficient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.CoefficientImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCoefficient()
   * @generated
   */
  int COEFFICIENT = 36;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COEFFICIENT__IDENT = 0;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COEFFICIENT__INT = 1;

  /**
   * The number of structural features of the '<em>Coefficient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COEFFICIENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ConstantArgumentImpl <em>Constant Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ConstantArgumentImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getConstantArgument()
   * @generated
   */
  int CONSTANT_ARGUMENT = 37;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ARGUMENT__SIGN = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ARGUMENT__INT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ParityArgumentImpl <em>Parity Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ParityArgumentImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getParityArgument()
   * @generated
   */
  int PARITY_ARGUMENT = 38;

  /**
   * The feature id for the '<em><b>Parity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARITY_ARGUMENT__PARITY = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parity Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARITY_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NegationSelectorImpl <em>Negation Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NegationSelectorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNegationSelector()
   * @generated
   */
  int NEGATION_SELECTOR = 39;

  /**
   * The feature id for the '<em><b>Simple Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_SELECTOR__SIMPLE_SELECTOR = SIMPLE_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_SELECTOR_FEATURE_COUNT = SIMPLE_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ValueLiteralImpl <em>Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ValueLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getValueLiteral()
   * @generated
   */
  int VALUE_LITERAL = 40;

  /**
   * The number of structural features of the '<em>Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NumberLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 41;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.SizeLiteralImpl <em>Size Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.SizeLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSizeLiteral()
   * @generated
   */
  int SIZE_LITERAL = 42;

  /**
   * The number of structural features of the '<em>Size Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_LITERAL_FEATURE_COUNT = VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.StringLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ColorLiteralImpl <em>Color Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ColorLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorLiteral()
   * @generated
   */
  int COLOR_LITERAL = 44;

  /**
   * The number of structural features of the '<em>Color Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_LITERAL_FEATURE_COUNT = VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentColorLiteralImpl <em>Component Color Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ComponentColorLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentColorLiteral()
   * @generated
   */
  int COMPONENT_COLOR_LITERAL = 45;

  /**
   * The number of structural features of the '<em>Component Color Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_COLOR_LITERAL_FEATURE_COUNT = COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ColorComponentLiteralImpl <em>Color Component Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ColorComponentLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorComponentLiteral()
   * @generated
   */
  int COLOR_COMPONENT_LITERAL = 46;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_COMPONENT_LITERAL__NUMBER = 0;

  /**
   * The feature id for the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_COMPONENT_LITERAL__PERCENTAGE = 1;

  /**
   * The number of structural features of the '<em>Color Component Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_COMPONENT_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.URLLiteralImpl <em>URL Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.URLLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getURLLiteral()
   * @generated
   */
  int URL_LITERAL = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_LITERAL__VALUE = VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>URL Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_LITERAL_FEATURE_COUNT = VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.BareWordLiteralImpl <em>Bare Word Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.BareWordLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getBareWordLiteral()
   * @generated
   */
  int BARE_WORD_LITERAL = 48;

  /**
   * The feature id for the '<em><b>Bare Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARE_WORD_LITERAL__BARE_WORD = 0;

  /**
   * The number of structural features of the '<em>Bare Word Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARE_WORD_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.FunctionCallLiteralImpl <em>Function Call Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.FunctionCallLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionCallLiteral()
   * @generated
   */
  int FUNCTION_CALL_LITERAL = 49;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_LITERAL__FUNCTION = VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_LITERAL__ARGUMENTS = VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_LITERAL_FEATURE_COUNT = VALUE_LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.DescendantCombinatorImpl <em>Descendant Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.DescendantCombinatorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDescendantCombinator()
   * @generated
   */
  int DESCENDANT_COMBINATOR = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_COMBINATOR__LEFT = SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ws I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_COMBINATOR__WS_I = SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_COMBINATOR__RIGHT = SELECTOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Descendant Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_COMBINATOR_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl <em>Child Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getChildCombinator()
   * @generated
   */
  int CHILD_COMBINATOR = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_COMBINATOR__LEFT = SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ws L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_COMBINATOR__WS_L = SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ws R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_COMBINATOR__WS_R = SELECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_COMBINATOR__RIGHT = SELECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Child Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_COMBINATOR_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.AdjacentSiblingCombinatorImpl <em>Adjacent Sibling Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.AdjacentSiblingCombinatorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAdjacentSiblingCombinator()
   * @generated
   */
  int ADJACENT_SIBLING_COMBINATOR = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJACENT_SIBLING_COMBINATOR__LEFT = SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ws L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJACENT_SIBLING_COMBINATOR__WS_L = SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ws R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJACENT_SIBLING_COMBINATOR__WS_R = SELECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJACENT_SIBLING_COMBINATOR__RIGHT = SELECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Adjacent Sibling Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJACENT_SIBLING_COMBINATOR_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.GeneralSiblingCombinatorImpl <em>General Sibling Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.GeneralSiblingCombinatorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getGeneralSiblingCombinator()
   * @generated
   */
  int GENERAL_SIBLING_COMBINATOR = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_SIBLING_COMBINATOR__LEFT = SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ws L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_SIBLING_COMBINATOR__WS_L = SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ws R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_SIBLING_COMBINATOR__WS_R = SELECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_SIBLING_COMBINATOR__RIGHT = SELECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>General Sibling Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_SIBLING_COMBINATOR_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl <em>Simple Selector Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSimpleSelectorSequence()
   * @generated
   */
  int SIMPLE_SELECTOR_SEQUENCE = 54;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_SEQUENCE__HEAD = SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS = SELECTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Selector Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_SEQUENCE_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.UniversalNamespacePrefixImpl <em>Universal Namespace Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.UniversalNamespacePrefixImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUniversalNamespacePrefix()
   * @generated
   */
  int UNIVERSAL_NAMESPACE_PREFIX = 55;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_NAMESPACE_PREFIX__NAMESPACE = NAMESPACE_PREFIX__NAMESPACE;

  /**
   * The number of structural features of the '<em>Universal Namespace Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_NAMESPACE_PREFIX_FEATURE_COUNT = NAMESPACE_PREFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.WithoutNamespacePrefixImpl <em>Without Namespace Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.WithoutNamespacePrefixImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getWithoutNamespacePrefix()
   * @generated
   */
  int WITHOUT_NAMESPACE_PREFIX = 56;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHOUT_NAMESPACE_PREFIX__NAMESPACE = NAMESPACE_PREFIX__NAMESPACE;

  /**
   * The number of structural features of the '<em>Without Namespace Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHOUT_NAMESPACE_PREFIX_FEATURE_COUNT = NAMESPACE_PREFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.StringAttributeValueLiteralImpl <em>String Attribute Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.StringAttributeValueLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStringAttributeValueLiteral()
   * @generated
   */
  int STRING_ATTRIBUTE_VALUE_LITERAL = 57;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE_VALUE_LITERAL__VALUE = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Attribute Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.IntegerAttributeValueLiteralImpl <em>Integer Attribute Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.IntegerAttributeValueLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIntegerAttributeValueLiteral()
   * @generated
   */
  int INTEGER_ATTRIBUTE_VALUE_LITERAL = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTRIBUTE_VALUE_LITERAL__VALUE = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Attribute Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.DecimalAttributeValueLiteralImpl <em>Decimal Attribute Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.DecimalAttributeValueLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDecimalAttributeValueLiteral()
   * @generated
   */
  int DECIMAL_ATTRIBUTE_VALUE_LITERAL = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_ATTRIBUTE_VALUE_LITERAL__VALUE = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Attribute Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT = ATTRIBUTE_VALUE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.IntegerLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 60;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__INT = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.DecimalLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDecimalLiteral()
   * @generated
   */
  int DECIMAL_LITERAL = 61;

  /**
   * The feature id for the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL__DECIMAL = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.QuantifiedSizeLiteralImpl <em>Quantified Size Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.QuantifiedSizeLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getQuantifiedSizeLiteral()
   * @generated
   */
  int QUANTIFIED_SIZE_LITERAL = 62;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SIZE_LITERAL__NUMBER = SIZE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SIZE_LITERAL__DIMENSION = SIZE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Quantified Size Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SIZE_LITERAL_FEATURE_COUNT = SIZE_LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.QualifiedSizeLiteralImpl <em>Qualified Size Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.QualifiedSizeLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getQualifiedSizeLiteral()
   * @generated
   */
  int QUALIFIED_SIZE_LITERAL = 63;

  /**
   * The feature id for the '<em><b>Bareword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_SIZE_LITERAL__BAREWORD = SIZE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualified Size Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_SIZE_LITERAL_FEATURE_COUNT = SIZE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl <em>Font Height Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFontHeightLiteral()
   * @generated
   */
  int FONT_HEIGHT_LITERAL = 64;

  /**
   * The feature id for the '<em><b>Font Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_HEIGHT_LITERAL__FONT_HEIGHT = SIZE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Line Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_HEIGHT_LITERAL__LINE_HEIGHT = SIZE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Line Height Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION = SIZE_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Font Height Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_HEIGHT_LITERAL_FEATURE_COUNT = SIZE_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.RGBColorImpl <em>RGB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.RGBColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRGBColor()
   * @generated
   */
  int RGB_COLOR = 65;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__RGB = COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RGB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR_FEATURE_COUNT = COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.NamedColorImpl <em>Named Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.NamedColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamedColor()
   * @generated
   */
  int NAMED_COLOR = 66;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR__COLOR = COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR_FEATURE_COUNT = COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl <em>Component RGB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentRGBColor()
   * @generated
   */
  int COMPONENT_RGB_COLOR = 67;

  /**
   * The feature id for the '<em><b>Red</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_COLOR__RED = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_COLOR__GREEN = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_COLOR__BLUE = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component RGB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_COLOR_FEATURE_COUNT = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBAlphaColorImpl <em>Component RGB Alpha Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ComponentRGBAlphaColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentRGBAlphaColor()
   * @generated
   */
  int COMPONENT_RGB_ALPHA_COLOR = 68;

  /**
   * The feature id for the '<em><b>Red</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_ALPHA_COLOR__RED = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_ALPHA_COLOR__GREEN = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_ALPHA_COLOR__BLUE = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Opacity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_ALPHA_COLOR__OPACITY = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Component RGB Alpha Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RGB_ALPHA_COLOR_FEATURE_COUNT = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLColorImpl <em>Component HSL Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ComponentHSLColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentHSLColor()
   * @generated
   */
  int COMPONENT_HSL_COLOR = 69;

  /**
   * The feature id for the '<em><b>Hue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_COLOR__HUE = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Saturation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_COLOR__SATURATION = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lightness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_COLOR__LIGHTNESS = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component HSL Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_COLOR_FEATURE_COUNT = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl <em>Component HSL Alpha Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentHSLAlphaColor()
   * @generated
   */
  int COMPONENT_HSL_ALPHA_COLOR = 70;

  /**
   * The feature id for the '<em><b>Hue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_ALPHA_COLOR__HUE = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Saturation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_ALPHA_COLOR__SATURATION = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lightness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Opacity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_ALPHA_COLOR__OPACITY = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Component HSL Alpha Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_HSL_ALPHA_COLOR_FEATURE_COUNT = COMPONENT_COLOR_LITERAL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.impl.AlphaLiteralImpl <em>Alpha Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.impl.AlphaLiteralImpl
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAlphaLiteral()
   * @generated
   */
  int ALPHA_LITERAL = 71;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALPHA_LITERAL__FUNCTION = FUNCTION_CALL_LITERAL__FUNCTION;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALPHA_LITERAL__ARGUMENTS = FUNCTION_CALL_LITERAL__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Opacity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALPHA_LITERAL__OPACITY = FUNCTION_CALL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alpha Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALPHA_LITERAL_FEATURE_COUNT = FUNCTION_CALL_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.KnownProperties <em>Known Properties</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.KnownProperties
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getKnownProperties()
   * @generated
   */
  int KNOWN_PROPERTIES = 72;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers <em>Attribute Selector Matchers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeSelectorMatchers()
   * @generated
   */
  int ATTRIBUTE_SELECTOR_MATCHERS = 73;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudos <em>No Args Pseudos</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudos
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNoArgsPseudos()
   * @generated
   */
  int NO_ARGS_PSEUDOS = 74;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.PseudoElements <em>Pseudo Elements</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.PseudoElements
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoElements()
   * @generated
   */
  int PSEUDO_ELEMENTS = 75;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses <em>Functional Pseudo Classes</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionalPseudoClasses()
   * @generated
   */
  int FUNCTIONAL_PSEUDO_CLASSES = 76;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.Parities <em>Parities</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.Parities
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getParities()
   * @generated
   */
  int PARITIES = 77;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.Dimensions <em>Dimensions</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDimensions()
   * @generated
   */
  int DIMENSIONS = 78;

  /**
   * The meta object id for the '{@link nl.dslmeinte.xtext.css.css.ColorNames <em>Color Names</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.xtext.css.css.ColorNames
   * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorNames()
   * @generated
   */
  int COLOR_NAMES = 79;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.Stylesheet <em>Stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stylesheet</em>'.
   * @see nl.dslmeinte.xtext.css.css.Stylesheet
   * @generated
   */
  EClass getStylesheet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.Stylesheet#getCharSet <em>Char Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Char Set</em>'.
   * @see nl.dslmeinte.xtext.css.css.Stylesheet#getCharSet()
   * @see #getStylesheet()
   * @generated
   */
  EAttribute getStylesheet_CharSet();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.Stylesheet#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see nl.dslmeinte.xtext.css.css.Stylesheet#getImports()
   * @see #getStylesheet()
   * @generated
   */
  EReference getStylesheet_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.Stylesheet#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see nl.dslmeinte.xtext.css.css.Stylesheet#getStatements()
   * @see #getStylesheet()
   * @generated
   */
  EReference getStylesheet_Statements();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.CSSTopLevelStatement <em>CSS Top Level Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Top Level Statement</em>'.
   * @see nl.dslmeinte.xtext.css.css.CSSTopLevelStatement
   * @generated
   */
  EClass getCSSTopLevelStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.CSSOtherTopLevelDeclaration <em>CSS Other Top Level Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Other Top Level Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.CSSOtherTopLevelDeclaration
   * @generated
   */
  EClass getCSSOtherTopLevelDeclaration();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ImportDeclaration#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see nl.dslmeinte.xtext.css.css.ImportDeclaration#getImportURI()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ImportDeclaration#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see nl.dslmeinte.xtext.css.css.ImportDeclaration#getUrl()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_Url();

  /**
   * Returns the meta object for the attribute list '{@link nl.dslmeinte.xtext.css.css.ImportDeclaration#getMedia <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Media</em>'.
   * @see nl.dslmeinte.xtext.css.css.ImportDeclaration#getMedia()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_Media();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.MediaDeclaration <em>Media Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Media Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclaration
   * @generated
   */
  EClass getMediaDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMediaQueries <em>Media Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Media Queries</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclaration#getMediaQueries()
   * @see #getMediaDeclaration()
   * @generated
   */
  EReference getMediaDeclaration_MediaQueries();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMedia <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Media</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclaration#getMedia()
   * @see #getMediaDeclaration()
   * @generated
   */
  EReference getMediaDeclaration_Media();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclaration#getMembers()
   * @see #getMediaDeclaration()
   * @generated
   */
  EReference getMediaDeclaration_Members();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.MediaDeclarationMembers <em>Media Declaration Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Media Declaration Members</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaDeclarationMembers
   * @generated
   */
  EClass getMediaDeclarationMembers();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.MediaQuery <em>Media Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Media Query</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery
   * @generated
   */
  EClass getMediaQuery();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.MediaQuery#isOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Only</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery#isOnly()
   * @see #getMediaQuery()
   * @generated
   */
  EAttribute getMediaQuery_Only();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.MediaQuery#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery#isNot()
   * @see #getMediaQuery()
   * @generated
   */
  EAttribute getMediaQuery_Not();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.MediaQuery#getMediaType <em>Media Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Media Type</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery#getMediaType()
   * @see #getMediaQuery()
   * @generated
   */
  EAttribute getMediaQuery_MediaType();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.MediaQuery#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQuery#getExpressions()
   * @see #getMediaQuery()
   * @generated
   */
  EReference getMediaQuery_Expressions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.MediaQueryExpression <em>Media Query Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Media Query Expression</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQueryExpression
   * @generated
   */
  EClass getMediaQueryExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.MediaQueryExpression#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQueryExpression#getFeature()
   * @see #getMediaQueryExpression()
   * @generated
   */
  EAttribute getMediaQueryExpression_Feature();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.MediaQueryExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see nl.dslmeinte.xtext.css.css.MediaQueryExpression#getExpression()
   * @see #getMediaQueryExpression()
   * @generated
   */
  EReference getMediaQueryExpression_Expression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PageDeclaration <em>Page Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.PageDeclaration
   * @generated
   */
  EClass getPageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getPseudoPage <em>Pseudo Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo Page</em>'.
   * @see nl.dslmeinte.xtext.css.css.PageDeclaration#getPseudoPage()
   * @see #getPageDeclaration()
   * @generated
   */
  EAttribute getPageDeclaration_PseudoPage();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.xtext.css.css.PageDeclaration#getBody()
   * @see #getPageDeclaration()
   * @generated
   */
  EReference getPageDeclaration_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamespaceDeclaration
   * @generated
   */
  EClass getNamespaceDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getName()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EAttribute getNamespaceDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getUrl()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EAttribute getNamespaceDeclaration_Url();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.FontFaceDeclaration <em>Font Face Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Face Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontFaceDeclaration
   * @generated
   */
  EClass getFontFaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.FontFaceDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontFaceDeclaration#getBody()
   * @see #getFontFaceDeclaration()
   * @generated
   */
  EReference getFontFaceDeclaration_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Set</em>'.
   * @see nl.dslmeinte.xtext.css.css.RuleSet
   * @generated
   */
  EClass getRuleSet();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.RuleSet#getSelectors <em>Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selectors</em>'.
   * @see nl.dslmeinte.xtext.css.css.RuleSet#getSelectors()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Selectors();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.RuleSet#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.xtext.css.css.RuleSet#getBody()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.RuleSetBody <em>Rule Set Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Set Body</em>'.
   * @see nl.dslmeinte.xtext.css.css.RuleSetBody
   * @generated
   */
  EClass getRuleSetBody();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.RuleSetBody#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see nl.dslmeinte.xtext.css.css.RuleSetBody#getDeclarations()
   * @see #getRuleSetBody()
   * @generated
   */
  EReference getRuleSetBody_Declarations();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.PropertyDeclaration#getValuesLists <em>Values Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values Lists</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyDeclaration#getValuesLists()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_ValuesLists();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration <em>Known Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Known Property Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration
   * @generated
   */
  EClass getKnownPropertyDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration#getName()
   * @see #getKnownPropertyDeclaration()
   * @generated
   */
  EAttribute getKnownPropertyDeclaration_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration <em>Unrecognized Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unrecognized Property Declaration</em>'.
   * @see nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration
   * @generated
   */
  EClass getUnrecognizedPropertyDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.UnrecognizedPropertyDeclaration#getName()
   * @see #getUnrecognizedPropertyDeclaration()
   * @generated
   */
  EAttribute getUnrecognizedPropertyDeclaration_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PropertyValuesLists <em>Property Values Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Values Lists</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesLists
   * @generated
   */
  EClass getPropertyValuesLists();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.PropertyValuesLists#getLists <em>Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lists</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesLists#getLists()
   * @see #getPropertyValuesLists()
   * @generated
   */
  EReference getPropertyValuesLists_Lists();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PropertyValuesList <em>Property Values List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Values List</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesList
   * @generated
   */
  EClass getPropertyValuesList();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.PropertyValuesList#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValuesList#getValues()
   * @see #getPropertyValuesList()
   * @generated
   */
  EReference getPropertyValuesList_Values();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.PropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValue#getValue()
   * @see #getPropertyValue()
   * @generated
   */
  EReference getPropertyValue_Value();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.PropertyValue#isImportant <em>Important</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Important</em>'.
   * @see nl.dslmeinte.xtext.css.css.PropertyValue#isImportant()
   * @see #getPropertyValue()
   * @generated
   */
  EAttribute getPropertyValue_Important();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.SimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelector
   * @generated
   */
  EClass getSimpleSelector();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.TypeSelector <em>Type Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.TypeSelector
   * @generated
   */
  EClass getTypeSelector();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.TypeSelector#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.TypeSelector#getNamespacePrefix()
   * @see #getTypeSelector()
   * @generated
   */
  EReference getTypeSelector_NamespacePrefix();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.TypeSelector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see nl.dslmeinte.xtext.css.css.TypeSelector#getType()
   * @see #getTypeSelector()
   * @generated
   */
  EAttribute getTypeSelector_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamespacePrefix
   * @generated
   */
  EClass getNamespacePrefix();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.xtext.css.css.NamespacePrefix#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Namespace</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamespacePrefix#getNamespace()
   * @see #getNamespacePrefix()
   * @generated
   */
  EReference getNamespacePrefix_Namespace();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.UniversalSelector <em>Universal Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Universal Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.UniversalSelector
   * @generated
   */
  EClass getUniversalSelector();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.UniversalSelector#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.UniversalSelector#getNamespacePrefix()
   * @see #getUniversalSelector()
   * @generated
   */
  EReference getUniversalSelector_NamespacePrefix();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.AttributeSelector <em>Attribute Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelector
   * @generated
   */
  EClass getAttributeSelector();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelector#getAttribute()
   * @see #getAttributeSelector()
   * @generated
   */
  EReference getAttributeSelector_Attribute();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getMatcher <em>Matcher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matcher</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelector#getMatcher()
   * @see #getAttributeSelector()
   * @generated
   */
  EAttribute getAttributeSelector_Matcher();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelector#getValue()
   * @see #getAttributeSelector()
   * @generated
   */
  EReference getAttributeSelector_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see nl.dslmeinte.xtext.css.css.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.Attribute#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.Attribute#getNamespacePrefix()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_NamespacePrefix();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.AttributeValueLiteral <em>Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeValueLiteral
   * @generated
   */
  EClass getAttributeValueLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.IDSelector <em>ID Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.IDSelector
   * @generated
   */
  EClass getIDSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.IDSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.IDSelector#getName()
   * @see #getIDSelector()
   * @generated
   */
  EAttribute getIDSelector_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ClassSelector <em>Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.ClassSelector
   * @generated
   */
  EClass getClassSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ClassSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.xtext.css.css.ClassSelector#getName()
   * @see #getClassSelector()
   * @generated
   */
  EAttribute getClassSelector_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PseudoSelector <em>Pseudo Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.PseudoSelector
   * @generated
   */
  EClass getPseudoSelector();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector <em>No Args Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Args Pseudo Class Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector
   * @generated
   */
  EClass getNoArgsPseudoClassSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector#getPseudo <em>Pseudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo</em>'.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector#getPseudo()
   * @see #getNoArgsPseudoClassSelector()
   * @generated
   */
  EAttribute getNoArgsPseudoClassSelector_Pseudo();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector <em>Pseudo Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Element Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.PseudoElementSelector
   * @generated
   */
  EClass getPseudoElementSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#isDoubleSemiColon <em>Double Semi Colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double Semi Colon</em>'.
   * @see nl.dslmeinte.xtext.css.css.PseudoElementSelector#isDoubleSemiColon()
   * @see #getPseudoElementSelector()
   * @generated
   */
  EAttribute getPseudoElementSelector_DoubleSemiColon();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#getPseudo <em>Pseudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo</em>'.
   * @see nl.dslmeinte.xtext.css.css.PseudoElementSelector#getPseudo()
   * @see #getPseudoElementSelector()
   * @generated
   */
  EAttribute getPseudoElementSelector_Pseudo();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector <em>Language Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Pseudo Class Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector
   * @generated
   */
  EClass getLanguagePseudoClassSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector#getLangugageId <em>Langugage Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Langugage Id</em>'.
   * @see nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector#getLangugageId()
   * @see #getLanguagePseudoClassSelector()
   * @generated
   */
  EAttribute getLanguagePseudoClassSelector_LangugageId();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector <em>Functional Pseudo Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Pseudo Class Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector
   * @generated
   */
  EClass getFunctionalPseudoClassSelector();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getPseudo <em>Pseudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getPseudo()
   * @see #getFunctionalPseudoClassSelector()
   * @generated
   */
  EAttribute getFunctionalPseudoClassSelector_Pseudo();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getArgument()
   * @see #getFunctionalPseudoClassSelector()
   * @generated
   */
  EReference getFunctionalPseudoClassSelector_Argument();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.TypeArgument <em>Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Argument</em>'.
   * @see nl.dslmeinte.xtext.css.css.TypeArgument
   * @generated
   */
  EClass getTypeArgument();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.LinearArgument <em>Linear Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Argument</em>'.
   * @see nl.dslmeinte.xtext.css.css.LinearArgument
   * @generated
   */
  EClass getLinearArgument();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getCoefficient <em>Coefficient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coefficient</em>'.
   * @see nl.dslmeinte.xtext.css.css.LinearArgument#getCoefficient()
   * @see #getLinearArgument()
   * @generated
   */
  EReference getLinearArgument_Coefficient();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstantSign <em>Constant Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant Sign</em>'.
   * @see nl.dslmeinte.xtext.css.css.LinearArgument#getConstantSign()
   * @see #getLinearArgument()
   * @generated
   */
  EAttribute getLinearArgument_ConstantSign();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see nl.dslmeinte.xtext.css.css.LinearArgument#getConstant()
   * @see #getLinearArgument()
   * @generated
   */
  EAttribute getLinearArgument_Constant();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.Coefficient <em>Coefficient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coefficient</em>'.
   * @see nl.dslmeinte.xtext.css.css.Coefficient
   * @generated
   */
  EClass getCoefficient();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.Coefficient#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see nl.dslmeinte.xtext.css.css.Coefficient#getIdent()
   * @see #getCoefficient()
   * @generated
   */
  EAttribute getCoefficient_Ident();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.Coefficient#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see nl.dslmeinte.xtext.css.css.Coefficient#getInt()
   * @see #getCoefficient()
   * @generated
   */
  EAttribute getCoefficient_Int();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ConstantArgument <em>Constant Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Argument</em>'.
   * @see nl.dslmeinte.xtext.css.css.ConstantArgument
   * @generated
   */
  EClass getConstantArgument();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ConstantArgument#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see nl.dslmeinte.xtext.css.css.ConstantArgument#getSign()
   * @see #getConstantArgument()
   * @generated
   */
  EAttribute getConstantArgument_Sign();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ConstantArgument#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see nl.dslmeinte.xtext.css.css.ConstantArgument#getInt()
   * @see #getConstantArgument()
   * @generated
   */
  EAttribute getConstantArgument_Int();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ParityArgument <em>Parity Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parity Argument</em>'.
   * @see nl.dslmeinte.xtext.css.css.ParityArgument
   * @generated
   */
  EClass getParityArgument();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ParityArgument#getParity <em>Parity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parity</em>'.
   * @see nl.dslmeinte.xtext.css.css.ParityArgument#getParity()
   * @see #getParityArgument()
   * @generated
   */
  EAttribute getParityArgument_Parity();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NegationSelector <em>Negation Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.NegationSelector
   * @generated
   */
  EClass getNegationSelector();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.NegationSelector#getSimpleSelector <em>Simple Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Selector</em>'.
   * @see nl.dslmeinte.xtext.css.css.NegationSelector#getSimpleSelector()
   * @see #getNegationSelector()
   * @generated
   */
  EReference getNegationSelector_SimpleSelector();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ValueLiteral <em>Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.ValueLiteral
   * @generated
   */
  EClass getValueLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.SizeLiteral <em>Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.SizeLiteral
   * @generated
   */
  EClass getSizeLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ColorLiteral <em>Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.ColorLiteral
   * @generated
   */
  EClass getColorLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ComponentColorLiteral <em>Component Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Color Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentColorLiteral
   * @generated
   */
  EClass getComponentColorLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral <em>Color Component Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Component Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.ColorComponentLiteral
   * @generated
   */
  EClass getColorComponentLiteral();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see nl.dslmeinte.xtext.css.css.ColorComponentLiteral#getNumber()
   * @see #getColorComponentLiteral()
   * @generated
   */
  EReference getColorComponentLiteral_Number();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#isPercentage <em>Percentage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percentage</em>'.
   * @see nl.dslmeinte.xtext.css.css.ColorComponentLiteral#isPercentage()
   * @see #getColorComponentLiteral()
   * @generated
   */
  EAttribute getColorComponentLiteral_Percentage();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.URLLiteral <em>URL Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.URLLiteral
   * @generated
   */
  EClass getURLLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.URLLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.URLLiteral#getValue()
   * @see #getURLLiteral()
   * @generated
   */
  EAttribute getURLLiteral_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.BareWordLiteral <em>Bare Word Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bare Word Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.BareWordLiteral
   * @generated
   */
  EClass getBareWordLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.BareWordLiteral#getBareWord <em>Bare Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bare Word</em>'.
   * @see nl.dslmeinte.xtext.css.css.BareWordLiteral#getBareWord()
   * @see #getBareWordLiteral()
   * @generated
   */
  EAttribute getBareWordLiteral_BareWord();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral <em>Function Call Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionCallLiteral
   * @generated
   */
  EClass getFunctionCallLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getFunction()
   * @see #getFunctionCallLiteral()
   * @generated
   */
  EAttribute getFunctionCallLiteral_Function();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getArguments()
   * @see #getFunctionCallLiteral()
   * @generated
   */
  EReference getFunctionCallLiteral_Arguments();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator <em>Descendant Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Combinator</em>'.
   * @see nl.dslmeinte.xtext.css.css.DescendantCombinator
   * @generated
   */
  EClass getDescendantCombinator();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.css.css.DescendantCombinator#getLeft()
   * @see #getDescendantCombinator()
   * @generated
   */
  EReference getDescendantCombinator_Left();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getWsI <em>Ws I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws I</em>'.
   * @see nl.dslmeinte.xtext.css.css.DescendantCombinator#getWsI()
   * @see #getDescendantCombinator()
   * @generated
   */
  EAttribute getDescendantCombinator_WsI();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.css.css.DescendantCombinator#getRight()
   * @see #getDescendantCombinator()
   * @generated
   */
  EReference getDescendantCombinator_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ChildCombinator <em>Child Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Combinator</em>'.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator
   * @generated
   */
  EClass getChildCombinator();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ChildCombinator#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator#getLeft()
   * @see #getChildCombinator()
   * @generated
   */
  EReference getChildCombinator_Left();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ChildCombinator#getWsL <em>Ws L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws L</em>'.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator#getWsL()
   * @see #getChildCombinator()
   * @generated
   */
  EAttribute getChildCombinator_WsL();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.ChildCombinator#getWsR <em>Ws R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws R</em>'.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator#getWsR()
   * @see #getChildCombinator()
   * @generated
   */
  EAttribute getChildCombinator_WsR();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ChildCombinator#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.css.css.ChildCombinator#getRight()
   * @see #getChildCombinator()
   * @generated
   */
  EReference getChildCombinator_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator <em>Adjacent Sibling Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adjacent Sibling Combinator</em>'.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator
   * @generated
   */
  EClass getAdjacentSiblingCombinator();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getLeft()
   * @see #getAdjacentSiblingCombinator()
   * @generated
   */
  EReference getAdjacentSiblingCombinator_Left();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getWsL <em>Ws L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws L</em>'.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getWsL()
   * @see #getAdjacentSiblingCombinator()
   * @generated
   */
  EAttribute getAdjacentSiblingCombinator_WsL();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getWsR <em>Ws R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws R</em>'.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getWsR()
   * @see #getAdjacentSiblingCombinator()
   * @generated
   */
  EAttribute getAdjacentSiblingCombinator_WsR();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.css.css.AdjacentSiblingCombinator#getRight()
   * @see #getAdjacentSiblingCombinator()
   * @generated
   */
  EReference getAdjacentSiblingCombinator_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator <em>General Sibling Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Sibling Combinator</em>'.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator
   * @generated
   */
  EClass getGeneralSiblingCombinator();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getLeft()
   * @see #getGeneralSiblingCombinator()
   * @generated
   */
  EReference getGeneralSiblingCombinator_Left();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsL <em>Ws L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws L</em>'.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsL()
   * @see #getGeneralSiblingCombinator()
   * @generated
   */
  EAttribute getGeneralSiblingCombinator_WsL();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsR <em>Ws R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ws R</em>'.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsR()
   * @see #getGeneralSiblingCombinator()
   * @generated
   */
  EAttribute getGeneralSiblingCombinator_WsR();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getRight()
   * @see #getGeneralSiblingCombinator()
   * @generated
   */
  EReference getGeneralSiblingCombinator_Right();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence <em>Simple Selector Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Selector Sequence</em>'.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelectorSequence
   * @generated
   */
  EClass getSimpleSelectorSequence();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getHead()
   * @see #getSimpleSelectorSequence()
   * @generated
   */
  EReference getSimpleSelectorSequence_Head();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getSimpleSelectors <em>Simple Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simple Selectors</em>'.
   * @see nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getSimpleSelectors()
   * @see #getSimpleSelectorSequence()
   * @generated
   */
  EReference getSimpleSelectorSequence_SimpleSelectors();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix <em>Universal Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Universal Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.UniversalNamespacePrefix
   * @generated
   */
  EClass getUniversalNamespacePrefix();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix <em>Without Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Without Namespace Prefix</em>'.
   * @see nl.dslmeinte.xtext.css.css.WithoutNamespacePrefix
   * @generated
   */
  EClass getWithoutNamespacePrefix();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral <em>String Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Attribute Value Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral
   * @generated
   */
  EClass getStringAttributeValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.StringAttributeValueLiteral#getValue()
   * @see #getStringAttributeValueLiteral()
   * @generated
   */
  EAttribute getStringAttributeValueLiteral_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral <em>Integer Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attribute Value Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral
   * @generated
   */
  EClass getIntegerAttributeValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.IntegerAttributeValueLiteral#getValue()
   * @see #getIntegerAttributeValueLiteral()
   * @generated
   */
  EAttribute getIntegerAttributeValueLiteral_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral <em>Decimal Attribute Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Attribute Value Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral
   * @generated
   */
  EClass getDecimalAttributeValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral#getValue()
   * @see #getDecimalAttributeValueLiteral()
   * @generated
   */
  EAttribute getDecimalAttributeValueLiteral_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.IntegerLiteral#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see nl.dslmeinte.xtext.css.css.IntegerLiteral#getInt()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Int();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.DecimalLiteral <em>Decimal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.DecimalLiteral
   * @generated
   */
  EClass getDecimalLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.DecimalLiteral#getDecimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal</em>'.
   * @see nl.dslmeinte.xtext.css.css.DecimalLiteral#getDecimal()
   * @see #getDecimalLiteral()
   * @generated
   */
  EAttribute getDecimalLiteral_Decimal();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral <em>Quantified Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Size Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral
   * @generated
   */
  EClass getQuantifiedSizeLiteral();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getNumber()
   * @see #getQuantifiedSizeLiteral()
   * @generated
   */
  EReference getQuantifiedSizeLiteral_Number();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dimension</em>'.
   * @see nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getDimension()
   * @see #getQuantifiedSizeLiteral()
   * @generated
   */
  EAttribute getQuantifiedSizeLiteral_Dimension();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral <em>Qualified Size Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Size Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral
   * @generated
   */
  EClass getQualifiedSizeLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral#getBareword <em>Bareword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bareword</em>'.
   * @see nl.dslmeinte.xtext.css.css.QualifiedSizeLiteral#getBareword()
   * @see #getQualifiedSizeLiteral()
   * @generated
   */
  EAttribute getQualifiedSizeLiteral_Bareword();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral <em>Font Height Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Height Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontHeightLiteral
   * @generated
   */
  EClass getFontHeightLiteral();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getFontHeight <em>Font Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Height</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontHeightLiteral#getFontHeight()
   * @see #getFontHeightLiteral()
   * @generated
   */
  EReference getFontHeightLiteral_FontHeight();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeight <em>Line Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Line Height</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeight()
   * @see #getFontHeightLiteral()
   * @generated
   */
  EReference getFontHeightLiteral_LineHeight();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeightDimension <em>Line Height Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Height Dimension</em>'.
   * @see nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeightDimension()
   * @see #getFontHeightLiteral()
   * @generated
   */
  EAttribute getFontHeightLiteral_LineHeightDimension();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.RGBColor
   * @generated
   */
  EClass getRGBColor();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.RGBColor#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rgb</em>'.
   * @see nl.dslmeinte.xtext.css.css.RGBColor#getRgb()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Rgb();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamedColor
   * @generated
   */
  EClass getNamedColor();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.xtext.css.css.NamedColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.NamedColor#getColor()
   * @see #getNamedColor()
   * @generated
   */
  EAttribute getNamedColor_Color();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ComponentRGBColor <em>Component RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component RGB Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBColor
   * @generated
   */
  EClass getComponentRGBColor();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBColor#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Red</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBColor#getRed()
   * @see #getComponentRGBColor()
   * @generated
   */
  EReference getComponentRGBColor_Red();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBColor#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Green</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBColor#getGreen()
   * @see #getComponentRGBColor()
   * @generated
   */
  EReference getComponentRGBColor_Green();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBColor#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blue</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBColor#getBlue()
   * @see #getComponentRGBColor()
   * @generated
   */
  EReference getComponentRGBColor_Blue();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor <em>Component RGB Alpha Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component RGB Alpha Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor
   * @generated
   */
  EClass getComponentRGBAlphaColor();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Red</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getRed()
   * @see #getComponentRGBAlphaColor()
   * @generated
   */
  EReference getComponentRGBAlphaColor_Red();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Green</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getGreen()
   * @see #getComponentRGBAlphaColor()
   * @generated
   */
  EReference getComponentRGBAlphaColor_Green();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blue</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getBlue()
   * @see #getComponentRGBAlphaColor()
   * @generated
   */
  EReference getComponentRGBAlphaColor_Blue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getOpacity <em>Opacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opacity</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentRGBAlphaColor#getOpacity()
   * @see #getComponentRGBAlphaColor()
   * @generated
   */
  EReference getComponentRGBAlphaColor_Opacity();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor <em>Component HSL Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component HSL Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLColor
   * @generated
   */
  EClass getComponentHSLColor();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getHue <em>Hue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hue</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLColor#getHue()
   * @see #getComponentHSLColor()
   * @generated
   */
  EReference getComponentHSLColor_Hue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getSaturation <em>Saturation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Saturation</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLColor#getSaturation()
   * @see #getComponentHSLColor()
   * @generated
   */
  EReference getComponentHSLColor_Saturation();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getLightness <em>Lightness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lightness</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLColor#getLightness()
   * @see #getComponentHSLColor()
   * @generated
   */
  EReference getComponentHSLColor_Lightness();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor <em>Component HSL Alpha Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component HSL Alpha Color</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor
   * @generated
   */
  EClass getComponentHSLAlphaColor();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getHue <em>Hue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hue</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getHue()
   * @see #getComponentHSLAlphaColor()
   * @generated
   */
  EReference getComponentHSLAlphaColor_Hue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getSaturation <em>Saturation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Saturation</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getSaturation()
   * @see #getComponentHSLAlphaColor()
   * @generated
   */
  EReference getComponentHSLAlphaColor_Saturation();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getLightness <em>Lightness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lightness</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getLightness()
   * @see #getComponentHSLAlphaColor()
   * @generated
   */
  EReference getComponentHSLAlphaColor_Lightness();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getOpacity <em>Opacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opacity</em>'.
   * @see nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor#getOpacity()
   * @see #getComponentHSLAlphaColor()
   * @generated
   */
  EReference getComponentHSLAlphaColor_Opacity();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.xtext.css.css.AlphaLiteral <em>Alpha Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alpha Literal</em>'.
   * @see nl.dslmeinte.xtext.css.css.AlphaLiteral
   * @generated
   */
  EClass getAlphaLiteral();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.xtext.css.css.AlphaLiteral#getOpacity <em>Opacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opacity</em>'.
   * @see nl.dslmeinte.xtext.css.css.AlphaLiteral#getOpacity()
   * @see #getAlphaLiteral()
   * @generated
   */
  EReference getAlphaLiteral_Opacity();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.KnownProperties <em>Known Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Known Properties</em>'.
   * @see nl.dslmeinte.xtext.css.css.KnownProperties
   * @generated
   */
  EEnum getKnownProperties();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers <em>Attribute Selector Matchers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Selector Matchers</em>'.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers
   * @generated
   */
  EEnum getAttributeSelectorMatchers();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudos <em>No Args Pseudos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>No Args Pseudos</em>'.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudos
   * @generated
   */
  EEnum getNoArgsPseudos();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.PseudoElements <em>Pseudo Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Pseudo Elements</em>'.
   * @see nl.dslmeinte.xtext.css.css.PseudoElements
   * @generated
   */
  EEnum getPseudoElements();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses <em>Functional Pseudo Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Functional Pseudo Classes</em>'.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses
   * @generated
   */
  EEnum getFunctionalPseudoClasses();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.Parities <em>Parities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parities</em>'.
   * @see nl.dslmeinte.xtext.css.css.Parities
   * @generated
   */
  EEnum getParities();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.Dimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dimensions</em>'.
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @generated
   */
  EEnum getDimensions();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.xtext.css.css.ColorNames <em>Color Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color Names</em>'.
   * @see nl.dslmeinte.xtext.css.css.ColorNames
   * @generated
   */
  EEnum getColorNames();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssFactory getCssFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.StylesheetImpl <em>Stylesheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.StylesheetImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStylesheet()
     * @generated
     */
    EClass STYLESHEET = eINSTANCE.getStylesheet();

    /**
     * The meta object literal for the '<em><b>Char Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLESHEET__CHAR_SET = eINSTANCE.getStylesheet_CharSet();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__IMPORTS = eINSTANCE.getStylesheet_Imports();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__STATEMENTS = eINSTANCE.getStylesheet_Statements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.CSSTopLevelStatementImpl <em>CSS Top Level Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.CSSTopLevelStatementImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCSSTopLevelStatement()
     * @generated
     */
    EClass CSS_TOP_LEVEL_STATEMENT = eINSTANCE.getCSSTopLevelStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.CSSOtherTopLevelDeclarationImpl <em>CSS Other Top Level Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.CSSOtherTopLevelDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCSSOtherTopLevelDeclaration()
     * @generated
     */
    EClass CSS_OTHER_TOP_LEVEL_DECLARATION = eINSTANCE.getCSSOtherTopLevelDeclaration();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ImportDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__IMPORT_URI = eINSTANCE.getImportDeclaration_ImportURI();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__URL = eINSTANCE.getImportDeclaration_Url();

    /**
     * The meta object literal for the '<em><b>Media</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__MEDIA = eINSTANCE.getImportDeclaration_Media();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl <em>Media Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaDeclaration()
     * @generated
     */
    EClass MEDIA_DECLARATION = eINSTANCE.getMediaDeclaration();

    /**
     * The meta object literal for the '<em><b>Media Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA_DECLARATION__MEDIA_QUERIES = eINSTANCE.getMediaDeclaration_MediaQueries();

    /**
     * The meta object literal for the '<em><b>Media</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA_DECLARATION__MEDIA = eINSTANCE.getMediaDeclaration_Media();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA_DECLARATION__MEMBERS = eINSTANCE.getMediaDeclaration_Members();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationMembersImpl <em>Media Declaration Members</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.MediaDeclarationMembersImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaDeclarationMembers()
     * @generated
     */
    EClass MEDIA_DECLARATION_MEMBERS = eINSTANCE.getMediaDeclarationMembers();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl <em>Media Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaQuery()
     * @generated
     */
    EClass MEDIA_QUERY = eINSTANCE.getMediaQuery();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA_QUERY__ONLY = eINSTANCE.getMediaQuery_Only();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA_QUERY__NOT = eINSTANCE.getMediaQuery_Not();

    /**
     * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA_QUERY__MEDIA_TYPE = eINSTANCE.getMediaQuery_MediaType();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA_QUERY__EXPRESSIONS = eINSTANCE.getMediaQuery_Expressions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryExpressionImpl <em>Media Query Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.MediaQueryExpressionImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getMediaQueryExpression()
     * @generated
     */
    EClass MEDIA_QUERY_EXPRESSION = eINSTANCE.getMediaQueryExpression();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA_QUERY_EXPRESSION__FEATURE = eINSTANCE.getMediaQueryExpression_Feature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA_QUERY_EXPRESSION__EXPRESSION = eINSTANCE.getMediaQueryExpression_Expression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PageDeclarationImpl <em>Page Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PageDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPageDeclaration()
     * @generated
     */
    EClass PAGE_DECLARATION = eINSTANCE.getPageDeclaration();

    /**
     * The meta object literal for the '<em><b>Pseudo Page</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_DECLARATION__PSEUDO_PAGE = eINSTANCE.getPageDeclaration_PseudoPage();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_DECLARATION__BODY = eINSTANCE.getPageDeclaration_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NamespaceDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamespaceDeclaration()
     * @generated
     */
    EClass NAMESPACE_DECLARATION = eINSTANCE.getNamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECLARATION__NAME = eINSTANCE.getNamespaceDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECLARATION__URL = eINSTANCE.getNamespaceDeclaration_Url();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.FontFaceDeclarationImpl <em>Font Face Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.FontFaceDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFontFaceDeclaration()
     * @generated
     */
    EClass FONT_FACE_DECLARATION = eINSTANCE.getFontFaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_FACE_DECLARATION__BODY = eINSTANCE.getFontFaceDeclaration_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.RuleSetImpl <em>Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.RuleSetImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRuleSet()
     * @generated
     */
    EClass RULE_SET = eINSTANCE.getRuleSet();

    /**
     * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__SELECTORS = eINSTANCE.getRuleSet_Selectors();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__BODY = eINSTANCE.getRuleSet_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.RuleSetBodyImpl <em>Rule Set Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.RuleSetBodyImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRuleSetBody()
     * @generated
     */
    EClass RULE_SET_BODY = eINSTANCE.getRuleSetBody();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET_BODY__DECLARATIONS = eINSTANCE.getRuleSetBody_Declarations();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PropertyDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyDeclaration()
     * @generated
     */
    EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Values Lists</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DECLARATION__VALUES_LISTS = eINSTANCE.getPropertyDeclaration_ValuesLists();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.KnownPropertyDeclarationImpl <em>Known Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.KnownPropertyDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getKnownPropertyDeclaration()
     * @generated
     */
    EClass KNOWN_PROPERTY_DECLARATION = eINSTANCE.getKnownPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNOWN_PROPERTY_DECLARATION__NAME = eINSTANCE.getKnownPropertyDeclaration_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.UnrecognizedPropertyDeclarationImpl <em>Unrecognized Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.UnrecognizedPropertyDeclarationImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUnrecognizedPropertyDeclaration()
     * @generated
     */
    EClass UNRECOGNIZED_PROPERTY_DECLARATION = eINSTANCE.getUnrecognizedPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNRECOGNIZED_PROPERTY_DECLARATION__NAME = eINSTANCE.getUnrecognizedPropertyDeclaration_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValuesListsImpl <em>Property Values Lists</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PropertyValuesListsImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValuesLists()
     * @generated
     */
    EClass PROPERTY_VALUES_LISTS = eINSTANCE.getPropertyValuesLists();

    /**
     * The meta object literal for the '<em><b>Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUES_LISTS__LISTS = eINSTANCE.getPropertyValuesLists_Lists();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValuesListImpl <em>Property Values List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PropertyValuesListImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValuesList()
     * @generated
     */
    EClass PROPERTY_VALUES_LIST = eINSTANCE.getPropertyValuesList();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUES_LIST__VALUES = eINSTANCE.getPropertyValuesList_Values();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PropertyValueImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Important</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_VALUE__IMPORTANT = eINSTANCE.getPropertyValue_Important();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.SelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorImpl <em>Simple Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.SimpleSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSimpleSelector()
     * @generated
     */
    EClass SIMPLE_SELECTOR = eINSTANCE.getSimpleSelector();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.TypeSelectorImpl <em>Type Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.TypeSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getTypeSelector()
     * @generated
     */
    EClass TYPE_SELECTOR = eINSTANCE.getTypeSelector();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SELECTOR__NAMESPACE_PREFIX = eINSTANCE.getTypeSelector_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SELECTOR__TYPE = eINSTANCE.getTypeSelector_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NamespacePrefixImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamespacePrefix()
     * @generated
     */
    EClass NAMESPACE_PREFIX = eINSTANCE.getNamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_PREFIX__NAMESPACE = eINSTANCE.getNamespacePrefix_Namespace();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.UniversalSelectorImpl <em>Universal Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.UniversalSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUniversalSelector()
     * @generated
     */
    EClass UNIVERSAL_SELECTOR = eINSTANCE.getUniversalSelector();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIVERSAL_SELECTOR__NAMESPACE_PREFIX = eINSTANCE.getUniversalSelector_NamespacePrefix();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeSelector()
     * @generated
     */
    EClass ATTRIBUTE_SELECTOR = eINSTANCE.getAttributeSelector();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_SELECTOR__ATTRIBUTE = eINSTANCE.getAttributeSelector_Attribute();

    /**
     * The meta object literal for the '<em><b>Matcher</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_SELECTOR__MATCHER = eINSTANCE.getAttributeSelector_Matcher();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_SELECTOR__VALUE = eINSTANCE.getAttributeSelector_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.AttributeImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__NAMESPACE_PREFIX = eINSTANCE.getAttribute_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.AttributeValueLiteralImpl <em>Attribute Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.AttributeValueLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeValueLiteral()
     * @generated
     */
    EClass ATTRIBUTE_VALUE_LITERAL = eINSTANCE.getAttributeValueLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.IDSelectorImpl <em>ID Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.IDSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIDSelector()
     * @generated
     */
    EClass ID_SELECTOR = eINSTANCE.getIDSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_SELECTOR__NAME = eINSTANCE.getIDSelector_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ClassSelectorImpl <em>Class Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ClassSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getClassSelector()
     * @generated
     */
    EClass CLASS_SELECTOR = eINSTANCE.getClassSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_SELECTOR__NAME = eINSTANCE.getClassSelector_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PseudoSelectorImpl <em>Pseudo Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PseudoSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoSelector()
     * @generated
     */
    EClass PSEUDO_SELECTOR = eINSTANCE.getPseudoSelector();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NoArgsPseudoClassSelectorImpl <em>No Args Pseudo Class Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NoArgsPseudoClassSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNoArgsPseudoClassSelector()
     * @generated
     */
    EClass NO_ARGS_PSEUDO_CLASS_SELECTOR = eINSTANCE.getNoArgsPseudoClassSelector();

    /**
     * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO = eINSTANCE.getNoArgsPseudoClassSelector_Pseudo();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl <em>Pseudo Element Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoElementSelector()
     * @generated
     */
    EClass PSEUDO_ELEMENT_SELECTOR = eINSTANCE.getPseudoElementSelector();

    /**
     * The meta object literal for the '<em><b>Double Semi Colon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON = eINSTANCE.getPseudoElementSelector_DoubleSemiColon();

    /**
     * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_ELEMENT_SELECTOR__PSEUDO = eINSTANCE.getPseudoElementSelector_Pseudo();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.LanguagePseudoClassSelectorImpl <em>Language Pseudo Class Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.LanguagePseudoClassSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getLanguagePseudoClassSelector()
     * @generated
     */
    EClass LANGUAGE_PSEUDO_CLASS_SELECTOR = eINSTANCE.getLanguagePseudoClassSelector();

    /**
     * The meta object literal for the '<em><b>Langugage Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID = eINSTANCE.getLanguagePseudoClassSelector_LangugageId();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl <em>Functional Pseudo Class Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionalPseudoClassSelector()
     * @generated
     */
    EClass FUNCTIONAL_PSEUDO_CLASS_SELECTOR = eINSTANCE.getFunctionalPseudoClassSelector();

    /**
     * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO = eINSTANCE.getFunctionalPseudoClassSelector_Pseudo();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT = eINSTANCE.getFunctionalPseudoClassSelector_Argument();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.TypeArgumentImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getTypeArgument()
     * @generated
     */
    EClass TYPE_ARGUMENT = eINSTANCE.getTypeArgument();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl <em>Linear Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getLinearArgument()
     * @generated
     */
    EClass LINEAR_ARGUMENT = eINSTANCE.getLinearArgument();

    /**
     * The meta object literal for the '<em><b>Coefficient</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_ARGUMENT__COEFFICIENT = eINSTANCE.getLinearArgument_Coefficient();

    /**
     * The meta object literal for the '<em><b>Constant Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINEAR_ARGUMENT__CONSTANT_SIGN = eINSTANCE.getLinearArgument_ConstantSign();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINEAR_ARGUMENT__CONSTANT = eINSTANCE.getLinearArgument_Constant();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.CoefficientImpl <em>Coefficient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.CoefficientImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getCoefficient()
     * @generated
     */
    EClass COEFFICIENT = eINSTANCE.getCoefficient();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COEFFICIENT__IDENT = eINSTANCE.getCoefficient_Ident();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COEFFICIENT__INT = eINSTANCE.getCoefficient_Int();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ConstantArgumentImpl <em>Constant Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ConstantArgumentImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getConstantArgument()
     * @generated
     */
    EClass CONSTANT_ARGUMENT = eINSTANCE.getConstantArgument();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_ARGUMENT__SIGN = eINSTANCE.getConstantArgument_Sign();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_ARGUMENT__INT = eINSTANCE.getConstantArgument_Int();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ParityArgumentImpl <em>Parity Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ParityArgumentImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getParityArgument()
     * @generated
     */
    EClass PARITY_ARGUMENT = eINSTANCE.getParityArgument();

    /**
     * The meta object literal for the '<em><b>Parity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARITY_ARGUMENT__PARITY = eINSTANCE.getParityArgument_Parity();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NegationSelectorImpl <em>Negation Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NegationSelectorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNegationSelector()
     * @generated
     */
    EClass NEGATION_SELECTOR = eINSTANCE.getNegationSelector();

    /**
     * The meta object literal for the '<em><b>Simple Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION_SELECTOR__SIMPLE_SELECTOR = eINSTANCE.getNegationSelector_SimpleSelector();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ValueLiteralImpl <em>Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ValueLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getValueLiteral()
     * @generated
     */
    EClass VALUE_LITERAL = eINSTANCE.getValueLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NumberLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.SizeLiteralImpl <em>Size Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.SizeLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSizeLiteral()
     * @generated
     */
    EClass SIZE_LITERAL = eINSTANCE.getSizeLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.StringLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ColorLiteralImpl <em>Color Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ColorLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorLiteral()
     * @generated
     */
    EClass COLOR_LITERAL = eINSTANCE.getColorLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentColorLiteralImpl <em>Component Color Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ComponentColorLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentColorLiteral()
     * @generated
     */
    EClass COMPONENT_COLOR_LITERAL = eINSTANCE.getComponentColorLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ColorComponentLiteralImpl <em>Color Component Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ColorComponentLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorComponentLiteral()
     * @generated
     */
    EClass COLOR_COMPONENT_LITERAL = eINSTANCE.getColorComponentLiteral();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_COMPONENT_LITERAL__NUMBER = eINSTANCE.getColorComponentLiteral_Number();

    /**
     * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_COMPONENT_LITERAL__PERCENTAGE = eINSTANCE.getColorComponentLiteral_Percentage();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.URLLiteralImpl <em>URL Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.URLLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getURLLiteral()
     * @generated
     */
    EClass URL_LITERAL = eINSTANCE.getURLLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_LITERAL__VALUE = eINSTANCE.getURLLiteral_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.BareWordLiteralImpl <em>Bare Word Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.BareWordLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getBareWordLiteral()
     * @generated
     */
    EClass BARE_WORD_LITERAL = eINSTANCE.getBareWordLiteral();

    /**
     * The meta object literal for the '<em><b>Bare Word</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BARE_WORD_LITERAL__BARE_WORD = eINSTANCE.getBareWordLiteral_BareWord();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.FunctionCallLiteralImpl <em>Function Call Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.FunctionCallLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionCallLiteral()
     * @generated
     */
    EClass FUNCTION_CALL_LITERAL = eINSTANCE.getFunctionCallLiteral();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL_LITERAL__FUNCTION = eINSTANCE.getFunctionCallLiteral_Function();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_LITERAL__ARGUMENTS = eINSTANCE.getFunctionCallLiteral_Arguments();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.DescendantCombinatorImpl <em>Descendant Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.DescendantCombinatorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDescendantCombinator()
     * @generated
     */
    EClass DESCENDANT_COMBINATOR = eINSTANCE.getDescendantCombinator();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_COMBINATOR__LEFT = eINSTANCE.getDescendantCombinator_Left();

    /**
     * The meta object literal for the '<em><b>Ws I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCENDANT_COMBINATOR__WS_I = eINSTANCE.getDescendantCombinator_WsI();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_COMBINATOR__RIGHT = eINSTANCE.getDescendantCombinator_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl <em>Child Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getChildCombinator()
     * @generated
     */
    EClass CHILD_COMBINATOR = eINSTANCE.getChildCombinator();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_COMBINATOR__LEFT = eINSTANCE.getChildCombinator_Left();

    /**
     * The meta object literal for the '<em><b>Ws L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHILD_COMBINATOR__WS_L = eINSTANCE.getChildCombinator_WsL();

    /**
     * The meta object literal for the '<em><b>Ws R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHILD_COMBINATOR__WS_R = eINSTANCE.getChildCombinator_WsR();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_COMBINATOR__RIGHT = eINSTANCE.getChildCombinator_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.AdjacentSiblingCombinatorImpl <em>Adjacent Sibling Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.AdjacentSiblingCombinatorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAdjacentSiblingCombinator()
     * @generated
     */
    EClass ADJACENT_SIBLING_COMBINATOR = eINSTANCE.getAdjacentSiblingCombinator();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADJACENT_SIBLING_COMBINATOR__LEFT = eINSTANCE.getAdjacentSiblingCombinator_Left();

    /**
     * The meta object literal for the '<em><b>Ws L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJACENT_SIBLING_COMBINATOR__WS_L = eINSTANCE.getAdjacentSiblingCombinator_WsL();

    /**
     * The meta object literal for the '<em><b>Ws R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJACENT_SIBLING_COMBINATOR__WS_R = eINSTANCE.getAdjacentSiblingCombinator_WsR();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADJACENT_SIBLING_COMBINATOR__RIGHT = eINSTANCE.getAdjacentSiblingCombinator_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.GeneralSiblingCombinatorImpl <em>General Sibling Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.GeneralSiblingCombinatorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getGeneralSiblingCombinator()
     * @generated
     */
    EClass GENERAL_SIBLING_COMBINATOR = eINSTANCE.getGeneralSiblingCombinator();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_SIBLING_COMBINATOR__LEFT = eINSTANCE.getGeneralSiblingCombinator_Left();

    /**
     * The meta object literal for the '<em><b>Ws L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERAL_SIBLING_COMBINATOR__WS_L = eINSTANCE.getGeneralSiblingCombinator_WsL();

    /**
     * The meta object literal for the '<em><b>Ws R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERAL_SIBLING_COMBINATOR__WS_R = eINSTANCE.getGeneralSiblingCombinator_WsR();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_SIBLING_COMBINATOR__RIGHT = eINSTANCE.getGeneralSiblingCombinator_Right();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl <em>Simple Selector Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getSimpleSelectorSequence()
     * @generated
     */
    EClass SIMPLE_SELECTOR_SEQUENCE = eINSTANCE.getSimpleSelectorSequence();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR_SEQUENCE__HEAD = eINSTANCE.getSimpleSelectorSequence_Head();

    /**
     * The meta object literal for the '<em><b>Simple Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS = eINSTANCE.getSimpleSelectorSequence_SimpleSelectors();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.UniversalNamespacePrefixImpl <em>Universal Namespace Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.UniversalNamespacePrefixImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getUniversalNamespacePrefix()
     * @generated
     */
    EClass UNIVERSAL_NAMESPACE_PREFIX = eINSTANCE.getUniversalNamespacePrefix();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.WithoutNamespacePrefixImpl <em>Without Namespace Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.WithoutNamespacePrefixImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getWithoutNamespacePrefix()
     * @generated
     */
    EClass WITHOUT_NAMESPACE_PREFIX = eINSTANCE.getWithoutNamespacePrefix();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.StringAttributeValueLiteralImpl <em>String Attribute Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.StringAttributeValueLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getStringAttributeValueLiteral()
     * @generated
     */
    EClass STRING_ATTRIBUTE_VALUE_LITERAL = eINSTANCE.getStringAttributeValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ATTRIBUTE_VALUE_LITERAL__VALUE = eINSTANCE.getStringAttributeValueLiteral_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.IntegerAttributeValueLiteralImpl <em>Integer Attribute Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.IntegerAttributeValueLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIntegerAttributeValueLiteral()
     * @generated
     */
    EClass INTEGER_ATTRIBUTE_VALUE_LITERAL = eINSTANCE.getIntegerAttributeValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ATTRIBUTE_VALUE_LITERAL__VALUE = eINSTANCE.getIntegerAttributeValueLiteral_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.DecimalAttributeValueLiteralImpl <em>Decimal Attribute Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.DecimalAttributeValueLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDecimalAttributeValueLiteral()
     * @generated
     */
    EClass DECIMAL_ATTRIBUTE_VALUE_LITERAL = eINSTANCE.getDecimalAttributeValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_ATTRIBUTE_VALUE_LITERAL__VALUE = eINSTANCE.getDecimalAttributeValueLiteral_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.IntegerLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__INT = eINSTANCE.getIntegerLiteral_Int();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.DecimalLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDecimalLiteral()
     * @generated
     */
    EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

    /**
     * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_LITERAL__DECIMAL = eINSTANCE.getDecimalLiteral_Decimal();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.QuantifiedSizeLiteralImpl <em>Quantified Size Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.QuantifiedSizeLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getQuantifiedSizeLiteral()
     * @generated
     */
    EClass QUANTIFIED_SIZE_LITERAL = eINSTANCE.getQuantifiedSizeLiteral();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_SIZE_LITERAL__NUMBER = eINSTANCE.getQuantifiedSizeLiteral_Number();

    /**
     * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIED_SIZE_LITERAL__DIMENSION = eINSTANCE.getQuantifiedSizeLiteral_Dimension();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.QualifiedSizeLiteralImpl <em>Qualified Size Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.QualifiedSizeLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getQualifiedSizeLiteral()
     * @generated
     */
    EClass QUALIFIED_SIZE_LITERAL = eINSTANCE.getQualifiedSizeLiteral();

    /**
     * The meta object literal for the '<em><b>Bareword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_SIZE_LITERAL__BAREWORD = eINSTANCE.getQualifiedSizeLiteral_Bareword();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl <em>Font Height Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFontHeightLiteral()
     * @generated
     */
    EClass FONT_HEIGHT_LITERAL = eINSTANCE.getFontHeightLiteral();

    /**
     * The meta object literal for the '<em><b>Font Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_HEIGHT_LITERAL__FONT_HEIGHT = eINSTANCE.getFontHeightLiteral_FontHeight();

    /**
     * The meta object literal for the '<em><b>Line Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_HEIGHT_LITERAL__LINE_HEIGHT = eINSTANCE.getFontHeightLiteral_LineHeight();

    /**
     * The meta object literal for the '<em><b>Line Height Dimension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION = eINSTANCE.getFontHeightLiteral_LineHeightDimension();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.RGBColorImpl <em>RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.RGBColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getRGBColor()
     * @generated
     */
    EClass RGB_COLOR = eINSTANCE.getRGBColor();

    /**
     * The meta object literal for the '<em><b>Rgb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__RGB = eINSTANCE.getRGBColor_Rgb();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.NamedColorImpl <em>Named Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.NamedColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNamedColor()
     * @generated
     */
    EClass NAMED_COLOR = eINSTANCE.getNamedColor();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_COLOR__COLOR = eINSTANCE.getNamedColor_Color();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl <em>Component RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentRGBColor()
     * @generated
     */
    EClass COMPONENT_RGB_COLOR = eINSTANCE.getComponentRGBColor();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_COLOR__RED = eINSTANCE.getComponentRGBColor_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_COLOR__GREEN = eINSTANCE.getComponentRGBColor_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_COLOR__BLUE = eINSTANCE.getComponentRGBColor_Blue();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBAlphaColorImpl <em>Component RGB Alpha Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ComponentRGBAlphaColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentRGBAlphaColor()
     * @generated
     */
    EClass COMPONENT_RGB_ALPHA_COLOR = eINSTANCE.getComponentRGBAlphaColor();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_ALPHA_COLOR__RED = eINSTANCE.getComponentRGBAlphaColor_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_ALPHA_COLOR__GREEN = eINSTANCE.getComponentRGBAlphaColor_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_ALPHA_COLOR__BLUE = eINSTANCE.getComponentRGBAlphaColor_Blue();

    /**
     * The meta object literal for the '<em><b>Opacity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_RGB_ALPHA_COLOR__OPACITY = eINSTANCE.getComponentRGBAlphaColor_Opacity();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLColorImpl <em>Component HSL Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ComponentHSLColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentHSLColor()
     * @generated
     */
    EClass COMPONENT_HSL_COLOR = eINSTANCE.getComponentHSLColor();

    /**
     * The meta object literal for the '<em><b>Hue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_COLOR__HUE = eINSTANCE.getComponentHSLColor_Hue();

    /**
     * The meta object literal for the '<em><b>Saturation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_COLOR__SATURATION = eINSTANCE.getComponentHSLColor_Saturation();

    /**
     * The meta object literal for the '<em><b>Lightness</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_COLOR__LIGHTNESS = eINSTANCE.getComponentHSLColor_Lightness();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl <em>Component HSL Alpha Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getComponentHSLAlphaColor()
     * @generated
     */
    EClass COMPONENT_HSL_ALPHA_COLOR = eINSTANCE.getComponentHSLAlphaColor();

    /**
     * The meta object literal for the '<em><b>Hue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_ALPHA_COLOR__HUE = eINSTANCE.getComponentHSLAlphaColor_Hue();

    /**
     * The meta object literal for the '<em><b>Saturation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_ALPHA_COLOR__SATURATION = eINSTANCE.getComponentHSLAlphaColor_Saturation();

    /**
     * The meta object literal for the '<em><b>Lightness</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS = eINSTANCE.getComponentHSLAlphaColor_Lightness();

    /**
     * The meta object literal for the '<em><b>Opacity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_HSL_ALPHA_COLOR__OPACITY = eINSTANCE.getComponentHSLAlphaColor_Opacity();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.impl.AlphaLiteralImpl <em>Alpha Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.impl.AlphaLiteralImpl
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAlphaLiteral()
     * @generated
     */
    EClass ALPHA_LITERAL = eINSTANCE.getAlphaLiteral();

    /**
     * The meta object literal for the '<em><b>Opacity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALPHA_LITERAL__OPACITY = eINSTANCE.getAlphaLiteral_Opacity();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.KnownProperties <em>Known Properties</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.KnownProperties
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getKnownProperties()
     * @generated
     */
    EEnum KNOWN_PROPERTIES = eINSTANCE.getKnownProperties();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers <em>Attribute Selector Matchers</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getAttributeSelectorMatchers()
     * @generated
     */
    EEnum ATTRIBUTE_SELECTOR_MATCHERS = eINSTANCE.getAttributeSelectorMatchers();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudos <em>No Args Pseudos</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.NoArgsPseudos
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getNoArgsPseudos()
     * @generated
     */
    EEnum NO_ARGS_PSEUDOS = eINSTANCE.getNoArgsPseudos();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.PseudoElements <em>Pseudo Elements</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.PseudoElements
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getPseudoElements()
     * @generated
     */
    EEnum PSEUDO_ELEMENTS = eINSTANCE.getPseudoElements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses <em>Functional Pseudo Classes</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getFunctionalPseudoClasses()
     * @generated
     */
    EEnum FUNCTIONAL_PSEUDO_CLASSES = eINSTANCE.getFunctionalPseudoClasses();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.Parities <em>Parities</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.Parities
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getParities()
     * @generated
     */
    EEnum PARITIES = eINSTANCE.getParities();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.Dimensions <em>Dimensions</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.Dimensions
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getDimensions()
     * @generated
     */
    EEnum DIMENSIONS = eINSTANCE.getDimensions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.xtext.css.css.ColorNames <em>Color Names</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.xtext.css.css.ColorNames
     * @see nl.dslmeinte.xtext.css.css.impl.CssPackageImpl#getColorNames()
     * @generated
     */
    EEnum COLOR_NAMES = eINSTANCE.getColorNames();

  }

} //CssPackage
