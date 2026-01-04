package week8;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private String name;
    private int id;
    public student(String name,int id){
        this.name = name;
        this.id = id;
    }
        
       public void setname(String name,int id){
        this.name = name;
        this.id = id;
        //different setter for varibles and void return garna parcha
        
    }
     
    public String getname1(){
        
        return this.name;
    }
     public int getname(){
    
        //different setter for varibles and void return garna parcha
       
        return this.id;
    }
    public void Displayinfo(){
        int id = getname();
        String name = getname1();
        
        System.out.println("name of student is : "+ name);
        System.out.println("name of student is : "+ id);
        
        
    }
}
