package week9;


/**
 * Write a description of class ParentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee
{
    int HRA;
    int DA;
    public PermanentEmployee(int employeeID,String name,int Basicsalary,int HRA,int DA){
        super(employeeID,name,Basicsalary);
        this.HRA = HRA;
        this.DA = DA;
    }
    double calculateTotalSalary(){
        double total = Basicsalary + HRA + DA + CalculateBonus();
        return total;
    }
}