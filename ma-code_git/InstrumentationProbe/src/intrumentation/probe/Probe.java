package intrumentation.probe;

public class Probe {
	
	private String actionType;
	private String abstractActionID;
	private int startOffset;
	private int endOffset;
	

	
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getAbstractActionID() {
		return abstractActionID;
	}
	public void setAbstractActionID(String abstractActionID) {
		this.abstractActionID = abstractActionID;
	}
	public int getStartOffset() {
		return startOffset;
	}
	public void setStartOffset(int startOffset) {
		this.startOffset = startOffset;
	}
	public int getEndOffset() {
		return endOffset;
	}
	public void setEndOffset(int endOffset) {
		this.endOffset = endOffset;
	}
	public Probe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
