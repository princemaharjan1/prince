package week8;


/**
 * Write a description of class mainemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainemployee
{
    public static void main(String[] args){
        employeesalaary e1 = new employeesalaary(12212.21);
        e1.calculateGrossSalary();
        System.out.println("new salary = " + e1.calculateGrossSalary());

    }
}