//print and count all numbers that are prefect squares
package com;
import java.util.Scanner;
public class Jhhdjkdgfkj 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.print("Inputed 1st Number :-> ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Inputed 2nd Number :-> ");
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=n;i<=a.length;i++)
		{
			System.out.println(i);
		}
		for(int i=n;i<=a.length;i++)
		{
			if(i/i!=0)
			{
				System.out.println("Perfect Square Number is :-> "+i);
			}
		}
	}
}