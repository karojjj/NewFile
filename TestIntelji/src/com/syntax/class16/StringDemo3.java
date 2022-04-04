package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		String s="This is a sentence ";
		String [] strArr=s.split(" ");
		String [] strArr2=s.split(" ");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		System.out.println(strArr2.length);
		System.out.println(strArr2[3].trim());
		System.out.println(Arrays.toString(strArr2));

	}

}
