package week10.week10tutorial;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int id;
    private String name;
    public person(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }
    public void displayDetails(){
        System.out.println("name :"+ getname());
         System.out.println("Id :"+ getid());

    }
    public double calculatesalary(){
        return 1000;
    }
    @Override
    public String toString(){
        return super.toString() + "id = "+ this.id+ "name = "+ this.name;
    }
}