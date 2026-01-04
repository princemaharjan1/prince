import java.util.Scanner;

/**
 * Write a description of class senarioko6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class minibookcorner

{
    public static void main(String[] args){
        String[] categories = {"Fiction", "Nepali"};
       String[][] titles = new String[2][1];
       double[][] prices = new double[2][1];
       Scanner scan = new Scanner(System.in);
       System.out.println("please Enter your values for ttitles and prices");
       
       
      
               System.out.println("ttitles for "+"firction");
               titles[0][0] = scan.nextLine();
               System.out.println("price" + " for " + titles[0][0] );
               prices[0][0] = scan.nextDouble();
    
       
               System.out.println("ttitles for "+ "nepali");
               Scanner scan2 = new Scanner(System.in);
               titles[1][0] = scan2.nextLine();
               System.out.println("price" + " for" + titles[1][0] );
               prices[1][0] = scan.nextDouble();
        
        System.out.println("your output");
        for(int i = 0;i<2;i++){
           for(int j = 0;j<1;j++){
               
               if(i == 0) {
               System.out.print(categories[i] + " = "+ titles[i][j]  + " = price = ");
                System.out.printf("%.2f",prices[i][j]);
            }
            else{
                
                System.out.print(categories[i] + " = "+ titles[i][j] + " = price = ");
                System.out.printf("%.2f",prices[i][j]);
            }
            }
            System.out.println("");
            }
             System.out.println("");
        }   
    }
