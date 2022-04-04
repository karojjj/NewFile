package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		try (/*
				 * Write a program that will read three inputs of scores (quiz, mid term, and
				 * final scores) and determine the grade based on the following rules:
				 * 
				 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
				 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
				 * grade=F
				 */
		Scanner input = new Scanner(System.in)) {
			System.out.println("please add your quiz grade");
			int quiz = input.nextInt();
			System.out.println("Please add your grade for mid term");
			int midterm = input.nextInt();

			System.out.println("add your final score");
			int sonuc = input.nextInt();
			int result = (quiz + midterm + sonuc) / 3;
			System.out.println(result);
			
			if (result >= 90) {
				System.out.println("Grade=A");
			} else if (result >=70  && result <90) {
				System.out.println("Grade B");

			} else if (result >=50  && result <70 ) {
				System.out.println("Grade C ");
			} else  {
				System.out.println("Grade F");

			
			}
		}
	}
}
	


