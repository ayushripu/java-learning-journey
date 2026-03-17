import java.util.*;
public class Gmail
{
	public static void main(String[]args)
	{
		String str="ayushbbu37@gmail.com";
		
		int i=str.indexOf("@");
		String UserName=str.substring(0,i);
		String Domain=str.substring(i+1,UserName.length());

		System.out.println("userName= "+UserName+"\nDomain= "+Domain);
	}
}