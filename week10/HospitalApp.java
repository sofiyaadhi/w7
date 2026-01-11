package week10;

 
public class HospitalApp
{
    public static void main(String[] args) {
        Doctor doc1 = new Doctor(101, "Dr. Sarah ", "Cardiology", 150.0);
        Doctor doc2 = new Doctor(102, "Dr. Michael", "Neurology", 200.0);
        Nurse nurse1 = new Nurse(201, "Emily ", "Day", 5000.0);
        Nurse nurse2 = new Nurse(202, "Brown", "Night", 7000.0);
        
        System.out.println("DOCTORS:");
        System.out.println(doc1);
        System.out.println("Salary (without emergency cases):" + doc1.calculateSalary());
        System.out.println("Salary (with 10 emergency cases):" + doc1.calculateSalary(10));
        System.out.println();
        
        System.out.println(doc2);
        System.out.println("Salary (without emergency cases): " + doc2.calculateSalary());
        System.out.println("Salary (with 15 emergency cases): " + doc2.calculateSalary(15));
        System.out.println();
        
        System.out.println("NURSES:");
        System.out.println(nurse1);
        System.out.println("Salary:" + nurse1.calculateSalary());
        System.out.println();
        
        System.out.println(nurse2);
        System.out.println("Salary:" + nurse2.calculateSalary());
        System.out.println();
        

    
    }
}