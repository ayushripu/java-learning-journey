public class Palindrom
{
	public static void main(String[]args)
	{
		int num=667;
		int ori=num;
		int rev = 0;

		while(num!= 0)
		{
			int digit = num %10;
			rev = rev * 10 + digit;
			num = num/10;
		}

		if(ori == rev)
		{
			System.out.println(ori +" is a Palindrome");
		}
		else
		{
			System.out.println(ori +" is not a Palindrome");
		}
		
	}
}
