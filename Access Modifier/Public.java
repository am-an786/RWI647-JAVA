class Publicmethodvar{
	//Public variable
	public int a=10;

	//public method
	public void objmethod(){
		System.out.println("Public method");

	}
}
public class Public{
	public static void main(String[] args){
		Publicmethodvar objr=new Publicmethodvar();

		//trying to access public variable
		System.out.println(objr.a); //it is accessible because of public variable method or class is accessible anywhere.
		objr.objmethod();


	}
}