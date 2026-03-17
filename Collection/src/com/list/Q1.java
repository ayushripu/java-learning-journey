package com.list;
import java.util.*;
public class Q1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		List<Integer> l=new ArrayList<>();
		int k = 0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("Inter "+i+" Element : ");
			l.add(sc.nextInt());
		}
		System.out.println("Original List: "+l);
		if(k == k)
		{
			l.remove(Integer.valueOf(k));
		}
		
		
		
		System.out.println("After Removing 30: "+l);
		
		System.out.println("Elements in the list:");
		for(int p : l)
		{
			System.out.println(p);
		}
	}
}