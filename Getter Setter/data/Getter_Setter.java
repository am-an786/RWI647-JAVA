package data;

class Example_Getter_Setter{
//	Declared my variable Private here

	private int a=10;

	public void method() {
		System.out.println("Accessing private variable inside same class = "+a);
	}
}
public class Getter_Setter {

	public static void main(String[] args) {
		Example_Getter_Setter objr = new Example_Getter_Setter();

		objr.method();

/******************************************************************************************/
/**
 *
 * Trying to access private variable outside the class
 * System.out.println("Accessing private variable outside class = "+objr.a);
 * this line give me error because it is private variable and it is only accessible within same class
 *
**/

	}

}
