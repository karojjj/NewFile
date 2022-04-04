package com.syntax.class06;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it Once values are captured print
		 * which language user speaks
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your country ");
		
		String country=input.nextLine();
		String language;

		switch (country.toLowerCase()) {
		case "turkey":
			language = "Turkish";
			break;
		case "germany":
			language = "Deutch";
			break;
		case "china":
			language="Chineese";
			break;
		case" spain":
			language="spanish";
			break;
			default:
				language="unknown";
			
		}
        input.close();
		System.out.println(country+ " speaks originally "+ language+" language");

	}
    
}
