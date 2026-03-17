package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray
{
	public static void main(String[] args) 
	{
			
			int a[]= {2,4,7,8,3};
			int b[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
			
				b[i]=a[i];
			}
			System.out.println("a[i]="+Arrays.toString(a));
			System.out.print("b[i]="+Arrays.toString(b));
	}
}
