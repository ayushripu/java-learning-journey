package com.Test;
import java.util.Scanner;
//.Writeaprogramtouseswitchcaseinarray
public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int a[]= {5,3,2,7,1,9};
		int b[]= {6,2,1,3,9,11};
		int c[]= new int [6];
		int option;
		do
		{
		System.out.println("Which Option Do You Want : ");
		
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Exit Program\n");
		
		System.out.print("Choose : ");
		option = sc.nextInt();
		switch(option)
		{
		case 1: System.out.print("a[i] : ");
				for(int i=0;i<6;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.print("\nb[i] : ");
				for(int i=0;i<6;i++)
				{
					System.out.print(b[i]+" ");
				}
				System.out.print("\nc[i] = ");
				for(int i=0;i<6;i++)
				{
					c[i]=a[i]+b[i];
					System.out.print(c[i]+" ");
				}
				System.out.println("\n");
				break;
		case 2: System.out.print("a[i] : ");
				for(int i=0;i<6;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.print("\nb[i] : ");
				for(int i=0;i<6;i++)
				{
					System.out.print(b[i]+" ");
				}
				System.out.print("\nc[i] = ");
				for(int i=0;i<6;i++)
				{
					c[i]=a[i]-b[i];
					System.out.print(c[i]+" ");
				}
				System.out.println("\n");
				break;
		case 3: System.out.print("a[i] : ");
					for(int i=0;i<6;i++)
					{
						System.out.print(a[i]+" ");
					}
					System.out.print("\nb[i] : ");
					for(int i=0;i<6;i++)
					{
						System.out.print(b[i]+" ");
					}
					System.out.print("\nc[i] = ");
					for(int i=0;i<6;i++)
					{
						c[i]=a[i]*b[i];
						System.out.print(c[i]+" ");
					}
					System.out.println("\n");
					break;
		case 4: 	
					System.out.println("Exit Program");
					break;
		default :  System.out.println("Invalid Input");	
					
		}
	}while(option != 4);
		
	}

}
