package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =“Spring” if user is born in June, July, August → season =“Summer” etc …
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER YOUR BIRTH MONTH PLEASE !");
		String month = input.next();
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {

			System.out.println("Your birth month season is WINTER");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("Your birth month season is SPRING");
		} else if ( month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equals("August")) {
			System.out.println("Your bith month season is SUMMER ");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("October") ) {
			System.out.println("Your birth month season is FALL ");
		} else {
			System.out.println("NO DATA FOUNDED !!! ");
		}
			
	

	}
}