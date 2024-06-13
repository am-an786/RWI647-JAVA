package marker_Interface;

public class Clone_Markup_Interface2 implements Cloneable{
            String name;
            int roll_no;
            
            //constructor
           public Clone_Markup_Interface2(String name, int roll_no) {
        	   this.name=name;
        	   this.roll_no=roll_no;
           }
           
// if you didn't implement public method so you need to override clone method here
            
            @Override
            protected Object clone()throws CloneNotSupportedException{ 
            	        return super.clone(); 
            	    }
            
	public static void main(String[] args)throws CloneNotSupportedException {
		Clone_Markup_Interface2 objr1 = new Clone_Markup_Interface2("Aman",86);
		
		Clone_Markup_Interface2 objr2 =(Clone_Markup_Interface2) objr1.clone();
		
		System.out.println("Student name : "+ objr2.name);

		System.out.println("Student Roll No. : "+ objr2.roll_no);
	}

}
