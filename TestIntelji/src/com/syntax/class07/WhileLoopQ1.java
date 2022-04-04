package com.syntax.class07;

public class WhileLoopQ1 {

	public static void main(String[] args) {
		/*
		 * Step 1: Initialize the i value as int i=7. Step 2: Write a program to print a
		 * sequence of numbers starting from 7 to 98.
		 * yedi ye bolunen yedinin katlarini bulmak istyrsz
		 */
		int i=7;
		while(i<=98) {
			if (i%7==0)
			System.out.print(i+" ");
			i++;
		}
	}

}
