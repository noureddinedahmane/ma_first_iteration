/**
 */
package instumentationModel.impl;

import instumentationModel.ApplicationProbes;
import instumentationModel.InstumentationModelFactory;
import instumentationModel.InstumentationModelPackage;
import instumentationModel.Probe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstumentationModelPackageImpl extends EPackageImpl implements InstumentationModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationProbesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see instumentationModel.InstumentationModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstumentationModelPackageImpl() {
		super(eNS_URI, InstumentationModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InstumentationModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstumentationModelPackage init() {
		if (isInited)
			return (InstumentationModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(InstumentationModelPackage.eNS_URI);

		// Obtain or create and register package
		InstumentationModelPackageImpl theInstumentationModelPackage = (InstumentationModelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof InstumentationModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new InstumentationModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theInstumentationModelPackage.createPackageContents();

		// Initialize created meta-data
		theInstumentationModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstumentationModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstumentationModelPackage.eNS_URI, theInstumentationModelPackage);
		return theInstumentationModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbe() {
		return probeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_ProbeId() {
		return (EAttribute) probeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_Activated() {
		return (EAttribute) probeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_ProbeType() {
		return (EAttribute) probeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationProbes() {
		return applicationProbesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProbes_ApplicationName() {
		return (EAttribute) applicationProbesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationProbes_Probe() {
		return (EReference) applicationProbesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstumentationModelFactory getInstumentationModelFactory() {
		return (InstumentationModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		probeEClass = createEClass(PROBE);
		createEAttribute(probeEClass, PROBE__PROBE_ID);
		createEAttribute(probeEClass, PROBE__ACTIVATED);
		createEAttribute(probeEClass, PROBE__PROBE_TYPE);

		applicationProbesEClass = createEClass(APPLICATION_PROBES);
		createEAttribute(applicationProbesEClass, APPLICATION_PROBES__APPLICATION_NAME);
		createEReference(applicationProbesEClass, APPLICATION_PROBES__PROBE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(probeEClass, Probe.class, "Probe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbe_ProbeId(), ecorePackage.getEString(), "probeId", null, 0, 1, Probe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbe_Activated(), ecorePackage.getEBoolean(), "activated", "true", 0, 1, Probe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbe_ProbeType(), ecorePackage.getEString(), "probeType", null, 0, 1, Probe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationProbesEClass, ApplicationProbes.class, "ApplicationProbes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationProbes_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1,
				ApplicationProbes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationProbes_Probe(), this.getProbe(), null, "probe", null, 0, -1,
				ApplicationProbes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InstumentationModelPackageImpl
