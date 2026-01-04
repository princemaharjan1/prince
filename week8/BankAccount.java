package week8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;
    public BankAccount(int accountNumber,double balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name= name;    
    }
    public void setbalance(double bal){
        this.balance = bal;
        
        
    }
    public double getbalance(){
        
        return this.balance;
    }
    public void deposit(double amount){
        this.balance = this.getbalance() + amount;
        
        System.out.println("the total balance is = " + this.balance);
        
        
    }
    public boolean withdraw(double amount){
        if(amount<=this.balance){
        this.balance = this.getbalance() - amount;
        
        System.out.println("withdraw is Sucessfull");
        return true;
        
    }
    else
    {
        System.out.println("unsucessfull");
        return false;
        
    }
    }
}