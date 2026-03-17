package com.Vector;
import java.util.*;
public class CheckConstructor1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		System.out.println("Bydefault vector capacity is:"+v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			System.out.print("Input "+i+" Element :");
			v.addElement(sc.nextInt());
		}
		System.out.println("after Total Number added  in vector then capacity is:  "+v.capacity());
		v.addElement(100);
		
		System.out.println("After adding some new Elementt in vector then Capacity of vector is : "+v.capacity());
	
		System.out.println(v);
	}

}
