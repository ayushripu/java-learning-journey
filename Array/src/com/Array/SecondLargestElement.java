package com.Array;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Inputed How Many Number Do You Want :-> ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Inputed "+(i+1)+" Number = ");
			a[i]=sc.nextInt();
		}
		int max1,max2;
	    max1=max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Second Maximum Number = "+max2);
	}

}
