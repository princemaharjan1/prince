package week10;


/**
 * Write a description of class saving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class saving extends Account
{
    public saving(String holderName,double balance,int accountNo){
        super(holderName,balance,accountNo);
    }
    @Override
    public double calculateintrest(){
        return super.calculateintrest() * getbalance();
    }
    public double calculateintrest(double rate){
        return ((super.calculateintrest()+rate) * getbalance())/100;
    }
     @Override
     public String toString(){
         return super.toString();
     }
     public String toString(double rate){
         return "holder name : "+getholderName()+"balance : "+getbalance()+"accountNO ; "+getaccountNo() + "rate " + (rate+this.calculateintrest());
     }
}