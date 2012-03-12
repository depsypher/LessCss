/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.css.css.CSSTopLevelStatement;
import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.ImportDeclaration;
import nl.dslmeinte.xtext.css.css.Stylesheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.StylesheetImpl#getCharSet <em>Char Set</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.StylesheetImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.StylesheetImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StylesheetImpl extends MinimalEObjectImpl.Container implements Stylesheet
{
  /**
   * The default value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharSet()
   * @generated
   * @ordered
   */
  protected static final String CHAR_SET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharSet()
   * @generated
   * @ordered
   */
  protected String charSet = CHAR_SET_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDeclaration> imports;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<CSSTopLevelStatement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StylesheetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssPackage.Literals.STYLESHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCharSet()
  {
    return charSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharSet(String newCharSet)
  {
    String oldCharSet = charSet;
    charSet = newCharSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.STYLESHEET__CHAR_SET, oldCharSet, charSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDeclaration> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, CssPackage.STYLESHEET__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CSSTopLevelStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<CSSTopLevelStatement>(CSSTopLevelStatement.class, this, CssPackage.STYLESHEET__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssPackage.STYLESHEET__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CssPackage.STYLESHEET__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssPackage.STYLESHEET__CHAR_SET:
        return getCharSet();
      case CssPackage.STYLESHEET__IMPORTS:
        return getImports();
      case CssPackage.STYLESHEET__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssPackage.STYLESHEET__CHAR_SET:
        setCharSet((String)newValue);
        return;
      case CssPackage.STYLESHEET__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
        return;
      case CssPackage.STYLESHEET__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends CSSTopLevelStatement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssPackage.STYLESHEET__CHAR_SET:
        setCharSet(CHAR_SET_EDEFAULT);
        return;
      case CssPackage.STYLESHEET__IMPORTS:
        getImports().clear();
        return;
      case CssPackage.STYLESHEET__STATEMENTS:
        getStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssPackage.STYLESHEET__CHAR_SET:
        return CHAR_SET_EDEFAULT == null ? charSet != null : !CHAR_SET_EDEFAULT.equals(charSet);
      case CssPackage.STYLESHEET__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CssPackage.STYLESHEET__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (charSet: ");
    result.append(charSet);
    result.append(')');
    return result.toString();
  }

} //StylesheetImpl
