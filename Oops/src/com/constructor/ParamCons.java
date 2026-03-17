package com.constructor;
class Phone
{ 
	 public Phone(String type,String name,int price)
	 {
//		 type="cellPhone";
//		 name="Oppo";
//		 price=1000;
//		 System.out.println(type+"\n"+name+"\n"+price);
		 System.out.println("Hello "+price);
	 }
}
class SmartPhone extends Phone
{
	public SmartPhone(String type, String name, int price,int num) 
	{
		super(type, name, price);
		System.out.println("Hello "+name);
	}
}
public class ParamCons 
{
	public static void main(String[] args)
	{
		SmartPhone ph=new SmartPhone("CellPhone","OppO",10000, 2);
	}
}
