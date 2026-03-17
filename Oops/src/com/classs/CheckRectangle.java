package com.classs;

class Rectangle {

	public float length;
	public float breath;
	
	public float area()
	{
		float RectangleofArea=length*breath;
		return RectangleofArea;
	}
	public float parameter()
	{
		float RectangleofParameter=(2*(length+breath));
		return RectangleofParameter;
	}
	
}
public class  CheckRectangle
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
			r.breath=5.5f;
			r.length=10.5f;
			
			System.out.println("Area ="+r.area());
			System.out.println("Parameter ="+r.parameter());
	}
}
