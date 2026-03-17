package com.linkedlist;

import java.util.Scanner;
public class LinkedList{
	
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data)
	{
		Node headNode = new Node(data);
		if(head == null)
		{
			head = tail = headNode;
			return;
		}
		headNode.next = head;
		head = headNode;
	}
	
	public void addLast(int data)
	{
		Node tailNode = new Node(data);
		if(head == null)
		{
			head = tail = tailNode;
			return;
		}
		else
		{
			tail.next = tailNode;
			tail = tailNode;
		}
	}
	
	public void addMid(int data, int index)
	{
		if(index == 0)
		{
			addFirst(0);
			return;
		}
		Node midNode = new Node(data);
		int i=0;
		Node temp =head;
		while(i<index-1)
		{
			temp = temp.next;
			i++;
		}
		midNode.next=temp.next;
		temp.next=midNode;
		
	}
	public void print()
	{
		Node pr=head;
		if(head == null)
		{
			System.out.println("LL is Empty");
		}
		else
		{
			while(pr != null)
			{
				System.out.print(pr.data+"->"); 
				pr=pr.next;
			}
			System.out.println("null");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addFirst(20);
		ll.print();
		ll.addFirst(10);
		ll.print();
		ll.addLast(30);
		ll.print();
		ll.addLast(40);
		ll.print();
		ll.addMid(25, 2);
		ll.print();
	}
}