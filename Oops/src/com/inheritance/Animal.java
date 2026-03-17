package com.inheritance;
class Animal1 {
		    void speak() {
		        System.out.println("Some Animal sound.");
		    }
		}
		class Dog extends Animal1 {
		    void D() {
		    	System.out.println("Dog = Bark");
		    } 
		}
		class Cat extends Animal1 {
			void C() {
		    	System.out.println("Cat = Meww");
		    }
		}
		public class Animal {
		    public static void main(String[] args) {
		        Animal1 myDog = new Dog();
//		        Animal1 myCat = new Cat();
		        Dog dog=new Dog();
		        Cat cat=new Cat();
		        myDog.speak(); 
		        dog.D();
		        cat.C();
		
		    }
	}
