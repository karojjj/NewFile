package com.syntax.class04;

import java.util.Scanner;

public class LargestNumberHW {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
		
		//to debug means ==>slow execution of the code.muST 
		//AND &&
		//OR II
		//NOT !
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, add your number, we will find  the largest number among three numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is the largest number ");
			} else
				System.out.println(num3 + " is the largest number ");
		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is the largest number ");
			} else {
				System.out.println(num3 + " is the largest number ");
			}
		}

	}

}
