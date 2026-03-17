package com.Switch;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Calculator\n");
		do
		{
			System.out.println("1.  Addition");
			System.out.println("2.  Subtraction");
			System.out.println("3.  Multiplication");
			System.out.println("4.  Division");
			System.out.println("0.  Exit");
		
			System.out.print("\nWhich option do you want to chose : ");
			int option = sc.nextInt();
		
			switch(option)
			{
			case 1:	System.out.print("\nHow Many Number Do You Want To add: ");
			  		int num = sc.nextInt();
			  		System.out.println();
			  		int sum = 0;
			  		for(int i=1; i<=num; i++)
			  		{
			  			System.out.print("Enter "+i+" Number: ");
			  			int AdditionNumber = sc.nextInt();
			  			
			  			sum = sum+AdditionNumber;
			  		}
			  		System.out.println("\nSum of Total Number is : "+ sum);
			  		break;
			case 2: System.out.print("\nHow Many Number Do You Want To Subtract: ");
	  				int subtract = sc.nextInt();
	  				System.out.println();
	  				int sub = 0;
			  		for(int i=1; i<=subtract; i++)
			  		{
			  			System.out.print("Enter "+i+" Number: ");
			  			int SubtractNumber = sc.nextInt();
			  			
			  			sub = SubtractNumber-sub;
			  		}	
			  		System.out.println("\nSubtract of Total Number is : "+ sub+"\n");
			  		break;
			case 3: System.out.print("\nHow Many Number Do You Want To Multiply: ");
					int Multiply = sc.nextInt();
					System.out.println();
					int mult = 1;
			  		for(int i=1; i<=Multiply; i++)
			  		{
			  			System.out.print("Enter "+i+" Number: ");
			  			int MultiplyNumber = sc.nextInt();
			  			
			  			mult = mult*MultiplyNumber;
			  		}	
			  		System.out.println("\nMultiply of Total Number is : "+ mult+"\n");	
			  		break;
			case 4: System.out.print("\nHow Many Number Do You Want To Divide: ");
					int divide = sc.nextInt();
					System.out.println();
					int div = 1;
			  		for(int i=1; i<=divide; i++)
			  		{
			  			System.out.print("Enter "+i+" Number: ");
			  			int DivideNumber = sc.nextInt();
			  			
			  			div = div/DivideNumber;
			  		}	
			  		System.out.println("\nDivide of Total Number is : "+ div+"\n");	
			  		break; 		
			  		
			case 0:		System.out.println("\nThanks for using this Application");
						return;
					
			default: System.out.println("\nInvalid Option Please Choose Correct Option\n");
					  break;
			}
		}	
			while(true);
	}

}
