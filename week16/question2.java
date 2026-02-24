package week16;
import java.util.Scanner;


/**
 * Write a description of class question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question2
{
    public static void main(String[] args){
        System.out.println("your word");
        Scanner scan = new Scanner(System.in);
        
        //how trim works
        String word = scan.nextLine();
        String TrimmedWord = word.trim();
        System.out.println("your words withour whitespace are = " + TrimmedWord);
        
        //how substring works
        String SlicedWord = word.substring(0,10);
        System.out.println("your words that are till 10 letters are = " + SlicedWord);
        
        //hwo split works
        String[] SplitedWords = word.split(" ");
        for(String x : SplitedWords){
         System.out.println("your words that are till 10 letters are = " + x);   
        }
        
        
        
        
    }
}