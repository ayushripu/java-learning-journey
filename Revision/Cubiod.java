import java.lang.*;
import java.util.*;
class Cubiod
{
	public static void main(String[]args)
	{
		float height,length,breath,TotalArea,Volume;
		System.out.println("Inputed the Length,breath&Height");
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		breath=sc.nextFloat();
		height=sc.nextFloat();

		TotalArea=2*(length*breath+length*height+breath*height);
		Volume=length*breath*height;

		System.out.println("Total area = "+TotalArea);
		System.out.println("Volume = "+Volume);
	}
}