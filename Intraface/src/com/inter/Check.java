package com.inter;

interface Demo
{
	void sum();
	void sub();
	int a=2;
	int  b=4;
}
class Che implements Demo

{
	  
	int sum,sub=0;
	@Override
	public void sum()
	{
		sum = a+b;
		System.out.println("Sum = "+sum);
	}
	@Override
	public void sub()
	{
		sub=b-a;
		System.out.println("Sub = "+sub);
	}
	
}
public class Check{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Che d=new Che();
		
		d.sum();
		d.sub();
	}
	

}
