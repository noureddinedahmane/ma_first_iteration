package intrumentation.probe;

import java.util.ArrayList;
import java.util.List;

public class MethodProbes {
	private String methodName;
	private String compilationUnitName;
	private List<Probe> methodProbes;
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getCompilationUnitName() {
		return compilationUnitName;
	}
	public void setCompilationUnitName(String compilationUnitName) {
		this.compilationUnitName = compilationUnitName;
	}
	public List<Probe> getMethodProbes() {
		return methodProbes;
	}
	public void setMethodProbes(List<Probe> methodProbes) {
		this.methodProbes = methodProbes;
	}
	
	public MethodProbes() {
		methodProbes = new ArrayList<Probe>();
	}
	
	
	
	
}
