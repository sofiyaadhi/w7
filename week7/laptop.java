package week7;


public class laptop
{
    String brand;
    int RAM;
    double price;
    public laptop(String brand, int RAM, double price)
    {
        this.brand=brand;
        this.RAM=RAM;
        this.price=price;
    }
    
    void details()
    {
        System.out.println("brand: " + brand);
        System.out.println("RaM: " + RAM);
        System.out.println("price: " + price);
    }
    
}