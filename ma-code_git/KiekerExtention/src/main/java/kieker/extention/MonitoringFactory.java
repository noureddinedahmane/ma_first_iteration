package kieker.extention;

import java.net.InetAddress;
import java.net.UnknownHostException;

import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;

public final class MonitoringFactory {
	
	public static IMonitoringController getMonitoringController() {
		final IMonitoringController MONITORING_CONTROLLER = MonitoringController.getInstance();
	    return 	MONITORING_CONTROLLER;
	}
	
	public static CustomizedResponseTimeRecord  getInternalActionRecord(long id, long tin, long tout) {
		return new CustomizedResponseTimeRecord(
				id,
				MonitoringFactory.getThreadID(), 
				tin,
				tout,
				CustomizedResponseTimeRecord.NO_LOOP_NUMBER,
				MonitoringFactory.getSessionID(),
				MonitoringFactory.getHostName(), 
				CustomizedResponseTimeRecord.NO_POSITION_ID, 
				CustomizedResponseTimeRecord.NO_SERVICE_PARAMETERS, 
				CustomizedResponseTimeRecord.NO_SERVICE_RETURN_VALUE, 
				CustomizedResponseTimeRecord.NO_IS_BRANCH_EXECUTED);
	}
	
	public static CustomizedResponseTimeRecord  getLoopActionRecord(long id, long loopNumber) {
		return new CustomizedResponseTimeRecord(
				id,
				MonitoringFactory.getThreadID(), 
				CustomizedResponseTimeRecord.NO_START_TIME,
				CustomizedResponseTimeRecord.NO_END_TIME,
				loopNumber,
				MonitoringFactory.getSessionID(),
				MonitoringFactory.getHostName(), 
				CustomizedResponseTimeRecord.NO_POSITION_ID, 
				CustomizedResponseTimeRecord.NO_SERVICE_PARAMETERS, 
				CustomizedResponseTimeRecord.NO_SERVICE_RETURN_VALUE, 
				CustomizedResponseTimeRecord.NO_IS_BRANCH_EXECUTED);
	}
	
	public static CustomizedResponseTimeRecord  getBranchActionRecord(long id, long isBranchExecuted) {
		return new CustomizedResponseTimeRecord(
				id,
				MonitoringFactory.getThreadID(), 
				CustomizedResponseTimeRecord.NO_START_TIME,
				CustomizedResponseTimeRecord.NO_END_TIME,
				CustomizedResponseTimeRecord.NO_LOOP_NUMBER,
				MonitoringFactory.getSessionID(),
				MonitoringFactory.getHostName(), 
				CustomizedResponseTimeRecord.NO_POSITION_ID, 
				CustomizedResponseTimeRecord.NO_SERVICE_PARAMETERS, 
				CustomizedResponseTimeRecord.NO_SERVICE_RETURN_VALUE, 
				isBranchExecuted);
	}
	
	public static CustomizedResponseTimeRecord  getOperationRecord(long id, long tin, long tout, String parameters,
			String returnValue) {
		
		if(parameters == null) {
			parameters = CustomizedResponseTimeRecord.NO_SERVICE_PARAMETERS;
		}
		
		if(returnValue == null) {
			returnValue = CustomizedResponseTimeRecord.NO_SERVICE_RETURN_VALUE;
		}
		
		return new CustomizedResponseTimeRecord(
				id,
				MonitoringFactory.getThreadID(), 
				tin,
				tout,
				CustomizedResponseTimeRecord.NO_LOOP_NUMBER,
				MonitoringFactory.getSessionID(),
				MonitoringFactory.getHostName(), 
				CustomizedResponseTimeRecord.NO_POSITION_ID, 
				parameters, 
				returnValue, 
				CustomizedResponseTimeRecord.NO_IS_BRANCH_EXECUTED);
	}
	
	private static String getHostName() {
		try {
			String hostName = InetAddress.getLocalHost().getHostName();
			return hostName;
		} catch (UnknownHostException e) {
			return CustomizedResponseTimeRecord.NO_HOSTNAME;
		}
	}
	
	private static long getThreadID() {
		long threadId = Thread.currentThread().getId();
		return threadId;
	}
	
	private static String getSessionID() {
		return CustomizedResponseTimeRecord.NO_POSITION_ID;
	}
	

}
