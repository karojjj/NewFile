package com.replit.exercises;
import java.util.Scanner;
public class Replit105 {

	public static void main(String[] args) {
		// There is a code that takes input as a String.
//Write a program that will print out only vowels of that string
		// the English alphabet contains 5 vowels a, e, i, o, and u
		Scanner input=new Scanner(System.in);
		System.out.println("In:");
		String word=input.nextLine();
		for (int i=0; i<word.length(); i++) {
			if ( word.charAt(i)=='a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')  {
				System.out.print(word.charAt(i));
			}
		}

	}

}
