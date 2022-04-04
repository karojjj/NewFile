package com.syntax.class05;

import java.util.Scanner;

public class HomeworkQ3 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no if there is no
		 * sale --> you are not going for shopping if there is sale ask you user for the
		 * price of the item
		 * 
		 * Based on the price you have to calculate the price of the item after the
		 * discount
		 * 
		 * if price is less than $20 --> apply 10% discount if price is between $20 &
		 * $100 --> 20% discount if price between $100 & $500 --> 30% discount otherwise
		 * apply 50% discount
		 * 
		 * Output of the program should be:
		 * 
		 * After discount ___ the price of the item reduce from __ to ___
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale now at Zara? ");
		
		
		String sale=input.next();
  
	  if (sale.equalsIgnoreCase("Yes")) {
		  System.out.println("What is the price for the item ?");
		   int price=input.nextInt();
		   if (price<20) {
			   System.out.println(" you have %10 off");
		   } else if (price<=20  && price<100) {
			   System.out.println("you have %20 off");
		   }else if (price<=100 && price<500) {
			   System.out.println("you have %30 off");
		   }else {
			   System.out.println("you have %50 off");
		   }
		  
	  }else {
		  System.out.println("You are not going for shopping !");
		 
	  }
	
	}

}
