package com.inter;
interface Bank
{
	void getInterestRate();
}

class SBI implements Bank
{
	public void getInterestRate()
	{
		System.out.println("SBI Interest Rate is 4%");
	}
}
class HDFC implements Bank
{
	public void getInterestRate()
	{
		System.out.println("HDFC Interest Rate is 7%");
	}
}
public class BankDetails {

	public static void main(String[] args) 
	{
		Bank b;
		b = new SBI();
		b.getInterestRate();
		
		b = new HDFC();
		b.getInterestRate();
	}

}
