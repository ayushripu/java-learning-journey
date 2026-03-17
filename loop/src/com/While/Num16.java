package com.While;

import java.util.Scanner;

public class Num16
{
public static void main(String[] args) 
	{
		int i=1,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Table :-> ");
		n=sc.nextInt();
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
			sc.close();
		}
	}
}
