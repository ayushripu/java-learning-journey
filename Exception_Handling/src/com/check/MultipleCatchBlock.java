package com.check;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {80,60,0,71,30};
		
		try    
		{
			int c=a[0]/a[3];
			System.out.println("Division is= "+c);
			System.out.println(a[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator not equal to zero");
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
			System.out.println("Invalid Index");
		}
		
	}

}
