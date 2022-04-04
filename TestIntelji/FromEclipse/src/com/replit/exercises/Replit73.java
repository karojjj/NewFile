package com.replit.exercises;

public class Replit73 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of strings with the following
		 * values{"This", "is", "array", "of", "strings"} and prints all values in one
		 * line.
		 ** 
		 * Output:** Output:** This is array of strings
		 */
		String[] values = { "This", "is", "array", "of", "strings" };

		values[0] = "This";
		values[1] = "is";
		values[2] = "array";
		values[3] = "of";
		values[4] = "strings";
		System.out.print(values[0] + " " + values[1] + " " + values[2] + " " + values[3] + " " + values[4]);
	}
}
