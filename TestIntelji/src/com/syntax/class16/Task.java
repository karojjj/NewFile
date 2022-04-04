package com.syntax.class16;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		StringBuilder stringBuilder = new StringBuilder("Sunday is great");
		System.out.println(stringBuilder.reverse());
		
		String c = "This is sentence i want to reverse";
		StringBuilder abc = new StringBuilder(c);
		abc.reverse();
		c = abc.toString();
		System.out.println(c);
        System.out.println("--------------------------");
		String newStr="";
		String s2=stringBuilder.toString();
		String [] strarr2=s2.split(" ");
		System.out.println(Arrays.toString(strarr2));
		
		 System.out.println("--------------------------");
		//How would you check if String is palindrome or not? aba=> true
		// Abbc =>false
	}

}
