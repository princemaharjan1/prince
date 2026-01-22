package week11;


/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle extends shape implements drawable
{
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double getradius(){
       return this.radius;
    }
    public void setradius(double newradius){
        this.radius = newradius;
    }
    @Override 
    public void draw(){
        System.out.println("drawing circle");
    }
    @Override
    public double calculateArea(){
        return ((22/7) * getradius()) + ((22/7) * getradius());
    }
    @Override
    public double calculatePerimeter(){
        return 2 * (22/7) * getradius();
    }
}