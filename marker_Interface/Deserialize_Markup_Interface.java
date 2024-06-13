package marker_Interface;
import java.io.*;


public class Deserialize_Markup_Interface{

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		//Deserialization (converting byte stream into an object) is the opposite of serialization
		//means that object state reading from a file or
		//database and written back into memory is called deserialization of object.
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Markup_Interface.txt"));
		Test objr = (Test)in.readObject();
		
		System.out.println(objr.serializable);
		
		in.close();
	}

}
