package com.myinternet.study;

public class BreakDoWhileExample {

	public static void main(String[] args) {

		int i = 1; // declaring variable

		do { // do-while loop
			
		
		if (i == 5) { // using break statement
			i++;
			break;// it will break the loop
		}System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
