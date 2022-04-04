package com.myinternet.study;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "let me in";
		Scanner input = new Scanner(System.in);
		String guess;

		do {
			System.out.println("guess the password:");
			guess = input.nextLine();

		} while (!guess.equals(password));
		System.out.println("congrats");
		input.close();
	}

}
