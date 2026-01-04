package week9;


/**
 * Write a description of class staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class staff extends person
{
    int workinghours;
    double rateperhour;
    
    public staff(int id,String name,double basicsalary,int workinghours,double rateperhour){
        super(id,name,basicsalary);
        person.collegename = collegename;
        this.workinghours = workinghours;
        this.rateperhour = rateperhour;
    }
    public double calculatesalary(){
        return workinghours * rateperhour;
    }
}