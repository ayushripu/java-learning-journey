/*Create a program to model different types of animals in a zoo.
There are three types of animals: Lions, Elephants, and Monkeys.
All animals have common properties such as name and age, and common behaviors such as eating and sleeping.
However, each type of animal has its own specific behavior:
Lions roar,
Elephants trumpet, and
Monkeys chatter.*/


abstract class Animal
{	public int age;
	public String name;
	Animal(String name, int age)
	{
		this.name=name;
		this.age=age;	
	}
	public void eating()
	{
		System.out.println(this.name + " is Eating ");
	}
	public void sleeping()
	{
		System.out.println(this.name + " age is "+ this.age);
	}

	abstract void display();
}
class Lion extends Animal
{
	Lion(String name, int age)
	{
		super(name,age);
	}

	void display()
	{
		System.out.println(name +" Sound Roar ");
	}
}
class Elephant extends Animal
{
	Elephant(String name, int age)
	{
		super(name,age);
	}
	@Override
	void display()
	{
		System.out.println(name +" Sound trumpet ");
	}
}
class Monkey extends Animal
{
	Monkey(String name, int age)
	{
		super(name,age);
	}
	@Override
	void display()
	{
		System.out.println(name +" Sound chatter ");
	}
}

public class ZOO
{
	public static void main(String[]args)
	{
		Lion lio = new Lion("Lion",44);
		Elephant ele = new Elephant("Elephant",11);
		Monkey mon = new Monkey("Monkey",22);
		
		lio.eating();
		lio.sleeping();
		lio.display();

		System.out.println();
		
		ele.eating();
		ele.sleeping();
		ele.display();

		System.out.println();

		mon.eating();
		mon.sleeping();
		mon.display();

		System.out.println();
	}
}