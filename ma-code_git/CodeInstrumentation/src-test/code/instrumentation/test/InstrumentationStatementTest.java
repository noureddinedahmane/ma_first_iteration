package code.instrumentation.test;

import org.code.instrumentation.InstrumentationStatements;
import org.code.instrumentation.MonitoringSourceCodeStatement;
import org.junit.Test;

public class InstrumentationStatementTest {

	@Test
	public void instrumentationStatementTest() {
        System.out.println("Starting....");		
		
		MonitoringSourceCodeStatement internalActionProbe = InstrumentationStatements.getInternalActionInstrumentationCode("23adasf");
		MonitoringSourceCodeStatement operationProbe = InstrumentationStatements.getOperationInstrumentationCode("23wedasf");
		MonitoringSourceCodeStatement loopActionProbe = InstrumentationStatements.getLoopActionInstrumentationCode("23wedasf");
		MonitoringSourceCodeStatement branchActionProbe = InstrumentationStatements.getBranchActionInstrumentationCode("23wedasf");
		
		String instrumentedMethod = "public void execute(int[] counter, boolean bool) {\n";
		instrumentedMethod += operationProbe.getForExecution() + "\n\n";
		
		// internal action
		instrumentedMethod += internalActionProbe.getForExecution() + "\n";
		instrumentedMethod += "// execution internal action\n";
		instrumentedMethod += internalActionProbe.getAfterExecution() + "\n\n";
		
		// loop action
		instrumentedMethod += loopActionProbe.getForExecution() + "\n";
		instrumentedMethod +="for(int i:counter){\n"+
				loopActionProbe.getBetweenExecution() + "\n"
				+ " // execute external action \n }\n";
		instrumentedMethod += loopActionProbe.getAfterExecution() + "\n\n";
		
		//branch action
		instrumentedMethod += branchActionProbe.getForExecution() + "\n";
		instrumentedMethod += "if(bool){\n" + branchActionProbe.getBetweenExecution() + "\n // execute external action \n } \n";
		instrumentedMethod += branchActionProbe.getAfterExecution() + "\n\n";
		
		
		
		
		
		instrumentedMethod += operationProbe.getAfterExecution();	
		instrumentedMethod += "\n}\n";
		
		System.out.println("\n\n" + instrumentedMethod + "\n\n");


		System.out.println("DONE");
	}
}
