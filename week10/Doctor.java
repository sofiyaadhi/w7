package week10;


public class Doctor extends Person
{
    
    private String specialization;
    private double consultationFee;
    
    public Doctor(int Id, String name, String specialization, double consultationFee) {
        super(Id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    
    
       
    @Override
    public double calculateSalary() 
    {
        return super.calculateSalary()+consultationFee;
    }

    public double calculateSalary(int emergencyCases) 
    {
        return calculateSalary()+(emergencyCases*500);
    }

    @Override
    public String toString() 
    {
        return super.toString() +", Specialization: " + specialization +", Consultation Fee: " + consultationFee;
    }
    
}

    