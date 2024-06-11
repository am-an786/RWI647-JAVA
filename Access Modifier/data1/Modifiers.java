package data1;

public class Modifiers {

	public    int a=10;
	protected int b=20;
	          int c=30;
    private   int d=40;
    
    
    
	public static void main(String[] args) {
		Modifiers objr = new Modifiers();
    	System.out.println("public variable= "+objr.a);//public variable
    	System.out.println("protected variable= "+objr.b);//protected variable
    	System.out.println("default variable= "+objr.c);//default variable
    	System.out.println("private variable= "+objr.d);//private variable
    	
  /*********************************************************************************************/
    	
    	/*
    	 * Here all the variable is accessible even private because it is in same class same package 
    	 */

	}

}
