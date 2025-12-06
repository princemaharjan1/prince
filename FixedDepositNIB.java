import java.util.Scanner;

/**
 * Write a description of class senarioko1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main(){
float P;//→ principal (deposit amount in Rs.)
float AnnualRate;//→ annual interest rate in % (for example: 8, 9, 10, 11, 12)
float MonthlyRate;//→ calculate monthly rate using annual rate.
int years;//→ duration in years
float months;// → total number of months
float A; //→ maturity amount (before fee)
float feeRate;// → processing fee rate (0.5% = 0.005)
float fee;// → processing fee amount
float FinalAmount;// → amount customer actually receives.
float temprate = 0;
float c =0;
System.out.print("please enter your amount for deposit : ");
Scanner scan = new Scanner(System.in);
P = scan.nextFloat();
System.out.println("");
        if(P > 1000){
        System.out.println("our annual rate for the fixed deposit is : %");
        AnnualRate = scan.nextFloat();
        System.out.println("");//calculate monthly rate
        MonthlyRate = AnnualRate / 12;
       
        temprate = P * MonthlyRate/100;
        float temp ;
        System.out.println("our MOnthly rate for the fixed deposit is : " + MonthlyRate);
       

        System.out.println("please enter your how long do you plan on keeping the money on deposit(in years)");
        years = scan.nextInt();
        months = years * 12;
        float month = 1;
         System.out.println("");
         do{
            c = c + temprate;
            month ++;
        }while(month <= months);
         System.out.println("our total rate for the fixed deposit is : " + c);
        
         A = P + c;
          System.out.println("our total Amount before adding the fees is : " + A);  
           System.out.println("our total Amount before adding the fees is : 0.5 %");
           float percent = ((A * 5) / 100f);
           System.out.println("our total fees is : 0.5 % : " + percent);
           A -= percent;
    
      System.out.println("our total Amount after adding the fees is : " + A); 
 
    }
          else 
          {
              System.out.println("INvalid amount");
            }
          
    }
}