package data2;

import data1.Modifiers;

public class Example3 {

	public static void main(String[] args) {
		
		Modifiers objr = new Modifiers();
		/*
		 * Here public variable is accessible anywhere.
		 */
    	System.out.println("public variable= "+objr.a);//public variable
    	
    	
    	
    	
  /*******************************************************************************************************************/
    	
    	
    	/*
    	 * Here protected variable gives error because protected variable is only accessible into another package
    	 * by making sub-class.
    	 */
    	
    	//System.out.println("protected variable= "+objr.b);//protected variable
	}

}
