package com.encapsulation;
class School2
{
	private int roll = 19;
	
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int rollnumber)
	{
		this.roll=rollnumber;
		System.out.println(this.roll);
	}
}
public class Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School2 sc = new School2();
		sc.setRoll(88);
		
		

	}

}
