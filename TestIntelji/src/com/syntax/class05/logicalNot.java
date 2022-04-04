package com.syntax.class05;

public class logicalNot {

	public static void main(String[] args) {
		// logical "not" is used to revert the condition
		boolean value = !false;
		System.out.println(value);
		System.out.println("-----------------");
		boolean traffic = false;
		if (!traffic) {
			System.out.println("I will come to work on time");
		}
		String day = "Saturday";
		if (!day.equals("Saturday")) {
			System.out.println("Today is not saturday");

		}

		boolean checkboxChecked = false;

		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox ");
		}
		System.out.println("-------------");
		String java = "easy";
		if (!java.equals("hard")) {
			System.out.println("you are a genious");

		}
		System.out.println("-----THE END----");
	}
}
