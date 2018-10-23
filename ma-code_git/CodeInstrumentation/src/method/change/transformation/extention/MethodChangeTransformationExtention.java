package method.change.transformation.extention;

import instumentationModel.ApplicationProbes;
import instumentationModel.InstumentationModelFactory;
import instumentationModel.Probe;

import org.emftext.language.java.statements.Statement;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import tools.vitruv.framework.correspondence.CorrespondenceModel;
import tools.vitruv.framework.correspondence.CorrespondenceModelUtil;

public class MethodChangeTransformationExtention {

	public static void execute(SourceCodeDecoratorRepository sourceCodeDecorator,
			CorrespondenceModel correspondenceModel, ApplicationProbes applicationProbes) {
		addSeffElementToCorrespondenceModel(sourceCodeDecorator, correspondenceModel, applicationProbes);
	}
	
	
	private static void addSeffElementToCorrespondenceModel(SourceCodeDecoratorRepository sourceCodeDecorator,
			CorrespondenceModel correspondenceModel, ApplicationProbes applicationProbes) {
		
		for(SeffElementSourceCodeLink seffElementSourceCodeLink: sourceCodeDecorator.getSeffElementsSourceCodeLinks()) {
			Probe probe = InstumentationModelFactory.eINSTANCE.createProbe();
			probe.setProbeId(seffElementSourceCodeLink.getSeffElement().getId());
			probe.setProbeType(getSeffElementType(seffElementSourceCodeLink));
			probe.setActivated(true);
			
			// add the probe and the corresponding Statements in correspondence model
			for(Statement statement: seffElementSourceCodeLink.getStatement()) {
				CorrespondenceModelUtil.createAndAddCorrespondence(correspondenceModel, probe, statement);

			}
			
			// add the probe in the
			addProbesToInstrumentationModel(probe, applicationProbes);
		}
	}
	
	
	/*
	 * applicationprobes imitate the Measurement Mode which has to be integrated in VSUM
	 */
	private static void addProbesToInstrumentationModel(Probe probe,
			ApplicationProbes applicationProbes) {
		  //...
		  applicationProbes.getProbe().add(probe);
	}
	
	private static String getSeffElementType(SeffElementSourceCodeLink seffElementSourceCodeLink) {
		String type = null;
		
		if(seffElementSourceCodeLink.getSeffElement() instanceof InternalAction) {
			type =  "IA";
		}
		else if(seffElementSourceCodeLink.getSeffElement() instanceof BranchAction){
			type = "BA";
		}
		else if(seffElementSourceCodeLink.getSeffElement() instanceof LoopAction){
			type = "LA";
		}
		
		return type;
	}
	
}
