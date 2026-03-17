package com.leetcode;
import java.util.*;


class Solutio {
    public void reverseString(char[] s) 
    {
//         char ch;
        for(int i=0, j= s.length-1; i<j; i++, j--)
        {
            char swap = s[j];
                s[j] = s[i];
                s[i] = swap;
        }
        for(char c : s)
		{
			System.out.print(c+" ");
		}
    }

}
public class Q344 {
	
	public static void main(String[] args) 
	{ 
		Solutio sl = new Solutio();
		Scanner sc=new Scanner(System.in);
		
		char[] s =new char[5];
		
		for(int i=0; i<s.length; i++)
		{
			System.out.print("Inputed String: ");
			s[i]= sc.next().charAt(0);
		}
		
		sl.reverseString(s);
		
		
	} 
} 