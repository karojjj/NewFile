package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {
// void is a type of methods
	void checkEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	// void is a type of methods do not return anything when called
	// checkEvenOdd is the name of the method
// () we use to pass the information from outside
//int number this is parameter that we can pass to this method when called 
	// we can use this variable inside the logic of method
	void checkWeather(boolean isRaining) {
		if (isRaining) {
			System.out.println("I am staying at home ");
		} else {
			System.out.println("Lets go for a walk");
		}
	}

// create a method to check a name if name is medine it prints send memes otherwise it prints lets focus on class
	void checkperson(String name) {
		if ("Medine".equals(name)) {
			System.out.println("send memes");

		} else if ("Maha".equals(name)) {
			System.out.println("Doctor");

		} else {
			System.out.println("Unknown");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo1 object1 = new MethodsDemo1(); // object of the class
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.checkWeather(false);
		object1.checkperson("Medine");
		object1.checkperson("Maha");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		// int number2=object1.checkEvenOdd(120); it will give errors

	}

}
