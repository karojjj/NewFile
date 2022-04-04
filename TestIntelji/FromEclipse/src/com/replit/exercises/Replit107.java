package com.replit.exercises;

//Java program to illustrate the
//java.lang.StringBuffer.reverse()
import java.lang.*;

public class Replit107 {

	public static void main(String[] args) {
		/*
		 * Given String = "Hello Friends"
		 * 
		 * Expected Output:
		 * 
		 * sdneirF olleH
		 */

		StringBuffer str=new StringBuffer("Hello Friends");
		str.reverse();
		System.out.println(str);
	}
}
