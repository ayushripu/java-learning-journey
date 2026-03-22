package com.lembda;
@FunctionalInterface
interface Add1
{
	int add(int a, int b);
}
public class ReturnLembda 
{
	public static void main(String[] args)
	{
		Add1 a = (int c, int d) ->  c+d;
		
		System.out.println(a.add(5, 10));
		
	}

}
