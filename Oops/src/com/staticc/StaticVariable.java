package com.staticc;
class Student
{
	String name;
	int rollNo;
	static int classes;
	public void display()
	{
		System.out.println(name+" "+rollNo+" "+classes+" ");
	}
	public static void display1(Student std1)
	{
		System.out.println(std1.name+" "+std1.rollNo+" "+classes+" ");
	}
}
public class StaticVariable
{
	public static void main(String[]args)
	{
		Student std = new Student();
//		std.classes=7;
		std.name="Ayush";
		std.rollNo = 5;
		
		Student std1 = new Student();
//		std1.classes=7;
		std1.name="Piyush";
		std1.rollNo = 8;
		
		Student.classes = 6; /*Static variable Directly
							  Access through class Name*/
		System.out.println("Instance Meyhod");
		std.display();
		
		System.out.println("Static method");
		Student.display1(std1);
	}

}
