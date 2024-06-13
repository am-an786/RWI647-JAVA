package marker_Interface;
import java.util.*;



public class Clone_Markup_Interface implements Cloneable {
	
	int roll_no;
	String name;
	String college;
	int fee;
	
	public Clone_Markup_Interface(int roll_no, String name, String college, int fee) {
		
		this.roll_no=roll_no;
		this.name=name;
		this.college=college;
		this.fee= fee;
		
	}
	
	public void showDetail() {
		
		System.out.println("Name of College: "+college);
		
		System.out.println("Name of student: "+name);
		
		System.out.println("Student Roll No. : "+roll_no);
		
		System.out.println("Student Fee : "+fee);
		
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sobjr = new Scanner(System.in);
		
		System.out.println("Enter College Name: ");
		String college = sobjr.nextLine() ;
		
		System.out.println("Enter Student Name: ");
		String name = sobjr.nextLine() ;
		
		System.out.println("Enter Roll Number: ");
		int roll_no = sobjr.nextInt() ;
		
		System.out.println("Enter Student fee: ");
		int fee = sobjr.nextInt() ;
		
		sobjr.close();
		Clone_Markup_Interface objr1 = new Clone_Markup_Interface(roll_no,name,college,fee);
		
		System.out.println("/*****************************Student Details******************************************/");
		
		Clone_Markup_Interface objr2 =(Clone_Markup_Interface) objr1.clone();
		
		objr2.showDetail();
		

	}

}
