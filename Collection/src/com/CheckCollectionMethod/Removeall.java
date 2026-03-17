package com.CheckCollectionMethod;
import java.util.*;
public class Removeall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter "+i+" Element of : ");
			l1.add(sc.nextInt());
		}
		System.out.println(l1);
		System.out.println(l1.removeAll(l1));
		System.out.println(l1);
	}

}
