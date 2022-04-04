package com.syntax.class06;

import java.util.Scanner;

public class StoringValuetoChar {

	public static void main(String[] args) {
		// logical operator: || or, &&and, ! not
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * 
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("please add your quiz grade");
		int quiz = input.nextInt();
		System.out.println("Please add your grade for mid term");
		int midterm = input.nextInt();

		System.out.println("add your final score");
		int sonuc = input.nextInt();
		int result = (quiz + midterm + sonuc) / 3;
		System.out.println(result);
		char grade;

		if (result >= 90) {
			grade = 'A';
		} else if (result >= 70 && result < 90) {
			grade = 'B';
		} else if (result >= 50 && result < 70) {
			grade = 'C';
		} else {
			grade = 'F';

		}
		System.out.println("Your grade is " + grade);
		
		if (grade == 'A' || grade == 'B') {
			System.out.println("You are a good student");

		}else {
			System.out.println("You should have studied harder");
		}
		
	}
}
