package com.syntax.class04;

public class DiplomaTaskHW {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 output should say
		 * “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” . otherwise=else
		 */

		boolean diploma = true;
		if (diploma) {
			System.out.println("Congrats! you are a graduate student");
             double gpa=3.1;
             if(gpa>=3.5) {
            	 System.out.println("You are eligible for scholorship");
             }else {
            	 System.out.println("you should have studied harder");
             }
		} else {
			System.out.println("Please get a degree");
		}

	}
}
