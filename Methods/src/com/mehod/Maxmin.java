package com.mehod;
class CheckMax
{
	public int max(int a, int b)
	{
		if(a>b)
		{
			System.out.print("Greater Number is: "+a);
			return a;
		}
		else
		{
			System.out.print("Greater Number is: "+b);
			return b;
		}
	}
}
public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckMax cm=new CheckMax();
		cm.max(10, 20);
	}

}
