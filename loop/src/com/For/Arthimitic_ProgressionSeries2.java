package com.For;
import java.util.Scanner;
public class Arthimitic_ProgressionSeries2 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed 1st Number :-> ");
		int fn=sc.nextInt();
		System.out.print("Inputed Last Number :-> ");
		int ln=sc.nextInt();
		for(int i=fn;i<=ln;i+=5)
			System.out.print(","+i);
	}
}