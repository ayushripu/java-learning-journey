package com.classs;

class Cylinder
{
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+Circumfrence()*height;
	}
	public double Circumfrence()
	{
		return 2*Math.PI*radius;
	}
	public double Volume()
	{
		return lidArea()*height;
	}
}
public class CheckCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Cylinder c=new Cylinder();
		
		c.radius=7;
		c.height=10;
		
		System.out.println("lidArea = "+c.lidArea());
		System.out.println("totalSurfaceArea = "+c.totalSurfaceArea());
		System.out.println("Volume = "+c.Volume());
				
	}

}
