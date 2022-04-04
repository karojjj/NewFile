package com.replit.exercises;

public class Replit121 {
//declare 3 instance variables to hold an integer, double and char values.
	 int a;
	  double b;
	  char c;
	  //creating a method
	void print(){
	  System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	}
	public static void main(String[] args) {
		/*
		 * declare 3 instance variables to hold an integer, double and char values.
		 * Create 2 instances of the class and assign values to variables and the print
		 * them 
		 * Expected Output:
		 * 10 10.23 a 100 100.23
		 */
      Replit121 object=new Replit121();
      
      object.a=10;
      object.b=10.23;
      object.c='a';
      object.print();
      
      Replit121 object1=new Replit121();
      object1.a=100;
      object1.b=100.23;
      object1.c='s';
      object1.print();
      
	}

}
