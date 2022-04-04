package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 * 
		 */

		int num1 = 100;
		int num2 = 50;
		// First compare the numbers, use relational numbers, based on these we will
		// have particular output
		// how to identify block of code { two  brackets }
		if (num1 > num2) {

			System.out.println(num1 + " is larger than " + num2); // it is true condition. it condition is false you
																	// will not see any note on console
			//relational and equality >,>=,<,<=,==,!=
			// result of relational and equality operators ALWAYS boolean value(true ,or  false)
			// if statement is like a decision making
			/*
			 * SYNTAX OF IF STATEMENT : if (booleann condition) { 
			 * code;
			 */
		}

		double money = 5;
		double coffee = 5.99;
		// if i have more money than a price of the coffee==>i am buying coffee
		if (money > coffee) {
			System.out.println("I am buying the coffee "); // console the does not show statemnet because condition is
															// false

		}
		// if (money=coffee) { error because if condition always must be boolean
		// we use double==>because of the wrong operator
		// }
		double money1 = 5;
		double coffee1 = 5;
		
		if (money1 >=coffee1) { // if i have enough >= 
			System.out.println("I am buying the coffee "); 

	}
		
		/*SYNTAX OF IF STATEMENT
		 * if (boolean condition){
		code;
	} 
	*/
		
		
		
	
	
	}
}
