package week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private String holderName;
    private double balance;
    private int accountNo;
    public Account(String holderName,double balance,int accountNo){
        this.holderName = holderName;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    public void setaccountNo(int newaccountNo){
        this.accountNo = newaccountNo;
    }
    public int getaccountNo(){
        return this.accountNo;
    }
    public void setbalance(int newbalance){
        this.balance = newbalance;
    }
    public double getbalance(){
        return this.balance;
    }
    public void setholderName(String newholderName){
        this.holderName = newholderName;
    }
    public String getholderName(){
        return this.holderName;
    }
    public double calculateintrest(){
        return 0.7;
    }
     @Override
     public String toString(){
         return super.toString() + "holder name : "+getholderName()+"balance : "+getbalance()+"accountNO ; "+getaccountNo();
     }
}