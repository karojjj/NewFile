package com.syntax.class12;

public class Horse {
	// a class is a user defined blueprint from which objects are created.Class is a
	// template for creating different objects which defines its features and
	// behaviours.In order to create a object we need a clas.A class contains
	// variables, methods, constructors etc.We can have multiple objects for the
	// same class.
	// attributes, fields, properties
	String name;
	String breed;
	int age;
	double weight;

	// behaviours , functions, and methods
	void run() {
		System.out.println(name + " is running. ");
	}

	void eat() {
		System.out.println(name + " is eating.");
	}

	void sleeping() {
		System.out.println(name + " is sleeping ");
	}

	void printCompleteInfo() {
		System.out.println("name= " + name);
		System.out.println("breed = " + breed);
		System.out.println("age =" + age);
		System.out.println("weight =" + weight);
	}

	public static void main(String[] args) {
// when object of class is created , the class is said to be "INSTANTIATED".all the instances share the attributes and behavior of the class.
		//declaring object also called "instantiating a class"
		Horse ruzgar = new Horse(); // accessing the property name on object "ruzgar: and setting its value
		ruzgar.name = "ruzgar";
		ruzgar.breed = "stallion";
		ruzgar.age = 20;
		ruzgar.weight = 400;
		ruzgar.run();
		ruzgar.eat();
		ruzgar.sleeping();
		ruzgar.printCompleteInfo();

		System.out.println("=============================");

		Horse mrAsHorse = new Horse();
		mrAsHorse.name = "Tuzik";
		mrAsHorse.breed = "Mustang";
		mrAsHorse.age = 15;
		mrAsHorse.weight = 450;
		mrAsHorse.run();
		mrAsHorse.eat();
		mrAsHorse.sleeping();
		mrAsHorse.printCompleteInfo();
		System.out.println("=============================");

		Horse ates = new Horse();
		ates.name = "Ates";
		ates.breed = "Mustang";
		ates.age = 15;
		ates.weight = 450;
		ates.run();
		ates.eat();
		ates.sleeping();
		ates.printCompleteInfo();

	}

}
