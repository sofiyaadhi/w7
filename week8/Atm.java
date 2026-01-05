package week8;



public class Atm
{
    public static void main(String[] args) 
    {
        BankAccount acc1=new BankAccount("59595948748858475", 5000, "sofiya");
        acc1.deposit(2000);
        acc1.withdraw(3000);
        System.out.println("Current Balance: " + acc1.getBalance());
    }

    

    }
