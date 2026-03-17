package com.While;


public class Num21 
{
	public static void main(String[] args) 
	{
		int i,j=0;
		for(i=1;i<=5;i++)
		{
			j=j*10+1;
			System.out.print(j);
			if(i<=4)
			{
				System.out.print("+");
			}
		}
	}
}