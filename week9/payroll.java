package week9;


/**
 * Write a description of class payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class payroll
{
    public static void main(String[] args){
        PermanentEmployee obj1 = new PermanentEmployee(12,"prince",120000,12,1);
        obj1.DisplayEmployee();
        obj1.calculateTotalSalary();
        System.out.println("salary = "+ obj1.calculateTotalSalary());
        //contract
        ContractEmployee obj2 = new ContractEmployee(13,"sandesh sir",12000,9);
       
        obj2.calculateTotalSalary();
        System.out.println("salary = "+ obj2.calculateTotalSalary());

        obj2.DisplayEmployee();
    }
}