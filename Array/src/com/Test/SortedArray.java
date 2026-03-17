package com.Test;

public class SortedArray {
	public static void main(String[] args) {
		
		int a[]= {4,1,7,3};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter Sorting");
		for(int i=0;i<a.length;i++)
		{
			for(int j = i; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int p = a[j];
					a[j] = a[i];
					a[i] = p;
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
