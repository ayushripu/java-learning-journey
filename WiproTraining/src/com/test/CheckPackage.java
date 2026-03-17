package com.test;

class Class_2 extends CheckPackage2
{		
		Class_2()
		{
			System.out.println("Class 2");
		}
		static
		{
			System.out.println("its Static block inside a Child Class");
		}
}
public class CheckPackage 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Class_2 c=new Class_2();
	}
}