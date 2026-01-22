package week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice implements Transportable
{
    private int transportfee;
    public Rice(int transportfee){
        this.transportfee = transportfee;
        
    }
    public void settransportfee(int newtransportfee){
        this.transportfee = newtransportfee;
    }
    public int gettransportfee(){
        return this.transportfee;
    }
    @Override
    public void TransportCost(int waterrequirement){
        System.out.println("transportcost = " + (waterrequirement * transportfee));
    }
    @Override
    public void TransportMethod(){
        System.out.println("transport method = truck");
    }
}