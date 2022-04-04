package com.syntax.class07;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Declare a variable to store a price for a coffee. Ask user to pay for a
		// coffee. Keep asking to pay for coffee until user enters exact amount . If
		// user give more than $3 --> ask them to give less, if user gives less money
		// then ask to give more. Once user got a write amount print “Please enjoy your
		// coffee”

		
		double price = 2.99;
		System.out.println("Please pay  for your coffee !");

		Scanner in = new Scanner(System.in);
		double pay;

		do {
			pay = in.nextDouble();
			if (pay > price) {
				System.out.println("Please pay less !");
			} else if (pay< price) {
				System.out.println("Pay more!");
			}

		} while (pay!= price);
		System.out.println("Enjoy your coffee");
	}
}
