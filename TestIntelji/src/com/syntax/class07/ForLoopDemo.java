package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// most widely loop in Java

		/*
		 * steps; 1. initialization 2.condition 3. increment or decrement
		 */
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
		}
		System.out.println("I need to print numbers from 1 to 20");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("I need to print numbers from 10 to 25");
       for ( int i=10; i<=25; i++) {
    	   System.out.print(i+" ");
    	
       }
       System.out.println("I need to print numbers from 50 to 1");
       for ( int i=50; i>=1; i-- ) {
    	   System.out.print(i+" ");
       }
	}

}
