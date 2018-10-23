/**
 */
package instumentationModel.impl;

import instumentationModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstumentationModelFactoryImpl extends EFactoryImpl implements InstumentationModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstumentationModelFactory init() {
		try {
			InstumentationModelFactory theInstumentationModelFactory = (InstumentationModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(InstumentationModelPackage.eNS_URI);
			if (theInstumentationModelFactory != null) {
				return theInstumentationModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstumentationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstumentationModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case InstumentationModelPackage.PROBE:
			return createProbe();
		case InstumentationModelPackage.APPLICATION_PROBES:
			return createApplicationProbes();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe createProbe() {
		ProbeImpl probe = new ProbeImpl();
		return probe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationProbes createApplicationProbes() {
		ApplicationProbesImpl applicationProbes = new ApplicationProbesImpl();
		return applicationProbes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstumentationModelPackage getInstumentationModelPackage() {
		return (InstumentationModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstumentationModelPackage getPackage() {
		return InstumentationModelPackage.eINSTANCE;
	}

} //InstumentationModelFactoryImpl
