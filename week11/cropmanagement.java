package week11;


/**
 * Write a description of class cropmanagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cropmanagement
{
    public static void main(){
        Maize m1 = new Maize(120);
        m1.TransportCost(120);
        m1.TransportMethod();
        Wheat w1 = new Wheat(1300);
        w1.TransportCost(100);
        w1.TransportMethod();
        Rice r1 = new Rice(90);
        r1.TransportCost(80);
        r1.TransportMethod();
        
    }
}