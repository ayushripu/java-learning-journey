package com.Test;

import java.util.Arrays;

public class NewCopy {

	public static void main(String[] args) 
	{
		int a[]=new int[201];
		int b[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+200;
		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%7==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("Before Copy");
		b=Arrays.copyOfRange(b, 0, index);
		System.out.println(Arrays.toString(a));
		System.out.println("After Copy");
		System.out.println(Arrays.toString(b));
	}
}
