package week9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vechicle
{
    int vechicleID;
    String brand;
    double BasePrice;
    
    public Vechicle(int vechicleID,String brand,double BasePrice){
        this.vechicleID = vechicleID;
        this.brand = brand;
        this.BasePrice = BasePrice;
        
    }
    public void displayVehicleInfo(){
        System.out.println("id  = "+vechicleID + " brand = "+brand + "BASEPRICE = "+ BasePrice);
        
    }
    public double calculateTax(){
        return (10 * this.BasePrice)/100;
    }
    public static void main(String[] args) {
        Bike b1 = new Bike(150.0,101,"Yamaha",300000);
        Car c1 = new Car(4,"Petrol",889,"Toyota",2500000);
        //bike
        System.out.println("Bike Details:");
        b1.displayVehicleInfo();
        System.out.println("Final Price = " + b1.calculateFinalPrice());
        System.out.println();
        //car
        System.out.println("Car Details:");
        c1.displayVehicleInfo();
        System.out.println("Final Price = " + c1.calculateFinalPrice());
    }
}

 