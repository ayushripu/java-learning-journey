package com.CheckCollectionMethod;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> List1= new ArrayList<>();
		
			List1.add(25);
			List1.add("Java");
			List1.add(77.7);
			List1.add(49);
		System.out.println("List1 = "+List1);
		
//		System.out.println(List1.contains(25));
		
		List<Object> List2= new ArrayList<>();
			List2.add(25);
			List2.add("Java");
			List2.add(77.7);
			
			System.out.println("List2 = "+List2);
			
			System.out.println("List2 Contais All Elements of List1 : "+ List2.containsAll(List1));
			System.out.println("List1 Contais All Elements of List2 : "+ List1.containsAll(List2));
			System.out.println("Before Remove List1 = "+List1);
			System.out.println("After Remove Elements from List1: "+List1.remove(3));
			System.out.println("After Remove List1 = "+List1);
//			System.out.println();
	}

}
