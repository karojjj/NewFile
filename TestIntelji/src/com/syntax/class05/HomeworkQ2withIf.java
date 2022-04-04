package com.syntax.class05;

import java.util.Scanner;

public class HomeworkQ2withIf {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Add your first number");
		int num1 = input.nextInt();
		System.out.println("add your aritmetical operator");
		char op = input.next().charAt(0);

		System.out.println("Add your second number");

		int num2 = input.nextInt();

		if (op == '+') {
			int sum = num1 + num2;
			System.out.println("Your result is " + sum);
		}else if (op=='-') {
			 int sub=num1-num2;
			System.out.println("Your result is "+ sub);
		}else if (op=='*') {
			int mul=num1*num2;
			System.out.println("your result is "+mul);
		}else if(op=='%') {
			int div=num1%num2;
			System.out.println("your result is "+div);
		}else {
			System.out.println("ERROR");
		}

	}
}
