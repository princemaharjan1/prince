package week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
    private int gracemarks;
    public ScienceStudent(int rollNo,String name,double marks,int garcemarks){
        super(rollNo,name,marks);
        this.gracemarks = gracemarks;
    }
    public void setgracemarks(int newgracemarks){
        this.gracemarks = newgracemarks;
    }
    public int getgracemarks(){
        return this.gracemarks;
    }
    
    @Override
    public String calculateResult(){
        if((getmarks() + getgracemarks()) <= 40){
           return "fail"; 
        }
        else
        {
           return "pass" ;
        }
    }
     @Override
    public String toString(){
        return super.toString() +" grace marks"+ gracemarks+" name = "+getname()+"marks : " + getmarks() + "result : "+ calculateResult();
    } 
}