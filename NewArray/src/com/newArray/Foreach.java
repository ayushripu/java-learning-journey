package com.newArray;

public class Foreach {

	public static void main(String[] args) {
		int a[][]= {
				{1,2},
				{4,2},
				{4,4}
		};
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
