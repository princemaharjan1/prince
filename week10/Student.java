package week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private double marks;
    public Student(int rollNo,String name,double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void setrollNo(int newrollNo){
        this.rollNo = newrollNo;
    }
    public int getrollNo(){
        return this.rollNo;
    }
    public void setname(String newname){
        this.name = newname;
    }
    public String getname(){
        return this.name;
    }public void setmarks(double newmarks){
        this.marks = newmarks;
    }
    public double getmarks(){
        return this.marks;
    }
    public String calculateResult(){
        if(marks <= 40){
           return "fail"; 
        }else
        {
           return "pass" ;
        }
    }
    
}