package week10;



public class CarDelivery extends DeliveryPartner
{
    private double vehicleMaintenance;
    private int maxCapacity; 
    
    public CarDelivery(int partnerId, String name, double basePay, double vehicleMaintenance, int maxCapacity) {
        super(partnerId, name, basePay);
        this.vehicleMaintenance = vehicleMaintenance;
        this.maxCapacity = maxCapacity;
    }
    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + (maxCapacity * 10) - vehicleMaintenance;
    }
    
    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 200); 
    }
    
    @Override
    public String toString() 
    {
        return super.toString() +", Maintenance Allowance: " + vehicleMaintenance;
    }
    
    
}