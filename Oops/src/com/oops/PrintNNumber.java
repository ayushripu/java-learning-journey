package com.oops;

import java.util.Scanner;

class My
{
	int n,i;
}
public class PrintNNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Inputed Last Digit You Want To Print ");
		Scanner sc=new Scanner(System.in);
		My m=new My();
		m.n=sc.nextInt();
		for(m.i=1;m.i<=m.n;m.i++)
		{
			System.out.println(m.i);
			//sc.close();
		}
		
	}

}
