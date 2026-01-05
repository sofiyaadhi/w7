package week9;


public class BankApp
{
    public static void main(String[] args) 
    {
        SavingAccount saving=new SavingAccount(100, "Tom", 100000, 8);
        CurrentAccount current=new CurrentAccount(101, "John", 50000, 5000);
        System.out.println("Saving Account:");
        saving.deposit(5000);
        System.out.println("Interest: " + saving.calculateInterest());
        System.out.println("Current Balance: " + saving.getBalance());
        System.out.println("Current Account:");
        current.deposit(7000);
        current.withdraw(10000);
        System.out.println("Current Balance: " + current.getBalance());
    }
}