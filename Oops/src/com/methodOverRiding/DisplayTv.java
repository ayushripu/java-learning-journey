package com.methodOverRiding;
class Tv
{
	public void volume()
	{
		System.out.println("TV Increse/Decrese Volume");
	}
	public void changeChannel()
	{
		System.out.println("TV Change Channel ");
	}
}
class SmartTv extends Tv
{
	public void volume()
	{
		System.out.println("Smart Tv Increse/Decrese Volume");
	}
	public void changeChannel()
	{
		System.out.println("Smart TV Change Channel ");
	}
	public void browsing()
	{
		System.out.println("Internet Browsing Available");
	}
}
public class DisplayTv {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.changeChannel();
		t.volume();
		System.out.println("***********");
		SmartTv st = new SmartTv();
		st.browsing();
		st.changeChannel();
		st.volume();
	}

}
