package week9;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee
{
    int workingdays;
    
    public ContractEmployee(int employeeID,String name,int Basicsalary,int workingdays){
        super(employeeID,name,Basicsalary);
        this.workingdays = workingdays;
    }
    double calculateTotalSalary(){
        double total = Basicsalary * workingdays;
        return total;
    }
    
}