import java.util.Scanner;

/**
 * Write a description of class ko7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ko7
{
    public static void main(String[] args){
    int i;
    char jj = 'y';
   
    do{
        System.out.println("first number");
      Scanner scan1 = new Scanner(System.in);
      int first =scan1.nextInt();
      System.out.println("second number");
        Scanner scan2 = new Scanner(System.in);
        int second =scan2.nextInt();
        
        
       System.out.println("choose 1 for +,2 for -,3 for *,4 for /"); 
        Scanner scan3 = new Scanner(System.in);
        int input =scan3.nextInt();
        System.out.println("");
        switch(input){
            case 1:
            i = first + second;    
            System.out.println(i);
            break;
             case 2:
            i = first - second;    
            System.out.println(i);
            break;
             case 3:
            i = first * second;    
            System.out.println(i);
            break;
             case 4:
            i = first / second;    
            System.out.println(i);
            break;
             default:
            break;
        }
        
    Scanner scan = new Scanner(System.in);

    jj = scan.next().charAt(0);
    
    
    System.out.println("");
    }while(jj=='y');
}
}