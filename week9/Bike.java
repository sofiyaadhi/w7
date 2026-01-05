package week9;



public class Bike extends Vehicle
{
    private int engineCapacity;
    
    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity)
    {
        super(vehicleId, brand, basePrice);
        this.engineCapacity= engineCapacity;
    }
    
    public double calculateFinalPrice()
    {
        return super.basePrice+ super.calculateTax();
    }
    
    
    public void displayBikeDetails()
    {
        displayVehicleInfo();
        System.out.println("Fuel type: "+ this.engineCapacity);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
    
}