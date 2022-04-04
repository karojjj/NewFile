package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		/*
		 * we need to declare a boolean variable hungry yes or no if we are hungry==>i
		 * am going to eat otherwise==>I am going to drink a tea
		 */

		boolean hungry = true;
		if (hungry) { // hungry value is true then true=true then "if statement "correct
			System.out.println("I am going to eat ");
		} else {
			System.out.println("I am going to drink a tea");
		}

		boolean traffic = false;
		if (traffic) {
			System.out.println("I am coming home late ");
		} else {
			System.out.println("No traffic, I am on time ");

			/*
			 * define a variable to store a browser if browser is chrome==> we are executing
			 * tests on chrome otherwise==> I am not executing any test cases
			 * 
			 */
			String browser = "chrome"; // ALWAYS USE equals TO COMPARE TWO THINGS
			// if (browser){} ==>Type mismatch: cannot convert from String to boolean thats
			// why we add ".equals(" string value ")
			if (browser.equals("chrome")) {
				System.out.println("we are executing tests on chrome");

			} else {
				System.out.println("we are not executing any test cases");
			}

			// or we can do like the below but it is really not preferable
			// if (browser){} ==>Type mismatch: cannot convert from String to boolean thats
			// why we add ".equals(" string value ")
			if (browser == "chrome") { // we can use == instead of .equals( )
				System.out.println("we are executing tests on chrome");

			} else {
				System.out.println("we are not executing any test cases");
			}
		}
	}
}
