package com.oops;
class Person
{
	private String name  ;
	private String Gender;
	public Person(String n,String g)
	{
		this.name=n;
		this.Gender=g;
	}
	String getPerson()
	{
		return this.name;
		
	}
	String getPer()
	{
		return this.Gender;
	}
	public void details()
	{
		System.out.println("Name   : "+this.name);
		System.out.println("Gender : "+this.Gender);
	}
}
class Student extends Person
	{
		private int roll;
		private String Cource;
	public Student(String n, String g,int r,String c) 
	{	
		super(n, g);
		this.roll=r;
		this.Cource=c;
	}
	int getStu()
	{
		return this.roll;
	}
	String getSt()
	{
		return this.Cource;
	}
	public void printdetails()
	{
		this.details();
		System.out.println("Roll   : "+this.roll);
		System.out.println("Course : "+this.Cource);
	}		
	}
class Exam extends Student
	{
		private int time;
		private char grade;
	public Exam(String n, String g, int r, String c,int t,char gra) 
	{
		super(n, g, r, c);
		this.time=t;
		this.grade=gra;
	}
		int getTime()
		{
			return this.time;
		}
		char getTim()
		{
			return this.grade;
		}
		public void studentDetails()
		{
			this.printdetails();
			System.out.println("Time   : "+this.time);
			System.out.println("Grade  : "+this.grade);
		}
	}
public class Main 
{
	public static void main(String[] args) 
	{
		Exam ex=new Exam("Ayush","Male",1,"BCA",4,'A');
		ex.studentDetails();
	}
}