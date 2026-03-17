package com.constructor;
class Mobile
{
	int rate;
	String brand;
	String type;
	Mobile(String t,String b,int r)
	{
		this.rate=r;
		this.brand=b;
		this.type=t;
	}
}
class Smart extends Mobile
{
		int number;
		Smart(String t,String b,int r,int n)
		{
			super(t,b,r);
			this.number=n;
		}
		
		void display()
		{
			System.out.println("Rate : "+this.rate);
			System.out.println("Brand :"+this.brand);
			System.out.println("type :"+this.type);
			System.out.println("Number :"+number);
		}
}
public class Superr 
{
	public static void main(String[] args) 
	{
		Smart ph=new Smart("TouchPAd","OppO",100000,2);
		ph.display();
	}
}
