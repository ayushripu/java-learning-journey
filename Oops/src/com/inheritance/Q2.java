package com.inheritance;
class Phone
{
	public void call()
	{
		System.out.println("Phone can Makes Call");
	}
}
class SmartPhone extends Phone
{
	public void call()
	{
		super.call();
		
		System.out.println("SmartPhone can make video calls\r\n"+ "");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone sp = new SmartPhone();
		
		sp.call();
	}

}
