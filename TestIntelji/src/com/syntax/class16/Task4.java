package com.syntax.class16;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("sunday");
		System.out.println(stringBuilder.reverse());
        System.out.println("_________________");
		
		String s="SUNDAY IS FUNDAY :)";
		StringBuilder str=new StringBuilder(s);
		str.reverse();  //reverse method
		s=str.toString(); //toString method 
		System.out.println(s);
		System.out.println("_______________________");
		//get the words from the syntax reverse the words append the words to get the sentence back
		String newStr="";
		String s2=stringBuilder.toString();
		String [] strArr=s2.split(" ");
		System.out.println(Arrays.toString(strArr));
		for (int i=strArr.length-1; i>=0; i--) {
			newStr+=strArr[i];
		}
	}

}
