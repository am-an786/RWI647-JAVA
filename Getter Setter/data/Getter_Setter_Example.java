package data;

class Example2_Getter_Setter {

// Private Variables
    private int dob;
    private String name;


 /****************************************************************************************/
    /*
     * Here i am setting the variable data using setter
     */


    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

/****************************************************************************************/

    /*
     * Here i am getting the variable data using getter
     */


    public int getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

}

public class Getter_Setter_Example {
    public static void main(String[] args) {
        Example2_Getter_Setter obj = new Example2_Getter_Setter();

       //Here i am setting my object
        obj.setDob(2002);
        obj.setName("Aman");

        System.out.println(obj.getName());
        System.out.println(obj.getDob());

    }
}

