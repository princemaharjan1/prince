import java.util.Scanner;

/**
 * Write a description of class evenorodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenorodd
{   public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a%2==0){
            System.out.println("you are even with" + a);
            
        }
        else
        {
             System.out.println("you are odd with " + a);
            }
        
    }

}