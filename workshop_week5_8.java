import java.util.Scanner;

/**
 * Write a description of class ko here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop_week5_8
{
    public static void main(String[] args){
        int multiple;
         System.out.println("first number");
      Scanner scan1 = new Scanner(System.in);
      int first =scan1.nextInt();
      for(int i = 1;i<=10;i++){
          multiple = i * first;
          System.out.println(multiple);
          
      }
        
    }
}