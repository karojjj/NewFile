package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		try (/*
				 * 2. Write a program that will ask user to input inputs the current time (use
				 * 24 hour format). Based on the given time define:
				 * 
				 * if hour is between 1-11 --> Morning if hour between 12-15 --> Afternoon if
				 * hour between 16-20 --> Evening if hour between 21-24 --> Night
				 */
		Scanner input = new Scanner(System.in)) {
			System.out.println("Please type your current time");
			double date = input.nextDouble();
			if (date >= 1 && date <= 11) {
				System.out.println("Morning");
			}else if(date>=12 && date<=15) {
				System.out.println("Afternoon");
			} else if (date>=16 && date<=20) {
				System.out.println("Evening");
			} else if (date>=21 && date<=24) {
				System.out.println("Night");
			} else {
				System.out.println("ERROR");
			}
		}
	}

}
