package week7;


public class mobile
{
    String brand;
    double price;
    public mobile(String brand, double price)
    {
        this.brand=brand;
        this.price=price;
    }
    
    void isAffortable()
    {
        if(price< 20000)
        {
            System.out.println(brand + "isAffortable");
        }
        else
        {
            System.out.println(brand + "isNotAffortable");

        }
    }
}