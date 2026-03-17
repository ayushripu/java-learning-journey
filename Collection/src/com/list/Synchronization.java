package com.list;
import java.util.*;
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al =new ArrayList<>();
		
		List<String> sy=Collections.synchronizedList(al);
		al.add("11");
		al.add("Shubh");
		al.add("11.4");
		System.out.println(al);
		System.out.println(sy);
		

	}

}
