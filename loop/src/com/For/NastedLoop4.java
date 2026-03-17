package com.For;
public class NastedLoop4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<11;i++)
		{
			for(int j=2;j<=4;j++)
			{
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
	}
}