package com.syntax.class17New;

public class Task5 {

	public static void main(String[] args) {
		// how would you check if string is palindrome or not?
		//example aba==true aba abbc==cbba false
		Task5 task=new Task5();
		System.out.println(task.isPalindrome("aba"));
		System.out.println(task.isPalindrome("abbc"));

	}
	boolean isPalindrome(String inputStr) {
		String reversedStr=reverseString(inputStr);//reversing a word
		return reversedStr.equals(inputStr); //checking if words are same
	
		
	}
	String reverseString(String inputString) {
		//converting S string to StringBuilder so that we can use the reverse method
		StringBuilder stringbuilder=new StringBuilder(inputString);
		stringbuilder.reverse();
		return stringbuilder.toString();
	}

}
