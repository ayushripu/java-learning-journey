package com.constructor;
class A
{
    int sum = 0;

    A()
    {
        int a = 10;
        int b = 20;

        sum = a + b;   
       
    }

    public void result()
    {
        System.out.println("Sum is: " + sum);
    }
}

class B extends A
{
    B()
    {
        super();  
    }
}
public class CheckNewConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.result();
		
		
	}

}
