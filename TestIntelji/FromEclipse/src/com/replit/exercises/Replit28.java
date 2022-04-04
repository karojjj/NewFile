package com.replit.exercises;

import java.util.Scanner;

public class Replit28 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Write a program to take values of length and width from the user.
		 * 
		 * Based on value define whether the shape is a square or rectangle.
		 * 
		 * Examples:
		 * 
		 * Please enter the length 18 
		 * Please enter the width 16
		 *  The shape of your object is rectangle
		 * Please enter the length 16 
		 * Please enter the width 16
		 * The shape of your object is square
		 */
		 Scanner input = new Scanner(System.in);
		 
         System.out.println("Please enter the length");
         int length=input.nextInt();
         
         System.out.println("Please enter width");
         int width=input.nextInt();
         
         if (length>width) {
        	 System.out.println("The shape of your object is rectangle");
         }else
        	 System.out.println("The shape of your object is square");
         }
	
}

