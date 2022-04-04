package com.replit.exercises;

public class Replit114 {
	void add(int a, int b) {
		System.out.println("Addition "+(a+b));
	}
	void mul(int a, int b) {
		System.out.println("Multiplication "+(a*b));
	}

	void subtract(int a, int b) {
		System.out.println("Subtraction "+(a-b));
	
	}
	public static void main(String[] args) {
		/*
		 * Step1: Create three methods that will accept 2 in parameters on integer type
		 * Step2: Write the logic in methods to perform actions below:
		 * The first method for multiplication
		 * The second method for addition
		 * The third method for subtraction
		 * Step3: execute all methods
		 * for the addition method add two numbers to make 30
		 * for multiplication multiply two numbers to make 30
		 * for Subtraction subtract two numbers to equal 20
		 * Expected Output: 
		 * Addition 30
		 *  Multiplication 30 
		 *   Subtraction 20
		 */
		
		Replit114 obj=new Replit114();
		obj.add(20, 10);
		obj.mul(3, 10);
		obj.subtract(30, 10);

	}

}
