enum gender {male , female }
public class Employee {
    private gender genderType;
    private int EMP_ID ;
    private String Name ;
    private String Department ;
    private double Salary ;
    private double Bouns ;
    private boolean Resident ;
    private static int no_of_objects ;

    public Employee() {
        genderType = gender.male ;
        EMP_ID = 1 ;
        Name = "Mazen" ;
        Department = "Not assigned yet" ;
        Salary = 3000 ;
        Bouns = 200 ;
        Resident = true ;
        no_of_objects ++;
    }
    public Employee(int i , String n ) {
        EMP_ID = i ;
        Name = n ;
        no_of_objects ++;
    }
    public Employee(int i , String n ,boolean r) {
        EMP_ID = i ;
        Name = n ;
        Resident = r ;
        no_of_objects ++;
    }
    public Employee(int i , String n ,double s , double b ,boolean r ) {
        EMP_ID = i ;
        Name = n ;
        Resident = r ;
        Salary = s ;
        Bouns = b ;
        no_of_objects ++;
    }
    public void setSalary1(double s) {
        Salary = s ;
    }
    public void setSalary(double s ,double b) {
        this.setSalary1(s);
        Bouns = b ;
    }
    public static int get_No_of_objects () {
        return no_of_objects ;
    }
    public void print_DataEmployee() {
        System.out.println("Your ID is : " + EMP_ID);
        System.out.println("Your Name is : " + Name);
        System.out.println("Your Department is : " + Department);
        System.out.println("Your Salary is : " + Salary);
        System.out.println("Your Bouns is : " + Bouns);
        System.out.println("Your Resident is : " + Resident);
    }
}
