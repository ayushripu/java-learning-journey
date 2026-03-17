package com.Stack;
import java.util.*;

public class CheckStackMethod {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println(s.capacity());
		s.push("Ayush");
		s.push("Piyush");
		s.push("Ved");
		s.push("Hemant");
		
		System.out.println(s);
		System.out.println(s.search("Ayush"));
		System.out.println(s.search("Abhi"));
	}

}
