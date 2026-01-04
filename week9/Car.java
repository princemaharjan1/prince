package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vechicle
{
    int numberOfDoors;
    String fuel;
   
    public Car(int numberOfDoors,String fuel,int vechicleID,String brand,double BasePrice){
        super(vechicleID,brand,BasePrice);
        this.fuel = fuel;
        this.numberOfDoors = numberOfDoors;
    }
    public double calculateFinalPrice(){
        double c = calculateTax() + BasePrice + ((BasePrice * 5)/100);
        return c;
    }
    
    }
