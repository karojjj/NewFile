package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		// substring: returns a string that is a substring of this string.the substring
		// begins with the character at the specified index and extends to the end of
		// this string
		//examples "unhappy".substring(2) returns happy
		String name = "111-222-1234";
		System.out.println(name.substring(4)); //222-1234
		System.out.println(name.substring(12));// all characters 12 so it does not include any strings
		System.out.println(name.substring(8));//1234
		System.out.println(name.substring(4, 7)); //it does give first 4 characters and characters after 7 so it gives 222
        System.out.println(name.substring(11)); //4
        
	}

}
