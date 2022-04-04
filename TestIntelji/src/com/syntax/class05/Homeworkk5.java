package com.syntax.class05;

import java.util.Scanner;

public class Homeworkk5 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 */
		Scanner med = new Scanner(System.in);
		System.out.println("Enter height in inches");
		int inc = med.nextInt();
        
		if (inc<60) {
			System.out.println("You are short");
		} else if ( inc<=60 && inc<=72) {
			System.out.println("Your are medium");
		} else {
			System.out.println("You are tall");
		}
		
		
	}

}
