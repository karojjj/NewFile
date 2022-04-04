package com.replit.exercises;

public class Replit110 {
	String newLine="newLine";
	  String displayLine="displayLine";
	
  void newLine() {
  
	    System.out.println(newLine+ " method implementation");
	    
	    }
  void displayLine() {
	  System.out.println(displayLine+" method implementation");
  }
	public static void main(String[] args) {
		/*
		 * Create a method name as newLine that should have print statement inside the
		 * method body as "newLine method implementation"
		 * 
		 * Create a method name as displayLine that should have print statement inside
		 * the method body as "displayLine method implementation"
		 * 
		 * Call both methods
		 */

		 
	
		  Replit110 object=new Replit110();
		  object.newLine();
		  object.displayLine();
		}
		}