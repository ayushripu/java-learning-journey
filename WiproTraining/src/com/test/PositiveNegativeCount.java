package com.test;

import java.util.Scanner;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number[]=new int[5];
		
		for(int i=0; i<number.length; i++)
		{
			System.out.print((i+1)+" number is : ");
			number[i]=sc.nextInt();
		}
		int Poscount=0, Negcount=0;
		for(int i=0; i<number.length; i++)
		{
			if(number[i]>=0)
			{
				Poscount += 1;
			}
			else
			{
				Negcount +=1;
			}
		}
		System.out.println("Total Positive Number is : "+Poscount);
		
		System.out.println("Total Negative Number is : "+Negcount);
	}

}
