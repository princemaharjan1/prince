package week10;


/**
 * Write a description of class order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class order
{ 
    private String customerName;
    private double amount;
    private int orderId;
    public order(String customerName,double amount,int orderId){
        this.customerName = customerName;
        this.amount = amount;
        this.orderId = orderId;
    }
    public void setcustomerName(String newcustomerName){
        this.customerName = newcustomerName;
    }
    public String getcustomerName(){
        return this.customerName;
    }
    public void setbalance(int newamount){
        this. amount = newamount;
    }
    public double getamount(){
        return this.amount;
    }
    public void setorderId(int neworderId){
        this.orderId = neworderId;
    }
    public int getorderId(){
        return this.orderId;
    }
    public double calculateFinalAmount(){
        return amount;
    }
     @Override
     public String toString(){
         return super.toString() + "customer name : "+getcustomerName()+"amount : "+getamount()+"orderID; "+getorderId();
     }
}