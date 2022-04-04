package com.syntax.class02;

public class Differences {

	public static void main(String[] args) {
		//
		String a = "Hello";
		String b = "Bye";

		int c = 10;
		int d = 20;
		int sum = c + d;
		// Brackets executes the operation it contains first.
		System.out.println(c + d + a + b); // 30HelloBye :top the bottom, left to right= we concanated it
		System.out.println(a + b + c + d); // HelloBye1020: string+ int= string
		System.out.println(a + b + (c + d)); // parantez operates like c+d=30 int then string hellobye
		System.out.println(sum);
		int num = 123;
		String num2 = "123";
		String what = num + num2;
		System.out.println(what);
		System.out.println(num + num2);
		System.out.println(num + "num2");

		// class practices on my own time

		String name = "Medine";
		String lastName = "Kaya";
		char grade = 'A';
		String city = "Boston";
		String state = "MA";
		int phoneNumber = 123456789;
		System.out.println( name + lastName);
		System.out.println("My name is " + name);
		System.out.println("My last name is " + lastName);
		System.out.println("My grade is " + grade);
		System.out.println("I live in " + city + "," + state);
		System.out.println("My phone number is " + phoneNumber);

	}

}
