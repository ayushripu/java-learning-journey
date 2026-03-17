package com.check;
//import java.util.InputMismatchException;
import java.util.Scanner;
class Demo extends Throwable
{
	void sum(int a,int b) throws Exception
	{
		if(a<0 || b>100)
		{
			throw new Exception("Number is in between 0 to 100 ");
		}
		int c=a+b;
		System.out.println("Sum = "+c);
	}
}
public class CheckThrows {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try
		{
			d.sum(x, y);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Done");
		}
	}

}
