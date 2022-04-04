package com.replit.exercises;

public class Replit134 {
public static int countVowels(String s) {
	int count=0;
	for(int i=0; i<s.length();i++) {
		if (s.charAt(i)=='a'  || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'  || s.charAt(i)=='u') {
				count++;
	}
	}
	return count;
}
	public static void main(String[] args) {
		/* vowels(sesli) letter: a, e, i, o , u
		 * Write a method with the following specs: Returns: an integer
		 * Name:countVowels Parameters: a String called "s"
		 *  Purpose: count the number of
		 * vowels in the string s. Assume s is all lowercase.
		 */
		System.out.println(countVowels("obama")); //3 //CALLING DIRECTLY METHOD
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
	}


