package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    public DeliveryPartner(int partnerId,String name,double basePay){
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }
    public void setpartnerId(int newpartnerId){
        this.partnerId = newpartnerId;
    }
    public int getpartnerId(){
        return this.partnerId;
    }
    public void setname(String newname){
        this.name = newname;
    }
    public String getname(){
        return this.name;
    }
    public void setbasePay(int newbasePay){
        this.basePay = newbasePay;
    }
    public double getbasePay(){
        return this.basePay;
    }
    public double calculatePayment(){
        return basePay;
    }
    @Override
    public String toString(){
        return super.toString() +"partnerid = "+ partnerId+"name = "+name+"basepay =" + basePay;
    }
}