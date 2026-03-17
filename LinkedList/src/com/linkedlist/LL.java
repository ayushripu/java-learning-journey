package com.linkedlist;

public class LL {

	Node head;
//	Node tail;
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void addFirst(String data)
	{
		
		Node newNode=new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	Node currentnode;
	public void addlast(String data)
	{
		Node newNode=new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		currentnode=head;
		while(currentnode.next != null)
		{
			currentnode=currentnode.next;
		}
		
		newNode=currentnode.next;
	}
	
	
	public void print()
	{
		while(currentnode != null)
		{
			System.out.println(currentnode+"-> ");
		}
		System.out.println("Null");
//		newNode=currentnode.next;
	}
	public static void main(String[] args) {
		// TODO Auto-genera10ed method stub
			LL list =new LL();
		
			list.addFirst("Ayush");
			list.addFirst("Piyush");
			list.addlast("ok");
			list.addlast("mm");
			
			list.print();
	}

}
