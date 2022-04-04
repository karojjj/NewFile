package com.syntax.class13;

public class Homework3 {
// Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	String hello(String country) {

		switch (country) {
		
		case "Turkey":
			return "Merhaba";
		case "German":
			return "Hallo";
		case " Azerbaijan":
			return "Salam";
		case "USA":
			return"Hello";
		default:
			return "Unknown";
		}

	}

	public static void main(String[] args) {
		
		Homework3 language = new Homework3(); //method
		
		System.out.println(language.hello("Turkey"));
		System.out.println(language.hello("German"));
		System.out.println(language.hello("France"));
	}

}
