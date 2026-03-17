package com.inter;
interface PrivateSchool
{
	abstract void details();
}
class PrivateCollege implements PrivateSchool
{
	int roll;
	String name;
	
	public PrivateCollege(int r, String n)
	{
		this.roll=r;
		this.name=n;
	}
	public void details()
	{
		System.out.println("Roll NO : "+this.roll);
		System.out.println("Name : "+this.name);
	}
} 
public class StudentDetails 
{
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		PrivateCollege pc = new PrivateCollege(22, "Ayush");
		
		pc.details();
	}
}