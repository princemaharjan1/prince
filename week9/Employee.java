package week9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    int employeeID;
    String name;
    int Basicsalary;
    public Employee(int employeeID,String name,int Basicsalary){
        this.employeeID = employeeID;
        this.name = name;
        this.Basicsalary = Basicsalary;
    }
    public double CalculateBonus(){
        int c = (10 * this.Basicsalary)/100;
        return c;
    }
    public void DisplayEmployee(){
        System.out.println("employee details");
        System.out.println(employeeID);
        System.out.println(name);
        System.out.println(Basicsalary);
    }
}