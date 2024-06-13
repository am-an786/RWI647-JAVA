package marker_Interface;
import java.io.*;
import java.util.*;


@SuppressWarnings("serial")
class Test implements Serializable {
	
	String serializable ;
	//constructor
	public Test(String serializable) {
		this.serializable= serializable;
	}
}
public class Serializable_Markup_Interface{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sobjr=new Scanner(System.in);
		
		String serializable = sobjr.nextLine();
		
		Test objr =new Test(serializable);
		
		FileOutputStream fobjr = new FileOutputStream ("Markup_Interface.txt");//creating my .txt file using fileoutputstream
		
		
		//here i am serializing my data using ObjectOutputStream this Serialization (converting an object into byte stream) is a mechanism in which object
		//is read from the memory and write into a file or database. 
		ObjectOutputStream oosr = new ObjectOutputStream(fobjr);
		oosr.writeObject(objr);
		fobjr.close();
		oosr.close();
		sobjr.close();

	}

}
