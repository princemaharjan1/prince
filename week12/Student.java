package week12;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String group;
    private long number;
    public void setname(String newname){
        this.name = newname;
    }
    public String getname(){
        return this.name;
    }
    public void setgroup(String newgroup){
        this.group = newgroup;
    }
    public String getgroup(){
        return this.group;
    }
    public void setnumber(long newnumber){
        this.number = newnumber;
    }
    public long getnumber(){
        return this.number;
    }
    public Student(String name,String group,long number){
        this.name = name;
        this.group = group;
        this.number = number;
    }
    @Override
    public String toString(){
        return "name  = " + getname() + "group  = " + getgroup() + "number  = " + getnumber();
    }
}