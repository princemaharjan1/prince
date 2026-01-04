package week9;


/**
 * Write a description of class savingaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class savingaccount extends Bankaccount
{
    int intrestrate;
    public savingaccount(int accountnumber,String accountholdername,double balance,int intrestrate){
    super(accountnumber,accountholdername,balance);
    this.intrestrate = intrestrate;
    }
    double calculateIntrestrate(){
        double intrest = super.getbalance() * intrestrate / 100;
        return intrest;
    }
}