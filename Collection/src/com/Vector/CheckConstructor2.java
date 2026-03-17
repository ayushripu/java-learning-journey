package com.Vector;
import java.util.*;
public class CheckConstructor2 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				Vector<Integer> v=new Vector<>(25);
				System.out.println("Bydefault vector capacity is:"+v.capacity());
				
				for(int i=1;i<=10;i++)
				{
//					System.out.print("Input "+i+" Element :");
//					v.addElement(sc.nextInt());
					v.addElement(i);
				}
				System.out.println(v.capacity());
				v.addElement(100);
				
				System.out.println(v.capacity());
			
				System.out.println(v);
			}

		}
