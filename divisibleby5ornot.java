import java.util.Scanner;

/**
 * Write a description of class divisibleby5ornot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisibleby5ornot
{ public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a%5==0){
            if(a%3==0){
            System.out.println("you are divisible by 3 and 5 with " + a);
            //nested if else
        }
        else
        {
        
            System.out.println("you are only divisible by 5 but no 3 with positive with " + a);
        }
        }
        else if(a%3==0)
        {
             System.out.println("you are only divisible by 3 ut not 5 with " + a);
            }
        else 
        System.out.println("you are not divisible by both with " + a);
    }
}