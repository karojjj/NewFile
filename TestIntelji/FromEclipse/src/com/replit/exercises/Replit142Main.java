package com.replit.exercises;

public class Replit142Main {

	public static void main(String[] args) {
		/*1. Complete the SyntaxTechnologies class:
			Include the following class variables:
			schoolName(String)
			batch(int)
			year(int)
			lastDayOfClass(String)
			Write two constructors:
			non-argument constructor
			parameterized constructor
			Create method to display values of instance variables.
			2. In Main Class:
			Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
			Expected Output:null 0 0 null
			Syntax 6 2020 07/30/2020*/
		
		//Create two different objects of the SyntaxTechnologies class using both constructors
		Replit142SyntaxTechnologies object1=new Replit142SyntaxTechnologies();
		Replit142SyntaxTechnologies object2=new Replit142SyntaxTechnologies("Syntax", 6 ,2020 ,"07/30/2020");
		object1.display();
		object2.display();
	}

}
