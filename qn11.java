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
       if(income >0 && income <=500000){
         B = "A0";  
         
        }
         else if(income >500000 && income <=700000){
         B = "A1";  
        
        }
         else if(income >700000 && income <=1000000){
         B = "A2";  
        
        }
         else if(income >1000000 && income <=2000000){
         B = "A3";  
        
        }
          else if(income >2000000 && income <=5000000){
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
                income= income - 5000000;
              extra1 = income * 39/100f;
                System.out.println("income tax for uptoo");
                extra2 = 1135000;
                extra3 = 335000;
                extra4 = 35000;
                extra5 = 15000;
                extra6 = 5000;
                break;
                 case "A4":
                income= income - 2000000;
                 extra2 = income * 36/100f;
                System.out.println("income tax for uptoo");
                extra3 = 335000;
                extra4 = 35000;
                extra5 = 15000;
                extra6 = 5000;
                break;
              case "A3":
               income= income - 1000000;
                  extra3 = income * 30 /100f;
                System.out.println("income tax for uptoo");
                extra4 = 35000;
                extra5 = 15000;
                extra6 = 5000;
                break;
                
                case "A2":
                    income= income - 700000;
                extra4 = income * 20 /100f;
                System.out.println("income tax for uptoo");
                 extra5 = 15000;
                extra6 = 5000;
                break;
                 case "A1":
             income= income - 500000;
                 extra5 = income * 10/100f;
                   extra6 = 5000;
                 
                System.out.println("income tax for uptoo");
                break;
                 case "A0":
                     
                     extra6 = income * 1/100f;
                System.out.println("income tax for uptoo");
                break;
                default :
                    System.out.println("invalid number");
                    break;
                
            
        }
        float sum = extra1+extra2+extra3+extra4+extra6+extra5;
        System.out.println("your total income  tax s" +sum);
    }

}