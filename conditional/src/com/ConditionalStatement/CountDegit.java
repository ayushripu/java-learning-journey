package com.ConditionalStatement;

public class CountDegit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 789;
		int deg  = 0;
		int count = 0;
		int feb = n;
		while(n>0)
		{
			int a = n%10;
			deg = deg * 10 + a;
			n = n/10;
			count ++;
		}
		if(deg == feb)
		{
			System.out.println("Febonacci");
		}
		else
		{
			System.out.println("Not");
		}
	}
}