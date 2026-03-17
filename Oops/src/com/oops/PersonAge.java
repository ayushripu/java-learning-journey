package com.oops;
class Pen
{
	String Color;
	String Type;
	public void Write()
	{
		System.out.println("Perfect Pen");
	}
		public class PersonAge
		{
			public static void main(String[]args)
			{
				Pen p=new Pen();
				p.Color="Black";
				p.Type="Gel";
				p.Write();
			}
		}
}