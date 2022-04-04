package com.syntax.class04;

import java.util.Scanner;

public class Mystudy {

	public static void main(String[] args) {
		String password = "Let me in";
	
		System.out.println("Guess the password pls");
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess));
		if (password.equals(guess)) {
			System.out.println("your password was correct !");

		} else if ("you are on fire".equals(guess)) {
			System.out.println("Your second password was correct too");

		} else {
			System.out.println("Try one more time");
	}

		
		
		
		
}
}