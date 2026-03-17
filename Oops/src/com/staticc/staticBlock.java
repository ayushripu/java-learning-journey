package com.staticc;

class Animal
{
	static String type;
	String name;
	int NumberOfAnimal;
	public Animal()
	{
		name="cow";
		NumberOfAnimal = 2;
		type = "PetAnimal";
		System.out.println("In Instance");
		System.out.println(name+"\n"+NumberOfAnimal+"\n");
	}
	static
	{
		type = "PetAnimal";
		System.out.println("In Static");
	}
}
public class staticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal an = new Animal();
//		n.NumberOfAnimal=7;
		

	}

}
