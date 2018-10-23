/**
 */
package instumentationModel.impl;

import instumentationModel.InstumentationModelPackage;
import instumentationModel.Probe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instumentationModel.impl.ProbeImpl#getProbeId <em>Probe Id</em>}</li>
 *   <li>{@link instumentationModel.impl.ProbeImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link instumentationModel.impl.ProbeImpl#getProbeType <em>Probe Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbeImpl extends MinimalEObjectImpl.Container implements Probe {
	/**
	 * The default value of the '{@link #getProbeId() <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbeId() <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeId()
	 * @generated
	 * @ordered
	 */
	protected String probeId = PROBE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean activated = ACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbeType() <em>Probe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbeType() <em>Probe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeType()
	 * @generated
	 * @ordered
	 */
	protected String probeType = PROBE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstumentationModelPackage.Literals.PROBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbeId() {
		return probeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeId(String newProbeId) {
		String oldProbeId = probeId;
		probeId = newProbeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstumentationModelPackage.PROBE__PROBE_ID,
					oldProbeId, probeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		boolean oldActivated = activated;
		activated = newActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstumentationModelPackage.PROBE__ACTIVATED,
					oldActivated, activated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbeType() {
		return probeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeType(String newProbeType) {
		String oldProbeType = probeType;
		probeType = newProbeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstumentationModelPackage.PROBE__PROBE_TYPE,
					oldProbeType, probeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InstumentationModelPackage.PROBE__PROBE_ID:
			return getProbeId();
		case InstumentationModelPackage.PROBE__ACTIVATED:
			return isActivated();
		case InstumentationModelPackage.PROBE__PROBE_TYPE:
			return getProbeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InstumentationModelPackage.PROBE__PROBE_ID:
			setProbeId((String) newValue);
			return;
		case InstumentationModelPackage.PROBE__ACTIVATED:
			setActivated((Boolean) newValue);
			return;
		case InstumentationModelPackage.PROBE__PROBE_TYPE:
			setProbeType((String) newValue);
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
		case InstumentationModelPackage.PROBE__PROBE_ID:
			setProbeId(PROBE_ID_EDEFAULT);
			return;
		case InstumentationModelPackage.PROBE__ACTIVATED:
			setActivated(ACTIVATED_EDEFAULT);
			return;
		case InstumentationModelPackage.PROBE__PROBE_TYPE:
			setProbeType(PROBE_TYPE_EDEFAULT);
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
		case InstumentationModelPackage.PROBE__PROBE_ID:
			return PROBE_ID_EDEFAULT == null ? probeId != null : !PROBE_ID_EDEFAULT.equals(probeId);
		case InstumentationModelPackage.PROBE__ACTIVATED:
			return activated != ACTIVATED_EDEFAULT;
		case InstumentationModelPackage.PROBE__PROBE_TYPE:
			return PROBE_TYPE_EDEFAULT == null ? probeType != null : !PROBE_TYPE_EDEFAULT.equals(probeType);
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
		result.append(" (probeId: ");
		result.append(probeId);
		result.append(", activated: ");
		result.append(activated);
		result.append(", probeType: ");
		result.append(probeType);
		result.append(')');
		return result.toString();
	}

} //ProbeImpl
