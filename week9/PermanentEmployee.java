package week9;

public class PermanentEmployee extends Employee
{
    private double HRA;
    private double DA;

    public PermanentEmployee(int employeeId,String name,double basicSalary,double HRA,double DA) 
    {
        super(employeeId,name,basicSalary);
        this.HRA=HRA;
        this.DA=DA;
    }

    public double calculateTotalSalary() 
    {
         double bonus = calculateBonus();
        return basicSalary+HRA+DA+calculateBonus();
    }
}