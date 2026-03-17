package com.Operators;
import java.util.Scanner;
//wap to take input number and print 20% of it
public class Q4 
{
	public static void main(String[] args) 
	{
		int n;
		double res;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Inputed a Number :-> ");
		n=Sc.nextInt();
		res=(n*20)/100;
		System.out.println(res);
		Sc.close();
	}
}
