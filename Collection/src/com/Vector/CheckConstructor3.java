package com.Vector;
import java.util.*;
public class CheckConstructor3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v = new Vector<>(10,5);
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
//			System.out.print("Inputed "+i+" Element : ");
//			v.addElement(sc.nextInt());
			v.addElement(i);
		} 
		System.out.println(v.capacity());
		v.addElement(55);
		
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
