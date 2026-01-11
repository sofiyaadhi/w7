package week10;



public class PremiumOrder extends Order
{
     private double premiumFee;
    
    public PremiumOrder(int orderId, String customerName, double amount, double premiumFee)
    {
        super(orderId, customerName, amount);
        this.premiumFee = premiumFee;
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount() + this.premiumFee;
    }
    
    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + " NormalFee: " + this.premiumFee);
    }
}