package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {

	public static void main(String[] args) {
		// while and do loop used in java when we do not know in advance how many times
		// we want to repeat from of the code like lottery
		int sm = 12;
		Scanner input = new Scanner(System.in);
		int gs;
		System.out.println("add a number to win");
		gs = input.nextInt();
		while (gs != sm) {
			System.out.println("pls add a number to win");
			gs = input.nextInt();
		}
		System.out.println("congrats!!!!");
	}

}
