package com.syntax.class18;

public class TypeOfVariables {
	// when the information is expected to be different from object to object we
	// store that information in an instance variable
	String name; // instance variable
	String color; // instance variable
	static int numberOfLegs;// static variable
// if we know taht a value will stay same for all the objects of a class we create a static variable for that why because

	void eat() {
		int noOfTimes = 3; // local variables
		System.out.println(name + " eats " + noOfTimes);
	}

	public static void main(String[] args) {
		// Types of variables local, instance and static
		// when to use local variable==>ALWAYS be preferred over instance and static
		// variables why because they oocupy the computers memory for every , very short
		// amount of thime
		TypeOfVariables dog = new TypeOfVariables(); // local variables
		dog.name = "tezek";
		dog.color = "Black";
		TypeOfVariables.numberOfLegs = 4;
		dog.eat();

		TypeOfVariables dog1 = new TypeOfVariables();
		dog1.name = "tommy";
		dog1.color = "navie blue";
		TypeOfVariables.numberOfLegs = 4;
		dog1.eat();

	}

}
