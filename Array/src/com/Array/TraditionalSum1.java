package com.Array;
public class TraditionalSum1 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
