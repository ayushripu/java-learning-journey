package com.inheritance;

import java.util.Scanner;

class BankAccount
{
		 private int acno;
		 private String name;
		 private String Phno;
		 private double Amount;
		 
		 public int getacno()
		 {
			 return acno;
		 }
		 public void setacno(int ac)
		 {
			 acno=ac;
		 }
		 public String getname()
		 {
			 return name;
		 }
		 public void setname(String na)
		 {
			 name=na;
		 }
		 public String getPhno()
		 {
			 return Phno;
		 }
		 public void setPhno(String ph)
		 {
			 Phno=ph;
		 }
		public double getAmount()
		 {
			return Amount;
		 }
		 public void setAmount(double d) 
		 {
			Amount = d;
		 }
		public BankAccount(int acno,String name,String Phno,int Amount)
		{
			this.acno=47546764;
			this.name="Ayush";
			this.Phno="684359874398";
			this.Amount=5000;
		}	
		public void display()
		{
			System.out.println("Account No = "+acno);
			System.out.println("Name = "+name);
			System.out.println("Phno = "+Phno);
			System.out.println("Amount ="+Amount);
		}
}
		class SavingAccount extends BankAccount
		{
			public SavingAccount(int acno, String name, String Phno, int Amount)
			{
				super(acno, name, Phno, Amount);
			}
			void Deposite(double rs)
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("How Much Money Do You Want To Deposite :-> ");
				setAmount(getAmount() + rs);
				System.out.println("Deposited: " + rs);
		        System.out.println("Updated Balance: " + getAmount());
			}
			void Withdraw(double rs)
			{
				if (rs<=getAmount()) 
				{
		            setAmount(getAmount() - rs);
		            System.out.println("Withdrawn: " + rs);
		            System.out.println("Updated Balance: " + getAmount());
		        } 
				else
				{
		            System.out.println("Insufficient Balance!");
		        }
			}

		}
public class Account 
{
	public static void main(String[] args) 
	{	
		SavingAccount b=new SavingAccount(0, null, null, 0);
		b.display();
//		Scanner sc=new Scanner(System.in);
//		System.out.print("How Much Money Do You Want To Deposite :-> ");
		b.Deposite(500);
		b.Withdraw(700);
		
	}
}