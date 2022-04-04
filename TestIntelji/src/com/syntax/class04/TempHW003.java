package com.syntax.class04;

import java.util.Scanner;

public class TempHW003 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("which city you are from? ");
		String city = input.nextLine();

		System.out.println("Please add your temperature");

		int farenheight, celesius;
		farenheight = input.nextInt();

		celesius = ((farenheight - 32) * 5) / 9;
		
		System.out.println("The temperature in " + city + " is " + celesius);
	}

}
