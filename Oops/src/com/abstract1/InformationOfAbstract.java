package com.abstract1;
import java.util.*;
abstract class School
{
	public abstract void Student1();
	public abstract void Student2();
}
abstract class StudentInformation extends School
{	
	public void Student1()
	{	
		System.out.println("1st Student Name is Ayush");
		System.out.println("1st Student Age is 24");
	}
}

class NewInfo extends StudentInformation
{
	
	 public void Student2()
	 {
		 System.out.println("2md Student Name is Ved");
			System.out.println("2nd Student Age is 22");
	 }
}

public class InformationOfAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewInfo si = new NewInfo();
		
		si.Student1();
		System.out.println();
		si.Student2();
		
		
	}

}
