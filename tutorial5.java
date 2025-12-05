
/**
 * Write a description of class tutorial5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial5
{
    public static void main(){ 
        int i=0;
        int sum=0;
       
        for(i = 1;i<5; i++){
        for(int j = 1;j<=i;j++){
            System.out.print("\t*");
        }
        for(int j = 5;j>=1;j--){
            System.out.print("\t*");
        }
          System.out.println();
    }
    }
}