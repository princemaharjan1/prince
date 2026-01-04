package week8;


/**
 * Write a description of class employeesalaary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeesalaary
{
    private double basicSalary;
    public employeesalaary(double basicSalary){
       this.basicSalary=basicSalary;
    }
    public void setbasicsalary(double basicSalary){
        
        this.basicSalary= basicSalary;
        
    }
    public double getbasicsalary(){
        return this.basicSalary;
    }
    
    public double calculateGrossSalary(){
        this.basicSalary = this.getbasicsalary();
        double grosssalary= (basicSalary + ((basicSalary * 20)/100));
        
        return grosssalary;
    }
}