package com.For;
public class sun
{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<7;i++)
		{
			String day=switch(i)
					{		
						case 1->"SunDay";
						case 2->"monDay";
						case 3->"tuesDay";
						case 4->"wednesDay";
						case 5->"thrusDay";
						case 6->"friDay";
						case 7->"saturDay";
						default->"Nothing";
					};
					System.out.println(i+"."+day);
		}
	}

}
