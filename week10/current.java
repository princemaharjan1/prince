package week10;


/**
 * Write a description of class current here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class current extends Account
{
    public current(String holderName,double balance,int accountNo){
        super(holderName,balance,accountNo);
    }
    @Override
      public double calculateintrest(){
        return  0;
    }
     @Override
     public String toString(){
         return super.toString();
     }
}