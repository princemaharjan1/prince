package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vechicle
{
    double engineCapacity;
    public Bike(double engineCapacity,int vechicleID,String brand,double BasePrice){
        super(vechicleID,brand,BasePrice);
        this.engineCapacity = engineCapacity;
    }
   
    double calculateFinalPrice(){
        double c = BasePrice + calculateTax();
        return c;
    }
    }