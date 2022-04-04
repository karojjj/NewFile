package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		try (/*
				 * Ask user to enter a number and then define if number is small, medium or
				 * large Small number is value between 1 and 10 Medium number is value between
				 * 11 and 100 Large number is value between 101 and 1000
				 */
		Scanner input = new Scanner(System.in)) {
			System.out.println("enter a number");
			
			int num1=input.nextInt();
			if (num1>0 && num1<=10) {
				System.out.println("it is small number");
			
				
			}else if (num1>11 && num1<=100) {
				System.out.println("it is medium number");
			}else if (num1>101 && num1<=1000) {
				System.out.println("it is a large number");
			}else {
				System.out.println("ERROR");
			}
		}

	}

}
