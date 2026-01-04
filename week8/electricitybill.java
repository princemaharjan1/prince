package week8;


/**
 * Write a description of class electricitybill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class electricitybill
{
    String consumerName;
    int unitsConsumed;
    
    public electricitybill(String consumerName,int unitsConsumed){
        this.consumerName=consumerName;
        this.unitsConsumed=unitsConsumed;
    }
    public void setunitsConsumed(int con){
        this.unitsConsumed = con;
    }
    public int getunitsConsumed(){
        return this.unitsConsumed;
    }
    public double calculateBill(){
        if(getunitsConsumed() >= 100){
            int a= 100 * 5;
            double tu = ((getunitsConsumed() - 100) * 8) + a;
            return tu;
        }
        else
        {
         int b =100 - getunitsConsumed()   ;
         int abc = b * 5;
         return abc;
        }
        }
         
        
    }
