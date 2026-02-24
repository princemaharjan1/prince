package week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
    public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> number = new ArrayList<>();
    names.add("alex");
    names.add("prince");
    names.add("joshi");
    names.add("joshi");
    names.add("joshi");
    number.add(12);
    number.add(13);
    number.add(14);
    System.out.println(number);
    System.out.println(names);
    
    for(String element : names){
        System.out.println(element);
    }
    Iterator<String> itr = names.iterator();
    while(itr.hasNext()){
        String abc= itr.next();
        System.out.println(abc);
        
    }
    for(String element : names){
        System.out.println(element);
    }
    Iterator<Integer> itr2 = number.iterator();
    while(itr.hasNext()){
        int num= itr2.next();
        System.out.println(num);
        
    }
    names.remove(3);
    System.out.println(names.get(2) + names.get(4));
    System.out.println(names.size());
    number.clear();
    }
}