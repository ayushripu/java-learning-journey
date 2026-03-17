package com;

import java.util.Arrays;
public class Pol 
{
	public static void main(String[] args) 
	{
		int a[]=new int[100];
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(ispolly(a[i])==true)
			b[index]=a[i];
			index++;
		}
			b=Arrays.copyOfRange(b,0, index);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
	}
	public static boolean ispolly(int n)
	{
		int rev=0,rem;
		int org=0;
		while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		if(org==n)
			return true;
			else
				return false;
				
				
	}
}