package week9;


/**
 * Write a description of class Bankaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankaccount
{
    int accountnumber;
    String accountholdername;
    double balance;
    public Bankaccount(int accountnumber,String accountholdername,double balance){
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance = balance + amount;
    }
    public double getbalance(){
        return this.balance;
    }
    
}