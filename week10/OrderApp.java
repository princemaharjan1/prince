package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String[] args){
        PremiumOrder p1 = new PremiumOrder("prince",1230.90,12);
        System.out.println(p1);
        System.out.println("amount : "+p1.calculateFinalAmount(120.80));
        NormalOrder n1 = new NormalOrder("princ1e",12340.90,12);
        System.out.println(n1);
        System.out.println("amount : "+n1.calculateFinalAmount(1200.80));
    }
}