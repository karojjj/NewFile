package com.replit.exercises;

public class Replit68 {

	public static void main(String[] args) {
		for (int i=1; i<=4; i++){  //outer loop for rows
		    for (int j=1; j<=4; j++){ // inner loop for columns
		      if (i==1 || j==1 || i==4 ||j==4){
		        System.out.print("$");

		      }else{
		        System.out.print(" ");
		      }
		    }
		    System.out.println();
		  }
		}
		}