/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.BareWordLiteral;
import nl.dslmeinte.xtext.css.css.CssPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bare Word Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.BareWordLiteralImpl#getBareWord <em>Bare Word</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BareWordLiteralImpl extends MinimalEObjectImpl.Container implements BareWordLiteral
{
  /**
   * The default value of the '{@link #getBareWord() <em>Bare Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBareWord()
   * @generated
   * @ordered
   */
  protected static final String BARE_WORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBareWord() <em>Bare Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBareWord()
   * @generated
   * @ordered
   */
  protected String bareWord = BARE_WORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BareWordLiteralImpl()
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
    return CssPackage.Literals.BARE_WORD_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBareWord()
  {
    return bareWord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBareWord(String newBareWord)
  {
    String oldBareWord = bareWord;
    bareWord = newBareWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.BARE_WORD_LITERAL__BARE_WORD, oldBareWord, bareWord));
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
      case CssPackage.BARE_WORD_LITERAL__BARE_WORD:
        return getBareWord();
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
      case CssPackage.BARE_WORD_LITERAL__BARE_WORD:
        setBareWord((String)newValue);
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
      case CssPackage.BARE_WORD_LITERAL__BARE_WORD:
        setBareWord(BARE_WORD_EDEFAULT);
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
      case CssPackage.BARE_WORD_LITERAL__BARE_WORD:
        return BARE_WORD_EDEFAULT == null ? bareWord != null : !BARE_WORD_EDEFAULT.equals(bareWord);
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
    result.append(" (bareWord: ");
    result.append(bareWord);
    result.append(')');
    return result.toString();
  }

} //BareWordLiteralImpl
