package corejava;
import java.io.*;
import java.util.Scanner;
//Create a class Employee with the following instance variables
class Employee 
{ 
    private long emp_id,emp_phone; 
    private String emp_name,emp_address; 
    private double basic_salary,special_allowance,house_rent_allowence;
	
    Employee() 
    {
        emp_id = 0; 
        emp_phone = 0; 
        emp_name = ""; 
emp_address=""; 
    basic_salary=0.0; 
    special_allowance=250.00; 
    house_rent_allowence = 1000.50; 
} 
//Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables
Employee(long id,String n,String a,long p,double s) 
{
    emp_id = id; 
    emp_phone = p; 
    emp_name = n; 
    emp_address=a; 
    basic_salary=s; 
    special_allowance=250.00; 
    house_rent_allowence = 1000.50; 
}
public double getbasic_salary()
{
    return basic_salary;
}
//Create a method calculateSalary in which the basic salary needs to be calculated as below
    public double calculateSalary()
    {
        double salary = basic_salary+(basic_salary*special_allowance*0.01)+(basic_salary* house_rent_allowence/100);
        return salary;
    }
    public double calculateTransportAllowance()
    {
        return 0.01*basic_salary;
    }
}
/*Create the sub classes Manager and Trainee with base class Employee.
 * Create overloaded constructors which takes the below parameters and initializes them to their respective variables in the Constructor parameter Instance Variable*/
class Manager extends Employee
{
	 Manager(long id,String n,String a,long p,double s) 
	    { 
	        super(id,n,a,p,s);
	    }
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getbasic_salary();
    } 
}
//Create a class "EmployeeDetails.java" with a main method. 
class EmployeeDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.next()), Double.parseDouble(sc.next()));
		//96, "Tejas", "Mumbai", 183143, 15000
		sc.close();
		double salary = m.calculateSalary();
		System.out.println("Manager's Salary : " + salary);
		System.out.println("Manager's Transport Allowance (15%) : " + m.calculateTransportAllowance(m, 15));
	}
}
