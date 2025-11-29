import java.util.Scanner;

/**
 * Write a description of class sellingprice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellingprice
{
     public static void main(String[] args){
        float a;
        float sp;
        float inte;
        
         
        System.out.println("category\tdiscounts");
        System.out.println("A\t60%");
        System.out.println("B\t40%");
        System.out.println("C\t20%");
        System.out.println("D\t10%");
          System.out.println("category");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0); 
    System.out.println("amount");
         Scanner mp = new Scanner(System.in);
         a = mp.nextFloat();
        
        if(c=='A'){
            sp = a * 60/100f;
            inte=a-sp;
            System.out.println("your amount after 60 % dis is" + inte);
            
        }
        else if(c=='B')
        {
          sp = a * 40/100f;
            inte=a-sp;
            System.out.println("your amount after 40 % dis is" + inte);
        }
        
        else if(c=='C')
        {
                sp = a * 20/100f;
            inte=a-sp;
            System.out.println("your amount after 20 % dis is" + inte);
            }
       else if(c=='D')
        {
                sp = a * 10/100f;
            inte=a-sp;
            System.out.println("your amount after 10 % dis is" + inte);
        }
            else 
            {
                inte=a;
               System.out.println("your amount after no discounbt is" + inte);
            }
        
        }
    }
