package week16;
import java.util.Scanner;


/**
 * Write a description of class question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question1
{
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        System.out.println("first word");
        String first = ab.nextLine();
        System.out.println("second word");
        String second = ab.nextLine();
        String sum = first.concat(second);
        System.out.println("third word");
        String compared = ab.nextLine();
        System.out.println("sum of words = "+ sum);
        if(compared.equals(sum)){
            System.out.println("equal");
            
        }
        else
        {
            System.out.println("not equal");
        }
        
        
        
        
    }}