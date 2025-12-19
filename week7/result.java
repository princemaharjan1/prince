package week7;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    int subject1;
    int subject2;
    int subject3;
    
    public result(int subject1,int subject2,int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public void calculate(){
        int total=subject1 + subject2 + subject3;
        System.out.println("totl marks = "+ (subject1+subject2+subject3));
        System.out.println("totl perentage= "+ ((total*100) / 300));
    }
}