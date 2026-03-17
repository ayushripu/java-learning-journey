package com.ConditionalStatement;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=288,c=10,d=32;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is greater");
		}
		else 
		{
			if(b>a && b>c && b>d)
			{
				System.out.println("B is Greater");
			}	
			else
			{
				if(c>a && c>b && c>d)
				{
					System.out.println("C is greater");
				}
				else
				{
				System.out.println("d is greater");
				}
			}
		}
	}

}
