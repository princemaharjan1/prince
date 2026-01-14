package week10.week10tutorial;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
    private String specialization;
    private double consultationfee;
    public doctor(int id,String name,String specialization,double consultationfee){
        super(id, name);
        this.specialization = specialization;
        this.consultationfee = consultationfee;
        
    }
     public void displayDetails(){
         super.displayDetails();
        System.out.println("specialization = "+ specialization);
         System.out.println("consultationfee :"+ consultationfee);

    }
    public void setspecialization(String newspecialization){
        this.specialization = newspecialization;
    }
    public String getspecialization(){
        return this.specialization;
    }
    public void setconsultationfee(double newconsultationfee){
        this.consultationfee = newconsultationfee;
    }
    public double getconsultationfee(){
        return this.consultationfee;
    }
    @Override
    public double calculatesalary(){
        double basefee = super.calculatesalary();
        double normalfee = basefee + (this.consultationfee * 30);
        return normalfee;
    }
    public double calculatesalary(int emergency){
       double normalpay = this.calculatesalary();
        double emergencyfee = normalpay + emergency;
    return emergencyfee;
    }
     @Override
    public String toString(){
        return super.toString()+",specialization:"+this.specialization;
    }
}