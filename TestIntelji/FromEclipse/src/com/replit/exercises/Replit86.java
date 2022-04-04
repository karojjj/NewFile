package com.replit.exercises;

public class Replit86 {

	String name;
	int roll_no;
	void printCompleteInf() {
		System.out.println("Name is "+name+" and roll number is "+roll_no);
	}
	public static void main(String[] args) {
		/*
		 * Create a class 'Replit86' 
		 * Inside class declare a String variable 'name' and integer variable 'roll_no'.
		 * Create an object of the class and assign the value of 2 to roll_no and value
		 * of "John" to name
		 * Your program should print the following:
		 * Name is John and roll number is 2
		 */
    Replit86 object=new Replit86();  //creating an object of the class
    object.name="John"; //assigning the value of string
    object.roll_no=2; //assigning the value of int
    object.printCompleteInf();
	}

}
