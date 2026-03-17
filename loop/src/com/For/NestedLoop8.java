package com.For;
public class NestedLoop8 
{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*5-1;k++)
			{
				System.out.print(" ");
				ch++;
			}
			System.out.println(ch);
		}
	}
}
