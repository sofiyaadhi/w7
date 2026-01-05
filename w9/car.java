package w9;



public class car extends vehicle
{
    private int doors;
    
    public car(String brandName, int maxSpeed, int doors)
    {
        super(brandName,maxSpeed);
        this.doors=doors;
        
    }
    public void displayDetails()
    {
        System.out.println("car brand name:"+ super.brandName);
        System.out.println("car max speed:"+ super.maxSpeed);
        System.out.println("number of doors for the car:"+ this.doors);


    }
}