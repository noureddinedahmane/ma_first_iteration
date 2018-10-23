package intrumentation.probe;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.language.java.resource.java.IJavaLocationMap;
import org.emftext.language.java.resource.java.mopp.JavaResource;
import org.emftext.language.java.statements.Statement;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.palladiosimulator.pcm.seff.impl.InternalActionImpl;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

public class InstrumentationProbesHelper {

	public MethodProbes getMethodProbes(SourceCodeDecoratorRepository sourceCodeDecorator, String methodName, String compilationUnitName) {
		MethodProbes methodProbes =  new MethodProbes();
		
		methodProbes.setCompilationUnitName(compilationUnitName);
		methodProbes.setMethodName(methodName);
		 
		List<SeffElementSourceCodeLink> seffElementSourceCodeLinks = sourceCodeDecorator.getSeffElementsSourceCodeLinks();
		for(SeffElementSourceCodeLink seffElementSourceCodeLink: seffElementSourceCodeLinks) {
			 String actionType = "";
			 int startOffset = -1;
			 int endOffset = -1;
			
			 
			 if(seffElementSourceCodeLink.getSeffElement() instanceof InternalAction) {
				 actionType = "InternalAction";
			 }
			 if(seffElementSourceCodeLink.getSeffElement() instanceof LoopAction) {
				 actionType = "LoopAction";
			 }
			 if(seffElementSourceCodeLink.getSeffElement() instanceof BranchAction) {
				 actionType = "BranchAction";
			 }
				
			 // get startOffset and endOffset corresponding to action
			 List<Statement> correspondingStatements = seffElementSourceCodeLink.getStatement();
			 if (correspondingStatements.size() != 0) {
				 
				 Statement startStatement = correspondingStatements.get(0);
				 Statement endStatement = correspondingStatements.get(correspondingStatements.size() - 1);
				 
				 startOffset = this.getStatementLocation(startStatement);
				 endOffset = this.getStatementLocation(endStatement);
				 
				 
			 }		 
			 
			 // add the action params to method probes
			 Probe newProbe =  new Probe();
			 newProbe.setActionType(actionType);
			 newProbe.setStartOffset(startOffset);
			 newProbe.setEndOffset(endOffset);
			 
			 methodProbes.getMethodProbes().add(newProbe);

		}
		
		
		return methodProbes;
	}
	
	
	private int getStatementLocation(Statement s) {
		 Resource resource = s.eResource(); 
		 JavaResource textResource = (JavaResource) resource;
		 IJavaLocationMap locationMap = textResource.getLocationMap();										
		 return locationMap.getLine(s);	
		 
	}
	
	public void print(MethodProbes methodProbes) {
	
		System.out.println("Starting......");
		System.out.println("-- CompilationUnitName: " + methodProbes.getCompilationUnitName());
		System.out.println("-- MethodName: " + methodProbes.getMethodName());
		for(Probe p: methodProbes.getMethodProbes()) {
			System.out.println("---> Action Type : " + p.getActionType());
			System.out.println("---> Start Offset : " + p.getStartOffset());
			System.out.println("---> End Offset : " + p.getEndOffset());
		}
	}
}
