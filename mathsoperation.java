import java.util.Scanner;

/**
 * Write a description of class mathsoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathsoperation
{
    public static void main(String[] args){
        System.out.println("arithmatic operators");
        System.out.println("addition" + 1+2);
        System.out.println("substraction");
        System.out.println(1-2);
        System.out.println("division");
        System.out.println(1/2);
        System.out.println("remainder");
        System.out.println(1%2);
        System.out.println("multiplication");
        System.out.println(1*2);
        
        //urnary
        System.out.println("unary");
        int incre=22;
        System.out.println(++incre);
        System.out.println(incre++);
             System.out.println(incre--);
                  System.out.println(--incre);
          //assignent        
        System.out.println("assignment");
    Scanner one=new Scanner(System.in);
    int second=one.nextInt();
    
    //relational
    int rtrue= 12;
    int rfalse = 13;
    boolean ftrue= rtrue >=rfalse;
    System.out.println(ftrue);
    
    //logical
    
    if(rtrue == rfalse){
        System.out.println("true");
    }else{
        
     System.out.println("false");        
    }
    
    String common=(rtrue == rfalse) ?"true":"false";
    System.out.println(common);
    
    
    
        
        
        
        
    }
}