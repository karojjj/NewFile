package com.replit.exercises;

import java.util.Scanner;

public class Replit24 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Write a program that takes a user's name and prints it.
		 * 
		 * Example Output:
		 * 
		 * Hello, please enter your name Your name is Sumair
		 */
		@SuppressWarnings("resource")
		
		
		Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your name ");
        String name=input.next();
        System.out.println("Your name is "+name);
	}

}
