package com.constructor;
class Rectangle
{
	int length;
	int breadth;
	Rectangle()
	{
		 length= 1;
		 breadth=1;
	}
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Cuboidd extends Rectangle
{
	int height;
	
	Cuboidd()
	{
		height =1;
	}
	Cuboidd(int h)
	{
		//super(l,b);
		height = h;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
}
public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboidd cu=new Cuboidd(2);
		System.out.println(cu.volume());
	}

}
