package week7;
import java.util.Scanner;


/**
 * Write a description of class senarioko7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senarioko7
{
    String accountname;
    int accountnumber;
    int accountbalance;
    
    public senarioko7(String accountname,int accountnumber,int accountbalance){
       this.accountname=accountname;
       this.accountnumber=accountnumber;
       this.accountbalance=accountbalance;  
    }
    public void editor(){
        System.out.println("please choose 1 for deposit 2 for withdraw and 3 for balance");
        Scanner scan = new Scanner(System.in);
        int inpot = scan.nextInt();
        switch(inpot){
            case 1:
            System.out.println("how much do you want to deposit");
            int dip1 = scan.nextInt();
            accountbalance=dip1+accountbalance;
            System.out.println("account name = "+ accountname + "account number = "+ accountnumber + "account new balance = "+ accountbalance);
            break;
             case 2:
            System.out.println("how much do you want to withdraw");
            int dip2 = scan.nextInt();
            if(dip2 > accountbalance){
                System.out.println("you donot have that much money bro");
            }
            else
            {
            int abc=accountbalance-dip2;
            System.out.println("account name = "+ accountname + "account number = "+ accountnumber + "account edited balance = "+ abc);
        }
            break;
            case 3:
            System.out.println("account name = "+ accountname + "account number = "+ accountnumber + "account balance = "+ accountbalance);
            break;
            default :
                break;
        }
        
    }
}