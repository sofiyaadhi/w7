package week7;


public class mainn
{
     public static void main(String[] args) {
        System.out.println("Bank Account Simulation ");
        BankAccount account1 = new BankAccount("ACC001", "John Smith", 1000.0);
        BankAccount account2 = new BankAccount("ACC002", "Sarah Johnson", 500.0);
        System.out.println("Initial Account Details:");
        account1.displayBalance();
        account2.displayBalance();
        
        System.out.println(" Performing Transactions ");
        
        System.out.println("Transactions for " + account1.getHolderName() + ":");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        
        System.out.println();
        System.out.println("Transactions for " + account2.getHolderName() + ":");
        account2.deposit(1000.0);
        account2.withdraw(300.0);
        account2.withdraw(2000.0); 
        System.out.println();
        
        System.out.println(" Final Account Details ");
        account1.displayBalance();
        account2.displayBalance();
    }
}
    

