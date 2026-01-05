package week9;


public class SchoolApp
{
    public static void main(String[] args)
    {
        Teacher t1= new Teacher(2001, "Sam", 45000, "Program", 6000);
        t1.calculateAnnualSalary();
        
        Staff s1= new Staff(2012, "Sumi", 25000, 12, 250);
        s1.calculateSalary();
    }
}