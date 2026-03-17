package com.staticc;

class Phone
{
	int modelno;
	String Brand;
	static String PhoneType;
	
	public void display()
	{
		System.out.println(modelno+"\n"+Brand+"\n"+PhoneType);
	}
}
public class StaticVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone.PhoneType="SmartPhone";
		
		Phone ph=new Phone();
		ph.Brand="Oppo";
		ph.modelno=12355657;
		
		ph.display();
	}

}
