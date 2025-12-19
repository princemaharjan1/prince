package week7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        books s1 = new books();//student bhaneko contructor
        s1.title = "prince of persia";
        s1.author = "Prince";
        s1.priceofbook=1000000;
        books s2 = new books();
        s2.title = "prince2 of persia";
        s2.author = "Prince2";
        s2.priceofbook=12000000;
        System.out.println("author is " + s1.author + " title = "+ s1.title +"price = "+ s1.priceofbook);
        s1.read();
        System.out.println("author is " + s2.author + " title = "+ s2.title +"price = "+ s2.priceofbook);
        s2.read();
        //rectangle
        rectangle r1 = new rectangle();
        r1.length = 20;
        r1.breadth = 90;
        rectangle r2 = new rectangle();
        r2.length = 30;
        r2.breadth = 80;
        r1.rectanglinging();
        r2.rectanglinging();
        //emplooye
        employee e1= new employee();
        e1.id= 1;
        e1.salary = 1200000;
        e1.name= "prince m";
        employee e2= new employee();
        e2.id= 2;
        e2.salary = 21200000;
        e2.name= "prince ma";
        
        if(e1.salary>e2.salary){
            e1.show();
        }else
        {
            e2.show();
        }
        //laptop
        laptop l1 = new laptop(12,"acer",1200000);
        laptop l2 = new laptop(13,"lenevo",120000);
        laptop l3 = new laptop(4,"dell",1200);
        l1.display();
        l2.display();
        l3.display();
        //mobile
        mobile m1 =new mobile(1200000,"iphone");
        mobile m2 = new mobile(12000,"lenevo");
        m1.isAffordable();
        m2.isAffordable();
        //marks
        result rr1 = new result(90,90,90);
        result rr2 = new result(98,10,60);
        rr1.calculate();
        rr2.calculate();
        //senarioko7
        senarioko7 ss1 = new senarioko7("prince mahar",1,1200000);
        senarioko7 ss2 = new senarioko7("prince maharj",2,1000000);
        
        ss1.editor();
        ss2.editor();
    }
    
}