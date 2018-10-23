package com.sdq.kit.objectprimitiveattributevalues;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImpObjectPrimitiveAttributeValues implements IObjectPrimitiveAttributeValues{
	
	Map<String, Object> listPrimitiveAttributes;
	
	
	public ImpObjectPrimitiveAttributeValues() {
		listPrimitiveAttributes = new HashMap<String, Object>();
	}

	@Override
	public Map<String, Object> getObjectPrimitiveAttributeValues(Object object, int depth) {
		this.findPrimitiveAttributes(object);
		return this.listPrimitiveAttributes;
	}
	
	
	private void findPrimitiveAttributes(Object object){
		 Field[] fields = object.getClass().getDeclaredFields();
         for (Field field : fields) {
        	 field.setAccessible(true);
        	 if(this.isPrimitiveTypeFromString(field.getType().toString())){
   					try {
						this.listPrimitiveAttributes.put(field.getName(), field.get(object));
					} catch (IllegalArgumentException | IllegalAccessException e) {

					}
        	 }
        	 else{
        		 // call recursively
        		 try {
					this.findPrimitiveAttributes(field.get(object));
				} catch (IllegalArgumentException | IllegalAccessException e) {

				}
        	 }
             
         }
	}
	
	
	private boolean isPrimitiveTypeFromString(String typeName){
		String[] javaPrimitiveTypes = {"boolean", "byte", "short", "int", "long", "char", "float","double"};
		if(Arrays.asList(javaPrimitiveTypes).contains(typeName)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * @param object 
	 * @return
	 */
	private boolean isPrimitiveType(Object object){
		if(object.getClass().equals(Float.class))
			return true;
		if(object.getClass().equals(Double.class))
			return true;
		if(object.getClass().equals(Integer.class))
			return true;
		if(object.getClass().equals(Long.class))
			return true;
		if(object.getClass().equals(Byte.class))
			return true;
		if(object.getClass().equals(Short.class))
			return true;
		if(object.getClass().equals(Character.class))
			return true;
		if(object.getClass().equals(Boolean.class))
			return true;
		else
			return false;
	}

}
