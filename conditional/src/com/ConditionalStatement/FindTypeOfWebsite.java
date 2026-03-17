package com.ConditionalStatement;
import java.util.Scanner;
public class FindTypeOfWebsite 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter Website Name :-> ");
		String web=s.next();
		String pro=web.substring(web.length()-4,web.length());
		System.out.print("Enter Protocol Name :-> ");
		String Extension=s.next();
		if(pro.equals(Extension))
		{
			System.out.println("Website extension Matching");
		}
		else
		{
			System.out.println("Website extension Not Match");
		}
	}
}