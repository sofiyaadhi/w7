package week9;

public class SavingAccount extends BankAccount 
{
    private double interestRate;

    public SavingAccount(int accountNumber,String accountHolderName,double balance, double interestRate) 
    {
        super(accountNumber,accountHolderName,balance);
        this.interestRate=interestRate;
    }

    public double calculateInterest() 
    {
        return super.getBalance()*interestRate/100;
    }
}
