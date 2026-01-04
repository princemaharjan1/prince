package week9;


/**
 * Write a description of class bankapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankapp
{
    public static void main(String[] args){
        savingaccount b1 = new savingaccount(12,"rajesh",123000,7);
        b1.deposit(12000);
        System.out.println("balance of saving account is = "+ b1.getbalance());
        System.out.println(b1.calculateIntrestrate()+ "\n");
        //current
        currentaccount b2 = new currentaccount(133,"kaido",122290,12000);
        b2.withdraw();
        System.out.println("balance of current account is = "+ b2.getbalance());
        
    
        
        
    }
}