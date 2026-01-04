package week8;


/**
 * Write a description of class balaccemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class atm
{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(1222,129090,"Prince");
        b1.getbalance();
        b1.deposit(12200);
        b1.withdraw(200);
        
    }
}