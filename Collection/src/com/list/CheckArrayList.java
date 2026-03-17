package com.list;
import java.util.*;
public class CheckArrayList {

	public static void main(String[] args) {
		
		ArrayList <Object>l=new ArrayList<>();
		
		l.add(10);
		
		l.add("Ayush");
		l.add(10);
		l.add(null);
		
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "l");
		l.add("N");
		System.out.println(l);

	}

}
