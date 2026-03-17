package com.inheritance;
class Shape 
{
	void area()
	{
		System.out.println("Area not define");
	}
}
class Circle extends Shape
{
	double radius;
	Circle (double radius)
	{
		this.radius=radius;
	}
	@Override
	
	void area()
	{
		double AreaOfCircle= 3.14 * radius * radius;
		System.out.println("AreaOfCircle:-> "+AreaOfCircle);
	}
}

class Rectangle extends Shape
{
	double length;double breadth;
	
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	
	void area()
	{
		double AreaOfRectangle=length*breadth;
		System.out.println("Area of Rectangle ="+AreaOfRectangle);
	}
}
class CheckArea
{
	public static void main(String[]args)
	{
		Shape[] s=new Shape[2];
		s[0]=new Circle(5);
		s[1]=new Rectangle(4,5);
		for(Shape s1 : s)
		{
			s1.area();
		}
	}
}