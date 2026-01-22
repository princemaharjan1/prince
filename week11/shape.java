package week11;


/**
 * Write a description of class shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class shape
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void displayshapeinfo(){
        System.out.println("area : "+ calculateArea());
        System.out.println("Perimeter : "+ calculatePerimeter());
    }
    
}