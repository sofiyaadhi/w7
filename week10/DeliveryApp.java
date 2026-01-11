package week10;


public class DeliveryApp
{
    public static void main(String[] args) 
    {
        BikeDelivery bike1 = new BikeDelivery(1001, "Rajesh Kumar", 500.0, 100.0, 5);
        CarDelivery car1 = new CarDelivery(2001, "Priya Singh", 800.0, 150.0, 10);

        System.out.println(bike1);
        System.out.println("Bike Payment: " + bike1.calculatePayment());
        System.out.println("Bike Payment (extra orders): " +bike1.calculatePayment(5));
        System.out.println();
        System.out.println(car1);
        System.out.println("Car Payment: " + car1.calculatePayment());
        System.out.println("Car Payment (extra orders): " + car1.calculatePayment(3));
    }
    
}