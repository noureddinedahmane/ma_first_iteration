package org.code.instrumentation.cloneproject;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;;

public class CloneProject {

	public static IProject copyProject(String projectName) throws CoreException {
	    IProgressMonitor monitoring = new NullProgressMonitor();
	    
	    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

	    IProject project = workspaceRoot.getProject(projectName);
	    IProjectDescription projectDescription = project.getDescription();
	    
	    
	    String copyName = projectName + "_instrumentation";
	    
	    // create clone project in workspace
	    IProjectDescription copyDescription = workspaceRoot.getWorkspace().newProjectDescription(copyName);
	    
	    // copy project files
	    project.copy(copyDescription, true, monitoring);
	    IProject clone = workspaceRoot.getProject(copyName);
	    
	    // copy the project properties
	    copyDescription.setNatureIds(projectDescription.getNatureIds());
	    copyDescription.setReferencedProjects(projectDescription.getReferencedProjects());
	    copyDescription.setDynamicReferences(projectDescription.getDynamicReferences());
	    copyDescription.setBuildSpec(projectDescription.getBuildSpec());
	    copyDescription.setReferencedProjects(projectDescription.getReferencedProjects());
	    clone.setDescription(copyDescription, null);
	    
	    return clone;
	}
	
	
	public static void deleteProject(String projectName) throws CoreException {
       IProgressMonitor monitoring = new NullProgressMonitor();
       
	   IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();  
	   for(IProject iProject: workspaceRoot.getProjects()) {
		   if(iProject.getName().equals(projectName)) {
			   iProject.delete(true, monitoring);
		   }
	   }	   	   
	}
	
	
	public static boolean existProject(String projectName) {
		boolean projectExist = false; 
		
	    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();   
	    for(IProject iProject: workspaceRoot.getProjects()) {
		   if(iProject.getName().equals(projectName)) {
			   projectExist = true;
			   break;
		   }
	    }
	    
	    return projectExist;
	}
	
	
	
	
}
