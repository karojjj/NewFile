package com.replit.exercises;

public class Replit119 {
	String censorLetter (String a, char b) {	
		return a=a.replace (b, '*');
			
		} 
 
	public static void main(String[] args) {
		/*
		 * Write a method header with the following specs:
		 * Returns:a String a 
		 * String Name:censorLetter 
		 *  Parameters:a String , a char 
		 *  Then complete the method by programming the following behavior
		 * 
		 * Replace all instances of given character with a "*" within the given String.
		 * See below examples. Replace all instances of given character with a "*"
		 * within the given String. See below examples. Examples:
		 * 
		 * censorLetter("computer science",'e') ==> "comput*r sci*nc*"
		 * censorLetter("trick or treat",'t') ==> "*rick or *rea*"
		 */
		Replit119 obj=new Replit119();
		System.out.println(obj.censorLetter("computer science", 'e'));
		System.out.println(obj.censorLetter("trick or treat", 't'));	
		}
	

}
