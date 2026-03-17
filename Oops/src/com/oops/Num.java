package com.oops;

import java.util.Scanner;

class Find
{
	int n,i;
}
public class Num 
{
	public static void main(String[] args) 
	{
		System.out.print("Inputed Last Number : ");
		Scanner sc=new Scanner(System.in);
		Find f=new Find();
		f.n=sc.nextInt();
		for(f.i=1;f.i<=f.n;f.i+=4)
		{
			if(f.i%3!=0)
			{
				System.out.println(f.i);
				sc.close();
			}
		}
	}

}
