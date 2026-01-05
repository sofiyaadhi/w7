package w9;


public class scooter extends vehicle
{
    private boolean hasGears;
    
    
        public scooter(String brandName, int maxSpeed, boolean hasGears)
    {
        super(brandName,maxSpeed);
        this.hasGears=hasGears;
    }
        public void displayDetails()
    {
        System.out.println("scooter brand name:"+ super.brandName);
        System.out.println("scooter max speed:"+ super.maxSpeed);
        System.out.println("number of gears for the scooter:"+ this.hasGears);


    }
        
    }  

    
