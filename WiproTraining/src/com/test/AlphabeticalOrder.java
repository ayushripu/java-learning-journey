package com.test;

public class AlphabeticalOrder 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char a1=115;
		char a2=101;
		System.out.println("Before \n"+a1+","+a2);
			if(a1<a2)
			{
				System.out.println(a1+","+a2);
			}
			else
			{
				System.out.println("After");
				System.out.println(a2+","+a1);
			}
	}
}