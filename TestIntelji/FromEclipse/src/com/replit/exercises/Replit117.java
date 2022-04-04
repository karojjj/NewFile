package com.replit.exercises;

public class Replit117 {
	int sum=0;
	  int sumEvenTox(int x){ //creating a method name=sumEvenTox and pur parameter int x
	    for (int i=0; i<=x; i+=2)  // calculate the sum of the EVEN integers from 1 to x (including x)

	    sum=sum+i;
	    return sum;
	  }
	public static void main(String[] args) {
		/*
		 * Create a method with the following specs:
		 * 
		 * Returns:
		 * 
		 * an integer an integer Name:
		 * 
		 * sumEvenToX sumEvenToX Parameters:
		 * 
		 * an integer called "x" an integer called "x" Purpose:
		 * 
		 * calculate the sum of the EVEN integers from 1 to x (including x)
		 */
   Replit117 obj=new Replit117();
 
   
   System.out.println(obj. sumEvenTox(8));


 
	}

}
