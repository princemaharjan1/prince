package week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    private int orders;
    public CarDelivery(int partnerId,String name,double basePay,int orders){
        super(partnerId,name,basePay);
        this.orders = orders;
    }
    public void setorders(int neworders){
        this.orders = neworders;
    }
    public int getorders(){
        return this.orders;
    }
    @Override
    public double calculatePayment(){
        return super.calculatePayment() * this.orders;
    }
    public double calculatePayment(int neworders){
        return super.calculatePayment() * (this.orders+neworders);
    }
    @Override
    public String toString(){
        return super.toString() +" partnerid = "+ getpartnerId()+" name = "+getname()+" basepay = " + getbasePay() + " orders = " + orders;
    }
}