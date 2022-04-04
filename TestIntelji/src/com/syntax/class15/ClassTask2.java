package com.syntax.class15;

public class ClassTask2 {

	public static void main(String[] args) {
		/*Create a String and if the String is not empty perform the following: if the String has an odd number of
		 * characters and has 3 or more characters, print the character in the middle of
		 * the String */
		String str="HELLO"; //creating a string //5 letters
		if(str.length()%2!=0 && str.length()>=3) { //checking if the string has odd numbers and  has 3 more characters)
			System.out.println(str.charAt(str.length()/2)); // print the character in the middle of the String "L"
		}

	}

}
