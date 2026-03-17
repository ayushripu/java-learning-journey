package com.Test;
public class Bubble_Sort 
{
	public static void main(String[] args) 
	{	
		int n=3;
		int a[]= {3,2,1};
		 int b[]=new int [5];
		
		System.out.println("Before Swaping");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(a[i]+" ");
		}	
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int p= a[j+1];
					a[j+1] = a[j];
					a[j] = p;
				}		
			}		
		}
		System.out.println("\nAfter Swaping");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}		
}		