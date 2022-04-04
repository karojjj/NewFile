package com.replit.exercises;

public class Replit106 {

	public static void main(String[] args) {
		/*
		 * Instantiate and StringBuffer class 
		 * Append Value "Hello" to it
		 * Append value "World" to it.
		 * Print in UPPERCASE.
		 * Expected Output:
		 * HELLO WORLD
		 */
		
		String s1="Hello";
		String s2=" World";
		String s3=s1.concat(s2);
		System.out.println(s3.toUpperCase());

	}

}
