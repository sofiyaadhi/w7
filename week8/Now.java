package week8;


public class Now
{
    public static void main(String[] args) {
        
        Employee emp = new Employee(50000.00);

        
        System.out.println("Basic Salary: " + emp.getBasicSalary());

        
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
    }
}
