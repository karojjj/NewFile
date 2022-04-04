package com.replit.exercises;

import java.util.Scanner;

public class Replit76 {

	public static void main(String[] args) {
		String arra[] = new String[7];
		
		/*arra[0]="Sunday";
		arra [1]="Monday";
		arra[2]="Tuesday";
		arra[3]="Wednesday";
		arra[4]="Thursday";
		arra[5]="Friday";
		arra[6]="Saturday";
		*/
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter days starting with Sunday");
		for (int i = 0; i < 7; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");

			arra[i] = input.next();
		}
		//for (String arr : arra) {
		//	System.out.println(arr);
		}
	}

