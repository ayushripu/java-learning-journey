package com.FirstTest;
import java.util.Scanner;
public class Fjhjhkj 
{
	public static void main(String[] args) 
	{
		int max2=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Size of Array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]<max1)
			{
				max2=a[i];
			}
		}
		System.out.println("Smax ="+max2);
		sc.close();
	}
}