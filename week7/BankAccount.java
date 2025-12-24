package week7;


public class BankAccount
{
    String accountNumber;
    String holderName;
    double balance;
    
     
    public BankAccount(String accountNumber, String holderName, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }    
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient balance in account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
    
     public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public double getBalance() {
        return balance;
    }
}

    
