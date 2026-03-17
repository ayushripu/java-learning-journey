package com.string;
//Reverse String
public class Question4 
{
	public static void main(String[] args)
	{
		String j = "Kukurhaiekduniya123@";		
		
		j = j.toLowerCase();
		int vowel =0, consonent = 0, digit = 0, specialcharacter = 0;
		
		for(int i =0;i<j.length();i++)
		{
				char ch = j.charAt(i);
				
				if(ch >= 'a' && ch <= 'z')
				{
					if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'U')
					{
						vowel++;
					}
					else
					{
						consonent++;
					}
				}
				else if(ch >= '0' && ch <= '9')
				{
					digit++;
				}
				else if(ch != ' ')
				{
					specialcharacter++;
				}
		}
		
		System.out.println("vowel = "+vowel);
		System.out.println("consonent = "+consonent);
		System.out.println("Digit = "+digit);
		System.out.println("Special Character = "+ specialcharacter);
			
	}
}