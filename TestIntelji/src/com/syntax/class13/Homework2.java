package com.syntax.class13;

public class Homework2 {
	// Create a method that will take a number and prints whether the number is even or odd

void numbers(int num) {
		if (num % 2 == 0) {
		System.out.println(num+" is even");
		} else {
			System.out.println(num+" is odd");
		}

	}

	public static void main(String[] args) {

		Homework2 arin = new Homework2();
	         arin.numbers(2);
	         arin.numbers(3);

	}

}
