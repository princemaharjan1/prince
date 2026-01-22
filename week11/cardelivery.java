package week11;


/**
 * Write a description of class cardelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cardelivery extends delivery implements notificationsystem
{
    private static final double per_km_charge = 40;
    private static final double min_per_km = 5;
    public cardelivery(int orderID,double distanceInkm,String pickuplocation,String dropOffLocation){
        super(orderID,distanceInkm,pickuplocation,dropOffLocation);
        
    }
    @Override
    public double calculateCharge(){
        return super.getdistance() * per_km_charge;
    }
    @Override
    public double estimateTime(){
        return super.getdistance() * min_per_km;
    }
    @Override 
    public void notify(String message){
        System.out.println(message);
    }
    public double display(){
        return 0;
    }
}