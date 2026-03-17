package com.mehod;
public class Check1 
{
	static void update(int a[])
	{
		a[1]= 22;
	}
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6};
		update(a);
		System.out.println(a[1]);
	}
}