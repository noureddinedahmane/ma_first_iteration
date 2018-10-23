package co.sdq.kit.objectprimitiveattributevaluestest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.sdq.kit.objectprimitiveattributevalues.ImpObjectPrimitiveAttributeValues;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestEntity entity = new TestEntity();	
		ImpObjectPrimitiveAttributeValues pv = new ImpObjectPrimitiveAttributeValues();

		
		 
		for (Entry<String, Object> entry : pv.getObjectPrimitiveAttributeValues(entity, 1).entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		

	}

}
