package com.CurserConcept;
import java.util.*;
public class ListIteratorCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls = new LinkedList<>();
		for(int i=0;i<=10;i++)
		{
			ls.add(i);
		}
		System.out.println(ls);
		
		ListIterator<Integer> ltr=ls.listIterator();
		while(ltr.hasNext())
		{
			Integer I=(Integer)ltr.next();
			if(I%2==0)
			{
				System.out.println(I);
				if(I == 10)
				{
					ltr.set(12);
				}
			}
			
		}
		System.out.println(ls);
	}
}
