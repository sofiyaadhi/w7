package week9;


public class SchoolApp
{
    public static void main(String[] args)
    {
        // int id, String name, double basicSalary, String subject, double bonus
        Teacher t1= new Teacher(2001, "Sandesh", 45000, "Programming", 6000);
        t1.calculateAnnualSalary();
        
        // int id, String name, double basicSalary, double workingHours, double ratePerHour
        Staff s1= new Staff(2012, "Sushant", 25000, 12, 250);
        s1.calculateSalary();
    }
}