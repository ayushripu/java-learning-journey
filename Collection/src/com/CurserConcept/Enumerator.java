package com.CurserConcept;

import java.util.*;

public class Enumerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			Integer K=(Integer)e.nextElement();
			
			if(K%2==0)
			{
				System.out.println(K);
			}
		}
		System.out.println(v);
	}

}
