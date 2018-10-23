package kieker.extention;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

import kieker.common.record.AbstractMonitoringRecord;
import kieker.common.record.IMonitoringRecord;
import kieker.common.util.registry.IRegistry;

public class CustomizedResponseTimeRecord extends AbstractMonitoringRecord implements IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory{

	public static final int SIZE = (5 * TYPE_SIZE_STRING) + (6 * TYPE_SIZE_LONG);

    public static final Class<?>[] TYPES = {
            long.class, // traceId
            long.class, // threadId
            String.class, // sessionId
            String.class, // hostName
            String.class, // positionId
            
            long.class, // startTime
            long.class, // stopTime
            
            String.class, // serviceParameters
            String.class, // serviceReturnValue
            
            long.class,  // loop number
            long.class // isBranchExecuted

     };
    
   
    // constants can be used when the record element was not supported
    public static final long NO_TRACE_ID = -1;
    public static final long NO_THREAD_DI = -1;
    public static final long NO_START_TIME = -1;
    public static final int NO_END_TIME = -1;
    public static final int NO_LOOP_NUMBER = -1;
    public static final int NO_IS_BRANCH_EXECUTED = -1;
    public static final String NO_HOSTNAME = "<default-host>";
    public static final String NO_SESSION_ID = "<no-session-id>";
    public static final String NO_POSITION_ID = "<no-position-id>";
    public static final String NO_SERVICE_PARAMETERS = "<no-service-parameters>";
    public static final String NO_SERVICE_RETURN_VALUE = "<no-service-return-value>";
    
    
    private static final long serialVersionUID = 538065471740351778L;
    
    // attributes that will store the customized records
    private final long traceID;
    private final long threadID;
    private final long startTime;
    private final long endTime;
    private final long loopNumber;
    
    private final String sessionID;
    private final String hostName;
    private final String positionID;
    private final String serviceParameters;
    private final String serviceReturnValue;
    
    private final long isBranchExecuted;

    
    
	public CustomizedResponseTimeRecord(long traceID, long threadID, long startTime, long endTime, long loopNumber,
			String sessionID, String hostName, String positionID, String serviceParameters, String serviceReturnValue,
			long isBranchExecuted) {
		this.traceID = traceID;
		this.threadID = threadID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.loopNumber = loopNumber;
		this.sessionID = sessionID;
		this.hostName = hostName;
		this.positionID = positionID;
		this.serviceParameters = serviceParameters;
		this.serviceReturnValue = serviceReturnValue;
		this.isBranchExecuted = isBranchExecuted;
	}
	
	
	public CustomizedResponseTimeRecord(final Object[] values) {
		AbstractMonitoringRecord.checkArray(values, CustomizedResponseTimeRecord.TYPES);
		
		this.traceID = (Long) values[0];
		this.threadID = (Long) values[1];
		this.startTime = (Long) values[2];
		this.endTime = (Long) values[3];
		this.loopNumber = (Long) values[4];
		this.sessionID = (String) values[5];
		this.hostName = (String) values[6];
		this.positionID = (String) values[7];
		this.serviceParameters = (String) values[8];
		this.serviceReturnValue = (String) values[9];
		this.isBranchExecuted = (Long) values[10];
	}
	
	
	public CustomizedResponseTimeRecord(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {
		this.traceID = buffer.getLong();
		this.threadID = buffer.getLong();
		this.startTime = buffer.getLong();
		this.endTime = buffer.getLong();
		this.loopNumber = buffer.getLong();
		this.sessionID = stringRegistry.get(buffer.getInt());
		this.hostName = stringRegistry.get(buffer.getInt());
		this.positionID = stringRegistry.get(buffer.getInt());
		this.serviceParameters = stringRegistry.get(buffer.getInt());
		this.serviceReturnValue = stringRegistry.get(buffer.getInt());
		this.isBranchExecuted = buffer.getLong();
	}
	
	
	
	public int getSize() {
		return SIZE;
	}


	public Class<?>[] getValueTypes() {
		return CustomizedResponseTimeRecord.TYPES;
	}


	 @Deprecated
    // Will not be used because the record implements IMonitoringRecord.Factory
	public void initFromArray(Object[] arg0) {
		
	}


	@Deprecated
	// Will not be used because the record implements IMonitoringRecord.BinaryFactory
	public void initFromBytes(ByteBuffer arg0, IRegistry<String> arg1) throws BufferUnderflowException {
		
	}


	public Object[] toArray() {
		return new Object[] { 
				this.getTraceID(),
				this.getThreadID(),
				this.getStartTime(),
				this.getEndTime(),
				this.getLoopNumber(),
				this.getSessionID(),
				this.getHostName(),
				this.getPositionID(),
				this.getServiceParameters(),
				this.getServiceReturnValue(),
				this.isBranchExecuted(),
				};
	}


	public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
		buffer.putLong(this.getTraceID());
		buffer.putLong(this.getThreadID());
		buffer.putLong(this.getStartTime());
		buffer.putLong(this.getEndTime());
		buffer.putLong(this.getLoopNumber());
		buffer.putLong(this.isBranchExecuted());
		buffer.putInt(stringRegistry.get(this.getSessionID()));
		buffer.putInt(stringRegistry.get(this.getHostName()));
		buffer.putInt(stringRegistry.get(this.getPositionID()));
		buffer.putInt(stringRegistry.get(this.getServiceParameters()));
		buffer.putInt(stringRegistry.get(this.getServiceReturnValue()));
		
	}
	
	

	public long getTraceID() {
		return traceID;
	}

	public long getThreadID() {
		return threadID;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public long getLoopNumber() {
		return loopNumber;
	}

	public String getSessionID() {
		return sessionID;
	}

	public String getHostName() {
		return hostName;
	}

	public String getPositionID() {
		return positionID;
	}

	public String getServiceParameters() {
		return serviceParameters;
	}

	public String getServiceReturnValue() {
		return serviceReturnValue;
	}

	public long isBranchExecuted() {
		return isBranchExecuted;
	}

	

}




