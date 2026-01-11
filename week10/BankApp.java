package week10;


public class BankApp
{
    public static void main(String[] args) 
    {

        SavingsAccount sa = new SavingsAccount(101, "Timmy", 50000);
        CurrentAccount ca = new CurrentAccount(201, "Jimmmy", 80000);
        System.out.println(sa);
        System.out.println("Savings Interest: " +sa.calculateInterest());
        System.out.println("Savings Interest (custom rate): " + sa.calculateInterest(0.06));
        System.out.println();
        System.out.println(ca);
        System.out.println("Current Interest: " +ca.calculateInterest());
        System.out.println("Current Interest (custom rate): " + ca.calculateInterest(0.04));
    }
}



