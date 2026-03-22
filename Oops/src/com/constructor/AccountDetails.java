package com.constructor;
class Account
{
	private int AccountNumber;
	private String AccountHolderName;
	private double balance;
	
	Account(int AccountNumber,String AccountHolderName,double balance)
	{
		this.AccountNumber = AccountNumber;
		this.AccountHolderName = AccountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber()
	{
		return AccountNumber;   
	}
	public String getAccountHolderName()
	{
		return AccountHolderName;
	}
	public double getbalance()
	{
		return balance;
	}
	
	 public void setBalance(double balance)
	    {
	        this.balance = balance;
	    }
}
class ATM 
{
	Account acc;
	ATM(Account acc)
	{
		this.acc = acc;
	}
	public void deposit(double amount)
	{
		if(amount > 0)
        {
            double newBalance = acc.getbalance() + amount;
            acc.setBalance(newBalance);
            System.out.println("Deposited: " + amount);
        }
		else
        {
            System.out.println("Invalid amount");
        }
	}
	public void Withdraw(double amount)
	{
		if(amount <= acc.getbalance())
		{
			double newBalance = acc.getbalance()-amount;
			acc.setBalance(newBalance);
			System.out.println("Withdrawn: "+amount);
		}
		else
        {
            System.out.println("Insufficient Balance");
        }
	}
	public void Checkbalance()
	{
		System.out.println("Current Bls: "+acc.getbalance());
	}
}
public class AccountDetails 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ab = new Account(78945, "Ayush", 85.0);
		ATM a = new ATM(ab);
		a.deposit(500);
		a.Withdraw(50.0);
		a.Checkbalance();
	}
}