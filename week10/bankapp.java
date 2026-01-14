package week10;


/**
 * Write a description of class bankapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankapp
{
    public static void main(String[] args){
        current c1 = new current("prince",12290,1220);
        saving s1 = new saving("prince12",1220,1220);
        System.out.println("intrest  for current"+c1.calculateintrest());
        System.out.println("intrest  for saving"+s1.calculateintrest(80));
        System.out.println(s1);
        System.out.println(c1);
        
    }
}