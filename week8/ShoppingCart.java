package week8;



public class ShoppingCart
{
    private String itemname;
    private double itemprice;
    private int quantity;
    
    
    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemname = itemName;
        this.itemprice = itemPrice;
        this.quantity = quantity;
    }
    
    
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double calculateTotal() {
        return itemprice * quantity;
    }
    
    
    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discount = total * (discountPercent / 100);
        return total - discount;
    }
    
    public void displayCart() {
        System.out.println("Shopping Cart Details ");
        System.out.println("Item Name: " + itemname);
        System.out.println("Item Price: " + itemprice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}
    
    