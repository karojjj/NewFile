package com.replit.exercises;
import java.util.Scanner;
public class Replit25 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * The variable "name" holds a String user input
		 * 
		 * Write a conditional statement starting on line 9 that does the following:
		 * 
		 * If name is equal to "Chen", print "teacher" For any other input, print
		 * "student" Examples: Examples: In: Chen teacher In: Chen teacher In: Faa
		 * student
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("In:");
		String name=input.nextLine();
		
		if (name.equals("Chen")) {
			System.out.println("teacher");
		}else {
			System.out.println("student");
		}
	}

}
