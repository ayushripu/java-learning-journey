import java.util.*;
import java.lang.*;
class NewAreaOfTriangle
{
	public static void main(String[]args)
	{
		int a,b,c;
		float s;
		double area;
		System.out.println("Inputed the value of a ,b ,c");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		s= (a+b+c)/2f;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);

	}
}