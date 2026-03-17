package com.newArray;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int a[]= {5,6,3,8,1,9,7};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
