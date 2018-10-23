/**
 */
package instumentationModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see instumentationModel.InstumentationModelFactory
 * @model kind="package"
 * @generated
 */
public interface InstumentationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instumentationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/instumentationModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instumentationModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstumentationModelPackage eINSTANCE = instumentationModel.impl.InstumentationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link instumentationModel.impl.ProbeImpl <em>Probe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instumentationModel.impl.ProbeImpl
	 * @see instumentationModel.impl.InstumentationModelPackageImpl#getProbe()
	 * @generated
	 */
	int PROBE = 0;

	/**
	 * The feature id for the '<em><b>Probe Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__PROBE_ID = 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__ACTIVATED = 1;

	/**
	 * The feature id for the '<em><b>Probe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__PROBE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instumentationModel.impl.ApplicationProbesImpl <em>Application Probes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instumentationModel.impl.ApplicationProbesImpl
	 * @see instumentationModel.impl.InstumentationModelPackageImpl#getApplicationProbes()
	 * @generated
	 */
	int APPLICATION_PROBES = 1;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROBES__APPLICATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Probe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROBES__PROBE = 1;

	/**
	 * The number of structural features of the '<em>Application Probes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROBES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application Probes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROBES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link instumentationModel.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe</em>'.
	 * @see instumentationModel.Probe
	 * @generated
	 */
	EClass getProbe();

	/**
	 * Returns the meta object for the attribute '{@link instumentationModel.Probe#getProbeId <em>Probe Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Id</em>'.
	 * @see instumentationModel.Probe#getProbeId()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_ProbeId();

	/**
	 * Returns the meta object for the attribute '{@link instumentationModel.Probe#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see instumentationModel.Probe#isActivated()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_Activated();

	/**
	 * Returns the meta object for the attribute '{@link instumentationModel.Probe#getProbeType <em>Probe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Type</em>'.
	 * @see instumentationModel.Probe#getProbeType()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_ProbeType();

	/**
	 * Returns the meta object for class '{@link instumentationModel.ApplicationProbes <em>Application Probes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Probes</em>'.
	 * @see instumentationModel.ApplicationProbes
	 * @generated
	 */
	EClass getApplicationProbes();

	/**
	 * Returns the meta object for the attribute '{@link instumentationModel.ApplicationProbes#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see instumentationModel.ApplicationProbes#getApplicationName()
	 * @see #getApplicationProbes()
	 * @generated
	 */
	EAttribute getApplicationProbes_ApplicationName();

	/**
	 * Returns the meta object for the reference list '{@link instumentationModel.ApplicationProbes#getProbe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Probe</em>'.
	 * @see instumentationModel.ApplicationProbes#getProbe()
	 * @see #getApplicationProbes()
	 * @generated
	 */
	EReference getApplicationProbes_Probe();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstumentationModelFactory getInstumentationModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link instumentationModel.impl.ProbeImpl <em>Probe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instumentationModel.impl.ProbeImpl
		 * @see instumentationModel.impl.InstumentationModelPackageImpl#getProbe()
		 * @generated
		 */
		EClass PROBE = eINSTANCE.getProbe();

		/**
		 * The meta object literal for the '<em><b>Probe Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__PROBE_ID = eINSTANCE.getProbe_ProbeId();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__ACTIVATED = eINSTANCE.getProbe_Activated();

		/**
		 * The meta object literal for the '<em><b>Probe Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__PROBE_TYPE = eINSTANCE.getProbe_ProbeType();

		/**
		 * The meta object literal for the '{@link instumentationModel.impl.ApplicationProbesImpl <em>Application Probes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instumentationModel.impl.ApplicationProbesImpl
		 * @see instumentationModel.impl.InstumentationModelPackageImpl#getApplicationProbes()
		 * @generated
		 */
		EClass APPLICATION_PROBES = eINSTANCE.getApplicationProbes();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_PROBES__APPLICATION_NAME = eINSTANCE.getApplicationProbes_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Probe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROBES__PROBE = eINSTANCE.getApplicationProbes_Probe();

	}

} //InstumentationModelPackage
