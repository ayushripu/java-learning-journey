package com.check;

public class ExceptionCalss 
{
		public static void main(String[] args) 
		{
			
			int a[]= {90,80,70,60,0};
			try
			{
			int c=a[0]/a[4];
			System.out.println("Result = "+c);
			}
			catch(ArithmeticException e)
			{
//				System.out.println("not devided by 0");
//				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
}