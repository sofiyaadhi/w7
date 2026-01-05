package week8;



public class Employee
{
    private double basicSalary;
    
        public Employee(double basicSalary)
        {
        this.basicSalary = basicSalary;
        
    }
    public void setBasicSalary(double basicSalary )
    {
        this.basicSalary= basicSalary;
        
        
    }
    
    public double calculateGrossSalary()
    {
        return this.basicSalary+(0.20* basicSalary);
    }
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
}
    
    
    
