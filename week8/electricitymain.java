package week8;


/**
 * Write a description of class electricitymain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class electricitymain
{
    public static void main(String[] args){
    electricitybill e1 = new electricitybill("prince",190);
    e1.getunitsConsumed();
    e1.calculateBill();
    System.out.println(" ok "+e1.calculateBill());
}
}