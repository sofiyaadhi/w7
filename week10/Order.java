package week10;


public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    
    public Order(int orderId, String customerName, double amount)
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
    
    void setOrderId(int id)
    {
        this.orderId = id;
    }
    
    int getOrderId()
    {
        return this.orderId;
    }
    
    void setCustomerName(String name)
    {
        this.customerName = name;
    }
    
    String getCustomerName()
    {
        return this.customerName;
    }
    
    void setAmount(double money)
    {
        this.amount = money;
    }
    
    @Override
    public String toString()
    {
        return ("Order ID: " + this.orderId + " CustomerName: " + this.customerName + " Amount: " + this.amount);
    }
    
    public double calculateFinalAmount()
    {
        return this.amount;
    }
}