package com.abstract1;
abstract class School6
{
	private int roll;
	private String name;
	public School6(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}	
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
}
class Student5 extends School6 {

    public Student5(int roll, String name) {
        super(roll, name);
    }
}
public class CheckAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student5 s = new Student5(9, "ayush");
		
		System.out.println("Roll No = "+ s.getRoll());
		System.out.println("Name = "+ s.getName());
	}

}
