class Practice
{
	public static void main(String[]args)
	{
		String s="java";
		String j="Java";
		String s1=new String("java");

		boolean s3=(s==s1);	   //Address Check
		boolean s4=s.equals(s1);  //Content Check
		boolean t=(s==j);	  //Address+Content Check 
		
		System.out.println("s3= "+s3+"\n"+"s4= "+s4+"\nt= "+t);
	}
}