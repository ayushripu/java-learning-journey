package com.linkedlist;

public class Basic {
	public static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(15);
		Node b = new Node(18);
		Node c = new Node(21);
		Node d = new Node(22);
		Node e = new Node(26);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		display(a);
	}

}
