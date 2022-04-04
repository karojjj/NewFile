package com.syntax.class07;
import java.util.Scanner;
public class DoLoopMoreExample {

	public static void main(String[] args) {
		/*
		 * create a secret number
		 * we want user to guess our secret number
		 * the moment user guessed my scret number, my program should stop
		 * otherwise it should contunie asking to guess my number
		 */

		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber ;
		do {
			System.out.println("Please enter a number to win");
			 guessNumber=scan.nextInt();
		
		} while (guessNumber!=secretNumber);
		
		System.out.println("congrats!");
	}


}
