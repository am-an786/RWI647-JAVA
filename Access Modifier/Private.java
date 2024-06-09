class PrivateMethod{


	       //Private variable
			  private int a=10;

	       //private Method
			   private void obj(){

				 System.out.println("Private method print");
		      }


}
public class Private{

     public static void main(String [] args){
		   PrivateMethod objr=new PrivateMethod();

		      //Trying to access private variable

		      System.out.println(objr.a);// this give me error because a is not accessible

		      //Trying to access private Method

		      objr.obj(); //this give me also an error because of obj method is also private
	 }
}