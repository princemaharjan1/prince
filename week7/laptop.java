package week7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    int ram;
    String brand;
    int price;
    public laptop(int ram,String brand,int price){
        this.ram = ram;
        this.brand=brand;
        this.price=price;
    }
    public void display(){
        if(this.ram>8){
        System.out.println("name is = "+ brand + "price is = "+ price+ "ram is = "+ ram);
    }
    }
}