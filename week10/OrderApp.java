package week10;


public class OrderApp
{
     public static void main(String[] args)
    {
        NormalOrder o1 = new NormalOrder(119, "Billy", 900, 30);
        PremiumOrder o2 = new PremiumOrder(223, "Derek" , 900, 100);
        
        System.out.println(o1);
        System.out.println(o1.calculateFinalAmount());
        System.out.println(o2);
        System.out.println(o2.calculateFinalAmount(200));
    }
}