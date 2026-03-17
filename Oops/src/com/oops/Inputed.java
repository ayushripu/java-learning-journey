package com.oops;
import java.util.Scanner;
class Name
{
	String n,v;
}
public class Inputed 
{
	public static void main(String[] args) 
	{
		System.out.print("What is Your Name :");
		Scanner sc=new Scanner(System.in);
		Name na=new Name();
		na.n=sc.nextLine();
		System.out.print("Village Name : ");
		na.v=sc.nextLine();
		System.out.println("Your Name is : "+na.n);
		System.out.print("Your Village is : "+na.v);
		sc.close();
	}
}