package com.oops;
class Mybox
{
	double width;
	double length;
	double height;
}
public class Box 
{
	public static void main(String[] args) 
	{
		Mybox mb=new Mybox();
		mb.width=10;
		mb.length=20;
		mb.height=15;
		
		double vol=mb.width*mb.length*mb.height;
		System.out.println("Area of Volume is : "+vol);
	}
}
