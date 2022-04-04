package com.syntax.class03;

public class MoreIfStatement {

	public static void main(String[] args) {
		/*define a variable to store a value of day
		 * if day is Saturday==> I am having Java class today
		 * otherwise==>I do not know which class I have 
		 * 
		 * if "if statement is not correct, Java will execute the "else statement"
		 */
String day="Sunday";
if  (day.equals("Saturday")){
	System.out.println("I am having Java class today ");
	System.out.println("I am very excited");
	System.out.println("I am going to have fun with my classmates");

	}else {
		System.out.println("I do not know which class I have");
		System.out.println("Maybe today is funday :)");
		
	}

}
}
