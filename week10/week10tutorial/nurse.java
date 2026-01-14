package week10.week10tutorial;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
    private String shift;
    private double extraAllowance;
    public nurse(int id,String name,String shift,double extraAllowance){
        super(id,name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    public void setextraAllowance(int allawance){
        this.extraAllowance = allawance + extraAllowance;
    }
    public double getextraAllowance(){
        return this.extraAllowance;
    }
    public void setshift(String newshift){
        this.shift = newshift;
    }
    public String getshift(){
        return this.shift;
    }
    @Override
    public double calculatesalary(){
        double basefee = super.calculatesalary();
        double normalfee = basefee + (getextraAllowance() * 30);
        return normalfee;
    }
    
    public double calculatesalary(double salary){
        double basefee = super.calculatesalary();
        double normalfee = salary + basefee + (getextraAllowance() * 30);
        return normalfee;
    }
}