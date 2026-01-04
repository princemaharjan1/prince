package week8;


/**
 * Write a description of class shoppingapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingapp
{
    public static void main(String[] args){
        shoppingcart s1 = new shoppingcart("ball",1200,10);
        s1.getquantity();
        s1.calculateTotal();
        s1.calculatediscountedTotal(12);
        s1.displaycart();
        
    }
}