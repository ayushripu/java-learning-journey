package com.For;
import java.util.Scanner;
public class Number
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Last Number :-> ");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+4)
		{
			if(i%3!=0)
			{
				System.out.println(i);
			}
			
			sc.close();
		}
		
	}
}
