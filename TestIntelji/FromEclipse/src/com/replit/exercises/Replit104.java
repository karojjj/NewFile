package com.replit.exercises;
import java.util.Scanner;
public class Replit104 {

	public static void main(String[] args) {
		/*
		 * Create an array of names that will hold 5 String elements.
		 * Names must be taking from a user.
		 * Print out the first three characters of each element of the array, one per
		 * line.
		 * Note: every array element must be at least 3 characters long.
		 */

		Scanner input=new Scanner(System.in);// getting input from user
		  
		  String []a=new String[5]; // holding 5 string elements in array
		  for(int i=0;i<a.length;i++){  
		   a[i]=input.next(); //storing input in a[i] array
		  }
		  for(int i=0;i<a.length;i++){
		    System.out.println(a[i].substring(0,3)); // using substring method to get the first three characters
		  }
		}
		}