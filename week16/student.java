package week16;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private String Name;
    private int Age;
    private String School;
    private int Grade;
    private String CitizenShip;
    private String Phone;
    
    public student(String Name,int Age,String School,int Grade,String CitizenShip,String Phone){
        this.Name = Name;
        this.Age = Age;
        this.School = School;
        this.Grade = Grade;
        this.CitizenShip = CitizenShip;
        this.Phone = Phone;
    }
    
    public String getName(){
        return this.Name;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public int getAge(){
        return this.Age;
    }
    public void setAge(int newAge){
        this.Age = newAge;
    }
    public String getSchool(){
        return this.School;
    }
    public void setSchool(String newSchool){
        this.School = newSchool;
    }
    public int getGrade(){
        return this.Grade;
    }
    public void setGrade(int newGrade)
    {
        this.Grade = newGrade;
    }
    public String getCitizenShip(){
        return this.CitizenShip;
    }
    public void setCitizenShip(String newCitizenShip){
        this.CitizenShip = newCitizenShip;
    }
    public String getPhone(){
        return this.Phone;
    }
    public void setPhone(String newPhone){
        this.Phone= newPhone;
    }
    public void getNameInitials(){
        String StringTaker = getName();
        String[] StringSplitter = StringTaker.split(" ");
        StringBuilder Adder = new StringBuilder();
        for(String x : StringSplitter){
            String FirstLetter = x.substring(0,1).toUpperCase();
            Adder = Adder.append(FirstLetter).append(".");
        }
        
    }
     @Override
    public String toString() {
        return String.format("%s | %d | Grade %d | %s",Name, Age, Grade, School);
    }

}