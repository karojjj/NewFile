package com.replit.exercises;

import java.util.Scanner;

public class Replit44 {

	public static void main(String[] args) {
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * The output of your program should be: The output of your program should be:
		 * "Your favorite car is ___"
		 */
		Scanner car = new Scanner(System.in);// Prompt user with questions:
		System.out.println("Please enter your favorite car make");
		String car1 = car.nextLine();
		String carOrigin;

		switch (car1.toLowerCase()) {

		case "bmw":
			carOrigin = "german car";
			break;
		case "toyota":
			carOrigin = "japanese car";
			break;
		case "maserati":
			carOrigin = "italian car";
			break;
		default:
			carOrigin = "unknown";
			break;
		}
		car.close();
		System.out.println("Your favorite car is " + carOrigin);
	}
}