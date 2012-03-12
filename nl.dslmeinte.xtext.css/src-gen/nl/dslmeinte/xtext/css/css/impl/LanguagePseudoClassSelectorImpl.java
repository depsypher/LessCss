/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.LanguagePseudoClassSelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Pseudo Class Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.LanguagePseudoClassSelectorImpl#getLangugageId <em>Langugage Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguagePseudoClassSelectorImpl extends PseudoSelectorImpl implements LanguagePseudoClassSelector
{
  /**
   * The default value of the '{@link #getLangugageId() <em>Langugage Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangugageId()
   * @generated
   * @ordered
   */
  protected static final String LANGUGAGE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLangugageId() <em>Langugage Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangugageId()
   * @generated
   * @ordered
   */
  protected String langugageId = LANGUGAGE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LanguagePseudoClassSelectorImpl()
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
    return CssPackage.Literals.LANGUAGE_PSEUDO_CLASS_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLangugageId()
  {
    return langugageId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLangugageId(String newLangugageId)
  {
    String oldLangugageId = langugageId;
    langugageId = newLangugageId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID, oldLangugageId, langugageId));
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
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID:
        return getLangugageId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID:
        setLangugageId((String)newValue);
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
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID:
        setLangugageId(LANGUGAGE_ID_EDEFAULT);
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
      case CssPackage.LANGUAGE_PSEUDO_CLASS_SELECTOR__LANGUGAGE_ID:
        return LANGUGAGE_ID_EDEFAULT == null ? langugageId != null : !LANGUGAGE_ID_EDEFAULT.equals(langugageId);
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
    result.append(" (langugageId: ");
    result.append(langugageId);
    result.append(')');
    return result.toString();
  }

} //LanguagePseudoClassSelectorImpl
