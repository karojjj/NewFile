package com.syntax.class18;

public class ClassTask3 {
	private static String onlywovels(String input) {
		/*   
		  String newStr=input.replaceAll("[^aeiouAEIOU]", ""); // ^ means :for except those letter
		     return newStr;
		     
		      */
		// shorter way
		return input.replaceAll("[^aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		// Create a method that will accept a String as a parameter and return a new
		// String that consist only of vowels. Method should be available inside the
		// class only ( access modifiers= private static)where it was declared and executed by
		// calling it is name.

		/*
		 * PS: static methods can access other static methods and field without needing
		 * an object of that class or the class name if they are inside the same class
		 */
		System.out.println(onlywovels("Emili"));

	}

}
