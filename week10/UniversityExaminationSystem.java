package week10;


/**
 * Write a description of class UniversityExaminationSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityExaminationSystem
{
    public static void main(String[] args){
        Student s1 = new Student(122,"prince",70);
        System.out.println(s1.calculateResult());
        ManagementStudent m1 = new ManagementStudent(9,"pro",90,1);
        System.out.println(m1.calculateResult());
        ScienceStudent ss1 = new ScienceStudent(89,"prwo",10,1);
        System.out.println(ss1.calculateResult());
        System.out.println(ss1);
        System.out.println(s1);
         System.out.println(m1);
    }
}