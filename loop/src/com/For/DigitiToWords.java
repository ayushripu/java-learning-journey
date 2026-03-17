package com.For;

import java.util.Scanner;

public class DigitiToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed  any Number :-> ");
		int n=sc.nextInt();
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			System.out.print(r+" ");
			switch(r)
			{
			case 1:System.out.println("one"); 
			break;
			case 2:System.out.println("Two"); 
			break;
			case 3:System.out.println("Three"); 
			break;
			case 4:System.out.println("Four"); 
			break;
			case 5:System.out.println("Five"); 
			break;
			case 6:System.out.println("Six"); 
			break;
			case 7:System.out.println("Seven"); 
			break;
			case 8:System.out.println("Eight"); 
			break;
			case 9:System.out.println("Nine"); 
			break;
			case 0:System.out.println("Zero"); 
			break;
			}
		}
	}

}
