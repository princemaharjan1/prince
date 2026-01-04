import java.util.Scanner;

/**
 * Write a description of class positiveornegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class positiveornegative_orzero
{   public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a>0){
            System.out.println("you are positive with " + a);
            
        }
        else if(a<0)
        {
             System.out.println("you are negative with " + a);
            }
        else 
        System.out.println("you are zero with" + a);
    }

}