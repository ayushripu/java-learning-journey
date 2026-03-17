package com.Polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Cant says Shape");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Square Shape");
	}
}
public class RunTimePolymorphism {  //Method Overriding
	public static void main(String[] args) {
		Shape s=new Square();
		{
			s.draw();
		}
	}

}
