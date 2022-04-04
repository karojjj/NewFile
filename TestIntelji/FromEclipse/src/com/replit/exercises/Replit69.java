package com.replit.exercises;

public class Replit69 {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * Expected output:
		 * 
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3
		 * 1 2 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 6 7
		 */

		for (int i = 7; i > 0; i--) {
			System.out.println();

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				if(i==1) {
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
