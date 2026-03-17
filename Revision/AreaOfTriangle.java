import java.util.*;
class AreaOfTriangle
{
	public static void main(String[]args)
	{
		float Area,base,height;
		System.out.println("Inputed Base and Height :-> ");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		height=sc.nextFloat();

		Area=(base*height)/2;
		
		System.out.println("Area = "+Area);
	}
}