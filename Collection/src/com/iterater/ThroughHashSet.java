package com.iterater;
import java.util.*;
public class ThroughHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Set<Integer> st=new HashSet<>();
		
		for(int i=0;i<5;i++)
		{
			System.out.print((i+1)+": ");
			st.add(sc.nextInt());
		}
		
		System.out.println("HasSet Value before iterate: "+st);
		Iterator<Integer> it = st.iterator();
		
		System.out.print("Even: ");
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
//			else
//			{
//				System.out.println("Odd :"+i);
//			}
		}
	}
}