package com.test;

public class CheckCommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<args.length;i++)
		{
			if(i>0)
			{
				sb.append(',');	
			}
			sb.append(args[i]);
		}	
			System.out.println(sb.toString());	
	}
}
																			