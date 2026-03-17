package com;

import java.util.Arrays;

public class Arraylist {
	 private int []arr;
	 private static  int index;
	 private int Size_arr=10;
	   
	 public Arraylist() {
		// TODO Auto-generated constructor stub
		 this.arr=new int[Size_arr];
		 
	}
	 
	 public void add(int n) {
		 if(this.index==Size_arr) {
			 reSize();
		 }
		 arr[index++]=n;
	 }
	  public void reSize() {
		  int []temp=new int [Size_arr*=1.5];
		  
		  for(int i=0;i<arr.length;i++) {
			  temp[i]=arr[i];
		  }
		//  System.arraycopy(arr, 0, temp, 0, index);
		  this.arr=temp;
	  }
	  public  String toString() {
		  int[] print =Arrays.copyOfRange(arr, 0, index);
		  return Arrays.toString(print);
	  }
	  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
