package week10;


public class BikeDelivery extends DeliveryPartner
{
    private double fuelAllowance;
    private int deliveryRadius; 
    
    public BikeDelivery(int partnerId, String name, double basePay, double fuelAllowance, int deliveryRadius) {
        super(partnerId, name, basePay);
        this.fuelAllowance = fuelAllowance;
        this.deliveryRadius = deliveryRadius;
    }
    
    
    
    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + fuelAllowance + (deliveryRadius * 2);
    }
    
    public double calculatePayment(int extraOrders) 
    {
        return calculatePayment() + (extraOrders * 100);
    }

    @Override
    public String toString() 
    {
        return super.toString() +", Fuel Allowance: " + fuelAllowance;
    }
    
    
    
}