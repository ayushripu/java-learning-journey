package com.test;
class Box
{
	double width;
	double height;
	double depth;
	Box(double wid, double hei, double dep)
	{
		width=wid;
		height=hei;
		depth=dep;
	}
	public double volume()
	{
		return width*height*depth;
	}
}
public class BoxDimention {

	public static void main(String[] args) {
		
		
		Box b=new Box(0, 0, 0);
		b.depth=30;
		b.height=20;
		b.width=10;
		System.out.println(b.volume());
		
		
		
	}

}
