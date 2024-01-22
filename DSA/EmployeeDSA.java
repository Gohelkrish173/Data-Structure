import java.util.*;
public class EmployeeDSA 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.println("id");
        int employee_ID=jt.nextInt();
        System.out.println("salary");
        int salary=jt.nextInt();
        System.out.println("name");
        String name=jt.next();
        System.out.println("de");
        String designation=jt.next();

        Employee_Details ED=new Employee_Details(employee_ID,name,designation,salary);
        ED.printAllDetils();
    }
}
class Employee_Details
{
    int employee_ID,salary;
    String name,designation;
    Employee_Details(int employee_ID,String name,String designation,int salary)
    {
        this.employee_ID=employee_ID;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    public void printAllDetils()
    {
        System.out.println("employee_ID "+employee_ID+" name "+name+" designation "+designation+" salary "+salary);
    }
}
