package week7;


public class main11
{
    public static void main(String [] args)
    {
        //question1
        book b1= new book();
        b1.title="good small thing";
        b1.author="roy";
        b1.price=230;
        
        
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        
        
        book b2= new book();
        b2.title="penguin";
        b2.author="arun";
        b2.price=250;
        
        
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        
        
        //question2
        rectangle r1=new rectangle();
        r1.length=15;
        r1.breadth=10;
        System.out.println(r1.length);
        System.out.println(r1.breadth);
        r1.Area();
        
        rectangle r2=new rectangle();
        r2.length=30;
        r2.breadth=45;
        System.out.println(r2.length);
        System.out.println(r2.breadth);
        r2.Area();
        
        //question3
        
        employee e1 = new employee();
        e1.name="guin";
        e1.ID=1;
        e1.salary=25000.0;
        
        employee e2 = new employee();
        e2.name="wuin";
        e2.ID=2;
        e2.salary=65000.0;
        
        employee e3 = new employee();
        e3.name="suin";
        e3.ID=3;
        e3.salary=95000.0;
        
        if(e1.salary>e2.salary && e1.salary>e3.salary)
        {
            System.out.println("heightest paid:" );
            e1.details();
        }
        else if(e2.salary>e1.salary && e2.salary>e3.salary)
        {
            System.out.println("heightest paid:" );
            e2.details();
        }else
        {
            System.out.println("heightest paid:" );
            e3.details();
        }

 
        //question4
        
        laptop l1= new laptop("acer",16,23400);
        laptop l2= new laptop("macbook m2",16,120000);
        laptop l3= new laptop("hp",8,54600);
        
         if(l1.RAM>8)
        {
            System.out.println("greater RAM" );
            l1.details();
        }
        else if(l2.RAM>8)
        {
            System.out.println("greater RAM:" );
            l2.details();
        }else
        {
            System.out.println("greater RAM:" );
            l3.details();
        }
        
        //question 5
        
       
        mobile m1 = new mobile("Samsung", 15000.0);
        mobile m2 = new mobile("Apple", 25000.0);
        mobile m3 = new mobile("Nokia", 10000.0);
        
        m1.isAffortable();
        m2.isAffortable();
        m3.isAffortable();
        
        //qurstion6
        result s1= new result(90,80,79);
        result s2=new result(34,67,55);
        
        s1.total();
        s1.percentage();
        
        s2.total();
        s2.percentage();
    }
}
    