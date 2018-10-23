package method.change.transformation.extention;

import instumentationModel.InstumentationModelFactory;
import instumentationModel.Probe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Probe probe = InstumentationModelFactory.eINSTANCE.createProbe();
		probe.setProbeId("gghdsds");
		
		System.out.println(probe.getProbeId());

	}

}
