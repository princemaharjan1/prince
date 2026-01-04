package week8;


/**
 * Write a description of class shoppingcart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingcart
{
    private String itemName;
    private double itemprice;
    private int quantity;
    public shoppingcart(String itemName,double itemprice,int quantity){
        this.itemName = itemName;
        this.itemprice = itemprice;
        this.quantity = quantity;
        
    }
    public void setquantity(int quan){
        this.quantity = quan;
        
    }
    public int getquantity(){
       return this.quantity;
        
    }
    public double calculateTotal(){
        this.itemprice = getquantity() * this.itemprice;
        return this.itemprice;
    }
    public double calculatediscountedTotal(double discountpercent){
        this.itemprice = this.itemprice - ((this.itemprice * discountpercent)/100);
        return this.itemprice;
    }
    public void displaycart(){
        System.out.print("\n item = "+ this.itemName);
        System.out.print(" price = "+ this.itemprice);
        System.out.print("quantity = "+ this.quantity);
    }
}