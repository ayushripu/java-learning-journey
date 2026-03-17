package com.oops;
import java.util.Scanner;

class Value
{
	double d,i;
}
public class DoublePrint {

	public static void main(String[] args)
	{
		System.out.println("Inputed Last Digit Of Double Value : ");
		Scanner sc=new Scanner(System.in);
		Value v=new Value();
		v.d=sc.nextDouble();
		for(v.i=1.2;v.i<=v.d;v.i+=1.2)
		{
			System.out.printf("%.1f\n",v.i);
			sc.close();
		}
	}

}
