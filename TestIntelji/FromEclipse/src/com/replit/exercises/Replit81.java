package com.replit.exercises;

import java.util.Scanner;

public class Replit81 {

	public static void main(String[] args) {

		// FIND LARGEST NUMBER IN THE ARRAY

		int number[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int size = input.nextInt();
		number = new int[size];
		
		System.out.println("enter elements of array");
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();

		}
		int large = number[0];
		for (int i = 1; i < number.length; i++) {
			if (large < number[i]) {
				large = number[i];
			}

		}
		System.out.println(large);
	}
}