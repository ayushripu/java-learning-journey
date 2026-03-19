package com.encapsulation;
class Account
{
	private double bls;
	
	public double getbls() {
		return bls;
	}
	
	public double setbls(double balance)
	{
		return this.bls = balance;
	}
}
public class AccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		
		
		a.setbls(89.90);
		
		System.out.println(a.getbls());
	
	}

}
