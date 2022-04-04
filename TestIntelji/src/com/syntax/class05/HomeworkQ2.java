package com.syntax.class05;

import java.util.Scanner;

public class HomeworkQ2 {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("add your operators");
		char op = input.next().charAt(0);
		System.out.println("Please enter your first  number");
		int num1 = input.nextInt();
		
		System.out.println("Please enter your second number");
		int num2 = input.nextInt();

		int num = 0;
		switch (op) {
		case '+':
			num = num1 + num2;
			break;
		case '-':
			num = num1 - num2;
			break;
		case '*':
			num = num1 * num2;
			break;

		case '%':
			num = num1 % num2;
			break;
		default:
			System.out.println("ERROR");

		}
		input.close();
		System.out.println(num);
	}

}
