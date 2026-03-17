package com.Test;
import java.util.Scanner;
//8.Writeaprogramtoreadnameoftheuserandcountfrequencyofgivencharacter.
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= "Ayush Kumar Srivastav";
		s=s.toLowerCase();
		System.out.println(s);
		char a[]=s.toCharArray();
		
		
		System.out.print("Inputed Character to Find FreQuency : ");
		char f=sc.next().charAt(0);
		int count=0;
		for (int i = 0; i < a.length; i++) {
            if (s.charAt(i) == f) {
                count++;
            }
        }
		System.out.println("Character '" + f + "' occurs " + count + " times in your name.");
	}

}
