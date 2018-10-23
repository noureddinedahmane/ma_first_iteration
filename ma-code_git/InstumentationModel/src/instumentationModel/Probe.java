/**
 */
package instumentationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instumentationModel.Probe#getProbeId <em>Probe Id</em>}</li>
 *   <li>{@link instumentationModel.Probe#isActivated <em>Activated</em>}</li>
 *   <li>{@link instumentationModel.Probe#getProbeType <em>Probe Type</em>}</li>
 * </ul>
 *
 * @see instumentationModel.InstumentationModelPackage#getProbe()
 * @model
 * @generated
 */
public interface Probe extends EObject {
	/**
	 * Returns the value of the '<em><b>Probe Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Id</em>' attribute.
	 * @see #setProbeId(String)
	 * @see instumentationModel.InstumentationModelPackage#getProbe_ProbeId()
	 * @model
	 * @generated
	 */
	String getProbeId();

	/**
	 * Sets the value of the '{@link instumentationModel.Probe#getProbeId <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Id</em>' attribute.
	 * @see #getProbeId()
	 * @generated
	 */
	void setProbeId(String value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see instumentationModel.InstumentationModelPackage#getProbe_Activated()
	 * @model default="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link instumentationModel.Probe#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Probe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Type</em>' attribute.
	 * @see #setProbeType(String)
	 * @see instumentationModel.InstumentationModelPackage#getProbe_ProbeType()
	 * @model
	 * @generated
	 */
	String getProbeType();

	/**
	 * Sets the value of the '{@link instumentationModel.Probe#getProbeType <em>Probe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Type</em>' attribute.
	 * @see #getProbeType()
	 * @generated
	 */
	void setProbeType(String value);

} // Probe
