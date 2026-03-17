package com.newArray;

import java.util.Scanner;

public class Searching
{
	public static void main(String[] args) 
	{
		int n;
		int a[]= {2,6,7,4,9,1,4,6};
		int s=1;
		int index=linearSearch(a,s);
		String msg=  index!=-1?"Found":"Not Found";	
		System.out.println(msg);
	}
	public static int linearSearch(int[] a, int s) 
	{
		int index=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				index=i;
				break;
			}
		}
		return index;
	}
}