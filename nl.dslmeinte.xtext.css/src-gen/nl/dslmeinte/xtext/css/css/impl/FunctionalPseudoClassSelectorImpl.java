/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector;
import nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses;
import nl.dslmeinte.xtext.css.css.TypeArgument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Pseudo Class Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.FunctionalPseudoClassSelectorImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalPseudoClassSelectorImpl extends PseudoSelectorImpl implements FunctionalPseudoClassSelector
{
  /**
   * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected static final FunctionalPseudoClasses PSEUDO_EDEFAULT = FunctionalPseudoClasses.NTH_CHILD;

  /**
   * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected FunctionalPseudoClasses pseudo = PSEUDO_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected TypeArgument argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionalPseudoClassSelectorImpl()
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
    return CssPackage.Literals.FUNCTIONAL_PSEUDO_CLASS_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalPseudoClasses getPseudo()
  {
    return pseudo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPseudo(FunctionalPseudoClasses newPseudo)
  {
    FunctionalPseudoClasses oldPseudo = pseudo;
    pseudo = newPseudo == null ? PSEUDO_EDEFAULT : newPseudo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO, oldPseudo, pseudo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArgument getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(TypeArgument newArgument, NotificationChain msgs)
  {
    TypeArgument oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(TypeArgument newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT, newArgument, newArgument));
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
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT:
        return basicSetArgument(null, msgs);
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
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO:
        return getPseudo();
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT:
        return getArgument();
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
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO:
        setPseudo((FunctionalPseudoClasses)newValue);
        return;
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT:
        setArgument((TypeArgument)newValue);
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
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO:
        setPseudo(PSEUDO_EDEFAULT);
        return;
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT:
        setArgument((TypeArgument)null);
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
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__PSEUDO:
        return pseudo != PSEUDO_EDEFAULT;
      case CssPackage.FUNCTIONAL_PSEUDO_CLASS_SELECTOR__ARGUMENT:
        return argument != null;
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

} //FunctionalPseudoClassSelectorImpl
