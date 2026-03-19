package com.abstract1;
abstract class Shape
{
	public abstract void area();
}
//Circle Class
class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	public void area()
	{
		double Ac = 3.14 * radius * radius;
		
		System.out.println("Area of Circle = "+Ac);
	}
}

//Rectangle Class
class Rectangle extends Shape
{
	double height;
	double width;
	Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	@Override
	public void area()
	{
		double Ar = width * height;
		
		System.out.println("Area Of Rectangle = "+Ar);
	}
}
public class ShapeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		
		s = new Circle(1.4);
		s.area();
		
		s = new Rectangle(7.9, 8.6);
		s.area();
	}

}
