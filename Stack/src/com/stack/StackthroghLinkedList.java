package com.stack;
import java.util.*;
public class StackthroghLinkedList {
//	Node head; 
	public class Node
	 {
		 int data;
		 Node next;
		 
		 Node(int data)
		 {
			 this.data=data;
			 next=null;
		 }
	 }
	 
	 public class stack
	 {
		 public static Node head;
		 public static boolean isEmpty()
		 {
			return head == null; 
		 }
		 
		 public static void push()
		 {
			 Node newNode = null;
			if(isEmpty())
			 {
				 head = newNode;
				 return;
			 }
			 else
			 {
				 newNode.next=head;
				 head=newNode;
			 }
		 }
	 }
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty())
		{
			System.out.println(s.push(s));
		}
	}

}
