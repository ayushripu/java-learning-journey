package com.Switch;
import java.util.Scanner;
public class Atm2 
{
	public static void main(String[] argss) 	
	{			
		int pin=3456,n,bls=1000;
		System.out.println("Welcome To SBI ATM");
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Wht's Your Name :-> ");
		name=sc.nextLine();
		System.out.print("Hello "+name+" Sir Please Inputed 4 Digit ATM Pin :-> ");
		n=sc.nextInt();
		if(n==pin)
		{
			System.out.println("Your Pin is Successfuly Access");
			System.out.println("\nWhat Can I Help You "+name+" sir\n");
			for(int i=0;;i++)
		{
			System.out.println("Press 1 For Check Bank Balance ");
			System.out.println("Press 2 For Credited Bank Balance ");
			System.out.println("Press 3 For Debited Bank Balance ");
			System.out.println("Press 0 For Exit ");
			System.out.print("\n Which Option Do You Want TO Choose :-> ");
		    n=sc.nextInt();
		if(n==0)
		{
			System.out.println("Thanks for Using This Machine");
			break;
		}
						switch(n)
			{
			case 1:
				System.out.println("Your Bank Ballance is "+bls);
				break;
			case 2:
				System.out.print("How Much Money Do You Want To Credited : ");
				int cre=sc.nextInt();
				bls=bls+cre;
				System.out.println("Your Total "+cre+" Rs Successfully Credited in Your Account");
				System.out.println("Your Total Ballence is :- "+bls);
				break;
			case 3:
				System.out.print("How Much Money Do You Want To Debited : ");
				int deb=sc.nextInt();
				bls=bls-deb;
				System.out.println(deb+" Rs Debited in Your Account");
				System.out.println("Your Total Ballence is :- "+bls);	
				break;
				default:
				System.out.println("Invalid Option");
				break;
			}
		}
		sc.close();
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
}