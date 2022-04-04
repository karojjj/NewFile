package com.replit.exercises;
import java.util.Scanner;
public class Replit65 {

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
		 * 
		 * int x; int x; Write a for loop that will print out a series of numbers
		 * starting at one less than x and ending at 0.
		 * 
		 * Sample input/outputs:
		 */
           Scanner input=new Scanner(System.in);
           System.out.println("In:");
           int x=input.nextInt();
           //print out a series of numbers starting at one less than x and ending at 0  
           for (int i=x-1; i>=0; i--) {
        	   System.out.println(i);
           }

	}

}
