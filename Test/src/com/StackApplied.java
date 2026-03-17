package com;

import java.util.Scanner;
import java.util.Stack;

public class StackApplied {
	public static boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(char ch : s.toCharArray())
		{
			if(ch == '(' || ch == '{' || ch == '[')
			{
				stack.push(ch);
			}
			if(ch == ')' || ch == '}' || ch == ']')
			{
				char c= stack.pop();
				if((ch == ')' && c != '(' ) || (ch == '}' && c != '{' ) || 
						( ch == ']' && c != '[' ) )
					{
							return false;
					}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		//StackApplied st=new StackApplied();
		System.out.println("Enter the Expression :-> ");
		String exp=sc.next();
		for(int i=0;i<exp.length();i++)
		{
			char enp=exp.charAt(i);
			System.out.println("index = "+enp);
			StackApplied.isValid(exp);
		}
		
		
	}

}
