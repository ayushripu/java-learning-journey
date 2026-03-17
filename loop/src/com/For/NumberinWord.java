package com.For;

import java.util.Scanner;

public class NumberinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inputed 1st Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str = "";
		char c = 0;
		
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			str=str+r;
		}
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--)
		{
			c=str.charAt(i);	
			switch(c)
			{
			case '1':
				System.out.println("one");
				break;
			case '2':
				System.out.println("two");
				break;
			case '3':
				System.out.println("three");
				break;
			case '4':
				System.out.println("four");
				break;
			case '5':
				System.out.println("five");
				break;
			case '6':
				System.out.println("six");
				break;
			case '7':
				System.out.println("seven");
				break;
			case '8':
				System.out.println("eight");
				break;
			case '9':
				System.out.println("nine");
				break;
			case '0':
				System.out.println("Zero");
				break;
		}
		}

	}

}
