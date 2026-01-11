package week10;

public class Person
{
    private int Id;
    private String name;
    
    public Person(int Id,String name)
    {
        this.Id=Id;
        this.name=name;
        
    }
    public int getId()
    {
        return Id;
        
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
        
    }
     @Override
    public String toString() {
        return "ID: " + Id + ", Name: " + name;
    }
    
    public double calculateSalary() {
        return 50000.0; 
    }
    
    

}