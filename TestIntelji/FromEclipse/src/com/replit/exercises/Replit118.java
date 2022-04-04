package com.replit.exercises;

public class Replit118 {
	//String name="hello";
	String spaceOut(String name) {
		return name;
	}

	public static void main(String[] args) {
		/*
		 * Write a method header on line two with the following specs:
		 * Returns: a String a String Name:
		 * spaceOut spaceOut Parameters:
		 * a String a String Then complete the method by programming the following
		 * behavior
		 * Insert spaces after every character in the String s, then return the new
		 * string. Insert spaces after every character in the String s, then return the
		 * new string. See below examples (note the space at the end as well).
		 */
        Replit118 obj=new Replit118();
        System.out.println(obj.spaceOut("hello").replaceAll("", " "));
	}

}
