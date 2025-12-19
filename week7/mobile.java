package week7;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    int price;
    String brand;
    public mobile(int price,String brand){
        this.price=price;
        this.brand=brand;
    }
    public void isAffordable(){
        if(price <=20000){
            System.out.println("price is = "+ price+" brand is= "+ brand);
        }
    }
}