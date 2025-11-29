import java.util.Scanner;

/**
 * Write a description of class qn8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn8
{
    public static void main(String[] args){
    float gpa;
    Scanner scan = new Scanner(System.in);
    Float ask = scan.nextFloat();
   if(ask == 4.00){
       
            System.out.println("you got A +");
            //nested if else
        }
        else if(ask>=3.6 && ask<4.0)
        {
        
             System.out.println("you got A");
        }
    
       else if(ask>=3.2&& ask<3.6)
        {
        
             System.out.println("you got B+");
        }
        else if(ask>=2.8&& ask<3.2)
        {
        
             System.out.println("you got B");
        }
        else if(ask>=2.4&& ask<2.8)
        {
        
             System.out.println("you got C + ");
        }
         else if(ask>=2 && ask<2.4)
        {
        
             System.out.println("you got C + ");
        }
        else 
        {
                         System.out.println("you got f ");
        }
        
}  
}