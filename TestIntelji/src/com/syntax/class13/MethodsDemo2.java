package com.syntax.class13;

public class MethodsDemo2 {
	// create a method that takes an animal name and person name if name os equal to
	// teyfur and animal is horese, print camel otherwise print horse
	void TeyfurAndHorse(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("this is a camel");
		} else {
			System.out.println("this is a horse");
		}

	}

	public static void main(String[] args) {
		MethodsDemo2 obj = new MethodsDemo2(); //object of this class
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik", "Horse");
	}
}
