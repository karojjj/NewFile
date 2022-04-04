package com.replit.exercises;

import java.util.Scanner;

public class Replit78 {

	public static void main(String[] args) {
		/*
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner.
		 * 
		 * Don't print prompt questions for a user.
		 * 
		 * Using loop print out each element of the array that should look like the
		 * output below
		 * 
		 * Example:
		 * 
		 * Input: 1.2,3, 4, 5,6, 7,8, 9,10
		 * 
		 * Output: Output: 10 20 30 40 50 
		 */
		Scanner input = new Scanner(System.in);
		int num = 5;
		int [] numbers=new  int[5];
		
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=input.nextInt();
			
		}
		System.out.println();
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=i*10+10;
			System.out.println(numbers[i]);
		}
 	}

}
