package com.For;

import java.util.Scanner;

public class PerfectNumber
{

	public static void main(String[] args) 
	{
		int i,n,per=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed a number :->  ");
		n=sc.nextInt();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				per=per+i;
				System.out.println(per);
			}
			sc.close();
		}
		if(per==0)
		{
			System.out.println("Perfect Number");
		}
			else
			{
				System.out.println("Not Perfect");
			}
		
	}

}
