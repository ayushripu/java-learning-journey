//print table of each element
package com;

import java.util.Scanner;

public class fhgfh {

	public static void main(String[] args) 
	{
		int n;
		System.out.print("Inputed Any Table Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		} 
	}
}