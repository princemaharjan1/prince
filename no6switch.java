import java.util.*;

/**
 * Write a description of class no6switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no6switch
{
    public static void main(String[] args){
        float mp;
        float a;
        Scanner scan= new Scanner(System.in);
        System.out.println("category");
        char A = scan.next().charAt(0);
        System.out.println("mp");
        Scanner rp = new Scanner(System.in);
        mp=rp.nextFloat();
        System.out.println("category");
        
        switch(A) {
            case 'A':
                a = mp * 60 / 100f;
                mp = mp - a;
                System.out.println("mp is atv 60 %" + mp);
                break;
                case 'B':
                a = mp * 40 / 100f;
                mp = mp - a;
                System.out.println("mp is atv 40 %" + mp);
                break;
                
                case 'C':
                a = mp * 20 / 100f;
                mp = mp - a;
                System.out.println("mp is atv 20 %" + mp);
                break;
                
                case 'D':
                a = mp * 10 / 100f;
                mp = mp - a;
                System.out.println("mp is atv 10 %" + mp);
                break;
                default :
                    System.out.println("mp is with no dis" + mp);
                    
                
            
        }
        
        
    }
}