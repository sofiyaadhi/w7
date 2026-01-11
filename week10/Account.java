package week10;



public class Account
{
    private int accountNo;
    private String holderName;
    protected double balance;
    
    public Account(int accountNo, String holderName, double balance) 
    {
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public int getAccountNo() 
    {
        return accountNo;
    }

    public void setAccountNo(int accountNo) 
    {
        this.accountNo = accountNo;
    }

    public String getHolderName() 
    {
        return holderName;
    }

    public void setHolderName(String holderName) 
    {
        this.holderName = holderName;
    }
    
    public double calculateInterest()
    {
        return 0.15;
    }
}
