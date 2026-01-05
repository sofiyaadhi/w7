package week8;



public class BankAccount
{
    private String accountNumber;
    private double balance;
    private String name;
    
    public BankAccount(String accountNumber, double balance, String name)
        {
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.name=name;
    }
    
    public void setBankAccouunt(String accountNumber)
        {
        this.accountNumber = accountNumber;
        
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    
    
    public void setBalance(double balance )
    {
        this.balance= balance;
        
        
    }
    public double getBalance() {
        return balance;
    }
    
    public void setName(String name)
        {
        this.name = name;
        
    }
    public String getName() {
        return name;
    }
    
    
        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
        public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

