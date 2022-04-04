package com.syntax.class02;

public class Task002 {

	public static void main(String[] args) {
		// Exercise 1
		double a = 11.99;
		double b = 6.05;
		double sum, sub, mul, div;

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		System.out.println("the sum of two numbers " + a + " and " + b + " is equal to " + sum + ".");
		System.out.println("the sub of two numbers " + a + " and " + b + " is equal to " + sub + ".");
		System.out.println("the multiply of two numbers " + a + " and " + b + " is equal to " + mul + ".");
		System.out.println("the division of two numbers " + a + " and " + b + " is equal to" + div + ". ");

		// Evercise 2

		double c = 3.9;
		double sq = c * c;
		System.out.println("The square of " + c + " equals " + sq + ". ");

		// exercise 3 per area rec width=5 height=8
		// shortcut to format code: ctrl+shift+f

		double w, h, peri, area;
		w = 5d;
		h = 8d;
		peri = 2 * (w + h);
		area = w * h;
		System.out.println("The perimeter of a rectangle with width  " + w + " and height " + h + " is equal to " + peri
			+ " and the area is " + area);
	
	
	
	}

}
