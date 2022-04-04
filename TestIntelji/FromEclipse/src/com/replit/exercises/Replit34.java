package com.replit.exercises;

import java.util.Scanner;

public class Replit34 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition
		 * 
		 * Please use Scanner class to take input from users
		 * 
		 * Expected Output:
		 * 
		 * Please enter 3 distinct numbers 4 5 and 14 Please enter 3 distinct numbers 4
		 * 5 and 14 The largest number is 14
		 */
		Scanner med = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers 4 5 ");
		
		int a = med.nextInt();
		int b = med.nextInt();
		int c = med.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		} else if (b > c && b > a) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest number");
		}
	}

}
