package week11;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle extends shape implements drawable
{
    private double length;
    private double breadth;
    public rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getlength(){
       return this.length;
    }
    public void setlength(double newlength){
        this.length = newlength;
    }
    public double getbreadth(){
       return this.length;
    }
    public void setbreadth(double newbreadth){
        this.breadth = newbreadth;
    }
    @Override 
    public void draw(){
        System.out.println("drawing rectangle");
    }
    @Override
    public double calculateArea(){
        return getlength() * getbreadth();
    }
    @Override
    public double calculatePerimeter(){
        return 2 * (getlength() + getbreadth());
    }
}