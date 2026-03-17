package com.For;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inputed a Number :-> ");
		int n = sc.nextInt();
		int fir=0,Sec=1;
		int next=0;
		System.out.print("Fibonacci Series: "+fir+" "+Sec);
		for(int i = 2; i < n; i++)
		{
			 next = fir + Sec;
			System.out.print(" " + next);
			fir = Sec;
			Sec = next;
		}
	}
}
