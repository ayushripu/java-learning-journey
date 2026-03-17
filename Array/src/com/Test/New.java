package com.Test;

import java.util.Arrays;

public class New {

	public static void main(String[] args) 
	{
		int a[]=new int[100];
		int b[]=new int[a.length];
		int in=0;
		
		for(int i=0;i<a.length;i++) 
		{
			a[i]=i+1;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0 && a[i]%5==0)
			{
				b[in]=a[i];
				in++;
			}
		
		}
		System.out.println("original arrays is");
		
		System.out.println(Arrays.toString(a));
		b=Arrays.copyOfRange(b, 0, in);
		System.out.println("After copy");
		
		System.out.println(Arrays.toString(b));
	}

}
