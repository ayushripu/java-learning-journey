package com.Array;

import java.util.Scanner;

public class TryNew 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Object[] a= {1,"Ayush",'A', 1.3 , true};
		for(Object o:a)
		{
			System.out.println(o);
			sc.close();
		}
	}
}