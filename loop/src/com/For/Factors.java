package com.For;

import java.util.Scanner;

public class Factors
{
	public static void main(String[] args) 
	{
		int n,i,Factor=0;
		Scanner sc = new Scanner(System.in); 
		sc.close();
		{
			System.out.print("Inputed a Number :-> ");
			n=sc.nextInt();
			for(i=1;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(i);
					Factor++;
					//sum+=i;
				}
			}
			System.out.println("Total Factor of : "+Factor);
			//	System.out.println("Sum of Total Factors : "+sum);
		}
	}
}
