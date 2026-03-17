package com.While;
import java.util.Scanner;
public class Number4 
{
	public static void main(String[] args)
	{
		int i=1,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Number :-> ");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println((i*i*i));
			i++;
			sc.close();
		}
	}
}
