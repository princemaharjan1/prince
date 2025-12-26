package week8;


/**
 * Write a description of class wokshop8main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wokshop8main
{
    public static void main(String[] args){
        calculator calc = new calculator();
        calc.displayInfo();
        calc.add(10,12);
        System.out.println(calc.getfixednumber());
        int finum=calc.getfixednumber();
        System.out.println(finum);
        int fi=calc.fixednum1(1,2);
        System.out.println(fi);
        calculator.test1(12,21);
    }
}