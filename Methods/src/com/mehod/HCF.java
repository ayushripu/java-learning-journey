package com.mehod;

public class HCF {

	static int CommonFactor(int m, int n)
	{
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return  m;
	}
	public static void main(String[] args) {
		System.out.println(CommonFactor(35,56));
	}

}
