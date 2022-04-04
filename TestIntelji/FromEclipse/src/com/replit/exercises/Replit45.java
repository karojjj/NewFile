package com.replit.exercises;
import java.util.Scanner;
public class Replit45 {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter any number from 1-7.
		 * Based on the number define the day of the week
		 */

		Scanner med=new Scanner(System.in); //Ask the user to enter any number from 1-7.
		   System.out.println("Input a number between 1-7");
		   int num=med.nextInt();
		   String dayName=" ";
		    switch (num){
		      case 1:
		      dayName="Monday";
		      break;
		      case 2:
					dayName="Tuesday";
					break;
				  case 3:
					dayName="Wednesday";
					break;
				  case 4:
					dayName="Thursday";
					break;
				  case 5:
					dayName="Friday";
					break;
				  case 6:
					dayName="Saturday";
					break;
				  case 7:
					dayName="Sunday";
					break;
				  default:
					dayName="Invalid";
						break;
					
		    }
		   	System.out.println(dayName);

	}

}
