package week16;
import java.util.Scanner;


/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question3
{ public static void main(String[] args){
        System.out.println("your word");
        Scanner scan = new Scanner(System.in);
        String SearchIndex = scan.nextLine();
        System.out.println("your word");
        int Search = SearchIndex.indexOf("prince");
        System.out.println("the index of prince is at  = ");
        System.out.println(Search);
        char FirstLetter = SearchIndex.charAt(0);
        if(SearchIndex.contains("prince")){
            System.out.println("contains prince");
        }
        else
        {
           System.out.println(" doesnt contains prince");
        }
    }
}