package com.syntax.class16;

public class Task3 {

	public static void main(String[] args) {
		//find the number of sentences
		String str="is it saturday? is it raining ? do we have a java class today?";
		System.out.println(str.length());
		 System.out.println(str.split("[?]").length);

	}

}
