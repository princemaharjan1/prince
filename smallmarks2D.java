
/**
 * Write a description of class stdentmarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class smallmarks2D
{
    public static void main(String[] args){
    int[][] student = {{60,90},{70,80}};
    String[] subject = {"nepali","english"};
      System.out.println("");
      System.out.print("Students\t");
    for(int i= 0;i<subject.length;i++){
     System.out.print("\t"+subject[i]);
     
    }
    System.out.println("");
    for(int i= 0;i<student.length;i++){
       System.out.print("student ." + (i+1));
       for(int j = 0;j<student[i].length;j++){
        System.out.print("\t"+student[i][j]);
        
    } 
      System.out.println("");
    }
   
}
}