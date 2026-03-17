//print and cound even numbers
package com;

import java.util.Scanner;

public class vjhhjv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		System.out.print("Inputed First Number Number :-> ");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		System.out.print("Inputed Second Number Number :-> ");
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=n;i<=a.length;i++)
			
		{
			System.out.print(i+" ");
		}
		for(int i=n;i<=a.length;i++)
		{
			if(i%2==0)
			{
				System.out.print("\neven No is :-> "+i);
				 count++;
			}
		}
		System.out.println("\nTotal even Number is "+count);
	}
}