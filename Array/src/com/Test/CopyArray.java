package com.Test;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) 
	{
		int a[]= {2,4,7,8,3};
		int b[]=new int[a.length];
//		for(int i=0;i<a.length;i++)			1
//		{
//		
//			b[i]=a[i];
//		}
		b=Arrays.copyOf(a, a.length);
		System.out.println("a[i]="+Arrays.toString(a));
		System.out.print("b[i]="+Arrays.toString(b));
	}

}
