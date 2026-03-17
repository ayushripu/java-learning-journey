package com.leetcode;
import java.util.*;
public class Q290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String a = "a" ,b;
		
		System.out.print("Enter String Value: ");
		String pattern = sc.next();
		
		char ch[] = pattern.toCharArray();
		
		for(int i= 0; i<ch.length; i++)
		{	
			
			if (String.valueOf(ch[i]).equalsIgnoreCase(a) ) 
			{
				a="dog";
			    System.out.println(a);
//			    break;`
			}
//			System.out.println(a);
		}
	}
}