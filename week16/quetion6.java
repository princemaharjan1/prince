package week16;
import java.util.Scanner;


/**
 * Write a description of class quetion7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quetion6
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String StringTaker1 = scan.nextLine();
        int IndexFinder = StringTaker1.length();
        StringBuilder reverse = new StringBuilder();
         
        for(int i = IndexFinder-1;i >= 0;i--)
        {
            reverse = reverse.append(StringTaker1.charAt(i));
            
        }
        System.out.println(reverse);
        String Checker = reverse.toString();
        if(StringTaker1.equals(reverse)){
            System.out.println("palindroome");
            
        }
        else 
        {
            System.out.println("not palindroome");
        }
    }
}