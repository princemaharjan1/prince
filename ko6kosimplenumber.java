
/**
 * Write a description of class ko6kosimplenumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ko6kosimplenumber
{
    public static void main(String[] args){
        int high=0,low=0;
        int sum= 0;
        int[] num={50,40,30,20,10};
    
        high=num[0];
        low=num[4];
    for(int i = 0; i<num.length; i++){
        System.out.println("numbeer are " + num[i]);
    }
    for(int i = 0; i<num.length; i++){
         sum=sum + num[i];
    }
     System.out.println("sum of numbeer are " + sum);
    int avg = sum/(num.length);
    System.out.println("avg of numbeer are " + avg);
   
    for(int i = 0; i<num.length; i++){
        if(num[i]>=low){
            System.out.println("avg of numbeer are " + num[i]);
        }
 
    }
    System.out.println("high of numbeer are " + high);
     System.out.println("low of numbeer are " + low);

}
}