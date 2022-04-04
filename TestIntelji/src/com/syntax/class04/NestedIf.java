package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// if inside the another if=kosul icinde kosul
		/*
		 * if(boolean condition){ //"outer if"
		 * 
		 * code A; if (boolean condition){ code B; //"nested if" }
		 */

		boolean vaccine = true;
		int dose = 1;
		if (vaccine) {                                        //outer if
			System.out.println("How many dose you have ?");
			if (dose == 1) {                                     //nested if
				System.out.println("You need another shot");
			} else {
				System.out.println("you are fully vaccinated");
			}

		} else {
			System.out.println("I do not have further questions");
		}
	}
}
	
	


	
	
