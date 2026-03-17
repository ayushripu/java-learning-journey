package com.Generics;
import java.util.*;
class Boxes<T> {
		T  container;
		public Boxes(T container)
		{
			this.container = container;
		}
		public T getValue()
		{
			int Container= 1+5;
			System.out.println(Container);
			return container;
		}
}
public class Box1 {
	public static void main(String[] args) {	
		Boxes<String>b=new Boxes<>("");
		System.out.print(b.getValue()+": ");
		System.out.println(b.container.getClass().getName());
		Boxes<Integer>b1=new Boxes<>(0);
		System.out.print(b1.getValue()+": ");
		System.out.println(b1.container.getClass().getName());
	}
}