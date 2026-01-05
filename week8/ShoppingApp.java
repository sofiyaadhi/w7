package week8;


public class ShoppingApp
{
    public static void main(String[] args) {
        ShoppingCart cartItem = new ShoppingCart("Laptop", 999.99, 2);

        System.out.println("Initial quantity: " + cartItem.getQuantity());
        cartItem.setQuantity(3);
        System.out.println("Updated quantity: " + cartItem.getQuantity());

        System.out.println("Calculated Total: " + cartItem.calculateTotal());

        double discount = 10.0; 
        System.out.println("Total after " + discount + "% discount: " + cartItem.calculateDiscountedTotal(discount));

        cartItem.displayCart();
    }
}