package week8;

public class Student
{
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    private static String collegeName="Islington";
    
    
    public Student(String name,int id,String address,long phoneNumber)
  {
    this.name=name;
    this.id=id;
    this.address=address;
    this.phoneNumber=phoneNumber;
  }

//setters and getters methods
    
    public void setName(String name)
    {
        this.name= name;
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
     
    public int getId()
    {
        return this.id;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
     
    public String getAddress()
    {
        return this.address;
    }
    
    public void  setPhoneNumber(long phoneNumber )
    {
        this.phoneNumber=phoneNumber;
    }
     
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    
    //display
    public void displayInfo()
    {
        System.out.println("Name of student"+ this.name);
        System.out.println("ID of student" + this.id);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
    
    
        
    
    

}

