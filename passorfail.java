import java.util.Scanner;

/**
 * Write a description of class passorfail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passorfail
{
    public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a>=40){
            System.out.println("you are pass with " + a);
            
        }
        else
        {
             System.out.println("you are fail with " + a);
            }
        
    }
}