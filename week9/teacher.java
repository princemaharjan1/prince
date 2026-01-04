package week9;


/**
 * Write a description of class teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class teacher extends person
{
    String Subject;
    double bonus;
    public teacher(int id,String name,double basicsalary,String Subject,double bonus)
{
    super(id,name,basicsalary);
    person.collegename = collegename;     
    this.Subject = Subject;
    this.bonus = bonus;
}
    public double calculateAnnualsalary(){
        
        return super.calculateAnnualsalary() + bonus;
    }

}