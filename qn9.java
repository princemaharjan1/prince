import java.util.Scanner;

/**
 * Write a description of class qn9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn9
{
      public static void main(String[] args){
    float gpa;
    Scanner scan = new Scanner(System.in);
    Float ask = scan.nextFloat();
     Scanner scan1 = new Scanner(System.in);
    Float attendance = scan1.nextFloat();
     Scanner scan2 = new Scanner(System.in);
    Float attitude = scan2.nextFloat();
   if(ask >= 3.2 && ask <=4){
       if( attendance >=80){
           if( attitude < 5){
       
        
            System.out.println("not elligible no attitude");
            //nested if else
        }
        else{
            System.out.println("elligible ");
        }
        }
        else{
             System.out.println("not elligible no attendance");
        }
    }
    else
    {
     System.out.println("not elligible no gps");  
}  
}
}