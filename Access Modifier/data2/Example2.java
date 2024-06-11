package data2;

import data1.Modifiers;

public class Example2 extends Modifiers{

	public static void main(String[] args) {
		Modifiers objr = new Modifiers();//Creating object so i can access my public variable in another package.
		Example2 objr2 =new Example2();//Creating object of Example2 sub-class of my Modifiers class so i can access my protected variable in another package.
		
    	System.out.println("public variable= "+objr.a);//public variable
    	System.out.println("protected variable= "+objr2.b);//protected variable
    	/*
    	 * here i call my protected variable using sub-class object this is the only way i can access my protected variable
    	 * into another package
    	 */
 /**********************************************************************************************************/
    	/*
    	 *System.out.println("default variable= "+objr.c);//default variable
    	 *Default variable here gives error because default variable is only accessible in same package.
         */
	}

}
