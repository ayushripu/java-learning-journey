package com.For;
import java.util.Scanner;
public class Numric
{
	public static void main(String[] args)
	{
	int i,n;	
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Inputed Last Digit :-> ");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++)
	 {
		System.out.println((i*i)+1);
		sc.close();
	 }	
	}
	
}
