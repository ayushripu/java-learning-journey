package com.classs;
import java.util.*;

class Student
{
	String name ;
	int roll;
	double marks;
	
	public void displayDetails()
	{
	System.out.println("Name = "+name+"\n"+"Roll = "+roll+"\n"+"Marks = "+marks);	
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		s.name = sc.nextLine();
		System.out.print("Enter Your Roll: ");
		s.roll = sc.nextInt();
		System.out.print("Enter Your Marks: ");
		s.marks= sc.nextDouble();
		
		s.displayDetails();
	}

}
