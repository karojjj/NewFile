package com.replit.exercises;

public class Replit84 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Write a program that prints the total number of elements that are negative
		 * AND odd
		 * 
		 * Output:
		 * 
		 * 3
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

	    //write your code below:
	  int sum=0;

		for (int i=0; i<a.length; i++){
	    for (int j=0; j<a[i].length;j++){
	     
	      if (a[i][j]%2!=0 && a[i][j]<0){  //tek olan ve negatif olan
	     
	        sum++;
	      }
	      }
	  }System.out.println(sum);
	  }
	  }