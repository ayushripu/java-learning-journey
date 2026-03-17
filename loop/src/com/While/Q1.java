package com.While;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		int i =1;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Inputed Number: ");
		int n = sc.nextInt();
		while (i<n)
		{
			if((i%2) == 0)
			{
				System.out.println("Even: "+i);
			} 
			i++;
		}
	}
}