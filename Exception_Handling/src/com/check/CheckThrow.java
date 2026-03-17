package com.check;

public class CheckThrow {
	public int method2(int l,int b)	throws Exception
	{
		
		int c;
		if(l < 0 || b < 0)
		{
			throw new Exception("Length & Breath should be greater then zero");
		}
		
		c=l*b;
		return c;
	}
	public void method1()	throws Exception
	{
		int r;
//		try 
//		{
			r=method2(5,-4);
			System.out.println(r);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
	}
	public static void main(String[] args) 
	{
		CheckThrow ch=new CheckThrow();
		try {
			ch.method1();
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}

}
