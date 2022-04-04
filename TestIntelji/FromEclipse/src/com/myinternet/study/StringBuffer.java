package com.myinternet.study;

import java.lang.*; // Java program to illustrate the java.lang.StringBuffer.reverse()

public class StringBuffer {

	

	public static void main(String[] args) {
		/*
		 * The Java.lang.StringBuffer.reverse() is an inbuilt method which is used to
		 * reverse the characters in the StringBuffer. The method causes this character
		 * sequence to be replaced by the reverse of the sequence.
		 */
		 StringBuilder sbf = new StringBuilder("Yasasin Ozgurluk!");
		 System.out.println("stringbuffer: "+sbf);
		 //reverse to stringbuffer
		 sbf.reverse();
		 System.out.println("string buffer after reversing is =" +sbf);
         
	}

	public void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
