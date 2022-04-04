package com.syntax.class16;

public class StringDemo5 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.
		String s = "This is a sentence";
		String newStr = s.replace(" ", "");
		System.out.println(newStr);
	     System.out.println("--------------------------");
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many Alphanumeric (sayi ve alfabe )characters are there in the
		// String.

		String a = "1234!@#$%esdfAZSX123";
		System.out.println(a.length());
		System.out.println(a.replaceAll("[^A-Za-z0-9]",""));  //Alphanumeric
		System.out.println(a.replaceAll("[^A-Za-z0-9]","").length());
         System.out.println("--------------------------");
		// you have a String b=”Is it saturday? Is it raining? Do we have a Java Class
		// today?” How would you find out how many sentences are in that String?
		
		
		String b="Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] strArr=b.split("[?.!.]");
		System.out.println(strArr.length);
	     System.out.println("--------------------------");
		
	     
	     
	     
	     
	     
	     System.out.println("--------------------------");
		//How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
		
	     
	     
	     
	     
	     
	     System.out.println("--------------------------");
		//How would you swap  2 strings without a temporary variable?
		
	}

}
