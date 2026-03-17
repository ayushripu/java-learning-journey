package com.classs;
class Rec
{
	private int length;
	private int breath;
	
	int getlength()
	{
		return length;
	}
	void setlength(int l)
	{
		length=l;
	}
	int getbreath()
	{
		return length;
	}
	void setbreath(int b)
	{
		breath=b;
	}
	public int area()
	{
		return length*breath;
	}
	public int parameter()
	{
		return 2*length+breath;
	}
}
public class GaterSeter
{
	public static void main(String[] args) {
		 Rec r=new Rec();
		 r.setlength(10);
		 r.setbreath(5);
		 
		 System.out.println("Area = "+r.area());
		 System.out.println("Parameter = "+r.parameter());

	}
}
