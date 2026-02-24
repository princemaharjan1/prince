package week16;
import java.util.Scanner;


/**
 * Write a description of class quetsion4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quetsion4
{
    public static void main(String[] args){
        System.out.println("your word");
        Scanner scan = new Scanner(System.in);
        String Search = scan.nextLine();
        System.out.println("your word");
        
        String TurnUpperCase = Search.toUpperCase();
        System.out.println("the upeer case is  = ");
        System.out.println(TurnUpperCase);
        
        String TurnLowerCase = Search.toLowerCase();
        System.out.println("the lower case is  = ");
        System.out.println(TurnLowerCase);
        StringBuilder title = new StringBuilder();
        
        String[] SplitedData = TurnUpperCase.split(" ");
        for(String x : SplitedData){
            String Conveter = x.substring(0,1).toUpperCase();
            String RemainingConverter = x.substring(1).toLowerCase();
            title= title.append(Conveter).append(RemainingConverter).append(" ");
            
            
            
        }
        System.out.println(title);
        
        
    }
}