package com.For;

public class DigitOfaNumber {

	public static void main(String[] args) {

		int i=8356786,c=0;
			while(i>0)
			{
				int  r=i/1000000;
				i=i%1000000*10;
				 System.out.println(r);
				 c++;
				 
			}
			System.out.println("Total Number is "+c);
			
	}

}
