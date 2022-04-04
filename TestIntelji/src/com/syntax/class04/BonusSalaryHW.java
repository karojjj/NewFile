package com.syntax.class04;

import java.util.Scanner;

public class BonusSalaryHW {
	/*
	 * Write a program to ask user to enter numbers of worked years and annual
	 * salary. If user worked for more or equals to 5 years than user is eligible
	 * for the bonus, otherwise he is not. Once user is eligible and salary is
	 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
	 
	 */
	public static void main(String[] args) {
		Scanner number= new Scanner(System.in);
System.out.println("How many years have been you working with us ? ");
int years=number.nextInt();
System.out.println("What is your annual salary? ");
int salary=number.nextInt();

if (years>=5) {
	System.out.println("Congrats you are eligible for the bonus");
	if (salary>50000) {
		System.out.println("you will get $5000 bonus");
	}else if(salary<50000) {
		System.out.println("you will get $3000 bonus");
	}else {
		System.out.println("you are not eligible for bonus");
	}
}
	}

}
