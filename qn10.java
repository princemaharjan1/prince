
import java.util.Scanner;

public class qn10
{
    public static void main(String[] args){
        float length;
        float breadth;
        String B="90";
        
      
        System.out.println("breadth");
        Scanner rp = new Scanner(System.in);
        breadth=rp.nextFloat();
        Scanner rr = new Scanner(System.in);
         System.out.println("length");
        length=rr.nextFloat();
        if(length == 841 && breadth ==1189){
         B = "A0";

            
        }
        if(length == 594 && breadth ==841){
             B = "A1";
            
        }
        else if(length == 420 && breadth ==594){
             B = "A2";
            
        }
        else if(length == 297 && breadth ==420){
           B = "A3";
            
        }
        else if(length == 210 && breadth ==297){
            B = "A4";
            
        }
        else if(length == 148 && breadth ==210){
            B = "A5";
            
        }else 
        {
            System.out.println("invalid");
        }
        
       
     
        
        switch(B) {
            case "A0":
              
                System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches)");
                break;
                 case "A1":
                
                System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");
                break;
              case "A2":
               
                System.out.println("2: 420 x 594 mm (16.5 x 23.4 inches)");
                break;
                case "A3":
                
                System.out.println("A3: 297 x 420 mm (11.7 x 16.5 inches)");
                break;
                 case "A4":
             
                System.out.println("A4: 210 x 297 mm (8.3 inches)" );
                break;
                 case "A5":
                
                System.out.println("A5: 148 x 210 mm (5.8 inches)");
                break;
                default :
                    System.out.println("invalid size");
                    
                
            
        }
    }
}