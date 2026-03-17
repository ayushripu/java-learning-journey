package com.Array;

import java.util.Scanner;

public class LeftRoatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed How Many Number :-> ");
	    n=sc.nextInt();
	    int a[]=new  int[n];
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print("Inpputed "+(i+1)+" Number is = ");
	    	a[i]=sc.nextInt();
	    }
	    for(int x:a)
	    	
	    	System.out.print(x+",");
	    	System.out.println("");
	    	
	    int temp= a[0];
	    for(int i=1;i<a.length;i++)
	    {
	    	a[i-1]=a[i];
	    }
	    a[a.length-1]=temp;
	    for(int x:a)
	    
	    	System.out.print(x+",");
	    	System.out.println("");
	    
	}

}
