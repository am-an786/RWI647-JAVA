package data1;

public class Example1 {

	public static void main(String[] args) {
		Modifiers objr = new Modifiers();
		
    	System.out.println("public variable= "+objr.a);//public variable
    	System.out.println("protected variable= "+objr.b);//protected variable
    	System.out.println("default variable= "+objr.c);//default variable
    	
    	
  /*********************************************************************************************/
    	
    	/*
    	 * Default variable is accessible anywhere within the same package 
    	 */
    	
 /*********************************************************************************************/
    	/*
    	 * error occur here because of private variable is accessible only in same class same package
    	 * 
    	 * System.out.println("private variable= "+objr.d);//private variable
    	 */
    	
    	
	}

}
