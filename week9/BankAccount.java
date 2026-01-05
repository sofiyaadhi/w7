package week9;


public class BankAccount
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) 
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void deposit(double amount) 
    {
        balance+=amount;
        System.out.println("Deposited: " + amount);
    }

    public double getBalance() 
    {
        return balance;
    }
    
}