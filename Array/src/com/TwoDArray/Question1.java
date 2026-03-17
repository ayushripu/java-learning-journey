package com.TwoDArray;

import java.util.Scanner;

public class Question1 {
	public static void main(String[]args)
	{
		int a[][]= {{2,3,4,5},{4,6,2,1}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
