package code.instrumentation.test;

import static org.junit.Assert.assertTrue;

import org.code.instrumentation.cloneproject.CloneProject;
import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

public class CloneProjectTest {
	
	final static String originalProjectName = "Test";
	final static String clonedProjectName = "Test_instrumentation";

	@Test
	public void cloneProjectTest() throws CoreException {
		
		// delete the project copy if already exists
		CloneProject.deleteProject(clonedProjectName);
		
		// clone the project
		CloneProject.copyProject(originalProjectName);
		
		//
		assertTrue(CloneProject.existProject(clonedProjectName));

	}
}
