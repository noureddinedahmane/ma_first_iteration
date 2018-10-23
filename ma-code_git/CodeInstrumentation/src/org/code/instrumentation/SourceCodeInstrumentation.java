package org.code.instrumentation;

import java.util.List;
import java.util.Map;

import org.emftext.language.java.statements.Condition;
import org.emftext.language.java.statements.ForLoop;
import org.emftext.language.java.statements.Statement;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementsFactory;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.EmitEventAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalCallAction;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.identifier.Identifier;

public class SourceCodeInstrumentation {
	

	public void execute(final ResourceDemandingBehaviour seff,
			final  Map<Identifier, SeffElementSourceCodeLink> seffElemestSourceCodeLinks) {
		
		final List<AbstractAction> abstractActions = seff.getSteps_Behaviour();
		
		for(AbstractAction abstractAction: abstractActions) {
			
			this.findSeffElementCorrespondingStatement(abstractAction, seffElemestSourceCodeLinks);
		}
			
	}
	
	
	/**
	 * @param abstractAction : the seff element
	 * @param seffElemestSourceCodeLinks: a hashMap created during SEFF creation, associates seff elements and JaMoPP
	 * statements
	 */
	private void findSeffElementCorrespondingStatement(AbstractAction abstractAction,
            final  Map<Identifier, SeffElementSourceCodeLink> seffElemestSourceCodeLinks){
		
		SeffElementSourceCodeLink seffElementSourceCodeLinks = seffElemestSourceCodeLinks.get(abstractAction);
		if(seffElementSourceCodeLinks != null) {
			
			List<Statement> correspondingStatements = seffElementSourceCodeLinks.getStatement();
			if (correspondingStatements.size() == 0) {
				return;
			}
			
			if (abstractAction instanceof ExternalCallAction) {
	               
				// ...
            }
			else if (abstractAction instanceof InternalCallAction) {
				MonitoringSourceCodeStatement internalActionProbe = InstrumentationStatements.getInternalActionInstrumentationCode(abstractAction.getId());
				
				Statement beforeExecutionStatement = (Statement) StatementsFactory.eINSTANCE.createFromString(null, internalActionProbe.getForExecution());
				Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, internalActionProbe.getAfterExecution());
				
				correspondingStatements.get(0).addBeforeContainingStatement(beforeExecutionStatement);
				correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
            }  
			else if (abstractAction instanceof BranchAction) {
				MonitoringSourceCodeStatement branchActionProbe = InstrumentationStatements.getBranchActionInstrumentationCode(abstractAction.getId());
				
				Statement beforeExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getForExecution());
				Statement betweenExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getBetweenExecution());
				Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getAfterExecution());
				
				correspondingStatements.get(0).addBeforeContainingStatement(beforeExecution);
				for(Statement statement: correspondingStatements) {
					if(statement instanceof Condition) {
						statement.addAfterContainingStatement(betweenExecution);
					}		
				}
				correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
				
            } 
			else if (abstractAction instanceof LoopAction) {
				MonitoringSourceCodeStatement loopActionProbe = InstrumentationStatements.getLoopActionInstrumentationCode(abstractAction.getId());
				
				Statement beforeExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getForExecution());
				Statement betweenExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getBetweenExecution());
				Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getAfterExecution());
				
				correspondingStatements.get(0).addBeforeContainingStatement(beforeExecution);
				for(Statement statement: correspondingStatements) {
					if(statement instanceof ForLoop) {
						statement.addAfterContainingStatement(betweenExecution);
					}		
				}
				correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
            }
			else if (abstractAction instanceof EmitEventAction) {
                
				// ...
            } 
		}
		
		

    }
	
	
	/* **************************************************************************************************** */
	
	
	public void execute(final ResourceDemandingBehaviour seff,
			final SourceCodeDecoratorRepository sourceCodeDecorator) {
		
		final List<AbstractAction> abstractActions = seff.getSteps_Behaviour();
		
		for(AbstractAction abstractAction: abstractActions) {
			
			this.findSeffElementCorrespondingStatement(abstractAction, sourceCodeDecorator);
		}
			
	}
	
	private void findSeffElementCorrespondingStatement(AbstractAction abstractAction,
            final SourceCodeDecoratorRepository sourceCodeDecorator){
		
		List<SeffElementSourceCodeLink> seffElementSourceCodeLinks = sourceCodeDecorator.getSeffElementsSourceCodeLinks();
		for(SeffElementSourceCodeLink seffElementSourceCodeLink: seffElementSourceCodeLinks) {
			
			// find the link of the SEFF element in source decorator
			if(seffElementSourceCodeLink.getSeffElement().equals(abstractAction)) {
				
				List<Statement> correspondingStatements = seffElementSourceCodeLink.getStatement();
				if (correspondingStatements.size() == 0) {
					return;
				}
				
				if (abstractAction instanceof ExternalCallAction) {
		               
					// ...
	            }
				else if (abstractAction instanceof InternalCallAction) {
					MonitoringSourceCodeStatement internalActionProbe = InstrumentationStatements.getInternalActionInstrumentationCode(abstractAction.getId());
					
					Statement beforeExecutionStatement = (Statement) StatementsFactory.eINSTANCE.createFromString(null, internalActionProbe.getForExecution());
					Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, internalActionProbe.getAfterExecution());
					
					correspondingStatements.get(0).addBeforeContainingStatement(beforeExecutionStatement);
					correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
	            }  
				else if (abstractAction instanceof BranchAction) {
					MonitoringSourceCodeStatement branchActionProbe = InstrumentationStatements.getBranchActionInstrumentationCode(abstractAction.getId());
					
					Statement beforeExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getForExecution());
					Statement betweenExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getBetweenExecution());
					Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, branchActionProbe.getAfterExecution());
					
					correspondingStatements.get(0).addBeforeContainingStatement(beforeExecution);
					for(Statement statement: correspondingStatements) {
						if(statement instanceof Condition) {
							statement.addAfterContainingStatement(betweenExecution);
						}		
					}
					correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
					
	            } 
				else if (abstractAction instanceof LoopAction) {
					MonitoringSourceCodeStatement loopActionProbe = InstrumentationStatements.getLoopActionInstrumentationCode(abstractAction.getId());
					
					Statement beforeExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getForExecution());
					Statement betweenExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getBetweenExecution());
					Statement afterExecution = (Statement) StatementsFactory.eINSTANCE.createFromString(null, loopActionProbe.getAfterExecution());
					
					correspondingStatements.get(0).addBeforeContainingStatement(beforeExecution);
					for(Statement statement: correspondingStatements) {
						if(statement instanceof ForLoop) {
							statement.addAfterContainingStatement(betweenExecution);
						}		
					}
					correspondingStatements.get(correspondingStatements.size()-1).addAfterContainingStatement(afterExecution);
	            }
				else if (abstractAction instanceof EmitEventAction) {
	                
					// ...
	            } 
				
			}
			
		}

    }
	
	
}
