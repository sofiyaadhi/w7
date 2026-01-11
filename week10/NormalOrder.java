package week10;



public class NormalOrder extends Order
{
     private double normalFee;
    
    public NormalOrder(int orderId, String customerName, double amount, double normalFee)
    {
        super(orderId, customerName, amount);
        this.normalFee = normalFee;
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount() + this.normalFee;
    }
    
    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + " NormalFee: " + this.normalFee);
    }
}