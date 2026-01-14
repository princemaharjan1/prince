package week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends order
{
     public PremiumOrder(String customerName,double amount,int orderId){
        super(customerName,amount,orderId);
        
    }
    @Override
    public double calculateFinalAmount(){
        return getamount();
    }
    public double calculateFinalAmount(double discountamount){
        return super.calculateFinalAmount() - discountamount;
    }
    @Override
     public String toString(){
         return super.toString();
     }
}