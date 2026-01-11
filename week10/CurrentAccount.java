package week10;


public class CurrentAccount extends Account
{
      public CurrentAccount(int accountNo, String holderName, double balance) 
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return super.calculateInterest()+(balance * 0.03);
    }

    public double calculateInterest(double rate) 
    {
        return balance*rate;
    }
}
    
