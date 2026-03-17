package com.list;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Numbers Do You Want: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();

		for(int i =0; i<n ;i++)
		{
			ar.add(sc.nextInt());
		}
//		ar.sort(null);
		System.out.println("Before: "+ ar);
//		HashSet<Integer> arr = new HashSet<Integer>(ar);
		
//		ar.clear();
//		ar.addAll(arr);
		
//		System.out.println("After: "+ar);
	}
}