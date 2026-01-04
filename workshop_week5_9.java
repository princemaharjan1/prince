import java.util.Scanner;

/**
 * Write a description of class ko9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop_week5_9
{
    public static void main(String[] args){
        /*int abc;
        int cba;
        int bcd;
        int ola,cola;*/
        int div;
        int rem=0;
       System.out.println("first number");
      Scanner scan1 = new Scanner(System.in);
      int first =scan1.nextInt();
     System.out.println(first); 
     while(first > 0 ) {
       div = first % 10;
       rem =  rem * 10 + div;
       first = first /10;
         
         
     }
      System.out.println(rem);
    /* abc = first / 10 ;
     ola = abc / 10 ;
     cba = abc % 10;
     bcd = cba * 10 + abc;
     cola = bcd * 10+ ola;
     System.out.println(cola);*/
}
}