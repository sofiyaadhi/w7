package week9;


public class Payroll
{
    public static void main(String[] args) 
    {

        PermanentEmployee pe =new PermanentEmployee(1, "kin", 5443222, 55443, 456464);

        ContractEmployee ce =new ContractEmployee(2, "lolk", 1556, 564);
        System.out.println("Permanent Employee:");
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());
        System.out.println("Contract Employee:");
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}