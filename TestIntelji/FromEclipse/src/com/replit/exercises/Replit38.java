package com.replit.exercises;

import java.util.Scanner;

public class Replit38 {
	public static void main(String[] args) {

		/*
		 * Prompt user with a question: "Is it weekend?"
		 * 
		 * If it is not a weekend --> subject="manual testing"
		 * 
		 * Otherwise --> subject="Java"
		 * 
		 * Output:
		 * 
		 * Today you will be learning ____
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is it weekend?");
		boolean weekend = input.nextBoolean();
		
		if (!weekend) {
			System.out.println("manual testing class");
		} else {
			System.out.println("java class");
		}

	}

}
