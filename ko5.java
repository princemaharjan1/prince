
/**
 * Write a description of class ko5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ko5
{
    public static void main(String[] args){
    int i=1;
    int j;
    int k,l;
    do {
    
             
      for (j = 1 ;j<=i;j++){
          for(k = 5;k>=1;k--){
             System.out.print(" ");
             l = k-1;
             
             if(k==l){
                 break;
             }
             
            }
              System.out.print(j);
            }
         
       i++;
     
    System.out.println("");
    }while(i<=5);
}
}