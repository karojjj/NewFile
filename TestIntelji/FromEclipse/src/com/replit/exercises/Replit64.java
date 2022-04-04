package com.replit.exercises;
import java.util.Scanner;
public class Replit64 {

	public static void main(String[] args) {
		/*
		 * You should input:
		 * 
		 * int end;
		 *  Write a for loop that will print out a series of numbers
		 * starting at 0 and ending at the doubled value of end(value must be taken from
		 * a user), exclusive.
		 * 
		 * Each number should be on the same line, separated by a space.
		 */
		Scanner inp= new Scanner(System.in);
        System.out.print("Int:");
        int end= inp.nextInt();
        //write your code below
        for (int i = 0; i < end * 2; i++) {
            System.out.print(i + " ");
        }
    }
}