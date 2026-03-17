package com.AccessModifiers;
class Acc
{
	private double balance;
	
	
	public double getbalance()
	{
		balance = 33.77;
		System.out.println(balance);
		return balance;
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acc a = new Acc();
		a.getbalance();
		
	}

}
