package com.test;
import java.util.*;
public class InitilizeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Character :-> ");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') )
		{
			
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Degit");
		}
		else
		{
			System.out.println("Anything Else");
		}
	}

}
