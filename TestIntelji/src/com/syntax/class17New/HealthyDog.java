package com.syntax.class17New;

public class HealthyDog {
	// when the information is expected to be different from object to object
	// we store that information in an instance variable
	String name; // instance variable
	String color; // instance variable
	// if we know that a value will stay the same for all the objects of a class we
	// create a static variable for that because 
	static int numberOfLegs;// static variable

	void eat() {
		int noOfTimes = 3; // local variable
		System.out.println(name + " eats " + noOfTimes + " in a day");

	}
	
	public static void main(String[] args) {
		HealthyDog dog = new HealthyDog(); // local variable
		dog.name = "scooby"; // instance variable
		dog.color = "pink"; // instance variable
		HealthyDog.numberOfLegs = 4;
		dog.eat();

		HealthyDog dog1 = new HealthyDog(); // local variable
		dog1.name = "mink";
		dog1.color = "green";
		HealthyDog.numberOfLegs = 4;
		dog1.eat();

	}
}
