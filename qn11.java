import java.util.Scanner;

/**
 * Write a description of class qn11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn11
{
      public static void main(String[] args){
        int income;
        float extra1,extra2,extra3,extra4,extra5,extra6;
        extra6 = 0f;
        extra5 = 0f;
        extra4 = 0f;
        extra3 = 0f;
         extra2 = 0f;
         extra1 = 0f;
         
        
        String B="90";
        
      
      
        Scanner rr = new Scanner(System.in);
         System.out.println("income");
        income=rr.nextInt();
       if(income <=500000){
         B = "A0";  
        }
         else if(income <=700000){
         B = "A1";  
        }
         else if(income <=1000000){
         B = "A2";  
        }
         else if(income <=2000000){
         B = "A3";  
        }
          else if(income <=5000000){
         B = "A4";  
        }
          else if(income >5000000){
         B = "A5";  
        }
        else 
        {
            B= "0";
        }
        
     
        switch(B) {
            case "A5":
              extra1 = income * 0.39f;
                System.out.println("income tax for uptoo");
                
                 case "A4":
                
                 extra2 = income * 0.36f;
                System.out.println("income tax for uptoo");
              case "A3":
               
                  extra3 = income * 0.30f;
                System.out.println("income tax for uptoo");
                case "A2":
                extra4 = income * 0.20f;
                System.out.println("income tax for uptoo");
                
                 case "A1":
             
                 extra5 = income * 0.10f;
                 
                System.out.println("income tax for uptoo");
                
                 case "A0":
                     extra6 = income * 0.01f;
                System.out.println("income tax for uptoo");
                break;
                default :
                    System.out.println("invalid number");
                    
                
            
        }
        float sum = extra1+extra2+extra3+extra4+extra6+extra5;
        System.out.println("your total income  tax s" +sum);
    }

}