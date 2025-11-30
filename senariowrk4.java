import java.util.Scanner;

/**
 * Write a description of class senariowrk4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senariowrk4
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter your age: ");
        int age = input.nextInt();
        int price;
        int fakeprice;
        
        if (age < 18) {
            price = 150;
        } else if (age >= 60) {
            price = 200;
        } else {
            price = 250;
        }
        
        System.out.println("Select movie language:");
        System.out.println("1. Nepali");
        System.out.println("2. Hindi");
        System.out.println("3. English");
        System.out.print("Enter choice (1-3): ");
        Scanner language12 = new Scanner(System.in);
        int language = language12.nextInt();

    
        switch (language) {
            case 1 :
                break;
            case 2:
                price = price + 50;
                break;
            case 3:
                price =price + 100;
                break;
            default:
                
                break;
        }

        
        System.out.print("Do you have a student ID? (yes/no): ");
        Scanner scan = new Scanner(System.in);
        String student = scan.nextLine();
        
        if(student=="yes") {
           
            price =(int)(price - (price * 0.20)); 
        }else {
             fakeprice=price;
        }

       
        System.out.print("Is it a festival day? (yes/no): ");
         Scanner scan1 = new Scanner(System.in);
        char festival = scan1.next().charAt(0);
        if (festival=='y') {
            
            price = (int) (price - (price * 0.15)); 
        }else {
             fakeprice=price;
        }

       
        System.out.println("Final ticket price: Rs. " + price);
    }
    
}