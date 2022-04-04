package com.replit.exercises;

public class Replit120 {
	// Declare 3 instance variables to hold:
	int year;
	String schoolName;
	int batch;
	//creating a method to access variables and print them
	void printCompleteInfo() {
		  System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
	}

	public static void main(String[] args) {
		/*
		 * Declare 3 instance variables to hold: year, school name and batch # Access
		 * variables from the main method and assign specific values to them Print
		 * values of your variables in the following format: Expected Output: I am a
		 * student of batch 9 studying at Syntax in the year of 2021
		 */
		
		// Access variables from the main method and assign specific values
		Replit120 task=new Replit120();
		
		//assign specific values
		task.batch=9;
		task.schoolName="Syntax";
		task.year=2021;
		//calling the method to print the values
		task.printCompleteInfo();
		

	}

}
