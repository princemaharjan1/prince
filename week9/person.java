package week9;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    int id;
    String name;
    double basicsalary;
    static String collegename;
    public person(int id,String name,double basicsalary){
        this.id = id;
        this.name= name;
        this.basicsalary = basicsalary;
        
    }
    public double calculateAnnualsalary(){
        double annual = basicsalary * 12;
        return annual;
    }
    public static void main(String[] args){
        person new1 = new person(12,"profeal",12000);
        System.out.println(new1.calculateAnnualsalary());
        new1.collegename = "islington";
        teacher new2 = new teacher(14,"prince",120000,"science",1200);
        System.out.println(new2.calculateAnnualsalary());
        staff new3 = new staff(14,"prince",120000,9,20);
        System.out.println(new3.calculatesalary());
        System.out.println(new3.collegename);
    }
}