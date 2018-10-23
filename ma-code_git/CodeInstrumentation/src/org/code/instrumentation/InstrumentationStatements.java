package org.code.instrumentation;

public class InstrumentationStatements {

	public static MonitoringSourceCodeStatement getInternalActionInstrumentationCode(String elementID) {
		MonitoringSourceCodeStatement monitoringSourceCodeStatement =  new MonitoringSourceCodeStatement();
		StringBuilder forExecution = new StringBuilder();
		StringBuilder afterExecution = new StringBuilder();
		// Start Time variable
		String tin = "tin_" + CodeInstrumentationUtil.getUUID();
		// End Time Variable
		String tout = "tout_" + CodeInstrumentationUtil.getUUID();
		// Internal Action record variable
		String internalActionRecord = "internalActionRecord_" + CodeInstrumentationUtil.getUUID();
		
		forExecution.append(System.lineSeparator());
	    forExecution.append("final long " + tin + " = MonitoringFactory.getMonitoringController().getTimeSource().getTime();");

        afterExecution.append("final long " + tout + " = MonitoringFactory.getMonitoringController().getTimeSource().getTime();");
        afterExecution.append(System.lineSeparator());
        afterExecution.append("final CustomizedResponseTimeRecord " + internalActionRecord + 
        		" = MonitoringFactory.getInternalActionRecord(" + elementID +", " + tin+ ", " + tout + ");");
        afterExecution.append(System.lineSeparator());
        afterExecution.append("MonitoringFactory.getMonitoringController().newMonitoringRecord(" + internalActionRecord + ");");
        
        //
        monitoringSourceCodeStatement.setForExecution(forExecution.toString());
        monitoringSourceCodeStatement.setAfterExecution(afterExecution.toString());
		
		return monitoringSourceCodeStatement;
	}
	
	
	public static MonitoringSourceCodeStatement getOperationInstrumentationCode(String elementID) {		
		MonitoringSourceCodeStatement monitoringSourceCodeStatement =  new MonitoringSourceCodeStatement();
		StringBuilder forExecution = new StringBuilder();
		StringBuilder afterExecution = new StringBuilder();
		// Start Time variable
		String tin = "tin_" + CodeInstrumentationUtil.getUUID();
		// End Time Variable
		String tout = "tout_" + CodeInstrumentationUtil.getUUID();
		// Internal Action record variable
		String operationRecord = "operationRecord_" + CodeInstrumentationUtil.getUUID();
		
		forExecution.append(System.lineSeparator());
		forExecution.append("final long " + tin + " = MonitoringFactory.getMonitoringController().getTimeSource().getTime();");
		
		afterExecution.append("final long " + tout + " = MonitoringFactory.getMonitoringController().getTimeSource().getTime();");
        afterExecution.append(System.lineSeparator());
        afterExecution.append("final CustomizedResponseTimeRecord " + operationRecord + " "
        		+ "= MonitoringFactory.getOperationRecord(" + elementID + ", " + tin + " , " + tout + ", null, null);");
        afterExecution.append(System.lineSeparator());
        afterExecution.append("MonitoringFactory.getMonitoringController().newMonitoringRecord(" + operationRecord + ");");        
        
        //
        monitoringSourceCodeStatement.setForExecution(forExecution.toString());
        monitoringSourceCodeStatement.setAfterExecution(afterExecution.toString());
		
		return monitoringSourceCodeStatement;	
	}
	
	
	public static MonitoringSourceCodeStatement getLoopActionInstrumentationCode(String elementID) {
		MonitoringSourceCodeStatement monitoringSourceCodeStatement =  new MonitoringSourceCodeStatement();
		String counter = "counter_" + CodeInstrumentationUtil.getUUID();
		String loopActionRecord = "loopActionRecord_" + CodeInstrumentationUtil.getUUID();
		
		String beforeExecution = "\n long " + counter + " = 0;";
		String betweenExecution = counter + "++;";
		String afterExecution = "final CustomizedResponseTimeRecord " + loopActionRecord + " ="
				+ " MonitoringFactory.getLoopActionRecord(" + elementID +", " + counter + ");	\r\n" + 
				"MonitoringFactory.getMonitoringController().newMonitoringRecord(" + loopActionRecord + ");";
		
		monitoringSourceCodeStatement.setForExecution(beforeExecution);
		monitoringSourceCodeStatement.setBetweenExecution(betweenExecution);
		monitoringSourceCodeStatement.setAfterExecution(afterExecution);
		
		return monitoringSourceCodeStatement;
	}
	
	
	public static MonitoringSourceCodeStatement getBranchActionInstrumentationCode(String elementID) {
		MonitoringSourceCodeStatement monitoringSourceCodeStatement =  new MonitoringSourceCodeStatement();
		String isBranchExecuted = "isBranchExecuted_" + CodeInstrumentationUtil.getUUID();
		String branchActionRecord = "branchActionRecord_" + CodeInstrumentationUtil.getUUID();
		
		String beforeExecution = "\n long " + isBranchExecuted + " = 0;";
		String betweenExecution = isBranchExecuted + " = 1;";
		String afterExecution = "final CustomizedResponseTimeRecord " + branchActionRecord + " ="
				+ " MonitoringFactory.getLoopActionRecord(" + elementID +", " + isBranchExecuted + ");	\r\n" + 
				"MonitoringFactory.getMonitoringController().newMonitoringRecord(" + branchActionRecord + ");";
		
		
		monitoringSourceCodeStatement.setForExecution(beforeExecution);
		monitoringSourceCodeStatement.setBetweenExecution(betweenExecution);
		monitoringSourceCodeStatement.setAfterExecution(afterExecution);
		
		return monitoringSourceCodeStatement;
	}
	
	private void  currentExecutingMethodInfo() {
        // return info like parameters and return value
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod().getName();
		     
	}
	
	
	
}
