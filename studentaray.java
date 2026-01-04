import java.util.Scanner;

/**
 * Write a description of class ko6ko2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentaray
{public static void main(String[] args){
   
     String[] students = {"saroj","Sshant","ujjwal","rabina","Sandesh"};
    for(int i = 0; i< students.length; i ++){
        System.out.println(students[i]);
    }
     for(int i = 0; i< students.length; i ++){
        if(students[i] == students[2]){
        System.out.println("second " + students[i]);
    }
}
students[4]="abcd";
    System.out.println("your changed name is = " + students[4]);
    //new array 
   Scanner scan = new Scanner(System.in); 
   
 
     System.out.println("Your new arrayvalues");
   for(int i = 0; i < 5 ; i ++){
       students[i]=scan.nextLine();
    }
    //updated aray 
for(int i = 0; i< students.length; i ++){
        System.out.println(students[i]);
    }
}
}