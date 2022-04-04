package com.replit.exercises;

public class Replit79 {

	public static void main(String[] args) {
		//Write a program to print values from a 2D array

		double [][] val={
		         {1.4, 2.0, 3.3, 2.0 },//1st array
		         {4.0,1.5, 6.1,  1.0  },//2nd array
		         {1.2, 3.1, 4.0, 1.6  }//3rd array
		       };
         //start coding here
		       for(int i=0; i<val.length; i++){
		         for (int j=0; j<val[i].length; j++){
		           System.out.print(val[i][j]+" ");
		         }
		         System.out.println();
		       }
		 }
		}