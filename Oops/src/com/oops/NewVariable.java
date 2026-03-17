package com.oops;
import java.util.Scanner;
class ATM
{	Scanner sc=new Scanner(System.in);																
	String name;
	int n,pin=1234;
	double ballence=1000,credited,widrwal;
	void setName(String name)
	{
		this.name=name; 
	}
	String getName()
	{
		return name;
	}
	void setPin(int pin)
	{
		this.pin=pin;
		if(pin==1234)
		{
			System.out.println("Your Pin Is Successfully Access ");
			System.out.println("\n Hlw,"+this.name+" Sir Which Option Do You Prefer ? \n");
			System.out.println("1. Check Bank Ballence ");
			System.out.println("2. Widrwal Bank Ballence ");
			System.out.println("3. Credited Bank Ballence ");
			System.out.println("4. Press 0 For Exit ");
			System.out.print("\n Inputed Option : ");
			n=sc.nextInt();
			if(n==0)
			{
				System.out.println("Thanku For Using This ATM ");
			}
			else
			{
			switch(n)
			{
			case 1:
				System.out.println("Your Bank Balance is :"+ballence);
				break;
			case 2:
				System.out.print("How Much Money Do You Want To Withdrawl :");
				double w=sc.nextDouble();
				System.out.println(w+" Rs Successfully Withdrawl in Your Account ");
				widrwal=ballence-w;
				System.out.println("Your Total Amt. Ballence is : "+widrwal);
				break;
			case 3:
				System.out.print("How Much Money Do You Want To Credited : ");
				double c=sc.nextDouble();
				System.out.println("Your "+c+" Rs Successfully Credited in Your Account");
				credited=ballence+c;
				System.out.println("Your Total Ballence is : "+credited);
				break;
			default :
				System.out.println("Invalid Option ");
				break;
			}
			}
		}
		else
		{
			System.out.println("Wrong Pin !");
		}
	}
	int getPin()
	{
		return pin;
	}
}																	
public class NewVariable 
{			  									
	public static void main(String[] args)   
	{								
		System.out.println("Welcome To BoB World Bank ");
		ATM a=new ATM();
		Scanner sc=new Scanner(System.in); 
		System.out.print("Inputed Your Name : ");
		a.name=sc.nextLine();
		System.out.print("Inputed Four Digit ATM Pin : ");
		a.setPin(sc.nextInt());
		sc.close();
	}
}