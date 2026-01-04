import java.util.Scanner;

/**
 * Write a description of class senarioforworkshop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickShawFare
{
    public static void main(String[] args){
        int fee;
        float calc;
        float dev;
        
        System.out.println("your fees");
        Scanner scan=new Scanner(System.in);
        fee = scan.nextInt();
        dev=fee*10/100;
        calc=(fee>=100)?fee-dev:fee-5;
        System.out.println("your total fee is : " + calc);
        
        
        
        
        
        
    }
}