package com.Test;
//.Writeaprogramtoreadastringandcountvowelandconsonant.
public class Q15
{
	public static void main(String[] args) {
		 String s="Ayush";
		 s=s.toLowerCase();
		char[]a = s.toCharArray();
		int vowel=0;
		int Consonent=0;
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i];
			
			if(ch>='a' && ch <= 'z')
			{
				if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					vowel ++;
				}
				else
				{
					Consonent++;
				}
			}
		}
		System.out.println("Vowel : "+vowel);
		System.out.println("Consonent : "+Consonent);
	}
}