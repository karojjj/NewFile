package com.replit.exercises;
import java.util.Scanner;
public class Replit95 {

	public static void main(String[] args) {
		/*
		 * Using Scanner class input string value.
		 * 
		 * Print out the following: "The first 3 letters of ___ is ___"
		 */
		Scanner input=new Scanner(System.in);
	    System.out.println("In:");
	    String value=input.nextLine();
	    String ban=value.substring(0,3);
	    
	    if (value.equals("banana")){
	      System.out.println("The first 3 letters of "+value+ " is "+ban);
	      
	    } else{
	      System.out.println("invalid");
	    }
            
	}

}
