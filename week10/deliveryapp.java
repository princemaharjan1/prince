package week10;


/**
 * Write a description of class deliveryapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryapp
{
    public static void main(String[] args){
        DeliveryPartner d1 = new DeliveryPartner(1,"rochit",12000);
        System.out.println(d1);
        System.out.println(d1.calculatePayment());
        
        CarDelivery c1 = new CarDelivery(2,"price",12000,2);
        System.out.println(c1.calculatePayment());
        System.out.println(c1);
        
        BikeDelivery b1 = new BikeDelivery(3,"lucky",129,9);
        System.out.println(b1.calculatePayment());
        System.out.println(b1);
        
    }
}