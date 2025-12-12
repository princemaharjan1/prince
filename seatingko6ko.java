
/**
 * Write a description of class district here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seatingko6ko
{
    public static void main()
    {
        String[][] seats;
        seats = new String[2][3];
        seats[0][0]= "occupy";
        seats[0][1]= "occupy";
        seats[0][2]= "occupy";
        seats[1][0]= null;
        seats[1][1]= null;
        seats[1][2]= null;

       /* seats[1][0]= "occupy";
        seats[1][1]= "occupy";
        seats[1][2]= "occupy";*/
        
        for(int i = 0 ; i < seats.length;i++){
            for(int j = 0 ; j < seats[i].length;j++){
            if(seats[i][j]==null){
                System.out.print("\tEmpty");
        }else 
        {
          System.out.print("\toccupy") ; 
        }
    }System.out.println("") ; 
        }
        
    }
}