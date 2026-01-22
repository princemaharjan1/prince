package week11;


/**
 * Write a description of class calculateshape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculateshape
{
    public static void main(String[] args){
        circle b1 = new circle(12);
        b1.draw();
        System.out.println(b1.calculateArea());
        System.out.println(b1.calculatePerimeter());
        b1.displayshapeinfo();
        rectangle b2 = new rectangle(12,12);
        b2.draw();
        System.out.println(b2.calculateArea());
        System.out.println(b2.calculatePerimeter());
        b2.displayshapeinfo();
    }
}