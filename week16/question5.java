package week16;
import java.util.*;


/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String StringTaker1 = scan.nextLine();
        String StringTaker2 = scan.nextLine();
        StringBuilder Sum = new StringBuilder();
        Sum = Sum.append(StringTaker1).append(StringTaker2).append(" ").append("$%").append(1);
        System.out.println(Sum);
    }
}