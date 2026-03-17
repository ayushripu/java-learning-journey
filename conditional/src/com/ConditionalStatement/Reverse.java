package com.ConditionalStatement;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 999;
		int rev = 0;
		int pal = n;
		while(n>0)
		{
			int a = n%10;
			rev = rev * 10+a;
			n = n/10;
//			pal = n;
		}
		if(pal == rev)
		{
			System.out.println("Yes ");
		}
		else
		{
			System.out.println("No");
		}
	}
}