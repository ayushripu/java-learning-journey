package com.mehod;

public class Vote {
	static int vote(int n) 
	{
		if(n>=18)
		System.out.println("Voted");
		else
			System.out.println("Not Voted");
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=vote(12);
		System.out.println(c);
		
	}

}
