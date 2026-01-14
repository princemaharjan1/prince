package week10;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends order
{
    public NormalOrder(String customerName,double amount,int orderId){
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
