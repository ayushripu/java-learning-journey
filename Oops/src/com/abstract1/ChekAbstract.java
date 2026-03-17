package com.abstract1;
abstract class A{
	
	 int sum()
	 {
		 int c = 10+6;
		 System.out.println(c);
		 return c;
	 }
}
class B  extends A
{
	@Override
	 public int sum()
	 {
		 int c = 10+5;
		 System.out.println(c);
		 return c;
	 }
}
public class ChekAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new B();
		a.sum();
	}

}
