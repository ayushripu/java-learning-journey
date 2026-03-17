import java.util.*;
import java.lang.*;
public class Matrix
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row:- ");
		int row = sc.nextInt();
		System.out.print("Enter Colum:- ");
		int colum = sc.nextInt();
		
		int a[][] = new int[row][colum];
		int b[][] = new int[row][colum];
		int sum[][]=new int[row][colum];

		System.out.println("Enter 1st Matrix of Element");

		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<colum;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter 2nd Matrix of Element");		

		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<colum;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<colum;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of Matrix is ");
		for(int i = 0; i < row; i++)
		{
			for(int j=0;j<colum;j++)
			{
				System.out.println(sum[i][j]);
			}
		}
	}
}