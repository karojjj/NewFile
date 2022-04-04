package com.replit.exercises;

import java.util.Scanner;

public class Replit23 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Create a program that will ask a user to input boolean value
		 * "Input the boolean value"
		 * 
		 * If the input is true or false, then the output should look like below:
		 * 
		 * Example Output: Input the boolean value The value is true The value Example
		 * Output: Input the boolean value The value is false
		 */
		Scanner user1 = new Scanner(System.in);
        System.out.println("Input the boolean value");
        
        boolean value = user1.nextBoolean();
        
        if (value) {
            System.out.println("The value is " + value);
        } else {
            System.out.println("The value is " + value);
        }
    }
}