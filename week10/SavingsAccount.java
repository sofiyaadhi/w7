package week10;



public class SavingsAccount extends Account
{
    public SavingsAccount(int accountNo, String holderName, double balance) 
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return super.calculateInterest()+(balance*0.05);
    }

    public double calculateInterest(double rate) 
    {
        return balance * rate;
    }
}
