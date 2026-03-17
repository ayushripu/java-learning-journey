package com.staticc;
class Phonee
{
	static String PhoneType;
	String Brand;
	long Phno;
	public static void display(Phonee ph)
	{
		System.out.println(PhoneType+"\n"+ph.Brand+"\n"+ph.Phno);
	}
}
public class StaticMethod 
{
	public static void main(String[] args)
	{
		Phonee.PhoneType="SmartPhone";
		Phonee ph=new Phonee();
		ph.Brand="Nokia";
		ph.Phno=1209005007;
		
		Phonee.display(ph);
	}

}
