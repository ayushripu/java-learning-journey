package com.inheritance;
class Interest
{
	public void getInterestRate() {}
}
class SBI extends Interest
{
	@Override
	public void getInterestRate()
	{
		System.out.println("12 Percent interest");
	}
}
class BoB extends Interest
{
	@Override
	public void getInterestRate()
	{
		System.out.println("25 Percent interest");
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interest  i;
		i = new SBI();
		i.getInterestRate();
		i = new BoB();
		i.getInterestRate();
	
	}

}
