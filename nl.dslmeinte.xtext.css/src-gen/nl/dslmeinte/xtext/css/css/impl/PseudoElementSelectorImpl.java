/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.PseudoElementSelector;
import nl.dslmeinte.xtext.css.css.PseudoElements;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo Element Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl#isDoubleSemiColon <em>Double Semi Colon</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.PseudoElementSelectorImpl#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PseudoElementSelectorImpl extends PseudoSelectorImpl implements PseudoElementSelector
{
  /**
   * The default value of the '{@link #isDoubleSemiColon() <em>Double Semi Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDoubleSemiColon()
   * @generated
   * @ordered
   */
  protected static final boolean DOUBLE_SEMI_COLON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDoubleSemiColon() <em>Double Semi Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDoubleSemiColon()
   * @generated
   * @ordered
   */
  protected boolean doubleSemiColon = DOUBLE_SEMI_COLON_EDEFAULT;

  /**
   * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected static final PseudoElements PSEUDO_EDEFAULT = PseudoElements.FIRST_LETTER;

  /**
   * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected PseudoElements pseudo = PSEUDO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PseudoElementSelectorImpl()
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
    return CssPackage.Literals.PSEUDO_ELEMENT_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDoubleSemiColon()
  {
    return doubleSemiColon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoubleSemiColon(boolean newDoubleSemiColon)
  {
    boolean oldDoubleSemiColon = doubleSemiColon;
    doubleSemiColon = newDoubleSemiColon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON, oldDoubleSemiColon, doubleSemiColon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoElements getPseudo()
  {
    return pseudo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPseudo(PseudoElements newPseudo)
  {
    PseudoElements oldPseudo = pseudo;
    pseudo = newPseudo == null ? PSEUDO_EDEFAULT : newPseudo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.PSEUDO_ELEMENT_SELECTOR__PSEUDO, oldPseudo, pseudo));
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
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON:
        return isDoubleSemiColon();
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__PSEUDO:
        return getPseudo();
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
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON:
        setDoubleSemiColon((Boolean)newValue);
        return;
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__PSEUDO:
        setPseudo((PseudoElements)newValue);
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
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON:
        setDoubleSemiColon(DOUBLE_SEMI_COLON_EDEFAULT);
        return;
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__PSEUDO:
        setPseudo(PSEUDO_EDEFAULT);
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
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__DOUBLE_SEMI_COLON:
        return doubleSemiColon != DOUBLE_SEMI_COLON_EDEFAULT;
      case CssPackage.PSEUDO_ELEMENT_SELECTOR__PSEUDO:
        return pseudo != PSEUDO_EDEFAULT;
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
    result.append(" (doubleSemiColon: ");
    result.append(doubleSemiColon);
    result.append(", pseudo: ");
    result.append(pseudo);
    result.append(')');
    return result.toString();
  }

} //PseudoElementSelectorImpl
