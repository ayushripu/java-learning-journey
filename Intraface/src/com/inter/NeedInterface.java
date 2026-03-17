package com.inter;

class BMW
{
	public void Type()
	{
		System.out.println("Super Car");
	}
}
class Farari
{
	public void NewType(BMW topspeed)
	{
		topspeed.Type();
	}
}
public class NeedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		
		Farari a=new Farari();
		
		b.Type();
		
		a.NewType(b);
	
	}

}
