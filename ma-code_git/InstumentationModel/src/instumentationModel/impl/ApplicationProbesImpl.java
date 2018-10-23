/**
 */
package instumentationModel.impl;

import instumentationModel.ApplicationProbes;
import instumentationModel.InstumentationModelPackage;
import instumentationModel.Probe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Probes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instumentationModel.impl.ApplicationProbesImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link instumentationModel.impl.ApplicationProbesImpl#getProbe <em>Probe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationProbesImpl extends MinimalEObjectImpl.Container implements ApplicationProbes {
	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProbe() <em>Probe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbe()
	 * @generated
	 * @ordered
	 */
	protected EList<Probe> probe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationProbesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstumentationModelPackage.Literals.APPLICATION_PROBES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InstumentationModelPackage.APPLICATION_PROBES__APPLICATION_NAME, oldApplicationName,
					applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Probe> getProbe() {
		if (probe == null) {
			probe = new EObjectResolvingEList<Probe>(Probe.class, this,
					InstumentationModelPackage.APPLICATION_PROBES__PROBE);
		}
		return probe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InstumentationModelPackage.APPLICATION_PROBES__APPLICATION_NAME:
			return getApplicationName();
		case InstumentationModelPackage.APPLICATION_PROBES__PROBE:
			return getProbe();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InstumentationModelPackage.APPLICATION_PROBES__APPLICATION_NAME:
			setApplicationName((String) newValue);
			return;
		case InstumentationModelPackage.APPLICATION_PROBES__PROBE:
			getProbe().clear();
			getProbe().addAll((Collection<? extends Probe>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case InstumentationModelPackage.APPLICATION_PROBES__APPLICATION_NAME:
			setApplicationName(APPLICATION_NAME_EDEFAULT);
			return;
		case InstumentationModelPackage.APPLICATION_PROBES__PROBE:
			getProbe().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InstumentationModelPackage.APPLICATION_PROBES__APPLICATION_NAME:
			return APPLICATION_NAME_EDEFAULT == null ? applicationName != null
					: !APPLICATION_NAME_EDEFAULT.equals(applicationName);
		case InstumentationModelPackage.APPLICATION_PROBES__PROBE:
			return probe != null && !probe.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //ApplicationProbesImpl
