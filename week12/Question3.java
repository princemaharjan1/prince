package week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3 
{
    public static void main(String[] args){
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(new Student("Ayush","L1N1",9876543210l));
        obj.add(new Student("Rahul","L1M1",9876543211l));
        obj.add(new Student("Gaurav ","L1N2",9876543212l));
        System.out.println(obj.size());
        /*for(Student obj2 : obj){
            if(onj2.getname().equals(""){
                
            }
        
    }*
    /*Iterator<Student> obj3 = obj.iterator();
    while(obj3.hasNext()){
        if(obj.get(i).getname().equals("Ayush")){
            obj.add(i,new Student("aavya","L1C1",9876543213l));
        }
        obj3.next();
    }*/// iterator loop
    for(int i = 0 ;i < obj.size();i++){
        if(obj.get(i).getname().equals("Ayush")){
            obj.add(i,new Student("aavya","L1C1",9876543213l));
            break;
        }
    }
    for(Student obj2 : obj){
        System.out.println(obj2);
        
    }
    for(int i = 0 ;i < obj.size();i++){
        if(obj.get(i).getname().equals("Gaurav")){
            obj.remove(i);
            break;
        }
    }
    for(Student obj3 : obj){
        System.out.println(obj3);
        
    }
    for(int i = 0 ;i < obj.size();i++){
        if(obj.get(i).getname().equals("Rahul")){
            obj.getgroup().set(i,"L1N2");
            break;
        }
    }
    for(Student obj4 : obj){
        System.out.println(obj4);
        
    }
    }
}