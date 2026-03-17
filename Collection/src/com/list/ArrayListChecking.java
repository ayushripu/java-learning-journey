package com.list;

import java.util.*;
public class ArrayListChecking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How Many Elements Do You Want : ");
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+": ");
			ar.add(sc.nextInt());
		}
		
		System.out.println(ar);
	}
}