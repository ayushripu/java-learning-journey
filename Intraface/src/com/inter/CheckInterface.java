package com.inter;
interface  School
{
	abstract void roll();
}
class College implements School
{
	public void roll()
	{
		System.out.println(55);
	}
}
public class CheckInterface 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		College c = new College();	
		c.roll();
	}
}