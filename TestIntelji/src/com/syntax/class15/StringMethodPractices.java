package com.syntax.class15;

public class StringMethodPractices {

	public static void main(String[] args) {
		// Java String length(): The Java String length() method tells the length of the
		// string.
		// It returns count of total number of characters present in the String. For
		// example:
		String s1 = "hello";
		String s2 = "whatsup";
		System.out.println(s1.length());// 5
		System.out.println(s2.length());// 7
		System.out.println("--------------------------");
		/*
		 * The Java String compareTo() method compares the given string with current
		 * string. It is a method of ‘Comparable’ interface which is implemented by
		 * String class.
		 */
		String a1="hello";
		String a2="hello";
		String a3="hemlo";
		String a4="flag";
		System.out.println(s1.compareTo(a2)); // 0 because both are equal
		System.out.println(a1.compareTo(a4));// 
	}

}
