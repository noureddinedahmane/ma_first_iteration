package org.code.instrumentation;

import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.resource.JaMoPPUtil;
import org.emftext.language.java.resource.java.IJavaLocationMap;
import org.emftext.language.java.resource.java.mopp.JavaResource;
import org.emftext.language.java.statements.Statement;

public class CodeInstrumentationUtil {

	public static ConcreteClassifier findConcreteClassifierWithName(CompilationUnit compilationUnit, 
									 String concreteClassifierName ) {
		ConcreteClassifier concreteClassifier = null;
		for(ConcreteClassifier cClassifier: compilationUnit.getClassifiers()) {
			if(cClassifier.getName().equals(concreteClassifierName)) {
				concreteClassifier  = cClassifier;
				break;
			}
		}
		
		return concreteClassifier;
	}
	
	
	public static Method findMethodByName(ConcreteClassifier concreteClassifier, String methodName) {
		Method method = null;
		for(Method m: concreteClassifier.getMethods()) {
			if(m.getName().equals(methodName)) {
				method = m;
				break;
			}
		}
		return method;
	}
	
	
	public static boolean compareStatements(Statement firstStatement, Statement secondStatement) {
		
		/**
		 * to compare two eobjects, the emf camapre can be used 
		 * we should create a Matching strategy that defines if two eobjects are matched
		 * for the moment the statement will be compared based on type and the location in compilation unit
		 */
		
		if(firstStatement.getClass().equals(secondStatement.getClass())) {
			int i = getStatementLocation(firstStatement);
			int j = getStatementLocation(secondStatement);
			if(getStatementLocation(firstStatement) == getStatementLocation(secondStatement)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
			
			
	}
	
	private static int getStatementLocation(Statement s) {
		 Resource resource = s.eResource(); 
		 JavaResource textResource = (JavaResource) resource;
		 IJavaLocationMap locationMap = textResource.getLocationMap();										
		 return locationMap.getLine(s);	
		 
	}
	
	
	public static EObject copyJaMoPPCompilationUnit(EObject eobjectToCpy) {
		JaMoPPUtil.initialize();
		EObject eobjCopy = EcoreUtil.copy(eobjectToCpy);
		URI uri = URI.createURI("test.java");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.createResource(uri);
		res.getContents().add(eobjCopy);
		return eobjCopy;
	}
	
	
	public static String getUUID() {
		 UUID uuid = UUID.randomUUID();
		 return uuid.toString();
	}
	
	
	
}
