/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.NoArgsPseudos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Args Pseudo Class Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.NoArgsPseudoClassSelectorImpl#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoArgsPseudoClassSelectorImpl extends PseudoSelectorImpl implements NoArgsPseudoClassSelector
{
  /**
   * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected static final NoArgsPseudos PSEUDO_EDEFAULT = NoArgsPseudos.LINK;

  /**
   * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected NoArgsPseudos pseudo = PSEUDO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoArgsPseudoClassSelectorImpl()
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
    return CssPackage.Literals.NO_ARGS_PSEUDO_CLASS_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoArgsPseudos getPseudo()
  {
    return pseudo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPseudo(NoArgsPseudos newPseudo)
  {
    NoArgsPseudos oldPseudo = pseudo;
    pseudo = newPseudo == null ? PSEUDO_EDEFAULT : newPseudo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO, oldPseudo, pseudo));
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
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO:
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
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO:
        setPseudo((NoArgsPseudos)newValue);
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
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO:
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
      case CssPackage.NO_ARGS_PSEUDO_CLASS_SELECTOR__PSEUDO:
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
    result.append(" (pseudo: ");
    result.append(pseudo);
    result.append(')');
    return result.toString();
  }

} //NoArgsPseudoClassSelectorImpl
