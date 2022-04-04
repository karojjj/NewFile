package com.syntax.class05;
import java.util.Scanner;
public class HomeworkQ1 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 * 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("What is your grade");
		char grade=input.next().charAt(0);
		String result;
		switch(grade) {
		case 'A':
			result="Excellent";
			break;
		case 'B':
			result="Good";
			break;
		case'C':
			result="Average";
			break;
		case 'D':
		result="Bad";
		break;
		default:
			result="Not Acceptable";
			
		}
		System.out.println(grade+" is  "+ result+" grade.");
	}
	
}