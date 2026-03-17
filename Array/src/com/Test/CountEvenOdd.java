package com.Test;
import java.util.Scanner;
public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		int EvenCount = 0,OddCount = 0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				EvenCount++;
			}
			else
			{
				OddCount++;
			}
		}
		System.out.println("Total Even No : "+EvenCount);
		System.out.println("Total Odd No : "+OddCount);
	}

}
