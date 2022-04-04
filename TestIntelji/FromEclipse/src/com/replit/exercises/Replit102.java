package com.replit.exercises;
import java.util.Scanner;
public class Replit102 {

	public static void main(String[] args) {
		/*
		 * Inputs: String word;
		 *  Write a for loop that will loop through every
		 * character of a word and print out each character, each on a separate line
		 * 
		 * Sample inputs/outputs:
		 * 
		 * In: hello h e l l o
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("In:");
		String word=input.nextLine();
		//loop through each element
		for (int i=0; i<word.length();i++) {
			//access each character
			char a=word.charAt(i);
			System.out.println(a);
		}
		
		

	}

}
