package week10.week10tutorial;


/**
 * Write a description of class hospital_app here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospital_app
{
    public static void main(String[] args)
    {
        person p1=new person(101,"Sandesh");
        System.out.println(p1);  
        doctor d1=new doctor(1,"Suraj","Opthamologist",5000);
        System.out.println(d1);
        System.out.println(d1.calculatesalary());
        System.out.println(d1.calculatesalary(2));
        d1.displayDetails();
        nurse n1 = new nurse(12,"luckymam","orthologist",1200);
        System.out.println(n1.calculatesalary());
        System.out.println(n1.calculatesalary(2000));
        
       
    }
}