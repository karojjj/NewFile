package com.replit.exercises;
import java.util.Scanner;
public class Replit77 {

	public static void main(String[] args) {
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * Don't print any prompt message for the use
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 * Example:
		 * Input: 1 2 3 4 5 Output: 5 4 3 2 1
		 * 
		 */
		Scanner input=new Scanner(System.in);
		
		int [] numbers=new int [5];
		for (int i=0; i<numbers.length; i++) {
			  numbers[i]=input.nextInt();  
			
		}
		for (int j=4; j>=0; j--) {
			System.out.println(numbers[j]);
		}
	}
}