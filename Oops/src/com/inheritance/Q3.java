package com.inheritance;
class Person2
{
	public void getRole()
	{
		System.out.println("First you are A Person");
	}
}
class Teacher extends Person2
{
	public void getRole()
	{
		System.out.println("My Role is Teaching");
	}
}
class Student extends Person2
{
	public void getRole()
	{
		System.out.println("My Role is Study");
	}
}
public class Q3 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 s;
		s = new Student();
		s.getRole();
		s = new Teacher();
		s.getRole();	
	}
}