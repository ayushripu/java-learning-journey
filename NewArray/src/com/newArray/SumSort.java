package com.newArray;

import java.util.Arrays;

public class SumSort {

	public static void main(String[] args) {
		int a[]= {5,-7,3,8,6,9,7};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==-1)
				{
					System.out.println("Value "+a[i]+"   "+a[j]);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
