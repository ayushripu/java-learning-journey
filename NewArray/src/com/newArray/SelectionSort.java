package com.newArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int a[]= {2,6,-7,-6,4,9,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
