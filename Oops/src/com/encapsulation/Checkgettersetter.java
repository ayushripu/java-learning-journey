package com.encapsulation;
import java.util.*;
class Student
{
	private int roll = 34;
	
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int rollNumber)
	{
		if(rollNumber <= 0)
		{
			throw new IllegalArgumentException("Roll Number is always greater then 0");
		}
		this.roll= rollNumber;	
	}	
}
public class Checkgettersetter 
{
	public static void main(String[] args) {
		
		Student s = new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input Roll No: ");
		s.setRoll(sc.nextInt());
		
		System.out.println("Roll No is : "+s.getRoll());
	
	}

}
