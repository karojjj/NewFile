package com.syntax.class16;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create a string that will hold a sentence .write a program to get a new string without anyspaces
		 */
          String s="This is a sentence";
          String newS=s.replaceAll(" ", "");
          System.out.println(newS);
	}

}
