package week11;


/**
 * Write a description of class delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class delivery
{
    private int orderID;
    private double distanceInkm;
    private String pickuplocation;
    private String dropOffLocation;
    public delivery(int orderID,double distanceInkm,String pickuplocation,String dropOffLocation){
        this.orderID = orderID;
        this.distanceInkm = distanceInkm;
        this.pickuplocation = pickuplocation;
        this.dropOffLocation = dropOffLocation;
    }
    public double getdistance(){
        return this.distanceInkm;
    }
    public abstract double calculateCharge();
    public abstract double estimateTime();
    
    
}