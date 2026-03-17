package com.oops;
import java.util.Scanner;
class Reasoning
{
	int n,i;
}
public class Num2 
{
	public static void main(String[] args) 
	{
		System.out.print("Inputed Last Digit : ");
		Scanner sc=new Scanner(System.in);
		Reasoning r=new Reasoning();
		r.n=sc.nextInt();
		for(r.i=1;r.i<r.n;r.i+=1)
		{
			System.out.println((r.i*r.i)+1);
		}	
	}
}