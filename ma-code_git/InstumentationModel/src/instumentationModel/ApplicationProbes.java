/**
 */
package instumentationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Probes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instumentationModel.ApplicationProbes#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link instumentationModel.ApplicationProbes#getProbe <em>Probe</em>}</li>
 * </ul>
 *
 * @see instumentationModel.InstumentationModelPackage#getApplicationProbes()
 * @model
 * @generated
 */
public interface ApplicationProbes extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see instumentationModel.InstumentationModelPackage#getApplicationProbes_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link instumentationModel.ApplicationProbes#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

	/**
	 * Returns the value of the '<em><b>Probe</b></em>' reference list.
	 * The list contents are of type {@link instumentationModel.Probe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe</em>' reference list.
	 * @see instumentationModel.InstumentationModelPackage#getApplicationProbes_Probe()
	 * @model
	 * @generated
	 */
	EList<Probe> getProbe();

} // ApplicationProbes
