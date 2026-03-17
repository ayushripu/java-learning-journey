package com.Array;
public class Integer 
{
	public static final int MAX_VALUE = 0;

	public static void main(String[] args)
	{
		int a[]=new int[] {2,3,5,7};
		//for(int i:a)			(Method 1)
		for(int i=0;i<a.length;i++)    //(Method 2)
		{
			System.out.println(a[i]);
		}
	}
}
