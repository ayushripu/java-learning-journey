package com.CurserConcept;
import java.util.*;
public class IteratorCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l=new ArrayList<>();
		
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator<Integer> itr= l.iterator();
		while(itr.hasNext())
		{
			Integer I=(Integer)itr.next();
			
			if(I%2==0)
			{
				System.out.println(I);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}

}
