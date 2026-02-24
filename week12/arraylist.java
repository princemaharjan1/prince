package week12;
import java.util.*;



/**
 * Write a description of class arraylist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arraylist
{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
        ArrayList<String> name = new ArrayList<>();
        name.add("prince");
        System.out.println(name.get(0));
        for(int element : numbers){
            System.out.println(element);
        }
        //remove
        numbers.remove(1);
        System.out.println(numbers);
        numbers.add(1,2);
        numbers.set(1,3);
        System.out.println(numbers);
        System.out.println(numbers.contains(2));
        
    }
}