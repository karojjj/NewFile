package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// My name is Medine and my last name is Kaya
		//I am a syntax student
		//I live in Boston and state MA
		//And my phone number is 570874911
		/*some notes: practices String -is class that can represent combination of multiple characters enclosed in
		 * when we have a string value and we want to attach any other type of value to it we use +=> plays roles as concatenation operator
		 * operators in Java it is like assignment operator. 
		 * arithmetical operators for instance: +, -,*,/,%
		 * 
		 */
		String name="Medine";
        String lastName="KAYA";
        char grade='A';
		String city="Boston";
		String state="MA";
		int cellPhone=123456;
		
		System.out.println("My name is " +name+ " and last name is " +lastName);		
		System.out.println("I am " +grade+ " student .");
        System.out.println("I live in the city of "+city+" and state of " +state);
        System.out.println("And my phone number is " +cellPhone);
         
         
	}

}
