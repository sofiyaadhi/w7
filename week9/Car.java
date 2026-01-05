package week9;


public class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    
    public Car(int vehicleId, String brand, double basePrice, int doors, String fuelType)
    {
        super(vehicleId, brand, basePrice);
        this.doors= doors;
        this.fuelType= fuelType;
    }
    
    public double calculateFinalPrice()
    {
        return super.basePrice + super.calculateTax()+ 0.05 * super.basePrice;
    }
    
    public void displayCarDetails()
    {
        displayVehicleInfo();
        System.out.println("No of doors: "+ this.doors);
        System.out.println("Fuel type: "+ this.fuelType);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}