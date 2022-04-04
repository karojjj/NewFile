package com.syntax.class16;

public class Example {

	public static void main(String[] args) {
		// get the words from the syntax reverse the words append the words to get the sentence back
		String s="Sunday is great";
		String [] strArray=s.split(" ");
		System.out.println(strArray.length);
		System.out.println("---------------");
		for (int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
