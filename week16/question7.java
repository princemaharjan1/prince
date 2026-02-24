package week16;
import java.util.*;

/**
 * Write a description of class questio7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String PhoneNumber = scan.nextLine();
        boolean Checker = PhoneNumber.matches("9[7/8]\\d{8}");
        if(Checker == true){
            System.out.println("matches");
        }
        else 
        {
            System.out.println("no matches");
        }
        
        
        }
    }