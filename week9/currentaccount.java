package week9;


/**
 * Write a description of class currentaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class currentaccount extends Bankaccount
{
    double Overdraftlimit;
    public currentaccount(int accountnumber,String accountholdername,double balance,double Overdraftlimit)
    {
        super(accountnumber,accountholdername,balance);
        this.Overdraftlimit = Overdraftlimit;
    }
    boolean withdraw(){
    if(Overdraftlimit <= super.balance){
       super.balance = balance - Overdraftlimit;
       super.getbalance();
     return true;
    }
     else
     {
         
         return false;
     }
    }
}
