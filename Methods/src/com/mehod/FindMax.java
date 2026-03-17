package com.mehod;

public class FindMax 
{
	static int max(int a[])
	{
		int m=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=m)
			{
				m=a[i];
			}
		}
		return m;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,5,3,2};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(max(a));
			break;
		}
	}
	
}
